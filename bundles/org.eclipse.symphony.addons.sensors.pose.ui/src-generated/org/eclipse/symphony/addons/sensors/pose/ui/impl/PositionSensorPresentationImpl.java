/**
 * Canadian Space Agency 2008.
 *
 * $Id: PositionSensorPresentationImpl.java,v 1.1.4.2 2015/05/21 15:51:00 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.pose.ui.PositionSensorPresentation;
import org.eclipse.symphony.addons.sensors.pose.ui.SensorsPoseUIPackage;
import org.eclipse.symphony.addons.sensors.pose.ui.scene_objects.PositionSensorSceneObject;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Sensor Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.ui.impl.PositionSensorPresentationImpl#isFrameVisible <em>Frame Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionSensorPresentationImpl extends NodePresentationImpl implements PositionSensorPresentation
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
	protected PositionSensorPresentationImpl()
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
		return SensorsPoseUIPackage.Literals.POSITION_SENSOR_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE, oldFrameVisible, frameVisible));
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
			case SensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
			case SensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
			case SensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
			case SensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
		PositionSensorSceneObject j3dObject = (PositionSensorSceneObject) getSceneObject();		
		j3dObject.setFrameVisible(this.isFrameVisible());				
		super.initialSceneObject();
	}
	
	@Override
	protected void updateSceneObject(Notification notification)
	{
		PositionSensorSceneObject j3dObject = (PositionSensorSceneObject) getSceneObject();
		
		if(notification.getFeatureID(PositionSensorPresentationImpl.class) == SensorsPoseUIPackage.POSITION_SENSOR_PRESENTATION__FRAME_VISIBLE)
		{			
			j3dObject.setFrameVisible(notification.getNewBooleanValue());
		}
		super.updateSceneObject(notification);
	}

} //PositionSensorPresentationImpl
