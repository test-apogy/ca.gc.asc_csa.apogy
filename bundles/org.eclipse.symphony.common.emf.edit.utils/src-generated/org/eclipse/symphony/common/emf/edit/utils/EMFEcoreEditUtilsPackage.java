/**
 */
package org.eclipse.symphony.common.emf.edit.utils;

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
 * @see org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreEditUtils' childCreationExtenders='true' modelName='EMFEcoreEditUtils' modelDirectory='/org.eclipse.symphony.common.emf.edit.utils/src-generated' basePackage='ca.gc.asc_csa.eclipse.emf.ecore.edit'"
 * @generated
 */
public interface EMFEcoreEditUtilsPackage extends EPackage
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
  String eNS_URI = "org.eclipse.symphony.common.emf.edit.utils";

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
  EMFEcoreEditUtilsPackage eINSTANCE = org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsFacadeImpl
	 * @see org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsPackageImpl#getEMFEcoreEditUtilsFacade()
	 * @generated
	 */
  int EMF_ECORE_EDIT_UTILS_FACADE = 0;

  /**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_EDIT_UTILS_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get Text</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_EDIT_UTILS_FACADE___GET_TEXT__OBJECT = 0;

  /**
	 * The operation id for the '<em>Remove Child Descriptor</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_EDIT_UTILS_FACADE___REMOVE_CHILD_DESCRIPTOR__COLLECTION_OBJECT = 1;

  /**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_EDIT_UTILS_FACADE_OPERATION_COUNT = 2;


  /**
	 * The meta object id for the '<em>Collection Object</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsPackageImpl#getCollectionObject()
	 * @generated
	 */
  int COLLECTION_OBJECT = 1;

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade
	 * @generated
	 */
  EClass getEMFEcoreEditUtilsFacade();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade#getText(java.lang.Object) <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Text</em>' operation.
	 * @see org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade#getText(java.lang.Object)
	 * @generated
	 */
  EOperation getEMFEcoreEditUtilsFacade__GetText__Object();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade#removeChildDescriptor(java.util.Collection, java.lang.Object) <em>Remove Child Descriptor</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Child Descriptor</em>' operation.
	 * @see org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade#removeChildDescriptor(java.util.Collection, java.lang.Object)
	 * @generated
	 */
  EOperation getEMFEcoreEditUtilsFacade__RemoveChildDescriptor__Collection_Object();

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
  EMFEcoreEditUtilsFactory getEMFEcoreEditUtilsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsFacadeImpl
		 * @see org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsPackageImpl#getEMFEcoreEditUtilsFacade()
		 * @generated
		 */
    EClass EMF_ECORE_EDIT_UTILS_FACADE = eINSTANCE.getEMFEcoreEditUtilsFacade();

    /**
		 * The meta object literal for the '<em><b>Get Text</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_EDIT_UTILS_FACADE___GET_TEXT__OBJECT = eINSTANCE.getEMFEcoreEditUtilsFacade__GetText__Object();

    /**
		 * The meta object literal for the '<em><b>Remove Child Descriptor</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_EDIT_UTILS_FACADE___REMOVE_CHILD_DESCRIPTOR__COLLECTION_OBJECT = eINSTANCE.getEMFEcoreEditUtilsFacade__RemoveChildDescriptor__Collection_Object();

    /**
		 * The meta object literal for the '<em>Collection Object</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.symphony.common.emf.edit.utils.impl.EMFEcoreEditUtilsPackageImpl#getCollectionObject()
		 * @generated
		 */
    EDataType COLLECTION_OBJECT = eINSTANCE.getCollectionObject();

  }

} //EMFEcoreEditUtilsPackage
