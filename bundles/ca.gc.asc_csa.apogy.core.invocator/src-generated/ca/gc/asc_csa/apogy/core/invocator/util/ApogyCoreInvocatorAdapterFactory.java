package ca.gc.asc_csa.apogy.core.invocator.util;
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


import ca.gc.asc_csa.apogy.common.emf.Archivable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource;
import ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Disposable;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.core.invocator.*;
import ca.gc.asc_csa.apogy.core.invocator.AbstractChannel;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer;
import ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;
import ca.gc.asc_csa.apogy.core.invocator.AbstractType;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue;
import ca.gc.asc_csa.apogy.core.invocator.AttributeValue;
import ca.gc.asc_csa.apogy.core.invocator.BasicContext;
import ca.gc.asc_csa.apogy.core.invocator.ChannelsList;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.EClassArgument;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer;
import ca.gc.asc_csa.apogy.core.invocator.InitializationData;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.LocalTypesList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList;
import ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;
import ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList;
import ca.gc.asc_csa.apogy.core.invocator.ResultsList;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage
 * @generated
 */
public class ApogyCoreInvocatorAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyCoreInvocatorPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreInvocatorAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ApogyCoreInvocatorPackage.eINSTANCE;
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
  protected ApogyCoreInvocatorSwitch<Adapter> modelSwitch =
    new ApogyCoreInvocatorSwitch<Adapter>() {
			@Override
			public Adapter caseApogyCoreInvocatorFacade(ApogyCoreInvocatorFacade object) {
				return createApogyCoreInvocatorFacadeAdapter();
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
			public Adapter caseProgramsGroup(ProgramsGroup object) {
				return createProgramsGroupAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseScriptBasedProgram(ScriptBasedProgram object) {
				return createScriptBasedProgramAdapter();
			}
			@Override
			public Adapter caseTriggeredBasedProgram(TriggeredBasedProgram object) {
				return createTriggeredBasedProgramAdapter();
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
			public Adapter caseBooleanEDataTypeArgument(BooleanEDataTypeArgument object) {
				return createBooleanEDataTypeArgumentAdapter();
			}
			@Override
			public Adapter caseNumericEDataTypeArgument(NumericEDataTypeArgument object) {
				return createNumericEDataTypeArgumentAdapter();
			}
			@Override
			public Adapter caseStringEDataTypeArgument(StringEDataTypeArgument object) {
				return createStringEDataTypeArgumentAdapter();
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
			public Adapter caseProgramRuntimesList(ProgramRuntimesList object) {
				return createProgramRuntimesListAdapter();
			}
			@Override
			public Adapter caseAbstractProgramRuntime(AbstractProgramRuntime object) {
				return createAbstractProgramRuntimeAdapter();
			}
			@Override
			public Adapter caseOperationCallsListProgramRuntime(OperationCallsListProgramRuntime object) {
				return createOperationCallsListProgramRuntimeAdapter();
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
			public Adapter caseArchivable(Archivable object) {
				return createArchivableAdapter();
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
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade
	 * @generated
	 */
	public Adapter createApogyCoreInvocatorFacadeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession
	 * @generated
	 */
  public Adapter createInvocatorSessionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment
	 * @generated
	 */
  public Adapter createEnvironmentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer <em>Data Products Lists Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer
	 * @generated
	 */
  public Adapter createDataProductsListsContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList
	 * @generated
	 */
  public Adapter createDataProductsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ToolsList <em>Tools List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ToolsList
	 * @generated
	 */
  public Adapter createToolsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer <em>Abstract Tools List Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer
	 * @generated
	 */
  public Adapter createAbstractToolsListContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TypesList <em>Types List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypesList
	 * @generated
	 */
  public Adapter createTypesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.LocalTypesList <em>Local Types List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.LocalTypesList
	 * @generated
	 */
  public Adapter createLocalTypesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList <em>Registered Types List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList
	 * @generated
	 */
  public Adapter createRegisteredTypesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractType
	 * @generated
	 */
  public Adapter createAbstractTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Type
	 * @generated
	 */
  public Adapter createTypeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter <em>Type Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter
	 * @generated
	 */
  public Adapter createTypeApiAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMember <em>Type Member</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMember
	 * @generated
	 */
  public Adapter createTypeMemberAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference <em>Type Member Reference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference
	 * @generated
	 */
  public Adapter createTypeMemberReferenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement <em>Type Member Reference List Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement
	 * @generated
	 */
  public Adapter createTypeMemberReferenceListElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement <em>Type Member Reference Tree Element</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement
	 * @generated
	 */
  public Adapter createTypeMemberReferenceTreeElementAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.VariablesList <em>Variables List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariablesList
	 * @generated
	 */
  public Adapter createVariablesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Variable
	 * @generated
	 */
  public Adapter createVariableAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ContextsList <em>Contexts List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ContextsList
	 * @generated
	 */
  public Adapter createContextsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Context
	 * @generated
	 */
  public Adapter createContextAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.BasicContext <em>Basic Context</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.BasicContext
	 * @generated
	 */
  public Adapter createBasicContextAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList
	 * @generated
	 */
  public Adapter createVariableImplementationsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData
	 * @generated
	 */
  public Adapter createAbstractInitializationDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.InitializationData <em>Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.InitializationData
	 * @generated
	 */
  public Adapter createInitializationDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation <em>Abstract Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation
	 * @generated
	 */
  public Adapter createAbstractTypeImplementationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation <em>Variable Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementation
	 * @generated
	 */
  public Adapter createVariableImplementationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation <em>Type Member Implementation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation
	 * @generated
	 */
  public Adapter createTypeMemberImplementationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ValuesList <em>Values List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ValuesList
	 * @generated
	 */
  public Adapter createValuesListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Value
	 * @generated
	 */
  public Adapter createValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsList <em>Programs List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsList
	 * @generated
	 */
  public Adapter createProgramsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup <em>Programs Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup
	 * @generated
	 */
	public Adapter createProgramsGroupAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Program
	 * @generated
	 */
  public Adapter createProgramAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ScriptBasedProgram <em>Script Based Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ScriptBasedProgram
	 * @generated
	 */
	public Adapter createScriptBasedProgramAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TriggeredBasedProgram <em>Triggered Based Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TriggeredBasedProgram
	 * @generated
	 */
	public Adapter createTriggeredBasedProgramAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer
	 * @generated
	 */
  public Adapter createOperationCallContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallsList <em>Operation Calls List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallsList
	 * @generated
	 */
  public Adapter createOperationCallsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference
	 * @generated
	 */
  public Adapter createVariableFeatureReferenceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall
	 * @generated
	 */
  public Adapter createOperationCallAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ArgumentsList
	 * @generated
	 */
  public Adapter createArgumentsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Argument
	 * @generated
	 */
  public Adapter createArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument <em>EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument
	 * @generated
	 */
  public Adapter createEDataTypeArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.BooleanEDataTypeArgument <em>Boolean EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.BooleanEDataTypeArgument
	 * @generated
	 */
	public Adapter createBooleanEDataTypeArgumentAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.NumericEDataTypeArgument <em>Numeric EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.NumericEDataTypeArgument
	 * @generated
	 */
	public Adapter createNumericEDataTypeArgumentAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.StringEDataTypeArgument <em>String EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.StringEDataTypeArgument
	 * @generated
	 */
	public Adapter createStringEDataTypeArgumentAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument <em>EEnum Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EEnumArgument
	 * @generated
	 */
  public Adapter createEEnumArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.EClassArgument <em>EClass Argument</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EClassArgument
	 * @generated
	 */
  public Adapter createEClassArgumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList <em>Program Runtimes List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList
	 * @generated
	 */
	public Adapter createProgramRuntimesListAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime <em>Abstract Program Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime
	 * @generated
	 */
	public Adapter createAbstractProgramRuntimeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallsListProgramRuntime <em>Operation Calls List Program Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallsListProgramRuntime
	 * @generated
	 */
	public Adapter createOperationCallsListProgramRuntimeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList <em>Results List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList
	 * @generated
	 */
  public Adapter createResultsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList <em>Operation Call Results List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList
	 * @generated
	 */
  public Adapter createOperationCallResultsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList <em>Recording Results List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList
	 * @generated
	 */
  public Adapter createRecordingResultsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult <em>Abstract Result</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResult
	 * @generated
	 */
  public Adapter createAbstractResultAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue <em>Abstract Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue
	 * @generated
	 */
  public Adapter createAbstractResultValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResult <em>Operation Call Result</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResult
	 * @generated
	 */
  public Adapter createOperationCallResultAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer <em>Exception Container</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer
	 * @generated
	 */
  public Adapter createExceptionContainerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue <em>Attribute Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue
	 * @generated
	 */
  public Adapter createAttributeResultValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AttributeValue
	 * @generated
	 */
  public Adapter createAttributeValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue <em>Reference Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue
	 * @generated
	 */
  public Adapter createReferenceResultValueAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer
	 * @generated
	 */
	public Adapter createRecordingToolsContainerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.ChannelsList <em>Channels List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ChannelsList
	 * @generated
	 */
	public Adapter createChannelsListAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractChannel <em>Abstract Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractChannel
	 * @generated
	 */
	public Adapter createAbstractChannelAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder <em>Abstract Recorder</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractRecorder
	 * @generated
	 */
  public Adapter createAbstractRecorderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer <em>Abstract Player</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer
	 * @generated
	 */
  public Adapter createAbstractPlayerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource <em>Operation Call Results List Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource
	 * @generated
	 */
	public Adapter createOperationCallResultsListTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Named
	 * @generated
	 */
  public Adapter createNamedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Described
	 * @generated
	 */
  public Adapter createDescribedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Archivable <em>Archivable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Archivable
	 * @generated
	 */
	public Adapter createArchivableAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Timed
	 * @generated
	 */
  public Adapter createTimedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Disposable <em>Disposable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Disposable
	 * @generated
	 */
	public Adapter createDisposableAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.TimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.TimeSource
	 * @generated
	 */
	public Adapter createTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource <em>Browseable Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource
	 * @generated
	 */
	public Adapter createBrowseableTimeSourceAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource <em>Collection Timed Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource
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

} //ApogyCoreInvocatorAdapterFactory
