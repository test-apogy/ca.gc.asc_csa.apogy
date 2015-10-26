/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.SimpleTool#getToolList <em>Tool List</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SimpleTool#isActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.SimpleTool#isDisposed <em>Disposed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSimpleTool()
 * @model abstract="true"
 * @generated
 */
public interface SimpleTool extends AbstractTool {

	/**
	 * Returns the value of the '<em><b>Tool List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.SimpleToolList#getSimpleTools <em>Simple Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool List</em>' container reference.
	 * @see #setToolList(SimpleToolList)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSimpleTool_ToolList()
	 * @see org.eclipse.symphony.addons.SimpleToolList#getSimpleTools
	 * @model opposite="simpleTools" transient="false"
	 * @generated
	 */
	SimpleToolList getToolList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SimpleTool#getToolList <em>Tool List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool List</em>' container reference.
	 * @see #getToolList()
	 * @generated
	 */
	void setToolList(SimpleToolList value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSimpleTool_Active()
	 * @model default="false" unique="false" transient="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SimpleTool#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see org.eclipse.symphony.addons.Symphony__AddonsPackage#getSimpleTool_Disposed()
	 * @model default="false" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	boolean isDisposed();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.SimpleTool#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void dispose();
} // SimpleTool
