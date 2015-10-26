/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.controllers;

import org.eclipse.symphony.addons.geometry.paths.WayPointPath;

import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Pose;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Astolfi Guidance Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getCurrentWayPoint <em>Current Way Point</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getPreviousWayPoint <em>Previous Way Point</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getCurrentPoseInGuidanceReferenceFrame <em>Current Pose In Guidance Reference Frame</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getRho <em>Rho</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getPhi <em>Phi</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getYaw <em>Yaw</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getNu <em>Nu</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getOmega <em>Omega</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKrho <em>Krho</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKphi <em>Kphi</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKalpha <em>Kalpha</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getDestinationDistanceThreshold <em>Destination Distance Threshold</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getWayPointDistanceThreshold <em>Way Point Distance Threshold</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKHill <em>KHill</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getHillThreshold <em>Hill Threshold</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getPhiThresholdForReducedVelocity <em>Phi Threshold For Reduced Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getAlphaThresholdForReducedVelocity <em>Alpha Threshold For Reduced Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#isSmoothPathEnabled <em>Smooth Path Enabled</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController()
 * @model
 * @generated
 */
public interface AstolfiGuidanceController extends SkidSteeredPlatformPathFollower<SkidSteeredMobilePlatform, WayPointPath> {
	/**
	 * Returns the value of the '<em><b>Current Way Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Way Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Way Point</em>' reference.
	 * @see #setCurrentWayPoint(CartesianPositionCoordinates)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_CurrentWayPoint()
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates getCurrentWayPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getCurrentWayPoint <em>Current Way Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Way Point</em>' reference.
	 * @see #getCurrentWayPoint()
	 * @generated
	 */
	void setCurrentWayPoint(CartesianPositionCoordinates value);

	/**
	 * Returns the value of the '<em><b>Previous Way Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Way Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Way Point</em>' reference.
	 * @see #setPreviousWayPoint(CartesianPositionCoordinates)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_PreviousWayPoint()
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates getPreviousWayPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getPreviousWayPoint <em>Previous Way Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Way Point</em>' reference.
	 * @see #getPreviousWayPoint()
	 * @generated
	 */
	void setPreviousWayPoint(CartesianPositionCoordinates value);

	/**
	 * Returns the value of the '<em><b>Current Pose In Guidance Reference Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Pose In Guidance Reference Frame</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Pose In Guidance Reference Frame</em>' reference.
	 * @see #setCurrentPoseInGuidanceReferenceFrame(Pose)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_CurrentPoseInGuidanceReferenceFrame()
	 * @model
	 * @generated
	 */
	Pose getCurrentPoseInGuidanceReferenceFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getCurrentPoseInGuidanceReferenceFrame <em>Current Pose In Guidance Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Pose In Guidance Reference Frame</em>' reference.
	 * @see #getCurrentPoseInGuidanceReferenceFrame()
	 * @generated
	 */
	void setCurrentPoseInGuidanceReferenceFrame(Pose value);

	/**
	 * Returns the value of the '<em><b>Rho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rho</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rho</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Rho()
	 * @model unique="false" transient="true" changeable="false"
	 * @generated
	 */
	double getRho();

	/**
	 * Returns the value of the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phi</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Phi()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getPhi();

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Alpha()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getAlpha();

	/**
	 * Returns the value of the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yaw</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaw</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Yaw()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getYaw();

	/**
	 * Returns the value of the '<em><b>Nu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nu</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Nu()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getNu();

	/**
	 * Returns the value of the '<em><b>Omega</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Omega</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Omega</em>' attribute.
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Omega()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getOmega();

	/**
	 * Returns the value of the '<em><b>Krho</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Krho</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Krho</em>' attribute.
	 * @see #setKrho(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Krho()
	 * @model unique="false"
	 * @generated
	 */
	double getKrho();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKrho <em>Krho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Krho</em>' attribute.
	 * @see #getKrho()
	 * @generated
	 */
	void setKrho(double value);

