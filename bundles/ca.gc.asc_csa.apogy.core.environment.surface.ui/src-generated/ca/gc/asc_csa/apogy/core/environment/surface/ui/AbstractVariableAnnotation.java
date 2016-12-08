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
package ca.gc.asc_csa.apogy.core.environment.surface.ui;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;

import ca.gc.asc_csa.apogy.core.invocator.Variable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class used for MapAnnotation representing a variable on a Map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariableInstance <em>Variable Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getApogySystemApiAdapter <em>Apogy System Api Adapter</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getAbstractVariableAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractVariableAnnotation extends MapAnnotation {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Apogy System being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getAbstractVariableAnnotation_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Variable Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance of the object adapted by the Apogy System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable Instance</em>' reference.
	 * @see #setVariableInstance(EObject)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getAbstractVariableAnnotation_VariableInstance()
	 * @model transient="true"
	 * @generated
	 */
	EObject getVariableInstance();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getVariableInstance <em>Variable Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Instance</em>' reference.
	 * @see #getVariableInstance()
	 * @generated
	 */
	void setVariableInstance(EObject value);

	/**
	 * Returns the value of the '<em><b>Apogy System Api Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current instance of  ApogySystemApiAdapter handling the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apogy System Api Adapter</em>' reference.
	 * @see #setApogySystemApiAdapter(ApogySystemApiAdapter)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage#getAbstractVariableAnnotation_ApogySystemApiAdapter()
	 * @model transient="true"
	 * @generated
	 */
	ApogySystemApiAdapter getApogySystemApiAdapter();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation#getApogySystemApiAdapter <em>Apogy System Api Adapter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy System Api Adapter</em>' reference.
	 * @see #getApogySystemApiAdapter()
	 * @generated
	 */
	void setApogySystemApiAdapter(ApogySystemApiAdapter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when the pose of the variable changes.
	 * @param newPose The new pose matrix.
	 * <!-- end-model-doc -->
	 * @model newPoseUnique="false"
	 * @generated
	 */
	void updatePose(Matrix4x4 newPose);

} // AbstractVariableAnnotation
