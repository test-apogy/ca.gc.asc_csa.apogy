package ca.gc.asc_csa.apogy.common.geometry.data.util;
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
import ca.gc.asc_csa.apogy.common.geometry.data.*;
import ca.gc.asc_csa.apogy.common.processors.Monitorable;
import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage
 * @generated
 */
public class ApogyCommonGeometryDataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCommonGeometryDataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryDataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyCommonGeometryDataPackage.eINSTANCE;
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
	protected ApogyCommonGeometryDataSwitch<Adapter> modelSwitch =
		new ApogyCommonGeometryDataSwitch<Adapter>() {
			@Override
			public Adapter caseCoordinates(Coordinates object) {
				return createCoordinatesAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSet(CoordinatesSet<T> object) {
				return createCoordinatesSetAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter casePolygon(Polygon<T> object) {
				return createPolygonAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter caseMesh(Mesh<CoordinatesType, PolygonType> object) {
				return createMeshAdapter();
			}
			@Override
			public Adapter caseSamplingShape(SamplingShape object) {
				return createSamplingShapeAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSamplingShape(CoordinatesSamplingShape<T> object) {
				return createCoordinatesSamplingShapeAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter casePolygonSamplingShape(PolygonSamplingShape<CoordinatesType, PolygonType> object) {
				return createPolygonSamplingShapeAdapter();
			}
			@Override
			public <T extends Coordinates> Adapter caseCoordinatesSetShapesSampler(CoordinatesSetShapesSampler<T> object) {
				return createCoordinatesSetShapesSamplerAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter caseMeshCoordinatesShapesSampler(MeshCoordinatesShapesSampler<CoordinatesType, PolygonType> object) {
				return createMeshCoordinatesShapesSamplerAdapter();
			}
			@Override
			public <CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Adapter caseMeshPolygonShapesSampler(MeshPolygonShapesSampler<CoordinatesType, PolygonType> object) {
				return createMeshPolygonShapesSamplerAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Polygon
	 * @generated
	 */
	public Adapter createPolygonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.Mesh <em>Mesh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.Mesh
	 * @generated
	 */
	public Adapter createMeshAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape <em>Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.SamplingShape
	 * @generated
	 */
	public Adapter createSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape <em>Coordinates Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape
	 * @generated
	 */
	public Adapter createCoordinatesSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape <em>Polygon Sampling Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape
	 * @generated
	 */
	public Adapter createPolygonSamplingShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler <em>Coordinates Set Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSetShapesSampler
	 * @generated
	 */
	public Adapter createCoordinatesSetShapesSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler <em>Mesh Coordinates Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler
	 * @generated
	 */
	public Adapter createMeshCoordinatesShapesSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler <em>Mesh Polygon Shapes Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler
	 * @generated
	 */
	public Adapter createMeshPolygonShapesSamplerAdapter() {
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

} //ApogyCommonGeometryDataAdapterFactory
