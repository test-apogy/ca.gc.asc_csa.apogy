/**
 * Canadian Space Agency 2007.
 *
 * $Id: SelfPlaceSensorImpl.java,v 1.2.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.impl.SensorImpl;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SelfPlaceSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self Place Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SelfPlaceSensorImpl extends SensorImpl implements SelfPlaceSensor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfPlaceSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsPosePackage.Literals.SELF_PLACE_SENSOR;
	}

} //SelfPlaceSensorImpl
