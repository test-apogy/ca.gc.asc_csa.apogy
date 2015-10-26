/**
 * Canadian Space Agency 2007.
 *
 * $Id: SimulatedOrientationSensorImpl.java,v 1.2.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.impl;

import javax.vecmath.Matrix3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage;
import org.eclipse.symphony.addons.sensors.pose.SimulatedOrientationSensor;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Symphony__CommonMathFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulated Orientation Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl#getZAngularVelocity <em>ZAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.impl.SimulatedOrientationSensorImpl#getUpdatePeriod <em>Update Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulatedOrientationSensorImpl extends OrientationSensorImpl implements SimulatedOrientationSensor
{
	/**
	 * The default value of the '{@link #getXAngularVelocity() <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double XANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXAngularVelocity() <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double xAngularVelocity = XANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAngularVelocity() <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double YANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYAngularVelocity() <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double yAngularVelocity = YANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZAngularVelocity() <em>ZAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ZANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZAngularVelocity() <em>ZAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double zAngularVelocity = ZANGULAR_VELOCITY_EDEFAULT;

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
	protected SimulatedOrientationSensorImpl()
	{
		super();
		initialize();
	}

	private void initialize()
	{
		if(getRotationMatrix()== null) setRotationMatrix(Symphony__CommonMathFactory.eINSTANCE.createMatrix3x3());
		
		Thread t = new Thread()
    	{			
			@Override
			public void run()
			{
				while(true)
				{
					try
					{											
						Matrix3d oldRotation = getRotationMatrix().asMatrix3d();
						Matrix3d newRotation = GeometricUtils.packXYZ(getUpdatePeriod() * getXAngularVelocity(), 
																	  getUpdatePeriod() * getYAngularVelocity(), 
																	  getUpdatePeriod() * getZAngularVelocity());							
												
						oldRotation.mul(newRotation);						
						setRotationMatrix(MathFacade.INSTANCE.createMatrix3x3(oldRotation));
												
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
		return Symphony__AddonsSensorsPosePackage.Literals.SIMULATED_ORIENTATION_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXAngularVelocity()
	{
		return xAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAngularVelocity(double newXAngularVelocity)
	{
		double oldXAngularVelocity = xAngularVelocity;
		xAngularVelocity = newXAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY, oldXAngularVelocity, xAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYAngularVelocity()
	{
		return yAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAngularVelocity(double newYAngularVelocity)
	{
		double oldYAngularVelocity = yAngularVelocity;
		yAngularVelocity = newYAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY, oldYAngularVelocity, yAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZAngularVelocity()
	{
		return zAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZAngularVelocity(double newZAngularVelocity)
	{
		double oldZAngularVelocity = zAngularVelocity;
		zAngularVelocity = newZAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY, oldZAngularVelocity, zAngularVelocity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD, oldUpdatePeriod, updatePeriod));
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
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY:
				return getXAngularVelocity();
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY:
				return getYAngularVelocity();
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY:
				return getZAngularVelocity();
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD:
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
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY:
				setXAngularVelocity((Double)newValue);
				return;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY:
				setYAngularVelocity((Double)newValue);
				return;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY:
				setZAngularVelocity((Double)newValue);
				return;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD:
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
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY:
				setXAngularVelocity(XANGULAR_VELOCITY_EDEFAULT);
				return;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY:
				setYAngularVelocity(YANGULAR_VELOCITY_EDEFAULT);
				return;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY:
				setZAngularVelocity(ZANGULAR_VELOCITY_EDEFAULT);
				return;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD:
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
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__XANGULAR_VELOCITY:
				return xAngularVelocity != XANGULAR_VELOCITY_EDEFAULT;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__YANGULAR_VELOCITY:
				return yAngularVelocity != YANGULAR_VELOCITY_EDEFAULT;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__ZANGULAR_VELOCITY:
				return zAngularVelocity != ZANGULAR_VELOCITY_EDEFAULT;
			case Symphony__AddonsSensorsPosePackage.SIMULATED_ORIENTATION_SENSOR__UPDATE_PERIOD:
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
		result.append(" (xAngularVelocity: ");
		result.append(xAngularVelocity);
		result.append(", yAngularVelocity: ");
		result.append(yAngularVelocity);
		result.append(", zAngularVelocity: ");
		result.append(zAngularVelocity);
		result.append(", updatePeriod: ");
		result.append(updatePeriod);
		result.append(')');
		return result.toString();
	}

} //SimulatedOrientationSensorImpl
