/**
 * <copyright>
 * </copyright>
 *
 * $Id: PathFollower.java,v 1.2.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.mobility.MobilePlateform;
import org.eclipse.symphony.addons.sensors.pose.PoseSensor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Follower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A PathFollower is an entity that makes a MobilePlatform follow a specified Path.
 * The default implementation of PathFollower listens for changes in the SensorStatus
 * of its PoseSensor and the MobilePlateformStatus of its MobilePlateform and pauses
 * or resumes the path following accordingly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPlatform <em>Platform</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPoseSensor <em>Pose Sensor</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#isDestinationReached <em>Destination Reached</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPathFollowerState <em>Path Follower State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathFollower()
 * @model
 * @generated
 */
public interface PathFollower<PlatformType extends MobilePlateform, PathType extends Path> extends EObject
{
	/**
	 * Returns the value of the '<em><b>Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' reference.
	 * @see #setPath(Path)
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathFollower_Path()
	 * @model
	 * @generated
	 */
	PathType getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPath <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(PathType value);

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' reference.
	 * @see #setPlatform(MobilePlateform)
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathFollower_Platform()
	 * @model
	 * @generated
	 */
	PlatformType getPlatform();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPlatform <em>Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' reference.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(PlatformType value);

	/**
	 * Returns the value of the '<em><b>Pose Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pose Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pose Sensor</em>' reference.
	 * @see #setPoseSensor(PoseSensor)
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathFollower_PoseSensor()
	 * @model
	 * @generated
	 */
	PoseSensor getPoseSensor();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPoseSensor <em>Pose Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Sensor</em>' reference.
	 * @see #getPoseSensor()
	 * @generated
	 */
	void setPoseSensor(PoseSensor value);

	/**
	 * Returns the value of the '<em><b>Destination Reached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Reached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Reached</em>' attribute.
	 * @see #setDestinationReached(boolean)
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathFollower_DestinationReached()
	 * @model unique="false"
	 * @generated
	 */
	boolean isDestinationReached();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#isDestinationReached <em>Destination Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Reached</em>' attribute.
	 * @see #isDestinationReached()
	 * @generated
	 */
	void setDestinationReached(boolean value);

	/**
	 * Returns the value of the '<em><b>Path Follower State</b></em>' attribute.
	 * The default value is <code>"IDLE"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.mobility.controllers.PathFollowerState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path Follower State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Follower State</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.PathFollowerState
	 * @see #setPathFollowerState(PathFollowerState)
	 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage#getPathFollower_PathFollowerState()
	 * @model default="IDLE" unique="false"
	 * @generated
	 */
	PathFollowerState getPathFollowerState();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower#getPathFollowerState <em>Path Follower State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Follower State</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.PathFollowerState
	 * @see #getPathFollowerState()
	 * @generated
	 */
	void setPathFollowerState(PathFollowerState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean resume();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" stateUnique="false"
	 * @generated
	 */
	boolean isTransitionValid(PathFollowerState state);

} // PathFollower
