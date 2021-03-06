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
