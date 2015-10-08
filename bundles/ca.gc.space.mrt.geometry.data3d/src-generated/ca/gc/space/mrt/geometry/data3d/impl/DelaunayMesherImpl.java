/**
 * Canadian Space Agency 2008.
 *
 * $Id: DelaunayMesherImpl.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.quickhull3d.QuickHull3D;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianPlane;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangle;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.DelaunayMesher;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Delaunay Mesher</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.DelaunayMesherImpl#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.DelaunayMesherImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.DelaunayMesherImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.DelaunayMesherImpl#isBoundingTriangulation <em>Bounding Triangulation</em>}</li>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.DelaunayMesherImpl#getMeshingPlane <em>Meshing Plane</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DelaunayMesherImpl extends CartesianPositionCoordinatesMesherImpl
		implements DelaunayMesher {
	/**
	 * The default value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected static final double TOLERANCE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected double tolerance = TOLERANCE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final double ALPHA_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected double alpha = ALPHA_EDEFAULT;
	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final double OFFSET_EDEFAULT = 0.75;
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected double offset = OFFSET_EDEFAULT;
	/**
	 * The default value of the '{@link #isBoundingTriangulation() <em>Bounding Triangulation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isBoundingTriangulation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOUNDING_TRIANGULATION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isBoundingTriangulation() <em>Bounding Triangulation</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isBoundingTriangulation()
	 * @generated
	 * @ordered
	 */
	protected boolean boundingTriangulation = BOUNDING_TRIANGULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeshingPlane() <em>Meshing Plane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshingPlane()
	 * @generated
	 * @ordered
	 */
	protected static final CartesianPlane MESHING_PLANE_EDEFAULT = CartesianPlane.XY;

	/**
	 * The cached value of the '{@link #getMeshingPlane() <em>Meshing Plane</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshingPlane()
	 * @generated
	 * @ordered
	 */
	protected CartesianPlane meshingPlane = MESHING_PLANE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DelaunayMesherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.DELAUNAY_MESHER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getTolerance() {
		return tolerance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTolerance(double newTolerance) {
		double oldTolerance = tolerance;
		tolerance = newTolerance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.DELAUNAY_MESHER__TOLERANCE, oldTolerance, tolerance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(double newAlpha) {
		double oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.DELAUNAY_MESHER__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(double newOffset) {
		double oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.DELAUNAY_MESHER__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBoundingTriangulation() {
		return boundingTriangulation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundingTriangulation(boolean newBoundingTriangulation) {
		boolean oldBoundingTriangulation = boundingTriangulation;
		boundingTriangulation = newBoundingTriangulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.DELAUNAY_MESHER__BOUNDING_TRIANGULATION, oldBoundingTriangulation, boundingTriangulation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.DELAUNAY_MESHER__TOLERANCE:
				return getTolerance();
			case Data3dPackage.DELAUNAY_MESHER__ALPHA:
				return getAlpha();
			case Data3dPackage.DELAUNAY_MESHER__OFFSET:
				return getOffset();
			case Data3dPackage.DELAUNAY_MESHER__BOUNDING_TRIANGULATION:
				return isBoundingTriangulation();
			case Data3dPackage.DELAUNAY_MESHER__MESHING_PLANE:
				return getMeshingPlane();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Data3dPackage.DELAUNAY_MESHER__TOLERANCE:
				setTolerance((Double)newValue);
				return;
			case Data3dPackage.DELAUNAY_MESHER__ALPHA:
				setAlpha((Double)newValue);
				return;
			case Data3dPackage.DELAUNAY_MESHER__OFFSET:
				setOffset((Double)newValue);
				return;
			case Data3dPackage.DELAUNAY_MESHER__BOUNDING_TRIANGULATION:
				setBoundingTriangulation((Boolean)newValue);
				return;
			case Data3dPackage.DELAUNAY_MESHER__MESHING_PLANE:
				setMeshingPlane((CartesianPlane)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Data3dPackage.DELAUNAY_MESHER__TOLERANCE:
				setTolerance(TOLERANCE_EDEFAULT);
				return;
			case Data3dPackage.DELAUNAY_MESHER__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case Data3dPackage.DELAUNAY_MESHER__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case Data3dPackage.DELAUNAY_MESHER__BOUNDING_TRIANGULATION:
				setBoundingTriangulation(BOUNDING_TRIANGULATION_EDEFAULT);
				return;
			case Data3dPackage.DELAUNAY_MESHER__MESHING_PLANE:
				setMeshingPlane(MESHING_PLANE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Data3dPackage.DELAUNAY_MESHER__TOLERANCE:
				return tolerance != TOLERANCE_EDEFAULT;
			case Data3dPackage.DELAUNAY_MESHER__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case Data3dPackage.DELAUNAY_MESHER__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case Data3dPackage.DELAUNAY_MESHER__BOUNDING_TRIANGULATION:
				return boundingTriangulation != BOUNDING_TRIANGULATION_EDEFAULT;
			case Data3dPackage.DELAUNAY_MESHER__MESHING_PLANE:
				return meshingPlane != MESHING_PLANE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tolerance: ");
		result.append(tolerance);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(", offset: ");
		result.append(offset);
		result.append(", boundingTriangulation: ");
		result.append(boundingTriangulation);
		result.append(", meshingPlane: ");
		result.append(meshingPlane);
		result.append(')');
		return result.toString();
	}

	@Override
	public CartesianTriangularMesh process(CartesianCoordinatesSet input)
			throws Exception {

		Vector3d[] inputPoints = new Vector3d[input.getPoints().size()];

		int i = 0;
		// We take the points and we keep only the x,y coordinate.
		for (CartesianPositionCoordinates point : input.getPoints()) {

			inputPoints[i] = new Vector3d(point.asPoint3d());
			inputPoints[i].z = 0.0;

			double newZ = inputPoints[i].lengthSquared();
			inputPoints[i].z = newZ;

			i++;
		}

		long t0 = System.currentTimeMillis();
		QuickHull3D qhull = new QuickHull3D(inputPoints);
		// qhull.setExplicitDistanceTolerance(0.0);

		qhull.triangulate();
		int[][] faces = qhull.getFaces();
		long t1 = System.currentTimeMillis();

		System.out
				.println("DelaunayMesherImpl.process() time to compute triangulation: "
						+ (t1 - t0));

		// We only keep the faces facing down.
		CartesianTriangularMesh mesh = Data3dFactory.eINSTANCE
				.createCartesianTriangularMesh();

		for (CartesianPositionCoordinates point : input.getPoints()) {
			double x = point.getX();
			double y = point.getY();
			double z = point.getZ();

			CartesianPositionCoordinates copy = Data3dFacade.INSTANCE
					.createCartesianPositionCoordinates(x, y, z);

			mesh.getPoints().add(copy);
		}

		for (i = 0; i < faces.length; i++) {

			if (faces[i].length == 3 && isLower(faces[i], inputPoints)) 
			{
				if (faces[i].length == 3) 
				{
					CartesianPositionCoordinates p0 = mesh.getPoints().get(faces[i][0]);
					CartesianPositionCoordinates p1 = mesh.getPoints().get(faces[i][1]);
					CartesianPositionCoordinates p2 = mesh.getPoints().get(faces[i][2]);

					CartesianTriangle triangle = Data3dFacade.INSTANCE.createCartesianTriangle(p2, p1, p0);

					mesh.getPolygons().add(triangle);
				}
			}

		}

		return mesh;
	}

	private boolean isLower(int[] face, Vector3d[] data) {

		Vector3d v0 = new Vector3d(data[face[1]]);

		Vector3d v1 = new Vector3d(data[face[2]]);

		v0.sub(data[face[0]]);
		v1.sub(data[face[0]]);

		Vector3d res = new Vector3d();
		res.cross(v0, v1);

		return res.z < 0.0;
	}

	/**
	 * @generated
	 */
	public CartesianPlane getMeshingPlane() {
		return meshingPlane;
	}

	/**
	 * @generated
	 */
	public void setMeshingPlane(CartesianPlane newMeshingPlane) {
		CartesianPlane oldMeshingPlane = meshingPlane;
		meshingPlane = newMeshingPlane == null ? MESHING_PLANE_EDEFAULT : newMeshingPlane;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Data3dPackage.DELAUNAY_MESHER__MESHING_PLANE, oldMeshingPlane, meshingPlane));
	}

} // DelaunayMesherImpl
