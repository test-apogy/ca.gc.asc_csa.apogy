/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class defining the material properties of a body.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractMaterial#getMaterialId <em>Material Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractMaterial()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMaterial extends EObject {
	/**
	 * Returns the value of the '<em><b>Material Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Id</em>' attribute.
	 * @see #setMaterialId(String)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractMaterial_MaterialId()
	 * @model unique="false"
	 * @generated
	 */
	String getMaterialId();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractMaterial#getMaterialId <em>Material Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Id</em>' attribute.
	 * @see #getMaterialId()
	 * @generated
	 */
	void setMaterialId(String value);

} // AbstractMaterial
