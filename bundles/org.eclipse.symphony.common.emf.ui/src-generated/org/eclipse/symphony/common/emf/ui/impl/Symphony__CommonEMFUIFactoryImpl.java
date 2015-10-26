/**
 */
package org.eclipse.symphony.common.emf.ui.impl;

import javax.measure.unit.Unit;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Color;
import org.eclipse.symphony.common.emf.ui.EMFEcoreUIFacade;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIFactory;
import org.eclipse.symphony.common.emf.ui.Symphony__CommonEMFUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonEMFUIFactoryImpl extends EFactoryImpl implements Symphony__CommonEMFUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__CommonEMFUIFactory init()
  {
		try {
			Symphony__CommonEMFUIFactory theSymphony__CommonEMFUIFactory = (Symphony__CommonEMFUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonEMFUIPackage.eNS_URI);
			if (theSymphony__CommonEMFUIFactory != null) {
				return theSymphony__CommonEMFUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonEMFUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CommonEMFUIFactoryImpl()
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
			case Symphony__CommonEMFUIPackage.EMF_ECORE_UI_FACADE: return createEMFEcoreUIFacade();
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
			case Symphony__CommonEMFUIPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case Symphony__CommonEMFUIPackage.UNIT:
				return createUnitFromString(eDataType, initialValue);
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
			case Symphony__CommonEMFUIPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case Symphony__CommonEMFUIPackage.UNIT:
				return convertUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreUIFacade createEMFEcoreUIFacade()
  {
		EMFEcoreUIFacadeImpl emfEcoreUIFacade = new EMFEcoreUIFacadeImpl();
		return emfEcoreUIFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
		return (Color)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
		public Unit<?> createUnitFromString(EDataType eDataType, String initialValue)
  {
		return (Unit<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertUnitToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonEMFUIPackage getSymphony__CommonEMFUIPackage() {
		return (Symphony__CommonEMFUIPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__CommonEMFUIPackage getPackage()
  {
		return Symphony__CommonEMFUIPackage.eINSTANCE;
	}

} //Symphony__CommonEMFUIFactoryImpl
