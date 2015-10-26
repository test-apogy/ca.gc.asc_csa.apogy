/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander;

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
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.lander.Position#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.Position#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.Position#getZ <em>Z</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.Position#getAttitude <em>Attitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage#getPosition()
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
	 * @see org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage#getPosition_X()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Location' csa_units='m'"
	 * @generated
	 */
  double getX();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.Position#getX <em>X</em>}' attribute.
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
	 * @see org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage#getPosition_Y()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Location' csa_units='m'"
	 * @generated
	 */
  double getY();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.Position#getY <em>Y</em>}' attribute.
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
	 * @see org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage#getPosition_Z()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Location' csa_units='m'"
	 * @generated
	 */
  double getZ();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.Position#getZ <em>Z</em>}' attribute.
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
	 * @see org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage#getPosition_Attitude()
	 * @model unique="false" dataType="org.eclipse.symphony.examples.lander.Matrix3d"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Attitude'"
	 * @generated
	 */
  Matrix3d getAttitude();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.Position#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude</em>' attribute.
	 * @see #getAttitude()
	 * @generated
	 */
  void setAttitude(Matrix3d value);

} // Position
