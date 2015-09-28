/**
 * Canadian Space Agency 2008.
 *
 * $Id: PathRecorder.java,v 1.3.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package ca.gc.space.mrt.mobility.controllers;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.paths.Path;
import ca.gc.space.mrt.sensors.pose.PoseSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Recorder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getPositionSensor <em>Position Sensor</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getMinimumTimeDelta <em>Minimum Time Delta</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getSamplingMode <em>Sampling Mode</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getRecordedPath <em>Recorded Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getPathRecorder()
 * @model
 * @generated
 */
public interface PathRecorder<PathType extends Path> extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Recorded Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorded Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Path</em>' reference.
	 * @see #setRecordedPath(Path)
	 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getPathRecorder_RecordedPath()
	 * @model
	 * @generated
	 */
	PathType getRecordedPath();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getRecordedPath <em>Recorded Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Path</em>' reference.
	 * @see #getRecordedPath()
	 * @generated
	 */
	void setRecordedPath(PathType value);

	/**
	 * Returns the value of the '<em><b>Position Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Sensor</em>' reference.
	 * @see #setPositionSensor(PoseSensor)
	 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getPathRecorder_PositionSensor()
	 * @model
	 * @generated
	 */
	PoseSensor getPositionSensor();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getPositionSensor <em>Position Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Sensor</em>' reference.
	 * @see #getPositionSensor()
	 * @generated
	 */
	void setPositionSensor(PoseSensor value);

	/**
	 * Returns the value of the '<em><b>Minimum Distance Delta</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Distance Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Distance Delta</em>' attribute.
	 * @see #setMinimumDistanceDelta(double)
	 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getPathRecorder_MinimumDistanceDelta()
	 * @model default="0.1"
	 * @generated
	 */
	double getMinimumDistanceDelta();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Distance Delta</em>' attribute.
	 * @see #getMinimumDistanceDelta()
	 * @generated
	 */
	void setMinimumDistanceDelta(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Time Delta</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Time Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Time Delta</em>' attribute.
	 * @see #setMinimumTimeDelta(double)
	 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getPathRecorder_MinimumTimeDelta()
	 * @model default="1.0"
	 * @generated
	 */
	double getMinimumTimeDelta();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getMinimumTimeDelta <em>Minimum Time Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Time Delta</em>' attribute.
	 * @see #getMinimumTimeDelta()
	 * @generated
	 */
	void setMinimumTimeDelta(double value);

	/**
	 * Returns the value of the '<em><b>Sampling Mode</b></em>' attribute.
	 * The default value is <code>"ON_DISTANCE_DELTA"</code>.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.mobility.controllers.PathRecorderSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.mobility.controllers.PathRecorderSamplingMode
	 * @see #setSamplingMode(PathRecorderSamplingMode)
	 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage#getPathRecorder_SamplingMode()
	 * @model default="ON_DISTANCE_DELTA"
	 * @generated
	 */
	PathRecorderSamplingMode getSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.controllers.PathRecorder#getSamplingMode <em>Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Mode</em>' attribute.
	 * @see ca.gc.space.mrt.mobility.controllers.PathRecorderSamplingMode
	 * @see #getSamplingMode()
	 * @generated
	 */
	void setSamplingMode(PathRecorderSamplingMode value);

} // PathRecorder
