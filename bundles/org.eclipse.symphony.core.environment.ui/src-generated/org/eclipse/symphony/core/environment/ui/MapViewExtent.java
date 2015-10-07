/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getXMin <em>XMin</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getXMax <em>XMax</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getYMin <em>YMin</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getYMax <em>YMax</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getYDimension <em>YDimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewExtent()
 * @model
 * @generated
 */
public interface MapViewExtent extends EObject
{
  /**
   * Returns the value of the '<em><b>XMin</b></em>' attribute.
   * The default value is <code>"0.0"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * * Minimum X coordinate on the X axis.
   * <!-- end-model-doc -->
   * @return the value of the '<em>XMin</em>' attribute.
   * @see #setXMin(double)
   * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewExtent_XMin()
   * @model default="0.0" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES'"
   * @generated
   */
  double getXMin();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getXMin <em>XMin</em>}' attribute.
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
   * * Maximum X coordinate on the X axis.
   * <!-- end-model-doc -->
   * @return the value of the '<em>XMax</em>' attribute.
   * @see #setXMax(double)
   * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewExtent_XMax()
   * @model default="0.0" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES'"
   * @generated
   */
  double getXMax();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getXMax <em>XMax</em>}' attribute.
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
   * * Minimum X coordinate on the Y axis.
   * <!-- end-model-doc -->
   * @return the value of the '<em>YMin</em>' attribute.
   * @see #setYMin(double)
   * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewExtent_YMin()
   * @model default="0.0" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES'"
   * @generated
   */
  double getYMin();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getYMin <em>YMin</em>}' attribute.
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
   * * Maximum X coordinate on the Y axis.
   * <!-- end-model-doc -->
   * @return the value of the '<em>YMax</em>' attribute.
   * @see #setYMax(double)
   * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewExtent_YMax()
   * @model default="0.0" unique="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES'"
   * @generated
   */
  double getYMax();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.environment.ui.MapViewExtent#getYMax <em>YMax</em>}' attribute.
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
   * * Dimension along the X axis.
   * <!-- end-model-doc -->
   * @return the value of the '<em>XDimension</em>' attribute.
   * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewExtent_XDimension()
   * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EXTENT_SIZES'"
   * @generated
   */
  double getXDimension();

  /**
   * Returns the value of the '<em><b>YDimension</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * * Dimension along the Y axis.
   * <!-- end-model-doc -->
   * @return the value of the '<em>YDimension</em>' attribute.
   * @see org.eclipse.symphony.core.environment.ui.SymphonyEnvironmentUIPackage#getMapViewExtent_YDimension()
   * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EXTENT_SIZES'"
   * @generated
   */
  double getYDimension();

} // MapViewExtent
