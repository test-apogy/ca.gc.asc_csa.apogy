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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import org.orekit.utils.ElevationMask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Elevation Mask</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ConstantElevationMaskImpl#getConstantElevation <em>Constant Elevation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantElevationMaskImpl extends ElevationMaskImpl implements ConstantElevationMask {
	/**
	 * The default value of the '{@link #getConstantElevation() <em>Constant Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double CONSTANT_ELEVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConstantElevation() <em>Constant Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstantElevation()
	 * @generated
	 * @ordered
	 */
	protected double constantElevation = CONSTANT_ELEVATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantElevationMaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.CONSTANT_ELEVATION_MASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConstantElevation() {
		return constantElevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstantElevation(double newConstantElevation) {
		double oldConstantElevation = constantElevation;
		constantElevation = newConstantElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION, oldConstantElevation, constantElevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION:
				return getConstantElevation();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION:
				setConstantElevation((Double)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION:
				setConstantElevation(CONSTANT_ELEVATION_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CONSTANT_ELEVATION_MASK__CONSTANT_ELEVATION:
				return constantElevation != CONSTANT_ELEVATION_EDEFAULT;
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
		result.append(" (constantElevation: ");
		result.append(constantElevation);
		result.append(')');
		return result.toString();
	}

	@Override
	public double getElevation(double azimuth) 
	{		
		return getOreKitElevationMask().getElevation(azimuth);	
	}
	
	@Override
	public ElevationMask getOreKitElevationMask() 
	{		
		double[][] maskValues = new double[][]{{0,0},{0,0}};				
		org.orekit.utils.ElevationMask mask = new ElevationMask(maskValues)
		{			
			private static final long serialVersionUID = -89818792036112341L;
			final double el = getConstantElevation();		
			
			public double getElevation(double arg0) 
			{
				return el;
			}
		};
		
		return mask;
	}
} //ConstantElevationMaskImpl
