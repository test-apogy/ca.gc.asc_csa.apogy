package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;
import javax.vecmath.Point3f;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.ui.EnvironmentUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Ui Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EnvironmentUIUtilitiesImpl extends MinimalEObjectImpl.Container implements EnvironmentUIUtilities
{
	public static final float POGSON_RATIO = (float) Math.pow(100, 0.2);
		
	private static EnvironmentUIUtilitiesImpl instance = null;
	public static EnvironmentUIUtilitiesImpl getInstance() {
		if (instance == null) {
			instance = new EnvironmentUIUtilitiesImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnvironmentUIUtilitiesImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreEnvironmentUIPackage.Literals.ENVIRONMENT_UI_UTILITIES;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Point3f toPoint3f(Star star)
  {
		float r = 1.0f;
		float x = r * (float) (Math.cos(star.getEquatorialCoordinates().getDeclination()) * Math.cos(star.getEquatorialCoordinates().getRightAscension()));
		float y = r * (float) (Math.cos(star.getEquatorialCoordinates().getDeclination()) * Math.sin(star.getEquatorialCoordinates().getRightAscension()));
		float z = r * (float) Math.sin(star.getEquatorialCoordinates().getDeclination());
		Point3f p = new Point3f(x, y, z);						
		return p;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public float getPointSizeForMagnitude(float magnitude, float magnitudeRangeMinimum, float magnitudeRangeMaximum, float minimumPointSize, float maximumPointSize)
  {
		float radiusRange = (float) Math.sqrt(Math.pow(POGSON_RATIO, magnitudeRangeMaximum - magnitudeRangeMinimum));
		
		float luminosity = (float) Math.pow(POGSON_RATIO, magnitudeRangeMaximum - magnitude);
		
		float radius = (float) ((Math.sqrt(luminosity) / radiusRange) * (maximumPointSize - minimumPointSize) + minimumPointSize);
		
		return radius;
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyCoreEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR:
				return toPoint3f((Star)arguments.get(0));
			case ApogyCoreEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT:
				return getPointSizeForMagnitude((Float)arguments.get(0), (Float)arguments.get(1), (Float)arguments.get(2), (Float)arguments.get(3), (Float)arguments.get(4));
			case ApogyCoreEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE:
				return getSunLightColor((Double)arguments.get(0));
			case ApogyCoreEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE:
				return getSkyTransparency((Double)arguments.get(0));
			case ApogyCoreEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE:
				return getSkyColor((Double)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnvironmentUIUtilitiesImpl
