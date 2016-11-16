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
package ca.gc.asc_csa.apogy.core.invocator.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypesRegistry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Types Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypesRegistryImpl#getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID <em>TYPE CONTRIBUTOR EXTENSION POINT ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypesRegistryImpl#getTYPE_CONTRIBUTOR_URI_ID <em>TYPE CONTRIBUTOR URI ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypesRegistryImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypesRegistryImpl extends MinimalEObjectImpl.Container implements TypesRegistry {
	
	/**
	 * @generated_NOT
	 */
	private static TypesRegistry instance = null;

	/**
	 * @generated_NOT
	 */
	public static TypesRegistry getInstance() {
		if (instance == null) {
			instance = new TypesRegistryImpl();
		}
		return instance;
	}
	
	/**
	 * The default value of the '{@link #getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID() <em>TYPE CONTRIBUTOR EXTENSION POINT ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CONTRIBUTOR_EXTENSION_POINT_ID_EDEFAULT = "ca.gc.asc_csa.apogy.core.invocator.typeContributor";

	/**
	 * The cached value of the '{@link #getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID() <em>TYPE CONTRIBUTOR EXTENSION POINT ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID()
	 * @generated
	 * @ordered
	 */
	protected String typE_CONTRIBUTOR_EXTENSION_POINT_ID = TYPE_CONTRIBUTOR_EXTENSION_POINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTYPE_CONTRIBUTOR_URI_ID() <em>TYPE CONTRIBUTOR URI ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE_CONTRIBUTOR_URI_ID()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_CONTRIBUTOR_URI_ID_EDEFAULT = "URI";

	/**
	 * The cached value of the '{@link #getTYPE_CONTRIBUTOR_URI_ID() <em>TYPE CONTRIBUTOR URI ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE_CONTRIBUTOR_URI_ID()
	 * @generated
	 * @ordered
	 */
	protected String typE_CONTRIBUTOR_URI_ID = TYPE_CONTRIBUTOR_URI_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.TYPES_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID() {
		return typE_CONTRIBUTOR_EXTENSION_POINT_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTYPE_CONTRIBUTOR_URI_ID() {
		return typE_CONTRIBUTOR_URI_ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypesGen() {
		if (types == null) {
			types = new EObjectResolvingEList<Type>(Type.class, this, ApogyCoreInvocatorPackage.TYPES_REGISTRY__TYPES);
		}
		return types;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = getTypesGen();
			List<Type> list = new ArrayList<Type>();

			IExtensionPoint extensionPoint = Platform
					.getExtensionRegistry()
					.getExtensionPoint(
							getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID());
			IConfigurationElement[] contributors = extensionPoint
					.getConfigurationElements();

			for (int i = 0; i < contributors.length; i++) {
				IConfigurationElement contributor = contributors[i];
				String uri_str = contributor
						.getAttribute(getTYPE_CONTRIBUTOR_URI_ID());

				URI typeURI = URI.createURI(
						"platform:/plugin/"
								+ contributor.getNamespaceIdentifier() + "/"
								+ uri_str, true);

				try {
					TransactionalEditingDomain domain = ApogyCommonEmfTransactionFacade.INSTANCE.getDefaultEditingDomain();
					Resource resource = domain.getResourceSet().getResource(typeURI,
							true);
					resource.load(Collections.EMPTY_MAP);
					EObject content = resource.getContents().get(0);

					if (content instanceof Type) {
						Type ss = (Type) content;
						list.add(ss);
					} else {
						Logger.INSTANCE.log(Activator.ID, typeURI.toString()
								+ " does not contain a valide Apogy Type/System model.", EventSeverity.ERROR);
					}

				} catch (Throwable t) {
					Logger.INSTANCE.log(Activator.ID, "Unable to load " + typeURI.toString(), EventSeverity.ERROR);
				}
			}
			
			types.addAll(list);
		}
		return types;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.TYPES_REGISTRY__TYPE_CONTRIBUTOR_EXTENSION_POINT_ID:
				return getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID();
			case ApogyCoreInvocatorPackage.TYPES_REGISTRY__TYPE_CONTRIBUTOR_URI_ID:
				return getTYPE_CONTRIBUTOR_URI_ID();
			case ApogyCoreInvocatorPackage.TYPES_REGISTRY__TYPES:
				return getTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.TYPES_REGISTRY__TYPE_CONTRIBUTOR_EXTENSION_POINT_ID:
				return TYPE_CONTRIBUTOR_EXTENSION_POINT_ID_EDEFAULT == null ? typE_CONTRIBUTOR_EXTENSION_POINT_ID != null : !TYPE_CONTRIBUTOR_EXTENSION_POINT_ID_EDEFAULT.equals(typE_CONTRIBUTOR_EXTENSION_POINT_ID);
			case ApogyCoreInvocatorPackage.TYPES_REGISTRY__TYPE_CONTRIBUTOR_URI_ID:
				return TYPE_CONTRIBUTOR_URI_ID_EDEFAULT == null ? typE_CONTRIBUTOR_URI_ID != null : !TYPE_CONTRIBUTOR_URI_ID_EDEFAULT.equals(typE_CONTRIBUTOR_URI_ID);
			case ApogyCoreInvocatorPackage.TYPES_REGISTRY__TYPES:
				return types != null && !types.isEmpty();
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
		result.append(" (TYPE_CONTRIBUTOR_EXTENSION_POINT_ID: ");
		result.append(typE_CONTRIBUTOR_EXTENSION_POINT_ID);
		result.append(", TYPE_CONTRIBUTOR_URI_ID: ");
		result.append(typE_CONTRIBUTOR_URI_ID);
		result.append(')');
		return result.toString();
	}

} //TypesRegistryImpl
