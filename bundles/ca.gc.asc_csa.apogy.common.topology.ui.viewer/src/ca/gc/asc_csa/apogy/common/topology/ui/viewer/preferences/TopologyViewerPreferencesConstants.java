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


public class TopologyViewerPreferencesConstants 
{
	// Anti-Aliasing
	public static final String VIEWER_ANTI_ALIASING_ID = "VIEWER_ANTI_ALIASING_ID";
	public static final boolean VIEWER_ANTI_ALIASING_DEFAULT = true;

	// Verbose
	public static final String VIEWER_VERBOSE_ID = "VIEWER_VERBOSE_ID";
	public static final boolean VIEWER_VERBOSE_DEFAULT = false;

	// Maximum Frame Rate
	public static final String VIEWER_MAX_FRAME_RATE_ID = "VIEWER_MAX_FRAME_RATE_ID";
	public static final int VIEWER_MAX_FRAME_RATE_DEFAULT = 15;

	// Navigation Linear Speed.
	public static final String DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID = "DEFAULT_LINEAR_LOW_SPEED_FACTOR_ID";
	public static final double DEFAULT_LINEAR_LOW_SPEED_FACTOR = 1;
	
	public static final String DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID = "DEFAULT_LINEAR_HIGH_SPEED_FACTOR_ID";
	public static final double DEFAULT_LINEAR_HIGH_SPEED_FACTOR = 10;
}
