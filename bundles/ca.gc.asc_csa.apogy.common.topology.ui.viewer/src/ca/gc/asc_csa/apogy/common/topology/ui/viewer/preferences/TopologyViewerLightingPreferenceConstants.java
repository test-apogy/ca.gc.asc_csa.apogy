package ca.gc.asc_csa.apogy.common.topology.ui.viewer.preferences;
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

public class TopologyViewerLightingPreferenceConstants {

	public static final String P_ANTI_ALIASING = "ca.gc.asc_csa.apogy.common.topology.ui.antialising";

	public static final String P_SHOW_3D_AXIS = "ca.gc.asc_csa.apogy.common.topology.ui.show3DAxis";

	// Colors
	public static final String AMBIENT_LIGHT_COLOR_ID = "AMBIENT_LIGHT_COLOR_ID";
	public static final RGB AMBIENT_LIGHT_COLOR_DEFAULT = new RGB(255, 255, 255);
	
	// Enable / disable
	public static final String AMBIENT_LIGHT_ENABLED_ID = "AMBIENT_LIGHT_ENABLED_ID";
	public static final boolean AMBIENT_LIGHT_ENABLED_DEFAULT = false;

}
