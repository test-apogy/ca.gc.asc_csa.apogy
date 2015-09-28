/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.util;


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.CollectionTimedTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Disposable;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractChannel;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractDisplay;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractPlayer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractRecorder;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractToolsListContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractType;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.BasicContext;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ContextsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysListsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EClassArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EDataTypeArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EEnumArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ExceptionContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.LocalTypesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsListTimeSource;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingResultsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.RegisteredTypesList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ResultsList;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage
 * @generated
 */
public class EMFEcoreInvocatorAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static EMFEcoreInvocatorPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = EMFEcoreInvocatorPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EMFEcoreInvocatorSwitch<Adapter> modelSwitch =
    new EMFEcoreInvocatorSwitch<Adapter>() {
			@Override
			public Adapter caseEMFEcoreInvocatorFacade(EMFEcoreInvocatorFacade object) {
				return createEMFEcoreInvocatorFacadeAdapter();
			}
			@Override
			public Adapter caseInvocatorSession(InvocatorSession object) {
				return createInvocatorSessionAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseDataProductsListsContainer(DataProductsListsContainer object) {
				return createDataProductsListsContainerAdapter();
			}
			@Override
			public Adapter caseDataProductsList(DataProductsList object) {
				return createDataProductsListAdapter();
			}
			@Override
			public Adapter caseToolsList(ToolsList object) {
				return createToolsListAdapter();
			}
			@Override
			public Adapter caseAbstractToolsListContainer(AbstractToolsListContainer object) {
				return createAbstractToolsListContainerAdapter();
			}
			@Override
			public Adapter caseTypesList(TypesList object) {
				return createTypesListAdapter();
			}
			@Override
			public Adapter caseLocalTypesList(LocalTypesList object) {
				return createLocalTypesListAdapter();
			}
			@Override
			public Adapter caseRegisteredTypesList(RegisteredTypesList object) {
				return createRegisteredTypesListAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTypeApiAdapter(TypeApiAdapter object) {
				return createTypeApiAdapterAdapter();
			}
			@Override
			public Adapter caseTypeMember(TypeMember object) {
				return createTypeMemberAdapter();
			}
			@Override
			public Adapter caseTypeMemberReference(TypeMemberReference object) {
				return createTypeMemberReferenceAdapter();
			}
			@Override
			public Adapter caseTypeMemberReferenceListElement(TypeMemberReferenceListElement object) {
				return createTypeMemberReferenceListElementAdapter();
			}
			@Override
			public Adapter caseTypeMemberReferenceTreeElement(TypeMemberReferenceTreeElement object) {
				return createTypeMemberReferenceTreeElementAdapter();
			}
			@Override
			public Adapter caseVariablesList(VariablesList object) {
				return createVariablesListAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseContextsList(ContextsList object) {
				return createContextsListAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseBasicContext(BasicContext object) {
				return createBasicContextAdapter();
			}
			@Override
			public Adapter caseVariableImplementationsList(VariableImplementationsList object) {
				return createVariableImplementationsListAdapter();
			}
			@Override
			public Adapter caseAbstractInitializationData(AbstractInitializationData object) {
				return createAbstractInitializationDataAdapter();
			}
			@Override
			public Adapter caseInitializationData(InitializationData object) {
				return createInitializationDataAdapter();
			}
			@Override
			public Adapter caseAbstractTypeImplementation(AbstractTypeImplementation object) {
				return createAbstractTypeImplementationAdapter();
			}
			@Override
			public Adapter caseVariableImplementation(VariableImplementation object) {
				return createVariableImplementationAdapter();
			}
			@Override
			public Adapter caseTypeMemberImplementation(TypeMemberImplementation object) {
				return createTypeMemberImplementationAdapter();
			}
			@Override
			public Adapter caseValuesList(ValuesList object) {
				return createValuesListAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseProgramsList(ProgramsList object) {
				return createProgramsListAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseOperationCallContainer(OperationCallContainer object) {
				return createOperationCallContainerAdapter();
			}
			@Override
			public Adapter caseOperationCallsList(OperationCallsList object) {
				return createOperationCallsListAdapter();
			}
			@Override
			public Adapter caseVariableFeatureReference(VariableFeatureReference object) {
				return createVariableFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseOperationCall(OperationCall object) {
				return createOperationCallAdapter();
			}
			@Override
			public Adapter caseArgumentsList(ArgumentsList object) {
				return createArgumentsListAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseEDataTypeArgument(EDataTypeArgument object) {
				return createEDataTypeArgumentAdapter();
			}
			@Override
			public Adapter caseEEnumArgument(EEnumArgument object) {
				return createEEnumArgumentAdapter();
			}
			@Override
			public Adapter caseEClassArgument(EClassArgument object) {
				return createEClassArgumentAdapter();
			}
			@Override
			public Adapter caseResultsList(ResultsList object) {
				return createResultsListAdapter();
			}
			@Override
			public Adapter caseOperationCallResultsList(OperationCallResultsList object) {
				return createOperationCallResultsListAdapter();
			}
			@Override
			public Adapter caseRecordingResultsList(RecordingResultsList object) {
				return createRecordingResultsListAdapter();
			}
			@Override
			public Adapter caseAbstractResult(AbstractResult object) {
				return createAbstractResultAdapter();
			}
			@Override
			public Adapter caseAbstractResultValue(AbstractResultValue object) {
				return createAbstractResultValueAdapter();
			}
			@Override
			public Adapter caseOperationCallResult(OperationCallResult object) {
				return createOperationCallResultAdapter();
			}
			@Override
			public Adapter caseExceptionContainer(ExceptionContainer object) {
				return createExceptionContainerAdapter();
			}
			@Override
			public Adapter caseAttributeResultValue(AttributeResultValue object) {
				return createAttributeResultValueAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseReferenceResultValue(ReferenceResultValue object) {
				return createReferenceResultValueAdapter();
			}
			@Override
			public Adapter caseWatchesListsContainer(WatchesListsContainer object) {
				return createWatchesListsContainerAdapter();
			}
			@Override
			public Adapter caseWatchesList(WatchesList object) {
				return createWatchesListAdapter();
			}
			@Override
			public Adapter caseWatch(Watch object) {
				return createWatchAdapter();
			}
			@Override
			public Adapter caseWatchFeatureNodeAdapter(WatchFeatureNodeAdapter object) {
				return createWatchFeatureNodeAdapterAdapter();
			}
			@Override
			public Adapter caseDisplaysListsContainer(DisplaysListsContainer object) {
				return createDisplaysListsContainerAdapter();
			}
			@Override
			public Adapter caseDisplaysList(DisplaysList object) {
				return createDisplaysListAdapter();
			}
			@Override
			public Adapter caseAbstractDisplay(AbstractDisplay object) {
				return createAbstractDisplayAdapter();
			}
			@Override
			public Adapter caseRecordingToolsContainer(RecordingToolsContainer object) {
				return createRecordingToolsContainerAdapter();
			}
			@Override
			public Adapter caseChannelsList(ChannelsList object) {
				return createChannelsListAdapter();
			}
			@Override
			public Adapter caseAbstractChannel(AbstractChannel object) {
				return createAbstractChannelAdapter();
			}
			@Override
			public Adapter caseAbstractRecorder(AbstractRecorder object) {
				return createAbstractRecorderAdapter();
			}
			@Override
			public Adapter caseAbstractPlayer(AbstractPlayer object) {
				return createAbstractPlayerAdapter();
			}
			@Override
			public Adapter caseOperationCallResultsListTimeSource(OperationCallResultsListTimeSource object) {
				return createOperationCallResultsListTimeSourceAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseDisposable(Disposable object) {
				return createDisposableAdapter();
			}
			@Override
			public Adapter caseTimeSource(TimeSource object) {
				return createTimeSourceAdapter();
			}
			@Override
			public Adapter caseBrowseableTimeSource(BrowseableTimeSource object) {
				return createBrowseableTimeSourceAdapter();
			}
			@Override
			public Adapter caseCollectionTimedTimeSource(CollectionTimedTimeSource object) {
				return createCollectionTimedTimeSourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade
	 * @generated
	 */
  public Adapter createEMFEcoreInvocatorFacadeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession
	 * @generated
	 */
  public Adapter createInvocatorSessionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Environment
	 * @generated
	 */
  public Adapter createEnvironmentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsListsContainer
	 * @generated
	 */
  public Adapter createDataProductsListsContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList
	 * @generated
	 */
  public Adapter createDataProductsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ToolsList
	 * @generated
	 */
  public Adapter createToolsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractToolsListContainer <em>Abstract Tools List Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractToolsListContainer
	 * @generated
	 */
  public Adapter createAbstractToolsListContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypesList <em>Types List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypesList
	 * @generated
	 */
  public Adapter createTypesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.LocalTypesList <em>Local Types List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.LocalTypesList
	 * @generated
	 */
  public Adapter createLocalTypesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RegisteredTypesList <em>Registered Types List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.RegisteredTypesList
	 * @generated
	 */
  public Adapter createRegisteredTypesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractType
	 * @generated
	 */
  public Adapter createAbstractTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type
	 * @generated
	 */
  public Adapter createTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter <em>Type Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter
	 * @generated
	 */
  public Adapter createTypeApiAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMember
	 * @generated
	 */
  public Adapter createTypeMemberAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReference <em>Type Member Reference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReference
	 * @generated
	 */
  public Adapter createTypeMemberReferenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement <em>Type Member Reference List Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceListElement
	 * @generated
	 */
  public Adapter createTypeMemberReferenceListElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceTreeElement
	 * @generated
	 */
  public Adapter createTypeMemberReferenceTreeElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariablesList
	 * @generated
	 */
  public Adapter createVariablesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable
	 * @generated
	 */
  public Adapter createVariableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ContextsList
	 * @generated
	 */
  public Adapter createContextsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context
	 * @generated
	 */
  public Adapter createContextAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.BasicContext <em>Basic Context</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.BasicContext
	 * @generated
	 */
  public Adapter createBasicContextAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementationsList
	 * @generated
	 */
  public Adapter createVariableImplementationsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData
	 * @generated
	 */
  public Adapter createAbstractInitializationDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData <em>Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData
	 * @generated
	 */
  public Adapter createInitializationDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation <em>Abstract Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation
	 * @generated
	 */
  public Adapter createAbstractTypeImplementationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation <em>Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation
	 * @generated
	 */
  public Adapter createVariableImplementationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberImplementation <em>Type Member Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberImplementation
	 * @generated
	 */
  public Adapter createTypeMemberImplementationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ValuesList <em>Values List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ValuesList
	 * @generated
	 */
  public Adapter createValuesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Value
	 * @generated
	 */
  public Adapter createValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList
	 * @generated
	 */
  public Adapter createProgramsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program
	 * @generated
	 */
  public Adapter createProgramAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer
	 * @generated
	 */
  public Adapter createOperationCallContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallsList <em>Operation Calls List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallsList
	 * @generated
	 */
  public Adapter createOperationCallsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference
	 * @generated
	 */
  public Adapter createVariableFeatureReferenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall
	 * @generated
	 */
  public Adapter createOperationCallAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ArgumentsList
	 * @generated
	 */
  public Adapter createArgumentsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument
	 * @generated
	 */
  public Adapter createArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.EDataTypeArgument <em>EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EDataTypeArgument
	 * @generated
	 */
  public Adapter createEDataTypeArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.EEnumArgument <em>EEnum Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EEnumArgument
	 * @generated
	 */
  public Adapter createEEnumArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.EClassArgument <em>EClass Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EClassArgument
	 * @generated
	 */
  public Adapter createEClassArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ResultsList
	 * @generated
	 */
  public Adapter createResultsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsList <em>Operation Call Results List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsList
	 * @generated
	 */
  public Adapter createOperationCallResultsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingResultsList <em>Recording Results List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingResultsList
	 * @generated
	 */
  public Adapter createRecordingResultsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult <em>Abstract Result</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult
	 * @generated
	 */
  public Adapter createAbstractResultAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResultValue <em>Abstract Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResultValue
	 * @generated
	 */
  public Adapter createAbstractResultValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult <em>Operation Call Result</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResult
	 * @generated
	 */
  public Adapter createOperationCallResultAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ExceptionContainer <em>Exception Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ExceptionContainer
	 * @generated
	 */
  public Adapter createExceptionContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeResultValue <em>Attribute Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeResultValue
	 * @generated
	 */
  public Adapter createAttributeResultValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeValue
	 * @generated
	 */
  public Adapter createAttributeValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue <em>Reference Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue
	 * @generated
	 */
  public Adapter createReferenceResultValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesListsContainer <em>Watches Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesListsContainer
	 * @generated
	 */
  public Adapter createWatchesListsContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList <em>Watches List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList
	 * @generated
	 */
  public Adapter createWatchesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch <em>Watch</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch
	 * @generated
	 */
  public Adapter createWatchAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchFeatureNodeAdapter <em>Watch Feature Node Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchFeatureNodeAdapter
	 * @generated
	 */
  public Adapter createWatchFeatureNodeAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysListsContainer <em>Displays Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysListsContainer
	 * @generated
	 */
  public Adapter createDisplaysListsContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysList <em>Displays List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysList
	 * @generated
	 */
  public Adapter createDisplaysListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractDisplay <em>Abstract Display</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractDisplay
	 * @generated
	 */
  public Adapter createAbstractDisplayAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer
	 * @generated
	 */
	public Adapter createRecordingToolsContainerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList <em>Channels List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList
	 * @generated
	 */
	public Adapter createChannelsListAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractChannel <em>Abstract Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractChannel
	 * @generated
	 */
	public Adapter createAbstractChannelAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractRecorder <em>Abstract Recorder</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractRecorder
	 * @generated
	 */
  public Adapter createAbstractRecorderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractPlayer <em>Abstract Player</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractPlayer
	 * @generated
	 */
  public Adapter createAbstractPlayerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsListTimeSource <em>Operation Call Results List Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallResultsListTimeSource
	 * @generated
	 */
	public Adapter createOperationCallResultsListTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Named
	 * @generated
	 */
  public Adapter createNamedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Described
	 * @generated
	 */
  public Adapter createDescribedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Timed
	 * @generated
	 */
  public Adapter createTimedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.Disposable <em>Disposable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.Disposable
	 * @generated
	 */
	public Adapter createDisposableAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.TimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.TimeSource
	 * @generated
	 */
	public Adapter createTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource <em>Browseable Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.BrowseableTimeSource
	 * @generated
	 */
	public Adapter createBrowseableTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.CollectionTimedTimeSource <em>Collection Timed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.CollectionTimedTimeSource
	 * @generated
	 */
	public Adapter createCollectionTimedTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //EMFEcoreInvocatorAdapterFactory
