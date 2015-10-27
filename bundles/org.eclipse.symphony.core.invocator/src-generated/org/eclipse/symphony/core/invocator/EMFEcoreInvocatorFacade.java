/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.symphony.common.emf.AbstractFeatureNode;
import org.eclipse.symphony.common.emf.ListRootNode;
import org.eclipse.symphony.core.invocator.impl.EMFEcoreInvocatorFacadeImpl;

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
 *   <li>{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getActiveInvocatorSession <em>Active Invocator Session</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getEMFEcoreInvocatorFacade()
 * @model
 * @generated
 */
public interface EMFEcoreInvocatorFacade extends EObject
{
	/**
	 * Returns the value of the '<em><b>Active Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the active invocator session.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Invocator Session</em>' reference.
	 * @see #setActiveInvocatorSession(InvocatorSession)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getEMFEcoreInvocatorFacade_ActiveInvocatorSession()
	 * @model
	 * @generated
	 */
	InvocatorSession getActiveInvocatorSession();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade#getActiveInvocatorSession <em>Active Invocator Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Invocator Session</em>' reference.
	 * @see #getActiveInvocatorSession()
	 * @generated
	 */
	void setActiveInvocatorSession(InvocatorSession value);

	public EMFEcoreInvocatorFacade INSTANCE = EMFEcoreInvocatorFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model operationCallUnique="false"
	 * @generated
	 */
  void exec(OperationCall operationCall);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model operationCallUnique="false" saveResultUnique="false"
	 * @generated
	 */
  void exec(OperationCall operationCall, boolean saveResult);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model operationCallsListUnique="false"
	 * @generated
	 */
  void exec(OperationCallsList operationCallsList);

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
	 * @model unique="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
	Watch resolveWatch(AbstractFeatureNode abstractFeatureNode);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" typeMemberReferenceTreeElementUnique="false"
	 * @generated
	 */
  Watch resolveWatch(TypeMemberReferenceTreeElement typeMemberReferenceTreeElement);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" abstractFeatureNodeUnique="false"
	 * @generated
	 */
	Object getValue(AbstractFeatureNode abstractFeatureNode);

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
	 * @model unique="false" typeMemberReferenceTreeElementUnique="false"
	 * @generated
	 */
  EObject getInstance(TypeMemberReferenceTreeElement typeMemberReferenceTreeElement);

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
	 * *
	 * Create a structure of {@link TypeMemberReferenceListElement} based on the specified sequence of {@link TypeMember}.
	 * @param Sequence from the first to the last of type members.
	 * @return Reference to the newly created structure of {@link TypeMemberReferenceListElement}.
	 * <!-- end-model-doc -->
	 * @model unique="false" typeMembersDataType="org.eclipse.symphony.core.invocator.TypeMembersArray" typeMembersUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.symphony.core.invocator.TypeMemberImplementation>" unique="false" many="false" variableTypeUnique="false"
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
	 * @model dataType="org.eclipse.symphony.common.emf.List<org.eclipse.symphony.core.invocator.Type>" unique="false" many="false" environmentUnique="false"
	 * @generated
	 */
	List<Type> getAllTypes(Environment environment);

} // EMFEcoreInvocatorFacade
