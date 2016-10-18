package ca.gc.asc_csa.apogy.core.invocator;
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

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Utilities
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInitVariableInstancesDate <em>Init Variable Instances Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getActiveInvocatorSession <em>Active Invocator Session</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getApogyCoreInvocatorFacade()
 * @model
 * @generated
 */
public interface ApogyCoreInvocatorFacade extends EObject
{
	/**
	 * Returns the value of the '<em><b>Init Variable Instances Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the date at which the instances were initialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Init Variable Instances Date</em>' attribute.
	 * @see #setInitVariableInstancesDate(Date)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getApogyCoreInvocatorFacade_InitVariableInstancesDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getInitVariableInstancesDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getInitVariableInstancesDate <em>Init Variable Instances Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Variable Instances Date</em>' attribute.
	 * @see #getInitVariableInstancesDate()
	 * @generated
	 */
	void setInitVariableInstancesDate(Date value);

	/**
	 * Returns the value of the '<em><b>Active Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the active invocator session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Invocator Session</em>' reference.
	 * @see #setActiveInvocatorSession(InvocatorSession)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getApogyCoreInvocatorFacade_ActiveInvocatorSession()
	 * @model
	 * @generated
	 */
	InvocatorSession getActiveInvocatorSession();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade#getActiveInvocatorSession <em>Active Invocator Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Invocator Session</em>' reference.
	 * @see #getActiveInvocatorSession()
	 * @generated
	 */
	void setActiveInvocatorSession(InvocatorSession value);

