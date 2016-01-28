package ca.gc.asc_csa.apogy.common.widgets.ui;

import java.net.URL;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;

public class ArrowButtonComposite extends Composite  {
	
	public static enum ArrowDirection { LEFT, RIGHT }; //Direction of the button
	
	private static final int ANGLE_TO_GET_INVERSE = 180; //Angle in degree
	private static final int NB_MILLIS_AUTO_REPEAT_DOWN_ACTION = 20; //Time in millis before the next repeat occur.
	private static final int NB_MILLIS_BEFORE_AUTO_REPEAT = 400; //Time in millis before activate auto repeat effect.
	
	
	private static final String IMAGES_FOLDER = "platform:/plugin/ca.gc.asc_csa.apogy.common.widgets.ui/images/"; //Image path
	
	private Image arrowImage; //Image of arrow.
	private Image arrowImagePressed; //Image of pressed arrow.
	
	//Variables for the auto repeat function of the button.
	private MouseListener mouseListener; 
	private Thread repeatEventThread;
	private boolean repeatThreadCanRun;
	private boolean autoRepeatDownAction;

	private ArrowDirection arrowDirection; //Direction of the arrow.
	private boolean isPressed; //True if button is actually pressed.
	
	/**
	 * Constructor parameter information:
	 * 
	 * @param arrowDirection       Choose direction of the button.
	 * @param autoRepeatDownAction To true, it will call mouse down event in loop to all mouse listener until mouse up is called.
	 *                             If its false, you will receive only one event for the mouse down on the button.
	 */
	public ArrowButtonComposite(Composite parent, int style, ArrowDirection arrowDirection, boolean autoRepeatDownAction) {
		super(parent, style | SWT.DOUBLE_BUFFERED);
		
		//Initialize values
		repeatThreadCanRun = false;
		this.arrowDirection = arrowDirection;
		isPressed = false;
		repeatEventThread = null;
		this.autoRepeatDownAction = autoRepeatDownAction;
		
		//Initialize images
		initImages();

		//Create listeners
		createPaintListener();
		createDisposeListener();
		createMouseListener();
	}
	
	@Override
	public void notifyListeners(int eventType, Event event) {
		if(isEnabled())
				super.notifyListeners(eventType, event);
	}
	
	/**
	 * Initialize images.
	 */
	private void initImages() {
		try {
			Device device = Display.getCurrent(); 
			URL url = new URL(IMAGES_FOLDER + "arrowButton.png");
			arrowImage = new Image(device,url.openStream());
			url = new URL(IMAGES_FOLDER + "arrowButtonPressed.png");
			arrowImagePressed = new Image(device,url.openStream());
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	/**
	 * This method draw the button.
	 */
	private void paintMeter(GC gc) {
		
		//If the arrow direction is right, the canvas is rotated to draw inverse images.
		verifyOrientationOfCanvas(gc);
			
		//Draw image.
		if(isPressed) {
			if(arrowImagePressed != null) 
				drawPressedArrow(gc);
		} else {
			if(arrowImage != null) 
				drawArrow(gc);
			else //Draw a black rectangle (This code is only useful in windows builder to see the widget without loading images).
				drawBlackRectangle(gc);
		}
	}
	
	private void verifyOrientationOfCanvas(GC gc) {
		Transform t = new Transform(gc.getDevice());
		t.rotate(ANGLE_TO_GET_INVERSE);
		if(arrowDirection == ArrowDirection.RIGHT) 
			gc.setTransform(t);
		t.dispose();
	}
	
	private void drawPressedArrow(GC gc) {
		if(arrowDirection == ArrowDirection.RIGHT) {
			gc.drawImage(arrowImagePressed, 0, 0, arrowImagePressed.getBounds().width, arrowImagePressed.getBounds().height, -getBounds().width, -getBounds().height, getBounds().width, getBounds().height);
		} else {
			gc.drawImage(arrowImagePressed, 0, 0, arrowImagePressed.getBounds().width, arrowImagePressed.getBounds().height, 0, 0, getBounds().width, getBounds().height);
		}
	}
	
	private void drawArrow(GC gc) {
		if(arrowDirection == ArrowDirection.RIGHT) {
			gc.drawImage(arrowImage, 0, 0, arrowImage.getBounds().width, arrowImage.getBounds().height, -getBounds().width, -getBounds().height, getBounds().width, getBounds().height);
		} else {
			gc.drawImage(arrowImage, 0, 0, arrowImage.getBounds().width, arrowImage.getBounds().height, 0, 0, getBounds().width, getBounds().height);
		}
	}
	
	private void drawBlackRectangle(GC gc) {
		if(arrowDirection == ArrowDirection.RIGHT) {
			Color color = new Color(getDisplay(),0,0,0);
			gc.setForeground(color);
			gc.setLineWidth(4);
			gc.drawRectangle(- (getBounds().width - 2), - (getBounds().height - 2), getBounds().width - 4, getBounds().height - 4);
			color.dispose();
		} else {
			Color color = new Color(getDisplay(),0,0,0);
			gc.setForeground(color);
			gc.setLineWidth(4);
			gc.drawRectangle(2, 2, getBounds().width - 4, getBounds().height - 4);
			color.dispose();
		}
	}
	
	private void createPaintListener() {
		//paintMeter() method is called when the paint listener get a event.
		addPaintListener(new PaintListener(){
            @Override
            public void paintControl(PaintEvent e) {
            	paintMeter(e.gc);
            }
        });
	}
	
	private void createDisposeListener() {
		//Dispose all images when widget is disposed.
		this.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				if(arrowImage != null)
					arrowImage.dispose();
				if(arrowImagePressed != null)
					arrowImagePressed.dispose();

			}
		});
	}
	
	/**
	 * This listener react to auto repeat system. When autoRepeatDownAction is true and the user dont up is mouse button, all other mouse listener
	 * called in loop. 
	 */
	private void createMouseListener() {
		mouseListener = new MouseListener() {
			@Override
			public void mouseDown(MouseEvent e) {
				if(autoRepeatDownAction) {
					if(repeatEventThread == null) {
						isPressed = true;
						redraw();
						repeatThreadCanRun = true;
						repeatEventThread = new Thread() {
							@Override
							public void run() {
								for(int i = 0; i < NB_MILLIS_BEFORE_AUTO_REPEAT; i++) {
									try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
									if(!repeatThreadCanRun || isDisposed())
										return;
								}
								while(repeatThreadCanRun && !isDisposed()) {
									Display.getDefault().asyncExec(new Runnable() {
										@Override
										public void run() {
											if(repeatThreadCanRun && !isDisposed())
												notifyListeners(SWT.MouseDown, null);
										}
									});
									for(int i = 0; i < NB_MILLIS_AUTO_REPEAT_DOWN_ACTION; i++) {
										try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
										if(!repeatThreadCanRun || isDisposed())
											return;
									}
								}
							}
						};
						repeatEventThread.start();
					}
				} else {
					isPressed = true;
					redraw();
				}
			}
			@Override
			public void mouseUp(MouseEvent e) {
				isPressed = false;
				redraw();
				repeatThreadCanRun = false;
				if(repeatEventThread != null) {
					repeatEventThread = null;
				}
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) { }
		};
		addMouseListener(mouseListener);
	}
}