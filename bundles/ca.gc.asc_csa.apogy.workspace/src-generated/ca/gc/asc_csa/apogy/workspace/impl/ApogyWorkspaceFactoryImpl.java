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
package ca.gc.asc_csa.apogy.workspace.impl;

import ca.gc.asc_csa.apogy.workspace.*;

import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyWorkspaceFactoryImpl extends EFactoryImpl implements ApogyWorkspaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyWorkspaceFactory init() {
		try {
			ApogyWorkspaceFactory theApogyWorkspaceFactory = (ApogyWorkspaceFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyWorkspacePackage.eNS_URI);
			if (theApogyWorkspaceFactory != null) {
				return theApogyWorkspaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyWorkspaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyWorkspacePackage.APOGY_WORKSPACE_FACADE: return createApogyWorkspaceFacade();
			case ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY: return createProjectProvidersRegistry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyWorkspacePackage.IPROJECT:
				return createIProjectFromString(eDataType, initialValue);
			case ApogyWorkspacePackage.LIST_APOGY_PROJECTS:
				return createListApogyProjectsFromString(eDataType, initialValue);
			case ApogyWorkspacePackage.LIST_APOGY_PROJECT_BUNDLES:
				return createListApogyProjectBundlesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyWorkspacePackage.IPROJECT:
				return convertIProjectToString(eDataType, instanceValue);
			case ApogyWorkspacePackage.LIST_APOGY_PROJECTS:
				return convertListApogyProjectsToString(eDataType, instanceValue);
			case ApogyWorkspacePackage.LIST_APOGY_PROJECT_BUNDLES:
				return convertListApogyProjectBundlesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspaceFacade createApogyWorkspaceFacade() {
		ApogyWorkspaceFacadeImpl apogyWorkspaceFacade = new ApogyWorkspaceFacadeImpl();
		return apogyWorkspaceFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectProvidersRegistry createProjectProvidersRegistry() {
		ProjectProvidersRegistryImpl projectProvidersRegistry = new ProjectProvidersRegistryImpl();
		return projectProvidersRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject createIProjectFromString(EDataType eDataType, String initialValue) {
		return (IProject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<IProject> createListApogyProjectsFromString(EDataType eDataType, String initialValue) {
		return (List<IProject>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListApogyProjectsToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Bundle> createListApogyProjectBundlesFromString(EDataType eDataType, String initialValue) {
		return (List<Bundle>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListApogyProjectBundlesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspacePackage getApogyWorkspacePackage() {
		return (ApogyWorkspacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyWorkspacePackage getPackage() {
		return ApogyWorkspacePackage.eINSTANCE;
	}

} //ApogyWorkspaceFactoryImpl
