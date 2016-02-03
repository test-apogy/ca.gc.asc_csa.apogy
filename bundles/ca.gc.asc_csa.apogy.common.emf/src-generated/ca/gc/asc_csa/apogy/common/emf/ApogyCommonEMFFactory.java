package ca.gc.asc_csa.apogy.common.emf;
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
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage
 * @generated
 */
public interface ApogyCommonEMFFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCommonEMFFactory eINSTANCE = ca.gc.asc_csa.apogy.common.emf.impl.ApogyCommonEMFFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonEMFFacade createApogyCommonEMFFacade();

		/**
	 * Returns a new object of class '<em>EObject Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Reference</em>'.
	 * @generated
	 */
	EObjectReference createEObjectReference();

		/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	Server createServer();

		/**
	 * Returns a new object of class '<em>Startable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Startable</em>'.
	 * @generated
	 */
	Startable createStartable();

		/**
	 * Returns a new object of class '<em>Fixed Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Time Source</em>'.
	 * @generated
	 */
	FixedTimeSource createFixedTimeSource();

		/**
	 * Returns a new object of class '<em>Current Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current Time Source</em>'.
	 * @generated
	 */
	CurrentTimeSource createCurrentTimeSource();

		/**
	 * Returns a new object of class '<em>Browseable Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Browseable Time Source</em>'.
	 * @generated
	 */
	BrowseableTimeSource createBrowseableTimeSource();

		/**
	 * Returns a new object of class '<em>Selection Based Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Based Time Source</em>'.
	 * @generated
	 */
	SelectionBasedTimeSource createSelectionBasedTimeSource();

		/**
	 * Returns a new object of class '<em>Collection Timed Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Timed Time Source</em>'.
	 * @generated
	 */
	CollectionTimedTimeSource createCollectionTimedTimeSource();

		/**
	 * Returns a new object of class '<em>Feature Node Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Node Adapter</em>'.
	 * @generated
	 */
  FeatureNodeAdapter createFeatureNodeAdapter();

  /**
	 * Returns a new object of class '<em>Tree Root Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Root Node</em>'.
	 * @generated
	 */
  TreeRootNode createTreeRootNode();

  /**
	 * Returns a new object of class '<em>Tree Feature Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Feature Node</em>'.
	 * @generated
	 */
  TreeFeatureNode createTreeFeatureNode();

  /**
	 * Returns a new object of class '<em>List Root Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Root Node</em>'.
	 * @generated
	 */
  ListRootNode createListRootNode();

  /**
	 * Returns a new object of class '<em>List Feature Node</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Feature Node</em>'.
	 * @generated
	 */
  ListFeatureNode createListFeatureNode();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonEMFPackage getApogyCommonEMFPackage();

} //ApogyCommonEMFFactory
