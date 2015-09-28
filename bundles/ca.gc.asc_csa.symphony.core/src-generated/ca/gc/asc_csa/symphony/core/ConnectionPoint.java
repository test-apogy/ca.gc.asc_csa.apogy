/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.space.topology.GroupNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Point</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.ConnectionPoint#getPointsList <em>Points List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.ConnectionPoint#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getConnectionPoint()
 * @model
 * @generated
 */
public interface ConnectionPoint extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Points List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points List</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points List</em>' container reference.
	 * @see #setPointsList(ConnectionPointsList)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getConnectionPoint_PointsList()
	 * @see ca.gc.asc_csa.symphony.core.ConnectionPointsList#getConnectionPoints
	 * @model opposite="connectionPoints" required="true" transient="false"
	 * @generated
	 */
	ConnectionPointsList getPointsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.ConnectionPoint#getPointsList <em>Points List</em>}' container reference.
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
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getConnectionPoint_Node()
	 * @model
	 * @generated
	 */
	GroupNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.ConnectionPoint#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(GroupNode value);

} // ConnectionPoint
