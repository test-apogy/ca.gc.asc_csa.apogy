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
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.invocator.impl.ProgramFactoriesRegistryImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Factories Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry#getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry#getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry#getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID <em>PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry#getProgramFactoriesMap <em>Program Factories Map</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramFactoriesRegistry()
 * @model
 * @generated
 */
public interface ProgramFactoriesRegistry extends EObject {
	
	/**
	 * @generated_NOT
	 */
	public ProgramFactoriesRegistry INSTANCE = ProgramFactoriesRegistryImpl.getInstance();
	
	/**
	 * Returns the value of the '<em><b>PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID</b></em>' attribute.
	 * The default value is <code>"ca.gc.asc_csa.apogy.core.invocator.programFactoryProvider"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PROGRAM FACTORY PROVIDER CONTRIBUTORS POINT ID</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID()
	 * @model default="ca.gc.asc_csa.apogy.core.invocator.programFactoryProvider" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_POINT_ID();

	/**
	 * Returns the value of the '<em><b>PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID</b></em>' attribute.
	 * The default value is <code>"programEClass"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PROGRAM FACTORY PROVIDER CONTRIBUTORS ECLASS ID</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID()
	 * @model default="programEClass" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_ECLASS_ID();

	/**
	 * Returns the value of the '<em><b>PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID</b></em>' attribute.
	 * The default value is <code>"factory"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PROGRAM FACTORY PROVIDER CONTRIBUTORS FACTORY ID</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramFactoriesRegistry_PROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID()
	 * @model default="factory" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getPROGRAM_FACTORY_PROVIDER_CONTRIBUTORS_FACTORY_ID();

	/**
	 * Returns the value of the '<em><b>Program Factories Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Factories Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Factories Map</em>' attribute.
	 * @see #setProgramFactoriesMap(HashMap)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramFactoriesRegistry_ProgramFactoriesMap()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.invocator.HashMap<org.eclipse.emf.ecore.EClass, ca.gc.asc_csa.apogy.core.invocator.ProgramFactory>"
	 * @generated
	 */
	HashMap<EClass, ProgramFactory> getProgramFactoriesMap();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry#getProgramFactoriesMap <em>Program Factories Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Factories Map</em>' attribute.
	 * @see #getProgramFactoriesMap()
	 * @generated
	 */
	void setProgramFactoriesMap(HashMap<EClass, ProgramFactory> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" eClassUnique="false"
	 * @generated
	 */
	ProgramFactory getFactory(EClass eClass);

} // ProgramFactoriesRegistry
