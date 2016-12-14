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

import ca.gc.asc_csa.apogy.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sky</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Sky
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getWorksite <em>Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSkyNode <em>Sky Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSun <em>Sun</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getStarField <em>Star Field</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSky()
 * @model
 * @generated
 */
public interface Sky extends Timed {
	/**
	 * Returns the value of the '<em><b>Worksite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worksite to which the sky is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Worksite</em>' container reference.
	 * @see #setWorksite(Worksite)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSky_Worksite()
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite#getSky
	 * @model opposite="sky" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	Worksite getWorksite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getWorksite <em>Worksite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksite</em>' container reference.
	 * @see #getWorksite()
	 * @generated
	 */
	void setWorksite(Worksite value);

	/**
	 * Returns the value of the '<em><b>Sky Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sky Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSky_SkyNode()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	SkyNode getSkyNode();

	/**
	 * Returns the value of the '<em><b>Sun</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Sun in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sun</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSky_Sun()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SUN'"
	 * @generated
	 */
	Sun getSun();

	/**
	 * Returns the value of the '<em><b>Star Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stars in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Star Field</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getSky_StarField()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='STARS'"
	 * @generated
	 */
	StarField getStarField();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Sun angular diameter, in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SUN' apogy_units='rad'"
	 * @generated
	 */
	double getSunAngularDiameter();

} // Sky
