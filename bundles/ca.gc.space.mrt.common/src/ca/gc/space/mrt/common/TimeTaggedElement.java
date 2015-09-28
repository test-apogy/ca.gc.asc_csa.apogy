/**
 * Canadian Space Agency 2008.
 *
 * $Id: TimeTaggedElement.java,v 1.4.4.2 2015/05/21 15:50:23 pallard Exp $
 */
package ca.gc.space.mrt.common;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Tagged Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.TimeTaggedElement#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.CommonPackage#getTimeTaggedElement()
 * @model
 * @generated
 */
public interface TimeTaggedElement extends EObject
{
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see ca.gc.space.mrt.common.CommonPackage#getTimeTaggedElement_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.TimeTaggedElement#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

} // TimeTaggedElement
