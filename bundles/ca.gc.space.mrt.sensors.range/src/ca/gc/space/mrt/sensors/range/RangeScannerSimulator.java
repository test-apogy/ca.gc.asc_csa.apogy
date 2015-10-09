/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeScannerSimulator.java,v 1.4.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;

import java.util.List;

import ca.gc.space.mrt.geometry.data25d.Coordinates25D;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.topology.ContentNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanner Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getMeshNode <em>Mesh Node</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#isNoiseEnabled <em>Noise Enabled</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeCroppingMesh <em>Time Cropping Mesh</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeFindingIntersections <em>Time Finding Intersections</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays <em>Time Getting Simulated Rays</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRangeScannerSimulator()
 * @model abstract="true"
 * @generated
 */
public interface RangeScannerSimulator<InputType> extends RangeScanner<InputType> {
	/**
	 * Returns the value of the '<em><b>Mesh Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesh Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ContentNode where the simulated terrain mesh is found. Note that a topology path between this node and the RangeScannerSimulator must exist (both the RangeScannerSimulator and terrain mesh must be part of the same topology).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mesh Node</em>' reference.
	 * @see #setMeshNode(ContentNode)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRangeScannerSimulator_MeshNode()
	 * @model
	 * @generated
	 */
	ContentNode<CartesianTriangularMesh> getMeshNode();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getMeshNode <em>Mesh Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesh Node</em>' reference.
	 * @see #getMeshNode()
	 * @generated
	 */
	void setMeshNode(ContentNode<CartesianTriangularMesh> value);

	/**
	 * Returns the value of the '<em><b>Noise Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Noise Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag indicating wether or not noise is to be applied to the simulated results. Setting this flag to true will enable the calls to the applyOrientationNoise() and applyRangeNoise() methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Enabled</em>' attribute.
	 * @see #setNoiseEnabled(boolean)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRangeScannerSimulator_NoiseEnabled()
	 * @model
	 * @generated
	 */
	boolean isNoiseEnabled();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#isNoiseEnabled <em>Noise Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noise Enabled</em>' attribute.
	 * @see #isNoiseEnabled()
	 * @generated
	 */
	void setNoiseEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Time Cropping Mesh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Cropping Mesh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time (in milliseconds) required by the getCroppedMesh() method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Cropping Mesh</em>' attribute.
	 * @see #setTimeCroppingMesh(long)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRangeScannerSimulator_TimeCroppingMesh()
	 * @model
	 * @generated
	 */
	long getTimeCroppingMesh();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeCroppingMesh <em>Time Cropping Mesh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Cropping Mesh</em>' attribute.
	 * @see #getTimeCroppingMesh()
	 * @generated
	 */
	void setTimeCroppingMesh(long value);

	/**
	 * Returns the value of the '<em><b>Time Finding Intersections</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Finding Intersections</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time (in milliseconds) required to find the intersection between the simulated rays and the terrain mesh.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Finding Intersections</em>' attribute.
	 * @see #setTimeFindingIntersections(long)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRangeScannerSimulator_TimeFindingIntersections()
	 * @model
	 * @generated
	 */
	long getTimeFindingIntersections();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeFindingIntersections <em>Time Finding Intersections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Finding Intersections</em>' attribute.
	 * @see #getTimeFindingIntersections()
	 * @generated
	 */
	void setTimeFindingIntersections(long value);

	/**
	 * Returns the value of the '<em><b>Time Getting Simulated Rays</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Getting Simulated Rays</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time (in milliseconds) required by the getSimulatedRays() method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Getting Simulated Rays</em>' attribute.
	 * @see #setTimeGettingSimulatedRays(long)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRangeScannerSimulator_TimeGettingSimulatedRays()
	 * @model
	 * @generated
	 */
	long getTimeGettingSimulatedRays();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays <em>Time Getting Simulated Rays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Getting Simulated Rays</em>' attribute.
	 * @see #getTimeGettingSimulatedRays()
	 * @generated
	 */
	void setTimeGettingSimulatedRays(long value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that takes the mesh node and crops it to get only the part of the terrain that falls within the field of view of the sensor. This method is abstract and must be overloaded.
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	CartesianTriangularMesh getCroppedMesh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that returns the list of Ray Data that will be used to specify the position and direction of the simulated laser rays. This method is abstract and must be overloaded.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.common.geometry.data.List<ca.gc.space.mrt.sensors.range.RayData>" many="false"
	 * @generated
	 */
	List<RayData> getSimulatedRays();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.common.processors.Exception"
	 * @generated
	 */
	void acquireData() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that applies orientation noise on the original ray data. This method is abstact and should be overloaded.
	 * @param rayData The original clean ray data (as produced by the getSimulatedRays() method).
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	RayData applyOrientationNoise(RayData rayData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that applies range noise on the actual measured range. This method is abstract and should be overloaded.
	 * @param range The measured range (using the noisy ray data).
	 * @param cleanRayData The original clean ray data (as produced by the getSimulatedRays() method).
	 * @param noisyRayData The noisy ray data that was used to measure the range.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	double applyRangeNoise(double range, RayData cleanRayData, RayData noisyRayData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that construct the Coordinates25D from ray data and range. This Coordinates25D is then added to the simulated point cloud. This method is abstract and should be overloaded.
	 * @param rayData The clean ray data that was used to produce the noisy range value. The ray data is the ray position and orientation returned by the  getSimulatedRays() method.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Coordinates25D createCoordinates25D(RayData rayData, double range);

} // RangeScannerSimulator
