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
package ca.gc.asc_csa.apogy.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.invocator.impl.TypesRegistryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of {@link Type}s that are registered in bundles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypesRegistry#getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID <em>TYPE CONTRIBUTOR EXTENSION POINT ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypesRegistry#getTYPE_CONTRIBUTOR_URI_ID <em>TYPE CONTRIBUTOR URI ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypesRegistry#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypesRegistry()
 * @model
 * @generated
 */
public interface TypesRegistry extends EObject {
	
	/** 
	 * Singleton.
	 * @generated_NOT
	 */
	public TypesRegistry INSTANCE = TypesRegistryImpl.getInstance();
	
	/**
	 * Returns the value of the '<em><b>TYPE CONTRIBUTOR EXTENSION POINT ID</b></em>' attribute.
	 * The default value is <code>"ca.gc.asc_csa.apogy.core.invocator.typeContributor"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Extension Point Id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TYPE CONTRIBUTOR EXTENSION POINT ID</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypesRegistry_TYPE_CONTRIBUTOR_EXTENSION_POINT_ID()
	 * @model default="ca.gc.asc_csa.apogy.core.invocator.typeContributor" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getTYPE_CONTRIBUTOR_EXTENSION_POINT_ID();

	/**
	 * Returns the value of the '<em><b>TYPE CONTRIBUTOR URI ID</b></em>' attribute.
	 * The default value is <code>"URI"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  URI that refers the type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TYPE CONTRIBUTOR URI ID</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypesRegistry_TYPE_CONTRIBUTOR_URI_ID()
	 * @model default="URI" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getTYPE_CONTRIBUTOR_URI_ID();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the bundled {@link Type}s.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypesRegistry_Types()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='false' property='None'"
	 * @generated
	 */
	EList<Type> getTypes();

} // TypesRegistry
