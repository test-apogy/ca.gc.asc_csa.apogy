/**
 * Canadian Space Agency 2007.
 *
 * $Id: PathsAdapterFactory.java,v 1.5.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.geometry.paths.PathsFacade;
import org.eclipse.symphony.addons.geometry.paths.PathsPackage;
import org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator;
import org.eclipse.symphony.addons.geometry.paths.WayPoint;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.geometry.paths.WayPointPathFilter;
import org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator;
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.CoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.processors.Monitorable;
import org.eclipse.symphony.common.processors.Processor;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.geometry.paths.PathsPackage
 * @generated
 */
public class PathsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PathsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PathsPackage.eINSTANCE;
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
	protected PathsSwitch<Adapter> modelSwitch =
		new PathsSwitch<Adapter>() {
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter caseWayPointPath(WayPointPath object) {
				return createWayPointPathAdapter();
			}
			@Override
			public Adapter caseWayPointPathInterpolator(WayPointPathInterpolator object) {
				return createWayPointPathInterpolatorAdapter();
			}
			@Override
			public Adapter caseCatmullRomWayPointPathInterpolator(CatmullRomWayPointPathInterpolator object) {
				return createCatmullRomWayPointPathInterpolatorAdapter();
			}
			@Override
			public Adapter caseWayPointPathFilter(WayPointPathFilter object) {
				return createWayPointPathFilterAdapter();
			}
			@Override
			public Adapter caseMinimumDistanceFilter(MinimumDistanceFilter object) {
				return createMinimumDistanceFilterAdapter();
			}
			@Override
			public Adapter casePathsFacade(PathsFacade object) {
				return createPathsFacadeAdapter();
			}
			@Override
			public Adapter caseSegmentWayPointPathInterpolator(SegmentWayPointPathInterpolator object) {
				return createSegmentWayPointPathInterpolatorAdapter();
			}
			@Override
			public Adapter caseUniformDistanceWayPointPathInterpolator(UniformDistanceWayPointPathInterpolator object) {
				return createUniformDistanceWayPointPathInterpolatorAdapter();
			}
			@Override
			public Adapter caseWayPoint(WayPoint object) {
				return createWayPointAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSet(CoordinatesSet<T> object) {
				return createCoordinatesSetAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesSet(CartesianCoordinatesSet object) {
				return createCartesianCoordinatesSetAdapter();
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
			public Adapter caseCoordinates(Coordinates object) {
				return createCoordinatesAdapter();
			}
			@Override
			public Adapter caseCartesianPositionCoordinates(CartesianPositionCoordinates object) {
				return createCartesianPositionCoordinatesAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPath <em>Way Point Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPath
	 * @generated
	 */
	public Adapter createWayPointPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator <em>Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPathInterpolator
	 * @generated
	 */
	public Adapter createWayPointPathInterpolatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator <em>Catmull Rom Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.CatmullRomWayPointPathInterpolator
	 * @generated
	 */
	public Adapter createCatmullRomWayPointPathInterpolatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.WayPointPathFilter <em>Way Point Path Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPointPathFilter
	 * @generated
	 */
	public Adapter createWayPointPathFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter <em>Minimum Distance Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.MinimumDistanceFilter
	 * @generated
	 */
	public Adapter createMinimumDistanceFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.PathsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.PathsFacade
	 * @generated
	 */
	public Adapter createPathsFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator <em>Segment Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.SegmentWayPointPathInterpolator
	 * @generated
	 */
	public Adapter createSegmentWayPointPathInterpolatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator <em>Uniform Distance Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.UniformDistanceWayPointPathInterpolator
	 * @generated
	 */
	public Adapter createUniformDistanceWayPointPathInterpolatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.geometry.paths.WayPoint <em>Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.geometry.paths.WayPoint
	 * @generated
	 */
	public Adapter createWayPointAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.Node
	 * @generated
	 */
	public Adapter createNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.topology.GroupNode
	 * @generated
	 */
	public Adapter createGroupNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.geometry.data.CoordinatesSet <em>Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.geometry.data.CoordinatesSet
	 * @generated
	 */
	public Adapter createCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet <em>Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet
	 * @generated
	 */
	public Adapter createCartesianCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.processors.Monitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.processors.Monitorable
	 * @generated
	 */
	public Adapter createMonitorableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.processors.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.processors.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.geometry.data.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.geometry.data.Coordinates
	 * @generated
	 */
	public Adapter createCoordinatesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates <em>Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates
	 * @generated
	 */
	public Adapter createCartesianPositionCoordinatesAdapter()
	{
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

} //PathsAdapterFactory