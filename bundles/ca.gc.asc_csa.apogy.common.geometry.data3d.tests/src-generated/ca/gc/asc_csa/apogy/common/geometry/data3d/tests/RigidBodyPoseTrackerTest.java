/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;

import org.eclipse.symphony.common.geometry.data3d.PositionMarker;
import org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rigid Body Pose Tracker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin() <em>Position Markers At Origin</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#addPositionMarkers(java.util.List) <em>Add Position Markers</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#removePositionMarkers(java.util.List) <em>Remove Position Markers</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(org.eclipse.emf.common.util.EList) <em>Compute Transformation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(java.util.List) <em>Compute Transformation</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RigidBodyPoseTrackerTest extends TestCase {

	/**
	 * The fixture for this Rigid Body Pose Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RigidBodyPoseTracker fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RigidBodyPoseTrackerTest.class);
	}

	/**
	 * Constructs a new Rigid Body Pose Tracker test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RigidBodyPoseTrackerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rigid Body Pose Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RigidBodyPoseTracker fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rigid Body Pose Tracker test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RigidBodyPoseTracker getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createRigidBodyPoseTracker());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin() <em>Position Markers At Origin</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin()
	 * @generated_NOT
	 */
	public void testGetPositionMarkersAtOrigin() 
	{
		// Nothing to test.
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#addPositionMarkers(java.util.List) <em>Add Position Markers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#addPositionMarkers(java.util.List)
	 * @generated_NOT
	 */
	public void testAddPositionMarkers__List() 
	{
		// Nothing to test.
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#removePositionMarkers(java.util.List) <em>Remove Position Markers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#removePositionMarkers(java.util.List)
	 * @generated_NOT
	 */
	public void testRemovePositionMarkers__List() 
	{
		// Nothing to test.
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(org.eclipse.emf.common.util.EList) <em>Compute Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testComputeTransformation__EList() 
	{
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(java.util.List) <em>Compute Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#computeTransformation(java.util.List)
	 * @generated
	 */
	public void testComputeTransformation__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	public void testComputeRigidBodyTransformation()
	{
		
		// Marker positions w.r.t. fixed frame while body is at origin
		List<PositionMarker> listPositionMarkerAtOrigin = new ArrayList<PositionMarker>();
		PositionMarker markerA_0 = Symphony__CommonGeometryData3DFactory.eINSTANCE.createPositionMarker();
		markerA_0.setIdentifier("Marker A");
		markerA_0.setX(-1.5);
		markerA_0.setY(1.0);
		markerA_0.setZ(0.5);
		listPositionMarkerAtOrigin.add(markerA_0);
		PositionMarker markerB_0 = Symphony__CommonGeometryData3DFactory.eINSTANCE.createPositionMarker();
		markerB_0.setIdentifier("Marker B");
		markerB_0.setX(-1.5);
		markerB_0.setY(-1.0);
		markerB_0.setZ(0.5);
		listPositionMarkerAtOrigin.add(markerB_0);
		PositionMarker markerC_0 = Symphony__CommonGeometryData3DFactory.eINSTANCE.createPositionMarker();
		markerC_0.setIdentifier("Marker C");
		markerC_0.setX(1.5);
		markerC_0.setY(-1.0);
		markerC_0.setZ(0.5);
		listPositionMarkerAtOrigin.add(markerC_0);
		
		// Marker positions of moving rover w.r.t. fixed frame		
		List<PositionMarker> listPositionMarker = new ArrayList<PositionMarker>();
		PositionMarker markerA = Symphony__CommonGeometryData3DFactory.eINSTANCE.createPositionMarker();
		markerA.setIdentifier("Marker A");
		markerA.setX(8.6216);
		markerA.setY(6.0855);
		markerA.setZ(1.6463);
		listPositionMarker.add(markerA);
		PositionMarker markerB = Symphony__CommonGeometryData3DFactory.eINSTANCE.createPositionMarker();
		markerB.setIdentifier("Marker B");
		markerB.setX(9.0909);
		markerB.setY(4.3387);
		markerB.setZ(2.4920);
		listPositionMarker.add(markerB);
		PositionMarker markerC = Symphony__CommonGeometryData3DFactory.eINSTANCE.createPositionMarker();
		markerC.setIdentifier("Marker C");
		markerC.setX(11.7539);
		markerC.setY(4.3994);
		markerC.setZ(1.1379);
		listPositionMarker.add(markerC);

		// Set position marker at origin
		try 
		{
			getFixture().addPositionMarkers(listPositionMarkerAtOrigin);
		} 
		catch (Exception e) 
		{		
			e.printStackTrace();
		}
		
		Matrix4d roverPose = new Matrix4d();
		
		try 
		{
			roverPose = getFixture().computeTransformation(listPositionMarker);
		} 
		catch (Exception e) 
		{		
			e.printStackTrace();
		}
		
		double expectedPosX = 10;
		double expectedPosY = 5;
		double expectedPosZ = 1;
		
		assertEquals(expectedPosX,roverPose.m03, 1e-2);
		assertEquals(expectedPosY,roverPose.m13, 1e-2);
		assertEquals(expectedPosZ,roverPose.m23, 1e-2);
		
		double tol = 1e-5;
		assertEquals(roverPose.m30,0,tol);
		assertEquals(roverPose.m31,0,tol);
		assertEquals(roverPose.m32,0,tol);
		assertEquals(roverPose.m33,1,tol);
		
		System.out.println("Resulting rover pose w.r.t. the fixed global frame : ");
		System.out.println(roverPose.toString());
	}
} //RigidBodyPoseTrackerTest
