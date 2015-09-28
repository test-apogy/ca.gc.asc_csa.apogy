/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Program.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program#getProgramsList <em>Programs List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program#getValuesList <em>Values List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getProgram()
 * @model abstract="true"
 * @generated
 */
public interface Program extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Programs List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Programs List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs List</em>' container reference.
	 * @see #setProgramsList(ProgramsList)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getProgram_ProgramsList()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList#getPrograms
	 * @model opposite="programs" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  ProgramsList getProgramsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program#getProgramsList <em>Programs List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programs List</em>' container reference.
	 * @see #getProgramsList()
	 * @generated
	 */
  void setProgramsList(ProgramsList value);

  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' reference.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getProgram_InvocatorSession()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList%> _programsList = this.getProgramsList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_programsList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.invocator.ProgramsList%> _programsList_1 = this.getProgramsList();\n\treturn _programsList_1.getInvocatorSession();\n}'"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

		/**
	 * Returns the value of the '<em><b>Values List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Contains values that could be used as parameter values in the operation
	 * calls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Values List</em>' containment reference.
	 * @see #setValuesList(ValuesList)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getProgram_ValuesList()
	 * @model containment="true"
	 * @generated
	 */
	ValuesList getValuesList();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program#getValuesList <em>Values List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Values List</em>' containment reference.
	 * @see #getValuesList()
	 * @generated
	 */
	void setValuesList(ValuesList value);

} // Program
