/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SurfaceEnvironmentUtilitiesImpl extends MinimalEObjectImpl.Container implements SurfaceEnvironmentUtilities 
{
	public static final float MINUTES_PER_DAY = 24 * 60;
	public static final float SECONDS_PER_DAY = 24 * 60 * 60;
	
	// Gregorian Calendar adopted Oct. 15, 1582 (2299161)
	public static final int JGREG = 15 + 31*(10+12*1582);
	public static final double HALFSECOND = 0.5;
	
	
	private static SurfaceEnvironmentUtilities instance = null;
	public static SurfaceEnvironmentUtilities getInstance() {
		if (instance == null) {
			instance = new SurfaceEnvironmentUtilitiesImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceEnvironmentUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.SURFACE_ENVIRONMENT_UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double convertToJulianDate(Date date) 
	{
		TimeZone timeZone = new SimpleTimeZone(0, "GMT");
		
		// Creates a calendar that is GMT.
		Calendar calendar = Calendar.getInstance(timeZone, Locale.CANADA);		
		calendar.setTime(date);

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
				
		double a = Math.floor((14.0 - month) / 12.0);
		double y = year + 4800.0 - a;		
		double m = month + 12 * a -3;

		
		double jdn    = day + 
						Math.floor( ((153.0 * m) + 2.0)/ 5.0) + 
						365 * y +
						Math.floor(y / 4.0) - 
						Math.floor(y / 100.0) +
						Math.floor(y / 400.0) -
						32045;
		
		double fraction = ((double) hour - 12.0) / 24.0 + 
						  (double) min / 1440.0 +
						  (double) sec / 86400.0;
		
		double jd = jdn + fraction;
							
		return jd;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public float parseRightAscension(String rightAscensionString) throws Exception 
	{
		float angle = 0.0f;

		String[] values = rightAscensionString.trim().split(":");

		float hour = Float.parseFloat(values[0]);
		float min = Float.parseFloat(values[1]);
		float sec = Float.parseFloat(values[2]);

		float dayFraction = (hour / 24.0f) + (min / MINUTES_PER_DAY)
				+ (sec / SECONDS_PER_DAY);
		angle = (float) (dayFraction * 2.0f * Math.PI);

		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public float parseDegMinSec(String degMinSecAngleString) 
	{
		float angle = 0.0f;
		
		String[] values = degMinSecAngleString.trim().split(":");
		
		float deg = Float.parseFloat(values[0]);
	
		float sign = 1.0f;
		if(values[0].contains("-"))
		{
			sign =-1.0f;
		}
		
		float min = Float.parseFloat(values[1]);
		float sec = Float.parseFloat(values[2]);
		
		angle = Math.abs(deg) + (min / 60.0f) + (sec / 3600.0f);
		angle = sign * angle;		
		angle = (float) Math.toRadians(angle);
		
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentPackage.SURFACE_ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE:
				return convertToJulianDate((Date)arguments.get(0));
			case ApogySurfaceEnvironmentPackage.SURFACE_ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING:
				try {
					return parseRightAscension((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogySurfaceEnvironmentPackage.SURFACE_ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING:
				return parseDegMinSec((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnvironmentUtilitiesImpl
