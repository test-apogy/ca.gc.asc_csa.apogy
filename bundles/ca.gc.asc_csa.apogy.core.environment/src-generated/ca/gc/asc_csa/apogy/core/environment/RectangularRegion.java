/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.math.Tuple3d;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a 2D rectangular region in the XY Plane.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getXMin <em>XMin</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getXMax <em>XMax</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getYMin <em>YMin</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getYMax <em>YMax</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getLowerLeftCorner <em>Lower Left Corner</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getUpperLeftCorner <em>Upper Left Corner</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getLowerRightCorner <em>Lower Right Corner</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getUpperRightCorner <em>Upper Right Corner</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion()
 * @model
 * @generated
 */
public interface RectangularRegion extends Region
{

  /**
	 * Returns the value of the '<em><b>XMin</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum X coordinate on the X axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XMin</em>' attribute.
	 * @see #setXMin(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_XMin()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' symphony_units='m'"
	 * @generated
	 */
  double getXMin();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getXMin <em>XMin</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMin</em>' attribute.
	 * @see #getXMin()
	 * @generated
	 */
  void setXMin(double value);

  /**
	 * Returns the value of the '<em><b>XMax</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum X coordinate on the X axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XMax</em>' attribute.
	 * @see #setXMax(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_XMax()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' symphony_units='m'"
	 * @generated
	 */
  double getXMax();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getXMax <em>XMax</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMax</em>' attribute.
	 * @see #getXMax()
	 * @generated
	 */
  void setXMax(double value);

  /**
	 * Returns the value of the '<em><b>YMin</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum X coordinate on the Y axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YMin</em>' attribute.
	 * @see #setYMin(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_YMin()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' symphony_units='m'"
	 * @generated
	 */
  double getYMin();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getYMin <em>YMin</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMin</em>' attribute.
	 * @see #getYMin()
	 * @generated
	 */
  void setYMin(double value);

  /**
	 * Returns the value of the '<em><b>YMax</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum X coordinate on the Y axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YMax</em>' attribute.
	 * @see #setYMax(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_YMax()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' symphony_units='m'"
	 * @generated
	 */
  double getYMax();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getYMax <em>YMax</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YMax</em>' attribute.
	 * @see #getYMax()
	 * @generated
	 */
  void setYMax(double value);

  /**
	 * Returns the value of the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimension along the X axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XDimension</em>' attribute.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_XDimension()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EXTENT_SIZES' symphony_units='m'"
	 * @generated
	 */
  double getXDimension();

  /**
	 * Returns the value of the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimension along the Y axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YDimension</em>' attribute.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_YDimension()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EXTENT_SIZES' symphony_units='m'"
	 * @generated
	 */
  double getYDimension();

  /**
	 * Returns the value of the '<em><b>Lower Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Left Corner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Left Corner</em>' reference.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_LowerLeftCorner()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  Tuple3d getLowerLeftCorner();

  /**
	 * Returns the value of the '<em><b>Upper Left Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Left Corner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Left Corner</em>' reference.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_UpperLeftCorner()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  Tuple3d getUpperLeftCorner();

  /**
	 * Returns the value of the '<em><b>Lower Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower Right Corner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Right Corner</em>' reference.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_LowerRightCorner()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  Tuple3d getLowerRightCorner();

  /**
	 * Returns the value of the '<em><b>Upper Right Corner</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Right Corner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Right Corner</em>' reference.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularRegion_UpperRightCorner()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  Tuple3d getUpperRightCorner();
} // RectangularRegion
