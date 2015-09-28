/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore.ui.impl;

import javax.measure.unit.Unit;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Color;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreUIFactoryImpl extends EFactoryImpl implements EMFEcoreUIFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EMFEcoreUIFactory init()
  {
		try {
			EMFEcoreUIFactory theEMFEcoreUIFactory = (EMFEcoreUIFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreUIPackage.eNS_URI);
			if (theEMFEcoreUIFactory != null) {
				return theEMFEcoreUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreUIFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreUIFactoryImpl()
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
			case EMFEcoreUIPackage.EMF_ECORE_UI_FACADE: return createEMFEcoreUIFacade();
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
			case EMFEcoreUIPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case EMFEcoreUIPackage.UNIT:
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
			case EMFEcoreUIPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case EMFEcoreUIPackage.UNIT:
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
  public Unit createUnitFromString(EDataType eDataType, String initialValue)
  {
		return (Unit)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertUnitToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreUIPackage getEMFEcoreUIPackage()
  {
		return (EMFEcoreUIPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EMFEcoreUIPackage getPackage()
  {
		return EMFEcoreUIPackage.eINSTANCE;
	}

} //EMFEcoreUIFactoryImpl
