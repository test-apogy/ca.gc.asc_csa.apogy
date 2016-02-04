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

public class ProgressBarComposite extends Composite  {

	private static final String IMAGES_FOLDER = "platform:/plugin/ca.gc.asc_csa.apogy.common.widgets.ui/images/"; //Images path
	private static final int MAX_VALUE = 100;
	private static final int MIN_VALUE = 0;

	private Image background;
	private int actualValue; //Actual value of the progress bar in percent.

	/**
	 * Constructor parameter information:
	 * 
	 * @param initialValue The initial value of the progress bar.
	 */
	public ProgressBarComposite(Composite parent, int style,int initialValue) {
		super(parent, style | SWT.DOUBLE_BUFFERED);

		setActualValue(initialValue);

		initImages();

		createPaintListener();
		createDisposeListener();
	}

	public synchronized int getActualValue() { return actualValue; }

	public synchronized void setActualValue(int actualValue) {
		if(actualValue > MAX_VALUE)
			this.actualValue = MAX_VALUE;
		else if(actualValue < MIN_VALUE)
			this.actualValue = MIN_VALUE;
		else
			this.actualValue = actualValue;
		redraw();
	}

	public synchronized void increaseValue() { setActualValue(actualValue + 1); }
	public synchronized void decreaseValue() { setActualValue(actualValue - 1); }

	private void initImages() {
		try {
			Device device = Display.getCurrent(); 
			URL url = new URL(IMAGES_FOLDER + "gadgeCenter.png");
			background = new Image(device,url.openStream());
		} catch (Exception e) { e.printStackTrace(); }
	}

	private void paintMeter(GC gc) {

		int centerXMeter = getBounds().width / 2;
		int centerYMeter = getBounds().height / 2;
		
		float XScaleFactor = 0f;
		float YScaleFactor = 0f;

		//Draw image
		if(background != null) {
			XScaleFactor = (((float) getBounds().width) / ((float) background.getBounds().width));
			YScaleFactor = (((float) getBounds().height) / ((float) background.getBounds().height));
			gc.drawImage(background, 0, 0, background.getBounds().width, background.getBounds().height, 0, 0, getBounds().width, getBounds().height);
		} else {
			Color color = new Color(getDisplay(),0,0,0);
			gc.setForeground(color);
			gc.setLineWidth(4);
			gc.drawRectangle(2, 2, getBounds().width - 4, getBounds().height - 4);
			color.dispose();
		}
		//Draw gadge state
		double gadgeWidth = getBounds().width - 2;
		int value = (int) Math.round(gadgeWidth * (actualValue / 100.0));

		gc.setAlpha(100);

		Color c = new Color(Display.getCurrent(),0,255,0);

		gc.setBackground(c);

		gc.fillRectangle(1, 1, value, getBounds().height - 2);

		c.dispose();

		//draw number on gadge
		int size = 0;
		if(XScaleFactor > YScaleFactor) size = Math.round(7f * YScaleFactor);
		else size = Math.round(7f * XScaleFactor);
		DecimalFormat df = new DecimalFormat("0");
		Font font = new Font(getDisplay(), "Tahoma", size, SWT.BOLD);
		gc.setFont(font);
		gc.setAlpha(255);
		String numberPercent = df.format(actualValue) + "%";
		int widthOfNumber = 0;
		for(int i = 0; i < numberPercent.length(); i++) 
			widthOfNumber += gc.getAdvanceWidth(numberPercent.charAt(i));
		int heightOfNumber = gc.getFontMetrics().getHeight();
		c = new Color(Display.getCurrent(),0,0,0);
		gc.setForeground(c);
		gc.drawString(numberPercent, centerXMeter - (widthOfNumber / 2) + 1, centerYMeter - (heightOfNumber/2) + 1, true);
		c.dispose();
		c = new Color(Display.getCurrent(),255,255,255);
		gc.setForeground(c);
		gc.drawString(numberPercent, centerXMeter - (widthOfNumber / 2), centerYMeter - (heightOfNumber/2), true);
		c.dispose();
		font.dispose();

	}

	private void createDisposeListener() {
		addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				if(background != null)
					background.dispose();
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
