package ca.gc.asc_csa.apogy.addons;
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

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple3 DTool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Simple3DTool#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Simple3DTool#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getSimple3DTool()
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
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getSimple3DTool_Visible()
	 * @model default="true" unique="false" transient="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Simple3DTool#isVisible <em>Visible</em>}' attribute.
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
	 * * The root node of the current topology. Set automatically by Apogy after the too is registered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Node</em>' reference.
	 * @see #setRootNode(Node)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getSimple3DTool_RootNode()
	 * @model transient="true"
	 * @generated
	 */
	Node getRootNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Simple3DTool#getRootNode <em>Root Node</em>}' reference.
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
	 * @model nodeSelectionDataType="ca.gc.asc_csa.apogy.addons.NodeSelection" nodeSelectionUnique="false"
	 * @generated
	 */
	void selectionChanged(NodeSelection nodeSelection);
} // Simple3DTool
