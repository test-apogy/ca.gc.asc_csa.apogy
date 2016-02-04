package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.preferences;
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
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;

public class MRTImagingPreferencesConstants 
{
	// Visibility Constants.
	public static final String DEFAULT_IMAGE_SNAPSHOT_VISIBILITY_ID = "DEFAULT_IMAGE_SNAPSHOT_VISIBILITY_ID";	
	public static final Boolean DEFAULT_IMAGE_SNAPSHOT_VISIBILITY = new Boolean(false);
	
	// Image Projection Constants.
	public static final String DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ID = "DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ID";	
	public static final Boolean DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION = new Boolean(false);

	// Image Projection on FOV Constants.
	public static final String DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ON_FOV_ID = "DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ON_FOV_ID";	
	public static final Boolean DEFAULT_IMAGE_SNAPSHOT_SHOW_PROJECTION_ON_FOV = new Boolean(false);

	
	// Presentation Mode Constants.
	public static final String DEFAULT_IMAGE_SNAPSHOT_FOV_PRESENTATION_MODE_ID = "DEFAULT_IMAGE_SNAPSHOT_FOV_PRESENTATION_MODE_ID";	
	public static final MeshPresentationMode DEFAULT_IMAGE_SNAPSHOT_FOV_PRESENTATION_MODE = MeshPresentationMode.WIREFRAME;
	
	// Color Constants.
	public static final String DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR_ID = "DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR_ID";		
	public static final RGB DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR = new RGB(255,255,0);
	
}
