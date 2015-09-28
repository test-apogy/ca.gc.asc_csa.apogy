/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyDynamicsAdapterFactory.java,v 1.24.2.3 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.topology.dynamics.AbstractCollisionGeometrySimulationProperties;
import ca.gc.asc_csa.topology.dynamics.AbstractConstraint;
import ca.gc.asc_csa.topology.dynamics.AbstractConstraintSimulationProperties;
import ca.gc.asc_csa.topology.dynamics.AbstractDynamicsEngine;
import ca.gc.asc_csa.topology.dynamics.AbstractMaterial;
import ca.gc.asc_csa.topology.dynamics.AbstractPhysicalBodySimulationProperties;
import ca.gc.asc_csa.topology.dynamics.BoxGeometry;
import ca.gc.asc_csa.topology.dynamics.CapsuleGeometry;
import ca.gc.asc_csa.topology.dynamics.CollisionGeometry;
import ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint;
import ca.gc.asc_csa.topology.dynamics.ConstraintState;
import ca.gc.asc_csa.topology.dynamics.CylinderGeometry;
import ca.gc.asc_csa.topology.dynamics.CylindricalConstraint;
import ca.gc.asc_csa.topology.dynamics.DynamicSystemProperties;
import ca.gc.asc_csa.topology.dynamics.DynamicsFacade;
import ca.gc.asc_csa.topology.dynamics.GearRatioConstraint;
import ca.gc.asc_csa.topology.dynamics.Geometry;
import ca.gc.asc_csa.topology.dynamics.HingeConstraint;
import ca.gc.asc_csa.topology.dynamics.KinematicState;
import ca.gc.asc_csa.topology.dynamics.PhysicalBody;
import ca.gc.asc_csa.topology.dynamics.PhysicalProperties;
import ca.gc.asc_csa.topology.dynamics.PointOfInterest;
import ca.gc.asc_csa.topology.dynamics.PrismaticConstraint;
import ca.gc.asc_csa.topology.dynamics.RPROConstraint;
import ca.gc.asc_csa.topology.dynamics.SphereGeometry;
import ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage;
import ca.gc.asc_csa.topology.dynamics.UniversalConstraint;
import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.GroupNode;
import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage
 * @generated
 */
