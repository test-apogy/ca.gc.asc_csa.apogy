package ca.gc.asc_csa.apogy.core.environment.ui;
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pose Variable Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * AbstractVariableAnnotation that shows the position and orientation of a variable on a Map.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation#getVectorlength <em>Vectorlength</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation#getVectorColor <em>Vector Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation#isShowPose <em>Show Pose</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getPoseVariableAnnotation()
 * @model
 * @generated
 */
public interface PoseVariableAnnotation extends AbstractVariableAnnotation
{
  /**
	 * Returns the value of the '<em><b>Vectorlength</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The length of the vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vectorlength</em>' attribute.
	 * @see #setVectorlength(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getPoseVariableAnnotation_Vectorlength()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VECTOR_PROPERTIES' apogy_units='m'"
	 * @generated
	 */
  double getVectorlength();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation#getVectorlength <em>Vectorlength</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectorlength</em>' attribute.
	 * @see #getVectorlength()
	 * @generated
	 */
  void setVectorlength(double value);

  /**
	 * Returns the value of the '<em><b>Vector Color</b></em>' attribute.
	 * The default value is <code>"0.0,0.0,1.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The color of the vector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vector Color</em>' attribute.
	 * @see #setVectorColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getPoseVariableAnnotation_VectorColor()
	 * @model default="0.0,0.0,1.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.ui.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VECTOR_PROPERTIES'"
	 * @generated
	 */
  Color3f getVectorColor();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation#getVectorColor <em>Vector Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector Color</em>' attribute.
	 * @see #getVectorColor()
	 * @generated
	 */
  void setVectorColor(Color3f value);

  /**
	 * Returns the value of the '<em><b>Show Pose</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show the pose as text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Pose</em>' attribute.
	 * @see #setShowPose(boolean)
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getPoseVariableAnnotation_ShowPose()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isShowPose();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation#isShowPose <em>Show Pose</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Pose</em>' attribute.
	 * @see #isShowPose()
	 * @generated
	 */
  void setShowPose(boolean value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when the position or orientation of the variable changes.
	 * @param x The x coordinates, in meters.
	 * @param y The y coordinates, in meters.
	 * @param zRotation The azimuth, in radians.
	 * <!-- end-model-doc -->
	 * @model xUnique="false"
	 *        xAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'" yUnique="false"
	 *        yAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'" zRotationUnique="false"
	 *        zRotationAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	void updatePose(double x, double y, double zRotation);

} // PoseVariableAnnotation
