/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelfMotionSensorImpl.java,v 1.2.4.2 2015/05/21 15:50:25 pallard Exp $
 */
package motion.impl;

import motion.MotionPackage;
import motion.SelfMotionSensor;

import org.eclipse.emf.ecore.EClass;

import ca.gc.space.mrt.sensors.sensors.impl.SensorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Motion Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SelfMotionSensorImpl extends SensorImpl implements SelfMotionSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfMotionSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MotionPackage.Literals.SELF_MOTION_SENSOR;
	}

} //SelfMotionSensorImpl
