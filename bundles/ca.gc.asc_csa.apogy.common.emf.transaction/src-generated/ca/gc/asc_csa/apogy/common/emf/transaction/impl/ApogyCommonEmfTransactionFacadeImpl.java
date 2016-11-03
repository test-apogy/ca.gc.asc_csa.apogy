/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.common.emf.transaction.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonEmfTransactionFacadeImpl extends MinimalEObjectImpl.Container
		implements ApogyCommonEmfTransactionFacade {

	/**
	 * Facade Singleton.
	 */
	private static ApogyCommonEmfTransactionFacade instance = null;

	/**
	 * Returns the facade singleton.
	 * 
	 * @return Reference to the facade.
	 */
	public static ApogyCommonEmfTransactionFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonEmfTransactionFacadeImpl();
		}

		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ApogyCommonEmfTransactionFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEmfTransactionPackage.Literals.APOGY_COMMON_EMF_TRANSACTION_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TransactionalEditingDomain getDefaultEditingDomain() {
		return TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("ca.gc.asc_csa.apogy.common.emf.transaction.defaultApogyEditingDomain");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___GET_DEFAULT_EDITING_DOMAIN:
			return getDefaultEditingDomain();
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyCommonEmfTransactionFacadeImpl
