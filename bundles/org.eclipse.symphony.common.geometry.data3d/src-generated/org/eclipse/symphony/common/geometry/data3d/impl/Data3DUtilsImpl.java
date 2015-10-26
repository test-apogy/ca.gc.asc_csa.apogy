/**
 * Canadian Space Agency 2007.
 *
 * $Id: Data3DUtilsImpl.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.GMatrix;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Data3DUtils;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.PointLocator;
import org.eclipse.symphony.common.geometry.data3d.VecmathPointLocator;
import org.eclipse.symphony.common.math.GeometricUtils;

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
		return Symphony__CommonGeometryData3DPackage.Literals.DATA3_DUTILS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vector3d> computeNormals(CartesianTriangularMesh mesh) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates computeCentroid(
			CartesianCoordinatesSet points) {
		Point3d centroid = new Point3d(0.0, 0.0, 0.0);

		for (CartesianPositionCoordinates point : points.getPoints()) {
			centroid.add(point.asPoint3d());
		}

		centroid.scale(1.0 / (double) points.getPoints().size());

		CartesianPositionCoordinates centroidCoord = Data3dFacade.INSTANCE
				.createCartesianPositionCoordinates(centroid.x, centroid.y,
						centroid.z);

		return centroidCoord;
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
	public double computeCurvatureChange(PointLocator pointLocator,
			int centerPoint, double radius) {
		double cc = 0.0;

		// On trouve les K voisins.

		List<CartesianPositionCoordinates> data = pointLocator.getPoints();
		CartesianPositionCoordinates pCenter = data.get(centerPoint);
		List<CartesianPositionCoordinates> result = pointLocator
				.findPointsWithinRadius(radius, pCenter);

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double computeCurvatureChange(VecmathPointLocator pointLocator,
			int centerPoint, double radius) {
		double cc = 0.0;

		// On trouve les K voisins.

		List<Point3d> data = pointLocator.getPoints();
		Point3d pCenter = data.get(centerPoint);
		List<Point3d> result = pointLocator.findPointsWithinRadius(radius,
				pCenter);

		GMatrix res = new GMatrix(3, 3);

		res.setZero();

		Vector3d v = new Vector3d();

		GMatrix tmpMat = new GMatrix(3, 3);

		Vector3d o = new Vector3d(data.get(centerPoint));

		for (Point3d point : result) {

			v.set(point);

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
		CartesianTriangularMesh mesh = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
		
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
					positivePoint = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(halfExtrusionWidth, y, z);
					negativePoint = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(-halfExtrusionWidth, y, z);
				break;

				case CartesianAxis.Y_VALUE:		
					positivePoint = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x, halfExtrusionWidth, z);
					negativePoint = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x, -halfExtrusionWidth, z);
				break;

				case CartesianAxis.Z_VALUE:		
					positivePoint = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x, y, halfExtrusionWidth);
					negativePoint = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(x, y, -halfExtrusionWidth);
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
			
			CartesianTriangle triangle = Data3dFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
			mesh.getPolygons().add(triangle);
		}
		for(int i = 0; i < edgeNegative.size() - 1; i++)
		{
			CartesianPositionCoordinates v1 = edgePositive.get(i);
			CartesianPositionCoordinates v2 = edgeNegative.get(i+1);
			CartesianPositionCoordinates v3 = edgePositive.get(i+1);
			
			CartesianTriangle triangle = Data3dFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
			mesh.getPolygons().add(triangle);
		}			
		
		if(closeMesh)
		{
			CartesianPositionCoordinates v1 = edgeNegative.get(edgeNegative.size() - 1);
			CartesianPositionCoordinates v2 = edgeNegative.get(0);
			CartesianPositionCoordinates v3 = edgePositive.get(edgeNegative.size() - 1);
			
			CartesianTriangle triangle = Data3dFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
			mesh.getPolygons().add(triangle);
			
			v1 = edgePositive.get(edgeNegative.size() - 1);
			v2 = edgeNegative.get(0);
			v3 = edgePositive.get(0);
			
			triangle = Data3dFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
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
			case Symphony__CommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_NORMALS__CARTESIANTRIANGULARMESH:
				return computeNormals((CartesianTriangularMesh)arguments.get(0));
			case Symphony__CommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_CENTROID__CARTESIANCOORDINATESSET:
				return computeCentroid((CartesianCoordinatesSet)arguments.get(0));
			case Symphony__CommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_MIN_MAX_VALUES__POINT3D_POINT3D_CARTESIANCOORDINATESSET:
				computeMinMaxValues((Point3d)arguments.get(0), (Point3d)arguments.get(1), (CartesianCoordinatesSet)arguments.get(2));
				return null;
			case Symphony__CommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__POINTLOCATOR_INT_DOUBLE:
				return computeCurvatureChange((PointLocator)arguments.get(0), (Integer)arguments.get(1), (Double)arguments.get(2));
			case Symphony__CommonGeometryData3DPackage.DATA3_DUTILS___COMPUTE_CURVATURE_CHANGE__VECMATHPOINTLOCATOR_INT_DOUBLE:
				return computeCurvatureChange((VecmathPointLocator)arguments.get(0), (Integer)arguments.get(1), (Double)arguments.get(2));
			case Symphony__CommonGeometryData3DPackage.DATA3_DUTILS___EXTRUDE__LIST_CARTESIANAXIS_DOUBLE_BOOLEAN:
				return extrude((List<CartesianPositionCoordinates>)arguments.get(0), (CartesianAxis)arguments.get(1), (Double)arguments.get(2), (Boolean)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} // Data3DUtilsImpl
