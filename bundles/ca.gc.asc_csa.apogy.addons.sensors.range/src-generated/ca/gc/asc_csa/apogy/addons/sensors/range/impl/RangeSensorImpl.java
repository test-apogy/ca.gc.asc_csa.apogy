/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeSensorImpl.java,v 1.3.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.range.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.impl.SensorImpl;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RangeSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RangeSensorImpl extends SensorImpl implements RangeSensor
{		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeSensorImpl()
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
		return ApogyAddonsSensorsRangePackage.Literals.RANGE_SENSOR;
	}

} //RangeSensorImpl
