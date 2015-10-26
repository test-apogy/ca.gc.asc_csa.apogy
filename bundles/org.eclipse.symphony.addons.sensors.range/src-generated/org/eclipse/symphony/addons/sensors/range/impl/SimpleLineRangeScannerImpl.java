/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleLineRangeScannerImpl.java,v 1.4.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.sensors.range.RangePackage;
import org.eclipse.symphony.addons.sensors.range.SimpleLineRangeScanner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Line Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SimpleLineRangeScannerImpl extends LineRangeScannerImpl implements SimpleLineRangeScanner
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleLineRangeScannerImpl()
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
		return RangePackage.Literals.SIMPLE_LINE_RANGE_SCANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean acquireScan()
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RangePackage.SIMPLE_LINE_RANGE_SCANNER___ACQUIRE_SCAN:
				return acquireScan();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SimpleLineRangeScannerImpl
