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

import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set25 DFilter</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getCoordinatesSet25DFilter()
 * @model abstract="true"
 * @generated
 */
public interface CoordinatesSet25DFilter<T extends CoordinatesSet25D> extends Processor<T, T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	T createCoordinatesSet25D();

} // CoordinatesSet25DFilter
