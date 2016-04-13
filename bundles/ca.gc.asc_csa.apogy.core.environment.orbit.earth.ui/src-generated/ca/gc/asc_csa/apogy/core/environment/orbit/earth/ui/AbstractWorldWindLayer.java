package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import gov.nasa.worldwind.layers.RenderableLayer;

import org.eclipse.jface.viewers.ISelection;
import ca.gc.asc_csa.apogy.core.Updatable;

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
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.AbstractWorldWindLayer#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.AbstractWorldWindLayer#getRenderableLayer <em>Renderable Layer</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getAbstractWorldWindLayer()
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
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getAbstractWorldWindLayer_Visible()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.AbstractWorldWindLayer#isVisible <em>Visible</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getAbstractWorldWindLayer_RenderableLayer()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.RenderableLayer" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='false' property='None'"
	 * @generated
	 */
	RenderableLayer getRenderableLayer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.AbstractWorldWindLayer#getRenderableLayer <em>Renderable Layer</em>}' attribute.
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Method called when a selection is made by the user.
	 * Sub-classes can override this method if applicable.
	 * @param selection The new selection made.
	 * <!-- end-model-doc -->
	 * @model selectionDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ISelection" selectionUnique="false"
	 * @generated
	 */
	void selectionChanged(ISelection selection);

} // AbstractWorldWindLayer
