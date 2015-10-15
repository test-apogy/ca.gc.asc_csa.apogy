/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class defining a constraint between two physical bodies.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#getAttachmentPoints <em>Attachment Points</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#getSimulationProperties <em>Simulation Properties</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#getConstaintId <em>Constaint Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractConstraint()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Attachment Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintAttachmentPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.topology.addons.dynamics.ConstraintAttachmentPoint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment Points</em>' containment reference list.
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractConstraint_AttachmentPoints()
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.ConstraintAttachmentPoint#getConstraint
	 * @model opposite="constraint" containment="true"
	 * @generated
	 */
	EList<ConstraintAttachmentPoint> getAttachmentPoints();

	/**
	 * Returns the value of the '<em><b>Simulation Properties</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraintSimulationProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of simulation properties associated with this constraint.
	 * 
	 * Note that this list can contain items for different implementation of Dynamic Engine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simulation Properties</em>' reference list.
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractConstraint_SimulationProperties()
	 * @model
	 * @generated
	 */
	EList<AbstractConstraintSimulationProperties> getSimulationProperties();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual description of this contraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractConstraint_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Constaint Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constaint Id</em>' attribute.
	 * @see #setConstaintId(String)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractConstraint_ConstaintId()
	 * @model unique="false"
	 * @generated
	 */
	String getConstaintId();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#getConstaintId <em>Constaint Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constaint Id</em>' attribute.
	 * @see #getConstaintId()
	 * @generated
	 */
	void setConstaintId(String value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getAbstractConstraint_Enabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

} // AbstractConstraint
