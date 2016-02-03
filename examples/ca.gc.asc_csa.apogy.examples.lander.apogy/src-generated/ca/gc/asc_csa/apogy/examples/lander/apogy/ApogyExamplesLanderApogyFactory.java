package ca.gc.asc_csa.apogy.examples.lander.apogy;
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
 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage
 * @generated
 */
public interface ApogyExamplesLanderApogyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesLanderApogyFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.lander.apogy.impl.ApogyExamplesLanderApogyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Lander Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Apogy System Api Adapter</em>'.
	 * @generated
	 */
  LanderApogySystemApiAdapter createLanderApogySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Lander Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Data</em>'.
	 * @generated
	 */
	LanderData createLanderData();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesLanderApogyPackage getApogyExamplesLanderApogyPackage();

} //ApogyExamplesLanderApogyFactory
