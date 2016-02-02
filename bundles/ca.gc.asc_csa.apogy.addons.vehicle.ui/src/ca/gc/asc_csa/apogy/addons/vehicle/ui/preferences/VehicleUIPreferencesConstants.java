package ca.gc.asc_csa.apogy.addons.vehicle.ui.preferences;
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


public class VehicleUIPreferencesConstants 
{
	public static final String DEFAULT_PHYSICAL_WHEEL_VISIBILITY_ID = "DEFAULT_PHYSICAL_WHEEL_VISIBILITY_ID";
	public static final boolean DEFAULT_PHYSICAL_WHEEL_VISIBILITY = false;
	
	public static final String DEFAULT_PHYSICAL_WHEEL_COLOR_ID = "DEFAULT_PHYSICAL_WHEEL_COLOR_ID";		
	public static final RGB DEFAULT_PHYSICAL_WHEEL_COLOR  = new RGB(255,255,255);
	
	public static final String DEFAULT_LANDER_SPHERICAL_FOOT_VISIBILITY_ID = "DEFAULT_LANDER_SPHERICAL_FOOT_VISIBILITY_ID";
	public static final boolean DEFAULT_LANDER_SPHERICAL_FOOT_VISIBILITY = false;
	
	public static final String DEFAULT_LANDER_SPHERICAL_FOOT_COLOR_ID = "DEFAULT_LANDER_SPHERICAL_FOOT_COLOR_ID";		
	public static final RGB DEFAULT_LANDER_SPHERICAL_FOOT_COLOR  = new RGB(255,255,255);
	
	public static final String DEFAULT_THRUSTER_PLUME_ENVELOPE_VISIBILITY_ID = "DEFAULT_THRUSTER_PLUME_ENVELOPE_VISIBILITY_ID";
	public static final boolean DEFAULT_THRUSTER_PLUME_ENVELOPE_VISIBILITY = false;
	
	public static final String DEFAULT_THRUSTER_PLUME_ENVELOPE_COLOR_ID = "DEFAULT_THRUSTER_PLUME_ENVELOPE_COLOR_ID";		
	public static final RGB DEFAULT_THRUSTER_PLUME_ENVELOPE_COLOR  = new RGB(255,0,0);
	
	public static final String DEFAULT_THRUSTER_PLUME_ENVELOPE_LENGTH_ID = "DEFAULT_THRUSTER_PLUME_ENVELOPE_LENGTH_ID";
	public static final double DEFAULT_THRUSTER_PLUME_ENVELOPE_LENGTH = 1.0;
}
