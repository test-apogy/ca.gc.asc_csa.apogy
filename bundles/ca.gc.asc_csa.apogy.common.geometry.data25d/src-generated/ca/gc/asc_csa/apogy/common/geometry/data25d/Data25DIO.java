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

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getData25DIO()
 * @model
 * @generated
 */
public interface Data25DIO extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data25d.IOException" pointsUnique="false" fileNameUnique="false"
	 * @generated
	 */
	void saveXYZ(VolumetricCoordinatesSet25D points, String fileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data25d.IOException" fileNameUnique="false"
	 * @generated
	 */
	VolumetricCoordinatesSet25D loadXYZ(String fileName) throws IOException;

} // Data25DIO
