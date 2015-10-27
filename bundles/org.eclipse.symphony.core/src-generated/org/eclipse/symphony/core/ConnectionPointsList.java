/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Points List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ConnectionPointsList#getSymphonySystem <em>Symphony System</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.Symphony__CorePackage#getConnectionPointsList()
 * @model
 * @generated
 */
public interface ConnectionPointsList extends EObject {
	/**
	 * Returns the value of the '<em><b>Symphony System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.SymphonySystem#getConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symphony System</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symphony System</em>' container reference.
	 * @see #setSymphonySystem(SymphonySystem)
	 * @see org.eclipse.symphony.core.Symphony__CorePackage#getConnectionPointsList_SymphonySystem()
	 * @see org.eclipse.symphony.core.SymphonySystem#getConnectionPointsList
	 * @model opposite="connectionPointsList" required="true" transient="false"
	 * @generated
	 */
	SymphonySystem getSymphonySystem();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ConnectionPointsList#getSymphonySystem <em>Symphony System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symphony System</em>' container reference.
	 * @see #getSymphonySystem()
	 * @generated
	 */
	void setSymphonySystem(SymphonySystem value);

	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.ConnectionPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.ConnectionPoint#getPointsList <em>Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Points</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' containment reference list.
	 * @see org.eclipse.symphony.core.Symphony__CorePackage#getConnectionPointsList_ConnectionPoints()
	 * @see org.eclipse.symphony.core.ConnectionPoint#getPointsList
	 * @model opposite="pointsList" containment="true"
	 * @generated
	 */
	EList<ConnectionPoint> getConnectionPoints();

} // ConnectionPointsList
