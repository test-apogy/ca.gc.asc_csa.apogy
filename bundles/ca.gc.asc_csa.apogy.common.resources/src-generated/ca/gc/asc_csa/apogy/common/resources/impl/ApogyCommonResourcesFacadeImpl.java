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
package ca.gc.asc_csa.apogy.common.resources.impl;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.common.resources.ApogyCommonResourcesFacade;
import ca.gc.asc_csa.apogy.common.resources.ApogyCommonResourcesPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonResourcesFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonResourcesFacade {

	/**
	 * Facade Singleton.
	 * 
	 * @generated_NOT
	 */
	private static ApogyCommonResourcesFacade instance = null;

	/**
	 * Returns the Facade Singleton.
	 * 
	 * @generated_NOT
	 */
	public static ApogyCommonResourcesFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonResourcesFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonResourcesFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonResourcesPackage.Literals.APOGY_COMMON_RESOURCES_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void importContent(IProject destinationProject, Bundle bundle, String sourceFolder, boolean recursive)
			throws Exception {

		Enumeration<String> entries = bundle.getEntryPaths(sourceFolder);

		if (entries != null) {
			while (entries.hasMoreElements()) {
				String entry = entries.nextElement();

				/* Check if it is a folder. */
				if (entry.substring(entry.length() - 1).equals("/")) {
					if (recursive) {
						IFolder folder = destinationProject.getFolder(entry);
						folder.create(true, true, null);
						importContent(destinationProject, bundle, entry, true);
					}
				} else {
					IFile file = destinationProject.getFile(entry);
					URL url = bundle.getEntry(entry);
					file.create(url.openStream(), true, null);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonResourcesPackage.APOGY_COMMON_RESOURCES_FACADE___IMPORT_CONTENT__IPROJECT_BUNDLE_STRING_BOOLEAN:
				try {
					importContent((IProject)arguments.get(0), (Bundle)arguments.get(1), (String)arguments.get(2), (Boolean)arguments.get(3));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyCommonResourcesFacadeImpl
