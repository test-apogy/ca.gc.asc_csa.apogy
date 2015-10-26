/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.SelectionBasedTimeSource;
import org.eclipse.symphony.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Based Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SelectionBasedTimeSourceImpl extends TimeSourceImpl implements SelectionBasedTimeSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionBasedTimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonEMFPackage.Literals.SELECTION_BASED_TIME_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setSelection(Timed timedElement)
	{
		if(timedElement != null)
		{
			Date time = timedElement.getTime();
			
			// Update the time source time.
			setTime(time);			
		}
		else
		{
			setTime(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonEMFPackage.SELECTION_BASED_TIME_SOURCE___SET_SELECTION__TIMED:
				setSelection((Timed)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SelectionBasedTimeSourceImpl
