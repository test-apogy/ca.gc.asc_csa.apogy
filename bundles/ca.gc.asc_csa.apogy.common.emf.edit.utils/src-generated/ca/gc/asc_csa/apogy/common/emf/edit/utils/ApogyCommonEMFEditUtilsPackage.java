package ca.gc.asc_csa.apogy.common.emf.edit.utils;
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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonEMFEditUtils' childCreationExtenders='true' modelName='ApogyCommonEMFEditUtils' modelDirectory='/ca.gc.asc_csa.apogy.common.emf.edit.utils/src-generated' basePackage='ca.gc.asc_csa.apogy.common.emf.edit'"
 * @generated
 */
public interface ApogyCommonEMFEditUtilsPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "utils";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.common.emf.edit.utils";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "utils";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCommonEMFEditUtilsPackage eINSTANCE = ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsPackageImpl#getApogyCommonEMFEditUtilsFacade()
	 * @generated
	 */
	int APOGY_COMMON_EMF_EDIT_UTILS_FACADE = 0;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_EDIT_UTILS_FACADE_FEATURE_COUNT = 0;

		/**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_EDIT_UTILS_FACADE___GET_TEXT__OBJECT = 0;

		/**
	 * The operation id for the '<em>Remove Child Descriptor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_EDIT_UTILS_FACADE___REMOVE_CHILD_DESCRIPTOR__COLLECTION_OBJECT = 1;

		/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_EMF_EDIT_UTILS_FACADE_OPERATION_COUNT = 2;

		/**
	 * The meta object id for the '<em>Collection Object</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsPackageImpl#getCollectionObject()
	 * @generated
	 */
  int COLLECTION_OBJECT = 1;

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade
	 * @generated
	 */
	EClass getApogyCommonEMFEditUtilsFacade();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade#getText(java.lang.Object) <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade#getText(java.lang.Object)
	 * @generated
	 */
	EOperation getApogyCommonEMFEditUtilsFacade__GetText__Object();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade#removeChildDescriptor(java.util.Collection, java.lang.Object) <em>Remove Child Descriptor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Child Descriptor</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade#removeChildDescriptor(java.util.Collection, java.lang.Object)
	 * @generated
	 */
	EOperation getApogyCommonEMFEditUtilsFacade__RemoveChildDescriptor__Collection_Object();

		/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection Object</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection Object</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection<java.lang.Object>"
	 * @generated
	 */
  EDataType getCollectionObject();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonEMFEditUtilsFactory getApogyCommonEMFEditUtilsFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsPackageImpl#getApogyCommonEMFEditUtilsFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_EMF_EDIT_UTILS_FACADE = eINSTANCE.getApogyCommonEMFEditUtilsFacade();

			/**
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_EDIT_UTILS_FACADE___GET_TEXT__OBJECT = eINSTANCE.getApogyCommonEMFEditUtilsFacade__GetText__Object();

			/**
		 * The meta object literal for the '<em><b>Remove Child Descriptor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_EMF_EDIT_UTILS_FACADE___REMOVE_CHILD_DESCRIPTOR__COLLECTION_OBJECT = eINSTANCE.getApogyCommonEMFEditUtilsFacade__RemoveChildDescriptor__Collection_Object();

				/**
		 * The meta object literal for the '<em>Collection Object</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsPackageImpl#getCollectionObject()
		 * @generated
		 */
    EDataType COLLECTION_OBJECT = eINSTANCE.getCollectionObject();

  }

} //ApogyCommonEMFEditUtilsPackage
