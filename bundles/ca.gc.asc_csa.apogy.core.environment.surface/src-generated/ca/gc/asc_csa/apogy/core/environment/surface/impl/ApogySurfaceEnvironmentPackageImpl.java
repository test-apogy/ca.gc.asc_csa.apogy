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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
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
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceEnvironmentUtilities;
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
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.URLMapLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogySurfaceEnvironmentPackageImpl extends EPackageImpl implements ApogySurfaceEnvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceWorksiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapsListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapLayerPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularVolumeRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularRegionProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularRegionImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageMapLayerPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyTreeMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyTreeMapLayerNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshDerivedImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshSlopeImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshHeightImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineOfSightImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractShapeImageLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseShapeImageLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleShapeImageLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonShapeImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesPolygonShapeImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCartesianTriangularMeshMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshURLMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresOfInterestMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceWorksiteNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapsListNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMapLayerNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshMapLayerNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surfaceEnvironmentUtilitiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogySurfaceEnvironmentFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogySurfaceEnvironmentPackageImpl() {
		super(eNS_URI, ApogySurfaceEnvironmentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogySurfaceEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogySurfaceEnvironmentPackage init() {
		if (isInited) return (ApogySurfaceEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogySurfaceEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		ApogySurfaceEnvironmentPackageImpl theApogySurfaceEnvironmentPackage = (ApogySurfaceEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogySurfaceEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogySurfaceEnvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCoreEnvironmentPackage.eINSTANCE.eClass();
		ApogyCommonImagesPackage.eINSTANCE.eClass();
		ApogyCommonGeometryData3DPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogySurfaceEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theApogySurfaceEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogySurfaceEnvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogySurfaceEnvironmentPackage.eNS_URI, theApogySurfaceEnvironmentPackage);
		return theApogySurfaceEnvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceWorksite() {
		return surfaceWorksiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceWorksite_MapsList() {
		return (EReference)surfaceWorksiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSurfaceWorksite_CelestialBody() {
		return (EReference)surfaceWorksiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Transformation() {
		return (EReference)mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_Layers() {
		return (EReference)mapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMap_MapNode() {
		return (EReference)mapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapsList() {
		return mapsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapsList_Maps() {
		return (EReference)mapsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapsList_MapsListNode() {
		return (EReference)mapsListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMapLayer() {
		return abstractMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMapLayer_Map() {
		return (EReference)abstractMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMapLayer_AbstractMapLayerNode() {
		return (EReference)abstractMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapLayerPresentation() {
		return mapLayerPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapLayerPresentation_Visible() {
		return (EAttribute)mapLayerPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLayerPresentation_MapLayer() {
		return (EReference)mapLayerPresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLMapLayer() {
		return urlMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLMapLayer_Url() {
		return (EAttribute)urlMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transformation() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularRegion() {
		return rectangularRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularRegion_XMin() {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularRegion_XMax() {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularRegion_YMin() {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularRegion_YMax() {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularRegion_XDimension() {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularRegion_YDimension() {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangularRegion_LowerLeftCorner() {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangularRegion_UpperLeftCorner() {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangularRegion_LowerRightCorner() {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRectangularRegion_UpperRightCorner() {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularVolumeRegion() {
		return rectangularVolumeRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularVolumeRegion_ZMin() {
		return (EAttribute)rectangularVolumeRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularVolumeRegion_ZMax() {
		return (EAttribute)rectangularVolumeRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularVolumeRegion_ZDimension() {
		return (EAttribute)rectangularVolumeRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularRegionProvider() {
		return rectangularRegionProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRectangularRegionProvider__GetRegion() {
		return rectangularRegionProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularRegionImage() {
		return rectangularRegionImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRectangularRegionImage__GetRegionImage() {
		return rectangularRegionImageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRectangularRegionImage__GetResolution() {
		return rectangularRegionImageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageMapLayer() {
		return imageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMapLayer_Width() {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMapLayer_Height() {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMapLayer_Opaque() {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageMapLayer_Image() {
		return (EReference)imageMapLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageMapLayer_Legend() {
		return (EReference)imageMapLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMapLayer_Resolution() {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageMapLayer__UpdateImage__IProgressMonitor() {
		return imageMapLayerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageMapLayer__GetImageMapLayerRegion() {
		return imageMapLayerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageMapLayerPresentation() {
		return imageMapLayerPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMapLayerPresentation_Alpha() {
		return (EAttribute)imageMapLayerPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageMapLayerPresentation__GetImageMapLayer() {
		return imageMapLayerPresentationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURLImageMapLayer() {
		return urlImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURLImageMapLayer_LegendURL() {
		return (EAttribute)urlImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyTreeMapLayer() {
		return topologyTreeMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTreeMapLayer_TopologyTreeRoot() {
		return (EReference)topologyTreeMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyTreeMapLayerNode() {
		return topologyTreeMapLayerNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTreeMapLayerNode_TopologyTreeMapLayer() {
		return (EReference)topologyTreeMapLayerNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTreeMapLayerNode_TransientParent() {
		return (EReference)topologyTreeMapLayerNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshMapLayer() {
		return cartesianTriangularMeshMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshMapLayer_MeshIsDirty() {
		return (EAttribute)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshMapLayer_MapLayerPresentations() {
		return (EReference)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshMapLayer_TextureImage() {
		return (EReference)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode() {
		return (EReference)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianTriangularMeshMapLayer__GetCurrentMesh() {
		return cartesianTriangularMeshMapLayerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage() {
		return cartesianTriangularMeshMapLayerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshDerivedImageMapLayer() {
		return cartesianTriangularMeshDerivedImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution() {
		return (EAttribute)cartesianTriangularMeshDerivedImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer() {
		return (EReference)cartesianTriangularMeshDerivedImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshSlopeImageMapLayer() {
		return cartesianTriangularMeshSlopeImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshSlopeImageMapLayer_AutoScale() {
		return (EAttribute)cartesianTriangularMeshSlopeImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope() {
		return (EAttribute)cartesianTriangularMeshSlopeImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope() {
		return (EAttribute)cartesianTriangularMeshSlopeImageMapLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshDiscreteSlopeImageMapLayer() {
		return cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges() {
		return (EReference)cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshHeightImageMapLayer() {
		return cartesianTriangularMeshHeightImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshHeightImageMapLayer_AutoScale() {
		return (EAttribute)cartesianTriangularMeshHeightImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight() {
		return (EAttribute)cartesianTriangularMeshHeightImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight() {
		return (EAttribute)cartesianTriangularMeshHeightImageMapLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeRange() {
		return slopeRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeRange_SlopeLowerBound() {
		return (EAttribute)slopeRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeRange_SlopeUpperBound() {
		return (EAttribute)slopeRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeRange_Color() {
		return (EAttribute)slopeRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineOfSightImageMapLayer() {
		return lineOfSightImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_LineOfSightAvailableColor() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_LineOfSightNotAvailableColor() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineOfSightImageMapLayer_ObserverPose() {
		return (EReference)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_TargetHeightAboveGround() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_UseHeightPerpendicularToGround() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractShapeImageLayer() {
		return abstractShapeImageLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShapeImageLayer_ShapedFilled() {
		return (EAttribute)abstractShapeImageLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShapeImageLayer_Color() {
		return (EAttribute)abstractShapeImageLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShapeImageLayer_RequiredResolution() {
		return (EAttribute)abstractShapeImageLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipseShapeImageLayer() {
		return ellipseShapeImageLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseShapeImageLayer_EllipseWidth() {
		return (EAttribute)ellipseShapeImageLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseShapeImageLayer_EllipseHeight() {
		return (EAttribute)ellipseShapeImageLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseShapeImageLayer_ShowCenterLines() {
		return (EAttribute)ellipseShapeImageLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangleShapeImageLayer() {
		return rectangleShapeImageLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleShapeImageLayer_RectangleWidth() {
		return (EAttribute)rectangleShapeImageLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleShapeImageLayer_RectangleHeight() {
		return (EAttribute)rectangleShapeImageLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleShapeImageLayer_ShowCenterLines() {
		return (EAttribute)rectangleShapeImageLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonShapeImageMapLayer() {
		return polygonShapeImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolygonShapeImageMapLayer__GetVertices() {
		return polygonShapeImageMapLayerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesPolygonShapeImageMapLayer() {
		return cartesianCoordinatesPolygonShapeImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices() {
		return (EReference)cartesianCoordinatesPolygonShapeImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCartesianTriangularMeshMapLayer() {
		return basicCartesianTriangularMeshMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicCartesianTriangularMeshMapLayer_Mesh() {
		return (EReference)basicCartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshURLMapLayer() {
		return cartesianTriangularMeshURLMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshURLMapLayer_Mesh() {
		return (EReference)cartesianTriangularMeshURLMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesOfInterestMapLayer() {
		return featuresOfInterestMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturesOfInterestMapLayer_Features() {
		return (EReference)featuresOfInterestMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceWorksiteNode() {
		return surfaceWorksiteNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapsListNode() {
		return mapsListNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapsListNode_MapsList() {
		return (EReference)mapsListNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapNode() {
		return mapNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapNode_Map() {
		return (EReference)mapNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMapLayerNode() {
		return abstractMapLayerNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractMapLayerNode_AbstractMapLayer() {
		return (EReference)abstractMapLayerNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshMapLayerNode() {
		return cartesianTriangularMeshMapLayerNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer() {
		return cartesianTriangularMeshMapLayerNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurfaceEnvironmentUtilities() {
		return surfaceEnvironmentUtilitiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSurfaceEnvironmentUtilities__ConvertToJulianDate__Date() {
		return surfaceEnvironmentUtilitiesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSurfaceEnvironmentUtilities__ParseRightAscension__String() {
		return surfaceEnvironmentUtilitiesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSurfaceEnvironmentUtilities__ParseDegMinSec__String() {
		return surfaceEnvironmentUtilitiesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogySurfaceEnvironmentFacade() {
		return apogySurfaceEnvironmentFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__CreateEImage__List() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetBestResolutionRectangularRegionImage__List() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationImage__List() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetBestResolutionMapLayer__List() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetVisibleImageMapLayerPresentation__List() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogySurfaceEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh() {
		return apogySurfaceEnvironmentFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentFactory getApogySurfaceEnvironmentFactory() {
		return (ApogySurfaceEnvironmentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		surfaceWorksiteEClass = createEClass(SURFACE_WORKSITE);
		createEReference(surfaceWorksiteEClass, SURFACE_WORKSITE__MAPS_LIST);
		createEReference(surfaceWorksiteEClass, SURFACE_WORKSITE__CELESTIAL_BODY);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__TRANSFORMATION);
		createEReference(mapEClass, MAP__LAYERS);
		createEReference(mapEClass, MAP__MAP_NODE);

		mapsListEClass = createEClass(MAPS_LIST);
		createEReference(mapsListEClass, MAPS_LIST__MAPS);
		createEReference(mapsListEClass, MAPS_LIST__MAPS_LIST_NODE);

		abstractMapLayerEClass = createEClass(ABSTRACT_MAP_LAYER);
		createEReference(abstractMapLayerEClass, ABSTRACT_MAP_LAYER__MAP);
		createEReference(abstractMapLayerEClass, ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE);

		mapLayerPresentationEClass = createEClass(MAP_LAYER_PRESENTATION);
		createEAttribute(mapLayerPresentationEClass, MAP_LAYER_PRESENTATION__VISIBLE);
		createEReference(mapLayerPresentationEClass, MAP_LAYER_PRESENTATION__MAP_LAYER);

		urlMapLayerEClass = createEClass(URL_MAP_LAYER);
		createEAttribute(urlMapLayerEClass, URL_MAP_LAYER__URL);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__TRANSFORMATION);

		rectangularRegionEClass = createEClass(RECTANGULAR_REGION);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__XMIN);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__XMAX);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__YMIN);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__YMAX);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__XDIMENSION);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__YDIMENSION);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__LOWER_LEFT_CORNER);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__UPPER_LEFT_CORNER);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__LOWER_RIGHT_CORNER);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__UPPER_RIGHT_CORNER);

		rectangularVolumeRegionEClass = createEClass(RECTANGULAR_VOLUME_REGION);
		createEAttribute(rectangularVolumeRegionEClass, RECTANGULAR_VOLUME_REGION__ZMIN);
		createEAttribute(rectangularVolumeRegionEClass, RECTANGULAR_VOLUME_REGION__ZMAX);
		createEAttribute(rectangularVolumeRegionEClass, RECTANGULAR_VOLUME_REGION__ZDIMENSION);

		rectangularRegionProviderEClass = createEClass(RECTANGULAR_REGION_PROVIDER);
		createEOperation(rectangularRegionProviderEClass, RECTANGULAR_REGION_PROVIDER___GET_REGION);

		rectangularRegionImageEClass = createEClass(RECTANGULAR_REGION_IMAGE);
		createEOperation(rectangularRegionImageEClass, RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE);
		createEOperation(rectangularRegionImageEClass, RECTANGULAR_REGION_IMAGE___GET_RESOLUTION);

		imageMapLayerEClass = createEClass(IMAGE_MAP_LAYER);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__WIDTH);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__HEIGHT);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__OPAQUE);
		createEReference(imageMapLayerEClass, IMAGE_MAP_LAYER__IMAGE);
		createEReference(imageMapLayerEClass, IMAGE_MAP_LAYER__LEGEND);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__RESOLUTION);
		createEOperation(imageMapLayerEClass, IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR);
		createEOperation(imageMapLayerEClass, IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION);

		imageMapLayerPresentationEClass = createEClass(IMAGE_MAP_LAYER_PRESENTATION);
		createEAttribute(imageMapLayerPresentationEClass, IMAGE_MAP_LAYER_PRESENTATION__ALPHA);
		createEOperation(imageMapLayerPresentationEClass, IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER);

		urlImageMapLayerEClass = createEClass(URL_IMAGE_MAP_LAYER);
		createEAttribute(urlImageMapLayerEClass, URL_IMAGE_MAP_LAYER__LEGEND_URL);

		topologyTreeMapLayerEClass = createEClass(TOPOLOGY_TREE_MAP_LAYER);
		createEReference(topologyTreeMapLayerEClass, TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT);

		topologyTreeMapLayerNodeEClass = createEClass(TOPOLOGY_TREE_MAP_LAYER_NODE);
		createEReference(topologyTreeMapLayerNodeEClass, TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER);
		createEReference(topologyTreeMapLayerNodeEClass, TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT);

		cartesianTriangularMeshMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY);
		createEReference(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS);
		createEReference(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE);
		createEReference(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE);
		createEOperation(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH);
		createEOperation(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE);

		cartesianTriangularMeshDerivedImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshDerivedImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION);
		createEReference(cartesianTriangularMeshDerivedImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);

		cartesianTriangularMeshSlopeImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE);
		createEAttribute(cartesianTriangularMeshSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE);
		createEAttribute(cartesianTriangularMeshSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE);

		cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER);
		createEReference(cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES);

		cartesianTriangularMeshHeightImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshHeightImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE);
		createEAttribute(cartesianTriangularMeshHeightImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT);
		createEAttribute(cartesianTriangularMeshHeightImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT);

		slopeRangeEClass = createEClass(SLOPE_RANGE);
		createEAttribute(slopeRangeEClass, SLOPE_RANGE__SLOPE_LOWER_BOUND);
		createEAttribute(slopeRangeEClass, SLOPE_RANGE__SLOPE_UPPER_BOUND);
		createEAttribute(slopeRangeEClass, SLOPE_RANGE__COLOR);

		lineOfSightImageMapLayerEClass = createEClass(LINE_OF_SIGHT_IMAGE_MAP_LAYER);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR);
		createEReference(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND);

		abstractShapeImageLayerEClass = createEClass(ABSTRACT_SHAPE_IMAGE_LAYER);
		createEAttribute(abstractShapeImageLayerEClass, ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED);
		createEAttribute(abstractShapeImageLayerEClass, ABSTRACT_SHAPE_IMAGE_LAYER__COLOR);
		createEAttribute(abstractShapeImageLayerEClass, ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION);

		ellipseShapeImageLayerEClass = createEClass(ELLIPSE_SHAPE_IMAGE_LAYER);
		createEAttribute(ellipseShapeImageLayerEClass, ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_WIDTH);
		createEAttribute(ellipseShapeImageLayerEClass, ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_HEIGHT);
		createEAttribute(ellipseShapeImageLayerEClass, ELLIPSE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES);

		rectangleShapeImageLayerEClass = createEClass(RECTANGLE_SHAPE_IMAGE_LAYER);
		createEAttribute(rectangleShapeImageLayerEClass, RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH);
		createEAttribute(rectangleShapeImageLayerEClass, RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT);
		createEAttribute(rectangleShapeImageLayerEClass, RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES);

		polygonShapeImageMapLayerEClass = createEClass(POLYGON_SHAPE_IMAGE_MAP_LAYER);
		createEOperation(polygonShapeImageMapLayerEClass, POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES);

		cartesianCoordinatesPolygonShapeImageMapLayerEClass = createEClass(CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER);
		createEReference(cartesianCoordinatesPolygonShapeImageMapLayerEClass, CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES);

		basicCartesianTriangularMeshMapLayerEClass = createEClass(BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);
		createEReference(basicCartesianTriangularMeshMapLayerEClass, BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH);

		cartesianTriangularMeshURLMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER);
		createEReference(cartesianTriangularMeshURLMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH);

		featuresOfInterestMapLayerEClass = createEClass(FEATURES_OF_INTEREST_MAP_LAYER);
		createEReference(featuresOfInterestMapLayerEClass, FEATURES_OF_INTEREST_MAP_LAYER__FEATURES);

		surfaceWorksiteNodeEClass = createEClass(SURFACE_WORKSITE_NODE);

		mapsListNodeEClass = createEClass(MAPS_LIST_NODE);
		createEReference(mapsListNodeEClass, MAPS_LIST_NODE__MAPS_LIST);

		mapNodeEClass = createEClass(MAP_NODE);
		createEReference(mapNodeEClass, MAP_NODE__MAP);

		abstractMapLayerNodeEClass = createEClass(ABSTRACT_MAP_LAYER_NODE);
		createEReference(abstractMapLayerNodeEClass, ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER);

		cartesianTriangularMeshMapLayerNodeEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE);
		createEOperation(cartesianTriangularMeshMapLayerNodeEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);

		surfaceEnvironmentUtilitiesEClass = createEClass(SURFACE_ENVIRONMENT_UTILITIES);
		createEOperation(surfaceEnvironmentUtilitiesEClass, SURFACE_ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE);
		createEOperation(surfaceEnvironmentUtilitiesEClass, SURFACE_ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING);
		createEOperation(surfaceEnvironmentUtilitiesEClass, SURFACE_ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING);

		apogySurfaceEnvironmentFacadeEClass = createEClass(APOGY_SURFACE_ENVIRONMENT_FACADE);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST);
		createEOperation(apogySurfaceEnvironmentFacadeEClass, APOGY_SURFACE_ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH);

		// Create data types
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		color3fEDataType = createEDataType(COLOR3F);
		listEDataType = createEDataType(LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonImagesPackage theApogyCommonImagesPackage = (ApogyCommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonImagesPackage.eNS_URI);
		ApogyCommonTopologyPackage theApogyCommonTopologyPackage = (ApogyCommonTopologyPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyPackage.eNS_URI);
		ApogyCommonGeometryData3DPackage theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		surfaceWorksiteEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getWorksite());
		mapEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		mapEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		abstractMapLayerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		abstractMapLayerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		mapLayerPresentationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		mapLayerPresentationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		urlMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		rectangularRegionEClass.getESuperTypes().add(this.getRegion());
		rectangularVolumeRegionEClass.getESuperTypes().add(this.getRectangularRegion());
		rectangularRegionImageEClass.getESuperTypes().add(this.getRectangularRegionProvider());
		imageMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		imageMapLayerEClass.getESuperTypes().add(this.getRectangularRegionImage());
		imageMapLayerPresentationEClass.getESuperTypes().add(this.getMapLayerPresentation());
		imageMapLayerPresentationEClass.getESuperTypes().add(this.getRectangularRegionImage());
		urlImageMapLayerEClass.getESuperTypes().add(this.getImageMapLayer());
		urlImageMapLayerEClass.getESuperTypes().add(this.getURLMapLayer());
		topologyTreeMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		topologyTreeMapLayerNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		cartesianTriangularMeshMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		cartesianTriangularMeshDerivedImageMapLayerEClass.getESuperTypes().add(this.getImageMapLayer());
		cartesianTriangularMeshSlopeImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshDerivedImageMapLayer());
		cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshSlopeImageMapLayer());
		cartesianTriangularMeshHeightImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshDerivedImageMapLayer());
		slopeRangeEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		slopeRangeEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		lineOfSightImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshDerivedImageMapLayer());
		abstractShapeImageLayerEClass.getESuperTypes().add(this.getImageMapLayer());
		ellipseShapeImageLayerEClass.getESuperTypes().add(this.getAbstractShapeImageLayer());
		rectangleShapeImageLayerEClass.getESuperTypes().add(this.getAbstractShapeImageLayer());
		polygonShapeImageMapLayerEClass.getESuperTypes().add(this.getAbstractShapeImageLayer());
		cartesianCoordinatesPolygonShapeImageMapLayerEClass.getESuperTypes().add(this.getPolygonShapeImageMapLayer());
		basicCartesianTriangularMeshMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshMapLayer());
		cartesianTriangularMeshURLMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshMapLayer());
		cartesianTriangularMeshURLMapLayerEClass.getESuperTypes().add(this.getURLMapLayer());
		featuresOfInterestMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		featuresOfInterestMapLayerEClass.getESuperTypes().add(this.getRectangularRegionProvider());
		surfaceWorksiteNodeEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getWorksiteNode());
		mapsListNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		mapNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getTransformNode());
		abstractMapLayerNodeEClass.getESuperTypes().add(theApogyCommonTopologyPackage.getAggregateGroupNode());
		cartesianTriangularMeshMapLayerNodeEClass.getESuperTypes().add(this.getAbstractMapLayerNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(surfaceWorksiteEClass, SurfaceWorksite.class, "SurfaceWorksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurfaceWorksite_MapsList(), this.getMapsList(), null, "mapsList", null, 1, 1, SurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurfaceWorksite_CelestialBody(), theApogyCoreEnvironmentPackage.getCelestialBody(), null, "celestialBody", null, 1, 1, SurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Transformation(), theApogyCommonMathPackage.getMatrix4x4(), null, "transformation", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_Layers(), this.getAbstractMapLayer(), this.getAbstractMapLayer_Map(), "layers", null, 0, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_MapNode(), this.getMapNode(), null, "mapNode", null, 1, 1, Map.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mapsListEClass, MapsList.class, "MapsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapsList_Maps(), this.getMap(), null, "maps", null, 0, -1, MapsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapsList_MapsListNode(), this.getMapsListNode(), null, "mapsListNode", null, 1, 1, MapsList.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractMapLayerEClass, AbstractMapLayer.class, "AbstractMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMapLayer_Map(), this.getMap(), this.getMap_Layers(), "map", null, 0, 1, AbstractMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMapLayer_AbstractMapLayerNode(), this.getAbstractMapLayerNode(), null, "abstractMapLayerNode", null, 0, 1, AbstractMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mapLayerPresentationEClass, MapLayerPresentation.class, "MapLayerPresentation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapLayerPresentation_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, MapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapLayerPresentation_MapLayer(), this.getAbstractMapLayer(), null, "mapLayer", null, 0, 1, MapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlMapLayerEClass, URLMapLayer.class, "URLMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLMapLayer_Url(), theEcorePackage.getEString(), "url", null, 0, 1, URLMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Transformation(), theApogyCommonMathPackage.getMatrix4x4(), null, "transformation", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangularRegionEClass, RectangularRegion.class, "RectangularRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangularRegion_XMin(), theEcorePackage.getEDouble(), "xMin", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_XMax(), theEcorePackage.getEDouble(), "xMax", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_YMin(), theEcorePackage.getEDouble(), "yMin", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_YMax(), theEcorePackage.getEDouble(), "yMax", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_XDimension(), theEcorePackage.getEDouble(), "xDimension", null, 0, 1, RectangularRegion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_YDimension(), theEcorePackage.getEDouble(), "yDimension", null, 0, 1, RectangularRegion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_LowerLeftCorner(), theApogyCommonMathPackage.getTuple3d(), null, "lowerLeftCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_UpperLeftCorner(), theApogyCommonMathPackage.getTuple3d(), null, "upperLeftCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_LowerRightCorner(), theApogyCommonMathPackage.getTuple3d(), null, "lowerRightCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_UpperRightCorner(), theApogyCommonMathPackage.getTuple3d(), null, "upperRightCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rectangularVolumeRegionEClass, RectangularVolumeRegion.class, "RectangularVolumeRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangularVolumeRegion_ZMin(), theEcorePackage.getEDouble(), "zMin", "0.0", 0, 1, RectangularVolumeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularVolumeRegion_ZMax(), theEcorePackage.getEDouble(), "zMax", "0.0", 0, 1, RectangularVolumeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularVolumeRegion_ZDimension(), theEcorePackage.getEDouble(), "zDimension", null, 0, 1, RectangularVolumeRegion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rectangularRegionProviderEClass, RectangularRegionProvider.class, "RectangularRegionProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRectangularRegionProvider__GetRegion(), this.getRectangularRegion(), "getRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rectangularRegionImageEClass, RectangularRegionImage.class, "RectangularRegionImage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRectangularRegionImage__GetRegionImage(), theApogyCommonImagesPackage.getAbstractEImage(), "getRegionImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRectangularRegionImage__GetResolution(), theEcorePackage.getEDouble(), "getResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imageMapLayerEClass, ImageMapLayer.class, "ImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageMapLayer_Width(), theEcorePackage.getEDouble(), "width", "0.0", 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMapLayer_Height(), theEcorePackage.getEDouble(), "height", "0.0", 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMapLayer_Opaque(), theEcorePackage.getEBoolean(), "opaque", "true", 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageMapLayer_Image(), theApogyCommonImagesPackage.getAbstractEImage(), null, "image", null, 1, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageMapLayer_Legend(), theApogyCommonImagesPackage.getAbstractEImage(), null, "legend", null, 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMapLayer_Resolution(), theEcorePackage.getEDouble(), "resolution", null, 0, 1, ImageMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getImageMapLayer__UpdateImage__IProgressMonitor(), null, "updateImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "progressMonitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageMapLayer__GetImageMapLayerRegion(), this.getRectangularRegion(), "getImageMapLayerRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imageMapLayerPresentationEClass, ImageMapLayerPresentation.class, "ImageMapLayerPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageMapLayerPresentation_Alpha(), theEcorePackage.getEFloat(), "alpha", "1.0", 0, 1, ImageMapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImageMapLayerPresentation__GetImageMapLayer(), this.getImageMapLayer(), "getImageMapLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(urlImageMapLayerEClass, URLImageMapLayer.class, "URLImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLImageMapLayer_LegendURL(), theEcorePackage.getEString(), "legendURL", null, 0, 1, URLImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyTreeMapLayerEClass, TopologyTreeMapLayer.class, "TopologyTreeMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyTreeMapLayer_TopologyTreeRoot(), this.getTopologyTreeMapLayerNode(), this.getTopologyTreeMapLayerNode_TopologyTreeMapLayer(), "topologyTreeRoot", null, 0, 1, TopologyTreeMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyTreeMapLayerNodeEClass, TopologyTreeMapLayerNode.class, "TopologyTreeMapLayerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyTreeMapLayerNode_TopologyTreeMapLayer(), this.getTopologyTreeMapLayer(), this.getTopologyTreeMapLayer_TopologyTreeRoot(), "topologyTreeMapLayer", null, 0, 1, TopologyTreeMapLayerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTreeMapLayerNode_TransientParent(), theApogyCommonTopologyPackage.getNode(), null, "transientParent", null, 0, 1, TopologyTreeMapLayerNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshMapLayerEClass, CartesianTriangularMeshMapLayer.class, "CartesianTriangularMeshMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshMapLayer_MeshIsDirty(), theEcorePackage.getEBoolean(), "meshIsDirty", "true", 0, 1, CartesianTriangularMeshMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshMapLayer_MapLayerPresentations(), this.getMapLayerPresentation(), null, "mapLayerPresentations", null, 0, -1, CartesianTriangularMeshMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshMapLayer_TextureImage(), theApogyCommonImagesPackage.getAbstractEImage(), null, "textureImage", null, 0, 1, CartesianTriangularMeshMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode(), this.getCartesianTriangularMeshMapLayerNode(), null, "cartesianTriangularMeshMapLayerNode", null, 0, 1, CartesianTriangularMeshMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCartesianTriangularMeshMapLayer__GetCurrentMesh(), theApogyCommonGeometryData3DPackage.getCartesianTriangularMesh(), "getCurrentMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage(), null, "forceUpdateTextureImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cartesianTriangularMeshDerivedImageMapLayerEClass, CartesianTriangularMeshDerivedImageMapLayer.class, "CartesianTriangularMeshDerivedImageMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution(), theEcorePackage.getEDouble(), "requiredResolution", "1.0", 0, 1, CartesianTriangularMeshDerivedImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer(), this.getCartesianTriangularMeshMapLayer(), null, "cartesianTriangularMeshMapLayer", null, 0, 1, CartesianTriangularMeshDerivedImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshSlopeImageMapLayerEClass, CartesianTriangularMeshSlopeImageMapLayer.class, "CartesianTriangularMeshSlopeImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshSlopeImageMapLayer_AutoScale(), theEcorePackage.getEBoolean(), "autoScale", "true", 0, 1, CartesianTriangularMeshSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope(), theEcorePackage.getEDouble(), "minimumSlope", "0.0", 0, 1, CartesianTriangularMeshSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope(), theEcorePackage.getEDouble(), "maximumSlope", "50.0", 0, 1, CartesianTriangularMeshSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass, CartesianTriangularMeshDiscreteSlopeImageMapLayer.class, "CartesianTriangularMeshDiscreteSlopeImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges(), this.getSlopeRange(), null, "slopeRanges", null, 0, -1, CartesianTriangularMeshDiscreteSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshHeightImageMapLayerEClass, CartesianTriangularMeshHeightImageMapLayer.class, "CartesianTriangularMeshHeightImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshHeightImageMapLayer_AutoScale(), theEcorePackage.getEBoolean(), "autoScale", "true", 0, 1, CartesianTriangularMeshHeightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight(), theEcorePackage.getEDouble(), "minimumHeight", "0.0", 0, 1, CartesianTriangularMeshHeightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight(), theEcorePackage.getEDouble(), "maximumHeight", "50.0", 0, 1, CartesianTriangularMeshHeightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slopeRangeEClass, SlopeRange.class, "SlopeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlopeRange_SlopeLowerBound(), theEcorePackage.getEDouble(), "slopeLowerBound", "0", 0, 1, SlopeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlopeRange_SlopeUpperBound(), theEcorePackage.getEDouble(), "slopeUpperBound", "10", 0, 1, SlopeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlopeRange_Color(), this.getColor3f(), "color", "1.0,1.0,1.0", 0, 1, SlopeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineOfSightImageMapLayerEClass, LineOfSightImageMapLayer.class, "LineOfSightImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineOfSightImageMapLayer_LineOfSightAvailableColor(), this.getColor3f(), "lineOfSightAvailableColor", "0.0,1.0,0.0", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineOfSightImageMapLayer_LineOfSightNotAvailableColor(), this.getColor3f(), "lineOfSightNotAvailableColor", "1.0,0.0,0.0", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineOfSightImageMapLayer_ObserverPose(), theApogyCommonMathPackage.getMatrix4x4(), null, "observerPose", null, 1, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineOfSightImageMapLayer_TargetHeightAboveGround(), theEcorePackage.getEDouble(), "targetHeightAboveGround", "1.0", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineOfSightImageMapLayer_UseHeightPerpendicularToGround(), theEcorePackage.getEBoolean(), "useHeightPerpendicularToGround", "false", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractShapeImageLayerEClass, AbstractShapeImageLayer.class, "AbstractShapeImageLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractShapeImageLayer_ShapedFilled(), theEcorePackage.getEBoolean(), "shapedFilled", "false", 0, 1, AbstractShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShapeImageLayer_Color(), this.getColor3f(), "color", "0.0,1.0,0.0", 0, 1, AbstractShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShapeImageLayer_RequiredResolution(), theEcorePackage.getEDouble(), "requiredResolution", "1.0", 0, 1, AbstractShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseShapeImageLayerEClass, EllipseShapeImageLayer.class, "EllipseShapeImageLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEllipseShapeImageLayer_EllipseWidth(), theEcorePackage.getEDouble(), "ellipseWidth", "1.0", 0, 1, EllipseShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipseShapeImageLayer_EllipseHeight(), theEcorePackage.getEDouble(), "ellipseHeight", "1.0", 0, 1, EllipseShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipseShapeImageLayer_ShowCenterLines(), theEcorePackage.getEBoolean(), "showCenterLines", "true", 0, 1, EllipseShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleShapeImageLayerEClass, RectangleShapeImageLayer.class, "RectangleShapeImageLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangleShapeImageLayer_RectangleWidth(), theEcorePackage.getEDouble(), "rectangleWidth", "1.0", 0, 1, RectangleShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleShapeImageLayer_RectangleHeight(), theEcorePackage.getEDouble(), "rectangleHeight", "1.0", 0, 1, RectangleShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleShapeImageLayer_ShowCenterLines(), theEcorePackage.getEBoolean(), "showCenterLines", "true", 0, 1, RectangleShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonShapeImageMapLayerEClass, PolygonShapeImageMapLayer.class, "PolygonShapeImageMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPolygonShapeImageMapLayer__GetVertices(), null, "getVertices", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(theApogyCommonMathPackage.getTuple3d());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(cartesianCoordinatesPolygonShapeImageMapLayerEClass, CartesianCoordinatesPolygonShapeImageMapLayer.class, "CartesianCoordinatesPolygonShapeImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices(), theApogyCommonMathPackage.getTuple3d(), null, "polygonVertices", null, 0, -1, CartesianCoordinatesPolygonShapeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicCartesianTriangularMeshMapLayerEClass, BasicCartesianTriangularMeshMapLayer.class, "BasicCartesianTriangularMeshMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicCartesianTriangularMeshMapLayer_Mesh(), theApogyCommonGeometryData3DPackage.getCartesianTriangularMesh(), null, "mesh", null, 0, 1, BasicCartesianTriangularMeshMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshURLMapLayerEClass, CartesianTriangularMeshURLMapLayer.class, "CartesianTriangularMeshURLMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianTriangularMeshURLMapLayer_Mesh(), theApogyCommonGeometryData3DPackage.getCartesianTriangularMesh(), null, "mesh", null, 0, 1, CartesianTriangularMeshURLMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresOfInterestMapLayerEClass, FeaturesOfInterestMapLayer.class, "FeaturesOfInterestMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturesOfInterestMapLayer_Features(), theApogyCorePackage.getFeatureOfInterestList(), null, "features", null, 1, 1, FeaturesOfInterestMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surfaceWorksiteNodeEClass, SurfaceWorksiteNode.class, "SurfaceWorksiteNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mapsListNodeEClass, MapsListNode.class, "MapsListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapsListNode_MapsList(), this.getMapsList(), null, "mapsList", null, 0, 1, MapsListNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapNodeEClass, MapNode.class, "MapNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapNode_Map(), this.getMap(), null, "map", null, 0, 1, MapNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMapLayerNodeEClass, AbstractMapLayerNode.class, "AbstractMapLayerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMapLayerNode_AbstractMapLayer(), this.getAbstractMapLayer(), null, "abstractMapLayer", null, 0, 1, AbstractMapLayerNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshMapLayerNodeEClass, CartesianTriangularMeshMapLayerNode.class, "CartesianTriangularMeshMapLayerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer(), this.getCartesianTriangularMeshMapLayer(), "getCartesianTriangularMeshMapLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(surfaceEnvironmentUtilitiesEClass, SurfaceEnvironmentUtilities.class, "SurfaceEnvironmentUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSurfaceEnvironmentUtilities__ConvertToJulianDate__Date(), theEcorePackage.getEDouble(), "convertToJulianDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSurfaceEnvironmentUtilities__ParseRightAscension__String(), theEcorePackage.getEFloat(), "parseRightAscension", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "rightAscensionString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theApogyCommonEMFPackage.getException());

		op = initEOperation(getSurfaceEnvironmentUtilities__ParseDegMinSec__String(), theEcorePackage.getEFloat(), "parseDegMinSec", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "degMinSecAngleString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apogySurfaceEnvironmentFacadeEClass, ApogySurfaceEnvironmentFacade.class, "ApogySurfaceEnvironmentFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogySurfaceEnvironmentFacade__CreateEImage__List(), theApogyCommonImagesPackage.getAbstractEImage(), "createEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getRectangularRegionImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionImages", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion(), null, "getAbsoluteRectangularRegionCorners", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theApogyCommonMathPackage.getTuple3d());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetBestResolutionRectangularRegionImage__List(), this.getRectangularRegionImage(), "getBestResolutionRectangularRegionImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getRectangularRegionImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionImages", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d(), null, "getRectangularRegionExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegionProvider(), "rectangularRegionProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d(), null, "getRectangularRegionImageExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegionImage(), "rectangularRegionImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d(), null, "getRectangularRegionExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getRectangularRegionProvider());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionProviders", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d(), null, "getRectangularRegionImageExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getRectangularRegionImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion(), theEcorePackage.getEBoolean(), "fitsInside", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionA", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionB", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4(), theEcorePackage.getEBoolean(), "intersects", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionA", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionB", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getMatrix4x4(), "transformAToB", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d(), null, "getImageMapLayerPresentationExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageMapLayerPresentation(), "imageMapLayerPresentation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d(), null, "getImageMapLayerPresentationExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationImage__List(), theApogyCommonImagesPackage.getAbstractEImage(), "getImageMapLayerPresentationImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetBestResolutionMapLayer__List(), this.getImageMapLayerPresentation(), "getBestResolutionMapLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetVisibleImageMapLayerPresentation__List(), null, "getVisibleImageMapLayerPresentation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogySurfaceEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh(), this.getRectangularVolumeRegion(), "getRectangularVolumeRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonGeometryData3DPackage.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogySurfaceEnvironment",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogySurfaceEnvironment",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.surface/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.surface.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment"
		   });	
		addAnnotation
		  (surfaceWorksiteEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nSurface Worksite\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getSurfaceWorksite_MapsList(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getSurfaceWorksite_CelestialBody(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe body on which the Surface Worksite is located.",
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (mapEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nMaps and Layers\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getMapsList_MapsListNode(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (abstractMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A layer representing a terrain map."
		   });	
		addAnnotation
		  (getAbstractMapLayer_Map(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getAbstractMapLayer_AbstractMapLayerNode(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (mapLayerPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class representing presentation attributes that are associated to a AbstractMapLayer."
		   });	
		addAnnotation
		  (getMapLayerPresentation_Visible(), 
		   source, 
		   new String[] {
			 "documentation", "Visibility",
			 "notify", "true",
			 "propertyCategory", "PRESENTATION_SETTINGS"
		   });	
		addAnnotation
		  (urlMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Map Layer containing a URL to some data."
		   });	
		addAnnotation
		  (getURLMapLayer_Url(), 
		   source, 
		   new String[] {
			 "propertyCategory", "URL"
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a Region."
		   });	
		addAnnotation
		  (getRegion_Transformation(), 
		   source, 
		   new String[] {
			 "documentation", "Transform that expresses the origin of the region relative to the worksite."
		   });	
		addAnnotation
		  (rectangularRegionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a 2D rectangular region in the XY Plane."
		   });	
		addAnnotation
		  (getRectangularRegion_XMin(), 
		   source, 
		   new String[] {
			 "documentation", "Minimum X coordinate on the X axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_XMax(), 
		   source, 
		   new String[] {
			 "documentation", "Maximum X coordinate on the X axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_YMin(), 
		   source, 
		   new String[] {
			 "documentation", "Minimum X coordinate on the Y axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_YMax(), 
		   source, 
		   new String[] {
			 "documentation", "Maximum X coordinate on the Y axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_XDimension(), 
		   source, 
		   new String[] {
			 "documentation", "Dimension along the X axis.",
			 "propertyCategory", "EXTENT_SIZES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_YDimension(), 
		   source, 
		   new String[] {
			 "documentation", "Dimension along the Y axis.",
			 "propertyCategory", "EXTENT_SIZES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (rectangularVolumeRegionEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a 3D rectangular volume."
		   });	
		addAnnotation
		  (getRectangularVolumeRegion_ZMin(), 
		   source, 
		   new String[] {
			 "documentation", "Minimum Z coordinate on the Z axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangularVolumeRegion_ZMax(), 
		   source, 
		   new String[] {
			 "documentation", "Maximum Z coordinate on the Z axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangularVolumeRegion_ZDimension(), 
		   source, 
		   new String[] {
			 "documentation", "Dimension along the Z axis.",
			 "propertyCategory", "EXTENT_SIZES",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (rectangularRegionProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "Interface that provides a RectangularRegion."
		   });	
		addAnnotation
		  (getRectangularRegionProvider__GetRegion(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the RectangularRegion defined by the object.\n@return The RectangularRegion defined by the object, never null."
		   });	
		addAnnotation
		  (rectangularRegionImageEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines a rectangular region covered by an image."
		   });	
		addAnnotation
		  (getRectangularRegionImage__GetRegionImage(), 
		   source, 
		   new String[] {
			 "documentation", "Return the image associated with this region.\n@return The image, can be null."
		   });	
		addAnnotation
		  (getRectangularRegionImage__GetResolution(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the image resolution.\n@return The resolution, in meters / pixel, or -1 if not defined.",
			 "apogy_units", "m/pixel"
		   });	
		addAnnotation
		  (imageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Map Layer containing a 2D image."
		   });	
		addAnnotation
		  (getImageMapLayer__UpdateImage__IProgressMonitor(), 
		   source, 
		   new String[] {
			 "documentation", "Update the image using the image parameters."
		   });	
		addAnnotation
		  (getImageMapLayer__GetImageMapLayerRegion(), 
		   source, 
		   new String[] {
			 "documentation", "Return the RectangularRegion represented by this ImageMapLayer."
		   });	
		addAnnotation
		  (getImageMapLayer_Width(), 
		   source, 
		   new String[] {
			 "documentation", "The width of the region covered by the map, in meters.",
			 "property", "Editable",
			 "propertyCategory", "SIZE_AND_RESOLUTION",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getImageMapLayer_Height(), 
		   source, 
		   new String[] {
			 "documentation", "The height of the region covered by the map, in meters.",
			 "property", "Editable",
			 "propertyCategory", "SIZE_AND_RESOLUTION",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getImageMapLayer_Opaque(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the map is opaque (i.e. cannot be superimposed on other ImageMapLayer."
		   });	
		addAnnotation
		  (getImageMapLayer_Image(), 
		   source, 
		   new String[] {
			 "documentation", "The image.",
			 "propertyCategory", "IMAGES"
		   });	
		addAnnotation
		  (getImageMapLayer_Legend(), 
		   source, 
		   new String[] {
			 "documentation", "An image containing the legend associated with the image.",
			 "propertyCategory", "IMAGES"
		   });	
		addAnnotation
		  (getImageMapLayer_Resolution(), 
		   source, 
		   new String[] {
			 "documentation", "The resolution, in meters / pixels",
			 "property", "Readonly",
			 "propertyCategory", "SIZE_AND_RESOLUTION",
			 "apogy_units", "m/pixel"
		   });	
		addAnnotation
		  (imageMapLayerPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Presentation properties associated with an Image Layer."
		   });	
		addAnnotation
		  (getImageMapLayerPresentation__GetImageMapLayer(), 
		   source, 
		   new String[] {
			 "documentation", " Operation that return the Image Map Layer to which this presentation is associated."
		   });	
		addAnnotation
		  (getImageMapLayerPresentation_Alpha(), 
		   source, 
		   new String[] {
			 "documentation", "The alpha to use to display this layer, from fully opaque (1.0f) to fully transparent (0.0f).",
			 "notify", "true",
			 "propertyCategory", "PRESENTATION_SETTINGS"
		   });	
		addAnnotation
		  (urlImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "ImageMapLayer that refers to an image at a URL"
		   });	
		addAnnotation
		  (getURLImageMapLayer_LegendURL(), 
		   source, 
		   new String[] {
			 "documentation", "URL to the Image Map Layer legend.",
			 "propertyCategory", "URL"
		   });	
		addAnnotation
		  (topologyTreeMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A map Layer that contains an arbitray topology tree."
		   });	
		addAnnotation
		  (getTopologyTreeMapLayer_TopologyTreeRoot(), 
		   source, 
		   new String[] {
			 "documentation", "The root of the topology contained in this layer.",
			 "children", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (topologyTreeMapLayerNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Specialized GroupNode which parent node is overloarded to make it transient.\nThis is necessary to avoid dangling exceptions."
		   });	
		addAnnotation
		  (cartesianTriangularMeshMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract base class of all Cartesian Triangular Mesh Map Layers"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer__GetCurrentMesh(), 
		   source, 
		   new String[] {
			 "documentation", "Operation that returns the CartesianTriangularMesh associated with this layer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage(), 
		   source, 
		   new String[] {
			 "documentation", "Forces the texture image projected onto the mesh to be updated."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_MeshIsDirty(), 
		   source, 
		   new String[] {
			 "documentation", "Whether of not the current mesh needs to be refreshed.",
			 "property", "None",
			 "propertyCategory", "TRIANGULAR_MESH"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_MapLayerPresentations(), 
		   source, 
		   new String[] {
			 "documentation", "A list of map layer presentation associated with this CartesianTriangularMeshMapLayer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_TextureImage(), 
		   source, 
		   new String[] {
			 "documentation", "The texture currently displayed on top of the mesh layer.",
			 "children", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode(), 
		   source, 
		   new String[] {
			 "documentation", "The node representing this layer in the topology.",
			 "property", "None"
		   });	
		addAnnotation
		  (cartesianTriangularMeshDerivedImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract class defining an ImageMapLayer for which the image is derived from a Mesh."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution(), 
		   source, 
		   new String[] {
			 "documentation", "The required resolution, in meters / pixels",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "apogy_units", "m/pixel"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer(), 
		   source, 
		   new String[] {
			 "documentation", "The map layer containing the mesh for which to generate the slope map.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (cartesianTriangularMeshSlopeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialized ImageMapLayer that generate a slope map image associated with a CartesianTriangularMeshMapLayer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshSlopeImageMapLayer_AutoScale(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to use autoscalling to generate the color scale.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope(), 
		   source, 
		   new String[] {
			 "documentation", "The minimum slope to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope(), 
		   source, 
		   new String[] {
			 "documentation", "The maximum slope to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialized CartesianTriangularMeshSlopeImageMapLayer that generate a slope with discrete slope intervals."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges(), 
		   source, 
		   new String[] {
			 "documentation", "The range of slope for which to generate colors."
		   });	
		addAnnotation
		  (cartesianTriangularMeshHeightImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", " A specialized ImageMapLayer that generate a height map image associated with a CartesianTriangularMeshMapLayer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshHeightImageMapLayer_AutoScale(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to use autoscalling to generate the color scale.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight(), 
		   source, 
		   new String[] {
			 "documentation", "The minimum height to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight(), 
		   source, 
		   new String[] {
			 "documentation", "The maximum height to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (slopeRangeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class defining a slope range and its associated color."
		   });	
		addAnnotation
		  (getSlopeRange_SlopeLowerBound(), 
		   source, 
		   new String[] {
			 "documentation", "Lower bound of the slope range. Always positive",
			 "property", "Editable",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (getSlopeRange_SlopeUpperBound(), 
		   source, 
		   new String[] {
			 "documentation", "Upper bound of the slope range. Always positive, and should be larger than slopeLower.",
			 "property", "Editable",
			 "apogy_units", "deg"
		   });	
		addAnnotation
		  (getSlopeRange_Color(), 
		   source, 
		   new String[] {
			 "documentation", "The color to use for this slope range.",
			 "property", "Editable"
		   });	
		addAnnotation
		  (lineOfSightImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialized CartesianTriangularMeshDerivedImageMapLayer that generate a image showing wether or not line of sight is present\nbetween a point above the mesh and a specified fixed location."
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_LineOfSightAvailableColor(), 
		   source, 
		   new String[] {
			 "documentation", "Color to use to mark line of sigh is available.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_LineOfSightNotAvailableColor(), 
		   source, 
		   new String[] {
			 "documentation", "Color to use to mark line of sigh is NOT available.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_ObserverPose(), 
		   source, 
		   new String[] {
			 "documentation", "The pose of the observer with which we want line of sight.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_TargetHeightAboveGround(), 
		   source, 
		   new String[] {
			 "documentation", "The height of target above ground.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_UseHeightPerpendicularToGround(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not find each target position using the local normal.\nUsing the local normal requires more processing time.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (abstractShapeImageLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class of image map layer that represent a 2D shape."
		   });	
		addAnnotation
		  (getAbstractShapeImageLayer_ShapedFilled(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the shape should be drawn as a filled polygon.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractShapeImageLayer_Color(), 
		   source, 
		   new String[] {
			 "documentation", "Color to use to draw the polygon and fill it is required.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractShapeImageLayer_RequiredResolution(), 
		   source, 
		   new String[] {
			 "documentation", "The required resolution, in meters / pixels",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "apogy_units", "m/pixel"
		   });	
		addAnnotation
		  (ellipseShapeImageLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "An image map layer representing an ellipse."
		   });	
		addAnnotation
		  (getEllipseShapeImageLayer_EllipseWidth(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "ELLIPSE_SETTINGS",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getEllipseShapeImageLayer_EllipseHeight(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "ELLIPSE_SETTINGS",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getEllipseShapeImageLayer_ShowCenterLines(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "ELLIPSE_SETTINGS"
		   });	
		addAnnotation
		  (rectangleShapeImageLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "An image map layer representing an ellipse."
		   });	
		addAnnotation
		  (getRectangleShapeImageLayer_RectangleWidth(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "RECTANGLE_SETTINGS",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangleShapeImageLayer_RectangleHeight(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "RECTANGLE_SETTINGS",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRectangleShapeImageLayer_ShowCenterLines(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "RECTANGLE_SETTINGS"
		   });	
		addAnnotation
		  (polygonShapeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract base class of Image Map Layer that are defined by a series of vertices."
		   });	
		addAnnotation
		  (getPolygonShapeImageMapLayer__GetVertices(), 
		   source, 
		   new String[] {
			 "documentation", " Returns the list of vertices required to draw the polygon."
		   });	
		addAnnotation
		  (cartesianCoordinatesPolygonShapeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "PolygonShapeImageMapLayer defined by a list of cartesian coordinates."
		   });	
		addAnnotation
		  (basicCartesianTriangularMeshMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Map Layer that contains a Cartesian Triangular Mesh."
		   });	
		addAnnotation
		  (getBasicCartesianTriangularMeshMapLayer_Mesh(), 
		   source, 
		   new String[] {
			 "property", "Readonly",
			 "propertyCategory", "TRIANGULAR_MESH"
		   });	
		addAnnotation
		  (cartesianTriangularMeshURLMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Map Layer that contains a URL to a Cartesian Triangular Mesh."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshURLMapLayer_Mesh(), 
		   source, 
		   new String[] {
			 "property", "Readonly",
			 "propertyCategory", "TRIANGULAR_MESH",
			 "children", "true"
		   });	
		addAnnotation
		  (featuresOfInterestMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Map Layer that contains Feature Of Interest."
		   });	
		addAnnotation
		  (surfaceWorksiteNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nSpecific Topology Nodes.\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (cartesianTriangularMeshMapLayerNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Specialized Node used to represent a CartesianTriangularMeshMapLayer in the topology."
		   });	
		addAnnotation
		  (surfaceEnvironmentUtilitiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Utilities class providing conversion methods."
		   });	
		addAnnotation
		  (getSurfaceEnvironmentUtilities__ConvertToJulianDate__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Convert from Date (UTC) to Julian.\nUses formula found at http://en.wikipedia.org/wiki/Julian_date#cite_note-12"
		   });	
		addAnnotation
		  (getSurfaceEnvironmentUtilities__ParseRightAscension__String(), 
		   source, 
		   new String[] {
			 "documentation", "Method that parses Right Ascension angle expressed in\nHH:mm:ss format and return an angle in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getSurfaceEnvironmentUtilities__ParseDegMinSec__String(), 
		   source, 
		   new String[] {
			 "documentation", "Method that parses an angle expressed in deg:mm:ss format\nand return an angle in radians.",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (apogySurfaceEnvironmentFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A class providing utilities methods to create fully initialze object."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__CreateEImage__List(), 
		   source, 
		   new String[] {
			 "documentation", "Assembles a list of ImageMapLayer into a single eImage reference to the Worksite frame.\nNote that only X,Y and Rz are used in transformation applied between ImageMapLayer and the worksite\norigin."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion(), 
		   source, 
		   new String[] {
			 "documentation", "Return a list containing the position of the 4 corners of the specified ImageMapLayer\n@param imageMapLayer The specified ImageMapLayer.\n@return List containing the position (in the worksite frame) of the four corners of the ImageMapLayer.\nThe list contains : lowerLeftCorner, lowerRightCorner, upperRightCorner and upperLeftCorner."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetBestResolutionRectangularRegionImage__List(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the ImageMapLayer with the highest resolution (minimum meters/pixel).\n@return The ImageMapLayer with the highest resolution (minimum meters/pixel)"
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the lower left and upper right corners of a specified RectangularRegionProvider.\n@param rectangularRegionProvider The specified RectangularRegionProvider.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the lower left and upper right corners of a specified ImageMapLayer.\n@param imageMapLayer The specified ImageMapLayer.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates.\nTODO DEPRECATE - REMOVE"
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "Return  the lower left and upper right corners of the region spanned by a list of RectangularRegionProviders.\n@param rectangularRegionProviders The list of RectangularRegionProviders.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "Return  the lower left and upper right corners of the region spanned by a list of a ImageMapLayer.\n@param The list of ImageMapLayer.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates.\nTODO DEPRECATE - REMOVE"
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether rectangularRegionA fits entirely in rectangularRegionB.\nThe current implementation does not take into account the Transform.\n@param rectangularRegionA The first RectangularRegion.\n@param rectangularRegionB The second RectangularRegion.\n@return True if rectangularRegionA fits in rectangularRegionB, false otherwise."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether two RectangularRegion intersects.\nreference frame.\n@param rectangularRegionA The first RectangularRegion.\n@param transformAToB The transformation (expressed as a 4x4 matrix that expresses region A into region B)\n@param rectangularRegionB The second RectangularRegion.\n@return True if rectangularRegionA intersects rectangularRegionB, false otherwise."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetImageMapLayerPresentationImage__List(), 
		   source, 
		   new String[] {
			 "documentation", "Returns an image representing the assembly of the specified list of ImageMapLayerPresentation.\n@param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.\n@return The image representing the specified list of ImageMapLayerPresentation."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetBestResolutionMapLayer__List(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the ImageMapLayerPresentation with the highest resolution (minimum meters/pixel).\n@return The ImageMapLayerPresentation with the highest resolution (minimum meters/pixel)"
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetVisibleImageMapLayerPresentation__List(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the list of visible ImageMapLayerPresentation from\"\" a specified imageMapLayerPresentations.\n@param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.\n@return The list of visible ImageMapLayerPresentation."
		   });	
		addAnnotation
		  (getApogySurfaceEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the RectangularVolumeRegion bounding a triangular mesh.\n@param mesh The triangular mesh.\n@return The RectangularVolumeRegion."
		   });
	}

} //ApogySurfaceEnvironmentPackageImpl
