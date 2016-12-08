/**
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
package ca.gc.asc_csa.apogy.core.environment.surface;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Triangular Mesh Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized ImageMapLayer that generate a slope map image associated with a CartesianTriangularMeshMapLayer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale <em>Auto Scale</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope <em>Minimum Slope</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope <em>Maximum Slope</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer()
 * @model
 * @generated
 */
public interface CartesianTriangularMeshSlopeImageMapLayer extends CartesianTriangularMeshDerivedImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Auto Scale</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to use autoscalling to generate the color scale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Scale</em>' attribute.
	 * @see #setAutoScale(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer_AutoScale()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	boolean isAutoScale();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#isAutoScale <em>Auto Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Scale</em>' attribute.
	 * @see #isAutoScale()
	 * @generated
	 */
	void setAutoScale(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum Slope</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum slope to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Slope</em>' attribute.
	 * @see #setMinimumSlope(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' apogy_units='deg'"
	 * @generated
	 */
	double getMinimumSlope();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMinimumSlope <em>Minimum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Slope</em>' attribute.
	 * @see #getMinimumSlope()
	 * @generated
	 */
	void setMinimumSlope(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Slope</b></em>' attribute.
	 * The default value is <code>"50.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum slope to use to generate the color scale. This is applicable only if autoScale is true.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Slope</em>' attribute.
	 * @see #setMaximumSlope(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope()
	 * @model default="50.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' apogy_units='deg'"
	 * @generated
	 */
	double getMaximumSlope();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer#getMaximumSlope <em>Maximum Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Slope</em>' attribute.
	 * @see #getMaximumSlope()
	 * @generated
	 */
	void setMaximumSlope(double value);

} // CartesianTriangularMeshSlopeImageMapLayer
