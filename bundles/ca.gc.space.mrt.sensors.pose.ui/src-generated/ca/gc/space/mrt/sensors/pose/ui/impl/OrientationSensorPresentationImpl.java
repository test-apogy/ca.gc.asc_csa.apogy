/**
 * Canadian Space Agency 2008.
 *
 * $Id: OrientationSensorPresentationImpl.java,v 1.1.4.2 2015/05/21 15:51:00 pallard Exp $
 */
package ca.gc.space.mrt.sensors.pose.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.space.mrt.sensors.pose.ui.OrientationSensorPresentation;
import ca.gc.space.mrt.sensors.pose.ui.SensorsPoseUIPackage;
import ca.gc.space.mrt.sensors.pose.ui.scene_objects.OrientationSensorSceneObject;
import ca.gc.space.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orientation Sensor Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.ui.impl.OrientationSensorPresentationImpl#isFrameVisible <em>Frame Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrientationSensorPresentationImpl extends NodePresentationImpl implements OrientationSensorPresentation
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
	protected OrientationSensorPresentationImpl()
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
		return SensorsPoseUIPackage.Literals.ORIENTATION_SENSOR_PRESENTATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE, oldFrameVisible, frameVisible));
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
			case SensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
			case SensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
			case SensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
			case SensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE:
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
		OrientationSensorSceneObject j3dObject = (OrientationSensorSceneObject) getSceneObject();					
		j3dObject.setFrameVisible(this.isFrameVisible());				
		super.initialSceneObject();
	}
	

	@Override
	protected void updateSceneObject(Notification notification)
	{
		OrientationSensorSceneObject j3dObject = (OrientationSensorSceneObject) getSceneObject();					
		
		if(notification.getFeatureID(OrientationSensorPresentationImpl.class) == SensorsPoseUIPackage.ORIENTATION_SENSOR_PRESENTATION__FRAME_VISIBLE)
		{			
			j3dObject.setFrameVisible(notification.getNewBooleanValue());
		}
		super.updateSceneObject(notification);
	}

} //OrientationSensorPresentationImpl
