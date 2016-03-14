package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

import javax.vecmath.GVector;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector2d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshPolygonSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetShapeSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPlane;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinatesMesher;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizer;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshPolygonSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CubeSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DelaunayMesher;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapMesher;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMapSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.KDTreeBasedPointLocator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.MeshLocalizer;
import ca.gc.asc_csa.apogy.common.geometry.data3d.MeshSmoother;
import ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud;
import ca.gc.asc_csa.apogy.common.geometry.data3d.OutlierFilter;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker;
import ca.gc.asc_csa.apogy.common.geometry.data3d.RGBAColor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinatesMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.TriangleEdgeLengthTriangularMeshFilter;
import ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshNormalsCalculator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshToNormalPointCloud;
import ca.gc.asc_csa.apogy.common.geometry.data3d.UniquePointsFilter;
import ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DPackageImpl extends EPackageImpl implements ApogyCommonGeometryData3DPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianPolygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalPolygonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalTriangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianPositionCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbaColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coloredCartesianPositionCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coloredCartesianTriangularMeshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshColorizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshColorizerBySlopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianOrientationCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCartesianCoordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coloredCartesianCoordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetExtentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalElevationMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesMeshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalCoordinatesSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalCoordinatesMeshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphericalTriangularMeshEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sphereSamplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cubeSamplingShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesSetShapeSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesMeshSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesMeshPolygonSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshPolygonSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianPositionCoordinatesMesherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalPointCloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointLocatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kdTreeBasedPointLocatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshLocalizerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delaunayMesherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalElevationMapMesherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digitalElevationMapSamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangularMeshNormalsCalculatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangularMeshToNormalPointCloudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniquePointsFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleEdgeLengthTriangularMeshFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outlierFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meshSmootherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voxelBased3DPointCloudResamplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rigidBodyPoseTrackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonGeometryData3DFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionMarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data3DIOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass data3DUtilsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cartesianAxisEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cartesianPlaneEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector2dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType point3dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType matrix4dEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gVectorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortedSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eListEDataType = null;

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
	private EDataType outputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType inputStreamEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ioExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType illegalArgumentExceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doubleArrayOfArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intArrayEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonGeometryData3DPackageImpl() {
		super(eNS_URI, ApogyCommonGeometryData3DFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonGeometryData3DPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonGeometryData3DPackage init() {
		if (isInited) return (ApogyCommonGeometryData3DPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryData3DPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonGeometryData3DPackageImpl theApogyCommonGeometryData3DPackage = (ApogyCommonGeometryData3DPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonGeometryData3DPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonGeometryData3DPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonGeometryDataPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonGeometryData3DPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonGeometryData3DPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonGeometryData3DPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonGeometryData3DPackage.eNS_URI, theApogyCommonGeometryData3DPackage);
		return theApogyCommonGeometryData3DPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianPolygon() {
		return cartesianPolygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPolygon_Surface() {
		return (EAttribute)cartesianPolygonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPolygon_Normal() {
		return (EAttribute)cartesianPolygonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianPolygon_Centroid() {
		return (EReference)cartesianPolygonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangle() {
		return cartesianTriangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalPolygon() {
		return sphericalPolygonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalTriangle() {
		return sphericalTriangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianPositionCoordinates() {
		return cartesianPositionCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPositionCoordinates_X() {
		return (EAttribute)cartesianPositionCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPositionCoordinates_Y() {
		return (EAttribute)cartesianPositionCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianPositionCoordinates_Z() {
		return (EAttribute)cartesianPositionCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianPositionCoordinates__AsPoint3d() {
		return cartesianPositionCoordinatesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBAColor() {
		return rgbaColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBAColor_Alpha() {
		return (EAttribute)rgbaColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBAColor_Red() {
		return (EAttribute)rgbaColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBAColor_Green() {
		return (EAttribute)rgbaColorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBAColor_Blue() {
		return (EAttribute)rgbaColorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColoredCartesianPositionCoordinates() {
		return coloredCartesianPositionCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColoredCartesianTriangularMesh() {
		return coloredCartesianTriangularMeshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshColorizer() {
		return cartesianTriangularMeshColorizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianTriangularMeshColorizer__ComputeColor__CartesianTriangularMesh_CartesianPositionCoordinates() {
		return cartesianTriangularMeshColorizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshColorizerBySlope() {
		return cartesianTriangularMeshColorizerBySlopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshColorizerBySlope_NormalAxis() {
		return (EAttribute)cartesianTriangularMeshColorizerBySlopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianOrientationCoordinates() {
		return cartesianOrientationCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianOrientationCoordinates_XRotation() {
		return (EAttribute)cartesianOrientationCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianOrientationCoordinates_YRotation() {
		return (EAttribute)cartesianOrientationCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianOrientationCoordinates_ZRotation() {
		return (EAttribute)cartesianOrientationCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCartesianCoordinatesSet() {
		return abstractCartesianCoordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractCartesianCoordinatesSet__GetExtent() {
		return abstractCartesianCoordinatesSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSet() {
		return cartesianCoordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColoredCartesianCoordinatesSet() {
		return coloredCartesianCoordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSetExtent() {
		return cartesianCoordinatesSetExtentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_XMin() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_XMax() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_YMin() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_YMax() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_ZMin() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_ZMax() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_XDimension() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_YDimension() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianCoordinatesSetExtent_ZDimension() {
		return (EAttribute)cartesianCoordinatesSetExtentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalElevationMap() {
		return digitalElevationMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalElevationMap_XDimension() {
		return (EAttribute)digitalElevationMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalElevationMap_YDimension() {
		return (EAttribute)digitalElevationMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesMesh() {
		return cartesianCoordinatesMeshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMesh() {
		return cartesianTriangularMeshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalCoordinates() {
		return sphericalCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCoordinates_Phi() {
		return (EAttribute)sphericalCoordinatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCoordinates_Theta() {
		return (EAttribute)sphericalCoordinatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphericalCoordinates_R() {
		return (EAttribute)sphericalCoordinatesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalCoordinatesSet() {
		return sphericalCoordinatesSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalCoordinatesMesh() {
		return sphericalCoordinatesMeshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphericalTriangularMesh() {
		return sphericalTriangularMeshEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPose() {
		return poseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSphereSamplingShape() {
		return sphereSamplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereSamplingShape_Radius() {
		return (EAttribute)sphereSamplingShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSphereSamplingShape_Center() {
		return (EReference)sphereSamplingShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSphereSamplingShape_IncludeJustTouching() {
		return (EAttribute)sphereSamplingShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCubeSamplingShape() {
		return cubeSamplingShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeSamplingShape_Corner1() {
		return (EReference)cubeSamplingShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCubeSamplingShape_Corner2() {
		return (EReference)cubeSamplingShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCubeSamplingShape_IncludeJustTouching() {
		return (EAttribute)cubeSamplingShapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesSetShapeSampler() {
		return cartesianCoordinatesSetShapeSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesMeshSampler() {
		return cartesianCoordinatesMeshSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesMeshPolygonSampler() {
		return cartesianCoordinatesMeshPolygonSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshSampler() {
		return cartesianTriangularMeshSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshPolygonSampler() {
		return cartesianTriangularMeshPolygonSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianPositionCoordinatesMesher() {
		return cartesianPositionCoordinatesMesherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalPointCloud() {
		return normalPointCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalPointCloud_Points() {
		return (EAttribute)normalPointCloudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalPointCloud_Normals() {
		return (EAttribute)normalPointCloudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointLocator() {
		return pointLocatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__GetPoints() {
		return pointLocatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__AddPoint__CartesianPositionCoordinates() {
		return pointLocatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__AddPoints__List() {
		return pointLocatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__RemovePoint__CartesianPositionCoordinates() {
		return pointLocatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__RemovePoints__List() {
		return pointLocatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__ClearPoints() {
		return pointLocatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__FindClosestPoint__CartesianPositionCoordinates() {
		return pointLocatorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__FindClosestPoints__CartesianPositionCoordinates_int() {
		return pointLocatorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPointLocator__FindPointsWithinRadius__CartesianPositionCoordinates_double() {
		return pointLocatorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKDTreeBasedPointLocator() {
		return kdTreeBasedPointLocatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshLocalizer() {
		return meshLocalizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMeshLocalizer__Localize__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d() {
		return meshLocalizerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelaunayMesher() {
		return delaunayMesherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalElevationMapMesher() {
		return digitalElevationMapMesherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigitalElevationMapSampler() {
		return digitalElevationMapSamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigitalElevationMapSampler_TargetResolution() {
		return (EAttribute)digitalElevationMapSamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangularMeshNormalsCalculator() {
		return triangularMeshNormalsCalculatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangularMeshToNormalPointCloud() {
		return triangularMeshToNormalPointCloudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniquePointsFilter() {
		return uniquePointsFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriangleEdgeLengthTriangularMeshFilter() {
		return triangleEdgeLengthTriangularMeshFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangleEdgeLengthTriangularMeshFilter_MinimumRange() {
		return (EAttribute)triangleEdgeLengthTriangularMeshFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangleEdgeLengthTriangularMeshFilter_MaximumRange() {
		return (EAttribute)triangleEdgeLengthTriangularMeshFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength() {
		return (EAttribute)triangleEdgeLengthTriangularMeshFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTriangleEdgeLengthTriangularMeshFilter__Filter__CartesianTriangularMesh() {
		return triangleEdgeLengthTriangularMeshFilterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutlierFilter() {
		return outlierFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutlierFilter_MaxDistance() {
		return (EAttribute)outlierFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeshSmoother() {
		return meshSmootherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeshSmoother_NumberOfIterations() {
		return (EAttribute)meshSmootherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoxelBased3DPointCloudResampler() {
		return voxelBased3DPointCloudResamplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_ResolutionX() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_ResolutionY() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_ResolutionZ() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVoxelBased3DPointCloudResampler_TileResolution() {
		return (EAttribute)voxelBased3DPointCloudResamplerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRigidBodyPoseTracker() {
		return rigidBodyPoseTrackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRigidBodyPoseTracker_PositionMarkersAtOrigin() {
		return (EReference)rigidBodyPoseTrackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRigidBodyPoseTracker__ComputeTransformation__EList() {
		return rigidBodyPoseTrackerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRigidBodyPoseTracker__ComputeTransformation__List() {
		return rigidBodyPoseTrackerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRigidBodyPoseTracker__AddPositionMarkers__List() {
		return rigidBodyPoseTrackerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRigidBodyPoseTracker__RemovePositionMarkers__List() {
		return rigidBodyPoseTrackerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositionMarker() {
		return positionMarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositionMarker_Identifier() {
		return (EAttribute)positionMarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonGeometryData3DFacade() {
		return apogyCommonGeometryData3DFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__double_double_double() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short_short() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateRGBAColor__short_short_short_short() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__double_double_double() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateSphericalCoordinates__double_double_double() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreatePose__double_double_double_double_double_double() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreatePose__Pose() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateDigitalElevationMap__CartesianCoordinatesSet() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPolygon() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__List() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__List() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__List_Matrix4d() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__CreateTransformedMesh__CartesianTriangularMesh_Matrix4d() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__ApplyTransform__NormalPointCloud_Matrix4d() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonGeometryData3DFacade__ConcatenateTriangularMeshes__List() {
		return apogyCommonGeometryData3DFacadeEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData3DIO() {
		return data3DIOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMesh__String() {
		return data3DIOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMesh__InputStream() {
		return data3DIOEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String() {
		return data3DIOEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream() {
		return data3DIOEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String() {
		return data3DIOEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMeshFromASCII__String() {
		return data3DIOEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String() {
		return data3DIOEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadXYZ__String() {
		return data3DIOEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__LoadTriangularMeshFromTriXYZ__String_String() {
		return data3DIOEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String() {
		return data3DIOEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream() {
		return data3DIOEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String() {
		return data3DIOEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream() {
		return data3DIOEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData3DUtils() {
		return data3DUtilsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeNormals__CartesianTriangularMesh() {
		return data3DUtilsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeNormalAtVertex__CartesianTriangularMesh_CartesianPositionCoordinates() {
		return data3DUtilsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeCentroid__List() {
		return data3DUtilsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeCentroid__CartesianCoordinatesSet() {
		return data3DUtilsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet() {
		return data3DUtilsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__ComputeCurvatureChange__PointLocator_int_double() {
		return data3DUtilsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getData3DUtils__Extrude__List_CartesianAxis_double_boolean() {
		return data3DUtilsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCartesianAxis() {
		return cartesianAxisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCartesianPlane() {
		return cartesianPlaneEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector2d() {
		return vector2dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3d() {
		return vector3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoint3d() {
		return point3dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMatrix4d() {
		return matrix4dEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGVector() {
		return gVectorEDataType;
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
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSet() {
		return setEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortedSet() {
		return sortedSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEList() {
		return eListEDataType;
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
	public EDataType getOutputStream() {
		return outputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInputStream() {
		return inputStreamEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIOException() {
		return ioExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIllegalArgumentException() {
		return illegalArgumentExceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoubleArrayOfArray() {
		return doubleArrayOfArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIntArray() {
		return intArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DFactory getApogyCommonGeometryData3DFactory() {
		return (ApogyCommonGeometryData3DFactory)getEFactoryInstance();
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
		cartesianPolygonEClass = createEClass(CARTESIAN_POLYGON);
		createEAttribute(cartesianPolygonEClass, CARTESIAN_POLYGON__SURFACE);
		createEAttribute(cartesianPolygonEClass, CARTESIAN_POLYGON__NORMAL);
		createEReference(cartesianPolygonEClass, CARTESIAN_POLYGON__CENTROID);

		cartesianTriangleEClass = createEClass(CARTESIAN_TRIANGLE);

		sphericalPolygonEClass = createEClass(SPHERICAL_POLYGON);

		sphericalTriangleEClass = createEClass(SPHERICAL_TRIANGLE);

		cartesianPositionCoordinatesEClass = createEClass(CARTESIAN_POSITION_COORDINATES);
		createEAttribute(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES__X);
		createEAttribute(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES__Y);
		createEAttribute(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES__Z);
		createEOperation(cartesianPositionCoordinatesEClass, CARTESIAN_POSITION_COORDINATES___AS_POINT3D);

		rgbaColorEClass = createEClass(RGBA_COLOR);
		createEAttribute(rgbaColorEClass, RGBA_COLOR__ALPHA);
		createEAttribute(rgbaColorEClass, RGBA_COLOR__RED);
		createEAttribute(rgbaColorEClass, RGBA_COLOR__GREEN);
		createEAttribute(rgbaColorEClass, RGBA_COLOR__BLUE);

		coloredCartesianPositionCoordinatesEClass = createEClass(COLORED_CARTESIAN_POSITION_COORDINATES);

		coloredCartesianTriangularMeshEClass = createEClass(COLORED_CARTESIAN_TRIANGULAR_MESH);

		cartesianTriangularMeshColorizerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_COLORIZER);
		createEOperation(cartesianTriangularMeshColorizerEClass, CARTESIAN_TRIANGULAR_MESH_COLORIZER___COMPUTE_COLOR__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES);

		cartesianTriangularMeshColorizerBySlopeEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE);
		createEAttribute(cartesianTriangularMeshColorizerBySlopeEClass, CARTESIAN_TRIANGULAR_MESH_COLORIZER_BY_SLOPE__NORMAL_AXIS);

		cartesianOrientationCoordinatesEClass = createEClass(CARTESIAN_ORIENTATION_COORDINATES);
		createEAttribute(cartesianOrientationCoordinatesEClass, CARTESIAN_ORIENTATION_COORDINATES__XROTATION);
		createEAttribute(cartesianOrientationCoordinatesEClass, CARTESIAN_ORIENTATION_COORDINATES__YROTATION);
		createEAttribute(cartesianOrientationCoordinatesEClass, CARTESIAN_ORIENTATION_COORDINATES__ZROTATION);

		abstractCartesianCoordinatesSetEClass = createEClass(ABSTRACT_CARTESIAN_COORDINATES_SET);
		createEOperation(abstractCartesianCoordinatesSetEClass, ABSTRACT_CARTESIAN_COORDINATES_SET___GET_EXTENT);

		cartesianCoordinatesSetEClass = createEClass(CARTESIAN_COORDINATES_SET);

		coloredCartesianCoordinatesSetEClass = createEClass(COLORED_CARTESIAN_COORDINATES_SET);

		cartesianCoordinatesSetExtentEClass = createEClass(CARTESIAN_COORDINATES_SET_EXTENT);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__XMIN);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__XMAX);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__YMIN);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__YMAX);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__ZMIN);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__ZMAX);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION);
		createEAttribute(cartesianCoordinatesSetExtentEClass, CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION);

		digitalElevationMapEClass = createEClass(DIGITAL_ELEVATION_MAP);
		createEAttribute(digitalElevationMapEClass, DIGITAL_ELEVATION_MAP__XDIMENSION);
		createEAttribute(digitalElevationMapEClass, DIGITAL_ELEVATION_MAP__YDIMENSION);

		cartesianCoordinatesMeshEClass = createEClass(CARTESIAN_COORDINATES_MESH);

		cartesianTriangularMeshEClass = createEClass(CARTESIAN_TRIANGULAR_MESH);

		sphericalCoordinatesEClass = createEClass(SPHERICAL_COORDINATES);
		createEAttribute(sphericalCoordinatesEClass, SPHERICAL_COORDINATES__PHI);
		createEAttribute(sphericalCoordinatesEClass, SPHERICAL_COORDINATES__THETA);
		createEAttribute(sphericalCoordinatesEClass, SPHERICAL_COORDINATES__R);

		sphericalCoordinatesSetEClass = createEClass(SPHERICAL_COORDINATES_SET);

		sphericalCoordinatesMeshEClass = createEClass(SPHERICAL_COORDINATES_MESH);

		sphericalTriangularMeshEClass = createEClass(SPHERICAL_TRIANGULAR_MESH);

		poseEClass = createEClass(POSE);

		sphereSamplingShapeEClass = createEClass(SPHERE_SAMPLING_SHAPE);
		createEAttribute(sphereSamplingShapeEClass, SPHERE_SAMPLING_SHAPE__RADIUS);
		createEReference(sphereSamplingShapeEClass, SPHERE_SAMPLING_SHAPE__CENTER);
		createEAttribute(sphereSamplingShapeEClass, SPHERE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING);

		cubeSamplingShapeEClass = createEClass(CUBE_SAMPLING_SHAPE);
		createEReference(cubeSamplingShapeEClass, CUBE_SAMPLING_SHAPE__CORNER1);
		createEReference(cubeSamplingShapeEClass, CUBE_SAMPLING_SHAPE__CORNER2);
		createEAttribute(cubeSamplingShapeEClass, CUBE_SAMPLING_SHAPE__INCLUDE_JUST_TOUCHING);

		cartesianCoordinatesSetShapeSamplerEClass = createEClass(CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER);

		cartesianCoordinatesMeshSamplerEClass = createEClass(CARTESIAN_COORDINATES_MESH_SAMPLER);

		cartesianCoordinatesMeshPolygonSamplerEClass = createEClass(CARTESIAN_COORDINATES_MESH_POLYGON_SAMPLER);

		cartesianTriangularMeshSamplerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_SAMPLER);

		cartesianTriangularMeshPolygonSamplerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_POLYGON_SAMPLER);

		cartesianPositionCoordinatesMesherEClass = createEClass(CARTESIAN_POSITION_COORDINATES_MESHER);

		normalPointCloudEClass = createEClass(NORMAL_POINT_CLOUD);
		createEAttribute(normalPointCloudEClass, NORMAL_POINT_CLOUD__POINTS);
		createEAttribute(normalPointCloudEClass, NORMAL_POINT_CLOUD__NORMALS);

		pointLocatorEClass = createEClass(POINT_LOCATOR);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___GET_POINTS);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___ADD_POINT__CARTESIANPOSITIONCOORDINATES);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___ADD_POINTS__LIST);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___REMOVE_POINT__CARTESIANPOSITIONCOORDINATES);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___REMOVE_POINTS__LIST);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___CLEAR_POINTS);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___FIND_CLOSEST_POINT__CARTESIANPOSITIONCOORDINATES);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___FIND_CLOSEST_POINTS__CARTESIANPOSITIONCOORDINATES_INT);
		createEOperation(pointLocatorEClass, POINT_LOCATOR___FIND_POINTS_WITHIN_RADIUS__CARTESIANPOSITIONCOORDINATES_DOUBLE);

		kdTreeBasedPointLocatorEClass = createEClass(KD_TREE_BASED_POINT_LOCATOR);

		meshLocalizerEClass = createEClass(MESH_LOCALIZER);
		createEOperation(meshLocalizerEClass, MESH_LOCALIZER___LOCALIZE__CARTESIANTRIANGULARMESH_MATRIX4D_CARTESIANTRIANGULARMESH_MATRIX4D);

		delaunayMesherEClass = createEClass(DELAUNAY_MESHER);

		digitalElevationMapMesherEClass = createEClass(DIGITAL_ELEVATION_MAP_MESHER);

		digitalElevationMapSamplerEClass = createEClass(DIGITAL_ELEVATION_MAP_SAMPLER);
		createEAttribute(digitalElevationMapSamplerEClass, DIGITAL_ELEVATION_MAP_SAMPLER__TARGET_RESOLUTION);

		triangularMeshNormalsCalculatorEClass = createEClass(TRIANGULAR_MESH_NORMALS_CALCULATOR);

		triangularMeshToNormalPointCloudEClass = createEClass(TRIANGULAR_MESH_TO_NORMAL_POINT_CLOUD);

		uniquePointsFilterEClass = createEClass(UNIQUE_POINTS_FILTER);

		triangleEdgeLengthTriangularMeshFilterEClass = createEClass(TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER);
		createEAttribute(triangleEdgeLengthTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE);
		createEAttribute(triangleEdgeLengthTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE);
		createEAttribute(triangleEdgeLengthTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGTH);
		createEOperation(triangleEdgeLengthTriangularMeshFilterEClass, TRIANGLE_EDGE_LENGTH_TRIANGULAR_MESH_FILTER___FILTER__CARTESIANTRIANGULARMESH);

		outlierFilterEClass = createEClass(OUTLIER_FILTER);
		createEAttribute(outlierFilterEClass, OUTLIER_FILTER__MAX_DISTANCE);

		meshSmootherEClass = createEClass(MESH_SMOOTHER);
		createEAttribute(meshSmootherEClass, MESH_SMOOTHER__NUMBER_OF_ITERATIONS);

		voxelBased3DPointCloudResamplerEClass = createEClass(VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL);
		createEAttribute(voxelBased3DPointCloudResamplerEClass, VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION);

		positionMarkerEClass = createEClass(POSITION_MARKER);
		createEAttribute(positionMarkerEClass, POSITION_MARKER__IDENTIFIER);

		rigidBodyPoseTrackerEClass = createEClass(RIGID_BODY_POSE_TRACKER);
		createEReference(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN);
		createEOperation(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER___ADD_POSITION_MARKERS__LIST);
		createEOperation(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER___REMOVE_POSITION_MARKERS__LIST);
		createEOperation(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__ELIST);
		createEOperation(rigidBodyPoseTrackerEClass, RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__LIST);

		apogyCommonGeometryData3DFacadeEClass = createEClass(APOGY_COMMON_GEOMETRY_DATA3_DFACADE);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_COLORED_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE_SHORT_SHORT_SHORT);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_COLORED_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE_SHORT_SHORT_SHORT_SHORT);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_RGBA_COLOR__SHORT_SHORT_SHORT_SHORT);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_SPHERICAL_COORDINATES__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__POSE);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_POSE__CARTESIANPOSITIONCOORDINATES_CARTESIANORIENTATIONCOORDINATES);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_DIGITAL_ELEVATION_MAP__CARTESIANCOORDINATESSET);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POLYGON__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_POSITION_COORDINATES__CARTESIANPOSITIONCOORDINATES);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__CARTESIANORIENTATIONCOORDINATES);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANCOORDINATESMESH);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOLYGON);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__LIST);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANTRIANGULARMESH);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__LIST);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__CARTESIANCOORDINATESSET_MATRIX4D);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__LIST_MATRIX4D);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CREATE_TRANSFORMED_MESH__CARTESIANTRIANGULARMESH_MATRIX4D);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__CARTESIANTRIANGULARMESH_MATRIX4D);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___APPLY_TRANSFORM__NORMALPOINTCLOUD_MATRIX4D);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___UPDATE_CARTESIAN_COORDINATES_SET__CARTESIANCOORDINATESSET_DOUBLE);
		createEOperation(apogyCommonGeometryData3DFacadeEClass, APOGY_COMMON_GEOMETRY_DATA3_DFACADE___CONCATENATE_TRIANGULAR_MESHES__LIST);

		data3DIOEClass = createEClass(DATA3_DIO);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH__INPUTSTREAM);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH_OUTPUTSTREAM);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII_AS_NORMAL_POINT_CLOUD__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_ASCII__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_TRIANGULAR_MESH_AS_ASCII__CARTESIANTRIANGULARMESH_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_XYZ__STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___LOAD_TRIANGULAR_MESH_FROM_TRI_XYZ__STRING_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_XYZ__CARTESIANCOORDINATESSET_OUTPUTSTREAM);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_STRING);
		createEOperation(data3DIOEClass, DATA3_DIO___SAVE_COORDINATES_SET_TO_CSV__CARTESIANCOORDINATESSET_OUTPUTSTREAM);

		data3DUtilsEClass = createEClass(DATA3_DUTILS);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_NORMALS__CARTESIANTRIANGULARMESH);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_NORMAL_AT_VERTEX__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_CENTROID__LIST);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_CENTROID__CARTESIANCOORDINATESSET);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_MIN_MAX_VALUES__POINT3D_POINT3D_CARTESIANCOORDINATESSET);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__POINTLOCATOR_INT_DOUBLE);
		createEOperation(data3DUtilsEClass, DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN);

		// Create enums
		cartesianAxisEEnum = createEEnum(CARTESIAN_AXIS);
		cartesianPlaneEEnum = createEEnum(CARTESIAN_PLANE);

		// Create data types
		vector2dEDataType = createEDataType(VECTOR2D);
		vector3dEDataType = createEDataType(VECTOR3D);
		point3dEDataType = createEDataType(POINT3D);
		matrix4dEDataType = createEDataType(MATRIX4D);
		gVectorEDataType = createEDataType(GVECTOR);
		listEDataType = createEDataType(LIST);
		mapEDataType = createEDataType(MAP);
		setEDataType = createEDataType(SET);
		sortedSetEDataType = createEDataType(SORTED_SET);
		collectionEDataType = createEDataType(COLLECTION);
		eListEDataType = createEDataType(ELIST);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
		outputStreamEDataType = createEDataType(OUTPUT_STREAM);
		inputStreamEDataType = createEDataType(INPUT_STREAM);
		ioExceptionEDataType = createEDataType(IO_EXCEPTION);
		exceptionEDataType = createEDataType(EXCEPTION);
		illegalArgumentExceptionEDataType = createEDataType(ILLEGAL_ARGUMENT_EXCEPTION);
		doubleArrayOfArrayEDataType = createEDataType(DOUBLE_ARRAY_OF_ARRAY);
		intArrayEDataType = createEDataType(INT_ARRAY);
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
		ApogyCommonGeometryDataPackage theApogyCommonGeometryDataPackage = (ApogyCommonGeometryDataPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonGeometryDataPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonProcessorsPackage theApogyCommonProcessorsPackage = (ApogyCommonProcessorsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonProcessorsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter abstractCartesianCoordinatesSetEClass_T = addETypeParameter(abstractCartesianCoordinatesSetEClass, "T");
		ETypeParameter sphereSamplingShapeEClass_PolygonType = addETypeParameter(sphereSamplingShapeEClass, "PolygonType");
		ETypeParameter cubeSamplingShapeEClass_PolygonType = addETypeParameter(cubeSamplingShapeEClass, "PolygonType");
		addETypeParameter(listEDataType, "T");
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(setEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");
		addETypeParameter(collectionEDataType, "T");
		addETypeParameter(eListEDataType, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getCartesianPositionCoordinates());
		abstractCartesianCoordinatesSetEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getCartesianPolygon());
		sphereSamplingShapeEClass_PolygonType.getEBounds().add(g1);
		g1 = createEGenericType(this.getCartesianPolygon());
		cubeSamplingShapeEClass_PolygonType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getPolygon());
		EGenericType g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cartesianPolygonEClass.getEGenericSuperTypes().add(g1);
		cartesianTriangleEClass.getESuperTypes().add(this.getCartesianPolygon());
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getPolygon());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		sphericalPolygonEClass.getEGenericSuperTypes().add(g1);
		sphericalTriangleEClass.getESuperTypes().add(this.getSphericalPolygon());
		cartesianPositionCoordinatesEClass.getESuperTypes().add(theApogyCommonGeometryDataPackage.getCoordinates());
		coloredCartesianPositionCoordinatesEClass.getESuperTypes().add(this.getCartesianPositionCoordinates());
		coloredCartesianPositionCoordinatesEClass.getESuperTypes().add(this.getRGBAColor());
		coloredCartesianTriangularMeshEClass.getESuperTypes().add(this.getCartesianTriangularMesh());
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getColoredCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		cartesianTriangularMeshColorizerEClass.getEGenericSuperTypes().add(g1);
		cartesianTriangularMeshColorizerBySlopeEClass.getESuperTypes().add(this.getCartesianTriangularMeshColorizer());
		cartesianOrientationCoordinatesEClass.getESuperTypes().add(theApogyCommonGeometryDataPackage.getCoordinates());
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getCoordinatesSet());
		g2 = createEGenericType(abstractCartesianCoordinatesSetEClass_T);
		g1.getETypeArguments().add(g2);
		abstractCartesianCoordinatesSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractCartesianCoordinatesSet());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractCartesianCoordinatesSet());
		g2 = createEGenericType(this.getColoredCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		coloredCartesianCoordinatesSetEClass.getEGenericSuperTypes().add(g1);
		digitalElevationMapEClass.getESuperTypes().add(this.getCartesianCoordinatesSet());
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMesh());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCartesianCoordinatesSet());
		cartesianCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMesh());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		cartesianTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCartesianCoordinatesSet());
		cartesianTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		sphericalCoordinatesEClass.getESuperTypes().add(theApogyCommonGeometryDataPackage.getCoordinates());
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getCoordinatesSet());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		sphericalCoordinatesSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMesh());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSphericalPolygon());
		g1.getETypeArguments().add(g2);
		sphericalCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSphericalCoordinatesSet());
		sphericalCoordinatesMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMesh());
		g2 = createEGenericType(this.getSphericalCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSphericalTriangle());
		g1.getETypeArguments().add(g2);
		sphericalTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSphericalCoordinatesSet());
		sphericalTriangularMeshEClass.getEGenericSuperTypes().add(g1);
		poseEClass.getESuperTypes().add(this.getCartesianPositionCoordinates());
		poseEClass.getESuperTypes().add(this.getCartesianOrientationCoordinates());
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getCoordinatesSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		sphereSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getPolygonSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(sphereSamplingShapeEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		sphereSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getCoordinatesSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cubeSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getPolygonSamplingShape());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(cubeSamplingShapeEClass_PolygonType);
		g1.getETypeArguments().add(g2);
		cubeSamplingShapeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getCoordinatesSetShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesSetShapeSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMeshCoordinatesShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesMeshSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMeshPolygonShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		cartesianCoordinatesMeshPolygonSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMeshCoordinatesShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		cartesianTriangularMeshSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonGeometryDataPackage.getMeshPolygonShapesSampler());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		cartesianTriangularMeshPolygonSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		cartesianPositionCoordinatesMesherEClass.getEGenericSuperTypes().add(g1);
		kdTreeBasedPointLocatorEClass.getESuperTypes().add(this.getPointLocator());
		delaunayMesherEClass.getESuperTypes().add(this.getCartesianPositionCoordinatesMesher());
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getDigitalElevationMap());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		digitalElevationMapMesherEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getDigitalElevationMap());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getDigitalElevationMap());
		g1.getETypeArguments().add(g2);
		digitalElevationMapSamplerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		triangularMeshNormalsCalculatorEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getNormalPointCloud());
		g1.getETypeArguments().add(g2);
		triangularMeshToNormalPointCloudEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		uniquePointsFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		outlierFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		meshSmootherEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theApogyCommonProcessorsPackage.getProcessor());
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getCartesianCoordinatesSet());
		g1.getETypeArguments().add(g2);
		voxelBased3DPointCloudResamplerEClass.getEGenericSuperTypes().add(g1);
		positionMarkerEClass.getESuperTypes().add(this.getCartesianPositionCoordinates());

		// Initialize classes, features, and operations; add parameters
		initEClass(cartesianPolygonEClass, CartesianPolygon.class, "CartesianPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianPolygon_Surface(), theEcorePackage.getEDouble(), "surface", null, 0, 1, CartesianPolygon.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianPolygon_Normal(), this.getVector3d(), "normal", null, 0, 1, CartesianPolygon.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianPolygon_Centroid(), this.getCartesianPositionCoordinates(), null, "centroid", null, 0, 1, CartesianPolygon.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangleEClass, CartesianTriangle.class, "CartesianTriangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalPolygonEClass, SphericalPolygon.class, "SphericalPolygon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalTriangleEClass, SphericalTriangle.class, "SphericalTriangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianPositionCoordinatesEClass, CartesianPositionCoordinates.class, "CartesianPositionCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianPositionCoordinates_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, CartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianPositionCoordinates_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, CartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianPositionCoordinates_Z(), theEcorePackage.getEDouble(), "z", null, 0, 1, CartesianPositionCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCartesianPositionCoordinates__AsPoint3d(), this.getPoint3d(), "asPoint3d", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rgbaColorEClass, RGBAColor.class, "RGBAColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBAColor_Alpha(), theEcorePackage.getEShort(), "alpha", null, 0, 1, RGBAColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBAColor_Red(), theEcorePackage.getEShort(), "red", null, 0, 1, RGBAColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBAColor_Green(), theEcorePackage.getEShort(), "green", null, 0, 1, RGBAColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBAColor_Blue(), theEcorePackage.getEShort(), "blue", null, 0, 1, RGBAColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coloredCartesianPositionCoordinatesEClass, ColoredCartesianPositionCoordinates.class, "ColoredCartesianPositionCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coloredCartesianTriangularMeshEClass, ColoredCartesianTriangularMesh.class, "ColoredCartesianTriangularMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshColorizerEClass, CartesianTriangularMeshColorizer.class, "CartesianTriangularMeshColorizer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCartesianTriangularMeshColorizer__ComputeColor__CartesianTriangularMesh_CartesianPositionCoordinates(), this.getRGBAColor(), "computeColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cartesianTriangularMeshColorizerBySlopeEClass, CartesianTriangularMeshColorizerBySlope.class, "CartesianTriangularMeshColorizerBySlope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshColorizerBySlope_NormalAxis(), this.getCartesianAxis(), "normalAxis", null, 0, 1, CartesianTriangularMeshColorizerBySlope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianOrientationCoordinatesEClass, CartesianOrientationCoordinates.class, "CartesianOrientationCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianOrientationCoordinates_XRotation(), theEcorePackage.getEDouble(), "xRotation", null, 0, 1, CartesianOrientationCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianOrientationCoordinates_YRotation(), theEcorePackage.getEDouble(), "yRotation", null, 0, 1, CartesianOrientationCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianOrientationCoordinates_ZRotation(), theEcorePackage.getEDouble(), "zRotation", null, 0, 1, CartesianOrientationCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCartesianCoordinatesSetEClass, AbstractCartesianCoordinatesSet.class, "AbstractCartesianCoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAbstractCartesianCoordinatesSet__GetExtent(), this.getCartesianCoordinatesSetExtent(), "getExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cartesianCoordinatesSetEClass, CartesianCoordinatesSet.class, "CartesianCoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coloredCartesianCoordinatesSetEClass, ColoredCartesianCoordinatesSet.class, "ColoredCartesianCoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianCoordinatesSetExtentEClass, CartesianCoordinatesSetExtent.class, "CartesianCoordinatesSetExtent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianCoordinatesSetExtent_XMin(), theEcorePackage.getEDouble(), "xMin", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_XMax(), theEcorePackage.getEDouble(), "xMax", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_YMin(), theEcorePackage.getEDouble(), "yMin", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_YMax(), theEcorePackage.getEDouble(), "yMax", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_ZMin(), theEcorePackage.getEDouble(), "zMin", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_ZMax(), theEcorePackage.getEDouble(), "zMax", null, 0, 1, CartesianCoordinatesSetExtent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_XDimension(), theEcorePackage.getEDouble(), "xDimension", null, 0, 1, CartesianCoordinatesSetExtent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_YDimension(), theEcorePackage.getEDouble(), "yDimension", null, 0, 1, CartesianCoordinatesSetExtent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianCoordinatesSetExtent_ZDimension(), theEcorePackage.getEDouble(), "zDimension", null, 0, 1, CartesianCoordinatesSetExtent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(digitalElevationMapEClass, DigitalElevationMap.class, "DigitalElevationMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalElevationMap_XDimension(), theEcorePackage.getEInt(), "xDimension", null, 0, 1, DigitalElevationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDigitalElevationMap_YDimension(), theEcorePackage.getEInt(), "yDimension", null, 0, 1, DigitalElevationMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinatesMeshEClass, CartesianCoordinatesMesh.class, "CartesianCoordinatesMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshEClass, CartesianTriangularMesh.class, "CartesianTriangularMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalCoordinatesEClass, SphericalCoordinates.class, "SphericalCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphericalCoordinates_Phi(), theEcorePackage.getEDouble(), "phi", null, 0, 1, SphericalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphericalCoordinates_Theta(), theEcorePackage.getEDouble(), "theta", null, 0, 1, SphericalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphericalCoordinates_R(), theEcorePackage.getEDouble(), "r", null, 0, 1, SphericalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sphericalCoordinatesSetEClass, SphericalCoordinatesSet.class, "SphericalCoordinatesSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalCoordinatesMeshEClass, SphericalCoordinatesMesh.class, "SphericalCoordinatesMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphericalTriangularMeshEClass, SphericalTriangularMesh.class, "SphericalTriangularMesh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(poseEClass, Pose.class, "Pose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sphereSamplingShapeEClass, SphereSamplingShape.class, "SphereSamplingShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSphereSamplingShape_Radius(), theEcorePackage.getEDouble(), "radius", "1.0", 0, 1, SphereSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSphereSamplingShape_Center(), this.getCartesianPositionCoordinates(), null, "center", null, 0, 1, SphereSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSphereSamplingShape_IncludeJustTouching(), theEcorePackage.getEBoolean(), "includeJustTouching", "true", 0, 1, SphereSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cubeSamplingShapeEClass, CubeSamplingShape.class, "CubeSamplingShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCubeSamplingShape_Corner1(), this.getCartesianPositionCoordinates(), null, "corner1", null, 0, 1, CubeSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCubeSamplingShape_Corner2(), this.getCartesianPositionCoordinates(), null, "corner2", null, 0, 1, CubeSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCubeSamplingShape_IncludeJustTouching(), theEcorePackage.getEBoolean(), "includeJustTouching", "true", 0, 1, CubeSamplingShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianCoordinatesSetShapeSamplerEClass, CartesianCoordinatesSetShapeSampler.class, "CartesianCoordinatesSetShapeSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianCoordinatesMeshSamplerEClass, CartesianCoordinatesMeshSampler.class, "CartesianCoordinatesMeshSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianCoordinatesMeshPolygonSamplerEClass, CartesianCoordinatesMeshPolygonSampler.class, "CartesianCoordinatesMeshPolygonSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshSamplerEClass, CartesianTriangularMeshSampler.class, "CartesianTriangularMeshSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshPolygonSamplerEClass, CartesianTriangularMeshPolygonSampler.class, "CartesianTriangularMeshPolygonSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianPositionCoordinatesMesherEClass, CartesianPositionCoordinatesMesher.class, "CartesianPositionCoordinatesMesher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalPointCloudEClass, NormalPointCloud.class, "NormalPointCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getPoint3d());
		g1.getETypeArguments().add(g2);
		initEAttribute(getNormalPointCloud_Points(), g1, "points", null, 0, 1, NormalPointCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVector3d());
		g1.getETypeArguments().add(g2);
		initEAttribute(getNormalPointCloud_Normals(), g1, "normals", null, 0, 1, NormalPointCloud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointLocatorEClass, PointLocator.class, "PointLocator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPointLocator__GetPoints(), null, "getPoints", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getPointLocator__AddPoint__CartesianPositionCoordinates(), null, "addPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointLocator__AddPoints__List(), null, "addPoints", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointLocator__RemovePoint__CartesianPositionCoordinates(), null, "removePoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointLocator__RemovePoints__List(), null, "removePoints", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getPointLocator__ClearPoints(), null, "clearPoints", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointLocator__FindClosestPoint__CartesianPositionCoordinates(), this.getCartesianPositionCoordinates(), "findClosestPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPointLocator__FindClosestPoints__CartesianPositionCoordinates_int(), null, "findClosestPoints", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "maximumNumberOfNeighbors", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getPointLocator__FindPointsWithinRadius__CartesianPositionCoordinates_double(), null, "findPointsWithinRadius", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "point", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(kdTreeBasedPointLocatorEClass, KDTreeBasedPointLocator.class, "KDTreeBasedPointLocator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(meshLocalizerEClass, MeshLocalizer.class, "MeshLocalizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMeshLocalizer__Localize__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d(), this.getMatrix4d(), "localize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "fixedMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "fixedMeshTransform", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "floatingMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "floatingMeshTransformEstimate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(delaunayMesherEClass, DelaunayMesher.class, "DelaunayMesher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalElevationMapMesherEClass, DigitalElevationMapMesher.class, "DigitalElevationMapMesher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(digitalElevationMapSamplerEClass, DigitalElevationMapSampler.class, "DigitalElevationMapSampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigitalElevationMapSampler_TargetResolution(), theEcorePackage.getEDouble(), "targetResolution", "1.0", 0, 1, DigitalElevationMapSampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangularMeshNormalsCalculatorEClass, TriangularMeshNormalsCalculator.class, "TriangularMeshNormalsCalculator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triangularMeshToNormalPointCloudEClass, TriangularMeshToNormalPointCloud.class, "TriangularMeshToNormalPointCloud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniquePointsFilterEClass, UniquePointsFilter.class, "UniquePointsFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triangleEdgeLengthTriangularMeshFilterEClass, TriangleEdgeLengthTriangularMeshFilter.class, "TriangleEdgeLengthTriangularMeshFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriangleEdgeLengthTriangularMeshFilter_MinimumRange(), theEcorePackage.getEDouble(), "minimumRange", null, 0, 1, TriangleEdgeLengthTriangularMeshFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangleEdgeLengthTriangularMeshFilter_MaximumRange(), theEcorePackage.getEDouble(), "maximumRange", null, 0, 1, TriangleEdgeLengthTriangularMeshFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength(), theEcorePackage.getEDouble(), "maximumEdgeLength", null, 0, 1, TriangleEdgeLengthTriangularMeshFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTriangleEdgeLengthTriangularMeshFilter__Filter__CartesianTriangularMesh(), this.getCartesianTriangularMesh(), "filter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(outlierFilterEClass, OutlierFilter.class, "OutlierFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutlierFilter_MaxDistance(), theEcorePackage.getEDouble(), "maxDistance", null, 0, 1, OutlierFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(meshSmootherEClass, MeshSmoother.class, "MeshSmoother", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeshSmoother_NumberOfIterations(), theEcorePackage.getEInt(), "numberOfIterations", "1", 0, 1, MeshSmoother.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voxelBased3DPointCloudResamplerEClass, VoxelBased3DPointCloudResampler.class, "VoxelBased3DPointCloudResampler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoxelBased3DPointCloudResampler_ResolutionX(), theEcorePackage.getEDouble(), "resolutionX", "0.1", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_ResolutionY(), theEcorePackage.getEDouble(), "resolutionY", "0.1", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_ResolutionZ(), theEcorePackage.getEDouble(), "resolutionZ", "0.05", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel(), theEcorePackage.getEInt(), "minimumNumberOfPointPerVoxel", "1", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoxelBased3DPointCloudResampler_TileResolution(), theEcorePackage.getEDouble(), "tileResolution", "5.0", 0, 1, VoxelBased3DPointCloudResampler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionMarkerEClass, PositionMarker.class, "PositionMarker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPositionMarker_Identifier(), theEcorePackage.getEString(), "identifier", null, 0, 1, PositionMarker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rigidBodyPoseTrackerEClass, RigidBodyPoseTracker.class, "RigidBodyPoseTracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRigidBodyPoseTracker_PositionMarkersAtOrigin(), this.getPositionMarker(), null, "positionMarkersAtOrigin", null, 0, -1, RigidBodyPoseTracker.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRigidBodyPoseTracker__AddPositionMarkers__List(), null, "addPositionMarkers", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getPositionMarker());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "markers", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getRigidBodyPoseTracker__RemovePositionMarkers__List(), null, "removePositionMarkers", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getPositionMarker());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "markers", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRigidBodyPoseTracker__ComputeTransformation__EList(), this.getPoint3d(), "computeTransformation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEList());
		g2 = createEGenericType(this.getPositionMarker());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "markerPositionsToTrack", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getRigidBodyPoseTracker__ComputeTransformation__List(), this.getMatrix4d(), "computeTransformation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getPositionMarker());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "markerPositionsToTrack", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(apogyCommonGeometryData3DFacadeEClass, ApogyCommonGeometryData3DFacade.class, "ApogyCommonGeometryData3DFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__double_double_double(), this.getCartesianPositionCoordinates(), "createCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short(), this.getColoredCartesianPositionCoordinates(), "createColoredCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "red", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "green", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "blue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateColoredCartesianPositionCoordinates__double_double_double_short_short_short_short(), this.getColoredCartesianPositionCoordinates(), "createColoredCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "alpha", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "red", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "green", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "blue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateRGBAColor__short_short_short_short(), this.getRGBAColor(), "createRGBAColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "alpha", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "red", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "green", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEShort(), "blue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__double_double_double(), this.getCartesianOrientationCoordinates(), "createCartesianOrientationCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "xRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "yRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "zRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateSphericalCoordinates__double_double_double(), this.getSphericalCoordinates(), "createSphericalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "phi", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "theta", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "r", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreatePose__double_double_double_double_double_double(), this.getPose(), "createPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "xRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "yRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "zRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreatePose__Pose(), this.getPose(), "createPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPose(), "pose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates(), this.getPose(), "createPose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianOrientationCoordinates(), "orientation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateDigitalElevationMap__CartesianCoordinatesSet(), this.getDigitalElevationMap(), "createDigitalElevationMap", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates(), this.getCartesianPolygon(), "createCartesianPolygon", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v1", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v2", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v3", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianPositionCoordinates__CartesianPositionCoordinates(), this.getCartesianPositionCoordinates(), "createCartesianPositionCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "coordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianOrientationCoordinates__CartesianOrientationCoordinates(), this.getCartesianOrientationCoordinates(), "createCartesianOrientationCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianOrientationCoordinates(), "coordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianCoordinatesMesh(), this.getCartesianCoordinatesMesh(), "createCartesianCoordinatesMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesMesh(), "cartesianCoordinatesMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates(), this.getCartesianTriangle(), "createCartesianTriangle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v1", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v2", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "v3", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianTriangle__CartesianPolygon(), this.getCartesianTriangle(), "createCartesianTriangle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		ETypeParameter t1 = addETypeParameter(op, "T");
		g1 = createEGenericType(this.getCartesianPolygon());
		t1.getEBounds().add(g1);
		g1 = createEGenericType(t1);
		addEParameter(op, g1, "polygon", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIllegalArgumentException());

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__List(), this.getCartesianCoordinatesMesh(), "createCartesianCoordinatesMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPolygon());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "polygons", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianCoordinatesMesh__CartesianTriangularMesh(), this.getCartesianCoordinatesMesh(), "createCartesianCoordinatesMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "cartesianCoordinatesMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__List(), this.getCartesianTriangularMesh(), "createCartesianTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianTriangle());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "polygons", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateCartesianTriangularMesh__CartesianTriangularMesh(), this.getCartesianTriangularMesh(), "createCartesianTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "cartesianCoordinatesMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianCoordinatesSet_Matrix4d(), this.getCartesianCoordinatesSet(), "applyTransform", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "points", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__ApplyTransform__List_Matrix4d(), null, "applyTransform", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonGeometryData3DFacade__CreateTransformedMesh__CartesianTriangularMesh_Matrix4d(), this.getCartesianTriangularMesh(), "createTransformedMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__ApplyTransform__CartesianTriangularMesh_Matrix4d(), null, "applyTransform", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__ApplyTransform__NormalPointCloud_Matrix4d(), this.getNormalPointCloud(), "applyTransform", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNormalPointCloud(), "points", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double(), null, "updateCartesianCoordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "cartesianCoordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDoubleArrayOfArray(), "xyzData", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonGeometryData3DFacade__ConcatenateTriangularMeshes__List(), this.getCartesianTriangularMesh(), "concatenateTriangularMeshes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianTriangularMesh());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "listOfTriangularMeshes", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(data3DIOEClass, Data3DIO.class, "Data3DIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getData3DIO__LoadTriangularMesh__String(), this.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMesh__InputStream(), this.getCartesianTriangularMesh(), "loadTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInputStream(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String(), null, "saveTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream(), null, "saveTriangularMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "output", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String(), this.getNormalPointCloud(), "loadTriangularMeshFromASCIIAsNormalPointCloud", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMeshFromASCII__String(), this.getCartesianTriangularMesh(), "loadTriangularMeshFromASCII", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String(), null, "saveTriangularMeshAsASCII", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "filePrefix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadXYZ__String(), this.getCartesianCoordinatesSet(), "loadXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__LoadTriangularMeshFromTriXYZ__String_String(), this.getCartesianTriangularMesh(), "loadTriangularMeshFromTriXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "triFileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "xyzFileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String(), null, "saveCoordinatesSetToXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream(), null, "saveCoordinatesSetToXYZ", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String(), null, "saveCoordinatesSetToCSV", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		op = initEOperation(getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream(), null, "saveCoordinatesSetToCSV", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "coordinatesSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOutputStream(), "file", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getIOException());

		initEClass(data3DUtilsEClass, Data3DUtils.class, "Data3DUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getData3DUtils__ComputeNormals__CartesianTriangularMesh(), null, "computeNormals", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getVector3d());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getData3DUtils__ComputeNormalAtVertex__CartesianTriangularMesh_CartesianPositionCoordinates(), this.getVector3d(), "computeNormalAtVertex", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianPositionCoordinates(), "vertex", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeCentroid__List(), this.getCartesianPositionCoordinates(), "computeCentroid", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeCentroid__CartesianCoordinatesSet(), this.getCartesianPositionCoordinates(), "computeCentroid", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "points", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet(), null, "computeMinMaxValues", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "min", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "max", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianCoordinatesSet(), "data", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__ComputeCurvatureChange__PointLocator_int_double(), theEcorePackage.getEDouble(), "computeCurvatureChange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPointLocator(), "pointLocator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "centerPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getData3DUtils__Extrude__List_CartesianAxis_double_boolean(), this.getCartesianTriangularMesh(), "extrude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getCartesianPositionCoordinates());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "profilePoints", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCartesianAxis(), "extrusionAxis", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "extrusionWidth", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "closeMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cartesianAxisEEnum, CartesianAxis.class, "CartesianAxis");
		addEEnumLiteral(cartesianAxisEEnum, CartesianAxis.X);
		addEEnumLiteral(cartesianAxisEEnum, CartesianAxis.Y);
		addEEnumLiteral(cartesianAxisEEnum, CartesianAxis.Z);

		initEEnum(cartesianPlaneEEnum, CartesianPlane.class, "CartesianPlane");
		addEEnumLiteral(cartesianPlaneEEnum, CartesianPlane.XY);
		addEEnumLiteral(cartesianPlaneEEnum, CartesianPlane.XZ);
		addEEnumLiteral(cartesianPlaneEEnum, CartesianPlane.YZ);

		// Initialize data types
		initEDataType(vector2dEDataType, Vector2d.class, "Vector2d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3dEDataType, Vector3d.class, "Vector3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matrix4dEDataType, Matrix4d.class, "Matrix4d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gVectorEDataType, GVector.class, "GVector", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eListEDataType, EList.class, "EList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputStreamEDataType, OutputStream.class, "OutputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(inputStreamEDataType, InputStream.class, "InputStream", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ioExceptionEDataType, IOException.class, "IOException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(illegalArgumentExceptionEDataType, IllegalArgumentException.class, "IllegalArgumentException", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(doubleArrayOfArrayEDataType, double[][].class, "DoubleArrayOfArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intArrayEDataType, int[].class, "IntArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyCommonGeometryData3D",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCommonGeometryData3D",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.common.geometry.data3d/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.common.geometry.data3d.edit/src-generated",
			 "testsDirectory", "/ca.gc.asc_csa.apogy.common.geometry.data3d.tests/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.common.geometry"
		   });	
		addAnnotation
		  (cartesianAxisEEnum, 
		   source, 
		   new String[] {
			 "documentation", "*\nIdentifies an axis of the Cartesian frame of reference."
		   });	
		addAnnotation
		  (cartesianPlaneEEnum, 
		   source, 
		   new String[] {
			 "documentation", "*\nIdentifies a plane of the Cartesian frame of reference."
		   });	
		addAnnotation
		  (cartesianPolygonEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA polygon having Cartesian position as its vertices."
		   });	
		addAnnotation
		  (getCartesianPolygon_Surface(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe surface of the polygon.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m\u00b2"
		   });	
		addAnnotation
		  (getCartesianPolygon_Normal(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe normal of the polygon."
		   });	
		addAnnotation
		  (getCartesianPolygon_Centroid(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe centroid of the polygon."
		   });	
		addAnnotation
		  (cartesianTriangleEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA Cartesian polygon that has exactly 3 vertices."
		   });	
		addAnnotation
		  (cartesianPositionCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA specialization of Coordinates that defines Cartesian coordinates."
		   });	
		addAnnotation
		  (getCartesianPositionCoordinates__AsPoint3d(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the position as a Point3d."
		   });	
		addAnnotation
		  (getCartesianPositionCoordinates_X(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "Position",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianPositionCoordinates_Y(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "Position",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianPositionCoordinates_Z(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "Position",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getRGBAColor_Alpha(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe alpha value.",
			 "notify", "true",
			 "propertyCategory", "Color"
		   });	
		addAnnotation
		  (getRGBAColor_Red(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe red component, between 0 and 255.",
			 "notify", "true",
			 "propertyCategory", "Color"
		   });	
		addAnnotation
		  (getRGBAColor_Green(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe green component, between 0 and 255.",
			 "notify", "true",
			 "propertyCategory", "Color"
		   });	
		addAnnotation
		  (getRGBAColor_Blue(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe blue component, between 0 and 255.",
			 "notify", "true",
			 "propertyCategory", "Color"
		   });	
		addAnnotation
		  (coloredCartesianPositionCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA specialization of CartesianPositionCoordinates that assigns a color to the position."
		   });	
		addAnnotation
		  (coloredCartesianTriangularMeshEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nMesh for which each vertex has a color that is associated."
		   });	
		addAnnotation
		  (cartesianTriangularMeshColorizerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA Processor that creates a colorized copy of an input Cartesian Triangular Mesh by providing color for each Cartesian\nTriangular Mesh vertex."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshColorizer__ComputeColor__CartesianTriangularMesh_CartesianPositionCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis method provides the color that should be associated with the specified vertex that is part\nof the input CartesianTriangularMesh. This method must be overloaded by sub-classes.\n@param mesh The mesh containing the point.\n@param point The point for which to generate color."
		   });	
		addAnnotation
		  (cartesianTriangularMeshColorizerBySlopeEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA specialization of CartesianTriangularMeshColorizer that colorize a mesh based on the normal at each vertex.\nThis implementation compute the normal at a given vertex by computing the weighted average (by triangle area) of\neach triangle that share the specified point as a vertex."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshColorizerBySlope_NormalAxis(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe axis against which to measure the local slope."
		   });	
		addAnnotation
		  (cartesianOrientationCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA specialization of Coordinates that represent an orientation as 3 Euler angles."
		   });	
		addAnnotation
		  (getCartesianOrientationCoordinates_XRotation(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "Orientation",
			 "children", "false",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getCartesianOrientationCoordinates_YRotation(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "Orientation",
			 "children", "false",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getCartesianOrientationCoordinates_ZRotation(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "Orientation",
			 "children", "false",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getAbstractCartesianCoordinatesSet__GetExtent(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the extent of the point cloud."
		   });	
		addAnnotation
		  (cartesianCoordinatesSetEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA set containing CartesianPositionCoordinates. It represent a point cloud."
		   });	
		addAnnotation
		  (coloredCartesianCoordinatesSetEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA set containing ColoredCartesianPositionCoordinates. It represents a point cloud."
		   });	
		addAnnotation
		  (cartesianCoordinatesSetExtentEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nClass that defines the volumetric extent of a set of cartesian coordinates."
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_XMin(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_XMax(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_YMin(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_YMax(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_ZMin(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_ZMax(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_XDimension(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_YDimension(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getCartesianCoordinatesSetExtent_ZDimension(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (cartesianTriangularMeshEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nClass representing a set of triangle defining a surface."
		   });	
		addAnnotation
		  (sphericalCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA spherical coordinate.\n@see https://en.wikipedia.org/wiki/Spherical_coordinate_system"
		   });	
		addAnnotation
		  (getSphericalCoordinates_Phi(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe azimuthal angle (about Z), in radians.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getSphericalCoordinates_Theta(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe polar angle, in radians.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getSphericalCoordinates_R(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe radius, in meters.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (poseEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a full position and orientation in a Cartesian frame."
		   });	
		addAnnotation
		  (sphereSamplingShapeEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA spherical sampling shape."
		   });	
		addAnnotation
		  (getSphereSamplingShape_Radius(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe radius of the sampling sphere, in meters.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getSphereSamplingShape_Center(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe position of the center of the sphere."
		   });	
		addAnnotation
		  (getSphereSamplingShape_IncludeJustTouching(), 
		   source, 
		   new String[] {
			 "documentation", "*\nWhether or not to include polygon that have a vertex on the boundary."
		   });	
		addAnnotation
		  (cubeSamplingShapeEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA Cube sampling shape."
		   });	
		addAnnotation
		  (getCubeSamplingShape_Corner1(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe position of the first corner defining the cube (or rectangular prism)."
		   });	
		addAnnotation
		  (getCubeSamplingShape_Corner2(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe position of the second corner defining the cube (or rectangular prism)."
		   });	
		addAnnotation
		  (getCubeSamplingShape_IncludeJustTouching(), 
		   source, 
		   new String[] {
			 "documentation", "*\nWhether or not to include polygon that have a vertex on the boundary."
		   });	
		addAnnotation
		  (pointLocatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefinition of a class used to find neighbors in a list of CartesianPositionCoordinates.\nSpecific operation to add/remove points from the list to be searched are defined as opposed to an\nattribute to enable sub-classes to easily manage changes in the list of point to search."
		   });	
		addAnnotation
		  (getPointLocator__GetPoints(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns a list of the points currently available for search."
		   });	
		addAnnotation
		  (getPointLocator__AddPoint__CartesianPositionCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "*\nAdds one point to the list of point to search."
		   });	
		addAnnotation
		  (getPointLocator__AddPoints__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nAdds a list of points to the list of point to search."
		   });	
		addAnnotation
		  (getPointLocator__RemovePoint__CartesianPositionCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "*\nRemoves one point from the list of point to search."
		   });	
		addAnnotation
		  (getPointLocator__RemovePoints__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nRemoves a list of points from the list of point to search."
		   });	
		addAnnotation
		  (getPointLocator__ClearPoints(), 
		   source, 
		   new String[] {
			 "documentation", "*\nRemove all points from the the list of point to search."
		   });	
		addAnnotation
		  (getPointLocator__FindClosestPoint__CartesianPositionCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns a specified point closest neighbor.\n@param point The specified point.\n@return The closest neighbor, null if the PointLocator has no points."
		   });	
		addAnnotation
		  (getPointLocator__FindClosestPoints__CartesianPositionCoordinates_int(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns a specified point closest neighbor.\n@param point The specified point.\n@param maximumNumberOfNeighbors The maximum number of neighbors to return.\n@return The closest neighbor, null if the PointLocator has no points."
		   });	
		addAnnotation
		  (getPointLocator__FindPointsWithinRadius__CartesianPositionCoordinates_double(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns a point\'s neighbor with a given radius.\n@param point The specified point.\n@param radius The maximum radius from the point.\n@return The list of neighbor within the radius. Never null, but can be empty."
		   });	
		addAnnotation
		  (kdTreeBasedPointLocatorEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA PointLocator implemented using a KDTree. This implementation is not thread safe."
		   });	
		addAnnotation
		  (meshLocalizerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nClass that provides an estimate of relative pose between two meshes, assuming the two meshes cover overlapping area of a surface."
		   });	
		addAnnotation
		  (getMeshLocalizer__Localize__CartesianTriangularMesh_Matrix4d_CartesianTriangularMesh_Matrix4d(), 
		   source, 
		   new String[] {
			 "documentation", "Localize a floating mesh with respect to a fixed mesh.\nThe transform returned is the transform between the floating mesh and the origin (i.e. a revised version of the floatingMeshTransformEstimate).\n@param fixedMesh The mesh that is considered fixed.\n@param fixedMeshTransform The transform of the fixed mesh relative to a common reference frame.\n@param floatingMesh The mesh that is considered floating relative to the fixed one.\n@param floatingMeshTransformEstimate An starting estimate of the pose of the floating mesh relative to the common reference frame."
		   });	
		addAnnotation
		  (delaunayMesherEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nMesher that uses the Quick Hull method to create a mesh from a point cloud. The algorithm is a three dimensional implementation of Quickhull by John E. Lloyd, as\ndescribed in Barber, Dobkin, and Huhdanpaa, <ahref=http://citeseer.ist.psu.edu/barber96quickhull.html> ``The Quickhull Algorithm for Convex Hulls\'\'</a> (ACM Transactions on Mathematical Software, Vol. 22, No. 4, December 1996)\nThis implementation assumes that the meshing plane is XY."
		   });	
		addAnnotation
		  (digitalElevationMapMesherEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nMesher for a DEM."
		   });	
		addAnnotation
		  (digitalElevationMapSamplerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA sampler that resamples a DEM based on a configurable resolution."
		   });	
		addAnnotation
		  (getDigitalElevationMapSampler_TargetResolution(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe target resolution of the DEM the sampler will return.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (uniquePointsFilterEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nFilters out duplicate points from a point cloud."
		   });	
		addAnnotation
		  (triangleEdgeLengthTriangularMeshFilterEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nFilters a triangular mesh based on the range of the triangle center relative to the origin and\nthe length of the longest edge the triangle."
		   });	
		addAnnotation
		  (getTriangleEdgeLengthTriangularMeshFilter__Filter__CartesianTriangularMesh(), 
		   source, 
		   new String[] {
			 "documentation", "*\nApplies the filter to a triangular mesh.\n@param input The input triangular mesh.\n@return A triangular mesh containing only the triangles that passed the filter."
		   });	
		addAnnotation
		  (getTriangleEdgeLengthTriangularMeshFilter_MinimumRange(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe minimum range of the center of the triangle with respect to the origin. Triangles with their center closer\nto the origin than this value are filtered out.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getTriangleEdgeLengthTriangularMeshFilter_MaximumRange(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe maximum range of the center of the triangle with respect to the origin. Triangles with their center further\nfrom the origin than this value are filtered out.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getTriangleEdgeLengthTriangularMeshFilter_MaximumEdgeLength(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe maximum length of a edge that a triangle can have to pass the filter.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (outlierFilterEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nFilters out point that a than a specified distance from any neighbor."
		   });	
		addAnnotation
		  (getOutlierFilter_MaxDistance(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe maximum distance a point can be from its closest neighbor an not be filtered out.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (meshSmootherEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nTODO : Define the algorithm used."
		   });	
		addAnnotation
		  (getMeshSmoother_NumberOfIterations(), 
		   source, 
		   new String[] {
			 "documentation", "*\nTODO : Defines what this does."
		   });	
		addAnnotation
		  (voxelBased3DPointCloudResamplerEClass, 
		   source, 
		   new String[] {
			 "documentation", "This processor sub-samples a point cloud using a voxel approach based on an implementation of J. Bakambu from MDA."
		   });	
		addAnnotation
		  (getVoxelBased3DPointCloudResampler_ResolutionX(), 
		   source, 
		   new String[] {
			 "documentation", "*\nVoxel resolution along the X axis.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getVoxelBased3DPointCloudResampler_ResolutionY(), 
		   source, 
		   new String[] {
			 "documentation", "*\nVoxel resolution along the Y axis.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getVoxelBased3DPointCloudResampler_ResolutionZ(), 
		   source, 
		   new String[] {
			 "documentation", "*\nVoxel resolution along the Z axis.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel(), 
		   source, 
		   new String[] {
			 "documentation", "*\nMinimum number of points per voxel required to have a voxel considered occupied."
		   });	
		addAnnotation
		  (getVoxelBased3DPointCloudResampler_TileResolution(), 
		   source, 
		   new String[] {
			 "documentation", "*\nTODO : Define what this does.",
			 "notify", "true",
			 "children", "false",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (positionMarkerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA Cartesian position with an ID."
		   });	
		addAnnotation
		  (getPositionMarker_Identifier(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe identifier of the position."
		   });	
		addAnnotation
		  (rigidBodyPoseTrackerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nTODO"
		   });	
		addAnnotation
		  (getRigidBodyPoseTracker__AddPositionMarkers__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nAdds a list of position marker to the one defining the rigid body.\n@param markers The list of position markers."
		   });	
		addAnnotation
		  (getRigidBodyPoseTracker__RemovePositionMarkers__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nRemoves a list of position marker from the one defining the rigid body.\n@param markers The list of position markers."
		   });	
		addAnnotation
		  (getRigidBodyPoseTracker__ComputeTransformation__EList(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThis method computes the 3D rigid body transformation between two 3D data sets. First, the rotation matrix is computed using the Singular\nValues Decomposition (SVD) approach. Then, the translation component is computed. Finally, rotation and translation components are packed\ninto an homogenous 4x4 matrix. Note: At least 3 markers are required to solve the 3D pose. If more than 3 markers are specified, the best fit\n(minimizing the root meaning square error) will be found.\n@param markerPositionsToTrack The list of position of the marker for which to find the body position.\n@return The position of the rigid body."
		   });	
		addAnnotation
		  (getRigidBodyPoseTracker__ComputeTransformation__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nComputes the 3D rigid body transformation between the markers defining the rigid body and a new set of the position markers.\n@param markerPositionsToTrack The list of position of the marker for which to find the body pose.\n@return The pose of the rigid body, represented as a 4x4 homogenous matrix."
		   });	
		addAnnotation
		  (getRigidBodyPoseTracker_PositionMarkersAtOrigin(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe list of position markers for the rigid body at the origin."
		   });	
		addAnnotation
		  (getApogyCommonGeometryData3DFacade__UpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double(), 
		   source, 
		   new String[] {
			 "documentation", "*\n@aparam xyzData The array of n points organize as [0..n][x,y,z]."
		   });	
		addAnnotation
		  (data3DIOEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nClass defining methods used to save / load 3D data to / from files."
		   });	
		addAnnotation
		  (getData3DIO__LoadTriangularMesh__String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nLoads a CartesianTriangularMesh from an XMI resource.\n@param file The file path to the resource.\n@return The loaded CartesianTriangularMesh."
		   });	
		addAnnotation
		  (getData3DIO__LoadTriangularMesh__InputStream(), 
		   source, 
		   new String[] {
			 "documentation", "*\nLoads a CartesianTriangularMesh from an XMI resource.\n@param input The input stream to read the content from.\n@return The loaded CartesianTriangularMesh."
		   });	
		addAnnotation
		  (getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSaves a CartesianTriangularMesh as an XMI resource.\n@param mesh The CartesianTriangularMesh to save.\n@param file The destination file path for the resource."
		   });	
		addAnnotation
		  (getData3DIO__SaveTriangularMesh__CartesianTriangularMesh_OutputStream(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSaves a CartesianTriangularMesh as an XMI resource.\n@param mesh The CartesianTriangularMesh to save.\n@param output The output stream to write the content."
		   });	
		addAnnotation
		  (getData3DIO__LoadTriangularMeshFromASCIIAsNormalPointCloud__String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nLoads a NormalPointCloud from ASCII files. Two files are required : filePrefix.xyz : contains the points and\nfilePrefix.tri : containing the list of triangles.\n@param filePrefix The file prefix defining both the points and triangles files.\n@return The loaded NormalPointCloud."
		   });	
		addAnnotation
		  (getData3DIO__LoadTriangularMeshFromASCII__String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nLoads a CartesianTriangularMesh from ASCII files. Two files are required : filePrefix.xyz : contains the points and\nfilePrefix.tri : containing the list of triangles.\n@param filePrefix The file prefix defining both the points and triangles files.\n@return The loaded CartesianTriangularMesh."
		   });	
		addAnnotation
		  (getData3DIO__SaveTriangularMeshAsASCII__CartesianTriangularMesh_String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSaves a CartesianTriangularMesh to ASCII files. Two files are produced : filePrefix.xyz : contains the points and\nfilePrefix.tri : containing the list of triangles.\n@param mesh The CartesianTriangularMesh to save.\n@param filePrefix The file prefix defining both the points and triangles files."
		   });	
		addAnnotation
		  (getData3DIO__LoadXYZ__String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nLoads a CartesianCoordinatesSet from an .xyz file. The .xyz can contains 3 column (x,y, z coordinates of the point) or\n6 (x,y,z coordinates of the point + the normal vector at the point)\n@param fileName The file path to the file.\n@return The CartesianCoordinatesSet loaded from the file."
		   });	
		addAnnotation
		  (getData3DIO__LoadTriangularMeshFromTriXYZ__String_String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nLoads a CartesianTriangularMesh from two ASCII files. Two files are required : xyzFileName.xyz : contains the points and\ntriFileName.tri : containing the list of triangles.\n@param triFileName The file path to the file containing the triangles.\n@param xyzFileName The file path to the file containing the points.\n@return The loaded CartesianTriangularMesh."
		   });	
		addAnnotation
		  (getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSaves a CartesianCoordinatesSet to an .xyz formatted file.\n@param coordinatesSet The CartesianCoordinatesSet to save.\n@param file The file path of the destination."
		   });	
		addAnnotation
		  (getData3DIO__SaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSaves a CartesianCoordinatesSet to an .xyz formatted file.\n@param coordinatesSet The CartesianCoordinatesSet to save.\n@param file The output stream to write the content.."
		   });	
		addAnnotation
		  (getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_String(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSaves a CartesianCoordinatesSet to an comma separated formatted file.\n@param coordinatesSet The CartesianCoordinatesSet to save.\n@param file The file path of the destination."
		   });	
		addAnnotation
		  (getData3DIO__SaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream(), 
		   source, 
		   new String[] {
			 "documentation", "*\nSaves a CartesianCoordinatesSet to an comma separated formatted file.\n@param coordinatesSet The CartesianCoordinatesSet to save.\n@param file The file path of the destination."
		   });	
		addAnnotation
		  (data3DUtilsEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nUtilities class."
		   });	
		addAnnotation
		  (getData3DUtils__ComputeNormalAtVertex__CartesianTriangularMesh_CartesianPositionCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "*\nComputes the normal at a given vertex in a mesh. The normal is the weighted average (by polygon area)\nof all the polygons sharing the specified point.\n@param mesh The mesh containing the point.\n@param vertex The vertex contained in the mesh."
		   });	
		addAnnotation
		  (getData3DUtils__ComputeCentroid__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nComputes the position of the centroid of a list of CartesianPositionCoordinates.\n@param points The list of CartesianPositionCoordinates.\n@return The centroid position of the list of CartesianPositionCoordinates, null if the list is empty."
		   });	
		addAnnotation
		  (getData3DUtils__ComputeCentroid__CartesianCoordinatesSet(), 
		   source, 
		   new String[] {
			 "documentation", "*\nComputes the position of the centroid of a CartesianCoordinatesSet.\n@param points The CartesianCoordinatesSet.\n@return The centroide position of the CartesianCoordinatesSet, null if the CartesianCoordinatesSet is empty."
		   });
	}

} //ApogyCommonGeometryData3DPackageImpl
