/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to represent a position of a particular object
 * in space.  In particular, this provides both a Cartesian coordinate
 * location as well as an angle corresponding to the object's pose.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.Position#getX <em>X</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.Position#getY <em>Y</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.mobile_platform.Position#getTheta <em>Theta</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject
{
  /**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the position's X coordinate (given in metres)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(double)
	 * @see org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage#getPosition_X()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' csa_units='m'"
	 * @generated
	 */
  double getX();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.mobile_platform.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
  void setX(double value);

  /**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the position's Y coordinate (given in metres)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(double)
	 * @see org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage#getPosition_Y()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' csa_units='m'"
	 * @generated
	 */
  double getY();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.mobile_platform.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
  void setY(double value);

  /**
	 * Returns the value of the '<em><b>Theta</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Theta</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the pose angle (in radians) of an object, which
	 * specifies a rotation around the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theta</em>' attribute.
	 * @see #setTheta(double)
	 * @see org.eclipse.symphony.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage#getPosition_Theta()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' csa_units='rad'"
	 * @generated
	 */
  double getTheta();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.mobile_platform.Position#getTheta <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' attribute.
	 * @see #getTheta()
	 * @generated
	 */
  void setTheta(double value);

} // Position
