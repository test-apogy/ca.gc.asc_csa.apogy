package ca.gc.asc_csa.apogy.addons.geometry.paths.util;
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

import ca.gc.asc_csa.apogy.addons.geometry.paths.*;

import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;
import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;

import ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.asc_csa.apogy.common.processors.Monitorable;
import ca.gc.asc_csa.apogy.common.processors.Processor;

import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage
 * @generated
 */
public class ApogyAddonsGeometryPathsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyAddonsGeometryPathsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsGeometryPathsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyAddonsGeometryPathsPackage.eINSTANCE;
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
	protected ApogyAddonsGeometryPathsSwitch<Adapter> modelSwitch =
		new ApogyAddonsGeometryPathsSwitch<Adapter>() {
			@Override
			public Adapter caseWayPoint(WayPoint object) {
				return createWayPointAdapter();
			}
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
			public Adapter caseSegmentWayPointPathInterpolator(SegmentWayPointPathInterpolator object) {
				return createSegmentWayPointPathInterpolatorAdapter();
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
			public Adapter caseUniformDistanceWayPointPathInterpolator(UniformDistanceWayPointPathInterpolator object) {
				return createUniformDistanceWayPointPathInterpolatorAdapter();
			}
			@Override
			public Adapter caseApogyAddonsGeometryPathsFacade(ApogyAddonsGeometryPathsFacade object) {
				return createApogyAddonsGeometryPathsFacadeAdapter();
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
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSet(CoordinatesSet<T> object) {
				return createCoordinatesSetAdapter();
			}
			@Override
			public <T extends CartesianPositionCoordinates> Adapter caseAbstractCartesianCoordinatesSet(AbstractCartesianCoordinatesSet<T> object) {
				return createAbstractCartesianCoordinatesSetAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.WayPoint <em>Way Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.WayPoint
	 * @generated
	 */
	public Adapter createWayPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath <em>Way Point Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath
	 * @generated
	 */
	public Adapter createWayPointPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPathInterpolator <em>Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPathInterpolator
	 * @generated
	 */
	public Adapter createWayPointPathInterpolatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator <em>Catmull Rom Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator
	 * @generated
	 */
	public Adapter createCatmullRomWayPointPathInterpolatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.SegmentWayPointPathInterpolator <em>Segment Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.SegmentWayPointPathInterpolator
	 * @generated
	 */
	public Adapter createSegmentWayPointPathInterpolatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPathFilter <em>Way Point Path Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPathFilter
	 * @generated
	 */
	public Adapter createWayPointPathFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.MinimumDistanceFilter <em>Minimum Distance Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.MinimumDistanceFilter
	 * @generated
	 */
	public Adapter createMinimumDistanceFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.UniformDistanceWayPointPathInterpolator <em>Uniform Distance Way Point Path Interpolator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.UniformDistanceWayPointPathInterpolator
	 * @generated
	 */
	public Adapter createUniformDistanceWayPointPathInterpolatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFacade
	 * @generated
	 */
	public Adapter createApogyAddonsGeometryPathsFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Coordinates
	 * @generated
	 */
	public Adapter createCoordinatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates <em>Cartesian Position Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates
	 * @generated
	 */
	public Adapter createCartesianPositionCoordinatesAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet <em>Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet
	 * @generated
	 */
	public Adapter createCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet <em>Abstract Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet
	 * @generated
	 */
	public Adapter createAbstractCartesianCoordinatesSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet <em>Cartesian Coordinates Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet
	 * @generated
	 */
	public Adapter createCartesianCoordinatesSetAdapter() {
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

} //ApogyAddonsGeometryPathsAdapterFactory
