package ca.gc.asc_csa.apogy.core;
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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assembly Links List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.AssemblyLinksList#getAssemblyLinks <em>Assembly Links</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLinksList()
 * @model
 * @generated
 */
public interface AssemblyLinksList extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Links</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.AssemblyLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Links</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Links</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getAssemblyLinksList_AssemblyLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyLink> getAssemblyLinks();

} // AssemblyLinksList
