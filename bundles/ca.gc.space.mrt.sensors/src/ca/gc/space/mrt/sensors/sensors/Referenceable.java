/**
 * Canadian Space Agency 2007.
 *
 * $Id: Referenceable.java,v 1.2.4.2 2015/05/21 15:49:36 pallard Exp $
 */
package ca.gc.space.mrt.sensors.sensors;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.sensors.Referenceable#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.sensors.SensorsPackage#getReferenceable()
 * @model
 * @generated
 */
public interface Referenceable extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frame</em>' reference.
	 * @see #setReferenceFrame(Node)
	 * @see ca.gc.space.mrt.sensors.sensors.SensorsPackage#getReferenceable_ReferenceFrame()
	 * @model
	 * @generated
	 */
	Node getReferenceFrame();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.sensors.Referenceable#getReferenceFrame <em>Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(Node value);

} // Referenceable
