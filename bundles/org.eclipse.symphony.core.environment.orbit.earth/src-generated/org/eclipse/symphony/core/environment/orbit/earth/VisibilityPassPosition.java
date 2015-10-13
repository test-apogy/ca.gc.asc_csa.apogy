/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.symphony.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Pass Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getElevation <em>Elevation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getRangeRate <em>Range Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPassPosition()
 * @model
 * @generated
 */
public interface VisibilityPassPosition extends Timed {
	/**
	 * Returns the value of the '<em><b>Azimuth</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The azimuth of the spacecraft relative to the North.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth</em>' attribute.
	 * @see #setAzimuth(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPassPosition_Azimuth()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' csa_units='rad'"
	 * @generated
	 */
	double getAzimuth();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getAzimuth <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth</em>' attribute.
	 * @see #getAzimuth()
	 * @generated
	 */
	void setAzimuth(double value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elevation of the spacecraft relative to the local horizontal plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #setElevation(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPassPosition_Elevation()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' csa_units='rad'"
	 * @generated
	 */
	double getElevation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(double value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range to the spacecraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPassPosition_Range()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' csa_units='m'"
	 * @generated
	 */
	double getRange();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(double value);

	/**
	 * Returns the value of the '<em><b>Range Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative speed of the spacecraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Rate</em>' attribute.
	 * @see #setRangeRate(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getVisibilityPassPosition_RangeRate()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' csa_units='m/s'"
	 * @generated
	 */
	double getRangeRate();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassPosition#getRangeRate <em>Range Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Rate</em>' attribute.
	 * @see #getRangeRate()
	 * @generated
	 */
	void setRangeRate(double value);

} // VisibilityPassPosition
