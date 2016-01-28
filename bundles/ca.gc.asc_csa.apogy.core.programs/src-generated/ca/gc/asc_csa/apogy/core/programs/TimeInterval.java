/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.programs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.TimeInterval#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.TimeInterval#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.TimeInterval#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsPackage#getTimeInterval()
 * @model
 * @generated
 */
public interface TimeInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(long)
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsPackage#getTimeInterval_StartTime()
	 * @model unique="false"
	 * @generated
	 */
	long getStartTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.TimeInterval#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(long value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(long)
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsPackage#getTimeInterval_EndTime()
	 * @model unique="false"
	 * @generated
	 */
	long getEndTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.TimeInterval#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsPackage#getTimeInterval_Duration()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='long _endTime = this.getEndTime();\nlong _startTime = this.getStartTime();\nreturn (_endTime - _startTime);'"
	 * @generated
	 */
	long getDuration();

} // TimeInterval