public class TopologyDynamicsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyrights Canadian Space Agency 2012.";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TopologyDynamicsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyDynamicsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TopologyDynamicsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyDynamicsSwitch<Adapter> modelSwitch =
		new TopologyDynamicsSwitch<Adapter>() {
			@Override
			public Adapter caseDynamicSystemProperties(DynamicSystemProperties object) {
				return createDynamicSystemPropertiesAdapter();
			}
			@Override
			public Adapter caseAbstractDynamicsEngine(AbstractDynamicsEngine object) {
				return createAbstractDynamicsEngineAdapter();
			}
			@Override
			public Adapter casePhysicalBody(PhysicalBody object) {
				return createPhysicalBodyAdapter();
			}
			@Override
			public Adapter casePhysicalProperties(PhysicalProperties object) {
				return createPhysicalPropertiesAdapter();
			}
			@Override
			public Adapter caseAbstractPhysicalBodySimulationProperties(AbstractPhysicalBodySimulationProperties object) {
				return createAbstractPhysicalBodySimulationPropertiesAdapter();
			}
			@Override
			public Adapter caseAbstractConstraint(AbstractConstraint object) {
				return createAbstractConstraintAdapter();
			}
			@Override
			public Adapter caseConstraintState(ConstraintState object) {
				return createConstraintStateAdapter();
			}
			@Override
			public Adapter caseCylindricalConstraint(CylindricalConstraint object) {
				return createCylindricalConstraintAdapter();
			}
			@Override
			public Adapter caseGearRatioConstraint(GearRatioConstraint object) {
				return createGearRatioConstraintAdapter();
			}
			@Override
			public Adapter caseHingeConstraint(HingeConstraint object) {
				return createHingeConstraintAdapter();
			}
			@Override
			public Adapter casePrismaticConstraint(PrismaticConstraint object) {
				return createPrismaticConstraintAdapter();
			}
			@Override
			public Adapter caseRPROConstraint(RPROConstraint object) {
				return createRPROConstraintAdapter();
			}
			@Override
			public Adapter caseUniversalConstraint(UniversalConstraint object) {
				return createUniversalConstraintAdapter();
			}
			@Override
			public Adapter caseConstraintAttachmentPoint(ConstraintAttachmentPoint object) {
				return createConstraintAttachmentPointAdapter();
			}
			@Override
			public Adapter caseCollisionGeometry(CollisionGeometry object) {
				return createCollisionGeometryAdapter();
			}
			@Override
			public Adapter caseAbstractMaterial(AbstractMaterial object) {
				return createAbstractMaterialAdapter();
			}
			@Override
			public Adapter caseAbstractCollisionGeometrySimulationProperties(AbstractCollisionGeometrySimulationProperties object) {
				return createAbstractCollisionGeometrySimulationPropertiesAdapter();
			}
			@Override
			public Adapter caseGeometry(Geometry object) {
				return createGeometryAdapter();
			}
			@Override
			public Adapter caseBoxGeometry(BoxGeometry object) {
				return createBoxGeometryAdapter();
			}
			@Override
			public Adapter caseCapsuleGeometry(CapsuleGeometry object) {
				return createCapsuleGeometryAdapter();
			}
			@Override
			public Adapter caseCylinderGeometry(CylinderGeometry object) {
				return createCylinderGeometryAdapter();
			}
			@Override
			public Adapter caseSphereGeometry(SphereGeometry object) {
				return createSphereGeometryAdapter();
			}
			@Override
			public Adapter caseAbstractConstraintSimulationProperties(AbstractConstraintSimulationProperties object) {
				return createAbstractConstraintSimulationPropertiesAdapter();
			}
			@Override
			public Adapter casePointOfInterest(PointOfInterest object) {
				return createPointOfInterestAdapter();
			}
			@Override
			public Adapter caseKinematicState(KinematicState object) {
				return createKinematicStateAdapter();
			}
			@Override
			public Adapter caseDynamicsFacade(DynamicsFacade object) {
				return createDynamicsFacadeAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public Adapter caseAggregateGroupNode(AggregateGroupNode object) {
				return createAggregateGroupNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.AbstractDynamicsEngine <em>Abstract Dynamics Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.AbstractDynamicsEngine
	 * @generated
	 */
	public Adapter createAbstractDynamicsEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.DynamicSystemProperties <em>Dynamic System Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.DynamicSystemProperties
	 * @generated
	 */
	public Adapter createDynamicSystemPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.PhysicalBody <em>Physical Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.PhysicalBody
	 * @generated
	 */
	public Adapter createPhysicalBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.PhysicalProperties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.PhysicalProperties
	 * @generated
	 */
	public Adapter createPhysicalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.AbstractPhysicalBodySimulationProperties <em>Abstract Physical Body Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.AbstractPhysicalBodySimulationProperties
	 * @generated
	 */
	public Adapter createAbstractPhysicalBodySimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraint <em>Abstract Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.AbstractConstraint
	 * @generated
	 */
	public Adapter createAbstractConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.ConstraintState <em>Constraint State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.ConstraintState
	 * @generated
	 */
	public Adapter createConstraintStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.CylindricalConstraint <em>Cylindrical Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.CylindricalConstraint
	 * @generated
	 */
	public Adapter createCylindricalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.GearRatioConstraint <em>Gear Ratio Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.GearRatioConstraint
	 * @generated
	 */
	public Adapter createGearRatioConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.HingeConstraint <em>Hinge Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.HingeConstraint
	 * @generated
	 */
	public Adapter createHingeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.PrismaticConstraint <em>Prismatic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.PrismaticConstraint
	 * @generated
	 */
	public Adapter createPrismaticConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.RPROConstraint <em>RPRO Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.RPROConstraint
	 * @generated
	 */
	public Adapter createRPROConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.UniversalConstraint <em>Universal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.UniversalConstraint
	 * @generated
	 */
	public Adapter createUniversalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint <em>Constraint Attachment Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.ConstraintAttachmentPoint
	 * @generated
	 */
	public Adapter createConstraintAttachmentPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.CollisionGeometry <em>Collision Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.CollisionGeometry
	 * @generated
	 */
	public Adapter createCollisionGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.AbstractMaterial <em>Abstract Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.AbstractMaterial
	 * @generated
	 */
	public Adapter createAbstractMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.AbstractCollisionGeometrySimulationProperties <em>Abstract Collision Geometry Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.AbstractCollisionGeometrySimulationProperties
	 * @generated
	 */
	public Adapter createAbstractCollisionGeometrySimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.BoxGeometry <em>Box Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.BoxGeometry
	 * @generated
	 */
	public Adapter createBoxGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.CapsuleGeometry <em>Capsule Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.CapsuleGeometry
	 * @generated
	 */
	public Adapter createCapsuleGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.CylinderGeometry <em>Cylinder Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.CylinderGeometry
	 * @generated
	 */
	public Adapter createCylinderGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.SphereGeometry <em>Sphere Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.SphereGeometry
	 * @generated
	 */
	public Adapter createSphereGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.AbstractConstraintSimulationProperties <em>Abstract Constraint Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.AbstractConstraintSimulationProperties
	 * @generated
	 */
	public Adapter createAbstractConstraintSimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.PointOfInterest <em>Point Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.PointOfInterest
	 * @generated
	 */
	public Adapter createPointOfInterestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.KinematicState <em>Kinematic State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.KinematicState
	 * @generated
	 */
	public Adapter createKinematicStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.topology.dynamics.DynamicsFacade <em>Dynamics Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.topology.dynamics.DynamicsFacade
	 * @generated
	 */
	public Adapter createDynamicsFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.GroupNode
	 * @generated
	 */
	public Adapter createGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.topology.AggregateGroupNode
	 * @generated
	 */
	public Adapter createAggregateGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TopologyDynamicsAdapterFactory
