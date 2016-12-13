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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import java.util.List;

import javax.vecmath.Color3f;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.BasicCartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianCoordinatesPolygonShapeImageMapLayer;
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
import ca.gc.asc_csa.apogy.core.environment.surface.MapNode;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsList;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangleShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularVolumeRegion;
import ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogySurfaceEnvironmentFactoryImpl extends EFactoryImpl implements ApogySurfaceEnvironmentFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogySurfaceEnvironmentFactory init() {
		try {
			ApogySurfaceEnvironmentFactory theApogySurfaceEnvironmentFactory = (ApogySurfaceEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(ApogySurfaceEnvironmentPackage.eNS_URI);
			if (theApogySurfaceEnvironmentFactory != null) {
				return theApogySurfaceEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogySurfaceEnvironmentFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogySurfaceEnvironmentPackage.MAP: return createMap();
			case ApogySurfaceEnvironmentPackage.MAPS_LIST: return createMapsList();
			case ApogySurfaceEnvironmentPackage.RECTANGULAR_REGION: return createRectangularRegion();
			case ApogySurfaceEnvironmentPackage.RECTANGULAR_VOLUME_REGION: return createRectangularVolumeRegion();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER: return createImageMapLayer();
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION: return createImageMapLayerPresentation();
			case ApogySurfaceEnvironmentPackage.URL_IMAGE_MAP_LAYER: return createURLImageMapLayer();
			case ApogySurfaceEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER: return createTopologyTreeMapLayer();
			case ApogySurfaceEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE: return createTopologyTreeMapLayerNode();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER: return createCartesianTriangularMeshMapLayer();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER: return createCartesianTriangularMeshSlopeImageMapLayer();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER: return createCartesianTriangularMeshDiscreteSlopeImageMapLayer();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER: return createCartesianTriangularMeshHeightImageMapLayer();
			case ApogySurfaceEnvironmentPackage.SLOPE_RANGE: return createSlopeRange();
			case ApogySurfaceEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER: return createLineOfSightImageMapLayer();
			case ApogySurfaceEnvironmentPackage.ELLIPSE_SHAPE_IMAGE_LAYER: return createEllipseShapeImageLayer();
			case ApogySurfaceEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER: return createRectangleShapeImageLayer();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER: return createCartesianCoordinatesPolygonShapeImageMapLayer();
			case ApogySurfaceEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER: return createBasicCartesianTriangularMeshMapLayer();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER: return createCartesianTriangularMeshURLMapLayer();
			case ApogySurfaceEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER: return createFeaturesOfInterestMapLayer();
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE_NODE: return createSurfaceWorksiteNode();
			case ApogySurfaceEnvironmentPackage.MAPS_LIST_NODE: return createMapsListNode();
			case ApogySurfaceEnvironmentPackage.MAP_NODE: return createMapNode();
			case ApogySurfaceEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE: return createAbstractMapLayerNode();
			case ApogySurfaceEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE: return createCartesianTriangularMeshMapLayerNode();
			case ApogySurfaceEnvironmentPackage.SURFACE_ENVIRONMENT_UTILITIES: return createSurfaceEnvironmentUtilities();
			case ApogySurfaceEnvironmentPackage.APOGY_SURFACE_ENVIRONMENT_FACADE: return createApogySurfaceEnvironmentFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogySurfaceEnvironmentPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentPackage.LIST:
				return createListFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogySurfaceEnvironmentPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map createMap() {
		MapImpl map = new MapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsList createMapsList() {
		MapsListImpl mapsList = new MapsListImpl();
		return mapsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegion createRectangularRegion() {
		RectangularRegionImpl rectangularRegion = new RectangularRegionImpl();
		return rectangularRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularVolumeRegion createRectangularVolumeRegion() {
		RectangularVolumeRegionImpl rectangularVolumeRegion = new RectangularVolumeRegionImpl();
		return rectangularVolumeRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapLayer createImageMapLayer() {
		ImageMapLayerImpl imageMapLayer = new ImageMapLayerImpl();
		return imageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapLayerPresentation createImageMapLayerPresentation() {
		ImageMapLayerPresentationImpl imageMapLayerPresentation = new ImageMapLayerPresentationImpl();
		return imageMapLayerPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLImageMapLayer createURLImageMapLayer() {
		URLImageMapLayerImpl urlImageMapLayer = new URLImageMapLayerImpl();
		return urlImageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayer createTopologyTreeMapLayer() {
		TopologyTreeMapLayerImpl topologyTreeMapLayer = new TopologyTreeMapLayerImpl();
		return topologyTreeMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayerNode createTopologyTreeMapLayerNode() {
		TopologyTreeMapLayerNodeImpl topologyTreeMapLayerNode = new TopologyTreeMapLayerNodeImpl();
		return topologyTreeMapLayerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayer createCartesianTriangularMeshMapLayer() {
		CartesianTriangularMeshMapLayerImpl cartesianTriangularMeshMapLayer = new CartesianTriangularMeshMapLayerImpl();
		return cartesianTriangularMeshMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshSlopeImageMapLayer createCartesianTriangularMeshSlopeImageMapLayer() {
		CartesianTriangularMeshSlopeImageMapLayerImpl cartesianTriangularMeshSlopeImageMapLayer = new CartesianTriangularMeshSlopeImageMapLayerImpl();
		return cartesianTriangularMeshSlopeImageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshDiscreteSlopeImageMapLayer createCartesianTriangularMeshDiscreteSlopeImageMapLayer() {
		CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl cartesianTriangularMeshDiscreteSlopeImageMapLayer = new CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl();
		return cartesianTriangularMeshDiscreteSlopeImageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshHeightImageMapLayer createCartesianTriangularMeshHeightImageMapLayer() {
		CartesianTriangularMeshHeightImageMapLayerImpl cartesianTriangularMeshHeightImageMapLayer = new CartesianTriangularMeshHeightImageMapLayerImpl();
		return cartesianTriangularMeshHeightImageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeRange createSlopeRange() {
		SlopeRangeImpl slopeRange = new SlopeRangeImpl();
		return slopeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineOfSightImageMapLayer createLineOfSightImageMapLayer() {
		LineOfSightImageMapLayerImpl lineOfSightImageMapLayer = new LineOfSightImageMapLayerImpl();
		return lineOfSightImageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseShapeImageLayer createEllipseShapeImageLayer() {
		EllipseShapeImageLayerImpl ellipseShapeImageLayer = new EllipseShapeImageLayerImpl();
		return ellipseShapeImageLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleShapeImageLayer createRectangleShapeImageLayer() {
		RectangleShapeImageLayerImpl rectangleShapeImageLayer = new RectangleShapeImageLayerImpl();
		return rectangleShapeImageLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesPolygonShapeImageMapLayer createCartesianCoordinatesPolygonShapeImageMapLayer() {
		CartesianCoordinatesPolygonShapeImageMapLayerImpl cartesianCoordinatesPolygonShapeImageMapLayer = new CartesianCoordinatesPolygonShapeImageMapLayerImpl();
		return cartesianCoordinatesPolygonShapeImageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCartesianTriangularMeshMapLayer createBasicCartesianTriangularMeshMapLayer() {
		BasicCartesianTriangularMeshMapLayerImpl basicCartesianTriangularMeshMapLayer = new BasicCartesianTriangularMeshMapLayerImpl();
		return basicCartesianTriangularMeshMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshURLMapLayer createCartesianTriangularMeshURLMapLayer() {
		CartesianTriangularMeshURLMapLayerImpl cartesianTriangularMeshURLMapLayer = new CartesianTriangularMeshURLMapLayerImpl();
		return cartesianTriangularMeshURLMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayer createFeaturesOfInterestMapLayer() {
		FeaturesOfInterestMapLayerImpl featuresOfInterestMapLayer = new FeaturesOfInterestMapLayerImpl();
		return featuresOfInterestMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceWorksiteNode createSurfaceWorksiteNode() {
		SurfaceWorksiteNodeImpl surfaceWorksiteNode = new SurfaceWorksiteNodeImpl();
		return surfaceWorksiteNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsListNode createMapsListNode() {
		MapsListNodeImpl mapsListNode = new MapsListNodeImpl();
		return mapsListNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapNode createMapNode() {
		MapNodeImpl mapNode = new MapNodeImpl();
		return mapNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapLayerNode createAbstractMapLayerNode() {
		AbstractMapLayerNodeImpl abstractMapLayerNode = new AbstractMapLayerNodeImpl();
		return abstractMapLayerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerNode createCartesianTriangularMeshMapLayerNode() {
		CartesianTriangularMeshMapLayerNodeImpl cartesianTriangularMeshMapLayerNode = new CartesianTriangularMeshMapLayerNodeImpl();
		return cartesianTriangularMeshMapLayerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceEnvironmentUtilities createSurfaceEnvironmentUtilities() {
		SurfaceEnvironmentUtilitiesImpl surfaceEnvironmentUtilities = new SurfaceEnvironmentUtilitiesImpl();
		return surfaceEnvironmentUtilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentFacade createApogySurfaceEnvironmentFacade() {
		ApogySurfaceEnvironmentFacadeImpl apogySurfaceEnvironmentFacade = new ApogySurfaceEnvironmentFacadeImpl();
		return apogySurfaceEnvironmentFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f createColor3fFromString(EDataType eDataType, String initialValue) {
		return (Color3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColor3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentPackage getApogySurfaceEnvironmentPackage() {
		return (ApogySurfaceEnvironmentPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogySurfaceEnvironmentPackage getPackage() {
		return ApogySurfaceEnvironmentPackage.eINSTANCE;
	}

} //ApogySurfaceEnvironmentFactoryImpl
