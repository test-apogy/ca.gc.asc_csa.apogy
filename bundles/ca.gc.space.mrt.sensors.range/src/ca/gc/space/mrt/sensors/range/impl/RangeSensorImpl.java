/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeSensorImpl.java,v 1.3.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.space.mrt.sensors.range.RangePackage;
import ca.gc.space.mrt.sensors.range.RangeSensor;
import ca.gc.space.mrt.sensors.sensors.impl.SensorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
		return RangePackage.Literals.RANGE_SENSOR;
	}

} //RangeSensorImpl
