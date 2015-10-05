/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.CenteredLinearInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.CenteredParabolicInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerTrigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllersConfiguration;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.CustomInputConditioningPoint;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EdgeType;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.FixedValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.LinearInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.TimeTrigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ToggleValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.Trigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.UserDefinedInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ValueSource;
import ca.gc.asc_csa.jinput.JInputPackage;
import java.util.List;
import java.util.TreeSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreControllersPackageImpl extends EPackageImpl implements EMFEcoreControllersPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controllerFacadeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controllersConfigurationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass operationCallControllerBindingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass triggerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass timeTriggerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controllerTriggerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controllerEdgeTriggerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controllerStateTriggerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass bindedEDataTypeArgumentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass valueSourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass fixedValueSourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass toggleValueSourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass controllerValueSourceEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInputConditioningEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearInputConditioningEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centeredLinearInputConditioningEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parabolicInputConditioningEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centeredParabolicInputConditioningEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDefinedInputConditioningEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customInputConditioningPointEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum edgeTypeEEnum = null;

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
	private EDataType treeSetEDataType = null;

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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreControllersPackageImpl()
  {
		super(eNS_URI, EMFEcoreControllersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreControllersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreControllersPackage init()
  {
		if (isInited) return (EMFEcoreControllersPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreControllersPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreControllersPackageImpl theEMFEcoreControllersPackage = (EMFEcoreControllersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreControllersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreControllersPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFEcoreInvocatorPackage.eINSTANCE.eClass();
		JInputPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreControllersPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreControllersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreControllersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreControllersPackage.eNS_URI, theEMFEcoreControllersPackage);
		return theEMFEcoreControllersPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControllerFacade()
  {
		return controllerFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getControllerFacade__CreateValue__EParameter_float()
  {
		return controllerFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerFacade__SortCustomInputConditioningPoint__List() {
		return controllerFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControllerFacade__CreateCustomInputConditioningPoint__double_double() {
		return controllerFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControllersConfiguration()
  {
		return controllersConfigurationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControllersConfiguration_Active()
  {
		return (EAttribute)controllersConfigurationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getOperationCallControllerBinding()
  {
		return operationCallControllerBindingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationCallControllerBinding_CreateResult() {
		return (EAttribute)operationCallControllerBindingEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getOperationCallControllerBinding_Active()
  {
		return (EAttribute)operationCallControllerBindingEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getOperationCallControllerBinding_Trigger()
  {
		return (EReference)operationCallControllerBindingEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getOperationCallControllerBinding__Update()
  {
		return operationCallControllerBindingEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTrigger()
  {
		return triggerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getTrigger_OperationCallControllerBinding()
  {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTimeTrigger()
  {
		return timeTriggerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTimeTrigger_RefreshPeriod()
  {
		return (EAttribute)timeTriggerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControllerTrigger()
  {
		return controllerTriggerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControllerTrigger_ComponentQualifier()
  {
		return (EReference)controllerTriggerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControllerEdgeTrigger()
  {
		return controllerEdgeTriggerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControllerEdgeTrigger_EdgeType()
  {
		return (EAttribute)controllerEdgeTriggerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControllerStateTrigger()
  {
		return controllerStateTriggerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControllerStateTrigger_EnablingValue()
  {
		return (EAttribute)controllerStateTriggerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControllerStateTrigger_RepeatPeriod()
  {
		return (EAttribute)controllerStateTriggerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getBindedEDataTypeArgument()
  {
		return bindedEDataTypeArgumentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getBindedEDataTypeArgument_ValueSource()
  {
		return (EReference)bindedEDataTypeArgumentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getValueSource()
  {
		return valueSourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getValueSource_BindedEDataTypeArgument()
  {
		return (EReference)valueSourceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getValueSource__GetSourceValue()
  {
		return valueSourceEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getFixedValueSource()
  {
		return fixedValueSourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getToggleValueSource()
  {
		return toggleValueSourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getToggleValueSource_InitialValue()
  {
		return (EAttribute)toggleValueSourceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getToggleValueSource_CurrentValue()
  {
		return (EAttribute)toggleValueSourceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getControllerValueSource()
  {
		return controllerValueSourceEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControllerValueSource_Component()
  {
		return (EReference)controllerValueSourceEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControllerValueSource_EComponentQualifier()
  {
		return (EReference)controllerValueSourceEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getControllerValueSource_Conditioning()
  {
		return (EReference)controllerValueSourceEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getControllerValueSource_LastValue()
  {
		return (EAttribute)controllerValueSourceEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInputConditioning() {
		return abstractInputConditioningEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractInputConditioning__ConditionInput__EComponent() {
		return abstractInputConditioningEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearInputConditioning() {
		return linearInputConditioningEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearInputConditioning_Minimum() {
		return (EAttribute)linearInputConditioningEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearInputConditioning_Maximum() {
		return (EAttribute)linearInputConditioningEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCenteredLinearInputConditioning() {
		return centeredLinearInputConditioningEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCenteredLinearInputConditioning_DeadBand() {
		return (EAttribute)centeredLinearInputConditioningEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParabolicInputConditioning() {
		return parabolicInputConditioningEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParabolicInputConditioning_Minimum() {
		return (EAttribute)parabolicInputConditioningEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParabolicInputConditioning_Maximum() {
		return (EAttribute)parabolicInputConditioningEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCenteredParabolicInputConditioning() {
		return centeredParabolicInputConditioningEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCenteredParabolicInputConditioning_DeadBand() {
		return (EAttribute)centeredParabolicInputConditioningEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserDefinedInputConditioning() {
		return userDefinedInputConditioningEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserDefinedInputConditioning_Units() {
		return (EAttribute)userDefinedInputConditioningEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserDefinedInputConditioning_TransferFunction() {
		return (EReference)userDefinedInputConditioningEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomInputConditioningPoint() {
		return customInputConditioningPointEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomInputConditioningPoint_InputValue() {
		return (EAttribute)customInputConditioningPointEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomInputConditioningPoint_OutputValue() {
		return (EAttribute)customInputConditioningPointEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getEdgeType()
  {
		return edgeTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTreeSet() {
		return treeSetEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreControllersFactory getEMFEcoreControllersFactory()
  {
		return (EMFEcoreControllersFactory)getEFactoryInstance();
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
		controllerFacadeEClass = createEClass(CONTROLLER_FACADE);
		createEOperation(controllerFacadeEClass, CONTROLLER_FACADE___CREATE_VALUE__EPARAMETER_FLOAT);
		createEOperation(controllerFacadeEClass, CONTROLLER_FACADE___SORT_CUSTOM_INPUT_CONDITIONING_POINT__LIST);
		createEOperation(controllerFacadeEClass, CONTROLLER_FACADE___CREATE_CUSTOM_INPUT_CONDITIONING_POINT__DOUBLE_DOUBLE);

		controllersConfigurationEClass = createEClass(CONTROLLERS_CONFIGURATION);
		createEAttribute(controllersConfigurationEClass, CONTROLLERS_CONFIGURATION__ACTIVE);

		operationCallControllerBindingEClass = createEClass(OPERATION_CALL_CONTROLLER_BINDING);
		createEAttribute(operationCallControllerBindingEClass, OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT);
		createEAttribute(operationCallControllerBindingEClass, OPERATION_CALL_CONTROLLER_BINDING__ACTIVE);
		createEReference(operationCallControllerBindingEClass, OPERATION_CALL_CONTROLLER_BINDING__TRIGGER);
		createEOperation(operationCallControllerBindingEClass, OPERATION_CALL_CONTROLLER_BINDING___UPDATE);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__OPERATION_CALL_CONTROLLER_BINDING);

		timeTriggerEClass = createEClass(TIME_TRIGGER);
		createEAttribute(timeTriggerEClass, TIME_TRIGGER__REFRESH_PERIOD);

		controllerTriggerEClass = createEClass(CONTROLLER_TRIGGER);
		createEReference(controllerTriggerEClass, CONTROLLER_TRIGGER__COMPONENT_QUALIFIER);

		controllerEdgeTriggerEClass = createEClass(CONTROLLER_EDGE_TRIGGER);
		createEAttribute(controllerEdgeTriggerEClass, CONTROLLER_EDGE_TRIGGER__EDGE_TYPE);

		controllerStateTriggerEClass = createEClass(CONTROLLER_STATE_TRIGGER);
		createEAttribute(controllerStateTriggerEClass, CONTROLLER_STATE_TRIGGER__ENABLING_VALUE);
		createEAttribute(controllerStateTriggerEClass, CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD);

		bindedEDataTypeArgumentEClass = createEClass(BINDED_EDATA_TYPE_ARGUMENT);
		createEReference(bindedEDataTypeArgumentEClass, BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);

		valueSourceEClass = createEClass(VALUE_SOURCE);
		createEReference(valueSourceEClass, VALUE_SOURCE__BINDED_EDATA_TYPE_ARGUMENT);
		createEOperation(valueSourceEClass, VALUE_SOURCE___GET_SOURCE_VALUE);

		fixedValueSourceEClass = createEClass(FIXED_VALUE_SOURCE);

		toggleValueSourceEClass = createEClass(TOGGLE_VALUE_SOURCE);
		createEAttribute(toggleValueSourceEClass, TOGGLE_VALUE_SOURCE__INITIAL_VALUE);
		createEAttribute(toggleValueSourceEClass, TOGGLE_VALUE_SOURCE__CURRENT_VALUE);

		controllerValueSourceEClass = createEClass(CONTROLLER_VALUE_SOURCE);
		createEReference(controllerValueSourceEClass, CONTROLLER_VALUE_SOURCE__COMPONENT);
		createEReference(controllerValueSourceEClass, CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);
		createEReference(controllerValueSourceEClass, CONTROLLER_VALUE_SOURCE__CONDITIONING);
		createEAttribute(controllerValueSourceEClass, CONTROLLER_VALUE_SOURCE__LAST_VALUE);

		abstractInputConditioningEClass = createEClass(ABSTRACT_INPUT_CONDITIONING);
		createEOperation(abstractInputConditioningEClass, ABSTRACT_INPUT_CONDITIONING___CONDITION_INPUT__ECOMPONENT);

		linearInputConditioningEClass = createEClass(LINEAR_INPUT_CONDITIONING);
		createEAttribute(linearInputConditioningEClass, LINEAR_INPUT_CONDITIONING__MINIMUM);
		createEAttribute(linearInputConditioningEClass, LINEAR_INPUT_CONDITIONING__MAXIMUM);

		centeredLinearInputConditioningEClass = createEClass(CENTERED_LINEAR_INPUT_CONDITIONING);
		createEAttribute(centeredLinearInputConditioningEClass, CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND);

		parabolicInputConditioningEClass = createEClass(PARABOLIC_INPUT_CONDITIONING);
		createEAttribute(parabolicInputConditioningEClass, PARABOLIC_INPUT_CONDITIONING__MINIMUM);
		createEAttribute(parabolicInputConditioningEClass, PARABOLIC_INPUT_CONDITIONING__MAXIMUM);

		centeredParabolicInputConditioningEClass = createEClass(CENTERED_PARABOLIC_INPUT_CONDITIONING);
		createEAttribute(centeredParabolicInputConditioningEClass, CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND);

		userDefinedInputConditioningEClass = createEClass(USER_DEFINED_INPUT_CONDITIONING);
		createEAttribute(userDefinedInputConditioningEClass, USER_DEFINED_INPUT_CONDITIONING__UNITS);
		createEReference(userDefinedInputConditioningEClass, USER_DEFINED_INPUT_CONDITIONING__TRANSFER_FUNCTION);

		customInputConditioningPointEClass = createEClass(CUSTOM_INPUT_CONDITIONING_POINT);
		createEAttribute(customInputConditioningPointEClass, CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE);
		createEAttribute(customInputConditioningPointEClass, CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE);

		// Create enums
		edgeTypeEEnum = createEEnum(EDGE_TYPE);

		// Create data types
		listEDataType = createEDataType(LIST);
		treeSetEDataType = createEDataType(TREE_SET);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		JInputPackage theJInputPackage = (JInputPackage)EPackage.Registry.INSTANCE.getEPackage(JInputPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(treeSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		controllersConfigurationEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getProgram());
		controllersConfigurationEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getOperationCallContainer());
		operationCallControllerBindingEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getOperationCall());
		triggerEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		triggerEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		timeTriggerEClass.getESuperTypes().add(this.getTrigger());
		controllerTriggerEClass.getESuperTypes().add(this.getTrigger());
		controllerEdgeTriggerEClass.getESuperTypes().add(this.getControllerTrigger());
		controllerStateTriggerEClass.getESuperTypes().add(this.getControllerTrigger());
		bindedEDataTypeArgumentEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getArgument());
		fixedValueSourceEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getEDataTypeArgument());
		fixedValueSourceEClass.getESuperTypes().add(this.getValueSource());
		toggleValueSourceEClass.getESuperTypes().add(this.getValueSource());
		controllerValueSourceEClass.getESuperTypes().add(this.getValueSource());
		linearInputConditioningEClass.getESuperTypes().add(this.getAbstractInputConditioning());
		centeredLinearInputConditioningEClass.getESuperTypes().add(this.getLinearInputConditioning());
		parabolicInputConditioningEClass.getESuperTypes().add(this.getAbstractInputConditioning());
		centeredParabolicInputConditioningEClass.getESuperTypes().add(this.getParabolicInputConditioning());
		userDefinedInputConditioningEClass.getESuperTypes().add(this.getAbstractInputConditioning());

		// Initialize classes, features, and operations; add parameters
		initEClass(controllerFacadeEClass, ControllerFacade.class, "ControllerFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getControllerFacade__CreateValue__EParameter_float(), theEcorePackage.getEJavaObject(), "createValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEParameter(), "eParameter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "value", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getControllerFacade__SortCustomInputConditioningPoint__List(), null, "sortCustomInputConditioningPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getCustomInputConditioningPoint());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "points", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getTreeSet());
		g2 = createEGenericType(this.getCustomInputConditioningPoint());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getControllerFacade__CreateCustomInputConditioningPoint__double_double(), this.getCustomInputConditioningPoint(), "createCustomInputConditioningPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "inputValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "outputValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(controllersConfigurationEClass, ControllersConfiguration.class, "ControllersConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllersConfiguration_Active(), theEcorePackage.getEBoolean(), "active", "false", 0, 1, ControllersConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallControllerBindingEClass, OperationCallControllerBinding.class, "OperationCallControllerBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationCallControllerBinding_CreateResult(), theEcorePackage.getEBoolean(), "createResult", "false", 0, 1, OperationCallControllerBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationCallControllerBinding_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, OperationCallControllerBinding.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationCallControllerBinding_Trigger(), this.getTrigger(), this.getTrigger_OperationCallControllerBinding(), "trigger", null, 1, 1, OperationCallControllerBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOperationCallControllerBinding__Update(), null, "update", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_OperationCallControllerBinding(), this.getOperationCallControllerBinding(), this.getOperationCallControllerBinding_Trigger(), "operationCallControllerBinding", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTriggerEClass, TimeTrigger.class, "TimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeTrigger_RefreshPeriod(), theEcorePackage.getELong(), "refreshPeriod", "100", 0, 1, TimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerTriggerEClass, ControllerTrigger.class, "ControllerTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerTrigger_ComponentQualifier(), theJInputPackage.getEComponentQualifier(), null, "componentQualifier", null, 0, 1, ControllerTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEdgeTriggerEClass, ControllerEdgeTrigger.class, "ControllerEdgeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerEdgeTrigger_EdgeType(), this.getEdgeType(), "edgeType", null, 0, 1, ControllerEdgeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerStateTriggerEClass, ControllerStateTrigger.class, "ControllerStateTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerStateTrigger_EnablingValue(), theEcorePackage.getEBoolean(), "enablingValue", "true", 0, 1, ControllerStateTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerStateTrigger_RepeatPeriod(), theEcorePackage.getELong(), "repeatPeriod", "100", 0, 1, ControllerStateTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindedEDataTypeArgumentEClass, BindedEDataTypeArgument.class, "BindedEDataTypeArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindedEDataTypeArgument_ValueSource(), this.getValueSource(), this.getValueSource_BindedEDataTypeArgument(), "valueSource", null, 0, 1, BindedEDataTypeArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSourceEClass, ValueSource.class, "ValueSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSource_BindedEDataTypeArgument(), this.getBindedEDataTypeArgument(), this.getBindedEDataTypeArgument_ValueSource(), "bindedEDataTypeArgument", null, 0, 1, ValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getValueSource__GetSourceValue(), theEcorePackage.getEJavaObject(), "getSourceValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(fixedValueSourceEClass, FixedValueSource.class, "FixedValueSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(toggleValueSourceEClass, ToggleValueSource.class, "ToggleValueSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggleValueSource_InitialValue(), theEcorePackage.getEBoolean(), "initialValue", "true", 0, 1, ToggleValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToggleValueSource_CurrentValue(), theEcorePackage.getEBoolean(), "currentValue", null, 0, 1, ToggleValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerValueSourceEClass, ControllerValueSource.class, "ControllerValueSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerValueSource_Component(), theJInputPackage.getEComponent(), null, "component", null, 0, 1, ControllerValueSource.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getControllerValueSource_EComponentQualifier(), theJInputPackage.getEComponentQualifier(), null, "eComponentQualifier", null, 0, 1, ControllerValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControllerValueSource_Conditioning(), this.getAbstractInputConditioning(), null, "conditioning", null, 0, 1, ControllerValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerValueSource_LastValue(), theEcorePackage.getEJavaObject(), "lastValue", null, 0, 1, ControllerValueSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractInputConditioningEClass, AbstractInputConditioning.class, "AbstractInputConditioning", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAbstractInputConditioning__ConditionInput__EComponent(), theEcorePackage.getEFloat(), "conditionInput", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theJInputPackage.getEComponent(), "component", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(linearInputConditioningEClass, LinearInputConditioning.class, "LinearInputConditioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearInputConditioning_Minimum(), theEcorePackage.getEFloat(), "minimum", "-1.0", 0, 1, LinearInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearInputConditioning_Maximum(), theEcorePackage.getEFloat(), "maximum", "1.0", 0, 1, LinearInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(centeredLinearInputConditioningEClass, CenteredLinearInputConditioning.class, "CenteredLinearInputConditioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCenteredLinearInputConditioning_DeadBand(), theEcorePackage.getEFloat(), "deadBand", "0.0", 0, 1, CenteredLinearInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parabolicInputConditioningEClass, ParabolicInputConditioning.class, "ParabolicInputConditioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParabolicInputConditioning_Minimum(), theEcorePackage.getEFloat(), "minimum", "-1.0", 0, 1, ParabolicInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParabolicInputConditioning_Maximum(), theEcorePackage.getEFloat(), "maximum", "1.0", 0, 1, ParabolicInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(centeredParabolicInputConditioningEClass, CenteredParabolicInputConditioning.class, "CenteredParabolicInputConditioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCenteredParabolicInputConditioning_DeadBand(), theEcorePackage.getEFloat(), "deadBand", "0.0", 0, 1, CenteredParabolicInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userDefinedInputConditioningEClass, UserDefinedInputConditioning.class, "UserDefinedInputConditioning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserDefinedInputConditioning_Units(), theEcorePackage.getEString(), "units", "", 0, 1, UserDefinedInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserDefinedInputConditioning_TransferFunction(), this.getCustomInputConditioningPoint(), null, "transferFunction", null, 0, -1, UserDefinedInputConditioning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customInputConditioningPointEClass, CustomInputConditioningPoint.class, "CustomInputConditioningPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomInputConditioningPoint_InputValue(), theEcorePackage.getEDouble(), "inputValue", "0", 0, 1, CustomInputConditioningPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomInputConditioningPoint_OutputValue(), theEcorePackage.getEDouble(), "outputValue", "0", 0, 1, CustomInputConditioningPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(edgeTypeEEnum, EdgeType.class, "EdgeType");
		addEEnumLiteral(edgeTypeEEnum, EdgeType.RISING);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.FALLING);
		addEEnumLiteral(edgeTypeEEnum, EdgeType.BOTH);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(treeSetEDataType, TreeSet.class, "TreeSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

  /**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "EMFEcoreControllers",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)",
			 "modelName", "EMFEcoreControllers",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.eclipse.emf.ecore.invocator"
		   });	
		addAnnotation
		  (listEDataType, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nDataTypes.\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (controllerFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nUtilities\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (controllersConfigurationEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nControllersConfiguration\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getOperationCallControllerBinding_CreateResult(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to generate a result when binding is called.",
			 "notify", "true"
		   });	
		addAnnotation
		  (getOperationCallControllerBinding_Active(), 
		   source, 
		   new String[] {
			 "property", "Readonly"
		   });	
		addAnnotation
		  (triggerEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nTrigger : Defines a trigger that invokes a OperationControllerBinding\nupdate.\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getTrigger_OperationCallControllerBinding(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getTimeTrigger_RefreshPeriod(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "csa_units", "ms"
		   });	
		addAnnotation
		  (getControllerTrigger_ComponentQualifier(), 
		   source, 
		   new String[] {
			 "notify", "true"
		   });	
		addAnnotation
		  (getControllerStateTrigger_RepeatPeriod(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "csa_units", "ms"
		   });	
		addAnnotation
		  (bindedEDataTypeArgumentEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nValue Source\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getBindedEDataTypeArgument_ValueSource(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getValueSource_BindedEDataTypeArgument(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getToggleValueSource_CurrentValue(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getControllerValueSource_Component(), 
		   source, 
		   new String[] {
			 "property", "None",
			 "notify", "true",
			 "resolveProxies", "false"
		   });	
		addAnnotation
		  (getControllerValueSource_EComponentQualifier(), 
		   source, 
		   new String[] {
			 "notify", "true"
		   });	
		addAnnotation
		  (getControllerValueSource_Conditioning(), 
		   source, 
		   new String[] {
			 "children", "true"
		   });	
		addAnnotation
		  (getControllerValueSource_LastValue(), 
		   source, 
		   new String[] {
			 "property", "Readonly"
		   });	
		addAnnotation
		  (abstractInputConditioningEClass, 
		   source, 
		   new String[] {
			 "documentation", " -------------------------------------------------------------------------\n\nInput Conditioning\n\n-------------------------------------------------------------------------"
		   });	
		addAnnotation
		  (getUserDefinedInputConditioning_Units(), 
		   source, 
		   new String[] {
			 "documentation", " The units of the values.",
			 "notify", "true"
		   });	
		addAnnotation
		  (getUserDefinedInputConditioning_TransferFunction(), 
		   source, 
		   new String[] {
			 "notify", "true"
		   });
	}

		/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createEcoreAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (getToggleValueSource_InitialValue(), 
		   source, 
		   new String[] {
			 "notify", "true"
		   });
	}

} //EMFEcoreControllersPackageImpl
