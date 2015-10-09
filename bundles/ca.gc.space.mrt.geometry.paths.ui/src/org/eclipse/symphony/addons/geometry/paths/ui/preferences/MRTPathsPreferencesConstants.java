package org.eclipse.symphony.addons.geometry.paths.ui.preferences;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.geometry.paths.ui.PathPresentationMode;

public class MRTPathsPreferencesConstants 
{
	// Visibility Constants.
	public static final String DEFAULT_WAYPOINTPATH_VISIBILITY_ID = "DEFAULT_WAYPOINTPATH_VISIBILITY_ID";	
	public static final Boolean DEFAULT_WAYPOINTPATH_VISIBILITY = new Boolean(true);
	
	// Point Size Constants
	public static final String DEFAULT_WAYPOINTPATH_POINT_SIZE_ID = "DEFAULT_WAYPOINTPATH_POINT_SIZE_ID";	
	public static final Integer DEFAULT_WAYPOINTPATH_POINT_SIZE = new Integer(2);

	// End Point Radius Constants
	public static final String DEFAULT_WAYPOINTPATH_END_POINT_RADIUS_ID = "DEFAULT_WAYPOINTPATH_END_POINT_RADIUS_ID";	
	public static final Float DEFAULT_WAYPOINTPATH_END_POINT_RADIUS = new Float(0.02);
	
	// Presentation Mode Constants.
	public static final String DEFAULT_WAYPOINTPATH_PRESENTATION_MODE_ID = "DEFAULT_WAYPOINTPATH_PRESENTATION_MODE_ID";		
	public static final PathPresentationMode DEFAULT_WAYPOINTPATH_PRESENTATION_MODE = PathPresentationMode.POINTS_LINES;
	
	// Color Constants.
	public static final String DEFAULT_WAYPOINTPATH_COLOR_ID = "DEFAULT_WAYPOINTPATH_COLOR_ID";		
	public static final RGB DEFAULT_WAYPOINTPATH_COLOR          = new RGB(0,255,0);
		
}