	public ApogyCoreInvocatorFacade INSTANCE = ApogyCoreInvocatorFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes the specified {@link OperationCall} and returns the {@link OperationCallResult}.
	 * This method invokes {@link ApogyCoreInvocatorFacade#exec(OperationCall operationCall, true).
	 * @param operationCall Reference to the {@link OperationCall}.
	 * @return Reference to the result.
	 * <!-- end-model-doc -->
	 * @model unique="false" operationCallUnique="false"
	 * @generated
	 */
  OperationCallResult exec(OperationCall operationCall);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes the specified {@link OperationCall} and returns the {@link OperationCallResult}.
	 * @param operationCall Reference to the {@link OperationCall}.
	 * @param saveResult If true the result is stored in the {@link OperationCallResultsList} specified
	 * in the active {@link Context}.
	 * @return Reference to the result.
	 * <!-- end-model-doc -->
	 * @model unique="false" operationCallUnique="false" saveResultUnique="false"
	 * @generated
	 */
  OperationCallResult exec(OperationCall operationCall, boolean saveResult);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Executes the list of {@link OperationCall} sequentially.
	 * @param operationCallsList Reference to the list of {@link OperationCall}.
	 * <!-- end-model-doc -->
	 * @model operationCallsListUnique="false"
	 * @generated
	 */
  void exec(OperationCallsList operationCallsList);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value contained in the {@link OperationCallResult}.
	 * @param operationCallResult {@link OperationCallResult} that contains the result.
	 * @return Reference to the value (Java Object).
	 * <!-- end-model-doc -->
	 * @model unique="false" operationCallResultUnique="false"
	 * @generated
	 */
	Object getValue(OperationCallResult operationCallResult);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" valueUnique="false"
	 * @generated
	 */
  AbstractResultValue createAbstractResultValue(Object value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false"
	 * @generated
	 */
  EObject getInstance(Variable variable);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false"
	 * @generated
	 */
  EClass getInstanceClass(Variable variable);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the most specific TypeApiAdapter for the given VariableFeatureReference.
	 * <!-- end-model-doc -->
	 * @model unique="false" variableFeatureReferenceUnique="false"
	 * @generated
	 */
	TypeApiAdapter getTypeApiAdapter(VariableFeatureReference variableFeatureReference);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the instance referred by the {@link VariableFeatureReference}
	 * @param variableFeatureReference Reference to the variable feature.
	 * @return Reference to the instance or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" variableFeatureReferenceUnique="false"
	 * @generated
	 */
  EObject getInstance(VariableFeatureReference variableFeatureReference);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the instance referred by the variableFeatureReference.TypeMemberReferenceListElement.
	 * @param variableFeatureReference Reference to the variable feature.
	 * @return Reference to the type member instance, null if no TypeMemberReferenceListElement are defined or instance of type member are null.
	 * <!-- end-model-doc -->
	 * @model unique="false" variableFeatureReferenceUnique="false"
	 * @generated
	 */
  EObject getTypeMemberInstance(VariableFeatureReference variableFeatureReference);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the value referred by the variableFeatureReference.ListRootNode.
	 * @param variableFeatureReference Reference to the variable feature.
	 * @return Reference to feature value, null if non is defined.
	 * <!-- end-model-doc -->
	 * @model unique="false" variableFeatureReferenceUnique="false"
	 * @generated
	 */
  Object getEMFFeatureValue(VariableFeatureReference variableFeatureReference);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the instance class referred by the {@link VariableFeatureReference}.
	 * @param variableFeatureReference Reference to the feature.
	 * @return Instance Class.
	 * <!-- end-model-doc -->
	 * @model unique="false" variableFeatureReferenceUnique="false"
	 * @generated
	 */
	EClass getInstanceClass(VariableFeatureReference variableFeatureReference);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" operationCallUnique="false"
	 * @generated
	 */
  AbstractTypeImplementation getTypeImplementation(OperationCall operationCall);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false" elementTypeUnique="false"
	 * @generated
	 */
  AbstractTypeImplementation getTypeImplementation(Variable variable, AbstractType elementType);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false"
	 * @generated
	 */
  AbstractTypeImplementation getTypeImplementation(Variable variable);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the variables with the specified name within the specified session.
	 * @param session Session in which the variable name will be searched.
	 * @param name Name.
	 * @return Reference to the {@link Variable} or null if there is no match.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<ca.gc.asc_csa.apogy.core.invocator.Variable>" unique="false" many="false" sessionUnique="false" nameUnique="false"
	 * @generated
	 */
	List<Variable> getVariableByName(InvocatorSession session, String name);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Create a structure of {@link TypeMemberReferenceListElement} based on the specified sequence of {@link TypeMember}.
	 * @param Sequence from the first to the last of type members.
	 * @return Reference to the newly created structure of {@link TypeMemberReferenceListElement}.
	 * <!-- end-model-doc -->
	 * @model unique="false" typeMembersDataType="ca.gc.asc_csa.apogy.core.invocator.TypeMembersArray" typeMembersUnique="false"
	 * @generated
	 */
	TypeMemberReferenceListElement createTypeMemberReferences(TypeMember[] typeMembers);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Create a {@link ListRootNode} based on the specified sequence of {@link EStructuralFeature}.
	 * @param Sequence from the first to the last of features.
	 * @return Reference to the newly created structure of {@link ListRootNode}.
	 * <!-- end-model-doc -->
	 * @model unique="false" environmentUnique="false" fullyQualifiedNameUnique="false"
	 * @generated
	 */
  AbstractTypeImplementation getTypeImplementation(Environment environment, String fullyQualifiedName);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" typeMemberReferenceTreeElementUnique="false"
	 * @generated
	 */
  String getFullyQualifiedName(TypeMemberReferenceTreeElement typeMemberReferenceTreeElement);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
	String getFullyQualifiedName(AbstractFeatureNode abstractFeatureNode);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a list of TypeMemberImplementation according to the definition of the specified variable type.
	 * @param variableType Reference to the type.
	 * @return List of TypeMemberImplementation.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation>" unique="false" many="false" variableTypeUnique="false"
	 * @generated
	 */
  List<TypeMemberImplementation> createTypeMemberImplementations(Type variableType);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resets the variable instances.
	 * <!-- end-model-doc -->
	 * @model environmentUnique="false"
	 * @generated
	 */
  void initVariableInstances(Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clear the variable instances.
	 * <!-- end-model-doc -->
	 * @model environmentUnique="false"
	 * @generated
	 */
  void disposeVariableInstances(Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the direct owner of the {@link TypeMemberReferenceListElement}.  Null is returned if the reference
	 * is a direct child of the {@link OperationCall}.
	 * @param typeMemberReference Reference to the {@link TypeMemberReferenceListElement}
	 * @return {@link OperationCall} that contains the {@link TypeMemberReferenceListElement}.
	 * Null is returned if the reference is a direct child of the {@link OperationCall}.
	 * <!-- end-model-doc -->
	 * @model unique="false" typeMemberReferenceListElementUnique="false"
	 * @generated
	 */
  OperationCall getOperationCallContainer(TypeMemberReferenceListElement typeMemberReferenceListElement);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply the initialization data to the specified environment.
	 * @param environment Environment to initialize.
	 * <!-- end-model-doc -->
	 * @model environmentUnique="false"
	 * @generated
	 */
  void applyInitializationData(Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collects the initialization data for the specified environment.
	 * @param environment Environment to collect data from.
	 * <!-- end-model-doc -->
	 * @model environmentUnique="false"
	 * @generated
	 */
  void collectInitializationData(Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apply the initialization data to the specified Variable.
	 * @param variable Variable to initialize.
	 * <!-- end-model-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
  void applyInitializationData(Variable variable);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collects the initialization data from the specified Variable.
	 * @param variable Variable to collect data from.
	 * <!-- end-model-doc -->
	 * @model variableUnique="false"
	 * @generated
	 */
  void collectInitializationData(Variable variable);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loads the registered types.
	 * @param session Reference to the session.
	 * <!-- end-model-doc -->
	 * @model sessionUnique="false"
	 * @generated
	 */
	void loadRegisteredTypes(InvocatorSession session);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of all the {@link Type} contained in the specified {@link Environment}.
	 * @environment Reference to the environment.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<ca.gc.asc_csa.apogy.core.invocator.Type>" unique="false" many="false" environmentUnique="false"
	 * @generated
	 */
	List<Type> getAllTypes(Environment environment);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds the specified {@link IVariableListener}.
	 * @param listener Reference to the {@link IVariableListener}.
	 * <!-- end-model-doc -->
	 * @model listenerDataType="ca.gc.asc_csa.apogy.core.invocator.IVariableListener" listenerUnique="false"
	 * @generated
	 */
	void addVariableListener(IVariableListener listener);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes the specified {@link IVariableListener}.
	 * @param listener Reference to the {@link IVariableListener}.
	 * <!-- end-model-doc -->
	 * @model listenerDataType="ca.gc.asc_csa.apogy.core.invocator.IVariableListener" listenerUnique="false"
	 * @generated
	 */
	void removeVariableListener(IVariableListener listener);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notifies all {@link IVariableListener} the specified variable instance event.
	 * @param variable Refers to the variable.
	 * @param event Refers to the {@link VariableListenerEventType}.
	 * <!-- end-model-doc -->
	 * @model variableUnique="false" eventUnique="false"
	 * @generated
	 */
	void notifyVariableListeners(Variable variable, VariableListenerEventType event);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loads the content of the {@link InvocatorSession}.
	 * @param uri Reference to the session file (e.g. "platform:/plugin/ca.gc.asc_csa.apogy.examples.rover.apogy/sessions/RoverExampleSession.sym").
	 * @return Reference to the session if successfully loaded.
	 * @throw Exception Reference to the exception if problems occurred during the load.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" uriUnique="false"
	 * @generated
	 */
	InvocatorSession loadInvocatorSession(String uri) throws Exception;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search and return the list that matches the specified name.
	 * @param invocatorSession Reference to the session.
	 * @param name Search criteria.
	 * @return Reference to the list or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" invocatorSessionUnique="false" nameUnique="false"
	 * @generated
	 */
	DataProductsList getDataProductsByName(InvocatorSession invocatorSession, String name);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search and return the program that matches the specified name.
	 * @param invocatorSession Reference to the session.
	 * @param name Search criteria.
	 * @return Reference to the program or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" invocatorSessionUnique="false" nameUnique="false"
	 * @generated
	 */
	Program getProgramByName(InvocatorSession invocatorSession, String name);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search and return the context that matches the specified name.
	 * @param invocatorSession Reference to the session.
	 * @param name Search criteria.
	 * @return Reference to the context or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" invocatorSessionUnique="false" nameUnique="false"
	 * @generated
	 */
	Context getContextByName(InvocatorSession invocatorSession, String name);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the {@link ScriptBasedProgram} programs contained in the list.
	 * @param programsList Refers to the list that contains all the programs.
	 * @param filter Determine if the program should be considered as a valid program.
	 * @return List of programs.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.List<ca.gc.asc_csa.apogy.core.invocator.Program>" unique="false" many="false" programsListUnique="false"
	 * @generated
	 */
	List<Program> getAllScriptBasedPrograms(ProgramsList programsList);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns only the objects that are not archived
	 * @param objects Refers to the array containing the objects to filter
	 * @return Array of filtered objects
	 * <!-- end-model-doc -->
	 * @model unique="false" objectsUnique="false" objectsMany="true"
	 * @generated
	 */
	EList<Object> filterArchived(EList<Object> objects);

} // ApogyCoreInvocatorFacade
