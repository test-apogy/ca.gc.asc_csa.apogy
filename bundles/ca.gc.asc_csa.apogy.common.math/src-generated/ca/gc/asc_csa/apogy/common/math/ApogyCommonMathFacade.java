package ca.gc.asc_csa.apogy.common.math;
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

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getApogyCommonMathFacade()
 * @model
 * @generated
 */
public interface ApogyCommonMathFacade extends EObject
{
	public static ApogyCommonMathFacade INSTANCE = ApogyCommonMathFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixDataType="ca.gc.asc_csa.apogy.common.math.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	Matrix4x4 createMatrix4x4(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixDataType="ca.gc.asc_csa.apogy.common.math.Matrix3d" matrixUnique="false"
	 * @generated
	 */
	Matrix3x3 createMatrix3x3(Matrix3d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" tupleDataType="ca.gc.asc_csa.apogy.common.math.VecmathTuple3d" tupleUnique="false"
	 * @generated
	 */
	Tuple3d createTuple3d(javax.vecmath.Tuple3d tuple);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	Tuple3d createTuple3d(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coeffs The coefficients of the polynomial, sorted in increasing order.\ncoeffs[n-1]*x^n-1 + coeffs[n-2]*x^n-2 + ... + coeffs[0]
	 * <!-- end-model-doc -->
	 * @model unique="false" coeffsDataType="ca.gc.asc_csa.apogy.common.math.EDoubleArray" coeffsUnique="false"
	 * @generated
	 */
	Polynomial createPolynomial(double[] coeffs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Matrix4x4 createIdentityMatrix4x4();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Matrix3x3 createIdentityMatrix3x3();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixUnique="false"
	 * @generated
	 */
	Tuple3d extractPosition(Matrix4x4 matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixUnique="false"
	 * @generated
	 */
	Tuple3d extractOrientation(Matrix4x4 matrix);

} // ApogyCommonMathFacade
