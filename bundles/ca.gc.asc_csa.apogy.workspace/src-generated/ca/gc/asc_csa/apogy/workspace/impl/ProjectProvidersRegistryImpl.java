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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage;
import ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Providers Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ProjectProvidersRegistryImpl#getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID <em>PROJECT PROVIDERS CONTRIBUTORS POINT ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.impl.ProjectProvidersRegistryImpl#getApogyProjectProviders <em>Apogy Project Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectProvidersRegistryImpl extends MinimalEObjectImpl.Container implements ProjectProvidersRegistry {
	
	/**
	 * @generated_NOT
	 */
	private static ProjectProvidersRegistry instance = null;

	/**
	 * @generated_NOT
	 */
	public static ProjectProvidersRegistry getInstance() {
		if (instance == null) {
			instance = new ProjectProvidersRegistryImpl();
		}
		return instance;
	}
	
	/**
	 * The default value of the '{@link #getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID() <em>PROJECT PROVIDERS CONTRIBUTORS POINT ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID_EDEFAULT = "ca.gc.asc_csa.apogy.workspace.projectProvider";

	/**
	 * The cached value of the '{@link #getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID() <em>PROJECT PROVIDERS CONTRIBUTORS POINT ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID()
	 * @generated
	 * @ordered
	 */
	protected String projecT_PROVIDERS_CONTRIBUTORS_POINT_ID = PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApogyProjectProviders() <em>Apogy Project Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApogyProjectProviders()
	 * @generated
	 * @ordered
	 */
	protected List<Bundle> apogyProjectProviders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectProvidersRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyWorkspacePackage.Literals.PROJECT_PROVIDERS_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID() {
		return projecT_PROVIDERS_CONTRIBUTORS_POINT_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<Bundle> getApogyProjectProviders() {
		List<Bundle> apogyProjectProviders = getApogyProjectProvidersGen();
		if (apogyProjectProviders == null){
			apogyProjectProviders = new ArrayList<Bundle>();

			IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
					.getExtensionPoint(getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID());			
			
			for (IExtension extension : extensionPoint.getExtensions()) {
				apogyProjectProviders.add(Platform.getBundle(extension.getNamespaceIdentifier()));
			}			
			
			setApogyProjectProviders(apogyProjectProviders);
		}				
		return apogyProjectProviders;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Bundle> getApogyProjectProvidersGen() {
		return apogyProjectProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApogyProjectProviders(List<Bundle> newApogyProjectProviders) {
		List<Bundle> oldApogyProjectProviders = apogyProjectProviders;
		apogyProjectProviders = newApogyProjectProviders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY__APOGY_PROJECT_PROVIDERS, oldApogyProjectProviders, apogyProjectProviders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY__PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID:
				return getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID();
			case ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY__APOGY_PROJECT_PROVIDERS:
				return getApogyProjectProviders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY__APOGY_PROJECT_PROVIDERS:
				setApogyProjectProviders((List<Bundle>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY__APOGY_PROJECT_PROVIDERS:
				setApogyProjectProviders((List<Bundle>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY__PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID:
				return PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID_EDEFAULT == null ? projecT_PROVIDERS_CONTRIBUTORS_POINT_ID != null : !PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID_EDEFAULT.equals(projecT_PROVIDERS_CONTRIBUTORS_POINT_ID);
			case ApogyWorkspacePackage.PROJECT_PROVIDERS_REGISTRY__APOGY_PROJECT_PROVIDERS:
				return apogyProjectProviders != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID: ");
		result.append(projecT_PROVIDERS_CONTRIBUTORS_POINT_ID);
		result.append(", apogyProjectProviders: ");
		result.append(apogyProjectProviders);
		result.append(')');
		return result.toString();
	}

} //ProjectProvidersRegistryImpl
