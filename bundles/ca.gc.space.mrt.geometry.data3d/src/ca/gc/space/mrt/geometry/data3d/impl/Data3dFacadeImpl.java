/**
 * Canadian Space Agency 2007.
 *
 * $Id: Data3dFacadeImpl.java,v 1.7.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.DigitalElevationMap;
import ca.gc.space.mrt.geometry.data3d.Geometry3dUtilities;
import ca.gc.space.mrt.geometry.data3d.NormalPointCloud;
import ca.gc.space.mrt.geometry.data3d.PointNormalLocator;
import ca.gc.space.mrt.geometry.data3d.Pose;
import ca.gc.space.mrt.geometry.data3d.SphericalCoordinates;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class Data3dFacadeImpl extends EObjectImpl implements Data3dFacade {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	private static Data3dFacade instance = null;

	public static Data3dFacade getInstance() {
		if (instance == null) {
			instance = new Data3dFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3dFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.DATA3D_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public CartesianPositionCoordinates createCartesianPositionCoordinates(
			double x, double y, double z) {
		CartesianPositionCoordinates coord = Data3dFactory.eINSTANCE
				.createCartesianPositionCoordinates();

		coord.setX(x);
		coord.setY(y);
		coord.setZ(z);

		return coord;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public CartesianOrientationCoordinates createCartesianOrientationCoordinates(
			double xRotation, double yRotation, double zRotation) {
		CartesianOrientationCoordinates coord = Data3dFactory.eINSTANCE
				.createCartesianOrientationCoordinates();

		coord.setXRotation(xRotation);
		coord.setYRotation(yRotation);
		coord.setZRotation(zRotation);

		return coord;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SphericalCoordinates createSphericalCoordinates(double phi,
			double theta, double r) {
		SphericalCoordinates coord = Data3dFactory.eINSTANCE
				.createSphericalCoordinates();

		coord.setPhi(phi);
		coord.setTheta(theta);
		coord.setR(r);

		return coord;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Pose createPose(double x, double y, double z, double xRotation,
			double yRotation, double zRotation) {
		Pose pose = Data3dFactory.eINSTANCE.createPose();
		pose.setX(x);
		pose.setY(y);
		pose.setZ(z);

		pose.setXRotation(xRotation);
		pose.setYRotation(yRotation);
		pose.setZRotation(zRotation);

		return pose;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Pose createPose(Pose pose) {
		return createPose(pose.getX(), pose.getY(), pose.getZ(), pose
				.getXRotation(), pose.getYRotation(), pose.getZRotation());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Pose createPose(CartesianPositionCoordinates position,
			CartesianOrientationCoordinates orientation) {
		Pose pose = Data3dFactory.eINSTANCE.createPose();

		pose.setX(position.getX());
		pose.setY(position.getY());
		pose.setZ(position.getZ());

		pose.setXRotation(orientation.getXRotation());
		pose.setYRotation(orientation.getYRotation());
		pose.setZRotation(orientation.getZRotation());

		return pose;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianPolygon createCartesianPolygon(
			CartesianPositionCoordinates v1, CartesianPositionCoordinates v2,
			CartesianPositionCoordinates v3) {

		CartesianPolygon polygon = Data3dFactory.eINSTANCE
				.createCartesianPolygon();
		polygon.getVertices().add(v1);
		polygon.getVertices().add(v2);
		polygon.getVertices().add(v3);

		return polygon;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates createCartesianPositionCoordinates(
			CartesianPositionCoordinates coordinates) {
		CartesianPositionCoordinates coord = Data3dFactory.eINSTANCE
				.createCartesianPositionCoordinates();

		coord.setX(coordinates.getX());
		coord.setY(coordinates.getY());
		coord.setZ(coordinates.getZ());

		return coord;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianOrientationCoordinates createCartesianOrientationCoordinates(
			CartesianOrientationCoordinates coordinates) {
		CartesianOrientationCoordinates coord = Data3dFactory.eINSTANCE
				.createCartesianOrientationCoordinates();

		coord.setXRotation(coordinates.getXRotation());
		coord.setYRotation(coordinates.getYRotation());
		coord.setZRotation(coordinates.getZRotation());

		return coord;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianCoordinatesMesh createCartesianCoordinatesMesh(
			CartesianCoordinatesMesh cartesianCoordinatesMesh) {
		return (CartesianCoordinatesMesh) EcoreUtil
				.copy(cartesianCoordinatesMesh);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangle createCartesianTriangle(
			CartesianPositionCoordinates v1, CartesianPositionCoordinates v2,
			CartesianPositionCoordinates v3) {
		CartesianTriangle triangle = Data3dFactory.eINSTANCE
				.createCartesianTriangle();
		triangle.getVertices().add(v1);
		triangle.getVertices().add(v2);
		triangle.getVertices().add(v3);

		return triangle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public <T extends CartesianPolygon> CartesianTriangle createCartesianTriangle(
			T polygon) throws IllegalArgumentException {
		CartesianTriangle triangle = Data3dFactory.eINSTANCE
				.createCartesianTriangle();

		if (polygon.getVertices().size() != 3) {
			throw new IllegalArgumentException();
		} else {
			triangle.getVertices().addAll(polygon.getVertices());
		}

		return triangle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianCoordinatesSet applyTransform(
			CartesianCoordinatesSet points, Matrix4d trMatrix) {

		CartesianCoordinatesSet trPoints = Data3dFactory.eINSTANCE
				.createCartesianCoordinatesSet();

		List<CartesianPositionCoordinates> pointList = new ArrayList<CartesianPositionCoordinates>();

		for (CartesianPositionCoordinates point : points.getPoints()) {
			Point3d p = point.asPoint3d();

			trMatrix.transform(p);

			CartesianPositionCoordinates trPoint = instance
					.createCartesianPositionCoordinates(p.x, p.y, p.z);

			pointList.add(trPoint);
		}

		trPoints.getPoints().addAll(pointList);

		return trPoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianCoordinatesMesh createCartesianCoordinatesMesh(
			List<CartesianPolygon> polygons) {
		CartesianCoordinatesMesh mesh = Data3dFactory.eINSTANCE
				.createCartesianCoordinatesMesh();

		TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates> originalToCopyMap = new TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates>(
				new Geometry3dUtilities.CartesianPositionCoordinatesDistanceComparator());
		for (CartesianPolygon polygon : polygons) {
			// Creates a new polygon.
			CartesianPolygon polygonCopy = Data3dFactory.eINSTANCE
					.createCartesianPolygon();
			mesh.getPolygons().add(polygonCopy);

			// Copies the vertex and keep a reference to the original.
			for (CartesianPositionCoordinates point : polygon.getVertices()) {
				CartesianPositionCoordinates pointCopy = originalToCopyMap
						.get(point);

				// If the point original has not been encountered yet.
				if (pointCopy == null) {
					// Create copy of vertex.
					pointCopy = createCartesianPositionCoordinates(point);

					// Adds it to the mesh.
					mesh.getPoints().add(pointCopy);

					// Keep a references to the original.
					originalToCopyMap.put(point, pointCopy);
				}

				// Adds the vertex copy to the polygon copy.
				polygonCopy.getVertices().add(pointCopy);
			}
		}

		return mesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh createCartesianTriangularMesh(
			List<CartesianTriangle> polygons) {
		CartesianTriangularMesh mesh = Data3dFactory.eINSTANCE
				.createCartesianTriangularMesh();

		TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates> originalToCopyMap = new TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates>(
				new Geometry3dUtilities.CartesianPositionCoordinatesDistanceComparator());
		for (CartesianPolygon polygon : polygons) {
			// Creates a new polygon.
			CartesianTriangle polygonCopy = Data3dFactory.eINSTANCE
					.createCartesianTriangle();
			mesh.getPolygons().add(polygonCopy);

			// Copies the vertex and keep a reference to the original.
			for (CartesianPositionCoordinates point : polygon.getVertices()) {
				CartesianPositionCoordinates pointCopy = originalToCopyMap
						.get(point);

				// If the point original has not been encountered yet.
				if (pointCopy == null) {
					// Create copy of vertex.
					pointCopy = createCartesianPositionCoordinates(point);

					// Adds it to the mesh.
					mesh.getPoints().add(pointCopy);

					// Keep a references to the original.
					originalToCopyMap.put(point, pointCopy);
				}

				// Adds the vertex copy to the polygon copy.
				polygonCopy.getVertices().add(pointCopy);
			}
		}

		return mesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<CartesianPositionCoordinates> applyTransform(
			List<CartesianPositionCoordinates> points, Matrix4d trMatrix) {
		List<CartesianPositionCoordinates> trPoints = new ArrayList<CartesianPositionCoordinates>(
				points.size());

		for (CartesianPositionCoordinates point : points) {
			Point3d p = point.asPoint3d();

			trMatrix.transform(p);

			CartesianPositionCoordinates trPoint = instance
					.createCartesianPositionCoordinates(p.x, p.y, p.z);

			trPoints.add(trPoint);
		}

		return trPoints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh applyTransform(CartesianTriangularMesh mesh,
			Matrix4d trMatrix) {

		List<CartesianPositionCoordinates> trPoints = new ArrayList<CartesianPositionCoordinates>();

		Map<CartesianPositionCoordinates, Integer> pointToIdMap = new HashMap<CartesianPositionCoordinates, Integer>();

		int i = 0;

		for (CartesianPositionCoordinates p : mesh.getPoints()) {
			Point3d p3d = p.asPoint3d();

			trMatrix.transform(p3d);

			CartesianPositionCoordinates trP = Data3dFacade.INSTANCE
					.createCartesianPositionCoordinates(p3d.x, p3d.y, p3d.z);

			trPoints.add(trP);

			pointToIdMap.put(p, i++);
		}

		List<CartesianTriangle> triangles = new ArrayList<CartesianTriangle>();

		for (CartesianTriangle tri : mesh.getPolygons()) {
			CartesianTriangle newTri = Data3dFactory.eINSTANCE
					.createCartesianTriangle();
			for (CartesianPositionCoordinates triPoint : tri.getVertices()) {
				int id = pointToIdMap.get(triPoint);

				CartesianPositionCoordinates newPoint = trPoints.get(id);
				newTri.getVertices().add(newPoint);
			}
			triangles.add(newTri);
		}

		CartesianTriangularMesh trMesh = Data3dFactory.eINSTANCE
				.createCartesianTriangularMesh();

		trMesh.getPoints().addAll(trPoints);
		trMesh.getPolygons().addAll(triangles);

		// We transform the normals.
		if (mesh.getNormals() != null) {
			List<Vector3d> trNormals = new LinkedList<Vector3d>();
			Matrix3d rotation = new Matrix3d();
			trMatrix.getRotationScale(rotation);
			rotation.setScale(1.0);
			for (Vector3d normal : mesh.getNormals()) {
				Vector3d trNormal = new Vector3d(normal);
				rotation.transform(trNormal);
				trNormals.add(trNormal);
			}
			trMesh.setNormals(trNormals);
		}

		return trMesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh applyTransformInt(
			CartesianTriangularMesh mesh, Matrix4d trMatrix) {

		for (CartesianPositionCoordinates p : mesh.getPoints()) {
			Point3d p3d = p.asPoint3d();

			trMatrix.transform(p3d);

			p.setX(p3d.x);
			p.setY(p3d.y);
			p.setZ(p3d.z);
		}

		return mesh;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public NormalPointCloud applyTransform(NormalPointCloud points,
			Matrix4d trMatrix) {

		if (points.getNormals() != null
				&& points.getNormals().size() != points.getPoints().size()) {
			throw new IllegalArgumentException("Error: normal ("
					+ points.getNormals().size() + ") != points ("
					+ points.getPoints().size() + ")");
		}

		// We extract the rotation component of 'trMatrix', to apply it to the
		// normals.
		Matrix3d rotation = new Matrix3d();
		trMatrix.getRotationScale(rotation);

		rotation.setScale(1.0);

		List<Vector3d> trNormals = null;

		if (points.getNormals() != null) {

			trNormals = new ArrayList<Vector3d>(points.getNormals().size());
		}

		List<Point3d> trPoints = new ArrayList<Point3d>(points.getPoints()
				.size());

		for (int i = 0; i < points.getPoints().size(); i++) {
			Point3d pi = new Point3d(points.getPoints().get(i));

			if (points.getNormals() != null) {

				Vector3d ni = new Vector3d(points.getNormals().get(i));
				rotation.transform(ni);
				trNormals.add(ni);
			}

			trMatrix.transform(pi);
			trPoints.add(pi);
		}

		NormalPointCloud trPointCloud = Data3dFactory.eINSTANCE
				.createNormalPointCloud();
		trPointCloud.setNormals(trNormals);
		trPointCloud.setPoints(trPoints);

		return trPointCloud;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianCoordinatesMesh createCartesianCoordinatesMesh(
			CartesianTriangularMesh cartesianTriangularMesh) {
		CartesianCoordinatesMesh ccmesh = Data3dFactory.eINSTANCE
				.createCartesianCoordinatesMesh();

		TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates> originalToCopyMap = new TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates>(
				new Geometry3dUtilities.CartesianPositionCoordinatesDistanceComparator());
		for (CartesianTriangle polygon : cartesianTriangularMesh.getPolygons()) {
			// Creates a new polygon.
			CartesianPolygon polygonCopy = Data3dFactory.eINSTANCE
					.createCartesianPolygon();
			ccmesh.getPolygons().add(polygonCopy);

			// Copies the vertex and keep a reference to the original.
			for (CartesianPositionCoordinates point : polygon.getVertices()) {
				CartesianPositionCoordinates pointCopy = originalToCopyMap
						.get(point);

				// If the point original has not been encountered yet.
				if (pointCopy == null) {
					// Create copy of vertex.
					pointCopy = createCartesianPositionCoordinates(point);

					// Adds it to the mesh.
					ccmesh.getPoints().add(pointCopy);

					// Keep a references to the original.
					originalToCopyMap.put(point, pointCopy);
				}

				// Adds the vertex copy to the polygon copy.
				polygonCopy.getVertices().add(pointCopy);
			}
		}

		return ccmesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh createCartesianTriangularMesh(CartesianTriangularMesh cartesianTriangularMesh) 
	{
		CartesianTriangularMesh trimesh = Data3dFactory.eINSTANCE.createCartesianTriangularMesh();

		TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates> originalToCopyMap = new TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates>(
				new Geometry3dUtilities.CartesianPositionCoordinatesDistanceComparator());
		
		// Copies all the vertices
		for(CartesianPositionCoordinates point : cartesianTriangularMesh.getPoints())
		{
			// Copies the point.
			CartesianPositionCoordinates pointCopy = createCartesianPositionCoordinates(point);
			
			// Adds the copy to the mesh
			trimesh.getPoints().add(pointCopy);
			
			// Keep a references to the original.
			originalToCopyMap.put(point, pointCopy);
		}
		
		// Copies the polygons.
		for (CartesianPolygon polygon : cartesianTriangularMesh.getPolygons()) 
		{
			// Creates a new polygon.
			CartesianTriangle polygonCopy = Data3dFactory.eINSTANCE.createCartesianTriangle();

			// Copies the vertex and keep a reference to the original.
			for (CartesianPositionCoordinates point : polygon.getVertices()) 
			{
				CartesianPositionCoordinates pointCopy = originalToCopyMap.get(point);

				// Adds the vertex copy to the polygon copy.
				polygonCopy.getVertices().add(pointCopy);
			}

			// Verify that copied polygons is a triangles
			// Verification is done after the copy, because the copy does could
			// not contain duplicated vertices.
			if (polygonCopy.getVertices().size() != 3) 
			{
				/* Simply skip this polygon */
				/*
				 * YES: It may occur, Specially with experimental meshes
				 * generated with FCL mesher
				 */
				continue;
			}

			// Add polygon to the mesh
			trimesh.getPolygons().add(polygonCopy);
		}

		return trimesh;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void updateCartesianCoordinatesSet(
			CartesianCoordinatesSet cartesianCoordinatesSet, double[][] xyzData) 
	{
		int numberOfPointsInSet = cartesianCoordinatesSet.getPoints().size();

		// If there is more point in the array than the set, create the required
		// additional points.
		// If not, remove the surplus points in the data set.
		if (xyzData.length > numberOfPointsInSet) {
			List<CartesianPositionCoordinates> toAdd = new ArrayList<CartesianPositionCoordinates>();
			for (int j = numberOfPointsInSet; j < xyzData.length; j++) {
				toAdd.add((Data3dFacade.INSTANCE
						.createCartesianPositionCoordinates(xyzData[j][0],
								xyzData[j][1], xyzData[j][2])));
			}
			cartesianCoordinatesSet.getPoints().addAll(toAdd);
		} else {
			List<CartesianPositionCoordinates> toRemove = new ArrayList<CartesianPositionCoordinates>();
			for (int j = xyzData.length; j < numberOfPointsInSet; j++) {
				toRemove.add(cartesianCoordinatesSet.getPoints().get(j));
			}
			cartesianCoordinatesSet.getPoints().removeAll(toRemove);
		}

		// Updates the existing points in the CartesianCoordinatesSet.
		int numberOfPointsInArray = xyzData.length;
		for (int i = 0; i < numberOfPointsInArray; i++) {
			cartesianCoordinatesSet.getPoints().get(i).setX(xyzData[i][0]);
			cartesianCoordinatesSet.getPoints().get(i).setY(xyzData[i][1]);
			cartesianCoordinatesSet.getPoints().get(i).setZ(xyzData[i][2]);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public PointNormalLocator createPointNormalLocator(NormalPointCloud input) {
		PointNormalLocator locator = Data3dFactory.eINSTANCE
				.createPointNormalLocator();
		locator.setDataSet(input);

		return locator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public DigitalElevationMap createDigitalElevationMap(
			CartesianCoordinatesSet coordinatesSet) {

		// Sort the input point by x coordinates and y coordinates.
		SortedMap<Double, SortedSet<CartesianPositionCoordinates>> map = new TreeMap<Double, SortedSet<CartesianPositionCoordinates>>();

		int yDimension = 0;
		for (CartesianPositionCoordinates p : coordinatesSet.getPoints()) {
			Double x = new Double(p.getX());
			if (!map.containsKey(x)) {
				SortedSet<CartesianPositionCoordinates> s = new TreeSet<CartesianPositionCoordinates>(
						new CartesianPositionCoordinatesYComparator());
				s.add(p);
				map.put(x, s);
			} else {
				SortedSet<CartesianPositionCoordinates> s = map.get(x);
				s.add(p);

				if (s.size() > yDimension)
					yDimension = s.size();
			}
		}

		// Determines the X Dimension.
		int xDimension = map.keySet().size();

		// Creates the DigitalElevationMap.
		DigitalElevationMap result = Data3dFactory.eINSTANCE
				.createDigitalElevationMap();
		result.setXDimension(xDimension);
		result.setYDimension(yDimension);

		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		for (Double x : map.keySet()) {
			SortedSet<CartesianPositionCoordinates> s = map.get(x);
			for (CartesianPositionCoordinates p : s) {
				CartesianPositionCoordinates copy = Data3dFacade.INSTANCE
						.createCartesianPositionCoordinates(p);
				points.add(copy);
			}
		}
		result.getPoints().addAll(points);

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianTriangularMesh concatenateTriangularMeshes(
			EList<CartesianTriangularMesh> listOfTriangularMeshes) {
		CartesianTriangularMesh contatenatedMesh = Data3dFactory.eINSTANCE
				.createCartesianTriangularMesh();

		TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates> originalToCopyMap = new TreeMap<CartesianPositionCoordinates, CartesianPositionCoordinates>(
				new Geometry3dUtilities.CartesianPositionCoordinatesDistanceComparator());

		for (CartesianTriangularMesh triMesh : listOfTriangularMeshes) {

			for (CartesianPolygon polygon : triMesh.getPolygons()) {

				// Creates a new polygon.
				CartesianTriangle polygonCopy = Data3dFactory.eINSTANCE
						.createCartesianTriangle();

				// Copies the vertex and keep a reference to the original.
				for (CartesianPositionCoordinates point : polygon.getVertices()) {
					CartesianPositionCoordinates pointCopy = originalToCopyMap
							.get(point);

					// If the point original has not been encountered yet.
					if (pointCopy == null) {
						// Create copy of vertex.
						pointCopy = createCartesianPositionCoordinates(point);

						// Adds it to the mesh.
						contatenatedMesh.getPoints().add(pointCopy);

						// Keep a references to the original.
						originalToCopyMap.put(point, pointCopy);
					}

					// Adds the vertex copy to the polygon copy.
					polygonCopy.getVertices().add(pointCopy);
				}

				// Verify that copied polygons is a triangles
				// Verification is done after the copy, because the copy does
				// could
				// not contain duplicated vertices.
				if (polygonCopy.getVertices().size() != 3) {
					/* Simply skip this polygon */
					/*
					 * YES: It may occur, Specially with experimental meshes
					 * generated with FCL mesher
					 */
					continue;
				}

				// Add polygon to the mesh
				contatenatedMesh.getPolygons().add(polygonCopy);
			}
		}
		return contatenatedMesh;
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
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__DOUBLE_DOUBLE_DOUBLE:
				return createCartesianPositionCoordinates((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__DOUBLE_DOUBLE_DOUBLE:
				return createCartesianOrientationCoordinates((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Data3dPackage.DATA3D_FACADE___CREATE_SPHERICAL_COORDINATES__DOUBLE_DOUBLE_DOUBLE:
				return createSphericalCoordinates((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Data3dPackage.DATA3D_FACADE___CREATE_POSE__DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				return createPose((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5));
			case Data3dPackage.DATA3D_FACADE___CREATE_POSE__POSE:
				return createPose((Pose)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CREATE_POSE__CARTESIANPOSITIONCOORDINATES_CARTESIANORIENTATIONCOORDINATES:
				return createPose((CartesianPositionCoordinates)arguments.get(0), (CartesianOrientationCoordinates)arguments.get(1));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_POLYGON__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES:
				return createCartesianPolygon((CartesianPositionCoordinates)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1), (CartesianPositionCoordinates)arguments.get(2));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_POSITION_COORDINATES__CARTESIANPOSITIONCOORDINATES:
				return createCartesianPositionCoordinates((CartesianPositionCoordinates)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_ORIENTATION_COORDINATES__CARTESIANORIENTATIONCOORDINATES:
				return createCartesianOrientationCoordinates((CartesianOrientationCoordinates)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANCOORDINATESMESH:
				return createCartesianCoordinatesMesh((CartesianCoordinatesMesh)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES_CARTESIANPOSITIONCOORDINATES:
				return createCartesianTriangle((CartesianPositionCoordinates)arguments.get(0), (CartesianPositionCoordinates)arguments.get(1), (CartesianPositionCoordinates)arguments.get(2));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_TRIANGLE__CARTESIANPOLYGON:
				return createCartesianTriangle((CartesianPolygon)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANCOORDINATESSET_MATRIX4D:
				return applyTransform((CartesianCoordinatesSet)arguments.get(0), (Matrix4d)arguments.get(1));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__LIST:
				return createCartesianCoordinatesMesh((List<CartesianPolygon>)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__LIST:
				return createCartesianTriangularMesh((List<CartesianTriangle>)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___APPLY_TRANSFORM__LIST_MATRIX4D:
				return applyTransform((List<CartesianPositionCoordinates>)arguments.get(0), (Matrix4d)arguments.get(1));
			case Data3dPackage.DATA3D_FACADE___APPLY_TRANSFORM__CARTESIANTRIANGULARMESH_MATRIX4D:
				return applyTransform((CartesianTriangularMesh)arguments.get(0), (Matrix4d)arguments.get(1));
			case Data3dPackage.DATA3D_FACADE___APPLY_TRANSFORM_INT__CARTESIANTRIANGULARMESH_MATRIX4D:
				return applyTransformInt((CartesianTriangularMesh)arguments.get(0), (Matrix4d)arguments.get(1));
			case Data3dPackage.DATA3D_FACADE___APPLY_TRANSFORM__NORMALPOINTCLOUD_MATRIX4D:
				return applyTransform((NormalPointCloud)arguments.get(0), (Matrix4d)arguments.get(1));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_COORDINATES_MESH__CARTESIANTRIANGULARMESH:
				return createCartesianCoordinatesMesh((CartesianTriangularMesh)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CREATE_CARTESIAN_TRIANGULAR_MESH__CARTESIANTRIANGULARMESH:
				return createCartesianTriangularMesh((CartesianTriangularMesh)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___UPDATE_CARTESIAN_COORDINATES_SET__CARTESIANCOORDINATESSET_DOUBLE:
				updateCartesianCoordinatesSet((CartesianCoordinatesSet)arguments.get(0), (double[][])arguments.get(1));
				return null;
			case Data3dPackage.DATA3D_FACADE___CREATE_POINT_NORMAL_LOCATOR__NORMALPOINTCLOUD:
				return createPointNormalLocator((NormalPointCloud)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CREATE_DIGITAL_ELEVATION_MAP__CARTESIANCOORDINATESSET:
				return createDigitalElevationMap((CartesianCoordinatesSet)arguments.get(0));
			case Data3dPackage.DATA3D_FACADE___CONCATENATE_TRIANGULAR_MESHES__ELIST:
				return concatenateTriangularMeshes((EList<CartesianTriangularMesh>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	private class CartesianPositionCoordinatesYComparator implements
			Comparator<CartesianPositionCoordinates> {
		public int compare(CartesianPositionCoordinates o1,
				CartesianPositionCoordinates o2) {
			if (o1.getY() > o2.getY()) {
				return 1;
			} else if (o1.getY() < o2.getY()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public CartesianCoordinatesSet createCartesianCoordinatesSet(
			List<Point3d> points) {

		CartesianCoordinatesSet pointSet = Data3dFactory.eINSTANCE
				.createCartesianCoordinatesSet();

		for (Point3d point : points) {
			CartesianPositionCoordinates pointCoordinates = Data3dFacade.INSTANCE
					.createCartesianPositionCoordinates(point.x, point.y,
							point.z);

			pointSet.getPoints().add(pointCoordinates);
		}

		return pointSet;
	}
} // Data3dFacadeImpl
