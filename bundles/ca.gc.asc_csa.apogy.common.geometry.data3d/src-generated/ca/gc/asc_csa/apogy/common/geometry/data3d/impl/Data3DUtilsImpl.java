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

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.GMatrix;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DUtils;
import ca.gc.asc_csa.apogy.common.geometry.data3d.PointLocator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;

import Jama.EigenvalueDecomposition;
import Jama.Matrix;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Data3 DUtils</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class Data3DUtilsImpl extends MinimalEObjectImpl.Container implements Data3DUtils {

	private static Data3DUtils instance = null;

	public static Data3DUtils getInstance() {
		if (instance == null) {
			instance = new Data3DUtilsImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3DUtilsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.DATA3_DUTILS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<Vector3d> computeNormals(CartesianTriangularMesh mesh) 
	{
		List<Vector3d> normals = new ArrayList<Vector3d>();
		
		for(CartesianPositionCoordinates vertex : mesh.getPoints())
		{
			Vector3d normal = computeNormalAtVertex(mesh, vertex);
			normals.add(normal);
		}
		
		return normals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Vector3d computeNormalAtVertex(CartesianTriangularMesh mesh, CartesianPositionCoordinates vertex) 
	{
		Vector3d normal = new Vector3d();
		
		List<CartesianTriangle> polygons = mesh.getPolygonsSharingPoint(vertex);
		
		for(CartesianTriangle polygon : polygons)
		{
			double area = polygon.getSurface();			
			Vector3d polygonNormal = polygon.getNormal();
			polygonNormal.scale(area);
			normal.add(polygonNormal);
		}
		
		normal.normalize();
		
		return normal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates computeCentroid(List<CartesianPositionCoordinates> points) 
	{
		Point3d centroid = new Point3d(0.0, 0.0, 0.0);

		for (CartesianPositionCoordinates point : points) 
		{
			centroid.add(point.asPoint3d());
		}

		centroid.scale(1.0 / (double) points.size());

		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(centroid.x, centroid.y,
						centroid.z);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates computeCentroid(CartesianCoordinatesSet points) 
	{
		return computeCentroid(points.getPoints());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void computeMinMaxValues(Point3d min, Point3d max,
			CartesianCoordinatesSet data) {

		if (min == null || max == null || data == null) {
			throw new IllegalArgumentException();
		}

		int size = data.getPoints().size();

		if (size > 0) {

			min.set(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
			max.set(Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE);

			for (CartesianPositionCoordinates point : data.getPoints()) {
				if (point.getX() < min.x) {
					min.x = point.getX();
				}

				if (point.getY() < min.y) {
					min.y = point.getY();
				}

				if (point.getZ() < min.z) {
					min.z = point.getZ();
				}

				if (point.getX() > max.x) {
					max.x = point.getX();
				}

				if (point.getY() > max.y) {
					max.y = point.getY();
				}

				if (point.getZ() > max.z) {
					max.z = point.getZ();
				}
			}
		} else {
			min.set(0.0, 0.0, 0.0);
			max.set(0.0, 0.0, 0.0);

		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double computeCurvatureChange(PointLocator pointLocator, int centerPoint, double radius) 
	{
		double cc = 0.0;

		// On trouve les K voisins.

		List<CartesianPositionCoordinates> data = pointLocator.getPoints();
		CartesianPositionCoordinates pCenter = data.get(centerPoint);
		List<CartesianPositionCoordinates> result = pointLocator.findPointsWithinRadius(pCenter, radius);

		GMatrix res = new GMatrix(3, 3);

		res.setZero();

		Vector3d v = new Vector3d();

		GMatrix tmpMat = new GMatrix(3, 3);

		Vector3d o = new Vector3d(data.get(centerPoint).asPoint3d());

		for (CartesianPositionCoordinates point : result) {

			v.set(point.asPoint3d());

			v.sub(o);
			// On calcule le outerProduct.
			GeometricUtils.outerProduct(v, v, tmpMat);

			res.add(tmpMat);

		}

		// On calcule le SVD.

		Matrix cov = new Matrix(3, 3);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				cov.set(i, j, res.getElement(i, j));
			}
		}

		EigenvalueDecomposition eig = new EigenvalueDecomposition(cov);

		Matrix d = eig.getD();

		// On prend les valeurs.
		double l1 = d.get(0, 0);
		double l2 = d.get(1, 1);
		double l3 = d.get(2, 2);

		cc = (l1 / (l1 + l2 + l3));

		return cc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMesh extrude(List<CartesianPositionCoordinates> profilePoints, CartesianAxis extrusionAxis, double extrusionWidth, boolean closeMesh) 
	{
		CartesianTriangularMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
		
		// Makes two arrays of point, one for each edge of the mesh.
		List<CartesianPositionCoordinates> edgePositive = new ArrayList<CartesianPositionCoordinates>();				
		List<CartesianPositionCoordinates> edgeNegative = new ArrayList<CartesianPositionCoordinates>();		
		double halfExtrusionWidth = extrusionWidth / 2.0;		
		for(CartesianPositionCoordinates point : profilePoints)
		{
			double x = point.getX();
			double y = point.getY();
			double z = point.getZ();
			
			CartesianPositionCoordinates positivePoint = null;
			CartesianPositionCoordinates negativePoint = null;
			
			switch (extrusionAxis.getValue()) 
			{
				case CartesianAxis.X_VALUE:
					positivePoint = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(halfExtrusionWidth, y, z);
					negativePoint = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-halfExtrusionWidth, y, z);
				break;

				case CartesianAxis.Y_VALUE:		
					positivePoint = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, halfExtrusionWidth, z);
					negativePoint = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, -halfExtrusionWidth, z);
				break;

				case CartesianAxis.Z_VALUE:		
					positivePoint = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, y, halfExtrusionWidth);
					negativePoint = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x, y, -halfExtrusionWidth);
				break;
				
				default:
				break;
			}
			
			edgePositive.add(positivePoint);
			edgeNegative.add(negativePoint);
		}				
		
		// Adds all the vertex to the mesh
		for(CartesianPositionCoordinates p : edgePositive)
		{
			mesh.getPoints().add(p);
		}		
		for(CartesianPositionCoordinates p : edgeNegative)
		{
			mesh.getPoints().add(p);
		}
		
		// Adds triangles to the mesh.
		for(int i = 0; i < edgeNegative.size() - 1; i++)
		{
			CartesianPositionCoordinates v1 = edgeNegative.get(i);
			CartesianPositionCoordinates v2 = edgeNegative.get(i+1);
			CartesianPositionCoordinates v3 = edgePositive.get(i);
			
			CartesianTriangle triangle = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
			mesh.getPolygons().add(triangle);
		}
		for(int i = 0; i < edgeNegative.size() - 1; i++)
		{
			CartesianPositionCoordinates v1 = edgePositive.get(i);
			CartesianPositionCoordinates v2 = edgeNegative.get(i+1);
			CartesianPositionCoordinates v3 = edgePositive.get(i+1);
			
			CartesianTriangle triangle = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
			mesh.getPolygons().add(triangle);
		}			
		
		if(closeMesh)
		{
			CartesianPositionCoordinates v1 = edgeNegative.get(edgeNegative.size() - 1);
			CartesianPositionCoordinates v2 = edgeNegative.get(0);
			CartesianPositionCoordinates v3 = edgePositive.get(edgeNegative.size() - 1);
			
			CartesianTriangle triangle = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
			mesh.getPolygons().add(triangle);
			
			v1 = edgePositive.get(edgeNegative.size() - 1);
			v2 = edgeNegative.get(0);
			v3 = edgePositive.get(0);
			
			triangle = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
			mesh.getPolygons().add(triangle);
		}
		
		
		return mesh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_NORMALS__CARTESIANTRIANGULARMESH:
				return computeNormals((CartesianTriangularMesh)arguments.get(0));
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_NORMAL_AT_VERTEX__CARTESIANTRIANGULARMESH_CARTESIANPOSITIONCOORDINATES:
				return computeNormalAtVertex((CartesianTriangularMesh)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1));
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_CENTROID__LIST:
				return computeCentroid((List<CartesianPositionCoordinates>)arguments.get(0));
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_CENTROID__CARTESIANCOORDINATESSET:
				return computeCentroid((CartesianCoordinatesSet)arguments.get(0));
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_MIN_MAX_VALUES__POINT3D_POINT3D_CARTESIANCOORDINATESSET:
				computeMinMaxValues((Point3d)arguments.get(0), (Point3d)arguments.get(1), (CartesianCoordinatesSet)arguments.get(2));
				return null;
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__POINTLOCATOR_INT_DOUBLE:
				return computeCurvatureChange((PointLocator)arguments.get(0), (Integer)arguments.get(1), (Double)arguments.get(2));
			case ApogyCommonGeometryData3DPackage.DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN:
				return extrude((List<CartesianPositionCoordinates>)arguments.get(0), (CartesianAxis)arguments.get(1), (Double)arguments.get(2), (Boolean)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} // Data3DUtilsImpl
