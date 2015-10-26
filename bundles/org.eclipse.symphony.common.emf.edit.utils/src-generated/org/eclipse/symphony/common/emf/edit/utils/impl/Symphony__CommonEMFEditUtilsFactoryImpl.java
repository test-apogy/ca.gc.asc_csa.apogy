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
import org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsFactory;
import org.eclipse.symphony.common.emf.edit.utils.Symphony__CommonEMFEditUtilsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonEMFEditUtilsFactoryImpl extends EFactoryImpl implements Symphony__CommonEMFEditUtilsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__CommonEMFEditUtilsFactory init()
  {
		try {
			Symphony__CommonEMFEditUtilsFactory theSymphony__CommonEMFEditUtilsFactory = (Symphony__CommonEMFEditUtilsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonEMFEditUtilsPackage.eNS_URI);
			if (theSymphony__CommonEMFEditUtilsFactory != null) {
				return theSymphony__CommonEMFEditUtilsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonEMFEditUtilsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CommonEMFEditUtilsFactoryImpl()
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
			case Symphony__CommonEMFEditUtilsPackage.EMF_ECORE_EDIT_UTILS_FACADE: return createEMFEcoreEditUtilsFacade();
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
			case Symphony__CommonEMFEditUtilsPackage.COLLECTION_OBJECT:
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
			case Symphony__CommonEMFEditUtilsPackage.COLLECTION_OBJECT:
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
	public Symphony__CommonEMFEditUtilsPackage getSymphony__CommonEMFEditUtilsPackage() {
		return (Symphony__CommonEMFEditUtilsPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__CommonEMFEditUtilsPackage getPackage()
  {
		return Symphony__CommonEMFEditUtilsPackage.eINSTANCE;
	}

} //Symphony__CommonEMFEditUtilsFactoryImpl
