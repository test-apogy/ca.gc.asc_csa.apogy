package ca.gc.asc_csa.apogy.core.invocator.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.core.invocator.*;
import java.util.HashMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreInvocatorFactoryImpl extends EFactoryImpl implements ApogyCoreInvocatorFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyCoreInvocatorFactory init()
  {
		try {
			ApogyCoreInvocatorFactory theApogyCoreInvocatorFactory = (ApogyCoreInvocatorFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreInvocatorPackage.eNS_URI);
			if (theApogyCoreInvocatorFactory != null) {
				return theApogyCoreInvocatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreInvocatorFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreInvocatorFactoryImpl()
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
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE: return createApogyCoreInvocatorFacade();
			case ApogyCoreInvocatorPackage.INVOCATOR_SESSION: return createInvocatorSession();
			case ApogyCoreInvocatorPackage.ENVIRONMENT: return createEnvironment();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER: return createDataProductsListsContainer();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST: return createDataProductsList();
			case ApogyCoreInvocatorPackage.TOOLS_LIST: return createToolsList();
			case ApogyCoreInvocatorPackage.LOCAL_TYPES_LIST: return createLocalTypesList();
			case ApogyCoreInvocatorPackage.REGISTERED_TYPES_LIST: return createRegisteredTypesList();
			case ApogyCoreInvocatorPackage.TYPE: return createType();
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER: return createTypeApiAdapter();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER: return createTypeMember();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE: return createTypeMemberReference();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT: return createTypeMemberReferenceListElement();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT: return createTypeMemberReferenceTreeElement();
			case ApogyCoreInvocatorPackage.VARIABLES_LIST: return createVariablesList();
			case ApogyCoreInvocatorPackage.VARIABLE: return createVariable();
			case ApogyCoreInvocatorPackage.CONTEXTS_LIST: return createContextsList();
			case ApogyCoreInvocatorPackage.CONTEXT: return createContext();
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST: return createVariableImplementationsList();
			case ApogyCoreInvocatorPackage.INITIALIZATION_DATA: return createInitializationData();
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION: return createVariableImplementation();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATION: return createTypeMemberImplementation();
			case ApogyCoreInvocatorPackage.VALUES_LIST: return createValuesList();
			case ApogyCoreInvocatorPackage.VALUE: return createValue();
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST: return createProgramsList();
			case ApogyCoreInvocatorPackage.PROGRAMS_GROUP: return createProgramsGroup();
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS: return createProgramSettings();
			case ApogyCoreInvocatorPackage.PROGRAM_FACTORIES_REGISTRY: return createProgramFactoriesRegistry();
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST: return createOperationCallsList();
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST_FACTORY: return createOperationCallsListFactory();
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE: return createVariableFeatureReference();
			case ApogyCoreInvocatorPackage.OPERATION_CALL: return createOperationCall();
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST: return createArgumentsList();
			case ApogyCoreInvocatorPackage.BOOLEAN_EDATA_TYPE_ARGUMENT: return createBooleanEDataTypeArgument();
			case ApogyCoreInvocatorPackage.NUMERIC_EDATA_TYPE_ARGUMENT: return createNumericEDataTypeArgument();
			case ApogyCoreInvocatorPackage.STRING_EDATA_TYPE_ARGUMENT: return createStringEDataTypeArgument();
			case ApogyCoreInvocatorPackage.EENUM_ARGUMENT: return createEEnumArgument();
			case ApogyCoreInvocatorPackage.ECLASS_ARGUMENT: return createEClassArgument();
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIMES_LIST: return createProgramRuntimesList();
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST_PROGRAM_RUNTIME: return createOperationCallsListProgramRuntime();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST: return createOperationCallResultsList();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT: return createOperationCallResult();
			case ApogyCoreInvocatorPackage.EXCEPTION_CONTAINER: return createExceptionContainer();
			case ApogyCoreInvocatorPackage.ATTRIBUTE_RESULT_VALUE: return createAttributeResultValue();
			case ApogyCoreInvocatorPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case ApogyCoreInvocatorPackage.REFERENCE_RESULT_VALUE: return createReferenceResultValue();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE: return createOperationCallResultsListTimeSource();
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
			case ApogyCoreInvocatorPackage.VARIABLE_LISTENER_EVENT_TYPE:
				return createVariableListenerEventTypeFromString(eDataType, initialValue);
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIME_STATE:
				return createProgramRuntimeStateFromString(eDataType, initialValue);
			case ApogyCoreInvocatorPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			case ApogyCoreInvocatorPackage.NOTIFICATION:
				return createNotificationFromString(eDataType, initialValue);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATIONS_ELIST:
				return createTypeMemberImplementationsEListFromString(eDataType, initialValue);
			case ApogyCoreInvocatorPackage.TYPE_MEMBERS_ARRAY:
				return createTypeMembersArrayFromString(eDataType, initialValue);
			case ApogyCoreInvocatorPackage.IVARIABLE_LISTENER:
				return createIVariableListenerFromString(eDataType, initialValue);
			case ApogyCoreInvocatorPackage.HASH_MAP:
				return createHashMapFromString(eDataType, initialValue);
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
			case ApogyCoreInvocatorPackage.VARIABLE_LISTENER_EVENT_TYPE:
				return convertVariableListenerEventTypeToString(eDataType, instanceValue);
			case ApogyCoreInvocatorPackage.PROGRAM_RUNTIME_STATE:
				return convertProgramRuntimeStateToString(eDataType, instanceValue);
			case ApogyCoreInvocatorPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			case ApogyCoreInvocatorPackage.NOTIFICATION:
				return convertNotificationToString(eDataType, instanceValue);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATIONS_ELIST:
				return convertTypeMemberImplementationsEListToString(eDataType, instanceValue);
			case ApogyCoreInvocatorPackage.TYPE_MEMBERS_ARRAY:
				return convertTypeMembersArrayToString(eDataType, instanceValue);
			case ApogyCoreInvocatorPackage.IVARIABLE_LISTENER:
				return convertIVariableListenerToString(eDataType, instanceValue);
			case ApogyCoreInvocatorPackage.HASH_MAP:
				return convertHashMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorFacade createApogyCoreInvocatorFacade() {
		ApogyCoreInvocatorFacadeImpl apogyCoreInvocatorFacade = new ApogyCoreInvocatorFacadeImpl();
		return apogyCoreInvocatorFacade;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession createInvocatorSession()
  {
		InvocatorSessionImpl invocatorSession = new InvocatorSessionImpl();
		return invocatorSession;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment createEnvironment()
  {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsListsContainer createDataProductsListsContainer()
  {
		DataProductsListsContainerImpl dataProductsListsContainer = new DataProductsListsContainerImpl();
		return dataProductsListsContainer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsList createDataProductsList()
  {
		DataProductsListImpl dataProductsList = new DataProductsListImpl();
		return dataProductsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ToolsList createToolsList()
  {
		ToolsListImpl toolsList = new ToolsListImpl();
		return toolsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public LocalTypesList createLocalTypesList()
  {
		LocalTypesListImpl localTypesList = new LocalTypesListImpl();
		return localTypesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RegisteredTypesList createRegisteredTypesList()
  {
		RegisteredTypesListImpl registeredTypesList = new RegisteredTypesListImpl();
		return registeredTypesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Type createType()
  {
		TypeImpl type = new TypeImpl();
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeApiAdapter createTypeApiAdapter()
  {
		TypeApiAdapterImpl typeApiAdapter = new TypeApiAdapterImpl();
		return typeApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMember createTypeMember()
  {
		TypeMemberImpl typeMember = new TypeMemberImpl();
		return typeMember;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReference createTypeMemberReference()
  {
		TypeMemberReferenceImpl typeMemberReference = new TypeMemberReferenceImpl();
		return typeMemberReference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceListElement createTypeMemberReferenceListElement()
  {
		TypeMemberReferenceListElementImpl typeMemberReferenceListElement = new TypeMemberReferenceListElementImpl();
		return typeMemberReferenceListElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceTreeElement createTypeMemberReferenceTreeElement()
  {
		TypeMemberReferenceTreeElementImpl typeMemberReferenceTreeElement = new TypeMemberReferenceTreeElementImpl();
		return typeMemberReferenceTreeElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariablesList createVariablesList()
  {
		VariablesListImpl variablesList = new VariablesListImpl();
		return variablesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Variable createVariable()
  {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContextsList createContextsList()
  {
		ContextsListImpl contextsList = new ContextsListImpl();
		return contextsList;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementationsList createVariableImplementationsList()
  {
		VariableImplementationsListImpl variableImplementationsList = new VariableImplementationsListImpl();
		return variableImplementationsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InitializationData createInitializationData()
  {
		InitializationDataImpl initializationData = new InitializationDataImpl();
		return initializationData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableImplementation createVariableImplementation()
  {
		VariableImplementationImpl variableImplementation = new VariableImplementationImpl();
		return variableImplementation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberImplementation createTypeMemberImplementation()
  {
		TypeMemberImplementationImpl typeMemberImplementation = new TypeMemberImplementationImpl();
		return typeMemberImplementation;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ValuesList createValuesList()
  {
		ValuesListImpl valuesList = new ValuesListImpl();
		return valuesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value createValue()
  {
		ValueImpl value = new ValueImpl();
		return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProgramsList createProgramsList()
  {
		ProgramsListImpl programsList = new ProgramsListImpl();
		return programsList;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramsGroup createProgramsGroup() {
		ProgramsGroupImpl programsGroup = new ProgramsGroupImpl();
		return programsGroup;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSettings createProgramSettings() {
		ProgramSettingsImpl programSettings = new ProgramSettingsImpl();
		return programSettings;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramFactoriesRegistry createProgramFactoriesRegistry() {
		ProgramFactoriesRegistryImpl programFactoriesRegistry = new ProgramFactoriesRegistryImpl();
		return programFactoriesRegistry;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallsList createOperationCallsList()
  {
		OperationCallsListImpl operationCallsList = new OperationCallsListImpl();
		return operationCallsList;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallsListFactory createOperationCallsListFactory() {
		OperationCallsListFactoryImpl operationCallsListFactory = new OperationCallsListFactoryImpl();
		return operationCallsListFactory;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public VariableFeatureReference createVariableFeatureReference()
  {
		VariableFeatureReferenceImpl variableFeatureReference = new VariableFeatureReferenceImpl();
		return variableFeatureReference;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCall createOperationCall()
  {
		OperationCallImpl operationCall = new OperationCallImpl();
		return operationCall;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArgumentsList createArgumentsList()
  {
		ArgumentsListImpl argumentsList = new ArgumentsListImpl();
		return argumentsList;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanEDataTypeArgument createBooleanEDataTypeArgument() {
		BooleanEDataTypeArgumentImpl booleanEDataTypeArgument = new BooleanEDataTypeArgumentImpl();
		return booleanEDataTypeArgument;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericEDataTypeArgument createNumericEDataTypeArgument() {
		NumericEDataTypeArgumentImpl numericEDataTypeArgument = new NumericEDataTypeArgumentImpl();
		return numericEDataTypeArgument;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringEDataTypeArgument createStringEDataTypeArgument() {
		StringEDataTypeArgumentImpl stringEDataTypeArgument = new StringEDataTypeArgumentImpl();
		return stringEDataTypeArgument;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnumArgument createEEnumArgument()
  {
		EEnumArgumentImpl eEnumArgument = new EEnumArgumentImpl();
		return eEnumArgument;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClassArgument createEClassArgument()
  {
		EClassArgumentImpl eClassArgument = new EClassArgumentImpl();
		return eClassArgument;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramRuntimesList createProgramRuntimesList() {
		ProgramRuntimesListImpl programRuntimesList = new ProgramRuntimesListImpl();
		return programRuntimesList;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallsListProgramRuntime createOperationCallsListProgramRuntime() {
		OperationCallsListProgramRuntimeImpl operationCallsListProgramRuntime = new OperationCallsListProgramRuntimeImpl();
		return operationCallsListProgramRuntime;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallResultsList createOperationCallResultsList()
  {
		OperationCallResultsListImpl operationCallResultsList = new OperationCallResultsListImpl();
		return operationCallResultsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallResult createOperationCallResult()
  {
		OperationCallResultImpl operationCallResult = new OperationCallResultImpl();
		return operationCallResult;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExceptionContainer createExceptionContainer()
  {
		ExceptionContainerImpl exceptionContainer = new ExceptionContainerImpl();
		return exceptionContainer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AttributeResultValue createAttributeResultValue()
  {
		AttributeResultValueImpl attributeResultValue = new AttributeResultValueImpl();
		return attributeResultValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AttributeValue createAttributeValue()
  {
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ReferenceResultValue createReferenceResultValue()
  {
		ReferenceResultValueImpl referenceResultValue = new ReferenceResultValueImpl();
		return referenceResultValue;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallResultsListTimeSource createOperationCallResultsListTimeSource() {
		OperationCallResultsListTimeSourceImpl operationCallResultsListTimeSource = new OperationCallResultsListTimeSourceImpl();
		return operationCallResultsListTimeSource;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableListenerEventType createVariableListenerEventTypeFromString(EDataType eDataType, String initialValue) {
		VariableListenerEventType result = VariableListenerEventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableListenerEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramRuntimeState createProgramRuntimeStateFromString(EDataType eDataType, String initialValue) {
		ProgramRuntimeState result = ProgramRuntimeState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProgramRuntimeStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Throwable createThrowableFromString(EDataType eDataType, String initialValue)
  {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertThrowableToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Notification createNotificationFromString(EDataType eDataType, String initialValue)
  {
		return (Notification)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertNotificationToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  public EList<TypeMemberImplementation> createTypeMemberImplementationsEListFromString(EDataType eDataType, String initialValue)
  {
		return (EList<TypeMemberImplementation>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertTypeMemberImplementationsEListToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeMember[] createTypeMembersArrayFromString(EDataType eDataType, String initialValue) {
		return (TypeMember[])super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeMembersArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVariableListener createIVariableListenerFromString(EDataType eDataType, String initialValue) {
		return (IVariableListener)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIVariableListenerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashMap<?, ?> createHashMapFromString(EDataType eDataType, String initialValue) {
		return (HashMap<?, ?>)super.createFromString(initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorPackage getApogyCoreInvocatorPackage() {
		return (ApogyCoreInvocatorPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyCoreInvocatorPackage getPackage()
  {
		return ApogyCoreInvocatorPackage.eINSTANCE;
	}

} //ApogyCoreInvocatorFactoryImpl
