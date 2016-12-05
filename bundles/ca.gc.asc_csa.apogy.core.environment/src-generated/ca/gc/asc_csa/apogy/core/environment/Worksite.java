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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Worksites
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getSky <em>Sky</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getWorksite()
 * @model abstract="true"
 * @generated
 */
public interface Worksite extends AbstractWorksite {
	/**
	 * Returns the value of the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The Topology Node associated with the Worksite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Worksite Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getWorksite_WorksiteNode()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' children='true' notify='true'"
	 * @generated
	 */
	WorksiteNode getWorksiteNode();

	/**
	 * Returns the value of the '<em><b>Sky</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getWorksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The Sky associated with the Worksite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sky</em>' containment reference.
	 * @see #setSky(Sky)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getWorksite_Sky()
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getWorksite
	 * @model opposite="worksite" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	Sky getSky();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getSky <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky</em>' containment reference.
	 * @see #getSky()
	 * @generated
	 */
	void setSky(Sky value);

} // Worksite
