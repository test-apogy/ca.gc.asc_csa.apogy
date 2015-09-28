/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Browseable Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Time source that provides an accelerated time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getUpdatePeriod <em>Update Period</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getTimeAcceration <em>Time Acceration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getTimeDirection <em>Time Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getBrowseableTimeSource()
 * @model
 * @generated
 */
public interface BrowseableTimeSource extends TimeSource {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start time. Default to current time upon creation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getBrowseableTimeSource_StartTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getBrowseableTimeSource_UpdatePeriod()
	 * @model default="1000" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='ms' notify='true' property='Editable'"
	 * @generated
	 */
	int getUpdatePeriod();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getUpdatePeriod <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Period</em>' attribute.
	 * @see #getUpdatePeriod()
	 * @generated
	 */
	void setUpdatePeriod(int value);

	/**
	 * Returns the value of the '<em><b>Time Acceration</b></em>' attribute.
	 * The default value is <code>"10.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time acceleration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Acceration</em>' attribute.
	 * @see #setTimeAcceration(float)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getBrowseableTimeSource_TimeAcceration()
	 * @model default="10.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	float getTimeAcceration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getTimeAcceration <em>Time Acceration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Acceration</em>' attribute.
	 * @see #getTimeAcceration()
	 * @generated
	 */
	void setTimeAcceration(float value);

	/**
	 * Returns the value of the '<em><b>Time Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.eclipse.emf.ecore.TimeDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Direction</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.TimeDirection
	 * @see #setTimeDirection(TimeDirection)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getBrowseableTimeSource_TimeDirection()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	TimeDirection getTimeDirection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource#getTimeDirection <em>Time Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Direction</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.TimeDirection
	 * @see #getTimeDirection()
	 * @generated
	 */
	void setTimeDirection(TimeDirection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plays time forward.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void playForward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plays time in reverse.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void playReverse();

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
	 * Reset the time to the start time
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void reset();

} // BrowseableTimeSource
