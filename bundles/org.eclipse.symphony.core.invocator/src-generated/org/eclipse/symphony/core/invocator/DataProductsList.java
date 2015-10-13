/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Products List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.DataProductsList#getOperationCallResultsList <em>Operation Call Results List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.DataProductsList#getRecordingResultsList <em>Recording Results List</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.DataProductsList#getInvocatorSession <em>Invocator Session</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDataProductsList()
 * @model
 * @generated
 */
public interface DataProductsList extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Data Products Lists Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.DataProductsListsContainer#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products Lists Container</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products Lists Container</em>' container reference.
	 * @see #setDataProductsListsContainer(DataProductsListsContainer)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDataProductsList_DataProductsListsContainer()
	 * @see org.eclipse.symphony.core.invocator.DataProductsListsContainer#getDataProductsList
	 * @model opposite="dataProductsList" transient="false"
	 * @generated
	 */
  DataProductsListsContainer getDataProductsListsContainer();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.DataProductsList#getDataProductsListsContainer <em>Data Products Lists Container</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Products Lists Container</em>' container reference.
	 * @see #getDataProductsListsContainer()
	 * @generated
	 */
  void setDataProductsListsContainer(DataProductsListsContainer value);

  /**
	 * Returns the value of the '<em><b>Operation Call Results List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.OperationCallResultsList#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Call Results List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call Results List</em>' containment reference.
	 * @see #setOperationCallResultsList(OperationCallResultsList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDataProductsList_OperationCallResultsList()
	 * @see org.eclipse.symphony.core.invocator.OperationCallResultsList#getDataProductsList
	 * @model opposite="dataProductsList" containment="true" required="true"
	 * @generated
	 */
  OperationCallResultsList getOperationCallResultsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.DataProductsList#getOperationCallResultsList <em>Operation Call Results List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call Results List</em>' containment reference.
	 * @see #getOperationCallResultsList()
	 * @generated
	 */
  void setOperationCallResultsList(OperationCallResultsList value);

  /**
	 * Returns the value of the '<em><b>Recording Results List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.RecordingResultsList#getDataProductsList <em>Data Products List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recording Results List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Results List</em>' containment reference.
	 * @see #setRecordingResultsList(RecordingResultsList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDataProductsList_RecordingResultsList()
	 * @see org.eclipse.symphony.core.invocator.RecordingResultsList#getDataProductsList
	 * @model opposite="dataProductsList" containment="true"
	 * @generated
	 */
  RecordingResultsList getRecordingResultsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.DataProductsList#getRecordingResultsList <em>Recording Results List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Results List</em>' containment reference.
	 * @see #getRecordingResultsList()
	 * @generated
	 */
  void setRecordingResultsList(RecordingResultsList value);

		/**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocator Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' reference.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getDataProductsList_InvocatorSession()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%org.eclipse.symphony.core.invocator.DataProductsListsContainer%> _dataProductsListsContainer = this.getDataProductsListsContainer();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_dataProductsListsContainer, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%org.eclipse.symphony.core.invocator.DataProductsListsContainer%> _dataProductsListsContainer_1 = this.getDataProductsListsContainer();\n\treturn _dataProductsListsContainer_1.getInvocatorSession();\n}'"
	 * @generated
	 */
	InvocatorSession getInvocatorSession();

} // DataProductsList
