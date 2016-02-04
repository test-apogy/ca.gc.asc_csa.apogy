package ca.gc.asc_csa.apogy.addons.sensors.fov.bindings;
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
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsPackage
 * @generated
 */
public interface ApogyAddonsSensorsFOVBindingsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsSensorsFOVBindingsFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.ApogyAddonsSensorsFOVBindingsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Circular Sector Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circular Sector Field Of View Binding</em>'.
	 * @generated
	 */
  CircularSectorFieldOfViewBinding createCircularSectorFieldOfViewBinding();

  /**
	 * Returns a new object of class '<em>Conical Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conical Field Of View Binding</em>'.
	 * @generated
	 */
  ConicalFieldOfViewBinding createConicalFieldOfViewBinding();

  /**
	 * Returns a new object of class '<em>Rectangular Frustrum Field Of View Binding</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangular Frustrum Field Of View Binding</em>'.
	 * @generated
	 */
  RectangularFrustrumFieldOfViewBinding createRectangularFrustrumFieldOfViewBinding();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsSensorsFOVBindingsPackage getApogyAddonsSensorsFOVBindingsPackage();

} //ApogyAddonsSensorsFOVBindingsFactory
