/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getTypeMemberImplementations <em>Type Member Implementations</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getImplementationClass <em>Implementation Class</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getAbstractInitializationData <em>Abstract Initialization Data</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getInstance <em>Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getAdapterInstance <em>Adapter Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getHandlingType <em>Handling Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractTypeImplementation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTypeImplementation extends EObject
{
  /**
	 * Returns the value of the '<em><b>Type Member Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberImplementation}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Member Implementations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Member Implementations</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractTypeImplementation_TypeMemberImplementations()
	 * @model containment="true"
	 * @generated
	 */
  EList<TypeMemberImplementation> getTypeMemberImplementations();

  /**
	 * Returns the value of the '<em><b>Implementation Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implementation Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Class</em>' reference.
	 * @see #setImplementationClass(EClass)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractTypeImplementation_ImplementationClass()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EClass getImplementationClass();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getImplementationClass <em>Implementation Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Class</em>' reference.
	 * @see #getImplementationClass()
	 * @generated
	 */
  void setImplementationClass(EClass value);

  /**
	 * Returns the value of the '<em><b>Abstract Initialization Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Initialization Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Initialization Data</em>' containment reference.
	 * @see #setAbstractInitializationData(AbstractInitializationData)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractTypeImplementation_AbstractInitializationData()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true'"
	 * @generated
	 */
  AbstractInitializationData getAbstractInitializationData();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getAbstractInitializationData <em>Abstract Initialization Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Initialization Data</em>' containment reference.
	 * @see #getAbstractInitializationData()
	 * @generated
	 */
  void setAbstractInitializationData(AbstractInitializationData value);

  /**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(EObject)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractTypeImplementation_Instance()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true'"
	 * @generated
	 */
  EObject getInstance();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
  void setInstance(EObject value);

  /**
	 * Returns the value of the '<em><b>Adapter Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Adapter Instance</em>' reference.
	 * @see #setAdapterInstance(TypeApiAdapter)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractTypeImplementation_AdapterInstance()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true'"
	 * @generated
	 */
  TypeApiAdapter getAdapterInstance();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation#getAdapterInstance <em>Adapter Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter Instance</em>' reference.
	 * @see #getAdapterInstance()
	 * @generated
	 */
  void setAdapterInstance(TypeApiAdapter value);

  /**
	 * Returns the value of the '<em><b>Handling Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Handling Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Handling Type</em>' reference.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getAbstractTypeImplementation_HandlingType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
  Type getHandlingType();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Searches a {@link TypeMemberImplementation} based on the type member name.
	 * @param name Search criteria.
	 * @return Reference to the {@link TypeMemberImplementation} or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
  TypeMemberImplementation getTypeMemberImplementation(String name);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Search the {@link TypeMemberImplementation} that refers to the specified {@link TypeMember}.
	 * @param typeMember {@link TypeMember} Search Key.
	 * @return Reference to the {@link TypeMemberImplementation} or null if the specified {@link TypeMember} was not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" typeMemberUnique="false"
	 * @generated
	 */
  TypeMemberImplementation getTypeMemberImplementation(TypeMember typeMember);

} // AbstractTypeImplementation
