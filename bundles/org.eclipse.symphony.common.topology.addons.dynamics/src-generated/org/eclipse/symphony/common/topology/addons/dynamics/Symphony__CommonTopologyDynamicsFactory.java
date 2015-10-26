/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage
 * @generated
 */
public interface Symphony__CommonTopologyDynamicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CommonTopologyDynamicsFactory eINSTANCE = org.eclipse.symphony.common.topology.addons.dynamics.impl.Symphony__CommonTopologyDynamicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dynamic System Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic System Properties</em>'.
	 * @generated
	 */
	DynamicSystemProperties createDynamicSystemProperties();

	/**
	 * Returns a new object of class '<em>Physical Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Body</em>'.
	 * @generated
	 */
	PhysicalBody createPhysicalBody();

	/**
	 * Returns a new object of class '<em>Physical Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Properties</em>'.
	 * @generated
	 */
	PhysicalProperties createPhysicalProperties();

	/**
	 * Returns a new object of class '<em>Point Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Of Interest</em>'.
	 * @generated
	 */
	PointOfInterest createPointOfInterest();

	/**
	 * Returns a new object of class '<em>Kinematic State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kinematic State</em>'.
	 * @generated
	 */
	KinematicState createKinematicState();

	/**
	 * Returns a new object of class '<em>Constraint State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint State</em>'.
	 * @generated
	 */
	ConstraintState createConstraintState();

	/**
	 * Returns a new object of class '<em>Cylindrical Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cylindrical Constraint</em>'.
	 * @generated
	 */
	CylindricalConstraint createCylindricalConstraint();

	/**
	 * Returns a new object of class '<em>Gear Ratio Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gear Ratio Constraint</em>'.
	 * @generated
	 */
	GearRatioConstraint createGearRatioConstraint();

	/**
	 * Returns a new object of class '<em>Hinge Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hinge Constraint</em>'.
	 * @generated
	 */
	HingeConstraint createHingeConstraint();

	/**
	 * Returns a new object of class '<em>Prismatic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prismatic Constraint</em>'.
	 * @generated
	 */
	PrismaticConstraint createPrismaticConstraint();

	/**
	 * Returns a new object of class '<em>RPRO Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPRO Constraint</em>'.
	 * @generated
	 */
	RPROConstraint createRPROConstraint();

	/**
	 * Returns a new object of class '<em>Universal Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universal Constraint</em>'.
	 * @generated
	 */
	UniversalConstraint createUniversalConstraint();

	/**
	 * Returns a new object of class '<em>Constraint Attachment Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Attachment Point</em>'.
	 * @generated
	 */
	ConstraintAttachmentPoint createConstraintAttachmentPoint();

	/**
	 * Returns a new object of class '<em>Collision Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collision Geometry</em>'.
	 * @generated
	 */
	CollisionGeometry createCollisionGeometry();

	/**
	 * Returns a new object of class '<em>Box Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box Geometry</em>'.
	 * @generated
	 */
	BoxGeometry createBoxGeometry();

	/**
	 * Returns a new object of class '<em>Capsule Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capsule Geometry</em>'.
	 * @generated
	 */
	CapsuleGeometry createCapsuleGeometry();

	/**
	 * Returns a new object of class '<em>Cylinder Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cylinder Geometry</em>'.
	 * @generated
	 */
	CylinderGeometry createCylinderGeometry();

	/**
	 * Returns a new object of class '<em>Sphere Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sphere Geometry</em>'.
	 * @generated
	 */
	SphereGeometry createSphereGeometry();

	/**
	 * Returns a new object of class '<em>Dynamics Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamics Facade</em>'.
	 * @generated
	 */
	DynamicsFacade createDynamicsFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CommonTopologyDynamicsPackage getSymphony__CommonTopologyDynamicsPackage();

} //Symphony__CommonTopologyDynamicsFactory
