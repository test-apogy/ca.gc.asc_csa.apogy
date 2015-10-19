/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;

import java.util.List;

import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;

import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;

import org.eclipse.symphony.common.topology.ContentNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scanner Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getMeshNode <em>Mesh Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#isNoiseEnabled <em>Noise Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeCroppingMesh <em>Time Cropping Mesh</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeFindingIntersections <em>Time Finding Intersections</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays <em>Time Getting Simulated Rays</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRangeScannerSimulator()
 * @model abstract="true"
 * @generated
 */
public interface RangeScannerSimulator<InputType> extends RangeScanner<InputType> {
	/**
	 * Returns the value of the '<em><b>Mesh Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ContentNode where the simulated terrain mesh is found.
	 * Note that a topology path between this node and the
	 * RangeScannerSimulator must exist (both the RangeScannerSimulator
	 * and terrain mesh must be part of the same topology).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mesh Node</em>' reference.
	 * @see #setMeshNode(ContentNode)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRangeScannerSimulator_MeshNode()
	 * @model
	 * @generated
	 */
	ContentNode<CartesianTriangularMesh> getMeshNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getMeshNode <em>Mesh Node</em>}' reference.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag indicating whether or not noise is to be applied to the
	 * simulated results. Setting this flag to true will enable the
	 * calls to the applyOrientationNoise() and applyRangeNoise() methods.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noise Enabled</em>' attribute.
	 * @see #setNoiseEnabled(boolean)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRangeScannerSimulator_NoiseEnabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isNoiseEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#isNoiseEnabled <em>Noise Enabled</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time (in milliseconds) required by the getCroppedMesh() method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Cropping Mesh</em>' attribute.
	 * @see #setTimeCroppingMesh(long)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRangeScannerSimulator_TimeCroppingMesh()
	 * @model unique="false"
	 * @generated
	 */
	long getTimeCroppingMesh();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeCroppingMesh <em>Time Cropping Mesh</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time (in milliseconds) required to find the intersection between
	 * the simulated rays and the terrain mesh.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Finding Intersections</em>' attribute.
	 * @see #setTimeFindingIntersections(long)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRangeScannerSimulator_TimeFindingIntersections()
	 * @model unique="false"
	 * @generated
	 */
	long getTimeFindingIntersections();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeFindingIntersections <em>Time Finding Intersections</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time (in milliseconds) required by the getSimulatedRays() method.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Getting Simulated Rays</em>' attribute.
	 * @see #setTimeGettingSimulatedRays(long)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRangeScannerSimulator_TimeGettingSimulatedRays()
	 * @model unique="false"
	 * @generated
	 */
	long getTimeGettingSimulatedRays();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RangeScannerSimulator#getTimeGettingSimulatedRays <em>Time Getting Simulated Rays</em>}' attribute.
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
	 * Method that takes the mesh node and crops it to get only the part of
	 * the terrain that falls within the field of view of the sensor. This
	 * method is abstract and must be overridden.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CartesianTriangularMesh getCroppedMesh();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that returns the list of Ray Data that will be used to specify
	 * the position and direction of the simulated laser rays. This method is
	 * abstract and must be overridden.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.addons.sensors.range.List<org.eclipse.symphony.addons.sensors.range.RayData>" unique="false" many="false"
	 * @generated
	 */
	List<RayData> getSimulatedRays();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.addons.sensors.range.Exception"
	 * @generated
	 */
	void acquireData() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that applies orientation noise on the original ray data. This
	 * method is abstract and should be overridden.
	 * <!-- end-model-doc -->
	 * @model unique="false" rayDataUnique="false"
	 * @generated
	 */
	RayData applyOrientationNoise(RayData rayData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that applies range noise on the actual measured range. This
	 * method is abstract and should be overridden.
	 * <!-- end-model-doc -->
	 * @model unique="false" rangeUnique="false" cleanRayDataUnique="false" noisyRayDataUnique="false"
	 * @generated
	 */
	double applyRangeNoise(double range, RayData cleanRayData, RayData noisyRayData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that construct the Coordinates25D from ray data and range.
	 * This Coordinates25D is then added to the simulated point cloud.
	 * This method is abstract and should be overridden.
	 * <!-- end-model-doc -->
	 * @model unique="false" rayDataUnique="false" rangeUnique="false"
	 * @generated
	 */
	Coordinates25D createCoordinates25D(RayData rayData, double range);

} // RangeScannerSimulator
