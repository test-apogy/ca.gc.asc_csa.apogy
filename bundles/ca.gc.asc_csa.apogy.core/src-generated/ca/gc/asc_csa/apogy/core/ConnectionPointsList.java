/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

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
 *   <li>{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getApogySystem <em>Apogy System</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPointsList()
 * @model
 * @generated
 */
public interface ConnectionPointsList extends EObject {
	/**
	 * Returns the value of the '<em><b>Apogy System</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.ApogySystem#getConnectionPointsList <em>Connection Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apogy System</em>' container reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apogy System</em>' container reference.
	 * @see #setApogySystem(ApogySystem)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPointsList_ApogySystem()
	 * @see ca.gc.asc_csa.apogy.core.ApogySystem#getConnectionPointsList
	 * @model opposite="connectionPointsList" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ApogySystem getApogySystem();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getApogySystem <em>Apogy System</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy System</em>' container reference.
	 * @see #getApogySystem()
	 * @generated
	 */
	void setApogySystem(ApogySystem value);

	/**
	 * Returns the value of the '<em><b>Connection Points</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.ConnectionPoint}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList <em>Points List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Points</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Points</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPointsList_ConnectionPoints()
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList
	 * @model opposite="pointsList" containment="true"
	 * @generated
	 */
	EList<ConnectionPoint> getConnectionPoints();

} // ConnectionPointsList
