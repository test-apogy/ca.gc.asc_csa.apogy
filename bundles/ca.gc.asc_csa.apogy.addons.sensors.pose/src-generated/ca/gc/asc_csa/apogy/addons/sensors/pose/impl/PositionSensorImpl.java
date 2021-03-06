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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.Sensor;
import ca.gc.asc_csa.apogy.addons.sensors.SensorStatus;
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SelfPlaceSensor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.PositionNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PositionSensorImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PositionSensorImpl#getPositionCoordinates <em>Position Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionSensorImpl extends PositionNodeImpl implements PositionSensor {

	private Adapter positionAdapter = null;	
	
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
	 * The cached value of the '{@link #getPositionCoordinates() <em>Position Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionCoordinates()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates positionCoordinates;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected PositionSensorImpl() {
		super();
		
		// Register listener to this node position to keep positionCoordinates updated.
		eAdapters().add(getPositionAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsPosePackage.Literals.POSITION_SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.POSITION_SENSOR__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates getPositionCoordinates()
	{
		if(positionCoordinates == null)
		{			
			positionCoordinates = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates();					
		}
		return positionCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetPositionCoordinates() {
		return positionCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void resetPosition(CartesianPositionCoordinates newPosition) throws Exception
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__STATUS:
				return getStatus();
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__POSITION_COORDINATES:
				if (resolve) return getPositionCoordinates();
				return basicGetPositionCoordinates();
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
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__STATUS:
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
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__STATUS:
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
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__STATUS:
				return status != STATUS_EDEFAULT;
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__POSITION_COORDINATES:
				return positionCoordinates != null;
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
				case ApogyAddonsSensorsPosePackage.POSITION_SENSOR__STATUS: return ApogyAddonsSensorsPackage.SENSOR__STATUS;
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
				case ApogyAddonsSensorsPackage.SENSOR__STATUS: return ApogyAddonsSensorsPosePackage.POSITION_SENSOR__STATUS;
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
			case ApogyAddonsSensorsPosePackage.POSITION_SENSOR___RESET_POSITION__CARTESIANPOSITIONCOORDINATES:
				try {
					resetPosition((CartesianPositionCoordinates)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
	private Adapter getPositionAdapter()
	{		
		if(positionAdapter == null)
		{
			positionAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{				
					if(msg.getFeatureID(PositionNode.class) == ApogyCommonTopologyPackage.POSITION_NODE__POSITION)
					{
						// Updates the current Orientation data with the new values.
						Tuple3d newPose = (Tuple3d) msg.getNewValue();
						
						getPositionCoordinates().setX(newPose.getX());
						getPositionCoordinates().setY(newPose.getY());
						getPositionCoordinates().setZ(newPose.getZ());																			
					}								
				}
			};
		}
		return positionAdapter;
	}			
} //PositionSensorImpl
