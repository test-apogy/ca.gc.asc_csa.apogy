/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.FixedTimeSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Time Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FixedTimeSourceImpl extends TimeSourceImpl implements FixedTimeSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedTimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcorePackage.Literals.FIXED_TIME_SOURCE;
	}

	@Override
	public Date getTime() 
	{
		if(super.getTime() == null)
		{
			Date now = new Date();
			
			setTime(now);
		}
		
		return super.getTime();
	}
} //FixedTimeSourceImpl
