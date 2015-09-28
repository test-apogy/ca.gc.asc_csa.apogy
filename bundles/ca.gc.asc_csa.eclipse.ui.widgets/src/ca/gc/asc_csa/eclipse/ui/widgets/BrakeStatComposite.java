package ca.gc.asc_csa.eclipse.ui.widgets;

import java.net.URL;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class BrakeStatComposite extends Composite  {
	
	private static final String IMAGES_FOLDER = "platform:/plugin/ca.gc.asc_csa.eclipse.ui.widgets/images/"; //Image path
	
	//Images
	private Image backgroundDisengaged;
	private Image backgroundEngaged;
	
	//Values
	private boolean isEngaged;
	
	/**
	 * Constructor parameter information:
	 * 
	 * @param isEngaged True to get a widget where the engaged state is active.
	 */
	public BrakeStatComposite(Composite parent, int style,boolean isEngaged) {
		super(parent, style | SWT.DOUBLE_BUFFERED);

		this.isEngaged = isEngaged;
		
		initImages();
		
		createPaintListener();
		createDisposeListener();
	}

	public synchronized boolean getActualValue() { return isEngaged; }
	
	public void setActualValue(boolean isEngaged) {
		this.isEngaged = isEngaged;
		redraw();
	}
	
	private void initImages() {
		try {
			Device device = Display.getCurrent(); 
			URL url = new URL(IMAGES_FOLDER + "brakeDisengaged.png");
			backgroundDisengaged = new Image(device,url.openStream());
			url = new URL(IMAGES_FOLDER + "brakeEngaged.png");
			backgroundEngaged = new Image(device,url.openStream());
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	private void paintMeter(GC gc) {	
		if(isEngaged) {
			if(backgroundEngaged != null)
				gc.drawImage(backgroundEngaged, 0, 0, backgroundEngaged.getBounds().width, backgroundEngaged.getBounds().height, 0, 0, getBounds().width, getBounds().height);
			else
				drawBlackRectangle(gc);
		} else {
			if(backgroundDisengaged != null) 
				gc.drawImage(backgroundDisengaged, 0, 0, backgroundDisengaged.getBounds().width, backgroundDisengaged.getBounds().height, 0, 0, getBounds().width, getBounds().height);
			else
				drawBlackRectangle(gc);
		}
	}
	
	/**
	 * Draw a black rectangle. This method is called when your in the window builder and cannot load image from a runtime plugin. 
	 * Its useful to see the widget in windows builder.
	 */
	private void drawBlackRectangle(GC gc) {
		Color color = new Color(getDisplay(),0,0,0);
		gc.setForeground(color);
		gc.setLineWidth(4);
		gc.drawRectangle(2, 2, getBounds().width - 4, getBounds().height - 4);
		color.dispose();
	}
	
	private void createPaintListener() {
		addPaintListener(new PaintListener(){
            @Override
            public void paintControl(PaintEvent e) {
            	paintMeter(e.gc);
            }
        });
	}
	
	private void createDisposeListener() {
		addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				if(backgroundDisengaged != null)
					backgroundDisengaged.dispose();
				if(backgroundEngaged != null)
					backgroundEngaged.dispose();
			}
		});
	}
}
