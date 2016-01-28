/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

import java.util.Date;

import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Context#getContextsList <em>Contexts List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Context#getVariableImplementationsList <em>Variable Implementations List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Context#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Context#getDataProductsList <em>Data Products List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesCreationDate <em>Instances Creation Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesDisposalDate <em>Instances Disposal Date</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getContext()
 * @model abstract="true"
 * @generated
 */
public interface Context extends Named
{
  /**
	 * Returns the value of the '<em><b>Contexts List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ContextsList#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts List</em>' container reference.
	 * @see #setContextsList(ContextsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getContext_ContextsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.ContextsList#getContexts
	 * @model opposite="contexts" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  ContextsList getContextsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getContextsList <em>Contexts List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contexts List</em>' container reference.
	 * @see #getContextsList()
	 * @generated
	 */
  void setContextsList(ContextsList value);

  /**
	 * Returns the value of the '<em><b>Variable Implementations List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Implementations List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Implementations List</em>' containment reference.
	 * @see #setVariableImplementationsList(VariableImplementationsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getContext_VariableImplementationsList()
	 * @model containment="true"
	 * @generated
	 */
  VariableImplementationsList getVariableImplementationsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getVariableImplementationsList <em>Variable Implementations List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Implementations List</em>' containment reference.
	 * @see #getVariableImplementationsList()
	 * @generated
	 */
  void setVariableImplementationsList(VariableImplementationsList value);

  /**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getContext_Environment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.ContextsList%> _contextsList = this.getContextsList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_contextsList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.core.invocator.ContextsList%> _contextsList_1 = this.getContextsList();\n\treturn _contextsList_1.getEnvironment();\n}'"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Returns the value of the '<em><b>Data Products List</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products List</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products List</em>' reference.
	 * @see #setDataProductsList(DataProductsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getContext_DataProductsList()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
  DataProductsList getDataProductsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getDataProductsList <em>Data Products List</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Products List</em>' reference.
	 * @see #getDataProductsList()
	 * @generated
	 */
  void setDataProductsList(DataProductsList value);

  /**
	 * Returns the value of the '<em><b>Instances Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances Creation Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances Creation Date</em>' attribute.
	 * @see #setInstancesCreationDate(Date)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getContext_InstancesCreationDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  Date getInstancesCreationDate();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesCreationDate <em>Instances Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances Creation Date</em>' attribute.
	 * @see #getInstancesCreationDate()
	 * @generated
	 */
  void setInstancesCreationDate(Date value);

  /**
	 * Returns the value of the '<em><b>Instances Disposal Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instances Disposal Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances Disposal Date</em>' attribute.
	 * @see #setInstancesDisposalDate(Date)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getContext_InstancesDisposalDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  Date getInstancesDisposalDate();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Context#getInstancesDisposalDate <em>Instances Disposal Date</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances Disposal Date</em>' attribute.
	 * @see #getInstancesDisposalDate()
	 * @generated
	 */
  void setInstancesDisposalDate(Date value);

} // Context
