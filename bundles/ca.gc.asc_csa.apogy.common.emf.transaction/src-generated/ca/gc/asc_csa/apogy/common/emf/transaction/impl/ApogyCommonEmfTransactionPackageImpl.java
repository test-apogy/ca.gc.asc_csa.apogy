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

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFactory;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonEmfTransactionPackageImpl extends EPackageImpl implements ApogyCommonEmfTransactionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonEmfTransactionFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transactionalEditingDomainEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonEmfTransactionPackageImpl() {
		super(eNS_URI, ApogyCommonEmfTransactionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyCommonEmfTransactionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonEmfTransactionPackage init() {
		if (isInited) return (ApogyCommonEmfTransactionPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEmfTransactionPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonEmfTransactionPackageImpl theApogyCommonEmfTransactionPackage = (ApogyCommonEmfTransactionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonEmfTransactionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonEmfTransactionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theApogyCommonEmfTransactionPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonEmfTransactionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonEmfTransactionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonEmfTransactionPackage.eNS_URI, theApogyCommonEmfTransactionPackage);
		return theApogyCommonEmfTransactionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonEmfTransactionFacade() {
		return apogyCommonEmfTransactionFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonEmfTransactionFacade__GetDefaultEditingDomain() {
		return apogyCommonEmfTransactionFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransactionalEditingDomain() {
		return transactionalEditingDomainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonEmfTransactionFactory getApogyCommonEmfTransactionFactory() {
		return (ApogyCommonEmfTransactionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		apogyCommonEmfTransactionFacadeEClass = createEClass(APOGY_COMMON_EMF_TRANSACTION_FACADE);
		createEOperation(apogyCommonEmfTransactionFacadeEClass, APOGY_COMMON_EMF_TRANSACTION_FACADE___GET_DEFAULT_EDITING_DOMAIN);

		// Create data types
		transactionalEditingDomainEDataType = createEDataType(TRANSACTIONAL_EDITING_DOMAIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCommonEmfTransactionFacadeEClass, ApogyCommonEmfTransactionFacade.class, "ApogyCommonEmfTransactionFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getApogyCommonEmfTransactionFacade__GetDefaultEditingDomain(), this.getTransactionalEditingDomain(), "getDefaultEditingDomain", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(transactionalEditingDomainEDataType, TransactionalEditingDomain.class, "TransactionalEditingDomain", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonEmfTransactionPackageImpl
