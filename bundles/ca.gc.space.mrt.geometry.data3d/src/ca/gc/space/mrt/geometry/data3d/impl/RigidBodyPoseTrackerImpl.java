/**
 * Canadian Space Agency 2008.
 *
 * $Id: RigidBodyPoseTrackerImpl.java,v 1.5.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import Jama.Matrix;
import Jama.SingularValueDecomposition;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dFactory;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.PositionMarker;
import ca.gc.space.mrt.geometry.data3d.RigidBodyPoseTracker;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rigid Body Pose Tracker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.impl.RigidBodyPoseTrackerImpl#getPositionMarkersAtOrigin <em>Position Markers At Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RigidBodyPoseTrackerImpl extends EObjectImpl implements RigidBodyPoseTracker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * The cached value of the '{@link #getPositionMarkersAtOrigin() <em>Position Markers At Origin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionMarkersAtOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<PositionMarker> positionMarkersAtOrigin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RigidBodyPoseTrackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.RIGID_BODY_POSE_TRACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EList<PositionMarker> getPositionMarkersAtOrigin() 
	{
		if (positionMarkersAtOrigin == null) {
			positionMarkersAtOrigin = new EObjectResolvingEList<PositionMarker>(PositionMarker.class, this, Data3dPackage.RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN);
		}
		
		EList<PositionMarker> localCopy = positionMarkersAtOrigin;
		return localCopy;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d computeTransformation(EList<PositionMarker> markerPositionsToTrack) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Matrix4d computeTransformation(List<PositionMarker> listOfMarkerPositionsToTrack) throws Exception {
		Matrix4d output = new Matrix4d();
		
		if (listOfMarkerPositionsToTrack.size()<3) {
			throw new IllegalArgumentException("At least 3 position markers to track are needed");
		}
		if (positionMarkersAtOrigin.size()<3) {
			throw new IllegalArgumentException("At least 3 position markers at origin are needed");
		}
	
		
		CartesianCoordinatesSet markerPositionsAtOrigin = Data3dFactory.eINSTANCE.createCartesianCoordinatesSet();
		CartesianCoordinatesSet markerPositionsToTrack = Data3dFactory.eINSTANCE.createCartesianCoordinatesSet();
		CartesianPositionCoordinates tmpPos1 = Data3dFactory.eINSTANCE.createCartesianPositionCoordinates();
		CartesianPositionCoordinates tmpPos2 = Data3dFactory.eINSTANCE.createCartesianPositionCoordinates();
		
		for (int i = 0; i < positionMarkersAtOrigin.size(); i++) {
			for (int j = 0; j < listOfMarkerPositionsToTrack.size(); j++) {
				if (positionMarkersAtOrigin.get(i).getIdentifier()==listOfMarkerPositionsToTrack.get(j).getIdentifier()) {
					tmpPos1 = Data3dFactory.eINSTANCE.createCartesianPositionCoordinates();
					tmpPos1.setX(positionMarkersAtOrigin.get(i).getX());
					tmpPos1.setY(positionMarkersAtOrigin.get(i).getY());
					tmpPos1.setZ(positionMarkersAtOrigin.get(i).getZ()); 
					markerPositionsAtOrigin.getPoints().add(tmpPos1);
					
					tmpPos2 = Data3dFactory.eINSTANCE.createCartesianPositionCoordinates();
					tmpPos2.setX(listOfMarkerPositionsToTrack.get(j).getX());
					tmpPos2.setY(listOfMarkerPositionsToTrack.get(j).getY());
					tmpPos2.setZ(listOfMarkerPositionsToTrack.get(j).getZ());
					markerPositionsToTrack.getPoints().add(tmpPos2);
				}
			}
		}
		
		Matrix homogenousTransformationMatrix = compute3DRigidBodyTransformationBetweenTwo3DDatasets(markerPositionsAtOrigin,markerPositionsToTrack);
		
		// Convert Matrix to Matrix4d for output
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 3; j++) {
				output.setElement(i, j, homogenousTransformationMatrix.get(i,j));
			}
		}
		
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void addPositionMarkers(List<PositionMarker> marker) throws Exception {

		if (positionMarkersAtOrigin == null) {
			positionMarkersAtOrigin = new EObjectResolvingEList<PositionMarker>(PositionMarker.class, this, Data3dPackage.RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN);
		}
		for (int i = 0; i < marker.size(); i++) {
			positionMarkersAtOrigin.add(marker.get(i));
		}
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void removePositionMarkers(List<PositionMarker> markers) {
		List<PositionMarker> localCopyMarker = markers;
		for (int i = 0; i < localCopyMarker.size(); i++) {
			for (int j = 0; j < positionMarkersAtOrigin.size(); j++) {
				if (localCopyMarker.get(i).getIdentifier()==positionMarkersAtOrigin.get(j).getIdentifier()) {
					positionMarkersAtOrigin.remove(j);
				}
			}
		}
		throw new UnsupportedOperationException();
	}


	private static Matrix compute3DRigidBodyTransformationBetweenTwo3DDatasets(
			CartesianCoordinatesSet p_0,
			CartesianCoordinatesSet p) {
		Matrix homogenousTransformationMatrix = new Matrix(4,4);

		// Compute the centroid of datasets
		Matrix p_centroid = computeCentroidDataSet(p);
		Matrix p_0_centroid = computeCentroidDataSet(p_0);
		
		// Compute Rotation
		Matrix rotationMatrix = computeRotationMatrixUsingSVD(p_0,p_0_centroid,p,p_centroid);
		
		// Compute Translation
		Matrix translationMatrix = computeTranslationMatrix(rotationMatrix,p_0_centroid,p_centroid);
		
		// Pack rotation and translation components in an homogenous matrix
		homogenousTransformationMatrix.setMatrix(0, 2, 0, 2,rotationMatrix);
		homogenousTransformationMatrix.setMatrix(0, 2, 3, 3,translationMatrix);
		homogenousTransformationMatrix.set(3,3,1.0);
		
		return homogenousTransformationMatrix;
	}

	private static Matrix computeTranslationMatrix(Matrix rotationMatrix,
			Matrix p_0_centroid, Matrix p_centroid) {
		Matrix translationMatrix = new Matrix(3,1);
		
		translationMatrix = p_centroid.minus(rotationMatrix.times(p_0_centroid));
		
		return translationMatrix;
	}
	
	private static Matrix computeRotationMatrixUsingSVD(
			CartesianCoordinatesSet p_0,  Matrix P_0_centroid,
			CartesianCoordinatesSet p, Matrix P_centroid) {
	
		// Convert input from CartesianCoordinatePosition to Matrix 3x1 and remove centroid
		java.util.List<Matrix> mP_0 = new ArrayList<Matrix>();
		java.util.List<Matrix> mP = new ArrayList<Matrix>();
		Matrix tmpMat3x1 = new Matrix(3,1);
		for (int i = 0; i < p_0.getPoints().size(); i++) {
			tmpMat3x1=convertCartesianCoordinatePositionToMatrix3x1(p_0.getPoints().get(i)); // convert to Matrix
			tmpMat3x1 = tmpMat3x1.minus(P_0_centroid);							 // offset the centroid
			mP_0.add(tmpMat3x1);
			
			tmpMat3x1=convertCartesianCoordinatePositionToMatrix3x1(p.getPoints().get(i));  // convert to Matrix
			tmpMat3x1 = tmpMat3x1.minus(P_centroid);                            // offset the centroid
			mP.add(tmpMat3x1);
		}
				
		// Correlation Matrix H
		Matrix H = new Matrix(3,3);
		Matrix tmp3x3 = new Matrix(3,3);
		for (int i = 0; i < mP.size(); i++) {
			tmp3x3 = mP_0.get(i).times(mP.get(i).transpose());
			H=H.plus(tmp3x3);
		}
		
		// SVD computation
		SingularValueDecomposition svg = H.svd();
		
		Matrix rotationMatrix = new Matrix(3,3);
		Matrix U = new Matrix(3,3);
		Matrix V = new Matrix(3,3);
		
		U = svg.getU();
		V = svg.getV();
		rotationMatrix = V.times(U.transpose()); 
		
		double tol = 1e-4;
		// if det(rotationMatrix)== -1, it means the dataset is planar or the amount of noise is large 
		if (Math.abs(rotationMatrix.det()+1)<tol) {
			Matrix V_prime = new Matrix(3,3);
			V_prime = V;
			V_prime.set(0,2,-1*V.get(0,2));
			V_prime.set(1,2,-1*V.get(1,2));
			V_prime.set(2,2,-1*V.get(2,2));
			rotationMatrix = V_prime.times(U.transpose());
		}
		
		return rotationMatrix;
	}

	private static Matrix computeCentroidDataSet(
			CartesianCoordinatesSet p) {
		
		Matrix centroid = new Matrix(3,1);
		double sumX = 0;
		double sumY = 0;
		double sumZ = 0;
		
		for (int i = 0; i < p.getPoints().size(); i++) {
			sumX+=p.getPoints().get(i).getX();
			sumY+=p.getPoints().get(i).getY();
			sumZ+=p.getPoints().get(i).getZ();
		}
		
		centroid.set(0,0,sumX/p.getPoints().size());
		centroid.set(1,0,sumY/p.getPoints().size());
		centroid.set(2,0,sumZ/p.getPoints().size());
		return centroid;
	}

	private static Matrix convertCartesianCoordinatePositionToMatrix3x1(CartesianPositionCoordinates P) {
		Matrix mP = new Matrix(3,1);
		mP.set(0, 0, P.getX());
		mP.set(1, 0, P.getY());
		mP.set(2, 0, P.getZ());
		
		return mP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Data3dPackage.RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN:
				return getPositionMarkersAtOrigin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Data3dPackage.RIGID_BODY_POSE_TRACKER__POSITION_MARKERS_AT_ORIGIN:
				return positionMarkersAtOrigin != null && !positionMarkersAtOrigin.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Data3dPackage.RIGID_BODY_POSE_TRACKER___COMPUTE_TRANSFORMATION__ELIST:
			try {
				return computeTransformation((EList<PositionMarker>)arguments.get(0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			case Data3dPackage.RIGID_BODY_POSE_TRACKER___ADD_POSITION_MARKERS__LIST:
			try {
				addPositionMarkers((List<PositionMarker>)arguments.get(0));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				return null;
			case Data3dPackage.RIGID_BODY_POSE_TRACKER___REMOVE_POSITION_MARKERS__LIST:
				removePositionMarkers((List<PositionMarker>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	

} //RigidBodyPoseTrackerImpl
