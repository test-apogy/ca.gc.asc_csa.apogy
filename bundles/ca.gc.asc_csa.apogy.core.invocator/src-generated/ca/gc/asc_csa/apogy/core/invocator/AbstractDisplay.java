/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

import ca.gc.asc_csa.apogy.common.emf.Described;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Display
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractDisplay#getDisplaysList <em>Displays List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractDisplay()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDisplay extends Described
{
  /**
	 * Returns the value of the '<em><b>Displays List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.DisplaysList#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Displays List</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays List</em>' container reference.
	 * @see #setDisplaysList(DisplaysList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractDisplay_DisplaysList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.DisplaysList#getDisplays
	 * @model opposite="displays" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  DisplaysList getDisplaysList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractDisplay#getDisplaysList <em>Displays List</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displays List</em>' container reference.
	 * @see #getDisplaysList()
	 * @generated
	 */
  void setDisplaysList(DisplaysList value);

} // AbstractDisplay