package ca.gc.asc_csa.eclipse.ui.widgets;

/**
 * This composite need to have square dimension. For exemple, if you have a width of 300px, the height should be 300px.
 **/

import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
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
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class MeterComposite extends Composite {
	private static final String IMAGES_FOLDER = "platform:/plugin/ca.gc.asc_csa.eclipse.ui.widgets/images/"; //Images path.
	private static final String FONTS_FOLDER = "platform:/plugin/ca.gc.asc_csa.eclipse.ui.widgets/fonts/"; //Fonts path.
	
	private static final int RADIAL_RADIUS = 130; //Adjusted value for a meter of 300x300 px.
	private static final float MAX_ANGLE = 260f; //This is the maximum angle where the needle can go.
	private static final float START_DRAWING_ANGLE = 144f; //This is the starting angle from the right horizontal zero (transform).
	
	//Images
	private Image backgroundMeter;
	
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
	private Color numberColor;
	private Color lineColor;
	private Color digitalNumberColor;
	private Color titleColor;
	private DecimalFormat digitalNumberFormat;
	
	/**
	 * Constructor parameters information:
	 * 
	 * @param min			This is the minimum value of the meter.
	 * @param max			This is the maximum value of the meter.
	 * @param intervalValue	This is the interval value between two reference number on the radial.
	 * @param initialValue	This is the initial value and this value shall be in the interval of [min,max].
	 * @param unit			This is the used unit on the meter. For example, km/h, rpm, etc..
	 * @param title			This is a descriptive title for the meter.
	 */
	public MeterComposite(Composite parent, int style,double min, double max,double intervalValue, double initialValue, String unit,String title) {
		super(parent, style | SWT.DOUBLE_BUFFERED);
		
		//Initialize values.
		ranges = new ArrayList<Range>();
		minValue = min;
		maxValue = max;
		this.intervalValue = intervalValue;
		this.unit = unit;
		this.title = title;
		setActualValue(initialValue);
		
		initFormats();
		initColors();
		initFont();
		initImages();
		
		createDisposeListener();
		createPaintListener();
	}
	
	public void setDialNumberFormat(DecimalFormat df) { 
		if(df != null)
			numberFormat = df; 
	}
	public void setDigitalNumberFormat(DecimalFormat df) {
		if(df != null)
			digitalNumberFormat = df;
	}
	public void setDialNumberColor(Color c) { numberColor = c; }
	public void setLineColor(Color c) { lineColor = c; }
	public void setDigitalNumberColor(Color c) { digitalNumberColor = c; }
	public void setTitle(String t) { title = t; } 
	public void setTitleColor(Color c) { titleColor = c; }
	public void setActualValue(double actualValue) {
		if(actualValue < minValue)
			actualValue = minValue;
		else if(actualValue > maxValue)
			actualValue = maxValue;
		
		this.actualValue = actualValue;
		redraw();
	}
	public synchronized double getActualValue() { return actualValue; }
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
	
	private void initImages() {
		try {
			Device device = Display.getCurrent(); 
			URL url = new URL(IMAGES_FOLDER + "cadran.png");
			backgroundMeter = new Image(device,url.openStream());
		} catch (Exception e) { e.printStackTrace(); }
	}

	private void paintMeter(GC gc) {
			int centerXMeter = getBounds().width / 2;
			int centerYMeter = getBounds().height / 2;
			
			float XScaleFactor = 0f;
			float YScaleFactor = 0f;
			
			if(backgroundMeter != null) { //Draw background
				XScaleFactor = (((float) getBounds().width) / ((float) backgroundMeter.getBounds().width));
				YScaleFactor = (((float) getBounds().height) / ((float) backgroundMeter.getBounds().height));
				gc.drawImage(backgroundMeter, 0, 0, backgroundMeter.getBounds().width, backgroundMeter.getBounds().height, 0, 0, getBounds().width, getBounds().height);
			} else { //goal of this else is to display the composite in the design mode with windows builder
				gc.setForeground(new Color(getDisplay(),0,0,0));
				gc.setLineWidth(4);
				gc.drawRectangle(2, 2, getBounds().width - 4, getBounds().height - 4);
			}
			//Draw ranges
			gc.setLineWidth(Math.round(8 * XScaleFactor));
			for(Range r : ranges) {
				gc.setForeground(r.getColor());
				int xPos = Math.round((centerXMeter - (RADIAL_RADIUS * XScaleFactor) + 2));
				int yPos = Math.round(centerYMeter - (RADIAL_RADIUS * YScaleFactor) + 5);
				int width = Math.round((RADIAL_RADIUS * XScaleFactor * 2) - 5);
				int height = Math.round((RADIAL_RADIUS * YScaleFactor * 2) -10);
				int startAngle = (int) (-1 * (((r.getMinimum() / (maxValue - minValue)) * MAX_ANGLE) + START_DRAWING_ANGLE));
				int extendAngle = (int) (-1 * (((r.getMaximum() - r.getMinimum()) / (maxValue - minValue)) * MAX_ANGLE));
				gc.drawArc(xPos,yPos,width,height,startAngle, extendAngle);	
			}

			//Draw numbers and lines around the needle
			Image image = new Image(getDisplay(), getBounds());
			ImageData imageData = image.getImageData();
			image.dispose();
			RGB white = new RGB(0, 0, 0);
		    for(int i=0; i<imageData.width; i++) {
		      for(int j=0; j<imageData.height; j++) {
		        imageData.setPixel(i, j, imageData.palette.getPixel(white));
		      }
		    }
		    imageData.transparentPixel = imageData.palette.getPixel(new RGB(0, 0, 0));
		    Image image2 = new Image(getDisplay(),imageData);
			GC numbersGraphic = new GC(image2);
			numbersGraphic.setBackground(new Color(Display.getCurrent(),0,0,0));
			numbersGraphic.setLineWidth(3);
			int size = Math.round(8f * XScaleFactor);
			Font font = new Font(getDisplay(), "Tahoma", size, SWT.BOLD);
			numbersGraphic.setFont(font);
			
			double nbDraw = (maxValue - minValue) / intervalValue;
			double degreeRotationForNumber = MAX_ANGLE / nbDraw;
			float actualDegree = 0;
			double actualPaintNumber = minValue;
			while((actualDegree / degreeRotationForNumber) <= nbDraw) {
				Transform transform = new Transform(numbersGraphic.getDevice());
				transform.translate(centerXMeter, centerYMeter);
				transform.rotate(actualDegree);
				transform.rotate(START_DRAWING_ANGLE);
				numbersGraphic.setTransform(transform);
				int leftLineX = Math.round(centerXMeter - (38f * XScaleFactor));
				int rightLineX = Math.round(centerXMeter - (22f * XScaleFactor));
				numbersGraphic.setForeground(lineColor);
				numbersGraphic.drawLine(leftLineX, 0, rightLineX, 0);
				transform.dispose();
				
				
				transform = new Transform(numbersGraphic.getDevice());
				transform.translate(centerXMeter, centerYMeter);
				numbersGraphic.setTransform(transform);
				
				int maxNumberWidth = Math.max((numberFormat.format(minValue)).length(),(numberFormat.format(maxValue)).length());
				int widthOfNumber = (numbersGraphic.getFontMetrics().getAverageCharWidth() * (maxNumberWidth));
				
				int heightOfNumber = numbersGraphic.getFontMetrics().getHeight() / 2;
				
				int xNumber = (int) Math.round(Math.cos(Math.toRadians(START_DRAWING_ANGLE + actualDegree)) * ((RADIAL_RADIUS * XScaleFactor) - (rightLineX - leftLineX) - widthOfNumber));
				int yNumber = (int) Math.round(Math.sin(Math.toRadians(START_DRAWING_ANGLE + actualDegree)) * ((RADIAL_RADIUS * YScaleFactor) -  (rightLineX - leftLineX) - heightOfNumber));
				numbersGraphic.setForeground(numberColor);
				numbersGraphic.drawText(numberFormat.format(actualPaintNumber),xNumber - Math.round((12.8f * XScaleFactor)),yNumber,true);
				transform.dispose();
				
				actualDegree += degreeRotationForNumber;
				actualPaintNumber += intervalValue;
			}
			gc.drawImage(image2, 0, 0);
			image2.dispose();
			font.dispose();
			numbersGraphic.dispose();
			
			//Draw digital number with unit
			size = Math.round(12f * XScaleFactor);
			gc.setForeground(digitalNumberColor);
			font = new Font(getDisplay(), "Crystal", size, SWT.BOLD);
			gc.setFont(font);
			
			String numText = digitalNumberFormat.format(actualValue) + " " + unit;
			int widthNumber = 0;
			for(int i = 0; i < numText.length(); i++) widthNumber += gc.getAdvanceWidth(numText.charAt(i));
			
			
			gc.drawString(digitalNumberFormat.format(actualValue) + " " + unit, centerXMeter - (widthNumber / 2), Math.round(getBounds().height * 0.817f), true);
			font.dispose();
			
			//Draw title
			size = Math.round(14 * XScaleFactor);
			gc.setForeground(titleColor);
			font = new Font(getDisplay(), "sansserif", size, SWT.BOLD);
			gc.setFont(font);

			int widthTitle = 0;
			for(int i = 0; i < title.length(); i++) {
				widthTitle += gc.getAdvanceWidth(title.charAt(i));
			}
			gc.drawString(title, centerXMeter - (widthTitle / 2), Math.round(getBounds().height * 0.35f), true);
			font.dispose();
			
			//Draw the Needle.
			gc.setBackground(titleColor);
			float angle = (float) Math.toRadians((float) ((actualValue / (maxValue - minValue)) * MAX_ANGLE - 36f));
			int needleLength = (int) (centerXMeter * 0.64f);
			int x = (int) (centerXMeter - (Math.cos(angle) * needleLength));
			int y = (int) (centerYMeter - (Math.sin(angle) * needleLength));			
			gc.drawLine(centerXMeter, centerYMeter, x, y);
			gc.fillOval(centerXMeter - 10, centerYMeter - 10, 20 , 20);
			gc.setBackground(numberColor);
			gc.fillOval(centerXMeter - 5, centerYMeter - 5, 10 , 10);
			
	}
	
	private void initFormats() {
		numberFormat = new DecimalFormat("#.##");
		digitalNumberFormat = new DecimalFormat("#.#");
	}
	
	private void initColors() {
		numberColor = new Color(Display.getCurrent(),41,225,46);
		lineColor = new Color(Display.getCurrent(),51,118,0);
		titleColor = new Color(Display.getCurrent(),51,118,0);
		digitalNumberColor = new Color(Display.getCurrent(),41,225,46);
	}
	
	private void initFont() {
		try {
			URL url = FileLocator.resolve(new URL(FONTS_FOLDER + "Crysta.ttf"));
			File file = new File(url.toURI());
			getDisplay().loadFont(file.getAbsoluteFile().toString());
		} catch (Exception e) { e.printStackTrace(); } 
	}
	
	private void createDisposeListener() {
		addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				if(backgroundMeter != null)
					backgroundMeter.dispose();
			}
		});
	}
	
	private void createPaintListener() {
		addPaintListener(new PaintListener(){
            @Override
            public void paintControl(PaintEvent e) {
            	paintMeter(e.gc);
            }
        });
	}
}

