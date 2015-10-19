/**
 * Canadian Space Agency 2007.
 *
 * $Id: OrientationSensorImpl.java,v 1.5.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.impl;

import java.lang.reflect.InvocationTargetException;
import javax.vecmath.Vector3d;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.Sensor;
import org.eclipse.symphony.addons.sensors.SensorStatus;
import org.eclipse.symphony.addons.sensors.SensorsPackage;
import org.eclipse.symphony.addons.sensors.pose.OrientationSensor;
import org.eclipse.symphony.addons.sensors.pose.PosePackage;
import org.eclipse.symphony.addons.sensors.pose.SelfPlaceSensor;
import org.eclipse.symphony.common.geometry.data3d.CartesianOrientationCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TopologyFactory;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.impl.RotationNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orientation Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.impl.OrientationSensorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.impl.OrientationSensorImpl#getOrientationCoordinates <em>Orientation Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrientationSensorImpl extends RotationNodeImpl implements OrientationSensor
{
	private Adapter orientationAdapter = null;		
	protected TopologyFacade topologyFacade = TopologyFactory.eINSTANCE.createTopologyFacade();

	
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SensorStatus STATUS_EDEFAULT = SensorStatus.OFF;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected SensorStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrientationCoordinates() <em>Orientation Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientationCoordinates()
	 * @generated
	 * @ordered
	 */
	protected CartesianOrientationCoordinates orientationCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected OrientationSensorImpl() {
		super();
		eAdapters().add(getOrientationAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PosePackage.Literals.ORIENTATION_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorStatus getStatus()
	{
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(SensorStatus newStatus)
	{
		SensorStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.ORIENTATION_SENSOR__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianOrientationCoordinates getOrientationCoordinates()
	{
		if(orientationCoordinates == null)
		{
			orientationCoordinates =  Data3dFactory.eINSTANCE.createCartesianOrientationCoordinates();				
		}
		return orientationCoordinates;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianOrientationCoordinates basicGetOrientationCoordinates() {
		return orientationCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetOrientation(CartesianOrientationCoordinates newOrientation) throws Exception
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianOrientationCoordinates extractOrientationFromMatrix(Matrix3x3 matrix)
	{		
		Vector3d rotation = GeometricUtils.extractRotationFromXYZRotMatrix(matrix.asMatrix3d());		
		CartesianOrientationCoordinates orientation = Data3dFacade.INSTANCE.createCartesianOrientationCoordinates(rotation.x, rotation.y, rotation.z);
		return orientation;
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
			case PosePackage.ORIENTATION_SENSOR__STATUS:
				return getStatus();
			case PosePackage.ORIENTATION_SENSOR__ORIENTATION_COORDINATES:
				if (resolve) return getOrientationCoordinates();
				return basicGetOrientationCoordinates();
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
			case PosePackage.ORIENTATION_SENSOR__STATUS:
				setStatus((SensorStatus)newValue);
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
			case PosePackage.ORIENTATION_SENSOR__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case PosePackage.ORIENTATION_SENSOR__STATUS:
				return status != STATUS_EDEFAULT;
			case PosePackage.ORIENTATION_SENSOR__ORIENTATION_COORDINATES:
				return orientationCoordinates != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == Sensor.class) {
			switch (derivedFeatureID) {
				case PosePackage.ORIENTATION_SENSOR__STATUS: return SensorsPackage.SENSOR__STATUS;
				default: return -1;
			}
		}
		if (baseClass == SelfPlaceSensor.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == Sensor.class) {
			switch (baseFeatureID) {
				case SensorsPackage.SENSOR__STATUS: return PosePackage.ORIENTATION_SENSOR__STATUS;
				default: return -1;
			}
		}
		if (baseClass == SelfPlaceSensor.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PosePackage.ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES:
				try {
					resetOrientation((CartesianOrientationCoordinates)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case PosePackage.ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3:
				return extractOrientationFromMatrix((Matrix3x3)arguments.get(0));
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}
	
	/**
	 * Returns the adapter used to keep the positionCoordinates updated when the node position is changed.
	 * @return The adapter.
	 */
	private Adapter getOrientationAdapter()
	{		
		if(orientationAdapter == null)
		{
			orientationAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{				
					if(msg.getFeatureID(RotationNode.class) == TopologyPackage.ROTATION_NODE__ROTATION_MATRIX)
					{
						// Extracts the rotation from the rotation matrix.
						CartesianOrientationCoordinates newOrientation = extractOrientationFromMatrix((Matrix3x3) msg.getNewValue());
						
						// Updates the rotation coordinates.
						getOrientationCoordinates().setXRotation(newOrientation.getXRotation());
						getOrientationCoordinates().setYRotation(newOrientation.getYRotation());
						getOrientationCoordinates().setZRotation(newOrientation.getZRotation());												
					}								
				}
			};
		}
		return orientationAdapter;
	}	
} //OrientationSensorImpl
