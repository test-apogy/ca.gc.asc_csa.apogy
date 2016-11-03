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
package ca.gc.asc_csa.apogy.common.emf.transaction;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonEmfTransaction' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n \n Contributors:\n     Pierre Allard (Pierre.Allard@canada.ca), \n     Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n     Sebastien Gemme (Sebastien.Gemme@canada.ca),\n     Olivier L. Larouche (Olivier.LLarouche@canada.ca),\n     Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' modelName='ApogyCommonEmfTransaction' modelDirectory='/ca.gc.asc_csa.apogy.common.emf.transaction/src-generated' basePackage='ca.gc.asc_csa.apogy.common.emf'"
 * @generated
 */
public interface ApogyCommonEmfTransactionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "transaction";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.emf.transaction";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "transaction";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonEmfTransactionPackage eINSTANCE = ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionPackageImpl#getApogyCommonEmfTransactionFacade()
	 * @generated
	 */
	int APOGY_COMMON_EMF_TRANSACTION_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_TRANSACTION_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Default Editing Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_TRANSACTION_FACADE___GET_DEFAULT_EDITING_DOMAIN = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_TRANSACTION_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>Transactional Editing Domain</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.transaction.TransactionalEditingDomain
	 * @see ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionPackageImpl#getTransactionalEditingDomain()
	 * @generated
	 */
	int TRANSACTIONAL_EDITING_DOMAIN = 1;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade
	 * @generated
	 */
	EClass getApogyCommonEmfTransactionFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade#getDefaultEditingDomain() <em>Get Default Editing Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Editing Domain</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade#getDefaultEditingDomain()
	 * @generated
	 */
	EOperation getApogyCommonEmfTransactionFacade__GetDefaultEditingDomain();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.transaction.TransactionalEditingDomain <em>Transactional Editing Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transactional Editing Domain</em>'.
	 * @see org.eclipse.emf.transaction.TransactionalEditingDomain
	 * @model instanceClass="org.eclipse.emf.transaction.TransactionalEditingDomain"
	 * @generated
	 */
	EDataType getTransactionalEditingDomain();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonEmfTransactionFactory getApogyCommonEmfTransactionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionPackageImpl#getApogyCommonEmfTransactionFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_EMF_TRANSACTION_FACADE = eINSTANCE.getApogyCommonEmfTransactionFacade();

		/**
		 * The meta object literal for the '<em><b>Get Default Editing Domain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_TRANSACTION_FACADE___GET_DEFAULT_EDITING_DOMAIN = eINSTANCE.getApogyCommonEmfTransactionFacade__GetDefaultEditingDomain();

		/**
		 * The meta object literal for the '<em>Transactional Editing Domain</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.transaction.TransactionalEditingDomain
		 * @see ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionPackageImpl#getTransactionalEditingDomain()
		 * @generated
		 */
		EDataType TRANSACTIONAL_EDITING_DOMAIN = eINSTANCE.getTransactionalEditingDomain();

	}

} //ApogyCommonEmfTransactionPackage
