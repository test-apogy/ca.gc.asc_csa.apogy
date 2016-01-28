/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recording Results List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList#getDataProductsList <em>Data Products List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList#getInvocatorSession <em>Invocator Session</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getRecordingResultsList()
 * @model
 * @generated
 */
public interface RecordingResultsList extends ResultsList
{

	/**
	 * Returns the value of the '<em><b>Data Products List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getRecordingResultsList <em>Recording Results List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Products List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products List</em>' container reference.
	 * @see #setDataProductsList(DataProductsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getRecordingResultsList_DataProductsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsList#getRecordingResultsList
	 * @model opposite="recordingResultsList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	DataProductsList getDataProductsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingResultsList#getDataProductsList <em>Data Products List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Products List</em>' container reference.
	 * @see #getDataProductsList()
	 * @generated
	 */
	void setDataProductsList(DataProductsList value);

	/**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocator Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getRecordingResultsList_InvocatorSession()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.DataProductsList%> _dataProductsList = this.getDataProductsList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_dataProductsList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.core.invocator.DataProductsList%> _dataProductsList_1 = this.getDataProductsList();\n\treturn _dataProductsList_1.getInvocatorSession();\n}'"
	 * @generated
	 */
	InvocatorSession getInvocatorSession();
} // RecordingResultsList
