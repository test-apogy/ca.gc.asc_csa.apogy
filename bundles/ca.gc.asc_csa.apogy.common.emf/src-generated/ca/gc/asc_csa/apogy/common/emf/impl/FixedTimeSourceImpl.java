/**
 */
package ca.gc.asc_csa.apogy.common.emf.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.FixedTimeSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Time Source</b></em>'.
 * <!-- end-user-doc -->
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
		return ApogyCommonEMFPackage.Literals.FIXED_TIME_SOURCE;
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