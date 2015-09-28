/**
 * Canadian Space Agency 2008.
 *
 * $Id: Startable.java,v 1.4.4.2 2015/05/21 15:50:23 pallard Exp $
 */
package ca.gc.space.mrt.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Startable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.Startable#isStarted <em>Started</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.CommonPackage#getStartable()
 * @model
 * @generated
 */
public interface Startable extends EObject
{
	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(boolean)
	 * @see ca.gc.space.mrt.common.CommonPackage#getStartable_Started()
	 * @model default="false" transient="true"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.Startable#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);

} // Startable
