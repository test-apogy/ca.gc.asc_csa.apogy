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

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.geometry.data3d.las.impl.ApogyCommonGeometryData3DLASFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LAS Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.las.ApogyCommonGeometryData3DLASPackage#getApogyCommonGeometryData3DLASFacade()
 * @model
 * @generated
 */
public interface ApogyCommonGeometryData3DLASFacade extends EObject {

	public static final ApogyCommonGeometryData3DLASFacade INSTANCE = ApogyCommonGeometryData3DLASFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.las.IOException" formatIDUnique="false" dataUnique="false"
	 * @generated
	 */
	LASPoint createPoint(int formatID, byte[] data) throws IOException;

} // ApogyCommonGeometryData3DLASFacade
