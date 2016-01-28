/**
 * <copyright>
 * </copyright>
 *
 * $Id: LineRangeScannerImpl.java,v 1.5.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFactory;
import ca.gc.asc_csa.apogy.addons.sensors.range.LineRangeScanner;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.impl.LineRangeScannerImpl#getAngularResolution <em>Angular Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineRangeScannerImpl extends RangeSensorImpl implements LineRangeScanner
{
	protected CircularSectorFieldOfView fov = null;
	
	/**
	 * The default value of the '{@link #getAngularResolution() <em>Angular Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularResolution()
	 * @generated
	 * @ordered
	 */
	protected static final int ANGULAR_RESOLUTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAngularResolution() <em>Angular Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularResolution()
	 * @generated
	 * @ordered
	 */
	protected int angularResolution = ANGULAR_RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineRangeScannerImpl()
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
		return ApogyAddonsSensorsRangePackage.Literals.LINE_RANGE_SCANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public synchronized CircularSectorFieldOfView getFieldOfView()
	{
		if(fov == null)
		{
			// Search the list of children of the LineRangeScanner to find a CircularSectorFieldOfView.
			EList<Node> children = getChildren();
	    	for(Node node : children)
	    	{
	    		if(node instanceof CircularSectorFieldOfView)
	    		{
	    			fov = (CircularSectorFieldOfView) node;	
	    		}
	    	}
	    	
	    	// If no CircularSectorFieldOfView is found, creates one.
	    	if(fov == null)
	    	{
	    		fov = ApogyAddonsSensorsFOVFactory.eINSTANCE.createCircularSectorFieldOfView();	
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
	public int getAngularResolution()
	{
		return angularResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularResolution(int newAngularResolution)
	{
		int oldAngularResolution = angularResolution;
		angularResolution = newAngularResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.LINE_RANGE_SCANNER__ANGULAR_RESOLUTION, oldAngularResolution, angularResolution));
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
			case ApogyAddonsSensorsRangePackage.LINE_RANGE_SCANNER__ANGULAR_RESOLUTION:
				return getAngularResolution();
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
			case ApogyAddonsSensorsRangePackage.LINE_RANGE_SCANNER__ANGULAR_RESOLUTION:
				setAngularResolution((Integer)newValue);
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
			case ApogyAddonsSensorsRangePackage.LINE_RANGE_SCANNER__ANGULAR_RESOLUTION:
				setAngularResolution(ANGULAR_RESOLUTION_EDEFAULT);
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
			case ApogyAddonsSensorsRangePackage.LINE_RANGE_SCANNER__ANGULAR_RESOLUTION:
				return angularResolution != ANGULAR_RESOLUTION_EDEFAULT;
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
			case ApogyAddonsSensorsRangePackage.LINE_RANGE_SCANNER___GET_FIELD_OF_VIEW:
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
		result.append(" (angularResolution: ");
		result.append(angularResolution);
		result.append(')');
		return result.toString();
	}

} //LineRangeScannerImpl
