/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.BasicContext;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ContextsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysListsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EClassArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EDataTypeArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EEnumArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ExceptionContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.LocalTypesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsListTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingResultsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.RegisteredTypesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ToolsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMember;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReference;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceTreeElement;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Value;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ValuesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementationsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariablesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchFeatureNodeAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesListsContainer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorFactoryImpl extends EFactoryImpl implements EMFEcoreInvocatorFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EMFEcoreInvocatorFactory init()
  {
		try {
			EMFEcoreInvocatorFactory theEMFEcoreInvocatorFactory = (EMFEcoreInvocatorFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreInvocatorPackage.eNS_URI);
			if (theEMFEcoreInvocatorFactory != null) {
				return theEMFEcoreInvocatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreInvocatorFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorFactoryImpl()
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
			case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE: return createEMFEcoreInvocatorFacade();
			case EMFEcoreInvocatorPackage.INVOCATOR_SESSION: return createInvocatorSession();
			case EMFEcoreInvocatorPackage.ENVIRONMENT: return createEnvironment();
			case EMFEcoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER: return createDataProductsListsContainer();
			case EMFEcoreInvocatorPackage.DATA_PRODUCTS_LIST: return createDataProductsList();
			case EMFEcoreInvocatorPackage.TOOLS_LIST: return createToolsList();
			case EMFEcoreInvocatorPackage.TYPES_LIST: return createTypesList();
			case EMFEcoreInvocatorPackage.LOCAL_TYPES_LIST: return createLocalTypesList();
			case EMFEcoreInvocatorPackage.REGISTERED_TYPES_LIST: return createRegisteredTypesList();
			case EMFEcoreInvocatorPackage.TYPE: return createType();
			case EMFEcoreInvocatorPackage.TYPE_API_ADAPTER: return createTypeApiAdapter();
			case EMFEcoreInvocatorPackage.TYPE_MEMBER: return createTypeMember();
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_REFERENCE: return createTypeMemberReference();
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT: return createTypeMemberReferenceListElement();
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT: return createTypeMemberReferenceTreeElement();
			case EMFEcoreInvocatorPackage.VARIABLES_LIST: return createVariablesList();
			case EMFEcoreInvocatorPackage.VARIABLE: return createVariable();
			case EMFEcoreInvocatorPackage.CONTEXTS_LIST: return createContextsList();
			case EMFEcoreInvocatorPackage.BASIC_CONTEXT: return createBasicContext();
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST: return createVariableImplementationsList();
			case EMFEcoreInvocatorPackage.INITIALIZATION_DATA: return createInitializationData();
			case EMFEcoreInvocatorPackage.VARIABLE_IMPLEMENTATION: return createVariableImplementation();
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATION: return createTypeMemberImplementation();
			case EMFEcoreInvocatorPackage.VALUES_LIST: return createValuesList();
			case EMFEcoreInvocatorPackage.VALUE: return createValue();
			case EMFEcoreInvocatorPackage.PROGRAMS_LIST: return createProgramsList();
			case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST: return createOperationCallsList();
			case EMFEcoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE: return createVariableFeatureReference();
			case EMFEcoreInvocatorPackage.OPERATION_CALL: return createOperationCall();
			case EMFEcoreInvocatorPackage.ARGUMENTS_LIST: return createArgumentsList();
			case EMFEcoreInvocatorPackage.EDATA_TYPE_ARGUMENT: return createEDataTypeArgument();
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT: return createEEnumArgument();
			case EMFEcoreInvocatorPackage.ECLASS_ARGUMENT: return createEClassArgument();
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST: return createOperationCallResultsList();
			case EMFEcoreInvocatorPackage.RECORDING_RESULTS_LIST: return createRecordingResultsList();
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT: return createOperationCallResult();
			case EMFEcoreInvocatorPackage.EXCEPTION_CONTAINER: return createExceptionContainer();
			case EMFEcoreInvocatorPackage.ATTRIBUTE_RESULT_VALUE: return createAttributeResultValue();
			case EMFEcoreInvocatorPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case EMFEcoreInvocatorPackage.REFERENCE_RESULT_VALUE: return createReferenceResultValue();
			case EMFEcoreInvocatorPackage.WATCHES_LISTS_CONTAINER: return createWatchesListsContainer();
			case EMFEcoreInvocatorPackage.WATCHES_LIST: return createWatchesList();
			case EMFEcoreInvocatorPackage.WATCH: return createWatch();
			case EMFEcoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER: return createWatchFeatureNodeAdapter();
			case EMFEcoreInvocatorPackage.DISPLAYS_LISTS_CONTAINER: return createDisplaysListsContainer();
			case EMFEcoreInvocatorPackage.DISPLAYS_LIST: return createDisplaysList();
			case EMFEcoreInvocatorPackage.RECORDING_TOOLS_CONTAINER: return createRecordingToolsContainer();
			case EMFEcoreInvocatorPackage.CHANNELS_LIST: return createChannelsList();
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE: return createOperationCallResultsListTimeSource();
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
			case EMFEcoreInvocatorPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			case EMFEcoreInvocatorPackage.NOTIFICATION:
				return createNotificationFromString(eDataType, initialValue);
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATIONS_ELIST:
				return createTypeMemberImplementationsEListFromString(eDataType, initialValue);
			case EMFEcoreInvocatorPackage.TYPE_MEMBERS_ARRAY:
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
			case EMFEcoreInvocatorPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			case EMFEcoreInvocatorPackage.NOTIFICATION:
				return convertNotificationToString(eDataType, instanceValue);
			case EMFEcoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATIONS_ELIST:
				return convertTypeMemberImplementationsEListToString(eDataType, instanceValue);
			case EMFEcoreInvocatorPackage.TYPE_MEMBERS_ARRAY:
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
  public EMFEcoreInvocatorPackage getEMFEcoreInvocatorPackage()
  {
		return (EMFEcoreInvocatorPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EMFEcoreInvocatorPackage getPackage()
  {
		return EMFEcoreInvocatorPackage.eINSTANCE;
	}

} //EMFEcoreInvocatorFactoryImpl
