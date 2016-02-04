package ca.gc.asc_csa.apogy.core.environment;
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Discrete Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized CartesianTriangularMeshSlopeImageMapLayer that generate a slope with discrete slope intervals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer#getSlopeRanges <em>Slope Ranges</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianTriangularMeshDiscreteSlopeImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshDiscreteSlopeImageMapLayer extends CartesianTriangularMeshSlopeImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Slope Ranges</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.SlopeRange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slope Ranges</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range of slope for which to generate colors.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slope Ranges</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges()
	 * @model containment="true"
	 * @generated
	 */
	EList<SlopeRange> getSlopeRanges();

} // CartesianTriangularMeshDiscreteSlopeImageMapLayer
