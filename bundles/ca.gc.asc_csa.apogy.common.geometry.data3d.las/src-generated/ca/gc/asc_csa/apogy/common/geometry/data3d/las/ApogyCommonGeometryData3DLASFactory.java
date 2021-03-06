package ca.gc.asc_csa.apogy.common.geometry.data3d.las;
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
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage
 * @generated
 */
public interface ApogyCommonGeometryData3DLASFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryData3DLASFactory eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.ApogyCommonGeometryData3DLASFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LAS Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Header</em>'.
	 * @generated
	 */
	LASHeader createLASHeader();

	/**
	 * Returns a new object of class '<em>Variable Length Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Length Record</em>'.
	 * @generated
	 */
	VariableLengthRecord createVariableLengthRecord();

	/**
	 * Returns a new object of class '<em>LAS Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Reader</em>'.
	 * @generated
	 */
	LASReader createLASReader();

	/**
	 * Returns a new object of class '<em>LAS Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Point</em>'.
	 * @generated
	 */
	LASPoint createLASPoint();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonGeometryData3DLASFacade createApogyCommonGeometryData3DLASFacade();

	/**
	 * Returns a new object of class '<em>LAS Writer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Writer</em>'.
	 * @generated
	 */
	LASWriter createLASWriter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonGeometryData3DLASPackage getApogyCommonGeometryData3DLASPackage();

} //ApogyCommonGeometryData3DLASFactory
