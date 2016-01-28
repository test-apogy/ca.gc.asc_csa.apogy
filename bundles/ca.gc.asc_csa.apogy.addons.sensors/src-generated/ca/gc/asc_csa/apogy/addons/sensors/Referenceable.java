/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.Referenceable#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage#getReferenceable()
 * @model
 * @generated
 */
public interface Referenceable extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Frame</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Frame</em>' reference.
	 * @see #setReferenceFrame(Node)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage#getReferenceable_ReferenceFrame()
	 * @model
	 * @generated
	 */
	Node getReferenceFrame();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.Referenceable#getReferenceFrame <em>Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(Node value);

} // Referenceable
