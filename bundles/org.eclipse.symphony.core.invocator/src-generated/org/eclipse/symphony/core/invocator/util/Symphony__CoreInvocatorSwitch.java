/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.util;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.common.emf.BrowseableTimeSource;
import org.eclipse.symphony.common.emf.CollectionTimedTimeSource;
import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Disposable;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.TimeSource;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.core.invocator.AbstractChannel;
import org.eclipse.symphony.core.invocator.AbstractDisplay;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.AbstractPlayer;
import org.eclipse.symphony.core.invocator.AbstractRecorder;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.AbstractResultValue;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;
import org.eclipse.symphony.core.invocator.AbstractType;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.Argument;
import org.eclipse.symphony.core.invocator.ArgumentsList;
import org.eclipse.symphony.core.invocator.AttributeResultValue;
import org.eclipse.symphony.core.invocator.AttributeValue;
import org.eclipse.symphony.core.invocator.BasicContext;
import org.eclipse.symphony.core.invocator.ChannelsList;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.DataProductsList;
import org.eclipse.symphony.core.invocator.DataProductsListsContainer;
import org.eclipse.symphony.core.invocator.DisplaysList;
import org.eclipse.symphony.core.invocator.DisplaysListsContainer;
import org.eclipse.symphony.core.invocator.EClassArgument;
import org.eclipse.symphony.core.invocator.EDataTypeArgument;
import org.eclipse.symphony.core.invocator.EEnumArgument;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.ExceptionContainer;
import org.eclipse.symphony.core.invocator.InitializationData;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.LocalTypesList;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallContainer;
import org.eclipse.symphony.core.invocator.OperationCallResult;
import org.eclipse.symphony.core.invocator.OperationCallResultsList;
import org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource;
import org.eclipse.symphony.core.invocator.OperationCallsList;
import org.eclipse.symphony.core.invocator.Program;
import org.eclipse.symphony.core.invocator.ProgramsList;
import org.eclipse.symphony.core.invocator.RecordingResultsList;
import org.eclipse.symphony.core.invocator.RecordingToolsContainer;
import org.eclipse.symphony.core.invocator.ReferenceResultValue;
import org.eclipse.symphony.core.invocator.RegisteredTypesList;
import org.eclipse.symphony.core.invocator.ResultsList;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage
 * @generated
 */
