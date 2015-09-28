/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.edit.utils;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.impl.EMFEcoreEditUtilsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.EMFEcoreEditUtilsPackage#getEMFEcoreEditUtilsFacade()
 * @model
 * @generated
 */
public interface EMFEcoreEditUtilsFacade extends EObject
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" objectUnique="false"
	 * @generated
	 */
  String getText(Object object);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model newChildDescriptorsDataType="ca.gc.asc_csa.eclipse.emf.ecore.edit.utils.CollectionObject" newChildDescriptorsUnique="false" featureUnique="false"
	 * @generated
	 */
  void removeChildDescriptor(Collection<Object> newChildDescriptors, Object feature);

  public static EMFEcoreEditUtilsFacade INSTANCE = EMFEcoreEditUtilsFacadeImpl.getInstance();
} // EMFEcoreEditUtilsFacade
