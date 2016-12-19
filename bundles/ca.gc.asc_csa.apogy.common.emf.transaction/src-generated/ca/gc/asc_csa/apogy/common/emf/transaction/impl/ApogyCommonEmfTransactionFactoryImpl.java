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

import ca.gc.asc_csa.apogy.common.emf.transaction.*;

import java.util.Collection;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEmfTransactionFactoryImpl extends EFactoryImpl implements ApogyCommonEmfTransactionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonEmfTransactionFactory init() {
		try {
			ApogyCommonEmfTransactionFactory theApogyCommonEmfTransactionFactory = (ApogyCommonEmfTransactionFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonEmfTransactionPackage.eNS_URI);
			if (theApogyCommonEmfTransactionFactory != null) {
				return theApogyCommonEmfTransactionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonEmfTransactionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEmfTransactionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE: return createApogyCommonEmfTransactionFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonEmfTransactionPackage.TRANSACTIONAL_EDITING_DOMAIN:
				return createTransactionalEditingDomainFromString(eDataType, initialValue);
			case ApogyCommonEmfTransactionPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case ApogyCommonEmfTransactionPackage.ABSTRACT_OVERRIDEABLE_COMMAND:
				return createAbstractOverrideableCommandFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCommonEmfTransactionPackage.TRANSACTIONAL_EDITING_DOMAIN:
				return convertTransactionalEditingDomainToString(eDataType, instanceValue);
			case ApogyCommonEmfTransactionPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case ApogyCommonEmfTransactionPackage.ABSTRACT_OVERRIDEABLE_COMMAND:
				return convertAbstractOverrideableCommandToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEmfTransactionFacade createApogyCommonEmfTransactionFacade() {
		ApogyCommonEmfTransactionFacadeImpl apogyCommonEmfTransactionFacade = new ApogyCommonEmfTransactionFacadeImpl();
		return apogyCommonEmfTransactionFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionalEditingDomain createTransactionalEditingDomainFromString(EDataType eDataType, String initialValue) {
		return (TransactionalEditingDomain)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionalEditingDomainToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue) {
		return (Collection<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOverrideableCommand createAbstractOverrideableCommandFromString(EDataType eDataType, String initialValue) {
		return (AbstractOverrideableCommand)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractOverrideableCommandToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEmfTransactionPackage getApogyCommonEmfTransactionPackage() {
		return (ApogyCommonEmfTransactionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonEmfTransactionPackage getPackage() {
		return ApogyCommonEmfTransactionPackage.eINSTANCE;
	}

} //ApogyCommonEmfTransactionFactoryImpl
