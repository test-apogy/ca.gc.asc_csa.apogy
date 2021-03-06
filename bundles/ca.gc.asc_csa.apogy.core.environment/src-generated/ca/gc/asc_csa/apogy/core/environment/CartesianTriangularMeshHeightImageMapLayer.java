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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Height Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A specialized ImageMapLayer that generate a height map image associated with a CartesianTriangularMeshMapLayer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#isAutoScale <em>Auto Scale</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight <em>Maximum Height</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshHeightImageMapLayer extends CartesianTriangularMeshDerivedImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Auto Scale</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to use autoscalling to generate the color scale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Scale</em>' attribute.
	 * @see #setAutoScale(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer_AutoScale()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	boolean isAutoScale();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#isAutoScale <em>Auto Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Scale</em>' attribute.
	 * @see #isAutoScale()
	 * @generated
	 */
	void setAutoScale(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Height</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum height to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Height</em>' attribute.
	 * @see #setMinimumHeight(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' apogy_units='m'"
	 * @generated
	 */
	double getMinimumHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMinimumHeight <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Height</em>' attribute.
	 * @see #getMinimumHeight()
	 * @generated
	 */
	void setMinimumHeight(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Height</b></em>' attribute.
	 * The default value is <code>"50.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum height to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Height</em>' attribute.
	 * @see #setMaximumHeight(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight()
	 * @model default="50.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' apogy_units='m'"
	 * @generated
	 */
	double getMaximumHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer#getMaximumHeight <em>Maximum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Height</em>' attribute.
	 * @see #getMaximumHeight()
	 * @generated
	 */
	void setMaximumHeight(double value);

} // CartesianTriangularMeshHeightImageMapLayer
