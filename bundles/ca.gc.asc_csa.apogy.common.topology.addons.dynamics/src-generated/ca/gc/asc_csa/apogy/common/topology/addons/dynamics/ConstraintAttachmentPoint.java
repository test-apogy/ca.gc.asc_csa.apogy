/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

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
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPhysicalBody <em>Physical Body</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getTransform <em>Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPointId <em>Point Id</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getConstraintAttachmentPoint()
 * @model
 * @generated
 */
public interface ConstraintAttachmentPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical Body</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getConstraintAttachmentPoints <em>Constraint Attachment Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PhysicalBody to which the AttachmentPoint is attached.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Body</em>' reference.
	 * @see #setPhysicalBody(PhysicalBody)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getConstraintAttachmentPoint_PhysicalBody()
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody#getConstraintAttachmentPoints
	 * @model opposite="constraintAttachmentPoints"
	 * @generated
	 */
	PhysicalBody getPhysicalBody();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPhysicalBody <em>Physical Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Body</em>' reference.
	 * @see #getPhysicalBody()
	 * @generated
	 */
	void setPhysicalBody(PhysicalBody value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getAttachmentPoints <em>Attachment Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Constraint attached to this attachment point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' container reference.
	 * @see #setConstraint(AbstractConstraint)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getConstraintAttachmentPoint_Constraint()
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint#getAttachmentPoints
	 * @model opposite="attachmentPoints" transient="false"
	 * @generated
	 */
	AbstractConstraint getConstraint();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getConstraint <em>Constraint</em>}' container reference.
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
	 * The transform expressing the position of the ConstraintAttachmentPoint
	 * expressed in the PhysicalBody reference frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getConstraintAttachmentPoint_Transform()
	 * @model containment="true"
	 * @generated
	 */
	Matrix4x4 getTransform();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getTransform <em>Transform</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getConstraintAttachmentPoint_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Point Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier for this ConstraintAttachmentPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Id</em>' attribute.
	 * @see #setPointId(String)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getConstraintAttachmentPoint_PointId()
	 * @model unique="false"
	 * @generated
	 */
	String getPointId();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint#getPointId <em>Point Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Id</em>' attribute.
	 * @see #getPointId()
	 * @generated
	 */
	void setPointId(String value);

} // ConstraintAttachmentPoint
