/**
 * Canadian Space Agency 2008.
 *
 * $Id: SimpleSonarPresentationImpl.java,v 1.1.4.2 2015/05/21 15:50:06 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.ui.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.sensors.range.SimpleSonar;
import org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage;
import org.eclipse.symphony.addons.sensors.range.ui.SimpleSonarPresentation;
import org.eclipse.symphony.addons.sensors.range.ui.scene_objects.SimpleSonarSceneObject;
import org.eclipse.symphony.common.topology.ui.impl.NodePresentationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Sonar Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.ui.impl.SimpleSonarPresentationImpl#isDetectedRangeVisible <em>Detected Range Visible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleSonarPresentationImpl extends NodePresentationImpl implements SimpleSonarPresentation
{
	public static final RGB DEFAULT_SIMPLE_SONAR_COLOR = new RGB(255,255,0);
	
	/**
	 * The default value of the '{@link #isDetectedRangeVisible() <em>Detected Range Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetectedRangeVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETECTED_RANGE_VISIBLE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isDetectedRangeVisible() <em>Detected Range Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetectedRangeVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean detectedRangeVisible = DETECTED_RANGE_VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSonarPresentationImpl()
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
		return Symphony__AddonsSensorsRangeUIPackage.Literals.SIMPLE_SONAR_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDetectedRangeVisible()
	{
		return detectedRangeVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetectedRangeVisible(boolean newDetectedRangeVisible)
	{
		boolean oldDetectedRangeVisible = detectedRangeVisible;
		detectedRangeVisible = newDetectedRangeVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE, oldDetectedRangeVisible, detectedRangeVisible));
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
			case Symphony__AddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE:
				return isDetectedRangeVisible();
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
			case Symphony__AddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE:
				setDetectedRangeVisible((Boolean)newValue);
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
			case Symphony__AddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE:
				setDetectedRangeVisible(DETECTED_RANGE_VISIBLE_EDEFAULT);
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
			case Symphony__AddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE:
				return detectedRangeVisible != DETECTED_RANGE_VISIBLE_EDEFAULT;
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
		result.append(" (detectedRangeVisible: ");
		result.append(detectedRangeVisible);
		result.append(')');
		return result.toString();
	}
	
	@Override
	protected void initialSceneObject()
	{		
		super.initialSceneObject();
		
		SimpleSonarSceneObject j3DObject = (SimpleSonarSceneObject) sceneObject;
		j3DObject.setDetectedRangeVisible(isDetectedRangeVisible());
		j3DObject.setColor(this.getColor());
		
	}
	
	@Override
	protected void updateSceneObject(Notification notification)
	{
		if(sceneObject != null)
		{
			SimpleSonarSceneObject j3DObject = (SimpleSonarSceneObject) sceneObject;
			if(notification.getFeatureID( SimpleSonar.class) == Symphony__AddonsSensorsRangeUIPackage.SIMPLE_SONAR_PRESENTATION__DETECTED_RANGE_VISIBLE)
			{
				j3DObject.setDetectedRangeVisible(notification.getNewBooleanValue());
			}		
		}
		super.updateSceneObject(notification);
	}

} //SimpleSonarPresentationImpl
