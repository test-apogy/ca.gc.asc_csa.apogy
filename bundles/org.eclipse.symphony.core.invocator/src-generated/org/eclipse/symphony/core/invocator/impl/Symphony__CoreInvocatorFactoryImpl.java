/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.invocator.ArgumentsList;
import org.eclipse.symphony.core.invocator.AttributeResultValue;
import org.eclipse.symphony.core.invocator.AttributeValue;
import org.eclipse.symphony.core.invocator.BasicContext;
import org.eclipse.symphony.core.invocator.ChannelsList;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.DataProductsList;
import org.eclipse.symphony.core.invocator.DataProductsListsContainer;
import org.eclipse.symphony.core.invocator.DisplaysList;
import org.eclipse.symphony.core.invocator.DisplaysListsContainer;
import org.eclipse.symphony.core.invocator.EClassArgument;
import org.eclipse.symphony.core.invocator.EDataTypeArgument;
import org.eclipse.symphony.core.invocator.EEnumArgument;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.ExceptionContainer;
import org.eclipse.symphony.core.invocator.InitializationData;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.LocalTypesList;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallResult;
import org.eclipse.symphony.core.invocator.OperationCallResultsList;
import org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource;
import org.eclipse.symphony.core.invocator.OperationCallsList;
import org.eclipse.symphony.core.invocator.ProgramsList;
import org.eclipse.symphony.core.invocator.RecordingResultsList;
import org.eclipse.symphony.core.invocator.RecordingToolsContainer;
import org.eclipse.symphony.core.invocator.ReferenceResultValue;
import org.eclipse.symphony.core.invocator.RegisteredTypesList;
import org.eclipse.symphony.core.invocator.ToolsList;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;
import org.eclipse.symphony.core.invocator.TypeMember;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.TypeMemberReference;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceListElement;
import org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement;
import org.eclipse.symphony.core.invocator.TypesList;
import org.eclipse.symphony.core.invocator.Value;
import org.eclipse.symphony.core.invocator.ValuesList;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.symphony.core.invocator.VariableImplementationsList;
import org.eclipse.symphony.core.invocator.VariablesList;
import org.eclipse.symphony.core.invocator.Watch;
import org.eclipse.symphony.core.invocator.WatchFeatureNodeAdapter;
import org.eclipse.symphony.core.invocator.WatchesList;
import org.eclipse.symphony.core.invocator.WatchesListsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreInvocatorFactoryImpl extends EFactoryImpl implements Symphony__CoreInvocatorFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__CoreInvocatorFactory init()
  {
		try {
			Symphony__CoreInvocatorFactory theSymphony__CoreInvocatorFactory = (Symphony__CoreInvocatorFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CoreInvocatorPackage.eNS_URI);
			if (theSymphony__CoreInvocatorFactory != null) {
				return theSymphony__CoreInvocatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CoreInvocatorFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CoreInvocatorFactoryImpl()
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
			case Symphony__CoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE: return createEMFEcoreInvocatorFacade();
			case Symphony__CoreInvocatorPackage.INVOCATOR_SESSION: return createInvocatorSession();
			case Symphony__CoreInvocatorPackage.ENVIRONMENT: return createEnvironment();
			case Symphony__CoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER: return createDataProductsListsContainer();
			case Symphony__CoreInvocatorPackage.DATA_PRODUCTS_LIST: return createDataProductsList();
			case Symphony__CoreInvocatorPackage.TOOLS_LIST: return createToolsList();
			case Symphony__CoreInvocatorPackage.TYPES_LIST: return createTypesList();
			case Symphony__CoreInvocatorPackage.LOCAL_TYPES_LIST: return createLocalTypesList();
			case Symphony__CoreInvocatorPackage.REGISTERED_TYPES_LIST: return createRegisteredTypesList();
			case Symphony__CoreInvocatorPackage.TYPE: return createType();
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER: return createTypeApiAdapter();
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER: return createTypeMember();
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE: return createTypeMemberReference();
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT: return createTypeMemberReferenceListElement();
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT: return createTypeMemberReferenceTreeElement();
			case Symphony__CoreInvocatorPackage.VARIABLES_LIST: return createVariablesList();
			case Symphony__CoreInvocatorPackage.VARIABLE: return createVariable();
			case Symphony__CoreInvocatorPackage.CONTEXTS_LIST: return createContextsList();
			case Symphony__CoreInvocatorPackage.BASIC_CONTEXT: return createBasicContext();
			case Symphony__CoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST: return createVariableImplementationsList();
			case Symphony__CoreInvocatorPackage.INITIALIZATION_DATA: return createInitializationData();
			case Symphony__CoreInvocatorPackage.VARIABLE_IMPLEMENTATION: return createVariableImplementation();
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATION: return createTypeMemberImplementation();
			case Symphony__CoreInvocatorPackage.VALUES_LIST: return createValuesList();
			case Symphony__CoreInvocatorPackage.VALUE: return createValue();
			case Symphony__CoreInvocatorPackage.PROGRAMS_LIST: return createProgramsList();
			case Symphony__CoreInvocatorPackage.OPERATION_CALLS_LIST: return createOperationCallsList();
			case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE: return createVariableFeatureReference();
			case Symphony__CoreInvocatorPackage.OPERATION_CALL: return createOperationCall();
			case Symphony__CoreInvocatorPackage.ARGUMENTS_LIST: return createArgumentsList();
			case Symphony__CoreInvocatorPackage.EDATA_TYPE_ARGUMENT: return createEDataTypeArgument();
			case Symphony__CoreInvocatorPackage.EENUM_ARGUMENT: return createEEnumArgument();
			case Symphony__CoreInvocatorPackage.ECLASS_ARGUMENT: return createEClassArgument();
			case Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST: return createOperationCallResultsList();
			case Symphony__CoreInvocatorPackage.RECORDING_RESULTS_LIST: return createRecordingResultsList();
			case Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT: return createOperationCallResult();
			case Symphony__CoreInvocatorPackage.EXCEPTION_CONTAINER: return createExceptionContainer();
			case Symphony__CoreInvocatorPackage.ATTRIBUTE_RESULT_VALUE: return createAttributeResultValue();
			case Symphony__CoreInvocatorPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case Symphony__CoreInvocatorPackage.REFERENCE_RESULT_VALUE: return createReferenceResultValue();
			case Symphony__CoreInvocatorPackage.WATCHES_LISTS_CONTAINER: return createWatchesListsContainer();
			case Symphony__CoreInvocatorPackage.WATCHES_LIST: return createWatchesList();
			case Symphony__CoreInvocatorPackage.WATCH: return createWatch();
			case Symphony__CoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER: return createWatchFeatureNodeAdapter();
			case Symphony__CoreInvocatorPackage.DISPLAYS_LISTS_CONTAINER: return createDisplaysListsContainer();
			case Symphony__CoreInvocatorPackage.DISPLAYS_LIST: return createDisplaysList();
			case Symphony__CoreInvocatorPackage.RECORDING_TOOLS_CONTAINER: return createRecordingToolsContainer();
			case Symphony__CoreInvocatorPackage.CHANNELS_LIST: return createChannelsList();
			case Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE: return createOperationCallResultsListTimeSource();
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
			case Symphony__CoreInvocatorPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			case Symphony__CoreInvocatorPackage.NOTIFICATION:
				return createNotificationFromString(eDataType, initialValue);
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATIONS_ELIST:
				return createTypeMemberImplementationsEListFromString(eDataType, initialValue);
			case Symphony__CoreInvocatorPackage.TYPE_MEMBERS_ARRAY:
				return createTypeMembersArrayFromString(eDataType, initialValue);
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
			case Symphony__CoreInvocatorPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			case Symphony__CoreInvocatorPackage.NOTIFICATION:
				return convertNotificationToString(eDataType, instanceValue);
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATIONS_ELIST:
				return convertTypeMemberImplementationsEListToString(eDataType, instanceValue);
			case Symphony__CoreInvocatorPackage.TYPE_MEMBERS_ARRAY:
				return convertTypeMembersArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorFacade createEMFEcoreInvocatorFacade()
  {
		EMFEcoreInvocatorFacadeImpl emfEcoreInvocatorFacade = new EMFEcoreInvocatorFacadeImpl();
		return emfEcoreInvocatorFacade;
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
	public Symphony__CoreInvocatorPackage getSymphony__CoreInvocatorPackage() {
		return (Symphony__CoreInvocatorPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__CoreInvocatorPackage getPackage()
  {
		return Symphony__CoreInvocatorPackage.eINSTANCE;
	}

} //Symphony__CoreInvocatorFactoryImpl
