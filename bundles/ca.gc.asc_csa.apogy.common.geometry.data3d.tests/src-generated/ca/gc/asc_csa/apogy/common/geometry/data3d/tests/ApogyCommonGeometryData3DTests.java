package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;
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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>data3d</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ApogyCommonGeometryData3DTests("data3d Tests");
		suite.addTestSuite(CartesianPolygonTest.class);
		suite.addTestSuite(CartesianTriangleTest.class);
		suite.addTestSuite(CartesianPositionCoordinatesTest.class);
		suite.addTestSuite(ColoredCartesianPositionCoordinatesTest.class);
		suite.addTestSuite(AbstractCartesianCoordinatesSetTest.class);
		suite.addTestSuite(CartesianCoordinatesSetTest.class);
		suite.addTestSuite(ColoredCoordinatesSetTest.class);
		suite.addTestSuite(CartesianCoordinatesSetExtentTest.class);
		suite.addTestSuite(DigitalElevationMapTest.class);
		suite.addTestSuite(CartesianCoordinatesMeshTest.class);
		suite.addTestSuite(CartesianTriangularMeshTest.class);
		suite.addTestSuite(SphericalCoordinatesMeshTest.class);
		suite.addTestSuite(SphericalTriangularMeshTest.class);
		suite.addTestSuite(PoseTest.class);
		suite.addTestSuite(SphereSamplingShapeTest.class);
		suite.addTestSuite(CubeSamplingShapeTest.class);
		suite.addTestSuite(CartesianCoordinatesSetShapeSamplerTest.class);
		suite.addTestSuite(CartesianCoordinatesMeshSamplerTest.class);
		suite.addTestSuite(CartesianCoordinatesMeshPolygonSamplerTest.class);
		suite.addTestSuite(CartesianTriangularMeshSamplerTest.class);
		suite.addTestSuite(CartesianTriangularMeshPolygonSamplerTest.class);
		suite.addTestSuite(CartesianPositionCoordinatesMesherTest.class);
		suite.addTestSuite(KDTreeBasedPointLocatorTest.class);
		suite.addTestSuite(MeshLocalizerTest.class);
		suite.addTestSuite(DelaunayMesherTest.class);
		suite.addTestSuite(DigitalElevationMapMesherTest.class);
		suite.addTestSuite(DigitalElevationMapSamplerTest.class);
		suite.addTestSuite(TriangularMeshNormalsCalculatorTest.class);
		suite.addTestSuite(TriangularMeshToNormalPointCloudTest.class);
		suite.addTestSuite(UniquePointsFilterTest.class);
		suite.addTestSuite(TriangleEdgeLengthTriangularMeshFilterTest.class);
		suite.addTestSuite(OutlierFilterTest.class);
		suite.addTestSuite(MeshSmootherTest.class);
		suite.addTestSuite(VoxelBased3DPointCloudResamplerTest.class);
		suite.addTestSuite(PositionMarkerTest.class);
		suite.addTestSuite(RigidBodyPoseTrackerTest.class);
		suite.addTestSuite(ApogyCommonGeometryData3DFacadeTest.class);
		suite.addTestSuite(Data3DIOTest.class);
		suite.addTestSuite(Data3DUtilsTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DTests(String name) {
		super(name);
	}

} //ApogyCommonGeometryData3DTests
