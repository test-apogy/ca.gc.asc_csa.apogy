/**
 */
package org.eclipse.symphony.common.emf.edit.utils.impl;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFacade;
import org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsFactory;
import org.eclipse.symphony.common.emf.edit.utils.EMFEcoreEditUtilsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreEditUtilsFactoryImpl extends EFactoryImpl implements EMFEcoreEditUtilsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EMFEcoreEditUtilsFactory init()
  {
		try {
			EMFEcoreEditUtilsFactory theEMFEcoreEditUtilsFactory = (EMFEcoreEditUtilsFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreEditUtilsPackage.eNS_URI);
			if (theEMFEcoreEditUtilsFactory != null) {
				return theEMFEcoreEditUtilsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreEditUtilsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreEditUtilsFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case EMFEcoreEditUtilsPackage.EMF_ECORE_EDIT_UTILS_FACADE: return createEMFEcoreEditUtilsFacade();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case EMFEcoreEditUtilsPackage.COLLECTION_OBJECT:
				return createCollectionObjectFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case EMFEcoreEditUtilsPackage.COLLECTION_OBJECT:
				return convertCollectionObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreEditUtilsFacade createEMFEcoreEditUtilsFacade()
  {
		EMFEcoreEditUtilsFacadeImpl emfEcoreEditUtilsFacade = new EMFEcoreEditUtilsFacadeImpl();
		return emfEcoreEditUtilsFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  public Collection<Object> createCollectionObjectFromString(EDataType eDataType, String initialValue)
  {
		return (Collection<Object>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertCollectionObjectToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreEditUtilsPackage getEMFEcoreEditUtilsPackage()
  {
		return (EMFEcoreEditUtilsPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EMFEcoreEditUtilsPackage getPackage()
  {
		return EMFEcoreEditUtilsPackage.eINSTANCE;
	}

} //EMFEcoreEditUtilsFactoryImpl
