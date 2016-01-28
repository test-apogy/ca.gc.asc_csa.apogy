/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers.impl;

import java.util.List;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.core.programs.controllers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreProgramsControllersFactoryImpl extends EFactoryImpl implements ApogyCoreProgramsControllersFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCoreProgramsControllersFactory init()
  {
		try {
			ApogyCoreProgramsControllersFactory theApogyCoreProgramsControllersFactory = (ApogyCoreProgramsControllersFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreProgramsControllersPackage.eNS_URI);
			if (theApogyCoreProgramsControllersFactory != null) {
				return theApogyCoreProgramsControllersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreProgramsControllersFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreProgramsControllersFactoryImpl()
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
			case ApogyCoreProgramsControllersPackage.APOGY_CORE_PROGRAMS_CONTROLLERS_FACADE: return createApogyCoreProgramsControllersFacade();
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION: return createControllersConfiguration();
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING: return createOperationCallControllerBinding();
			case ApogyCoreProgramsControllersPackage.TIME_TRIGGER: return createTimeTrigger();
			case ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER: return createControllerEdgeTrigger();
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER: return createControllerStateTrigger();
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT: return createBindedEDataTypeArgument();
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE: return createFixedValueSource();
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE: return createToggleValueSource();
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE: return createControllerValueSource();
			case ApogyCoreProgramsControllersPackage.LINEAR_INPUT_CONDITIONING: return createLinearInputConditioning();
			case ApogyCoreProgramsControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING: return createCenteredLinearInputConditioning();
			case ApogyCoreProgramsControllersPackage.PARABOLIC_INPUT_CONDITIONING: return createParabolicInputConditioning();
			case ApogyCoreProgramsControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING: return createCenteredParabolicInputConditioning();
			case ApogyCoreProgramsControllersPackage.USER_DEFINED_INPUT_CONDITIONING: return createUserDefinedInputConditioning();
			case ApogyCoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT: return createCustomInputConditioningPoint();
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
			case ApogyCoreProgramsControllersPackage.EDGE_TYPE:
				return createEdgeTypeFromString(eDataType, initialValue);
			case ApogyCoreProgramsControllersPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogyCoreProgramsControllersPackage.TREE_SET:
				return createTreeSetFromString(eDataType, initialValue);
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
			case ApogyCoreProgramsControllersPackage.EDGE_TYPE:
				return convertEdgeTypeToString(eDataType, instanceValue);
			case ApogyCoreProgramsControllersPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogyCoreProgramsControllersPackage.TREE_SET:
				return convertTreeSetToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsControllersFacade createApogyCoreProgramsControllersFacade() {
		ApogyCoreProgramsControllersFacadeImpl apogyCoreProgramsControllersFacade = new ApogyCoreProgramsControllersFacadeImpl();
		return apogyCoreProgramsControllersFacade;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllersConfiguration createControllersConfiguration()
  {
		ControllersConfigurationImpl controllersConfiguration = new ControllersConfigurationImpl();
		return controllersConfiguration;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallControllerBinding createOperationCallControllerBinding()
  {
		OperationCallControllerBindingImpl operationCallControllerBinding = new OperationCallControllerBindingImpl();
		return operationCallControllerBinding;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TimeTrigger createTimeTrigger()
  {
		TimeTriggerImpl timeTrigger = new TimeTriggerImpl();
		return timeTrigger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllerEdgeTrigger createControllerEdgeTrigger()
  {
		ControllerEdgeTriggerImpl controllerEdgeTrigger = new ControllerEdgeTriggerImpl();
		return controllerEdgeTrigger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllerStateTrigger createControllerStateTrigger()
  {
		ControllerStateTriggerImpl controllerStateTrigger = new ControllerStateTriggerImpl();
		return controllerStateTrigger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public BindedEDataTypeArgument createBindedEDataTypeArgument()
  {
		BindedEDataTypeArgumentImpl bindedEDataTypeArgument = new BindedEDataTypeArgumentImpl();
		return bindedEDataTypeArgument;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FixedValueSource createFixedValueSource()
  {
		FixedValueSourceImpl fixedValueSource = new FixedValueSourceImpl();
		return fixedValueSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ToggleValueSource createToggleValueSource()
  {
		ToggleValueSourceImpl toggleValueSource = new ToggleValueSourceImpl();
		return toggleValueSource;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ControllerValueSource createControllerValueSource()
  {
		ControllerValueSourceImpl controllerValueSource = new ControllerValueSourceImpl();
		return controllerValueSource;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearInputConditioning createLinearInputConditioning() {
		LinearInputConditioningImpl linearInputConditioning = new LinearInputConditioningImpl();
		return linearInputConditioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CenteredLinearInputConditioning createCenteredLinearInputConditioning() {
		CenteredLinearInputConditioningImpl centeredLinearInputConditioning = new CenteredLinearInputConditioningImpl();
		return centeredLinearInputConditioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParabolicInputConditioning createParabolicInputConditioning() {
		ParabolicInputConditioningImpl parabolicInputConditioning = new ParabolicInputConditioningImpl();
		return parabolicInputConditioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CenteredParabolicInputConditioning createCenteredParabolicInputConditioning() {
		CenteredParabolicInputConditioningImpl centeredParabolicInputConditioning = new CenteredParabolicInputConditioningImpl();
		return centeredParabolicInputConditioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDefinedInputConditioning createUserDefinedInputConditioning() {
		UserDefinedInputConditioningImpl userDefinedInputConditioning = new UserDefinedInputConditioningImpl();
		return userDefinedInputConditioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomInputConditioningPoint createCustomInputConditioningPoint() {
		CustomInputConditioningPointImpl customInputConditioningPoint = new CustomInputConditioningPointImpl();
		return customInputConditioningPoint;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdgeType createEdgeTypeFromString(EDataType eDataType, String initialValue)
  {
		EdgeType result = EdgeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertEdgeTypeToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeSet<?> createTreeSetFromString(EDataType eDataType, String initialValue) {
		return (TreeSet<?>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTreeSetToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsControllersPackage getApogyCoreProgramsControllersPackage() {
		return (ApogyCoreProgramsControllersPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCoreProgramsControllersPackage getPackage()
  {
		return ApogyCoreProgramsControllersPackage.eINSTANCE;
	}

} //ApogyCoreProgramsControllersFactoryImpl
