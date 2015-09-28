/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.mobile_platform;

import ca.gc.asc_csa.symphony.core.SymphonyInitializationData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobile Platform Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specifies the initialization data that Symphony
 * should be interested in when (re)initializing the Mobile
 * platform with the API Adapter (which in this case is
 * {@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformSymphonySystemApiAdapter})
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#getAngularVelocity <em>Angular Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.examples.mobile_platform.SymphonyExampleMobilePlatformPackage#getMobilePlatformData()
 * @model
 * @generated
 */
public interface MobilePlatformData extends SymphonyInitializationData {
	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the mobile platform should be
	 * initialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.symphony.examples.mobile_platform.SymphonyExampleMobilePlatformPackage#getMobilePlatformData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the mobile platform should be
	 * disposed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see ca.gc.asc_csa.symphony.examples.mobile_platform.SymphonyExampleMobilePlatformPackage#getMobilePlatformData_Disposed()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isDisposed();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);

	/**
	 * Returns the value of the '<em><b>Linear Velocity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the linear velocity that the mobile platform
	 * should have.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linear Velocity</em>' attribute.
	 * @see #setLinearVelocity(double)
	 * @see ca.gc.asc_csa.symphony.examples.mobile_platform.SymphonyExampleMobilePlatformPackage#getMobilePlatformData_LinearVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m/s' children='false' notify='true' property='Editable' propertyCategory='Velocities'"
	 * @generated
	 */
	double getLinearVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#getLinearVelocity <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Velocity</em>' attribute.
	 * @see #getLinearVelocity()
	 * @generated
	 */
	void setLinearVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Angular Velocity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angular velocity that the mobile platform
	 * should have.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angular Velocity</em>' attribute.
	 * @see #setAngularVelocity(double)
	 * @see ca.gc.asc_csa.symphony.examples.mobile_platform.SymphonyExampleMobilePlatformPackage#getMobilePlatformData_AngularVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad/s' children='false' notify='true' property='Editable' propertyCategory='Velocities'"
	 * @generated
	 */
	double getAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.mobile_platform.MobilePlatformData#getAngularVelocity <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Velocity</em>' attribute.
	 * @see #getAngularVelocity()
	 * @generated
	 */
	void setAngularVelocity(double value);

} // MobilePlatformData
