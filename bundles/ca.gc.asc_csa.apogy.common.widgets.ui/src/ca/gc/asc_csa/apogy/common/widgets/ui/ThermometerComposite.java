package ca.gc.asc_csa.apogy.common.widgets.ui;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

//NB: The width and height should be a factor of 1/2 to be pretty. For exemple: 100 of width for 200 of height

public class ThermometerComposite extends Composite  {
	
	private static final String IMAGES_FOLDER = "platform:/plugin/ca.gc.asc_csa.apogy.common.widgets.ui/images/"; //Images path.
	
	//Images
	private Image backgroundMeter;
	private Image needle;
	
	//Values
	private double minValue;
	private double maxValue;
	private double intervalValue;
	private double actualValue;
	private String unit;
	private String title;
	private ArrayList<Range> ranges;
	
	//Style
	private DecimalFormat numberFormat;
	private DecimalFormat actualValueFormat;
	private Color unitColor;
	private Color titleColor;
	private Color numbersColor;
	private Color actualValueColor;
	
	/**
	 * Constructor parameters information:
	 * 
	 * @param min			The minimum value of the thermometer.
	 * @param max			The maximum value of the thermometer.
	 * @param intervalValue	The interval value between two reference number on the thermometer.
	 * @param initialValue	The initial value of the needle.
	 * @param unit			The used unit on this thermometer.
	 * @param title			A title representing the subject of this thermometer.
	 */
	public ThermometerComposite(Composite parent, int style,double min, double max,double intervalValue, double initialValue, String unit,String title) {
		super(parent, style | SWT.DOUBLE_BUFFERED);
		
		//Initialize values.
		ranges = new ArrayList<Range>();
		minValue = min;
		maxValue = max;
		actualValue = initialValue;
		this.intervalValue = intervalValue;
		this.unit = unit;
		this.title = title;
		
		initColors();
		initFormats();
		initImages();
		
		createPaintListener();
		createDisposeListener();
	}
	
	public void addRange(double min, double max, Color c) {
		Range newRange = new Range(min,max,c);
		ranges.add(newRange);
		Collections.sort(ranges);
		this.redraw();
	}
	public void clearRanges() { 
		ranges.clear(); 
		this.redraw();
	}
	public synchronized double getActualValue() { return actualValue; }
	public void setActualValue(double actualValue) {
		this.actualValue = actualValue;
		this.redraw();
	}
	public void setActualValueFormat(DecimalFormat avf) { actualValueFormat = avf; }
	public void setNumberFormat(DecimalFormat nf) { numberFormat = nf; }
	
