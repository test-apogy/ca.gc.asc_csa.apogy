package ca.gc.asc_csa.apogy.common.geometry.data;
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
 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage
 * @generated
 */
public interface ApogyCommonGeometryDataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryDataFactory eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data.impl.ApogyCommonGeometryDataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates</em>'.
	 * @generated
	 */
	Coordinates createCoordinates();

	/**
	 * Returns a new object of class '<em>Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates Set</em>'.
	 * @generated
	 */
	<T extends Coordinates> CoordinatesSet<T> createCoordinatesSet();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	<T extends Coordinates> Polygon<T> createPolygon();

	/**
	 * Returns a new object of class '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh</em>'.
	 * @generated
	 */
	<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Mesh<CoordinatesType, PolygonType> createMesh();

	/**
	 * Returns a new object of class '<em>Coordinates Set Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates Set Shapes Sampler</em>'.
	 * @generated
	 */
	<T extends Coordinates> CoordinatesSetShapesSampler<T> createCoordinatesSetShapesSampler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonGeometryDataPackage getApogyCommonGeometryDataPackage();

} //ApogyCommonGeometryDataFactory
