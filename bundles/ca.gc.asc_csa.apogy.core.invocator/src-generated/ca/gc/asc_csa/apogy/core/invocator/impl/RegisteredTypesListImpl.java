package ca.gc.asc_csa.apogy.core.invocator.impl;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.core.invocator.RegisteredTypesList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeContributorsRegistry;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Registered Types List</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.RegisteredTypesListImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredTypesListImpl extends MinimalEObjectImpl.Container
		implements RegisteredTypesList {

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredTypesListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.REGISTERED_TYPES_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			List<Type> list = new ArrayList<Type>();

			IExtensionPoint extensionPoint = Platform
					.getExtensionRegistry()
					.getExtensionPoint(
							TypeContributorsRegistry.TYPE_CONTRIBUTOR_EXTENSION_POINT_ID);
			IConfigurationElement[] contributors = extensionPoint
					.getConfigurationElements();

			for (int i = 0; i < contributors.length; i++) {
				IConfigurationElement contributor = contributors[i];
				String uri_str = contributor
						.getAttribute(TypeContributorsRegistry.TYPE_CONTRIBUTOR_URI_ID);

				URI typeURI = URI.createURI(
						"platform:/plugin/"
								+ contributor.getNamespaceIdentifier() + "/"
								+ uri_str, true);

				try {
					Resource resource = getResourceSet().getResource(typeURI,
							true);
					resource.load(Collections.EMPTY_MAP);
					EObject content = resource.getContents().get(0);

					if (content instanceof Type) {
						Type ss = (Type) content;
						list.add(ss);
					} else {
						// TODO Use Log.
						System.err
								.println("TypeContributorsRegistry.newInstance(): "
										+ typeURI.toString()
										+ " does not contain ApogySystem instance.");
					}

				} catch (Throwable t) {
					// TODO Use Log.
					System.err
							.println("TypeContributorsRegistry.newInstance(): "
									+ "unable to load " + typeURI.toString());
				}
			}
			
			types = new EObjectResolvingEList<Type>(Type.class, this,
					ApogyCoreInvocatorPackage.REGISTERED_TYPES_LIST__TYPES);			
			types.addAll(list);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.REGISTERED_TYPES_LIST__TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.REGISTERED_TYPES_LIST__TYPES:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	private ResourceSet getResourceSet() {
		return this.eResource().getResourceSet();
	}

} // RegisteredTypesListImpl
