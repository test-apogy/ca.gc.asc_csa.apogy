/**
 * <copyright>
 * </copyright>
 *
 * $Id: SelfMotionSensorImpl.java,v 1.2.4.2 2015/05/21 15:50:25 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.motion.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.impl.SensorImpl;
import ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage;
import ca.gc.asc_csa.apogy.addons.sensors.motion.SelfMotionSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Motion Sensor</b></em>'.
 * <!-- end-user-doc -->
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
		return ApogyAddonsSensorsMotionPackage.Literals.SELF_MOTION_SENSOR;
	}

} //SelfMotionSensorImpl
