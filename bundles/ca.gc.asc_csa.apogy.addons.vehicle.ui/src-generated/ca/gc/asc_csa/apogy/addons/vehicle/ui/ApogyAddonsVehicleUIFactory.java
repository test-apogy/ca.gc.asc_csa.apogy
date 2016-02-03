package ca.gc.asc_csa.apogy.addons.vehicle.ui;
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
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage
 * @generated
 */
public interface ApogyAddonsVehicleUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsVehicleUIFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.vehicle.ui.impl.ApogyAddonsVehicleUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Physical Wheel Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Wheel Presentation</em>'.
	 * @generated
	 */
  PhysicalWheelPresentation createPhysicalWheelPresentation();

  /**
	 * Returns a new object of class '<em>Lander Spherical Foot Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Spherical Foot Presentation</em>'.
	 * @generated
	 */
  LanderSphericalFootPresentation createLanderSphericalFootPresentation();

  /**
	 * Returns a new object of class '<em>Thruster Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thruster Presentation</em>'.
	 * @generated
	 */
  ThrusterPresentation createThrusterPresentation();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsVehicleUIPackage getApogyAddonsVehicleUIPackage();

} //ApogyAddonsVehicleUIFactory
