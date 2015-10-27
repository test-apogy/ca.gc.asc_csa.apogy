/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import gov.nasa.worldwind.layers.RenderableLayer;

import org.eclipse.symphony.core.Updatable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a Layer that can be shown on the WordWindModel
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer#getRenderableLayer <em>Renderable Layer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage#getAbstractWorldWindLayer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractWorldWindLayer extends Updatable {
	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to display the layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage#getAbstractWorldWindLayer_Visible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Renderable Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The RenderableLayer associated with this Layer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Renderable Layer</em>' attribute.
	 * @see #setRenderableLayer(RenderableLayer)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage#getAbstractWorldWindLayer_RenderableLayer()
	 * @model unique="false" dataType="org.eclipse.symphony.core.environment.orbit.earth.ui.RenderableLayer" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='false' property='None'"
	 * @generated
	 */
	RenderableLayer getRenderableLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer#getRenderableLayer <em>Renderable Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renderable Layer</em>' attribute.
	 * @see #getRenderableLayer()
	 * @generated
	 */
	void setRenderableLayer(RenderableLayer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Method called when the layer is not longer
	 * needed (i.e. when it gets deleted.)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

} // AbstractWorldWindLayer
