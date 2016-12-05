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
package ca.gc.asc_csa.apogy.core.environment;

import ca.gc.asc_csa.apogy.common.emf.TimeSource;
import ca.gc.asc_csa.apogy.common.emf.Timed;

import ca.gc.asc_csa.apogy.core.invocator.Environment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Apogy Environment.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getWorksitesList <em>Worksites List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveWorksite <em>Active Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getTimeSourcesList <em>Time Sources List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveTimeSource <em>Active Time Source</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getEnvironmentItems <em>Environment Items</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getApogyEnvironment()
 * @model
 * @generated
 */
public interface ApogyEnvironment extends Environment, Timed {
	/**
	 * Returns the value of the '<em><b>Worksites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of available worksites.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Worksites List</em>' containment reference.
	 * @see #setWorksitesList(WorksitesList)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getApogyEnvironment_WorksitesList()
	 * @model containment="true"
	 * @generated
	 */
	WorksitesList getWorksitesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getWorksitesList <em>Worksites List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksites List</em>' containment reference.
	 * @see #getWorksitesList()
	 * @generated
	 */
	void setWorksitesList(WorksitesList value);

	/**
	 * Returns the value of the '<em><b>Active Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worksite currently active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Worksite</em>' reference.
	 * @see #setActiveWorksite(AbstractWorksite)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getApogyEnvironment_ActiveWorksite()
	 * @model
	 * @generated
	 */
	AbstractWorksite getActiveWorksite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveWorksite <em>Active Worksite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Worksite</em>' reference.
	 * @see #getActiveWorksite()
	 * @generated
	 */
	void setActiveWorksite(AbstractWorksite value);

	/**
	 * Returns the value of the '<em><b>Time Sources List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.TimeSourcesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of available time sources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Sources List</em>' containment reference.
	 * @see #setTimeSourcesList(TimeSourcesList)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getApogyEnvironment_TimeSourcesList()
	 * @see ca.gc.asc_csa.apogy.core.environment.TimeSourcesList#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	TimeSourcesList getTimeSourcesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getTimeSourcesList <em>Time Sources List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Sources List</em>' containment reference.
	 * @see #getTimeSourcesList()
	 * @generated
	 */
	void setTimeSourcesList(TimeSourcesList value);

	/**
	 * Returns the value of the '<em><b>Active Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time source currently providing time used to drive the environment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Time Source</em>' reference.
	 * @see #setActiveTimeSource(TimeSource)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getApogyEnvironment_ActiveTimeSource()
	 * @model
	 * @generated
	 */
	TimeSource getActiveTimeSource();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment#getActiveTimeSource <em>Active Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Time Source</em>' reference.
	 * @see #getActiveTimeSource()
	 * @generated
	 */
	void setActiveTimeSource(TimeSource value);

	/**
	 * Returns the value of the '<em><b>Environment Items</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of environment items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment Items</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getApogyEnvironment_EnvironmentItems()
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
	EList<AbstractApogyEnvironmentItem> getEnvironmentItems();

} // ApogyEnvironment
