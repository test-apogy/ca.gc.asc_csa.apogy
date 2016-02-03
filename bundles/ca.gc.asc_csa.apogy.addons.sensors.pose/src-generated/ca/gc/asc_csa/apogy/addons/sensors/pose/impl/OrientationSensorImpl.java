package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.lang.reflect.InvocationTargetException;
import javax.vecmath.Vector3d;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.Sensor;
import ca.gc.asc_csa.apogy.addons.sensors.SensorStatus;
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SelfPlaceSensor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.RotationNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orientation Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.OrientationSensorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.OrientationSensorImpl#getOrientationCoordinates <em>Orientation Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrientationSensorImpl extends RotationNodeImpl implements OrientationSensor
{
	private Adapter orientationAdapter = null;		
	
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
		return ApogyAddonsSensorsPosePackage.Literals.ORIENTATION_SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS, oldStatus, status));
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
			orientationCoordinates =  ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianOrientationCoordinates();				
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
		CartesianOrientationCoordinates orientation = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianOrientationCoordinates(rotation.x, rotation.y, rotation.z);
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
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS:
				return getStatus();
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__ORIENTATION_COORDINATES:
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
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS:
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
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS:
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
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS:
				return status != STATUS_EDEFAULT;
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__ORIENTATION_COORDINATES:
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
				case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS: return ApogyAddonsSensorsPackage.SENSOR__STATUS;
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
				case ApogyAddonsSensorsPackage.SENSOR__STATUS: return ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS;
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
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR___RESET_ORIENTATION__CARTESIANORIENTATIONCOORDINATES:
				try {
					resetOrientation((CartesianOrientationCoordinates)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR___EXTRACT_ORIENTATION_FROM_MATRIX__MATRIX3X3:
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
					if(msg.getFeatureID(RotationNode.class) == ApogyCommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX)
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
