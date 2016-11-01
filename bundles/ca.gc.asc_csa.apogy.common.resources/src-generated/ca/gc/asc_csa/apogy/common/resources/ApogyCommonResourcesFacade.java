/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.common.resources;

import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.common.resources.impl.ApogyCommonResourcesFacadeImpl;
import org.eclipse.core.resources.IProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This provides tools to process and manage Eclipse resources (e.g. Workspace).
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.resources.ApogyCommonResourcesPackage#getApogyCommonResourcesFacade()
 * @model
 * @generated
 */
public interface ApogyCommonResourcesFacade extends EObject {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Imports the content of a bundle into the workspace.
	 * @param destinationProject Reference to the project where the content will be imported.
	 * @param bundle Refers the bundle that contains the content to be imported.
	 * @param sourceFolder Refers the bundle folder to import.
	 * @param recursive True means the content will be imported recursively.
	 * @throws Exception Refers the exception if any occurred.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.resources.Exception" destinationProjectDataType="ca.gc.asc_csa.apogy.common.resources.IProject" destinationProjectUnique="false" bundleDataType="ca.gc.asc_csa.apogy.common.resources.Bundle" bundleUnique="false" sourceFolderUnique="false" recursiveUnique="false"
	 * @generated
	 */
	void importContent(IProject destinationProject, Bundle bundle, String sourceFolder, boolean recursive) throws Exception;


	/**
	 * @generated_NOT
	 */
	public static ApogyCommonResourcesFacade INSTANCE = ApogyCommonResourcesFacadeImpl.getInstance();

} // ApogyCommonResourcesFacade
