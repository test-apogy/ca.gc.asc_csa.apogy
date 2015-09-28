/**
 * Canadian Space Agency 2008.
 *
 * $Id: PathplannersGraphAdapterFactory.java,v 1.2.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.jgrapht.EdgeFactory;

import ca.gc.space.mrt.common.processors.Monitorable;
import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.common.processors.VerboseProvider;
import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.mobility.pathplanners.MeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner;
import ca.gc.space.mrt.mobility.pathplanners.graph.DisplacementCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceOnlyCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.ExclusionZonesCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.MeshDisplacementCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdge;
import ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdgeFactory;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage;
import ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage
 * @generated
 */
public class PathplannersGraphAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PathplannersGraphPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathplannersGraphAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PathplannersGraphPackage.eINSTANCE;
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
	protected PathplannersGraphSwitch<Adapter> modelSwitch =
		new PathplannersGraphSwitch<Adapter>() {
			@Override
			public <PolygonType extends CartesianPolygon> Adapter caseCostBasedMeshWayPointPathPlanner(CostBasedMeshWayPointPathPlanner<PolygonType> object) {
				return createCostBasedMeshWayPointPathPlannerAdapter();
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
			public Adapter caseDisplacementCostFunction(DisplacementCostFunction object) {
				return createDisplacementCostFunctionAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner <em>Cost Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.CostBasedMeshWayPointPathPlanner
	 * @generated
	 */
	public Adapter createCostBasedMeshWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.MeshDisplacementCostFunction <em>Mesh Displacement Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.MeshDisplacementCostFunction
	 * @generated
	 */
	public Adapter createMeshDisplacementCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceOnlyCostFunction <em>Distance Only Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.DistanceOnlyCostFunction
	 * @generated
	 */
	public Adapter createDistanceOnlyCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner <em>Simple Directed Weighted Graph Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner
	 * @generated
	 */
	public Adapter createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdgeFactory <em>Mobility Edge Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdgeFactory
	 * @generated
	 */
	public Adapter createMobilityEdgeFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner <em>Directed Graph Based Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.DirectedGraphBasedMeshWayPointPathPlanner
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
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdge <em>Mobility Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdge
	 * @generated
	 */
	public Adapter createMobilityEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction <em>Distance And Slopes Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction
	 * @generated
	 */
	public Adapter createDistanceAndSlopesCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.ExclusionZonesCostFunction <em>Exclusion Zones Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.ExclusionZonesCostFunction
	 * @generated
	 */
	public Adapter createExclusionZonesCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DisplacementCostFunction <em>Displacement Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.DisplacementCostFunction
	 * @generated
	 */
	public Adapter createDisplacementCostFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction <em>Distance And Rover Footprint Cost Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction
	 * @generated
	 */
	public Adapter createDistanceAndRoverFootprintCostFunctionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.common.processors.Monitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.common.processors.Monitorable
	 * @generated
	 */
	public Adapter createMonitorableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.common.processors.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.common.processors.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner <em>Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.WayPointPathPlanner
	 * @generated
	 */
	public Adapter createWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.mobility.pathplanners.MeshWayPointPathPlanner <em>Mesh Way Point Path Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.mobility.pathplanners.MeshWayPointPathPlanner
	 * @generated
	 */
	public Adapter createMeshWayPointPathPlannerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.space.mrt.common.processors.VerboseProvider <em>Verbose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.space.mrt.common.processors.VerboseProvider
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

} //PathplannersGraphAdapterFactory
