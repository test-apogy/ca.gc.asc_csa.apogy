/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.display.impl;

import java.awt.Point;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.AbstractPlotDisplay;
import org.eclipse.symphony.core.display.BooleanDisplay;
import org.eclipse.symphony.core.display.DisplayFacade;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayFactory;
import org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage;
import org.eclipse.symphony.core.display.HistoryData;
import org.eclipse.symphony.core.display.HistoryDataHandler;
import org.eclipse.symphony.core.display.NumberVersusTimeHistoryData;
import org.eclipse.symphony.core.display.NumberVsTimePlotDisplay;
import org.eclipse.symphony.core.display.TextDisplay;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorDisplayPackageImpl extends EPackageImpl implements EMFEcoreInvocatorDisplayPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractFeatureDisplayEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass textDisplayEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass booleanDisplayEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass historyDataHandlerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass historyDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass numberVersusTimeHistoryDataEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractPlotDisplayEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass numberVsTimePlotDisplayEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass displayFacadeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType listEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType sortedSetEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType colorEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType controlEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType pointEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType compositeEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType dataBindingContextEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType editingDomainEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType iObservableValueEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType numberEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType longEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType sortedMapEDataType = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.core.display.EMFEcoreInvocatorDisplayPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreInvocatorDisplayPackageImpl()
  {
		super(eNS_URI, EMFEcoreInvocatorDisplayFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EMFEcoreInvocatorDisplayPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreInvocatorDisplayPackage init()
  {
		if (isInited) return (EMFEcoreInvocatorDisplayPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorDisplayPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreInvocatorDisplayPackageImpl theEMFEcoreInvocatorDisplayPackage = (EMFEcoreInvocatorDisplayPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreInvocatorDisplayPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreInvocatorDisplayPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFEcoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreInvocatorDisplayPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreInvocatorDisplayPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreInvocatorDisplayPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreInvocatorDisplayPackage.eNS_URI, theEMFEcoreInvocatorDisplayPackage);
		return theEMFEcoreInvocatorDisplayPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractFeatureDisplay()
  {
		return abstractFeatureDisplayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractFeatureDisplay_AbstractFeatureNode()
  {
		return (EReference)abstractFeatureDisplayEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractFeatureDisplay_MinimumWidth()
  {
		return (EAttribute)abstractFeatureDisplayEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractFeatureDisplay_MinimumHeight()
  {
		return (EAttribute)abstractFeatureDisplayEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractFeatureDisplay__CreateControl__Composite()
  {
		return abstractFeatureDisplayEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractFeatureDisplay__GetControlMinimumSize__Control()
  {
		return abstractFeatureDisplayEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractFeatureDisplay__BindControl__Control()
  {
		return abstractFeatureDisplayEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractFeatureDisplay__UpdateRange__Control_Ranges()
  {
		return abstractFeatureDisplayEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAbstractFeatureDisplay__UpdateResolved__Control_boolean()
  {
		return abstractFeatureDisplayEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTextDisplay()
  {
		return textDisplayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTextDisplay_DecimalFormat()
  {
		return (EAttribute)textDisplayEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBooleanDisplay()
  {
		return booleanDisplayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getHistoryDataHandler()
  {
		return historyDataHandlerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getHistoryDataHandler__GetHistoryData__Control()
  {
		return historyDataHandlerEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getHistoryDataHandler__ApplyHistoryData__Control_HistoryData()
  {
		return historyDataHandlerEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getHistoryData()
  {
		return historyDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNumberVersusTimeHistoryData()
  {
		return numberVersusTimeHistoryDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNumberVersusTimeHistoryData_HistoryData()
  {
		return (EAttribute)numberVersusTimeHistoryDataEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractPlotDisplay()
  {
		return abstractPlotDisplayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractPlotDisplay_RepeatLastValue()
  {
		return (EAttribute)abstractPlotDisplayEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractPlotDisplay_UseDataBuffering()
  {
		return (EAttribute)abstractPlotDisplayEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAbstractPlotDisplay_HistoryLength()
  {
		return (EAttribute)abstractPlotDisplayEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNumberVsTimePlotDisplay()
  {
		return numberVsTimePlotDisplayEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDisplayFacade()
  {
		return displayFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getDisplayFacade__GetDisplayedName__AbstractFeatureDisplay()
  {
		return displayFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getDisplayFacade__GetSource__AbstractFeatureDisplay()
  {
		return displayFacadeEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getDisplayFacade__GetEStructuralFeature__AbstractDisplay()
  {
		return displayFacadeEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getDisplayFacade__GetIObservableValue__AbstractFeatureDisplay_Control()
  {
		return displayFacadeEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getList()
  {
		return listEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedSet()
  {
		return sortedSetEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getColor()
  {
		return colorEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getControl()
  {
		return controlEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint()
  {
		return pointEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getComposite()
  {
		return compositeEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getDataBindingContext()
  {
		return dataBindingContextEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getEditingDomain()
  {
		return editingDomainEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getIObservableValue()
  {
		return iObservableValueEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getNumber()
  {
		return numberEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getLong()
  {
		return longEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedMap()
  {
		return sortedMapEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorDisplayFactory getEMFEcoreInvocatorDisplayFactory()
  {
		return (EMFEcoreInvocatorDisplayFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractFeatureDisplayEClass = createEClass(ABSTRACT_FEATURE_DISPLAY);
		createEReference(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY__ABSTRACT_FEATURE_NODE);
		createEAttribute(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY__MINIMUM_WIDTH);
		createEAttribute(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY__MINIMUM_HEIGHT);
		createEOperation(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY___CREATE_CONTROL__COMPOSITE);
		createEOperation(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY___GET_CONTROL_MINIMUM_SIZE__CONTROL);
		createEOperation(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY___BIND_CONTROL__CONTROL);
		createEOperation(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY___UPDATE_RANGE__CONTROL_RANGES);
		createEOperation(abstractFeatureDisplayEClass, ABSTRACT_FEATURE_DISPLAY___UPDATE_RESOLVED__CONTROL_BOOLEAN);

		textDisplayEClass = createEClass(TEXT_DISPLAY);
		createEAttribute(textDisplayEClass, TEXT_DISPLAY__DECIMAL_FORMAT);

		booleanDisplayEClass = createEClass(BOOLEAN_DISPLAY);

		historyDataHandlerEClass = createEClass(HISTORY_DATA_HANDLER);
		createEOperation(historyDataHandlerEClass, HISTORY_DATA_HANDLER___GET_HISTORY_DATA__CONTROL);
		createEOperation(historyDataHandlerEClass, HISTORY_DATA_HANDLER___APPLY_HISTORY_DATA__CONTROL_HISTORYDATA);

		historyDataEClass = createEClass(HISTORY_DATA);

		numberVersusTimeHistoryDataEClass = createEClass(NUMBER_VERSUS_TIME_HISTORY_DATA);
		createEAttribute(numberVersusTimeHistoryDataEClass, NUMBER_VERSUS_TIME_HISTORY_DATA__HISTORY_DATA);

		abstractPlotDisplayEClass = createEClass(ABSTRACT_PLOT_DISPLAY);
		createEAttribute(abstractPlotDisplayEClass, ABSTRACT_PLOT_DISPLAY__REPEAT_LAST_VALUE);
		createEAttribute(abstractPlotDisplayEClass, ABSTRACT_PLOT_DISPLAY__USE_DATA_BUFFERING);
		createEAttribute(abstractPlotDisplayEClass, ABSTRACT_PLOT_DISPLAY__HISTORY_LENGTH);

		numberVsTimePlotDisplayEClass = createEClass(NUMBER_VS_TIME_PLOT_DISPLAY);

		displayFacadeEClass = createEClass(DISPLAY_FACADE);
		createEOperation(displayFacadeEClass, DISPLAY_FACADE___GET_DISPLAYED_NAME__ABSTRACTFEATUREDISPLAY);
		createEOperation(displayFacadeEClass, DISPLAY_FACADE___GET_SOURCE__ABSTRACTFEATUREDISPLAY);
		createEOperation(displayFacadeEClass, DISPLAY_FACADE___GET_ESTRUCTURAL_FEATURE__ABSTRACTDISPLAY);
		createEOperation(displayFacadeEClass, DISPLAY_FACADE___GET_IOBSERVABLE_VALUE__ABSTRACTFEATUREDISPLAY_CONTROL);

		// Create data types
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
		colorEDataType = createEDataType(COLOR);
		controlEDataType = createEDataType(CONTROL);
		pointEDataType = createEDataType(POINT);
		compositeEDataType = createEDataType(COMPOSITE);
		dataBindingContextEDataType = createEDataType(DATA_BINDING_CONTEXT);
		editingDomainEDataType = createEDataType(EDITING_DOMAIN);
		iObservableValueEDataType = createEDataType(IOBSERVABLE_VALUE);
		numberEDataType = createEDataType(NUMBER);
		longEDataType = createEDataType(LONG);
		sortedMapEDataType = createEDataType(SORTED_MAP);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");
		addETypeParameter(sortedMapEDataType, "K");
		addETypeParameter(sortedMapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractFeatureDisplayEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractDisplay());
		textDisplayEClass.getESuperTypes().add(this.getAbstractFeatureDisplay());
		booleanDisplayEClass.getESuperTypes().add(this.getAbstractFeatureDisplay());
		numberVersusTimeHistoryDataEClass.getESuperTypes().add(this.getHistoryData());
		abstractPlotDisplayEClass.getESuperTypes().add(this.getAbstractFeatureDisplay());
		abstractPlotDisplayEClass.getESuperTypes().add(this.getHistoryDataHandler());
		numberVsTimePlotDisplayEClass.getESuperTypes().add(this.getAbstractPlotDisplay());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractFeatureDisplayEClass, AbstractFeatureDisplay.class, "AbstractFeatureDisplay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractFeatureDisplay_AbstractFeatureNode(), theEMFEcorePackage.getAbstractFeatureNode(), null, "abstractFeatureNode", null, 1, 1, AbstractFeatureDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeatureDisplay_MinimumWidth(), theEcorePackage.getEInt(), "minimumWidth", "-1", 0, 1, AbstractFeatureDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractFeatureDisplay_MinimumHeight(), theEcorePackage.getEInt(), "minimumHeight", "-1", 0, 1, AbstractFeatureDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAbstractFeatureDisplay__CreateControl__Composite(), this.getControl(), "createControl", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getComposite(), "parent", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractFeatureDisplay__GetControlMinimumSize__Control(), this.getPoint(), "getControlMinimumSize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getControl(), "control", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractFeatureDisplay__BindControl__Control(), this.getDataBindingContext(), "bindControl", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getControl(), "control", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractFeatureDisplay__UpdateRange__Control_Ranges(), null, "updateRange", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getControl(), "control", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcorePackage.getRanges(), "range", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractFeatureDisplay__UpdateResolved__Control_boolean(), null, "updateResolved", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getControl(), "control", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "resolved", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(textDisplayEClass, TextDisplay.class, "TextDisplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextDisplay_DecimalFormat(), theEcorePackage.getEString(), "decimalFormat", "0.000", 0, 1, TextDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanDisplayEClass, BooleanDisplay.class, "BooleanDisplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(historyDataHandlerEClass, HistoryDataHandler.class, "HistoryDataHandler", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getHistoryDataHandler__GetHistoryData__Control(), this.getHistoryData(), "getHistoryData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getControl(), "control", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getHistoryDataHandler__ApplyHistoryData__Control_HistoryData(), null, "applyHistoryData", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getControl(), "control", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHistoryData(), "historyData", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(historyDataEClass, HistoryData.class, "HistoryData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberVersusTimeHistoryDataEClass, NumberVersusTimeHistoryData.class, "NumberVersusTimeHistoryData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(this.getSortedMap());
		EGenericType g2 = createEGenericType(this.getLong());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getNumber());
		g1.getETypeArguments().add(g2);
		initEAttribute(getNumberVersusTimeHistoryData_HistoryData(), g1, "historyData", null, 1, 1, NumberVersusTimeHistoryData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPlotDisplayEClass, AbstractPlotDisplay.class, "AbstractPlotDisplay", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPlotDisplay_RepeatLastValue(), theEcorePackage.getEBoolean(), "repeatLastValue", "true", 0, 1, AbstractPlotDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPlotDisplay_UseDataBuffering(), theEcorePackage.getEBoolean(), "useDataBuffering", "true", 0, 1, AbstractPlotDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPlotDisplay_HistoryLength(), theEcorePackage.getEDouble(), "historyLength", "60.0", 0, 1, AbstractPlotDisplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberVsTimePlotDisplayEClass, NumberVsTimePlotDisplay.class, "NumberVsTimePlotDisplay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(displayFacadeEClass, DisplayFacade.class, "DisplayFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDisplayFacade__GetDisplayedName__AbstractFeatureDisplay(), theEcorePackage.getEString(), "getDisplayedName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureDisplay(), "abstractFeatureDisplay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDisplayFacade__GetSource__AbstractFeatureDisplay(), theEcorePackage.getEObject(), "getSource", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureDisplay(), "abstractFeatureDisplay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDisplayFacade__GetEStructuralFeature__AbstractDisplay(), theEcorePackage.getEStructuralFeature(), "getEStructuralFeature", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getAbstractDisplay(), "abstractDisplay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDisplayFacade__GetIObservableValue__AbstractFeatureDisplay_Control(), this.getIObservableValue(), "getIObservableValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractFeatureDisplay(), "abstractFeatureDisplay", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getControl(), "control", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(controlEDataType, Control.class, "Control", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointEDataType, Point.class, "Point", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(compositeEDataType, Composite.class, "Composite", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dataBindingContextEDataType, DataBindingContext.class, "DataBindingContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(editingDomainEDataType, EditingDomain.class, "EditingDomain", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iObservableValueEDataType, IObservableValue.class, "IObservableValue", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberEDataType, Number.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(longEDataType, Long.class, "Long", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedMapEDataType, SortedMap.class, "SortedMap", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EMFEcoreInvocatorDisplayPackageImpl
