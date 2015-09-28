/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintAttachmentPoint.java,v 1.7.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Attachment Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class defining a location on a PhysicalBody where a Constraint is applied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getPhysicalBody <em>Physical Body</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getTransform <em>Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintAttachmentPoint()
 * @model
 * @generated
 */
public interface ConstraintAttachmentPoint extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Physical Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getConstraintAttachmentPoints <em>Constraint Attachment Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PhysicalBody to which the AttachmentPoint is attached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Body</em>' reference.
	 * @see #setPhysicalBody(PhysicalBody)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintAttachmentPoint_PhysicalBody()
	 * @see ca.gc.asc_csa.topology.dynamics.PhysicalBody#getConstraintAttachmentPoints
	 * @model opposite="constraintAttachmentPoints"
	 * @generated
	 */
	PhysicalBody getPhysicalBody();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getPhysicalBody <em>Physical Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Body</em>' reference.
	 * @see #getPhysicalBody()
	 * @generated
	 */
	void setPhysicalBody(PhysicalBody value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getAttachmentPoints <em>Attachment Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Constraint attached to this attachment point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' container reference.
	 * @see #setConstraint(AbstractConstraint)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintAttachmentPoint_Constraint()
	 * @see ca.gc.asc_csa.topology.dynamics.AbstractConstraint#getAttachmentPoints
	 * @model opposite="attachmentPoints" transient="false"
	 * @generated
	 */
	AbstractConstraint getConstraint();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getConstraint <em>Constraint</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' container reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(AbstractConstraint value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The transform expressiong the position of the ConstraintAttachmentPoint expressed in the PhysicalBody reference frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Matrix4x4)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintAttachmentPoint_Transform()
	 * @model containment="true"
	 * @generated
	 */
	Matrix4x4 getTransform();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Matrix4x4 value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A textual description of this ContraintAttachmentPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintAttachmentPoint_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getDescription <em>Description</em>}' attribute.
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
	 * An identifier for this ConstraintAttachmentPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getConstraintAttachmentPoint_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ConstraintAttachmentPoint
