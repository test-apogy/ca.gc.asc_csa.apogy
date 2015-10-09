/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.primitives.ui;

import ca.gc.space.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vector Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.primitives.ui.VectorPresentation#getLineWidth <em>Line Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesPackage#getVectorPresentation()
 * @model
 * @generated
 */
public interface VectorPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #setLineWidth(int)
	 * @see org.eclipse.symphony.common.topology.addons.primitives.ui.TopologyUIPrimitivesPackage#getVectorPresentation_LineWidth()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getLineWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.primitives.ui.VectorPresentation#getLineWidth <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Width</em>' attribute.
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(int value);

} // VectorPresentation
