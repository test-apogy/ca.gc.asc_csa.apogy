/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Point</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList <em>Points List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPoint()
 * @model
 * @generated
 */
public interface ConnectionPoint extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Points List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points List</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points List</em>' container reference.
	 * @see #setPointsList(ConnectionPointsList)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPoint_PointsList()
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPointsList#getConnectionPoints
	 * @model opposite="connectionPoints" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ConnectionPointsList getPointsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList <em>Points List</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Points List</em>' container reference.
	 * @see #getPointsList()
	 * @generated
	 */
	void setPointsList(ConnectionPointsList value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(GroupNode)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPoint_Node()
	 * @model
	 * @generated
	 */
	GroupNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(GroupNode value);

} // ConnectionPoint
