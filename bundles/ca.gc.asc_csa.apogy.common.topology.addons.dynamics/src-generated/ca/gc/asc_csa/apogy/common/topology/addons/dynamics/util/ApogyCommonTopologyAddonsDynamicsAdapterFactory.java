package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.util;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;

import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage
 * @generated
 */
public class ApogyCommonTopologyAddonsDynamicsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCommonTopologyAddonsDynamicsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonTopologyAddonsDynamicsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyCommonTopologyAddonsDynamicsPackage.eINSTANCE;
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
	protected ApogyCommonTopologyAddonsDynamicsSwitch<Adapter> modelSwitch =
		new ApogyCommonTopologyAddonsDynamicsSwitch<Adapter>() {
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
			public Adapter caseAbstractConstraintSimulationProperties(AbstractConstraintSimulationProperties object) {
				return createAbstractConstraintSimulationPropertiesAdapter();
			}
			@Override
			public Adapter caseAbstractCollisionGeometrySimulationProperties(AbstractCollisionGeometrySimulationProperties object) {
				return createAbstractCollisionGeometrySimulationPropertiesAdapter();
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
			public Adapter caseConstraintState(ConstraintState object) {
				return createConstraintStateAdapter();
			}
			@Override
			public Adapter caseAbstractConstraint(AbstractConstraint object) {
				return createAbstractConstraintAdapter();
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
			public Adapter caseApogyCommonTopologyAddonsDynamicsFacade(ApogyCommonTopologyAddonsDynamicsFacade object) {
				return createApogyCommonTopologyAddonsDynamicsFacadeAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties <em>Dynamic System Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.DynamicSystemProperties
	 * @generated
	 */
	public Adapter createDynamicSystemPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine <em>Abstract Dynamics Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractDynamicsEngine
	 * @generated
	 */
	public Adapter createAbstractDynamicsEngineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody <em>Physical Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody
	 * @generated
	 */
	public Adapter createPhysicalBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties <em>Physical Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalProperties
	 * @generated
	 */
	public Adapter createPhysicalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties <em>Abstract Physical Body Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractPhysicalBodySimulationProperties
	 * @generated
	 */
	public Adapter createAbstractPhysicalBodySimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraintSimulationProperties <em>Abstract Constraint Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraintSimulationProperties
	 * @generated
	 */
	public Adapter createAbstractConstraintSimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractCollisionGeometrySimulationProperties <em>Abstract Collision Geometry Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractCollisionGeometrySimulationProperties
	 * @generated
	 */
	public Adapter createAbstractCollisionGeometrySimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest <em>Point Of Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest
	 * @generated
	 */
	public Adapter createPointOfInterestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState <em>Kinematic State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState
	 * @generated
	 */
	public Adapter createKinematicStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState <em>Constraint State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState
	 * @generated
	 */
	public Adapter createConstraintStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint <em>Abstract Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractConstraint
	 * @generated
	 */
	public Adapter createAbstractConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint <em>Cylindrical Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint
	 * @generated
	 */
	public Adapter createCylindricalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint <em>Gear Ratio Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint
	 * @generated
	 */
	public Adapter createGearRatioConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint <em>Hinge Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint
	 * @generated
	 */
	public Adapter createHingeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint <em>Prismatic Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint
	 * @generated
	 */
	public Adapter createPrismaticConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint <em>RPRO Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint
	 * @generated
	 */
	public Adapter createRPROConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint <em>Universal Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint
	 * @generated
	 */
	public Adapter createUniversalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint <em>Constraint Attachment Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintAttachmentPoint
	 * @generated
	 */
	public Adapter createConstraintAttachmentPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry <em>Collision Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CollisionGeometry
	 * @generated
	 */
	public Adapter createCollisionGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractMaterial <em>Abstract Material</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.AbstractMaterial
	 * @generated
	 */
	public Adapter createAbstractMaterialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.Geometry
	 * @generated
	 */
	public Adapter createGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.BoxGeometry <em>Box Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.BoxGeometry
	 * @generated
	 */
	public Adapter createBoxGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry <em>Capsule Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CapsuleGeometry
	 * @generated
	 */
	public Adapter createCapsuleGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry <em>Cylinder Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylinderGeometry
	 * @generated
	 */
	public Adapter createCylinderGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.SphereGeometry <em>Sphere Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.SphereGeometry
	 * @generated
	 */
	public Adapter createSphereGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsFacade
	 * @generated
	 */
	public Adapter createApogyCommonTopologyAddonsDynamicsFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.GroupNode
	 * @generated
	 */
	public Adapter createGroupNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode
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

} //ApogyCommonTopologyAddonsDynamicsAdapterFactory
