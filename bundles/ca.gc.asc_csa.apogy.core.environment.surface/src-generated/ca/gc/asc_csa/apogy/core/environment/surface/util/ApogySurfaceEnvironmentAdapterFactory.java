/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.Map;
import ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.MapNode;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsList;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode;
import ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion;
import ca.gc.asc_csa.apogy.core.environment.surface.Region;
import ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage
 * @generated
 */
public class ApogySurfaceEnvironmentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogySurfaceEnvironmentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogySurfaceEnvironmentPackage.eINSTANCE;
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
	protected ApogySurfaceEnvironmentSwitch<Adapter> modelSwitch =
		new ApogySurfaceEnvironmentSwitch<Adapter>() {
			@Override
			public Adapter caseSurfaceWorksite(SurfaceWorksite object) {
				return createSurfaceWorksiteAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseMapsList(MapsList object) {
				return createMapsListAdapter();
			}
			@Override
			public Adapter caseAbstractMapLayer(AbstractMapLayer object) {
				return createAbstractMapLayerAdapter();
			}
			@Override
			public Adapter caseMapLayerPresentation(MapLayerPresentation object) {
				return createMapLayerPresentationAdapter();
			}
			@Override
			public Adapter caseURLMapLayer(URLMapLayer object) {
				return createURLMapLayerAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseRectangularRegion(RectangularRegion object) {
				return createRectangularRegionAdapter();
			}
			@Override
			public Adapter caseRectangularVolumeRegion(RectangularVolumeRegion object) {
				return createRectangularVolumeRegionAdapter();
			}
			@Override
			public Adapter caseRectangularRegionProvider(RectangularRegionProvider object) {
				return createRectangularRegionProviderAdapter();
			}
			@Override
			public Adapter caseRectangularRegionImage(RectangularRegionImage object) {
				return createRectangularRegionImageAdapter();
			}
			@Override
			public Adapter caseImageMapLayer(ImageMapLayer object) {
				return createImageMapLayerAdapter();
			}
			@Override
			public Adapter caseImageMapLayerPresentation(ImageMapLayerPresentation object) {
				return createImageMapLayerPresentationAdapter();
			}
			@Override
			public Adapter caseURLImageMapLayer(URLImageMapLayer object) {
				return createURLImageMapLayerAdapter();
			}
			@Override
			public Adapter caseTopologyTreeMapLayer(TopologyTreeMapLayer object) {
				return createTopologyTreeMapLayerAdapter();
			}
			@Override
			public Adapter caseTopologyTreeMapLayerNode(TopologyTreeMapLayerNode object) {
				return createTopologyTreeMapLayerNodeAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer object) {
				return createCartesianTriangularMeshMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshDerivedImageMapLayer(CartesianTriangularMeshDerivedImageMapLayer object) {
				return createCartesianTriangularMeshDerivedImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshSlopeImageMapLayer(CartesianTriangularMeshSlopeImageMapLayer object) {
				return createCartesianTriangularMeshSlopeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshDiscreteSlopeImageMapLayer(CartesianTriangularMeshDiscreteSlopeImageMapLayer object) {
				return createCartesianTriangularMeshDiscreteSlopeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshHeightImageMapLayer(CartesianTriangularMeshHeightImageMapLayer object) {
				return createCartesianTriangularMeshHeightImageMapLayerAdapter();
			}
			@Override
			public Adapter caseSlopeRange(SlopeRange object) {
				return createSlopeRangeAdapter();
			}
			@Override
			public Adapter caseLineOfSightImageMapLayer(LineOfSightImageMapLayer object) {
				return createLineOfSightImageMapLayerAdapter();
			}
			@Override
			public Adapter caseAbstractShapeImageLayer(AbstractShapeImageLayer object) {
				return createAbstractShapeImageLayerAdapter();
			}
			@Override
			public Adapter caseEllipseShapeImageLayer(EllipseShapeImageLayer object) {
				return createEllipseShapeImageLayerAdapter();
			}
			@Override
			public Adapter caseRectangleShapeImageLayer(RectangleShapeImageLayer object) {
				return createRectangleShapeImageLayerAdapter();
			}
			@Override
			public Adapter casePolygonShapeImageMapLayer(PolygonShapeImageMapLayer object) {
				return createPolygonShapeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesPolygonShapeImageMapLayer(CartesianCoordinatesPolygonShapeImageMapLayer object) {
				return createCartesianCoordinatesPolygonShapeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseBasicCartesianTriangularMeshMapLayer(BasicCartesianTriangularMeshMapLayer object) {
				return createBasicCartesianTriangularMeshMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshURLMapLayer(CartesianTriangularMeshURLMapLayer object) {
				return createCartesianTriangularMeshURLMapLayerAdapter();
			}
			@Override
			public Adapter caseFeaturesOfInterestMapLayer(FeaturesOfInterestMapLayer object) {
				return createFeaturesOfInterestMapLayerAdapter();
			}
			@Override
			public Adapter caseSurfaceWorksiteNode(SurfaceWorksiteNode object) {
				return createSurfaceWorksiteNodeAdapter();
			}
			@Override
			public Adapter caseMapsListNode(MapsListNode object) {
				return createMapsListNodeAdapter();
			}
			@Override
			public Adapter caseMapNode(MapNode object) {
				return createMapNodeAdapter();
			}
			@Override
			public Adapter caseAbstractMapLayerNode(AbstractMapLayerNode object) {
				return createAbstractMapLayerNodeAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshMapLayerNode(CartesianTriangularMeshMapLayerNode object) {
				return createCartesianTriangularMeshMapLayerNodeAdapter();
			}
			@Override
			public Adapter caseSurfaceEnvironmentUtilities(SurfaceEnvironmentUtilities object) {
				return createSurfaceEnvironmentUtilitiesAdapter();
			}
			@Override
			public Adapter caseApogySurfaceEnvironmentFacade(ApogySurfaceEnvironmentFacade object) {
				return createApogySurfaceEnvironmentFacadeAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseAbstractWorksite(AbstractWorksite object) {
				return createAbstractWorksiteAdapter();
			}
			@Override
			public Adapter caseWorksite(Worksite object) {
				return createWorksiteAdapter();
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
			public Adapter caseWorksiteNode(WorksiteNode object) {
				return createWorksiteNodeAdapter();
			}
			@Override
			public Adapter casePositionNode(PositionNode object) {
				return createPositionNodeAdapter();
			}
			@Override
			public Adapter caseRotationNode(RotationNode object) {
				return createRotationNodeAdapter();
			}
			@Override
			public Adapter caseTransformNode(TransformNode object) {
				return createTransformNodeAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite <em>Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite
	 * @generated
	 */
	public Adapter createSurfaceWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Map
	 * @generated
	 */
	public Adapter createMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapsList
	 * @generated
	 */
	public Adapter createMapsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer <em>Abstract Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer
	 * @generated
	 */
	public Adapter createAbstractMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation <em>Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapLayerPresentation
	 * @generated
	 */
	public Adapter createMapLayerPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer <em>URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer
	 * @generated
	 */
	public Adapter createURLMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion <em>Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion
	 * @generated
	 */
	public Adapter createRectangularRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion <em>Rectangular Volume Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion
	 * @generated
	 */
	public Adapter createRectangularVolumeRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider <em>Rectangular Region Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider
	 * @generated
	 */
	public Adapter createRectangularRegionProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage <em>Rectangular Region Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage
	 * @generated
	 */
	public Adapter createRectangularRegionImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer <em>Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer
	 * @generated
	 */
	public Adapter createImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation <em>Image Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation
	 * @generated
	 */
	public Adapter createImageMapLayerPresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer <em>URL Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer
	 * @generated
	 */
	public Adapter createURLImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer <em>Topology Tree Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer
	 * @generated
	 */
	public Adapter createTopologyTreeMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode <em>Topology Tree Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode
	 * @generated
	 */
	public Adapter createTopologyTreeMapLayerNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDerivedImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshDerivedImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshSlopeImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshSlopeImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshDiscreteSlopeImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshDiscreteSlopeImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer <em>Cartesian Triangular Mesh Height Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshHeightImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshHeightImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange <em>Slope Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange
	 * @generated
	 */
	public Adapter createSlopeRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer <em>Line Of Sight Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.LineOfSightImageMapLayer
	 * @generated
	 */
	public Adapter createLineOfSightImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer <em>Abstract Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer
	 * @generated
	 */
	public Adapter createAbstractShapeImageLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer <em>Ellipse Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.EllipseShapeImageLayer
	 * @generated
	 */
	public Adapter createEllipseShapeImageLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer <em>Rectangle Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer
	 * @generated
	 */
	public Adapter createRectangleShapeImageLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer <em>Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.PolygonShapeImageMapLayer
	 * @generated
	 */
	public Adapter createPolygonShapeImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianCoordinatesPolygonShapeImageMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer <em>Basic Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer
	 * @generated
	 */
	public Adapter createBasicCartesianTriangularMeshMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer <em>Cartesian Triangular Mesh URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshURLMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer
	 * @generated
	 */
	public Adapter createFeaturesOfInterestMapLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.WorksiteNode <em>Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.WorksiteNode
	 * @generated
	 */
	public Adapter createWorksiteNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode <em>Surface Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode
	 * @generated
	 */
	public Adapter createSurfaceWorksiteNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode <em>Maps List Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode
	 * @generated
	 */
	public Adapter createMapsListNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.MapNode <em>Map Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.MapNode
	 * @generated
	 */
	public Adapter createMapNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode <em>Abstract Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode
	 * @generated
	 */
	public Adapter createAbstractMapLayerNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshMapLayerNode
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshMapLayerNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities <em>Surface Environment Utilities</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities
	 * @generated
	 */
	public Adapter createSurfaceEnvironmentUtilitiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade
	 * @generated
	 */
	public Adapter createApogySurfaceEnvironmentFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Timed
	 * @generated
	 */
	public Adapter createTimedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractWorksite
	 * @generated
	 */
	public Adapter createAbstractWorksiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Worksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite
	 * @generated
	 */
	public Adapter createWorksiteAdapter() {
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.PositionNode <em>Position Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.PositionNode
	 * @generated
	 */
	public Adapter createPositionNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.RotationNode <em>Rotation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.RotationNode
	 * @generated
	 */
	public Adapter createRotationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.TransformNode <em>Transform Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.TransformNode
	 * @generated
	 */
	public Adapter createTransformNodeAdapter() {
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

} //ApogySurfaceEnvironmentAdapterFactory
