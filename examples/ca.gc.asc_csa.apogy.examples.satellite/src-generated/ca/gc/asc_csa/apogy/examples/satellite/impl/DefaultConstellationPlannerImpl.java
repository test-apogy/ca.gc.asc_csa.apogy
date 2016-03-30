/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.Satellite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Constellation Planner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationPlannerImpl#isUmbraPassesValid <em>Umbra Passes Valid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationPlannerImpl#isSatelliteRollCommandValid <em>Satellite Roll Command Valid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.DefaultConstellationPlannerImpl#getSunHorizonAngleUmbraThreshold <em>Sun Horizon Angle Umbra Threshold</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultConstellationPlannerImpl extends AbstractConstellationPlannerImpl implements DefaultConstellationPlanner {
	/**
	 * The default value of the '{@link #isUmbraPassesValid() <em>Umbra Passes Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUmbraPassesValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UMBRA_PASSES_VALID_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isUmbraPassesValid() <em>Umbra Passes Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUmbraPassesValid()
	 * @generated
	 * @ordered
	 */
	protected boolean umbraPassesValid = UMBRA_PASSES_VALID_EDEFAULT;
	/**
	 * The default value of the '{@link #isSatelliteRollCommandValid() <em>Satellite Roll Command Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatelliteRollCommandValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATELLITE_ROLL_COMMAND_VALID_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSatelliteRollCommandValid() <em>Satellite Roll Command Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatelliteRollCommandValid()
	 * @generated
	 * @ordered
	 */
	protected boolean satelliteRollCommandValid = SATELLITE_ROLL_COMMAND_VALID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSunHorizonAngleUmbraThreshold() <em>Sun Horizon Angle Umbra Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunHorizonAngleUmbraThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double SUN_HORIZON_ANGLE_UMBRA_THRESHOLD_EDEFAULT = 5.0;
	/**
	 * The cached value of the '{@link #getSunHorizonAngleUmbraThreshold() <em>Sun Horizon Angle Umbra Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSunHorizonAngleUmbraThreshold()
	 * @generated
	 * @ordered
	 */
	protected double sunHorizonAngleUmbraThreshold = SUN_HORIZON_ANGLE_UMBRA_THRESHOLD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultConstellationPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.DEFAULT_CONSTELLATION_PLANNER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUmbraPassesValid() {
		return umbraPassesValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmbraPassesValid(boolean newUmbraPassesValid) {
		boolean oldUmbraPassesValid = umbraPassesValid;
		umbraPassesValid = newUmbraPassesValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID, oldUmbraPassesValid, umbraPassesValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatelliteRollCommandValid() {
		return satelliteRollCommandValid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatelliteRollCommandValid(boolean newSatelliteRollCommandValid) {
		boolean oldSatelliteRollCommandValid = satelliteRollCommandValid;
		satelliteRollCommandValid = newSatelliteRollCommandValid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID, oldSatelliteRollCommandValid, satelliteRollCommandValid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSunHorizonAngleUmbraThreshold() {
		return sunHorizonAngleUmbraThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSunHorizonAngleUmbraThreshold(double newSunHorizonAngleUmbraThreshold) {
		double oldSunHorizonAngleUmbraThreshold = sunHorizonAngleUmbraThreshold;
		sunHorizonAngleUmbraThreshold = newSunHorizonAngleUmbraThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD, oldSunHorizonAngleUmbraThreshold, sunHorizonAngleUmbraThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID:
				return isUmbraPassesValid();
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID:
				return isSatelliteRollCommandValid();
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD:
				return getSunHorizonAngleUmbraThreshold();
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
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID:
				setUmbraPassesValid((Boolean)newValue);
				return;
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID:
				setSatelliteRollCommandValid((Boolean)newValue);
				return;
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD:
				setSunHorizonAngleUmbraThreshold((Double)newValue);
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
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID:
				setUmbraPassesValid(UMBRA_PASSES_VALID_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID:
				setSatelliteRollCommandValid(SATELLITE_ROLL_COMMAND_VALID_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD:
				setSunHorizonAngleUmbraThreshold(SUN_HORIZON_ANGLE_UMBRA_THRESHOLD_EDEFAULT);
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
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__UMBRA_PASSES_VALID:
				return umbraPassesValid != UMBRA_PASSES_VALID_EDEFAULT;
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SATELLITE_ROLL_COMMAND_VALID:
				return satelliteRollCommandValid != SATELLITE_ROLL_COMMAND_VALID_EDEFAULT;
			case ApogyExamplesSatellitePackage.DEFAULT_CONSTELLATION_PLANNER__SUN_HORIZON_ANGLE_UMBRA_THRESHOLD:
				return sunHorizonAngleUmbraThreshold != SUN_HORIZON_ANGLE_UMBRA_THRESHOLD_EDEFAULT;
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
		result.append(" (umbraPassesValid: ");
		result.append(umbraPassesValid);
		result.append(", satelliteRollCommandValid: ");
		result.append(satelliteRollCommandValid);
		result.append(", sunHorizonAngleUmbraThreshold: ");
		result.append(sunHorizonAngleUmbraThreshold);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public boolean isValid(VisibilityPass visibilityPass) 
	{
		// Check if there is a satellite associated to the OrbitModel.
		Satellite satellite = getSatellite(visibilityPass.getOrbitModel());		
		if (satellite == null) return false;

		// Finds the closest point the satellite comes to the target in the pass.
		VisibilityPassSpacecraftPosition closestPosition = visibilityPass.getPositionHistory().getSmallestSpacecraftCrossTrackAnglePosition();
		if (closestPosition == null) return false;
			
		/*
		 * Verify if the satellite roll capability must be considered by the planner.
		 */
		if (isSatelliteRollCommandValid()){
		
			// Checks to see if the pass brings us close enough to the target.		
			if(Math.abs(closestPosition.getSpacecraftCrossTrackAngle()) > Math.abs(satellite.getMaximumRoll())) return false;
		}
		
		/*
		 * Verify if passes that occur in umbra must be considered. 
		 */
		if (isUmbraPassesValid()){
				
			// Gets the location of the target
			double observerLongitude = visibilityPass.getSurfaceLocation().getLongitude();
			double observerLatitude = visibilityPass.getSurfaceLocation().getLatitude();
			
			// Finds the horizontal coordinates of the sun at the target at the time of the closest approach.
			HorizontalCoordinates sunCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(closestPosition.getTime(), observerLongitude, observerLatitude);
			
			// Returns true if the sun is at least <x> degrees above the horizon.
			return sunCoordinates.getAltitude() > Math.toRadians(getSunHorizonAngleUmbraThreshold());
		}
		
		return true;
	}
	
} //DefaultConstellationPlannerImpl
