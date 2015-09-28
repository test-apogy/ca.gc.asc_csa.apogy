/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractConstraint.java,v 1.12.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

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
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getAttachmentPoints <em>Attachment Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getSimulationProperties <em>Simulation Properties</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getId <em>Id</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#isEnabled <em>Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getAbstractConstraint()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstraint extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Attachment Points</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment Points</em>' containment reference list.
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getAbstractConstraint_AttachmentPoints()
	 * @see ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getConstraint
	 * @model opposite="constraint" containment="true"
	 * @generated
	 */
	EList<ConstraintAttachmentPoint> getAttachmentPoints();

	/**
	 * Returns the value of the '<em><b>Simulation Properties</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.topology.dynamics.AbstractConstraintSimulationProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of simulation properties associated with this constraint. Note that this list can contain items for different implementation of Dynamic Engine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simulation Properties</em>' reference list.
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getAbstractConstraint_SimulationProperties()
	 * @model
	 * @generated
	 */
	EList<AbstractConstraintSimulationProperties> getSimulationProperties();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual description of this contraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getAbstractConstraint_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for the constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getAbstractConstraint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getAbstractConstraint_Enabled()
	 * @model default="false"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);
} // AbstractConstraint
