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

import javax.vecmath.Color3f;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Of Sight Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized CartesianTriangularMeshDerivedImageMapLayer that generate a image showing wether or not line of sight is present
 * between a point above the mesh and a specified fixed location.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightAvailableColor <em>Line Of Sight Available Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightNotAvailableColor <em>Line Of Sight Not Available Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getObserverPose <em>Observer Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getTargetHeightAboveGround <em>Target Height Above Ground</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#isUseHeightPerpendicularToGround <em>Use Height Perpendicular To Ground</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getLineOfSightImageMapLayer()
 * @model
 * @generated
 */
public interface LineOfSightImageMapLayer extends CartesianTriangularMeshDerivedImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Line Of Sight Available Color</b></em>' attribute.
	 * The default value is <code>"0.0,1.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Of Sight Available Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color to use to mark line of sigh is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Of Sight Available Color</em>' attribute.
	 * @see #setLineOfSightAvailableColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getLineOfSightImageMapLayer_LineOfSightAvailableColor()
	 * @model default="0.0,1.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	Color3f getLineOfSightAvailableColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightAvailableColor <em>Line Of Sight Available Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Of Sight Available Color</em>' attribute.
	 * @see #getLineOfSightAvailableColor()
	 * @generated
	 */
	void setLineOfSightAvailableColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Line Of Sight Not Available Color</b></em>' attribute.
	 * The default value is <code>"1.0,0.0,0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Of Sight Not Available Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Color to use to mark line of sigh is NOT available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Of Sight Not Available Color</em>' attribute.
	 * @see #setLineOfSightNotAvailableColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getLineOfSightImageMapLayer_LineOfSightNotAvailableColor()
	 * @model default="1.0,0.0,0.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	Color3f getLineOfSightNotAvailableColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getLineOfSightNotAvailableColor <em>Line Of Sight Not Available Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Of Sight Not Available Color</em>' attribute.
	 * @see #getLineOfSightNotAvailableColor()
	 * @generated
	 */
	void setLineOfSightNotAvailableColor(Color3f value);

	/**
	 * Returns the value of the '<em><b>Observer Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The pose of the observer with which we want line of sight.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observer Pose</em>' containment reference.
	 * @see #setObserverPose(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getLineOfSightImageMapLayer_ObserverPose()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	Matrix4x4 getObserverPose();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getObserverPose <em>Observer Pose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observer Pose</em>' containment reference.
	 * @see #getObserverPose()
	 * @generated
	 */
	void setObserverPose(Matrix4x4 value);

	/**
	 * Returns the value of the '<em><b>Target Height Above Ground</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The height of target above ground.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Height Above Ground</em>' attribute.
	 * @see #setTargetHeightAboveGround(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getLineOfSightImageMapLayer_TargetHeightAboveGround()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS' apogy_units='m'"
	 * @generated
	 */
	double getTargetHeightAboveGround();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#getTargetHeightAboveGround <em>Target Height Above Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Height Above Ground</em>' attribute.
	 * @see #getTargetHeightAboveGround()
	 * @generated
	 */
	void setTargetHeightAboveGround(double value);

	/**
	 * Returns the value of the '<em><b>Use Height Perpendicular To Ground</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Height Perpendicular To Ground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not find each target position using the local normal.
	 * Using the local normal requires more processing time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Height Perpendicular To Ground</em>' attribute.
	 * @see #setUseHeightPerpendicularToGround(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getLineOfSightImageMapLayer_UseHeightPerpendicularToGround()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='IMAGE_GENERATION_SETTINGS'"
	 * @generated
	 */
	boolean isUseHeightPerpendicularToGround();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer#isUseHeightPerpendicularToGround <em>Use Height Perpendicular To Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Height Perpendicular To Ground</em>' attribute.
	 * @see #isUseHeightPerpendicularToGround()
	 * @generated
	 */
	void setUseHeightPerpendicularToGround(boolean value);

} // LineOfSightImageMapLayer
