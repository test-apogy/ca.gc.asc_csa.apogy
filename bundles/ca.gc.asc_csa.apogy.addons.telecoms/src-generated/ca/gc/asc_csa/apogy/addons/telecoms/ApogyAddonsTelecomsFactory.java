package ca.gc.asc_csa.apogy.addons.telecoms;
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage
 * @generated
 */
public interface ApogyAddonsTelecomsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsTelecomsFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.telecoms.impl.ApogyAddonsTelecomsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Telecom Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telecom Node</em>'.
	 * @generated
	 */
	TelecomNode createTelecomNode();

	/**
	 * Returns a new object of class '<em>Telecom Status Monitor Tool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telecom Status Monitor Tool</em>'.
	 * @generated
	 */
	TelecomStatusMonitorTool createTelecomStatusMonitorTool();

	/**
	 * Returns a new object of class '<em>Telecom Status Monitor Tool List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Telecom Status Monitor Tool List</em>'.
	 * @generated
	 */
	TelecomStatusMonitorToolList createTelecomStatusMonitorToolList();

	/**
	 * Returns a new object of class '<em>Isotropic Antenna</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Isotropic Antenna</em>'.
	 * @generated
	 */
	IsotropicAntenna createIsotropicAntenna();

	/**
	 * Returns a new object of class '<em>Dipole Antenna Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dipole Antenna Radiation Pattern</em>'.
	 * @generated
	 */
	DipoleAntennaRadiationPattern createDipoleAntennaRadiationPattern();

	/**
	 * Returns a new object of class '<em>Half Wave Dipole Antenna Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Half Wave Dipole Antenna Radiation Pattern</em>'.
	 * @generated
	 */
	HalfWaveDipoleAntennaRadiationPattern createHalfWaveDipoleAntennaRadiationPattern();

	/**
	 * Returns a new object of class '<em>Simple Conical Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Conical Radiation Pattern</em>'.
	 * @generated
	 */
	SimpleConicalRadiationPattern createSimpleConicalRadiationPattern();

	/**
	 * Returns a new object of class '<em>Simple Rectangular Frustum Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Rectangular Frustum Radiation Pattern</em>'.
	 * @generated
	 */
	SimpleRectangularFrustumRadiationPattern createSimpleRectangularFrustumRadiationPattern();

	/**
	 * Returns a new object of class '<em>URl Based Antenna Radiation Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URl Based Antenna Radiation Pattern</em>'.
	 * @generated
	 */
	URlBasedAntennaRadiationPattern createURlBasedAntennaRadiationPattern();

	/**
	 * Returns a new object of class '<em>Antenna Radiation Pattern Image Map Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Antenna Radiation Pattern Image Map Layer</em>'.
	 * @generated
	 */
	AntennaRadiationPatternImageMapLayer createAntennaRadiationPatternImageMapLayer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsTelecomsPackage getApogyAddonsTelecomsPackage();

} //ApogyAddonsTelecomsFactory
