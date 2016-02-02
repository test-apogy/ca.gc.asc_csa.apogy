package ca.gc.asc_csa.apogy.core;
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

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Positioned Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.OperationCallPositionedResult#getRelativePose <em>Relative Pose</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getOperationCallPositionedResult()
 * @model
 * @generated
 */
public interface OperationCallPositionedResult extends OperationCallResult, PositionedResult {
	/**
	 * Returns the value of the '<em><b>Relative Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pose relative to the system that produced the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relative Pose</em>' containment reference.
	 * @see #setRelativePose(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getOperationCallPositionedResult_RelativePose()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='Readonly' propertyCategory='POSITION_INFO'"
	 * @generated
	 */
	Matrix4x4 getRelativePose();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.OperationCallPositionedResult#getRelativePose <em>Relative Pose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Pose</em>' containment reference.
	 * @see #getRelativePose()
	 * @generated
	 */
	void setRelativePose(Matrix4x4 value);

} // OperationCallPositionedResult
