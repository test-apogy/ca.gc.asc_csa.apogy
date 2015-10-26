/**
 * Canadian Space Agency 2008.
 *
 * $Id: PoseSensorPresentationImpl.java,v 1.1.4.2 2015/05/21 15:51:00 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.pose.ui.PoseSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.Symphony__AddonsSensorsPoseUIPackage;
import org.eclipse.symphony.addons.sensors.pose.ui.scene_objects.PoseSensorSceneObject;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pose Sensor Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.PoseSensorPresentationImpl#isFrameVisible <em>Frame Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoseSensorPresentationImpl extends NodePresentationImpl implements PoseSensorPresentation
{
	/**
	 * The default value of the '{@link #isFrameVisible() <em>Frame Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrameVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FRAME_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFrameVisible() <em>Frame Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFrameVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean frameVisible = FRAME_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseSensorPresentationImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__AddonsSensorsPoseUIPackage.Literals.POSE_SENSOR_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFrameVisible()
	{
		return frameVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameVisible(boolean newFrameVisible)
	{
		boolean oldFrameVisible = frameVisible;
		frameVisible = newFrameVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsPoseUIPackage.POSE_SENSOR_PRESENTATION__FRAME_VISIBLE, oldFrameVisible, frameVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case Symphony__AddonsSensorsPoseUIPackage.POSE_SENSOR_PRESENTATION__FRAME_VISIBLE:
				return isFrameVisible();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case Symphony__AddonsSensorsPoseUIPackage.POSE_SENSOR_PRESENTATION__FRAME_VISIBLE:
				setFrameVisible((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsSensorsPoseUIPackage.POSE_SENSOR_PRESENTATION__FRAME_VISIBLE:
				setFrameVisible(FRAME_VISIBLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsSensorsPoseUIPackage.POSE_SENSOR_PRESENTATION__FRAME_VISIBLE:
				return frameVisible != FRAME_VISIBLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (frameVisible: ");
		result.append(frameVisible);
		result.append(')');
		return result.toString();
	}
	
	@Override
	protected void initialSceneObject()
	{
		try
		{
			PoseSensorSceneObject j3dObject = (PoseSensorSceneObject) getSceneObject();						
			j3dObject.setFrameVisible(this.isFrameVisible());				
			super.initialSceneObject();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	
	@Override
	protected void updateSceneObject(Notification notification)
	{
		PoseSensorSceneObject j3dObject = (PoseSensorSceneObject) getSceneObject();		
		if(notification.getFeatureID(OrientationSensorPresentationImpl.class) == Symphony__AddonsSensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE)
		{			
			j3dObject.setFrameVisible(notification.getNewBooleanValue());
		}
		super.updateSceneObject(notification);
	}
} //PoseSensorPresentationImpl
