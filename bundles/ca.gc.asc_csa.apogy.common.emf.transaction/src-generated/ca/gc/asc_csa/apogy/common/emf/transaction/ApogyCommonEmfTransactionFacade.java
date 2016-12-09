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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.emf.transaction.impl.ApogyCommonEmfTransactionFacadeImpl;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This provides tools to process and manage EMF Transaction.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionPackage#getApogyCommonEmfTransactionFacade()
 * @model
 * @generated
 */
public interface ApogyCommonEmfTransactionFacade extends EObject {
	
	/**
	 * Facade Singleton.
	 * @generated_NOT
	 */
	public static ApogyCommonEmfTransactionFacade INSTANCE = ApogyCommonEmfTransactionFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the default Apogy {@link TransactionalEditingDomain).
	 * @return Reference to the Apogy {@link TransactionalEditingDomain).
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.common.emf.transaction.TransactionalEditingDomain" unique="false"
	 * @generated
	 */
	TransactionalEditingDomain getDefaultEditingDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Puts the specified {@link EObject} inside a {@link ResourceSet} that uses a {@link TransactionalEditingDomain}.
	 * It is important to remove the {@link EObject} when the temporary {@link TransactionalEditingDomain}
	 * is no longer needed to be able to save the modification made to the {@link EObject}.
	 * @param eObject The reference to the {@link EObject}.
	 * <!-- end-model-doc -->
	 * @model eObjectUnique="false"
	 * @generated
	 */
	void addInTempTransactionalEditingDomain(EObject eObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ownerUnique="false" featureUnique="false" valueUnique="false"
	 * @generated
	 */
	void basicSet(EObject owner, EStructuralFeature feature, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ownerUnique="false" featureUnique="false" valueUnique="false" indexUnique="false"
	 * @generated
	 */
	void basicSet(EObject owner, EStructuralFeature feature, Object value, int index);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ownerUnique="false" featureUnique="false" valueUnique="false"
	 * @generated
	 */
	void basicAdd(EObject owner, EStructuralFeature feature, Object value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ownerUnique="false" featureUnique="false" collectionDataType="ca.gc.asc_csa.apogy.common.emf.transaction.Collection" collectionUnique="false"
	 * @generated
	 */
	void basicAdd(EObject owner, EStructuralFeature feature, Collection<?> collection);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ownerUnique="false" featureUnique="false" valueUnique="false"
	 * @generated
	 */
	void basicRemove(EObject owner, EStructuralFeature feature, Object value);

} // ApogyCommonEmfTransactionFacade
