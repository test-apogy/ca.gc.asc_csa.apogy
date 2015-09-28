/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.impl;

import java.awt.Point;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.BooleanDisplay;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.DisplayFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.EMFEcoreInvocatorDisplayPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.NumberVersusTimeHistoryData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.NumberVsTimePlotDisplay;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.TextDisplay;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorDisplayFactoryImpl extends EFactoryImpl implements EMFEcoreInvocatorDisplayFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EMFEcoreInvocatorDisplayFactory init()
  {
		try {
			EMFEcoreInvocatorDisplayFactory theEMFEcoreInvocatorDisplayFactory = (EMFEcoreInvocatorDisplayFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreInvocatorDisplayPackage.eNS_URI);
			if (theEMFEcoreInvocatorDisplayFactory != null) {
				return theEMFEcoreInvocatorDisplayFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreInvocatorDisplayFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorDisplayFactoryImpl()
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
			case EMFEcoreInvocatorDisplayPackage.TEXT_DISPLAY: return createTextDisplay();
			case EMFEcoreInvocatorDisplayPackage.BOOLEAN_DISPLAY: return createBooleanDisplay();
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VERSUS_TIME_HISTORY_DATA: return createNumberVersusTimeHistoryData();
			case EMFEcoreInvocatorDisplayPackage.NUMBER_VS_TIME_PLOT_DISPLAY: return createNumberVsTimePlotDisplay();
			case EMFEcoreInvocatorDisplayPackage.DISPLAY_FACADE: return createDisplayFacade();
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
			case EMFEcoreInvocatorDisplayPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.CONTROL:
				return createControlFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.POINT:
				return createPointFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.COMPOSITE:
				return createCompositeFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.DATA_BINDING_CONTEXT:
				return createDataBindingContextFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.EDITING_DOMAIN:
				return createEditingDomainFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.IOBSERVABLE_VALUE:
				return createIObservableValueFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.LONG:
				return createLongFromString(eDataType, initialValue);
			case EMFEcoreInvocatorDisplayPackage.SORTED_MAP:
				return createSortedMapFromString(eDataType, initialValue);
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
			case EMFEcoreInvocatorDisplayPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.CONTROL:
				return convertControlToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.POINT:
				return convertPointToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.COMPOSITE:
				return convertCompositeToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.DATA_BINDING_CONTEXT:
				return convertDataBindingContextToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.EDITING_DOMAIN:
				return convertEditingDomainToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.IOBSERVABLE_VALUE:
				return convertIObservableValueToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.LONG:
				return convertLongToString(eDataType, instanceValue);
			case EMFEcoreInvocatorDisplayPackage.SORTED_MAP:
				return convertSortedMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TextDisplay createTextDisplay()
  {
		TextDisplayImpl textDisplay = new TextDisplayImpl();
		return textDisplay;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BooleanDisplay createBooleanDisplay()
  {
		BooleanDisplayImpl booleanDisplay = new BooleanDisplayImpl();
		return booleanDisplay;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NumberVersusTimeHistoryData createNumberVersusTimeHistoryData()
  {
		NumberVersusTimeHistoryDataImpl numberVersusTimeHistoryData = new NumberVersusTimeHistoryDataImpl();
		return numberVersusTimeHistoryData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NumberVsTimePlotDisplay createNumberVsTimePlotDisplay()
  {
		NumberVsTimePlotDisplayImpl numberVsTimePlotDisplay = new NumberVsTimePlotDisplayImpl();
		return numberVsTimePlotDisplay;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DisplayFacade createDisplayFacade()
  {
		DisplayFacadeImpl displayFacade = new DisplayFacadeImpl();
		return displayFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<?> createListFromString(EDataType eDataType, String initialValue)
  {
		return (List<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertListToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
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
  public Control createControlFromString(EDataType eDataType, String initialValue)
  {
		return (Control)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertControlToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Point createPointFromString(EDataType eDataType, String initialValue)
  {
		return (Point)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPointToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Composite createCompositeFromString(EDataType eDataType, String initialValue)
  {
		return (Composite)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertCompositeToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataBindingContext createDataBindingContextFromString(EDataType eDataType, String initialValue)
  {
		return (DataBindingContext)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDataBindingContextToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EditingDomain createEditingDomainFromString(EDataType eDataType, String initialValue)
  {
		return (EditingDomain)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertEditingDomainToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IObservableValue createIObservableValueFromString(EDataType eDataType, String initialValue)
  {
		return (IObservableValue)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertIObservableValueToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Number createNumberFromString(EDataType eDataType, String initialValue)
  {
		return (Number)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertNumberToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Long createLongFromString(EDataType eDataType, String initialValue)
  {
		return (Long)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertLongToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedMap<?, ?> createSortedMapFromString(EDataType eDataType, String initialValue)
  {
		return (SortedMap<?, ?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedMapToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorDisplayPackage getEMFEcoreInvocatorDisplayPackage()
  {
		return (EMFEcoreInvocatorDisplayPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EMFEcoreInvocatorDisplayPackage getPackage()
  {
		return EMFEcoreInvocatorDisplayPackage.eINSTANCE;
	}

} //EMFEcoreInvocatorDisplayFactoryImpl
