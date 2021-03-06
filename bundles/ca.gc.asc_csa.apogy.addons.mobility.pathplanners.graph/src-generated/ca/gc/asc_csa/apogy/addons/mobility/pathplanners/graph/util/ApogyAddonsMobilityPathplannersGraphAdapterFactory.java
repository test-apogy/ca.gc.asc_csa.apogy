package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.util;
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
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.*;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.processors.Monitorable;
import ca.gc.asc_csa.apogy.common.processors.Processor;
import ca.gc.asc_csa.apogy.common.processors.VerboseProvider;
import org.jgrapht.EdgeFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage
 * @generated
 */
public class ApogyAddonsMobilityPathplannersGraphAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyAddonsMobilityPathplannersGraphPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsMobilityPathplannersGraphAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsMobilityPathplannersGraphPackage.eINSTANCE;
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
	protected ApogyAddonsMobilityPathplannersGraphSwitch<Adapter> modelSwitch =
		new ApogyAddonsMobilityPathplannersGraphSwitch<Adapter>() {
			@Override
			public <PolygonType extends CartesianPolygon> Adapter caseCostBasedMeshWayPointPathPlanner(CostBasedMeshWayPointPathPlanner<PolygonType> object) {
				return createCostBasedMeshWayPointPathPlannerAdapter();
			}
			@Override
			public Adapter caseDisplacementCostFunction(DisplacementCostFunction object) {
				return createDisplacementCostFunctionAdapter();
			}
			@Override
			public Adapter caseMeshDisplacementCostFunction(MeshDisplacementCostFunction object) {
				return createMeshDisplacementCostFunctionAdapter();
			}
			@Override
			public Adapter caseDistanceOnlyCostFunction(DistanceOnlyCostFunction object) {
				return createDistanceOnlyCostFunctionAdapter();
			}
			@Override
			public <PolygonType extends CartesianPolygon> Adapter caseSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner(SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<PolygonType> object) {
				return createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerAdapter();
			}
			@Override
			public <PolygonType extends CartesianPolygon> Adapter caseDirectedGraphBasedMeshWayPointPathPlanner(DirectedGraphBasedMeshWayPointPathPlanner<PolygonType> object) {
				return createDirectedGraphBasedMeshWayPointPathPlannerAdapter();
			}
			@Override
			public <V, E> Adapter caseEdgeFactory(EdgeFactory<V, E> object) {
				return createEdgeFactoryAdapter();
			}
			@Override
			public Adapter caseMobilityEdge(MobilityEdge object) {
				return createMobilityEdgeAdapter();
			}
			@Override
			public Adapter caseMobilityEdgeFactory(MobilityEdgeFactory object) {
				return createMobilityEdgeFactoryAdapter();
			}
			@Override
			public Adapter caseDistanceAndSlopesCostFunction(DistanceAndSlopesCostFunction object) {
				return createDistanceAndSlopesCostFunctionAdapter();
			}
			@Override
			public Adapter caseExclusionZonesCostFunction(ExclusionZonesCostFunction object) {
				return createExclusionZonesCostFunctionAdapter();
			}
			@Override
			public Adapter caseDistanceAndRoverFootprintCostFunction(DistanceAndRoverFootprintCostFunction object) {
				return createDistanceAndRoverFootprintCostFunctionAdapter();
			}
			@Override
			public Adapter caseMonitorable(Monitorable object) {
				return createMonitorableAdapter();
			}
			@Override
			public <I, O> Adapter caseProcessor(Processor<I, O> object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseWayPointPathPlanner(WayPointPathPlanner object) {
				return createWayPointPathPlannerAdapter();
			}
			@Override
			public <T extends CartesianPolygon> Adapter caseMeshWayPointPathPlanner(MeshWayPointPathPlanner<T> object) {
				return createMeshWayPointPathPlannerAdapter();
			}
			@Override
			public Adapter caseVerboseProvider(VerboseProvider object) {
				return createVerboseProviderAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner <em>Cost Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner
	 * @generated
	 */
	public Adapter createCostBasedMeshWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction <em>Displacement Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction
	 * @generated
	 */
	public Adapter createDisplacementCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction <em>Mesh Displacement Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MeshDisplacementCostFunction
	 * @generated
	 */
	public Adapter createMeshDisplacementCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceOnlyCostFunction <em>Distance Only Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceOnlyCostFunction
	 * @generated
	 */
	public Adapter createDistanceOnlyCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner <em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner
	 * @generated
	 */
	public Adapter createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner <em>Directed Graph Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner
	 * @generated
	 */
	public Adapter createDirectedGraphBasedMeshWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.jgrapht.EdgeFactory <em>Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.jgrapht.EdgeFactory
	 * @generated
	 */
	public Adapter createEdgeFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge <em>Mobility Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge
	 * @generated
	 */
	public Adapter createMobilityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory <em>Mobility Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory
	 * @generated
	 */
	public Adapter createMobilityEdgeFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction <em>Distance And Slopes Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction
	 * @generated
	 */
	public Adapter createDistanceAndSlopesCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction <em>Exclusion Zones Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ExclusionZonesCostFunction
	 * @generated
	 */
	public Adapter createExclusionZonesCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction <em>Distance And Rover Footprint Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction
	 * @generated
	 */
	public Adapter createDistanceAndRoverFootprintCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.processors.Monitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.processors.Monitorable
	 * @generated
	 */
	public Adapter createMonitorableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.processors.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.processors.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner <em>Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.WayPointPathPlanner
	 * @generated
	 */
	public Adapter createWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner <em>Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.MeshWayPointPathPlanner
	 * @generated
	 */
	public Adapter createMeshWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.processors.VerboseProvider <em>Verbose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.processors.VerboseProvider
	 * @generated
	 */
	public Adapter createVerboseProviderAdapter() {
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

} //ApogyAddonsMobilityPathplannersGraphAdapterFactory
