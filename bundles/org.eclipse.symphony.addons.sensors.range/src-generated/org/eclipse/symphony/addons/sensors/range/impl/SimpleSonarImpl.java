/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleSonarImpl.java,v 1.5.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVFactory;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.SimpleSonar;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Sonar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.SimpleSonarImpl#isEchoDetected <em>Echo Detected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleSonarImpl extends SimpleRangeSensorImpl implements SimpleSonar
{
	private ConicalFieldOfView fov = null;
	
	/**
	 * The default value of the '{@link #isEchoDetected() <em>Echo Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEchoDetected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ECHO_DETECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEchoDetected() <em>Echo Detected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEchoDetected()
	 * @generated
	 * @ordered
	 */
	protected boolean echoDetected = ECHO_DETECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSonarImpl()
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
		return Symphony__AddonsSensorsRangePackage.Literals.SIMPLE_SONAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public synchronized ConicalFieldOfView getFieldOfView()
	{
		if(fov == null)
		{		
		  	// Search the list of children of the SimpleSonar to find a ConicalFieldOfView.
			EList<Node> children = getChildren();
	    	for(Node node : children)
	    	{
	    		if(node instanceof ConicalFieldOfView)
	    		{
	    			fov = (ConicalFieldOfView) node;	
	    		}
	    	}
	    	
	    	// If no ConicalFieldOfView is found, creates one.
	    	if(fov == null)
	    	{
	    		fov = Symphony__AddonsSensorsFOVFactory.eINSTANCE.createConicalFieldOfView();	
	    		getChildren().add(fov);
	    	}
		}
    	return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEchoDetected()
	{
		return echoDetected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchoDetected(boolean newEchoDetected)
	{
		boolean oldEchoDetected = echoDetected;
		echoDetected = newEchoDetected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.SIMPLE_SONAR__ECHO_DETECTED, oldEchoDetected, echoDetected));
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_SONAR__ECHO_DETECTED:
				return isEchoDetected();
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_SONAR__ECHO_DETECTED:
				setEchoDetected((Boolean)newValue);
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_SONAR__ECHO_DETECTED:
				setEchoDetected(ECHO_DETECTED_EDEFAULT);
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
			case Symphony__AddonsSensorsRangePackage.SIMPLE_SONAR__ECHO_DETECTED:
				return echoDetected != ECHO_DETECTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsSensorsRangePackage.SIMPLE_SONAR___GET_FIELD_OF_VIEW:
				return getFieldOfView();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (echoDetected: ");
		result.append(echoDetected);
		result.append(')');
		return result.toString();
	}

} //SimpleSonarImpl
