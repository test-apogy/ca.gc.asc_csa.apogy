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

import org.eclipse.swt.graphics.Color;

public class Range implements Comparable<Range> {
	
	private double minimum;
	private double maximum;
	private Color color;
	
	/**
	 * 
	 * @param min	It's the lower value of the range.
	 * @param max	It's the upper value of the range.
	 * @param color	It's the color used to represent this range.
	 */
	public Range(double min, double max, Color color) {
		minimum = min;
		maximum = max;
		this.color = color;
	}
	
	public double getRange() { return maximum - minimum; }
	public double getMinimum() { return minimum; }
	public double getMaximum() { return maximum; }
	public Color getColor() { return color; }

	@Override
	public int compareTo(Range r) {
		if(getRange() > r.getRange())
			return -1;
		else if(getRange() < r.getRange())
			return 1;
		else
			return 0;
	}	
	
	@Override
	protected void finalize() throws Throwable {
		color.dispose();
		super.finalize();
	}
}