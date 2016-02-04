package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
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

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Activator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEImpl#getFirstLine <em>First Line</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEImpl#getSecondLine <em>Second Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLEImpl extends AbstractTLEImpl implements TLE {
	/**
	 * The default value of the '{@link #getFirstLine() <em>First Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLine()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_LINE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirstLine() <em>First Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstLine()
	 * @generated
	 * @ordered
	 */
	protected String firstLine = FIRST_LINE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSecondLine() <em>Second Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondLine()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_LINE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSecondLine() <em>Second Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondLine()
	 * @generated
	 * @ordered
	 */
	protected String secondLine = SECOND_LINE_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.TLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstLine() {
		return firstLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFirstLine(String newFirstLine) 
	{
		setFirstLineGen(newFirstLine);
		updateAllAttributes();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstLineGen(String newFirstLine) {
		String oldFirstLine = firstLine;
		firstLine = newFirstLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE__FIRST_LINE, oldFirstLine, firstLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondLine() {
		return secondLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setSecondLine(String newSecondLine) 
	{
		setSecondLineGen(newSecondLine);
		updateAllAttributes();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondLineGen(String newSecondLine) {
		String oldSecondLine = secondLine;
		secondLine = newSecondLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE__SECOND_LINE, oldSecondLine, secondLine));
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__FIRST_LINE:
				return getFirstLine();
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__SECOND_LINE:
				return getSecondLine();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__FIRST_LINE:
				setFirstLine((String)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__SECOND_LINE:
				setSecondLine((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__FIRST_LINE:
				setFirstLine(FIRST_LINE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__SECOND_LINE:
				setSecondLine(SECOND_LINE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__FIRST_LINE:
				return FIRST_LINE_EDEFAULT == null ? firstLine != null : !FIRST_LINE_EDEFAULT.equals(firstLine);
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE__SECOND_LINE:
				return SECOND_LINE_EDEFAULT == null ? secondLine != null : !SECOND_LINE_EDEFAULT.equals(secondLine);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstLine: ");
		result.append(firstLine);
		result.append(", secondLine: ");
		result.append(secondLine);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getLine1() 
	{
		return getFirstLine();
	}
	
	@Override
	public String getLine2() 
	{
		return getSecondLine();
	}
	
	protected void updateAllAttributes()
	{
		/*
		 * If both line are set. 
		 */
		if((getLine1() != null && getLine1().length() > 0) &&
		   (getLine2() != null && getLine2().length() > 0))
		{
			try
			{
				org.orekit.propagation.analytical.tle.TLE tle = getOreKitTLE();
				
				// TODO : Perform this in a transaction friendly way.				
				setBStar(tle.getBStar());
				setEpoch(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(tle.getDate()));
				setEccentricity(tle.getE());
				setElementNumber(tle.getElementNumber());
				setEphemerisType(EphemerisType.get(tle.getEphemerisType()));
				setInclination(tle.getI());
				setMeanAnomaly(tle.getMeanAnomaly());
				setMeanMotion(tle.getMeanMotion());
				double revPerDay = (tle.getMeanMotion() * 24*60*60) / (2.0*Math.PI);
				setRevolutionPerDay(revPerDay);
				setMeanMotionFirstDerivative(tle.getMeanMotionFirstDerivative());
				setMeanMotionSecondDerivative(tle.getMeanMotionSecondDerivative());
				setArgumentOfPerigee(tle.getPerigeeArgument());
				setRightAscentionOfAscendingNode(tle.getRaan());
				setRevolutionNumberAtEpoch(tle.getRevolutionNumberAtEpoch());
				setSatelliteNumber(tle.getSatelliteNumber());
				
				return;
			}
			catch(Exception e)
			{
				Logger.INSTANCE.log(Activator.ID, this, "Failed to parse TLE lines.", EventSeverity.ERROR, e);
			}
		}
		
		// Invalid TLE lines have been found, sets all parameters to default.
		// TODO : Perform this in a transaction friendly way.
				
		setBStar(BSTAR_EDEFAULT);
		setEpoch(new Date());
		setEccentricity(ECCENTRICITY_EDEFAULT);
		setElementNumber(ELEMENT_NUMBER_EDEFAULT);
		setEphemerisType(EPHEMERIS_TYPE_EDEFAULT);
		setInclination(INCLINATION_EDEFAULT);
		setMeanAnomaly(MEAN_ANOMALY_EDEFAULT);
		setMeanMotion(MEAN_MOTION_EDEFAULT);
		
		setRevolutionPerDay(REVOLUTION_PER_DAY_EDEFAULT);
		setMeanMotionFirstDerivative(MEAN_MOTION_FIRST_DERIVATIVE_EDEFAULT);
		setMeanMotionSecondDerivative(MEAN_MOTION_SECOND_DERIVATIVE_EDEFAULT);
		setArgumentOfPerigee(ARGUMENT_OF_PERIGEE_EDEFAULT);
		setRightAscentionOfAscendingNode(RIGHT_ASCENTION_OF_ASCENDING_NODE_EDEFAULT);
		setRevolutionNumberAtEpoch(REVOLUTION_NUMBER_AT_EPOCH_EDEFAULT);
		setSatelliteNumber(SATELLITE_NUMBER_EDEFAULT);		
	}
	
} //TLEImpl
