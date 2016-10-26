/**
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
package ca.gc.asc_csa.apogy.workspace;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.workspace.impl.ProjectProvidersRegistryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Providers Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This registry holds all the bundles that contain Apogy projects.  This class is a singleton.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry#getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID <em>PROJECT PROVIDERS CONTRIBUTORS POINT ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry#getApogyProjectProviders <em>Apogy Project Providers</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getProjectProvidersRegistry()
 * @model
 * @generated
 */
public interface ProjectProvidersRegistry extends EObject {
	
	/**
	 * @generated_NOT
	 */
	public ProjectProvidersRegistry INSTANCE = ProjectProvidersRegistryImpl.getInstance();
	
	/**
	 * Returns the value of the '<em><b>PROJECT PROVIDERS CONTRIBUTORS POINT ID</b></em>' attribute.
	 * The default value is <code>"ca.gc.asc_csa.apogy.workspace.projectProvider"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eclipse Extension Point Id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PROJECT PROVIDERS CONTRIBUTORS POINT ID</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getProjectProvidersRegistry_PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID()
	 * @model default="ca.gc.asc_csa.apogy.workspace.projectProvider" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID();

	/**
	 * Returns the value of the '<em><b>Apogy Project Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains all the bundles that provides an Apogy project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apogy Project Providers</em>' attribute.
	 * @see #setApogyProjectProviders(List)
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getProjectProvidersRegistry_ApogyProjectProviders()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.workspace.ListApogyProjectBundles"
	 * @generated
	 */
	List<Bundle> getApogyProjectProviders();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry#getApogyProjectProviders <em>Apogy Project Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy Project Providers</em>' attribute.
	 * @see #getApogyProjectProviders()
	 * @generated
	 */
	void setApogyProjectProviders(List<Bundle> value);

} // ProjectProvidersRegistry
