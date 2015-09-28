/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.*;
import java.util.List;
import java.util.TreeSet;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllerValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ControllersConfiguration;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EdgeType;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.FixedValueSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.TimeTrigger;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ToggleValueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreControllersFactoryImpl extends EFactoryImpl implements EMFEcoreControllersFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EMFEcoreControllersFactory init()
  {
		try {
			EMFEcoreControllersFactory theEMFEcoreControllersFactory = (EMFEcoreControllersFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreControllersPackage.eNS_URI);
			if (theEMFEcoreControllersFactory != null) {
				return theEMFEcoreControllersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreControllersFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreControllersFactoryImpl()
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
			case EMFEcoreControllersPackage.CONTROLLER_FACADE: return createControllerFacade();
			case EMFEcoreControllersPackage.CONTROLLERS_CONFIGURATION: return createControllersConfiguration();
			case EMFEcoreControllersPackage.OPERATION_CALL_CONTROLLER_BINDING: return createOperationCallControllerBinding();
			case EMFEcoreControllersPackage.TIME_TRIGGER: return createTimeTrigger();
			case EMFEcoreControllersPackage.CONTROLLER_EDGE_TRIGGER: return createControllerEdgeTrigger();
			case EMFEcoreControllersPackage.CONTROLLER_STATE_TRIGGER: return createControllerStateTrigger();
			case EMFEcoreControllersPackage.BINDED_EDATA_TYPE_ARGUMENT: return createBindedEDataTypeArgument();
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE: return createFixedValueSource();
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE: return createToggleValueSource();
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE: return createControllerValueSource();
			case EMFEcoreControllersPackage.LINEAR_INPUT_CONDITIONING: return createLinearInputConditioning();
			case EMFEcoreControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING: return createCenteredLinearInputConditioning();
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING: return createParabolicInputConditioning();
			case EMFEcoreControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING: return createCenteredParabolicInputConditioning();
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING: return createUserDefinedInputConditioning();
			case EMFEcoreControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT: return createCustomInputConditioningPoint();
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
			case EMFEcoreControllersPackage.EDGE_TYPE:
				return createEdgeTypeFromString(eDataType, initialValue);
			case EMFEcoreControllersPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case EMFEcoreControllersPackage.TREE_SET:
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
			case EMFEcoreControllersPackage.EDGE_TYPE:
				return convertEdgeTypeToString(eDataType, instanceValue);
			case EMFEcoreControllersPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case EMFEcoreControllersPackage.TREE_SET:
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
  public ControllerFacade createControllerFacade()
  {
		ControllerFacadeImpl controllerFacade = new ControllerFacadeImpl();
		return controllerFacade;
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
  public EMFEcoreControllersPackage getEMFEcoreControllersPackage()
  {
		return (EMFEcoreControllersPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EMFEcoreControllersPackage getPackage()
  {
		return EMFEcoreControllersPackage.eINSTANCE;
	}

} //EMFEcoreControllersFactoryImpl