	/**
	 * Returns the value of the '<em><b>Kphi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kphi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kphi</em>' attribute.
	 * @see #setKphi(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Kphi()
	 * @model unique="false"
	 * @generated
	 */
	double getKphi();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKphi <em>Kphi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kphi</em>' attribute.
	 * @see #getKphi()
	 * @generated
	 */
	void setKphi(double value);

	/**
	 * Returns the value of the '<em><b>Kalpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kalpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kalpha</em>' attribute.
	 * @see #setKalpha(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_Kalpha()
	 * @model unique="false"
	 * @generated
	 */
	double getKalpha();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKalpha <em>Kalpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kalpha</em>' attribute.
	 * @see #getKalpha()
	 * @generated
	 */
	void setKalpha(double value);

	/**
	 * Returns the value of the '<em><b>Destination Distance Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Distance Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Distance Threshold</em>' attribute.
	 * @see #setDestinationDistanceThreshold(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_DestinationDistanceThreshold()
	 * @model unique="false"
	 * @generated
	 */
	double getDestinationDistanceThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getDestinationDistanceThreshold <em>Destination Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Distance Threshold</em>' attribute.
	 * @see #getDestinationDistanceThreshold()
	 * @generated
	 */
	void setDestinationDistanceThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Way Point Distance Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Way Point Distance Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Way Point Distance Threshold</em>' attribute.
	 * @see #setWayPointDistanceThreshold(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_WayPointDistanceThreshold()
	 * @model unique="false"
	 * @generated
	 */
	double getWayPointDistanceThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getWayPointDistanceThreshold <em>Way Point Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Way Point Distance Threshold</em>' attribute.
	 * @see #getWayPointDistanceThreshold()
	 * @generated
	 */
	void setWayPointDistanceThreshold(double value);

	/**
	 * Returns the value of the '<em><b>KHill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KHill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KHill</em>' attribute.
	 * @see #setKHill(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_KHill()
	 * @model unique="false"
	 * @generated
	 */
	double getKHill();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getKHill <em>KHill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KHill</em>' attribute.
	 * @see #getKHill()
	 * @generated
	 */
	void setKHill(double value);

	/**
	 * Returns the value of the '<em><b>Hill Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hill Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hill Threshold</em>' attribute.
	 * @see #setHillThreshold(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_HillThreshold()
	 * @model unique="false"
	 * @generated
	 */
	double getHillThreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getHillThreshold <em>Hill Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hill Threshold</em>' attribute.
	 * @see #getHillThreshold()
	 * @generated
	 */
	void setHillThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Phi Threshold For Reduced Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phi Threshold For Reduced Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phi Threshold For Reduced Velocity</em>' attribute.
	 * @see #setPhiThresholdForReducedVelocity(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_PhiThresholdForReducedVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getPhiThresholdForReducedVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getPhiThresholdForReducedVelocity <em>Phi Threshold For Reduced Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi Threshold For Reduced Velocity</em>' attribute.
	 * @see #getPhiThresholdForReducedVelocity()
	 * @generated
	 */
	void setPhiThresholdForReducedVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Alpha Threshold For Reduced Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha Threshold For Reduced Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha Threshold For Reduced Velocity</em>' attribute.
	 * @see #setAlphaThresholdForReducedVelocity(double)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_AlphaThresholdForReducedVelocity()
	 * @model unique="false"
	 * @generated
	 */
	double getAlphaThresholdForReducedVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#getAlphaThresholdForReducedVelocity <em>Alpha Threshold For Reduced Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha Threshold For Reduced Velocity</em>' attribute.
	 * @see #getAlphaThresholdForReducedVelocity()
	 * @generated
	 */
	void setAlphaThresholdForReducedVelocity(double value);

	/**
	 * Returns the value of the '<em><b>Smooth Path Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smooth Path Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smooth Path Enabled</em>' attribute.
	 * @see #setSmoothPathEnabled(boolean)
	 * @see org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage#getAstolfiGuidanceController_SmoothPathEnabled()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isSmoothPathEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController#isSmoothPathEnabled <em>Smooth Path Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Smooth Path Enabled</em>' attribute.
	 * @see #isSmoothPathEnabled()
	 * @generated
	 */
	void setSmoothPathEnabled(boolean value);

} // AstolfiGuidanceController
