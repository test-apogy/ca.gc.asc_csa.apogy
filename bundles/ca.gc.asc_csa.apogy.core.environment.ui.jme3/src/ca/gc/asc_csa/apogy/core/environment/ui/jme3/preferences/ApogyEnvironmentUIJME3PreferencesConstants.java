package ca.gc.asc_csa.apogy.core.environment.ui.jme3.preferences;
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


public class ApogyEnvironmentUIJME3PreferencesConstants 
{
	
	// Earth Sky Constants.
	
	// Bloom Constant.
	public static final String DEFAULT_BLOOM_ENABLED_ID = "DEFAULT_BLOOM_ENABLED_ID";	
	public static final Boolean DEFAULT_BLOOM_ENABLED_DEFAULT = new Boolean(false);	
	
	// Shadows Constant.
	public static final String DEFAULT_SHADOW_MAP_SIZE_ID = "DEFAULT_SHADOW_MAP_SIZE_ID";	
	public static final Integer DEFAULT_SHADOW_MAP_SIZE_DEFAULT = new Integer(512);	

	// Sun Constants.
	public static final String DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID = "DEFAULT_SUN_CAST_SHADOWS_ENABLED_ID";	
	public static final Boolean DEFAULT_SUN_CAST_SHADOWS_ENABLED_DEFAULT = new Boolean(false);	
	
	// Moon Constants.
	public static final String DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID = "DEFAULT_MOON_CAST_SHADOWS_ENABLED_ID";	
	public static final Boolean DEFAULT_MOON_CAST_SHADOWS_ENABLED_DEFAULT =  new Boolean(false);	
}
