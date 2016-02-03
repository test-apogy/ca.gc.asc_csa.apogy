package ca.gc.asc_csa.apogy.addons.geometry.paths.ui.preferences;
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
import ca.gc.asc_csa.apogy.addons.geometry.paths.ui.PathPresentationMode;

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
