package org.eclipse.symphony.common.emf.ui.preferences;

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
