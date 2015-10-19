/**
 * Canadian Space Agency 2008.
 *
 * $Id: PathRecorder.java,v 1.3.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.sensors.pose.PoseSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Recorder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getPositionSensor <em>Position Sensor</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getMinimumTimeDelta <em>Minimum Time Delta</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getSamplingMode <em>Sampling Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getRecordedPath <em>Recorded Path</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathRecorder()
 * @model
 * @generated
 */
public interface PathRecorder<PathType extends Path> extends EObject
{
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathRecorder_RecordedPath()
	 * @model
	 * @generated
	 */
	PathType getRecordedPath();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getRecordedPath <em>Recorded Path</em>}' reference.
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathRecorder_PositionSensor()
	 * @model
	 * @generated
	 */
	PoseSensor getPositionSensor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getPositionSensor <em>Position Sensor</em>}' reference.
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathRecorder_MinimumDistanceDelta()
	 * @model default="0.1" unique="false"
	 * @generated
	 */
	double getMinimumDistanceDelta();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathRecorder_MinimumTimeDelta()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	double getMinimumTimeDelta();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getMinimumTimeDelta <em>Minimum Time Delta</em>}' attribute.
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
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.mobility.controllers.PathRecorderSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.PathRecorderSamplingMode
	 * @see #setSamplingMode(PathRecorderSamplingMode)
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathRecorder_SamplingMode()
	 * @model default="ON_DISTANCE_DELTA" unique="false"
	 * @generated
	 */
	PathRecorderSamplingMode getSamplingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder#getSamplingMode <em>Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Mode</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.PathRecorderSamplingMode
	 * @see #getSamplingMode()
	 * @generated
	 */
	void setSamplingMode(PathRecorderSamplingMode value);

} // PathRecorder
