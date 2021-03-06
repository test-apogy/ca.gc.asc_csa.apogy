package ca.gc.asc_csa.apogy.core.ui;
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
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage
 * @generated
 */
public interface ApogyCoreUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreUIFactory eINSTANCE = ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreUIFacade createApogyCoreUIFacade();

		/**
	 * Returns a new object of class '<em>Apogy Resource Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Resource Settings</em>'.
	 * @generated
	 */
	ApogyResourceSettings createApogyResourceSettings();

		/**
	 * Returns a new object of class '<em>New Apogy Project Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Apogy Project Settings</em>'.
	 * @generated
	 */
	NewApogyProjectSettings createNewApogyProjectSettings();

		/**
	 * Returns a new object of class '<em>New Apogy Session Settings</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Apogy Session Settings</em>'.
	 * @generated
	 */
  NewApogySessionSettings createNewApogySessionSettings();

  /**
	 * Returns a new object of class '<em>New Apogy System Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Apogy System Settings</em>'.
	 * @generated
	 */
	NewApogySystemSettings createNewApogySystemSettings();

		/**
	 * Returns a new object of class '<em>Result Node Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Node Presentation</em>'.
	 * @generated
	 */
  ResultNodePresentation createResultNodePresentation();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreUIPackage getApogyCoreUIPackage();

} //ApogyCoreUIFactory
