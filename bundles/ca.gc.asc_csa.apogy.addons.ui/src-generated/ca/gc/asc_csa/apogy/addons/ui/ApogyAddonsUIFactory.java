package ca.gc.asc_csa.apogy.addons.ui;
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
 * @see ca.gc.asc_csa.apogy.addons.ui.ApogyAddonsUIPackage
 * @generated
 */
public interface ApogyAddonsUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsUIFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.ui.impl.ApogyAddonsUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ruler3d Tool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruler3d Tool Node Presentation</em>'.
	 * @generated
	 */
	Ruler3dToolNodePresentation createRuler3dToolNodePresentation();

	/**
	 * Returns a new object of class '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun Vector3 DTool Node Presentation</em>'.
	 * @generated
	 */
	SunVector3DToolNodePresentation createSunVector3DToolNodePresentation();

	/**
	 * Returns a new object of class '<em>Trajectory3 DTool Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory3 DTool Node Presentation</em>'.
	 * @generated
	 */
	Trajectory3DToolNodePresentation createTrajectory3DToolNodePresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsUIPackage getApogyAddonsUIPackage();

} //ApogyAddonsUIFactory
