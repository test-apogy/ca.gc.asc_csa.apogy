package ca.gc.asc_csa.apogy.common.geometry.data25d;
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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.geometry.data25d.impl.ApogyCommonGeometryData25DFacadeImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getApogyCommonGeometryData25DFacade()
 * @model
 * @generated
 */
public interface ApogyCommonGeometryData25DFacade extends EObject {
	
	public static ApogyCommonGeometryData25DFacade INSTANCE = ApogyCommonGeometryData25DFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coordinates25DUnique="false"
	 * @generated
	 */
	Coordinates25D createCoordinates25D(Coordinates25D coordinates25D);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" uUnique="false" vUnique="false" wUnique="false"
	 * @generated
	 */
	Coordinates25D createCoordinates25D(double u, double v, double w);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" volumetricCoordinatesSet25DUnique="false"
	 * @generated
	 */
	<T extends VolumetricCoordinatesSet25D> CartesianCoordinatesSet createCartesianCoordinatesSet(T volumetricCoordinatesSet25D);

} // ApogyCommonGeometryData25DFacade
