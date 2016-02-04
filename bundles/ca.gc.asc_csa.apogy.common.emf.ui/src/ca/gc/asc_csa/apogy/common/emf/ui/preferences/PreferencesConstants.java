package ca.gc.asc_csa.apogy.common.emf.ui.preferences;
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

import org.eclipse.swt.graphics.RGB;

public class PreferencesConstants 
{
	public static final String INSTANCE_TYPE_NAME_FILTER_ID = "INSTANCE_TYPE_NAME_FILTER_ID";
	public static final String DEFAULT_INSTANCE_TYPE_NAME_FILTER = "";
		
	public static final String INSTANCE_TYPE_CLASS_FILTER_ID = "INSTANCE_TYPE_CLASS_FILTER_ID";
	public static final String DEFAULT_INSTANCE_TYPE_CLASS_FILTER = "";
		
	public static final RGB DEFAULT_UNKNOWN_COLOR      = new RGB(  0,255,255);
	public static final RGB DEFAULT_NOMINAL_COLOR      = null; //new RGB(  0,255,  0);
	public static final RGB DEFAULT_WARNING_COLOR      = new RGB(255,255,  0);
	public static final RGB DEFAULT_ALARM_COLOR        = new RGB(255,  0,  0);
	public static final RGB DEFAULT_OUT_OF_RANGE_COLOR = new RGB(  0,  0,255);
	
	public static final String NATIVE_TO_DISPLAY_UNITS_ID = "NATIVE_TO_DISPLAY_UNITS_ID";
	public static final String DEFAULT_NATIVE_TO_DISPLAY_UNITS = "rad=°,rad/s=°/s, rev/s=°/s";
}
