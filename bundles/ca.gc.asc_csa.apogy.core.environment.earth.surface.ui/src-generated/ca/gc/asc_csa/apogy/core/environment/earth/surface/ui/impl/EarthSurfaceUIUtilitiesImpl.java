/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.core.environment.earth.surface.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.ApogyCoreEnvironmentSurfaceEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.EarthSurfaceUIUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment UI Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EarthSurfaceUIUtilitiesImpl extends MinimalEObjectImpl.Container implements EarthSurfaceUIUtilities 
{
	private static EarthSurfaceUIUtilitiesImpl instance = null;
	public static EarthSurfaceUIUtilitiesImpl getInstance() {
		if (instance == null) {
			instance = new EarthSurfaceUIUtilitiesImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthSurfaceUIUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentSurfaceEarthUIPackage.Literals.EARTH_SURFACE_UI_UTILITIES;
	}


	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated_NOT
	   */
	  public Color3f getSunLightColor(double sunAltitude)
	  {
			Color3f color;
			if(sunAltitude >= 0)
			{
				// Applies extinction of green and blue.
				double colorExtinctionFactor = 1.0 - Math.exp(-sunAltitude / 0.053);														
				color = new Color3f(1, (float) colorExtinctionFactor, (float)colorExtinctionFactor);
				
				// Applies atmosphere extinction.
				double sunIntensity = AtmosphereUtils.INSTANCE.getDirectSunIntensity(sunAltitude, 0.0);
				double sunMaximumIntensity = AtmosphereUtils.INSTANCE.getDirectSunIntensity(Math.toRadians(90), 0.0);
				float extinction = (float) (sunIntensity / sunMaximumIntensity);
				
				
				color.scale(extinction);
			}
			else
			{
				color = new Color3f(0,0,0);
			}
			
			return color;
	  }

	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated_NOT
	   */
	  public double getSkyTransparency(double sunAltitude)
	  {
			double transparency = 0.0;
			
			if(sunAltitude < LOWER_SUN_ALTITUDE_FOR_TRANSPARENCY)
			{
				transparency = LOWER_SUN_ALTITUDE_TRANSPARENCY;
			}
			else if((sunAltitude >= LOWER_SUN_ALTITUDE_FOR_TRANSPARENCY) && (sunAltitude < UPPER_SUN_ALTITUDE_FOR_TRANSPARENCY))
			{
				transparency = (sunAltitude -LOWER_SUN_ALTITUDE_FOR_TRANSPARENCY) * UPPER_SUN_ALTITUDE_TRANSPARENCY +
							   (UPPER_SUN_ALTITUDE_FOR_TRANSPARENCY - sunAltitude) * LOWER_SUN_ALTITUDE_TRANSPARENCY;
				
				transparency = transparency / (UPPER_SUN_ALTITUDE_FOR_TRANSPARENCY - LOWER_SUN_ALTITUDE_FOR_TRANSPARENCY);
			}
			else
			{
				transparency = UPPER_SUN_ALTITUDE_TRANSPARENCY;
			}
			
			return transparency;
	  }

	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated_NOT
	   */
	  public Color3f getSkyColor(double sunAltitude)
	  {
			Color3f color = new Color3f();
			
			double max = Math.toRadians(10);
			double min = Math.toRadians(0);
			if(sunAltitude < max)
			{
				if(sunAltitude > min)
				{
					float t = (float) ((sunAltitude - min) / (max -min));												
					color.interpolate(SUNSET_SKY_COLOR, DAY_SKY_COLOR, t);				
				}
				else
				{
					color = SUNSET_SKY_COLOR;
				}
			}
			else
			{
				color = DAY_SKY_COLOR;
			}		
			
			return color;
	  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE:
				return getSunLightColor((Double)arguments.get(0));
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE:
				return getSkyTransparency((Double)arguments.get(0));
			case ApogyCoreEnvironmentSurfaceEarthUIPackage.EARTH_SURFACE_UI_UTILITIES___GET_SKY_COLOR__DOUBLE:
				return getSkyColor((Double)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnvironmentUIUtilitiesImpl
