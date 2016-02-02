package ca.gc.asc_csa.apogy.common.widgets.ui;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.net.URL;
import java.text.DecimalFormat;

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

public class BatteryStatComposite extends Composite  {
	 
	private static final int ALPHA_VALUE = 100; // Transparency value range: (0-255)
	private static final int LINE_WIDTH = 4; // Line width
	private static final int LOWER_BOUND_VALUE = 33;
	private static final int UPPER_BOUND_VALUE = 66;
	private static final int MIN_VALUE = 0;
	private static final double MAX_VALUE = 100; //Maximum possible value for this widget
	private static final float POLE_HEIGHT_FRACTION = 0.392857f; //Fraction of the pole height of the battery
	private static final float BATTERY_BEFORE_POLE_FRACTION = 0.789473f; //Fraction of the full battery before getting the pole.
	
	private static final String IMAGES_FOLDER = "platform:/plugin/ca.gc.asc_csa.apogy.common.widgets.ui/images/"; //Images path
	private Image background; //Background image.
	private double actualValue; //This is the actual value in percent. Minimum is 0 and maximum is 100.
	private Color red;
	private Color green;
	private Color yellow;
	
	/**
	 * Constructor parameter information:
	 * 
	 * @param initialValue This is the initial value of the battery. 
	 *                     Its a percent and should be more of equal than 0 but less or equal than 100.
	 */
	public BatteryStatComposite(Composite parent, int style,double initialValue) {
		super(parent, style | SWT.DOUBLE_BUFFERED);
		
		setActualValue(initialValue);
		
		//Initialize colors.
		initColors();
		
		//Initialize images.
		initImages();
		
		//Create listeners
		createPaintListener();
		createDisposeListener();
	}

	//Return actual value.
	public synchronized double getActualValue() { return actualValue; }
	
	//Set actual value.
	public void setActualValue(double actualValue) {
		//Validate new value.
		if(actualValue < MIN_VALUE)
			actualValue = MIN_VALUE;
		else if(actualValue > MAX_VALUE)
			actualValue = MAX_VALUE;
		this.actualValue = actualValue;
		redraw();
	}
	
	/**
	 * Initialize colors.
	 */
	private void initColors() {
		green = new Color(Display.getCurrent(),0,255,0);
		yellow = new Color(Display.getCurrent(),255,255,0);
		red = new Color(Display.getCurrent(),255,0,0);
	}
	
	/**
	 * Initialize images.
	 */
	private void initImages() {
		try {
			Device device = Display.getCurrent(); 
			URL url = new URL(IMAGES_FOLDER + "battery.png");
			background = new Image(device,url.openStream());
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	/**
	 * This method paint the battery.
	 */
	private void paintMeter(GC gc) {
		if(background != null) //Draw background
			gc.drawImage(background, 0, 0, background.getBounds().width, background.getBounds().height, 0, 0, getBounds().width, getBounds().height);
		else //Draw a black rectangle (This code is only useful in windows builder to see the widget without loading images).
			drawBlackRectangle(gc);

		drawChargeOnBattery(gc);

		drawNumberOnBattery(gc);
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
				if(background != null)
					background.dispose();
				green.dispose();
				yellow.dispose();
				red.dispose();
			}
		});
	}
	
	private void drawBlackRectangle(GC gc) {
		Color color = new Color(getDisplay(),0,0,0);
		gc.setForeground(color);
		gc.setLineWidth(LINE_WIDTH);
		gc.drawRectangle(2, 2, getBounds().width - 4, getBounds().height - 4);
		color.dispose();
	}
	
	private void drawChargeOnBattery(GC gc) {
		double chargeWidth = getBounds().width - 2;
		int actualCharge = (int) Math.round(chargeWidth * (actualValue / MAX_VALUE));

		gc.setAlpha(ALPHA_VALUE);

		if(actualValue >= UPPER_BOUND_VALUE)
			gc.setBackground(green);
		else if(actualValue >= LOWER_BOUND_VALUE && actualValue < UPPER_BOUND_VALUE)
			gc.setBackground(yellow); 
		else
			gc.setBackground(red); 

		if(actualCharge > Math.round((chargeWidth * BATTERY_BEFORE_POLE_FRACTION))) {
			gc.fillRectangle(1, 1,(int) Math.round(chargeWidth * BATTERY_BEFORE_POLE_FRACTION), getBounds().height - 2);
			int xStartDraw = (int) Math.round(chargeWidth * BATTERY_BEFORE_POLE_FRACTION) + 1;
			int yStarDraw = (int) (getBounds().height * (1f/3f));
			int chargeWidthToDraw = actualCharge - xStartDraw + 1;
			int chargeHeightToDraw = Math.round((getBounds().height - 2) * POLE_HEIGHT_FRACTION);
			gc.fillRectangle(xStartDraw, yStarDraw,chargeWidthToDraw, chargeHeightToDraw);
		} else {
			gc.fillRectangle(1, 1, actualCharge, getBounds().height - 2);
		}
	}
	
	private void drawNumberOnBattery(GC gc) { 
		//Initialize center.
		int centerXMeter = getBounds().width / 2;
		int centerYMeter = getBounds().height / 2;
		
		float XScaleFactor = 0f;
		float YScaleFactor = 0f;
		
		//Initialize scale factor.
		if(background != null) {
			XScaleFactor = (((float) getBounds().width) / ((float) background.getBounds().width));
			YScaleFactor = (((float) getBounds().height) / ((float) background.getBounds().height));
		}
		
		//draw number on battery
		DecimalFormat df = new DecimalFormat("0");
		int size = 0;
		if(XScaleFactor > YScaleFactor)
			size = Math.round(5.5f * YScaleFactor);
		else
			size = Math.round(5.5f * XScaleFactor);

		Font font = new Font(getDisplay(), "Tahoma", size, SWT.BOLD);
		gc.setFont(font);
		gc.setAlpha(255);
		String numberPercent = df.format(actualValue) + "%";
		int widthOfNumber = 0;
		for(int i = 0; i < numberPercent.length(); i++) {
			widthOfNumber += gc.getAdvanceWidth(numberPercent.charAt(i));
		}
		int heightOfNumber = gc.getFontMetrics().getHeight();

		Color c = new Color(Display.getCurrent(),0,0,0);
		gc.setForeground(c);
		gc.drawString(numberPercent, centerXMeter - (Math.round(((float)widthOfNumber) / 1.5f)) + 1, centerYMeter - (heightOfNumber/2) + 1, true);
		c.dispose();

		c = new Color(Display.getCurrent(),255,255,255);
		gc.setForeground(c);
		gc.drawString(numberPercent, centerXMeter - (Math.round(((float)widthOfNumber) / 1.5f)), centerYMeter - (heightOfNumber/2), true);
		c.dispose();

		font.dispose();
	}
}