public class Symphony__CoreInvocatorSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static Symphony__CoreInvocatorPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__CoreInvocatorSwitch()
  {
		if (modelPackage == null) {
			modelPackage = Symphony__CoreInvocatorPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case Symphony__CoreInvocatorPackage.SYMPHONY_CORE_INVOCATOR_FACADE: {
				Symphony__CoreInvocatorFacade symphony__CoreInvocatorFacade = (Symphony__CoreInvocatorFacade)theEObject;
				T result = caseSymphony__CoreInvocatorFacade(symphony__CoreInvocatorFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.INVOCATOR_SESSION: {
				InvocatorSession invocatorSession = (InvocatorSession)theEObject;
				T result = caseInvocatorSession(invocatorSession);
				if (result == null) result = caseNamed(invocatorSession);
				if (result == null) result = caseDescribed(invocatorSession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = caseNamed(environment);
				if (result == null) result = caseDescribed(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER: {
				DataProductsListsContainer dataProductsListsContainer = (DataProductsListsContainer)theEObject;
				T result = caseDataProductsListsContainer(dataProductsListsContainer);
				if (result == null) result = caseNamed(dataProductsListsContainer);
				if (result == null) result = caseDescribed(dataProductsListsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.DATA_PRODUCTS_LIST: {
				DataProductsList dataProductsList = (DataProductsList)theEObject;
				T result = caseDataProductsList(dataProductsList);
				if (result == null) result = caseNamed(dataProductsList);
				if (result == null) result = caseDescribed(dataProductsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TOOLS_LIST: {
				ToolsList toolsList = (ToolsList)theEObject;
				T result = caseToolsList(toolsList);
				if (result == null) result = caseNamed(toolsList);
				if (result == null) result = caseDescribed(toolsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_TOOLS_LIST_CONTAINER: {
				AbstractToolsListContainer abstractToolsListContainer = (AbstractToolsListContainer)theEObject;
				T result = caseAbstractToolsListContainer(abstractToolsListContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPES_LIST: {
				TypesList typesList = (TypesList)theEObject;
				T result = caseTypesList(typesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.LOCAL_TYPES_LIST: {
				LocalTypesList localTypesList = (LocalTypesList)theEObject;
				T result = caseLocalTypesList(localTypesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.REGISTERED_TYPES_LIST: {
				RegisteredTypesList registeredTypesList = (RegisteredTypesList)theEObject;
				T result = caseRegisteredTypesList(registeredTypesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseNamed(type);
				if (result == null) result = caseAbstractType(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER: {
				TypeApiAdapter typeApiAdapter = (TypeApiAdapter)theEObject;
				T result = caseTypeApiAdapter(typeApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER: {
				TypeMember typeMember = (TypeMember)theEObject;
				T result = caseTypeMember(typeMember);
				if (result == null) result = caseNamed(typeMember);
				if (result == null) result = caseAbstractType(typeMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE: {
				TypeMemberReference typeMemberReference = (TypeMemberReference)theEObject;
				T result = caseTypeMemberReference(typeMemberReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_LIST_ELEMENT: {
				TypeMemberReferenceListElement typeMemberReferenceListElement = (TypeMemberReferenceListElement)theEObject;
				T result = caseTypeMemberReferenceListElement(typeMemberReferenceListElement);
				if (result == null) result = caseTypeMemberReference(typeMemberReferenceListElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT: {
				TypeMemberReferenceTreeElement typeMemberReferenceTreeElement = (TypeMemberReferenceTreeElement)theEObject;
				T result = caseTypeMemberReferenceTreeElement(typeMemberReferenceTreeElement);
				if (result == null) result = caseTypeMemberReference(typeMemberReferenceTreeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.VARIABLES_LIST: {
				VariablesList variablesList = (VariablesList)theEObject;
				T result = caseVariablesList(variablesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseNamed(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.CONTEXTS_LIST: {
				ContextsList contextsList = (ContextsList)theEObject;
				T result = caseContextsList(contextsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseNamed(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.BASIC_CONTEXT: {
				BasicContext basicContext = (BasicContext)theEObject;
				T result = caseBasicContext(basicContext);
				if (result == null) result = caseContext(basicContext);
				if (result == null) result = caseNamed(basicContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.VARIABLE_IMPLEMENTATIONS_LIST: {
				VariableImplementationsList variableImplementationsList = (VariableImplementationsList)theEObject;
				T result = caseVariableImplementationsList(variableImplementationsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_INITIALIZATION_DATA: {
				AbstractInitializationData abstractInitializationData = (AbstractInitializationData)theEObject;
				T result = caseAbstractInitializationData(abstractInitializationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.INITIALIZATION_DATA: {
				InitializationData initializationData = (InitializationData)theEObject;
				T result = caseInitializationData(initializationData);
				if (result == null) result = caseAbstractInitializationData(initializationData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_TYPE_IMPLEMENTATION: {
				AbstractTypeImplementation abstractTypeImplementation = (AbstractTypeImplementation)theEObject;
				T result = caseAbstractTypeImplementation(abstractTypeImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.VARIABLE_IMPLEMENTATION: {
				VariableImplementation variableImplementation = (VariableImplementation)theEObject;
				T result = caseVariableImplementation(variableImplementation);
				if (result == null) result = caseAbstractTypeImplementation(variableImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.TYPE_MEMBER_IMPLEMENTATION: {
				TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation)theEObject;
				T result = caseTypeMemberImplementation(typeMemberImplementation);
				if (result == null) result = caseAbstractTypeImplementation(typeMemberImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.VALUES_LIST: {
				ValuesList valuesList = (ValuesList)theEObject;
				T result = caseValuesList(valuesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseNamed(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.PROGRAMS_LIST: {
				ProgramsList programsList = (ProgramsList)theEObject;
				T result = caseProgramsList(programsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.PROGRAM: {
				Program program = (Program)theEObject;
				T result = caseProgram(program);
				if (result == null) result = caseNamed(program);
				if (result == null) result = caseDescribed(program);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.OPERATION_CALL_CONTAINER: {
				OperationCallContainer operationCallContainer = (OperationCallContainer)theEObject;
				T result = caseOperationCallContainer(operationCallContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.OPERATION_CALLS_LIST: {
				OperationCallsList operationCallsList = (OperationCallsList)theEObject;
				T result = caseOperationCallsList(operationCallsList);
				if (result == null) result = caseProgram(operationCallsList);
				if (result == null) result = caseOperationCallContainer(operationCallsList);
				if (result == null) result = caseNamed(operationCallsList);
				if (result == null) result = caseDescribed(operationCallsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.VARIABLE_FEATURE_REFERENCE: {
				VariableFeatureReference variableFeatureReference = (VariableFeatureReference)theEObject;
				T result = caseVariableFeatureReference(variableFeatureReference);
				if (result == null) result = caseNamed(variableFeatureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.OPERATION_CALL: {
				OperationCall operationCall = (OperationCall)theEObject;
				T result = caseOperationCall(operationCall);
				if (result == null) result = caseVariableFeatureReference(operationCall);
				if (result == null) result = caseDescribed(operationCall);
				if (result == null) result = caseNamed(operationCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ARGUMENTS_LIST: {
				ArgumentsList argumentsList = (ArgumentsList)theEObject;
				T result = caseArgumentsList(argumentsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.EDATA_TYPE_ARGUMENT: {
				EDataTypeArgument eDataTypeArgument = (EDataTypeArgument)theEObject;
				T result = caseEDataTypeArgument(eDataTypeArgument);
				if (result == null) result = caseArgument(eDataTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.EENUM_ARGUMENT: {
				EEnumArgument eEnumArgument = (EEnumArgument)theEObject;
				T result = caseEEnumArgument(eEnumArgument);
				if (result == null) result = caseArgument(eEnumArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ECLASS_ARGUMENT: {
				EClassArgument eClassArgument = (EClassArgument)theEObject;
				T result = caseEClassArgument(eClassArgument);
				if (result == null) result = caseArgument(eClassArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.RESULTS_LIST: {
				ResultsList resultsList = (ResultsList)theEObject;
				T result = caseResultsList(resultsList);
				if (result == null) result = caseNamed(resultsList);
				if (result == null) result = caseDescribed(resultsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST: {
				OperationCallResultsList operationCallResultsList = (OperationCallResultsList)theEObject;
				T result = caseOperationCallResultsList(operationCallResultsList);
				if (result == null) result = caseResultsList(operationCallResultsList);
				if (result == null) result = caseNamed(operationCallResultsList);
				if (result == null) result = caseDescribed(operationCallResultsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.RECORDING_RESULTS_LIST: {
				RecordingResultsList recordingResultsList = (RecordingResultsList)theEObject;
				T result = caseRecordingResultsList(recordingResultsList);
				if (result == null) result = caseResultsList(recordingResultsList);
				if (result == null) result = caseNamed(recordingResultsList);
				if (result == null) result = caseDescribed(recordingResultsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_RESULT: {
				AbstractResult abstractResult = (AbstractResult)theEObject;
				T result = caseAbstractResult(abstractResult);
				if (result == null) result = caseTimed(abstractResult);
				if (result == null) result = caseDescribed(abstractResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_RESULT_VALUE: {
				AbstractResultValue abstractResultValue = (AbstractResultValue)theEObject;
				T result = caseAbstractResultValue(abstractResultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULT: {
				OperationCallResult operationCallResult = (OperationCallResult)theEObject;
				T result = caseOperationCallResult(operationCallResult);
				if (result == null) result = caseAbstractResult(operationCallResult);
				if (result == null) result = caseOperationCallContainer(operationCallResult);
				if (result == null) result = caseTimed(operationCallResult);
				if (result == null) result = caseDescribed(operationCallResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.EXCEPTION_CONTAINER: {
				ExceptionContainer exceptionContainer = (ExceptionContainer)theEObject;
				T result = caseExceptionContainer(exceptionContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ATTRIBUTE_RESULT_VALUE: {
				AttributeResultValue attributeResultValue = (AttributeResultValue)theEObject;
				T result = caseAttributeResultValue(attributeResultValue);
				if (result == null) result = caseAbstractResultValue(attributeResultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.REFERENCE_RESULT_VALUE: {
				ReferenceResultValue referenceResultValue = (ReferenceResultValue)theEObject;
				T result = caseReferenceResultValue(referenceResultValue);
				if (result == null) result = caseAbstractResultValue(referenceResultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.WATCHES_LISTS_CONTAINER: {
				WatchesListsContainer watchesListsContainer = (WatchesListsContainer)theEObject;
				T result = caseWatchesListsContainer(watchesListsContainer);
				if (result == null) result = caseAbstractToolsListContainer(watchesListsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.WATCHES_LIST: {
				WatchesList watchesList = (WatchesList)theEObject;
				T result = caseWatchesList(watchesList);
				if (result == null) result = caseNamed(watchesList);
				if (result == null) result = caseDescribed(watchesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.WATCH: {
				Watch watch = (Watch)theEObject;
				T result = caseWatch(watch);
				if (result == null) result = caseNamed(watch);
				if (result == null) result = caseDescribed(watch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.WATCH_FEATURE_NODE_ADAPTER: {
				WatchFeatureNodeAdapter watchFeatureNodeAdapter = (WatchFeatureNodeAdapter)theEObject;
				T result = caseWatchFeatureNodeAdapter(watchFeatureNodeAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.DISPLAYS_LISTS_CONTAINER: {
				DisplaysListsContainer displaysListsContainer = (DisplaysListsContainer)theEObject;
				T result = caseDisplaysListsContainer(displaysListsContainer);
				if (result == null) result = caseAbstractToolsListContainer(displaysListsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.DISPLAYS_LIST: {
				DisplaysList displaysList = (DisplaysList)theEObject;
				T result = caseDisplaysList(displaysList);
				if (result == null) result = caseNamed(displaysList);
				if (result == null) result = caseDescribed(displaysList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_DISPLAY: {
				AbstractDisplay abstractDisplay = (AbstractDisplay)theEObject;
				T result = caseAbstractDisplay(abstractDisplay);
				if (result == null) result = caseDescribed(abstractDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.RECORDING_TOOLS_CONTAINER: {
				RecordingToolsContainer recordingToolsContainer = (RecordingToolsContainer)theEObject;
				T result = caseRecordingToolsContainer(recordingToolsContainer);
				if (result == null) result = caseAbstractToolsListContainer(recordingToolsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.CHANNELS_LIST: {
				ChannelsList channelsList = (ChannelsList)theEObject;
				T result = caseChannelsList(channelsList);
				if (result == null) result = caseNamed(channelsList);
				if (result == null) result = caseDescribed(channelsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_CHANNEL: {
				AbstractChannel abstractChannel = (AbstractChannel)theEObject;
				T result = caseAbstractChannel(abstractChannel);
				if (result == null) result = caseNamed(abstractChannel);
				if (result == null) result = caseDescribed(abstractChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_RECORDER: {
				AbstractRecorder abstractRecorder = (AbstractRecorder)theEObject;
				T result = caseAbstractRecorder(abstractRecorder);
				if (result == null) result = caseNamed(abstractRecorder);
				if (result == null) result = caseDescribed(abstractRecorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.ABSTRACT_PLAYER: {
				AbstractPlayer abstractPlayer = (AbstractPlayer)theEObject;
				T result = caseAbstractPlayer(abstractPlayer);
				if (result == null) result = caseNamed(abstractPlayer);
				if (result == null) result = caseDescribed(abstractPlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Symphony__CoreInvocatorPackage.OPERATION_CALL_RESULTS_LIST_TIME_SOURCE: {
				OperationCallResultsListTimeSource operationCallResultsListTimeSource = (OperationCallResultsListTimeSource)theEObject;
				T result = caseOperationCallResultsListTimeSource(operationCallResultsListTimeSource);
				if (result == null) result = caseCollectionTimedTimeSource(operationCallResultsListTimeSource);
				if (result == null) result = caseBrowseableTimeSource(operationCallResultsListTimeSource);
				if (result == null) result = caseTimeSource(operationCallResultsListTimeSource);
				if (result == null) result = caseTimed(operationCallResultsListTimeSource);
				if (result == null) result = caseDisposable(operationCallResultsListTimeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymphony__CoreInvocatorFacade(Symphony__CoreInvocatorFacade object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Invocator Session</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invocator Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInvocatorSession(InvocatorSession object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEnvironment(Environment object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Products Lists Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Products Lists Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDataProductsListsContainer(DataProductsListsContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Data Products List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Products List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDataProductsList(DataProductsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Tools List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tools List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseToolsList(ToolsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractToolsListContainer(AbstractToolsListContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Types List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Types List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypesList(TypesList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Local Types List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Types List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLocalTypesList(LocalTypesList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Registered Types List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered Types List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRegisteredTypesList(RegisteredTypesList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractType(AbstractType object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseType(Type object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeApiAdapter(TypeApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Member</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeMember(TypeMember object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Member Reference</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Member Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeMemberReference(TypeMemberReference object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Member Reference List Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Member Reference List Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeMemberReferenceListElement(TypeMemberReferenceListElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Member Reference Tree Element</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Member Reference Tree Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variables List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variables List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariablesList(VariablesList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariable(Variable object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Contexts List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contexts List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseContextsList(ContextsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseContext(Context object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Context</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBasicContext(BasicContext object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Implementations List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Implementations List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariableImplementationsList(VariableImplementationsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractInitializationData(AbstractInitializationData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseInitializationData(InitializationData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Implementation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractTypeImplementation(AbstractTypeImplementation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Implementation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariableImplementation(VariableImplementation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Member Implementation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Member Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTypeMemberImplementation(TypeMemberImplementation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Values List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Values List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValuesList(ValuesList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseValue(Value object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Programs List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programs List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProgramsList(ProgramsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProgram(Program object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperationCallContainer(OperationCallContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Calls List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Calls List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperationCallsList(OperationCallsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Feature Reference</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariableFeatureReference(VariableFeatureReference object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperationCall(OperationCall object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Arguments List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arguments List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArgumentsList(ArgumentsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArgument(Argument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EData Type Argument</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEDataTypeArgument(EDataTypeArgument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EEnum Argument</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EEnum Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEEnumArgument(EEnumArgument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EClass Argument</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEClassArgument(EClassArgument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Results List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResultsList(ResultsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Results List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Results List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperationCallResultsList(OperationCallResultsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Recording Results List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recording Results List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRecordingResultsList(RecordingResultsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Result</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractResult(AbstractResult object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Result Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Result Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractResultValue(AbstractResultValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Result</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperationCallResult(OperationCallResult object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Exception Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExceptionContainer(ExceptionContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Result Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Result Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAttributeResultValue(AttributeResultValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAttributeValue(AttributeValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Result Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Result Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseReferenceResultValue(ReferenceResultValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Watches Lists Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Watches Lists Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWatchesListsContainer(WatchesListsContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Watches List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Watches List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWatchesList(WatchesList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Watch</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Watch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWatch(Watch object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Watch Feature Node Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Watch Feature Node Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWatchFeatureNodeAdapter(WatchFeatureNodeAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Displays Lists Container</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displays Lists Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDisplaysListsContainer(DisplaysListsContainer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Displays List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displays List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDisplaysList(DisplaysList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Display</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractDisplay(AbstractDisplay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Recording Tools Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recording Tools Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordingToolsContainer(RecordingToolsContainer object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Channels List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channels List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelsList(ChannelsList object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractChannel(AbstractChannel object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Recorder</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Recorder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractRecorder(AbstractRecorder object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Player</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractPlayer(AbstractPlayer object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Results List Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Results List Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallResultsListTimeSource(OperationCallResultsListTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimed(Timed object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Disposable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disposable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisposable(Disposable object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSource(TimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Browseable Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Browseable Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrowseableTimeSource(BrowseableTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Timed Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Timed Time Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionTimedTimeSource(CollectionTimedTimeSource object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //Symphony__CoreInvocatorSwitch