	private void initImages() {
		try {
			Device device = Display.getCurrent(); 
			URL url = new URL(IMAGES_FOLDER + "tempFrame.png");
			backgroundMeter = new Image(device,url.openStream());
			url = new URL(IMAGES_FOLDER + "aiguille2.png");
			needle = new Image(device,url.openStream());
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	private void paintMeter(GC gc) {
		float XScaleFactor = 0f;
		float YScaleFactor = 0f;
				
		if(backgroundMeter != null) {
			XScaleFactor = (((float) getBounds().width) / ((float) backgroundMeter.getBounds().width));
			YScaleFactor = (((float) getBounds().height) / ((float) backgroundMeter.getBounds().height));
		}

		int centerXMeter = getBounds().width / 2;
		int centerYMeter = getBounds().height / 2;

		int xRect = centerXMeter - Math.round((10 * XScaleFactor));
		int yRect = Math.round(25 * YScaleFactor);
		int widthRect = Math.round((20 * XScaleFactor));
		int heightRect = (2 * centerYMeter) - Math.round((50 * YScaleFactor));

		
		if(backgroundMeter != null) //Draw background
			gc.drawImage(backgroundMeter, 0, 0, backgroundMeter.getBounds().width, backgroundMeter.getBounds().height, 0, 0, getBounds().width, getBounds().height);
		else { //goal of this else is to display the composite in the design mode with windows builder
			Color color = new Color(getDisplay(),0,0,0);
			gc.setForeground(color);
			gc.setLineWidth(4);
			gc.drawRectangle(2, 2, getBounds().width - 4, getBounds().height - 4);
			color.dispose();
		}
		
		//Draw ranges
		for(Range r : ranges) {
			gc.setBackground(r.getColor());
			int minRangeValue = (int) (yRect + (((maxValue - r.getMinimum()) / (maxValue - minValue)) * heightRect));
			int maxRangeValue = (int) (yRect + (((maxValue - r.getMaximum()) / (maxValue - minValue)) * heightRect));
			gc.fillRectangle(centerXMeter - Math.round(10 * XScaleFactor), minRangeValue, Math.round(20 * XScaleFactor), maxRangeValue - minRangeValue);
		}

		//Draw thermometer (rectangle)
		Color color = new Color(getDisplay(),51,118,0);
		gc.setForeground(color);
		gc.setLineWidth(3);
		gc.drawRectangle(xRect,yRect,widthRect,heightRect);
		color.dispose();

		//Draw lines and numbers
		int nbDraw = (int) Math.round((maxValue - minValue) / intervalValue);
		double drawingNumber = minValue;
		int size = Math.round(6f * XScaleFactor);
		Font font = new Font(getDisplay(), "Tahoma", size, SWT.BOLD);
		gc.setFont(font);
		for(int i = nbDraw; i >= 0; i--) {
			color = new Color(getDisplay(),51,118,0);
			gc.setForeground(color);
			int x1Line = xRect;
			int y1Line = Math.round(yRect + ((((float)i) / ((float)nbDraw)) * ((float)heightRect)));
			int x2Line = xRect - 5;
			int y2Line = y1Line;
			gc.drawLine(x1Line,y1Line, x2Line, y2Line);
			color.dispose();
			gc.setForeground(numbersColor);
			int widthOfNumber = (gc.getFontMetrics().getAverageCharWidth() * (numberFormat.format(drawingNumber) + "  ").length());
			int heightOfNumber = gc.getFontMetrics().getHeight() / 2;
			gc.drawString(numberFormat.format(drawingNumber) +"  ", x2Line - widthOfNumber, y1Line - heightOfNumber, true);
			drawingNumber += intervalValue;
		}
		font.dispose();
		
		//Draw title
		float textSize = 5.6f;
		size = Math.round(textSize * XScaleFactor);
		font = new Font(getDisplay(), "Tahoma", size, SWT.BOLD);
		gc.setFont(font);
		gc.setForeground(titleColor);
		int widthOfNumber = 0;
		for(int i = 0; i < title.length(); i++) {
			widthOfNumber += gc.getAdvanceWidth(title.charAt(i));
		}
		gc.drawString(title, centerXMeter - (widthOfNumber / 2), yRect + heightRect + Math.round(textSize * YScaleFactor), true);

		//Draw unit
		widthOfNumber = 0;
		for(int i = 0; i < unit.length(); i++) widthOfNumber += gc.getAdvanceWidth(unit.charAt(i));
		int heightOfNumber = gc.getFontMetrics().getHeight();
		gc.setForeground(unitColor);
		gc.drawString(unit, centerXMeter - (widthOfNumber / 2), yRect - (heightOfNumber + 5), true);
		font.dispose();

		//Draw needle
		int yPosNeedle = 0;
		if(needle != null) {
			yPosNeedle = (int) ((yRect - Math.round((needle.getBounds().height / 2) * YScaleFactor)) + (((maxValue - actualValue) / (maxValue - minValue)) * heightRect));
			gc.drawImage(needle, 0, 0, needle.getBounds().width, needle.getBounds().height, centerXMeter, yPosNeedle, Math.round(needle.getBounds().width * XScaleFactor), Math.round(needle.getBounds().height * YScaleFactor));
		}
		//Draw number on needle
		gc.setForeground(actualValueColor);
		size = Math.round(6f * XScaleFactor);
		font = new Font(getDisplay(), "Tahoma", size, SWT.BOLD);
		gc.setFont(font);
		heightOfNumber = gc.getFontMetrics().getHeight();
		widthOfNumber = (gc.getFontMetrics().getAverageCharWidth() * (actualValueFormat.format(actualValue)).length());
		int xPosNumber = 0;
		int yPosNumber = 0;
		if(needle != null) {
			xPosNumber = centerXMeter + (Math.round((needle.getBounds().width / 2) * XScaleFactor) - (widthOfNumber / 2)) + Math.round(9 * XScaleFactor);
			yPosNumber = yPosNeedle + (Math.round(needle.getBounds().height * YScaleFactor) / 2) - (heightOfNumber / 2);
		}

		gc.drawString(actualValueFormat.format(actualValue), xPosNumber, yPosNumber,true);
		font.dispose();
	}
	
	private void initColors() {
		numbersColor = new Color(Display.getCurrent(),41,225,46);
		titleColor = new Color(getDisplay(),51,118,0);
		unitColor = new Color(getDisplay(),51,118,0);
		actualValueColor = new Color(Display.getCurrent(),41,225,46);
	}
	
	private void initFormats() {
		numberFormat = new DecimalFormat("##");
		actualValueFormat = new DecimalFormat("##");
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
				if(backgroundMeter != null)
					backgroundMeter.dispose();
				if(needle != null)
					needle.dispose();
			}
		});
	}
}
