/**
 * Canadian Space Agency 2007.
 *
 * $Id: SimulatedPoseSensorImpl.java,v 1.2.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package ca.gc.space.mrt.sensors.pose.impl;

import javax.vecmath.Matrix3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.common.math.Tuple3d;

import ca.gc.space.mrt.sensors.pose.PosePackage;
import ca.gc.space.mrt.sensors.pose.SimulatedPoseSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulated Pose Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.impl.SimulatedPoseSensorImpl#getUpdatePeriod <em>Update Period</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.impl.SimulatedPoseSensorImpl#getXVelocity <em>XVelocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.impl.SimulatedPoseSensorImpl#getYVelocity <em>YVelocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.impl.SimulatedPoseSensorImpl#getZVelocity <em>ZVelocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.impl.SimulatedPoseSensorImpl#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.impl.SimulatedPoseSensorImpl#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.pose.impl.SimulatedPoseSensorImpl#getZAngularVelocity <em>ZAngular Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulatedPoseSensorImpl extends PoseSensorImpl implements SimulatedPoseSensor
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SimulatedPoseSensorImpl()
	{
		super();
		initialize();
	}

	private void initialize()
	{
		if(getRotationMatrix()== null) setRotationMatrix(MathFactory.eINSTANCE.createMatrix3x3());
		if(getPosition()== null) setPosition( MathFactory.eINSTANCE.createTuple3d());
		
		Thread t = new Thread()
    	{			
			@Override
			public void run()
			{
				while(true)
				{
					try
					{			
						// Update rotation.
						Matrix3d oldRotation = getRotationMatrix().asMatrix3d();
						Matrix3d newRotation = GeometricUtils.packXYZ(getUpdatePeriod() * getXAngularVelocity(), 
																	  getUpdatePeriod() * getYAngularVelocity(), 
																	  getUpdatePeriod() * getZAngularVelocity());							
												
						oldRotation.mul(newRotation);						
						setRotationMatrix(MathFacade.INSTANCE.createMatrix3x3(oldRotation));
												
						// Update position.
						Tuple3d oldPosition = getPosition();
						Tuple3d newPosition = MathFactory.eINSTANCE.createTuple3d();
											
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
		return PosePackage.Literals.SIMULATED_POSE_SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.SIMULATED_POSE_SENSOR__UPDATE_PERIOD, oldUpdatePeriod, updatePeriod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.SIMULATED_POSE_SENSOR__XVELOCITY, oldXVelocity, xVelocity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.SIMULATED_POSE_SENSOR__YVELOCITY, oldYVelocity, yVelocity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.SIMULATED_POSE_SENSOR__ZVELOCITY, oldZVelocity, zVelocity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY, oldXAngularVelocity, xAngularVelocity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY, oldYAngularVelocity, yAngularVelocity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PosePackage.SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY, oldZAngularVelocity, zAngularVelocity));
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
			case PosePackage.SIMULATED_POSE_SENSOR__UPDATE_PERIOD:
				return getUpdatePeriod();
			case PosePackage.SIMULATED_POSE_SENSOR__XVELOCITY:
				return getXVelocity();
			case PosePackage.SIMULATED_POSE_SENSOR__YVELOCITY:
				return getYVelocity();
			case PosePackage.SIMULATED_POSE_SENSOR__ZVELOCITY:
				return getZVelocity();
			case PosePackage.SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY:
				return getXAngularVelocity();
			case PosePackage.SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY:
				return getYAngularVelocity();
			case PosePackage.SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY:
				return getZAngularVelocity();
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
			case PosePackage.SIMULATED_POSE_SENSOR__UPDATE_PERIOD:
				setUpdatePeriod((Double)newValue);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__XVELOCITY:
				setXVelocity((Double)newValue);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__YVELOCITY:
				setYVelocity((Double)newValue);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__ZVELOCITY:
				setZVelocity((Double)newValue);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY:
				setXAngularVelocity((Double)newValue);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY:
				setYAngularVelocity((Double)newValue);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY:
				setZAngularVelocity((Double)newValue);
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
			case PosePackage.SIMULATED_POSE_SENSOR__UPDATE_PERIOD:
				setUpdatePeriod(UPDATE_PERIOD_EDEFAULT);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__XVELOCITY:
				setXVelocity(XVELOCITY_EDEFAULT);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__YVELOCITY:
				setYVelocity(YVELOCITY_EDEFAULT);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__ZVELOCITY:
				setZVelocity(ZVELOCITY_EDEFAULT);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY:
				setXAngularVelocity(XANGULAR_VELOCITY_EDEFAULT);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY:
				setYAngularVelocity(YANGULAR_VELOCITY_EDEFAULT);
				return;
			case PosePackage.SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY:
				setZAngularVelocity(ZANGULAR_VELOCITY_EDEFAULT);
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
			case PosePackage.SIMULATED_POSE_SENSOR__UPDATE_PERIOD:
				return updatePeriod != UPDATE_PERIOD_EDEFAULT;
			case PosePackage.SIMULATED_POSE_SENSOR__XVELOCITY:
				return xVelocity != XVELOCITY_EDEFAULT;
			case PosePackage.SIMULATED_POSE_SENSOR__YVELOCITY:
				return yVelocity != YVELOCITY_EDEFAULT;
			case PosePackage.SIMULATED_POSE_SENSOR__ZVELOCITY:
				return zVelocity != ZVELOCITY_EDEFAULT;
			case PosePackage.SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY:
				return xAngularVelocity != XANGULAR_VELOCITY_EDEFAULT;
			case PosePackage.SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY:
				return yAngularVelocity != YANGULAR_VELOCITY_EDEFAULT;
			case PosePackage.SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY:
				return zAngularVelocity != ZANGULAR_VELOCITY_EDEFAULT;
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
		result.append(" (updatePeriod: ");
		result.append(updatePeriod);
		result.append(", xVelocity: ");
		result.append(xVelocity);
		result.append(", yVelocity: ");
		result.append(yVelocity);
		result.append(", zVelocity: ");
		result.append(zVelocity);
		result.append(", xAngularVelocity: ");
		result.append(xAngularVelocity);
		result.append(", yAngularVelocity: ");
		result.append(yAngularVelocity);
		result.append(", zAngularVelocity: ");
		result.append(zAngularVelocity);
		result.append(')');
		return result.toString();
	}

} //SimulatedPoseSensorImpl
