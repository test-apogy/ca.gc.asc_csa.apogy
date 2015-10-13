/**
 */
package org.eclipse.symphony.common.emf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Time source that provides the current time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.CurrentTimeSource#getUpdatePeriod <em>Update Period</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.CurrentTimeSource#isPaused <em>Paused</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getCurrentTimeSource()
 * @model
 * @generated
 */
public interface CurrentTimeSource extends TimeSource {
	/**
	 * Returns the value of the '<em><b>Update Period</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The update period of the time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Period</em>' attribute.
	 * @see #setUpdatePeriod(int)
	 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getCurrentTimeSource_UpdatePeriod()
	 * @model default="1000" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='ms' notify='true' property='Editable'"
	 * @generated
	 */
	int getUpdatePeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.CurrentTimeSource#getUpdatePeriod <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Period</em>' attribute.
	 * @see #getUpdatePeriod()
	 * @generated
	 */
	void setUpdatePeriod(int value);

	/**
	 * Returns the value of the '<em><b>Paused</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the time source has been paused.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paused</em>' attribute.
	 * @see #setPaused(boolean)
	 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getCurrentTimeSource_Paused()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	boolean isPaused();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.CurrentTimeSource#isPaused <em>Paused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paused</em>' attribute.
	 * @see #isPaused()
	 * @generated
	 */
	void setPaused(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pause time.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resume time update.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void resume();

} // CurrentTimeSource
