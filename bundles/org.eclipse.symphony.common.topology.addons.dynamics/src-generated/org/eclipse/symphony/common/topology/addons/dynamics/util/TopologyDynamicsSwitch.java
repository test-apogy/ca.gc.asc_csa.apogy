/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;

import org.eclipse.symphony.common.topology.addons.dynamics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage
 * @generated
 */
public class TopologyDynamicsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopologyDynamicsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyDynamicsSwitch() {
		if (modelPackage == null) {
			modelPackage = TopologyDynamicsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TopologyDynamicsPackage.DYNAMIC_SYSTEM_PROPERTIES: {
				DynamicSystemProperties dynamicSystemProperties = (DynamicSystemProperties)theEObject;
				T result = caseDynamicSystemProperties(dynamicSystemProperties);
				if (result == null) result = caseAggregateGroupNode(dynamicSystemProperties);
				if (result == null) result = caseGroupNode(dynamicSystemProperties);
				if (result == null) result = caseNode(dynamicSystemProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.ABSTRACT_DYNAMICS_ENGINE: {
				AbstractDynamicsEngine abstractDynamicsEngine = (AbstractDynamicsEngine)theEObject;
				T result = caseAbstractDynamicsEngine(abstractDynamicsEngine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.PHYSICAL_BODY: {
				PhysicalBody physicalBody = (PhysicalBody)theEObject;
				T result = casePhysicalBody(physicalBody);
				if (result == null) result = caseAggregateGroupNode(physicalBody);
				if (result == null) result = caseGroupNode(physicalBody);
				if (result == null) result = caseNode(physicalBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.PHYSICAL_PROPERTIES: {
				PhysicalProperties physicalProperties = (PhysicalProperties)theEObject;
				T result = casePhysicalProperties(physicalProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.ABSTRACT_PHYSICAL_BODY_SIMULATION_PROPERTIES: {
				AbstractPhysicalBodySimulationProperties abstractPhysicalBodySimulationProperties = (AbstractPhysicalBodySimulationProperties)theEObject;
				T result = caseAbstractPhysicalBodySimulationProperties(abstractPhysicalBodySimulationProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT_SIMULATION_PROPERTIES: {
				AbstractConstraintSimulationProperties abstractConstraintSimulationProperties = (AbstractConstraintSimulationProperties)theEObject;
				T result = caseAbstractConstraintSimulationProperties(abstractConstraintSimulationProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.ABSTRACT_COLLISION_GEOMETRY_SIMULATION_PROPERTIES: {
				AbstractCollisionGeometrySimulationProperties abstractCollisionGeometrySimulationProperties = (AbstractCollisionGeometrySimulationProperties)theEObject;
				T result = caseAbstractCollisionGeometrySimulationProperties(abstractCollisionGeometrySimulationProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.POINT_OF_INTEREST: {
				PointOfInterest pointOfInterest = (PointOfInterest)theEObject;
				T result = casePointOfInterest(pointOfInterest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.KINEMATIC_STATE: {
				KinematicState kinematicState = (KinematicState)theEObject;
				T result = caseKinematicState(kinematicState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.CONSTRAINT_STATE: {
				ConstraintState constraintState = (ConstraintState)theEObject;
				T result = caseConstraintState(constraintState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.ABSTRACT_CONSTRAINT: {
				AbstractConstraint abstractConstraint = (AbstractConstraint)theEObject;
				T result = caseAbstractConstraint(abstractConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT: {
				CylindricalConstraint cylindricalConstraint = (CylindricalConstraint)theEObject;
				T result = caseCylindricalConstraint(cylindricalConstraint);
				if (result == null) result = caseAbstractConstraint(cylindricalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.GEAR_RATIO_CONSTRAINT: {
				GearRatioConstraint gearRatioConstraint = (GearRatioConstraint)theEObject;
				T result = caseGearRatioConstraint(gearRatioConstraint);
				if (result == null) result = caseAbstractConstraint(gearRatioConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.HINGE_CONSTRAINT: {
				HingeConstraint hingeConstraint = (HingeConstraint)theEObject;
				T result = caseHingeConstraint(hingeConstraint);
				if (result == null) result = caseAbstractConstraint(hingeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.PRISMATIC_CONSTRAINT: {
				PrismaticConstraint prismaticConstraint = (PrismaticConstraint)theEObject;
				T result = casePrismaticConstraint(prismaticConstraint);
				if (result == null) result = caseAbstractConstraint(prismaticConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.RPRO_CONSTRAINT: {
				RPROConstraint rproConstraint = (RPROConstraint)theEObject;
				T result = caseRPROConstraint(rproConstraint);
				if (result == null) result = caseAbstractConstraint(rproConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.UNIVERSAL_CONSTRAINT: {
				UniversalConstraint universalConstraint = (UniversalConstraint)theEObject;
				T result = caseUniversalConstraint(universalConstraint);
				if (result == null) result = caseAbstractConstraint(universalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.CONSTRAINT_ATTACHMENT_POINT: {
				ConstraintAttachmentPoint constraintAttachmentPoint = (ConstraintAttachmentPoint)theEObject;
				T result = caseConstraintAttachmentPoint(constraintAttachmentPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.COLLISION_GEOMETRY: {
				CollisionGeometry collisionGeometry = (CollisionGeometry)theEObject;
				T result = caseCollisionGeometry(collisionGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.ABSTRACT_MATERIAL: {
				AbstractMaterial abstractMaterial = (AbstractMaterial)theEObject;
				T result = caseAbstractMaterial(abstractMaterial);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.GEOMETRY: {
				Geometry geometry = (Geometry)theEObject;
				T result = caseGeometry(geometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.BOX_GEOMETRY: {
				BoxGeometry boxGeometry = (BoxGeometry)theEObject;
				T result = caseBoxGeometry(boxGeometry);
				if (result == null) result = caseGeometry(boxGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.CAPSULE_GEOMETRY: {
				CapsuleGeometry capsuleGeometry = (CapsuleGeometry)theEObject;
				T result = caseCapsuleGeometry(capsuleGeometry);
				if (result == null) result = caseGeometry(capsuleGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.CYLINDER_GEOMETRY: {
				CylinderGeometry cylinderGeometry = (CylinderGeometry)theEObject;
				T result = caseCylinderGeometry(cylinderGeometry);
				if (result == null) result = caseGeometry(cylinderGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.SPHERE_GEOMETRY: {
				SphereGeometry sphereGeometry = (SphereGeometry)theEObject;
				T result = caseSphereGeometry(sphereGeometry);
				if (result == null) result = caseGeometry(sphereGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TopologyDynamicsPackage.DYNAMICS_FACADE: {
				DynamicsFacade dynamicsFacade = (DynamicsFacade)theEObject;
				T result = caseDynamicsFacade(dynamicsFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic System Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic System Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicSystemProperties(DynamicSystemProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Dynamics Engine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Dynamics Engine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDynamicsEngine(AbstractDynamicsEngine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalBody(PhysicalBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalProperties(PhysicalProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Physical Body Simulation Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Physical Body Simulation Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPhysicalBodySimulationProperties(AbstractPhysicalBodySimulationProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Constraint Simulation Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Constraint Simulation Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConstraintSimulationProperties(AbstractConstraintSimulationProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Collision Geometry Simulation Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Collision Geometry Simulation Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCollisionGeometrySimulationProperties(AbstractCollisionGeometrySimulationProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Of Interest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Of Interest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointOfInterest(PointOfInterest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kinematic State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kinematic State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKinematicState(KinematicState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintState(ConstraintState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConstraint(AbstractConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylindrical Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylindrical Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylindricalConstraint(CylindricalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gear Ratio Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gear Ratio Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGearRatioConstraint(GearRatioConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hinge Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hinge Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHingeConstraint(HingeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prismatic Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prismatic Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrismaticConstraint(PrismaticConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPRO Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPRO Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPROConstraint(RPROConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universal Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universal Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversalConstraint(UniversalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Attachment Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Attachment Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintAttachmentPoint(ConstraintAttachmentPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collision Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collision Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollisionGeometry(CollisionGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Material</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Material</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMaterial(AbstractMaterial object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometry(Geometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Box Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Box Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoxGeometry(BoxGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capsule Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capsule Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapsuleGeometry(CapsuleGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinderGeometry(CylinderGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sphere Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sphere Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSphereGeometry(SphereGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamics Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamics Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicsFacade(DynamicsFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupNode(GroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TopologyDynamicsSwitch
