package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.preferences;
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

public class MRTData3DUIPreferencesConstants 
{
	// Visibility Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_VISIBILITY_ID = "DEFAULT_TRIANGULAR_MESH_VISIBILITY_ID";	
	public static final Boolean DEFAULT_TRIANGULAR_MESH_VISIBILITY = new Boolean(true);
	
	public static final String DEFAULT_CARTESIAN_COORD_SET_VISIBILITY_ID = "DEFAULT_CARTESIAN_COORD_SET_VISIBILITY_ID";	
	public static final Boolean DEFAULT_CARTESIAN_COORD_SET_VISIBILITY = new Boolean(true);

	// Points size constants
	public static final String DEFAULT_TRIANGULAR_MESH_POINT_SIZE_ID = "DEFAULT_TRIANGULAR_MESH_POINT_SIZE_ID";	
	public static final Integer DEFAULT_TRIANGULAR_MESH_POINT_SIZE = new Integer(1);
	
	public static final String DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE_ID  = "DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE_ID";	
	public static final Integer DEFAULT_CARTESIAN_COORD_SET_POINT_SIZE = new Integer(1);
	
	// Presentation Mode Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE_ID = "DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE_ID";		
	public static final MeshPresentationMode DEFAULT_TRIANGULAR_MESH_PRESENTATION_MODE = MeshPresentationMode.SURFACE;
	
	// Color Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_COLOR_ID = "DEFAULT_TRIANGULAR_MESH_COLOR_ID";		
	public static final RGB DEFAULT_TRIANGULAR_MESH_COLOR          = new RGB(150,75,0);

	public static final String DEFAULT_CARTESIAN_COORD_SET_COLOR_ID = "DEFAULT_CARTESIAN_COORD_SET_COLOR_ID";		
	public static final RGB DEFAULT_CARTESIAN_COORD_SET_COLOR  = new RGB(255,0,0);

	// Shading Constants.
	public static final String DEFAULT_TRIANGULAR_MESH_USE_SHADING_ID = "DEFAULT_TRIANGULAR_MESH_USE_SHADING_ID";	
	public static final Boolean DEFAULT_TRIANGULAR_MESH_USE_SHADING = new Boolean(true);
}
