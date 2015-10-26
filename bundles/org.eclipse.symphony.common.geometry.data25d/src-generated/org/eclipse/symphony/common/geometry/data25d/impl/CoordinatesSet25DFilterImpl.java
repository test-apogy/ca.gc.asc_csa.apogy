/**
 * Canadian Space Agency 2007.
 *
 * $Id: CoordinatesSet25DFilterImpl.java,v 1.5.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.geometry.data25d.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data25d.CoordinatesSet25D;
import org.eclipse.symphony.common.geometry.data25d.CoordinatesSet25DFilter;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DPackage;
import org.eclipse.symphony.common.processors.impl.ProcessorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinates Set25 DFilter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CoordinatesSet25DFilterImpl<T extends CoordinatesSet25D> extends ProcessorImpl<T, T> implements CoordinatesSet25DFilter<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesSet25DFilterImpl()
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
		return Symphony__CommonGeometryData25DPackage.Literals.COORDINATES_SET25_DFILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInput(T newInput) {
		super.setInput(newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setOutput(T newOutput) {
		super.setOutput(newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T createCoordinatesSet25D()
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
			case Symphony__CommonGeometryData25DPackage.COORDINATES_SET25_DFILTER___CREATE_COORDINATES_SET25_D:
				return createCoordinatesSet25D();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CoordinatesSet25DFilterImpl
