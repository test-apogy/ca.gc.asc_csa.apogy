/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Volume Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZMin <em>ZMin</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZMax <em>ZMax</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZDimension <em>ZDimension</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularVolumeRegion()
 * @model
 * @generated
 */
public interface RectangularVolumeRegion extends RectangularRegion {
	/**
	 * Returns the value of the '<em><b>ZMin</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Minimum Z coordinate on the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZMin</em>' attribute.
	 * @see #setZMin(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularVolumeRegion_ZMin()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' symphony_units='m'"
	 * @generated
	 */
	double getZMin();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZMin <em>ZMin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZMin</em>' attribute.
	 * @see #getZMin()
	 * @generated
	 */
	void setZMin(double value);

	/**
	 * Returns the value of the '<em><b>ZMax</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum Z coordinate on the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZMax</em>' attribute.
	 * @see #setZMax(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularVolumeRegion_ZMax()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='EXTENT_COORDINATES' symphony_units='m'"
	 * @generated
	 */
	double getZMax();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZMax <em>ZMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZMax</em>' attribute.
	 * @see #getZMax()
	 * @generated
	 */
	void setZMax(double value);

	/**
	 * Returns the value of the '<em><b>ZDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimension along the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZDimension</em>' attribute.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getRectangularVolumeRegion_ZDimension()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EXTENT_SIZES' symphony_units='m'"
	 * @generated
	 */
	double getZDimension();

} // RectangularVolumeRegion
