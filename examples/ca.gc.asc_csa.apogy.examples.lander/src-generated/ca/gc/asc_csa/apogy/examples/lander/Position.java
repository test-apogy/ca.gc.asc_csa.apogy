package ca.gc.asc_csa.apogy.examples.lander;
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the position of an object in 3D space.
 * In particular, it provides the object's Cartesian coordinates
 * (x, y, z) as a 3x3 matrix corresponding to its current rotation
 * in all three axes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.Position#getX <em>X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.Position#getY <em>Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.Position#getZ <em>Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.Position#getAttitude <em>Attitude</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject
{
  /**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an object's X position in 3D space
	 * @see #y
	 * @see #z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage#getPosition_X()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Location' apogy_units='m'"
	 * @generated
	 */
  double getX();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
  void setX(double value);

  /**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an object's Y position in 3D space
	 * @see #x
	 * @see #z
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage#getPosition_Y()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Location' apogy_units='m'"
	 * @generated
	 */
  double getY();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
  void setY(double value);

  /**
	 * Returns the value of the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Z</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an object's Z position in 3D space
	 * @see #x
	 * @see #y
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Z</em>' attribute.
	 * @see #setZ(double)
	 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage#getPosition_Z()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Location' apogy_units='m'"
	 * @generated
	 */
  double getZ();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getZ <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Z</em>' attribute.
	 * @see #getZ()
	 * @generated
	 */
  void setZ(double value);

  /**
	 * Returns the value of the '<em><b>Attitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attitude</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is a 3x3 matrix, representing an object's rotations
	 * (if any) in all three of the primary axes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attitude</em>' attribute.
	 * @see #setAttitude(Matrix3d)
	 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage#getPosition_Attitude()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.examples.lander.Matrix3d"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Attitude'"
	 * @generated
	 */
  Matrix3d getAttitude();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.Position#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude</em>' attribute.
	 * @see #getAttitude()
	 * @generated
	 */
  void setAttitude(Matrix3d value);

} // Position
