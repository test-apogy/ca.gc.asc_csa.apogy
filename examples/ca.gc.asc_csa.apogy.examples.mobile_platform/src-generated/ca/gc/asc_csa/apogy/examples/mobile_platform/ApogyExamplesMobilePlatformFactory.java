package ca.gc.asc_csa.apogy.examples.mobile_platform;
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
 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.ApogyExamplesMobilePlatformPackage
 * @generated
 */
public interface ApogyExamplesMobilePlatformFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesMobilePlatformFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.mobile_platform.impl.ApogyExamplesMobilePlatformFactoryImpl.init();

	/**
	 * Returns a new Position object, which has the same type as
	 * the given position.
	 * 
	 * @param position The position with a particular implementation. 
	 * @return The new Position instance, which has the same type as the other one.
	 * @generated_NOT
	 */
	Position makePositionSameType(Position position);
	
	/**
	 * Returns a new Mobile Platform object, which has the same type as
	 * the given platform.
	 * 
	 * @param mobilePlatform The mobile platform with a particular implementation. 
	 * @return The new mobile platform instance, which has the same type as the other one.
	 * @generated_NOT
	 */
	MobilePlatform makeMobilePlatformSameType(MobilePlatform mobilePlatform);	
	
	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Named Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Position</em>'.
	 * @generated
	 */
	NamedPosition createNamedPosition();

	/**
	 * Returns a new object of class '<em>Mobile Platform Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Stub</em>'.
	 * @generated
	 */
	MobilePlatformStub createMobilePlatformStub();

	/**
	 * Returns a new object of class '<em>Mobile Platform Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Simulated</em>'.
	 * @generated
	 */
	MobilePlatformSimulated createMobilePlatformSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesMobilePlatformPackage getApogyExamplesMobilePlatformPackage();

} //ApogyExamplesMobilePlatformFactory
