/**
 */
package org.eclipse.symphony.common.emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Startable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.Startable#isStarted <em>Started</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getStartable()
 * @model
 * @generated
 */
public interface Startable extends EObject {
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
	 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getStartable_Started()
	 * @model default="false" unique="false" transient="true"
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.Startable#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);

} // Startable
