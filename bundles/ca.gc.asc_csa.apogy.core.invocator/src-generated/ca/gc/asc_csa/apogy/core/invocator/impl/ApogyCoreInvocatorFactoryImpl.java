/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.core.invocator.*;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue;
import ca.gc.asc_csa.apogy.core.invocator.AttributeValue;
import ca.gc.asc_csa.apogy.core.invocator.BasicContext;
import ca.gc.asc_csa.apogy.core.invocator.ChannelsList;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.DisplaysList;
import ca.gc.asc_csa.apogy.core.invocator.DisplaysListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.EClassArgument;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer;
import ca.gc.asc_csa.apogy.core.invocator.InitializationData;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.LocalTypesList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;
import ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList;
import ca.gc.asc_csa.apogy.core.invocator.ToolsList;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement;
import ca.gc.asc_csa.apogy.core.invocator.TypesList;
import ca.gc.asc_csa.apogy.core.invocator.Value;
import ca.gc.asc_csa.apogy.core.invocator.ValuesList;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.Watch;
import ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter;
import ca.gc.asc_csa.apogy.core.invocator.WatchesList;
import ca.gc.asc_csa.apogy.core.invocator.WatchesListsContainer;

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
			case ApogyCoreInvocatorPackage.TYPES_LIST: return createTypesList();
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
			case ApogyCoreInvocatorPackage.BASIC_CONTEXT: return createBasicContext();
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST: return createVariableImplementationsList();
			case ApogyCoreInvocatorPackage.INITIALIZATION_DATA: return createInitializationData();
			case ApogyCoreInvocatorPackage.VARIABLE_IMPLEMENTATION: return createVariableImplementation();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATION: return createTypeMemberImplementation();
			case ApogyCoreInvocatorPackage.VALUES_LIST: return createValuesList();
			case ApogyCoreInvocatorPackage.VALUE: return createValue();
			case ApogyCoreInvocatorPackage.PROGRAMS_LIST: return createProgramsList();
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST: return createOperationCallsList();
			case ApogyCoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE: return createVariableFeatureReference();
			case ApogyCoreInvocatorPackage.OPERATION_CALL: return createOperationCall();
			case ApogyCoreInvocatorPackage.ARGUMENTS_LIST: return createArgumentsList();
			case ApogyCoreInvocatorPackage.EDATA_TYPE_ARGUMENT: return createEDataTypeArgument();
			case ApogyCoreInvocatorPackage.EENUM_ARGUMENT: return createEEnumArgument();
			case ApogyCoreInvocatorPackage.ECLASS_ARGUMENT: return createEClassArgument();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST: return createOperationCallResultsList();
			case ApogyCoreInvocatorPackage.RECORDING_RESULTS_LIST: return createRecordingResultsList();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT: return createOperationCallResult();
			case ApogyCoreInvocatorPackage.EXCEPTION_CONTAINER: return createExceptionContainer();
			case ApogyCoreInvocatorPackage.ATTRIBUTE_RESULT_VALUE: return createAttributeResultValue();
			case ApogyCoreInvocatorPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case ApogyCoreInvocatorPackage.REFERENCE_RESULT_VALUE: return createReferenceResultValue();
			case ApogyCoreInvocatorPackage.WATCHES_LISTS_CONTAINER: return createWatchesListsContainer();
			case ApogyCoreInvocatorPackage.WATCHES_LIST: return createWatchesList();
			case ApogyCoreInvocatorPackage.WATCH: return createWatch();
			case ApogyCoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER: return createWatchFeatureNodeAdapter();
			case ApogyCoreInvocatorPackage.DISPLAYS_LISTS_CONTAINER: return createDisplaysListsContainer();
			case ApogyCoreInvocatorPackage.DISPLAYS_LIST: return createDisplaysList();
			case ApogyCoreInvocatorPackage.RECORDING_TOOLS_CONTAINER: return createRecordingToolsContainer();
			case ApogyCoreInvocatorPackage.CHANNELS_LIST: return createChannelsList();
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
  public TypesList createTypesList()
  {
		TypesListImpl typesList = new TypesListImpl();
		return typesList;
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
  public BasicContext createBasicContext()
  {
		BasicContextImpl basicContext = new BasicContextImpl();
		return basicContext;
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
  public EDataTypeArgument createEDataTypeArgument()
  {
		EDataTypeArgumentImpl eDataTypeArgument = new EDataTypeArgumentImpl();
		return eDataTypeArgument;
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
  public RecordingResultsList createRecordingResultsList()
  {
		RecordingResultsListImpl recordingResultsList = new RecordingResultsListImpl();
		return recordingResultsList;
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
  public WatchesListsContainer createWatchesListsContainer()
  {
		WatchesListsContainerImpl watchesListsContainer = new WatchesListsContainerImpl();
		return watchesListsContainer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WatchesList createWatchesList()
  {
		WatchesListImpl watchesList = new WatchesListImpl();
		return watchesList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Watch createWatch()
  {
		WatchImpl watch = new WatchImpl();
		return watch;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WatchFeatureNodeAdapter createWatchFeatureNodeAdapter()
  {
		WatchFeatureNodeAdapterImpl watchFeatureNodeAdapter = new WatchFeatureNodeAdapterImpl();
		return watchFeatureNodeAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DisplaysListsContainer createDisplaysListsContainer()
  {
		DisplaysListsContainerImpl displaysListsContainer = new DisplaysListsContainerImpl();
		return displaysListsContainer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DisplaysList createDisplaysList()
  {
		DisplaysListImpl displaysList = new DisplaysListImpl();
		return displaysList;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordingToolsContainer createRecordingToolsContainer() {
		RecordingToolsContainerImpl recordingToolsContainer = new RecordingToolsContainerImpl();
		return recordingToolsContainer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelsList createChannelsList() {
		ChannelsListImpl channelsList = new ChannelsListImpl();
		return channelsList;
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
