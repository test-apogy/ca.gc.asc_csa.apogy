/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Tool List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.SimpleToolList#getSimpleTools <em>Simple Tools</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getSimpleToolList()
 * @model
 * @generated
 */
public interface SimpleToolList extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Simple Tools</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.SimpleTool}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.SimpleTool#getToolList <em>Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Tools</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getSimpleToolList_SimpleTools()
	 * @see ca.gc.asc_csa.apogy.addons.SimpleTool#getToolList
	 * @model opposite="toolList" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	EList<SimpleTool> getSimpleTools();

} // SimpleToolList
