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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPositionSensor;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import org.eclipse.ui.progress.UIJob;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulated Position Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.SimulatedPositionSensorImpl#getXVelocity <em>XVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.SimulatedPositionSensorImpl#getYVelocity <em>YVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.SimulatedPositionSensorImpl#getZVelocity <em>ZVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.SimulatedPositionSensorImpl#getUpdatePeriod <em>Update Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulatedPositionSensorImpl extends PositionSensorImpl implements SimulatedPositionSensor
{
	private UIJob updatePositionJob = null;
	
	/**
	 * The default value of the '{@link #getXVelocity() <em>XVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double XVELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXVelocity() <em>XVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXVelocity()
	 * @generated
	 * @ordered
	 */
	protected double xVelocity = XVELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYVelocity() <em>YVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double YVELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYVelocity() <em>YVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYVelocity()
	 * @generated
	 * @ordered
	 */
	protected double yVelocity = YVELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZVelocity() <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ZVELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZVelocity() <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZVelocity()
	 * @generated
	 * @ordered
	 */
	protected double zVelocity = ZVELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatePeriod() <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double UPDATE_PERIOD_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getUpdatePeriod() <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatePeriod()
	 * @generated
	 * @ordered
	 */
	protected double updatePeriod = UPDATE_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SimulatedPositionSensorImpl()
	{
		super();
		
		initialize();
	}
	
	private void initialize()
	{
		if(getPosition() == null) setPosition(ApogyCommonMathFactory.eINSTANCE.createTuple3d());
		
		Thread t = new Thread()
    	{			
			@Override
			public void run()
			{
				while(true)
				{
					try
					{	
						Tuple3d oldPosition = getPosition();
						Tuple3d newPosition = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
											
						newPosition.setX(oldPosition.getX() + getXVelocity() * getUpdatePeriod());
						newPosition.setY(oldPosition.getY() + getYVelocity() * getUpdatePeriod());
						newPosition.setZ(oldPosition.getZ() + getZVelocity() * getUpdatePeriod());					
						setPosition(newPosition);		
						
						long delay = Math.round(getUpdatePeriod() * 1000.0);
						Thread.sleep(delay);
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}						
				}
			}		
    	};
    	
    	t.start();    	        		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSITION_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXVelocity()
	{
		return xVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXVelocity(double newXVelocity)
	{
		double oldXVelocity = xVelocity;
		xVelocity = newXVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__XVELOCITY, oldXVelocity, xVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYVelocity()
	{
		return yVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYVelocity(double newYVelocity)
	{
		double oldYVelocity = yVelocity;
		yVelocity = newYVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__YVELOCITY, oldYVelocity, yVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZVelocity()
	{
		return zVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZVelocity(double newZVelocity)
	{
		double oldZVelocity = zVelocity;
		zVelocity = newZVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__ZVELOCITY, oldZVelocity, zVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUpdatePeriod()
	{
		return updatePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatePeriod(double newUpdatePeriod)
	{
		double oldUpdatePeriod = updatePeriod;
		updatePeriod = newUpdatePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__UPDATE_PERIOD, oldUpdatePeriod, updatePeriod));
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
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__XVELOCITY:
				return getXVelocity();
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__YVELOCITY:
				return getYVelocity();
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__ZVELOCITY:
				return getZVelocity();
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__UPDATE_PERIOD:
				return getUpdatePeriod();
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
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__XVELOCITY:
				setXVelocity((Double)newValue);
				return;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__YVELOCITY:
				setYVelocity((Double)newValue);
				return;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__ZVELOCITY:
				setZVelocity((Double)newValue);
				return;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__UPDATE_PERIOD:
				setUpdatePeriod((Double)newValue);
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
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__XVELOCITY:
				setXVelocity(XVELOCITY_EDEFAULT);
				return;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__YVELOCITY:
				setYVelocity(YVELOCITY_EDEFAULT);
				return;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__ZVELOCITY:
				setZVelocity(ZVELOCITY_EDEFAULT);
				return;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__UPDATE_PERIOD:
				setUpdatePeriod(UPDATE_PERIOD_EDEFAULT);
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
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__XVELOCITY:
				return xVelocity != XVELOCITY_EDEFAULT;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__YVELOCITY:
				return yVelocity != YVELOCITY_EDEFAULT;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__ZVELOCITY:
				return zVelocity != ZVELOCITY_EDEFAULT;
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__UPDATE_PERIOD:
				return updatePeriod != UPDATE_PERIOD_EDEFAULT;
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
		result.append(" (xVelocity: ");
		result.append(xVelocity);
		result.append(", yVelocity: ");
		result.append(yVelocity);
		result.append(", zVelocity: ");
		result.append(zVelocity);
		result.append(", updatePeriod: ");
		result.append(updatePeriod);
		result.append(')');
		return result.toString();
	}

	@Override
	protected void finalize() throws Throwable
	{
		if(updatePositionJob != null) updatePositionJob.cancel();
		super.finalize();
	}
} //SimulatedPositionSensorImpl
