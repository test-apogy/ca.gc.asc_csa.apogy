package ca.gc.asc_csa.apogy.core.invocator.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.emf.impl.CollectionTimedTimeSourceImpl;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Results List Time Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultsListTimeSourceImpl#getOpsCallList <em>Ops Call List</em>}</li>
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
		return ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST, oldOpsCallList, opsCallList));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST, oldOpsCallList, opsCallList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE__OPS_CALL_LIST:
				return opsCallList != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationCallResultsListTimeSourceImpl
