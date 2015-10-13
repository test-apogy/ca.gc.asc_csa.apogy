/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.OperationCallResultsList;
import org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Results List Time Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultsListTimeSourceImpl#getOpsCallList <em>Ops Call List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallResultsListTimeSourceImpl extends CollectionTimedTimeSourceImpl implements OperationCallResultsListTimeSource {
	/**
	 * The cached value of the '{@link #getOpsCallList() <em>Ops Call List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpsCallList()
	 * @generated
	 * @ordered
	 */
	protected OperationCallResultsList opsCallList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallResultsListTimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreInvocatorPackage.Literals.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallResultsList getOpsCallList() {
		if (opsCallList != null && opsCallList.eIsProxy()) {
			InternalEObject oldOpsCallList = (InternalEObject)opsCallList;
			opsCallList = (OperationCallResultsList)eResolveProxy(oldOpsCallList);
			if (opsCallList != oldOpsCallList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST, oldOpsCallList, opsCallList));
			}
		}
		return opsCallList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallResultsList basicGetOpsCallList() {
		return opsCallList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setOpsCallList(OperationCallResultsList newOpsCallList) 
	{
		setOpsCallListGen(newOpsCallList);
		
		getTimedsList().clear();
		
		if(newOpsCallList != null )
		{
			// Updates the list of Timed element.
			List<Timed> timedList = new ArrayList<Timed>();
			
			for(AbstractResult result : newOpsCallList.getResults())
			{
				if(result != null)
				{
					timedList.add(result);
				}
			}
			
			getTimedsList().addAll(timedList);
		}					
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpsCallListGen(OperationCallResultsList newOpsCallList) {
		OperationCallResultsList oldOpsCallList = opsCallList;
		opsCallList = newOpsCallList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST, oldOpsCallList, opsCallList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
				if (resolve) return getOpsCallList();
				return basicGetOpsCallList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
				setOpsCallList((OperationCallResultsList)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
				setOpsCallList((OperationCallResultsList)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
				return opsCallList != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationCallResultsListTimeSourceImpl
