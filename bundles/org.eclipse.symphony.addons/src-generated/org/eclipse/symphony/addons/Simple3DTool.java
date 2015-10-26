/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodeSelection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple3 DTool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.Simple3DTool#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.Simple3DTool#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSimple3DTool()
 * @model abstract="true"
 * @generated
 */
public interface Simple3DTool extends SimpleTool {

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSimple3DTool_Visible()
	 * @model default="true" unique="false" transient="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.Simple3DTool#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Root Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The root node of the current topology. Set automatically by Symphony after the too is registered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Node</em>' reference.
	 * @see #setRootNode(Node)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSimple3DTool_RootNode()
	 * @model transient="true"
	 * @generated
	 */
	Node getRootNode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.Simple3DTool#getRootNode <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Node</em>' reference.
	 * @see #getRootNode()
	 * @generated
	 */
	void setRootNode(Node value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Method called upon a user selection in the 3D viewer. Sub-classes should implement.
	 * <!-- end-model-doc -->
	 * @model nodeSelectionDataType="org.eclipse.symphony.addons.NodeSelection" nodeSelectionUnique="false"
	 * @generated
	 */
	void selectionChanged(NodeSelection nodeSelection);
} // Simple3DTool
