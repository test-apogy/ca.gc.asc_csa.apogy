/**
 * <copyright>
 * </copyright>
 *
 * $Id: PhysicalBody.java,v 1.13.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

import org.eclipse.emf.common.util.EList;

import ca.gc.space.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a physical body.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getPhysicalProperties <em>Physical Properties</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getConstraintAttachmentPoints <em>Constraint Attachment Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getSimulationProperties <em>Simulation Properties</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getCenterOfMassKinematicState <em>Center Of Mass Kinematic State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getPointsOfInterest <em>Points Of Interest</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getCollisionGeometry <em>Collision Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPhysicalBody()
 * @model
 * @generated
 */
public interface PhysicalBody extends AggregateGroupNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Physical Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The physical properties of the body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Properties</em>' containment reference.
	 * @see #setPhysicalProperties(PhysicalProperties)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPhysicalBody_PhysicalProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PhysicalProperties getPhysicalProperties();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getPhysicalProperties <em>Physical Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Properties</em>' containment reference.
	 * @see #getPhysicalProperties()
	 * @generated
	 */
	void setPhysicalProperties(PhysicalProperties value);

	/**
	 * Returns the value of the '<em><b>Constraint Attachment Points</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getPhysicalBody <em>Physical Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of constraints associated with this body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Attachment Points</em>' reference list.
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPhysicalBody_ConstraintAttachmentPoints()
	 * @see ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint#getPhysicalBody
	 * @model opposite="physicalBody"
	 * @generated
	 */
	EList<ConstraintAttachmentPoint> getConstraintAttachmentPoints();

	/**
	 * Returns the value of the '<em><b>Simulation Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.topology.dynamics.AbstractPhysicalBodySimulationProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of simulation properties associated with this body. Note that this list can contain items for different implementation of Dynamic Engine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simulation Properties</em>' containment reference list.
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPhysicalBody_SimulationProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractPhysicalBodySimulationProperties> getSimulationProperties();

	/**
	 * Returns the value of the '<em><b>Center Of Mass Kinematic State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kinematic state of the center of mass of the Physical body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Center Of Mass Kinematic State</em>' containment reference.
	 * @see #setCenterOfMassKinematicState(KinematicState)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPhysicalBody_CenterOfMassKinematicState()
	 * @model containment="true"
	 * @generated
	 */
	KinematicState getCenterOfMassKinematicState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody#getCenterOfMassKinematicState <em>Center Of Mass Kinematic State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Of Mass Kinematic State</em>' containment reference.
	 * @see #getCenterOfMassKinematicState()
	 * @generated
	 */
	void setCenterOfMassKinematicState(KinematicState value);

	/**
	 * Returns the value of the '<em><b>Points Of Interest</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.topology.dynamics.PointOfInterest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of PointOfInterest currently defined for the PhysicalBody.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points Of Interest</em>' containment reference list.
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPhysicalBody_PointsOfInterest()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointOfInterest> getPointsOfInterest();

	/**
	 * Returns the value of the '<em><b>Collision Geometry</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.topology.dynamics.CollisionGeometry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of collision geometries used to defined the collision volume of the PhysicalBody.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collision Geometry</em>' containment reference list.
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getPhysicalBody_CollisionGeometry()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollisionGeometry> getCollisionGeometry();

} // PhysicalBody
