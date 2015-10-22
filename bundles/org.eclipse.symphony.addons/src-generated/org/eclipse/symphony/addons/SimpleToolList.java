/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Tool List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.SimpleToolList#getSimpleTools <em>Simple Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.SymphonyToolsCorePackage#getSimpleToolList()
 * @model
 * @generated
 */
public interface SimpleToolList extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Simple Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.SimpleTool}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.SimpleTool#getToolList <em>Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Tools</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Tools</em>' containment reference list.
	 * @see org.eclipse.symphony.addons.SymphonyToolsCorePackage#getSimpleToolList_SimpleTools()
	 * @see org.eclipse.symphony.addons.SimpleTool#getToolList
	 * @model opposite="toolList" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	EList<SimpleTool> getSimpleTools();

} // SimpleToolList
