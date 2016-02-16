package ca.gc.asc_csa.apogy.core.environment;
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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.core.AbstractOrbitModel;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getOrbitsModels <em>Orbits Models</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getWorksite()
 * @model abstract="true"
 * @generated
 */
public interface Worksite extends AbstractWorksite
{

  /**
	 * Returns the value of the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Worksite Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksite Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getWorksite_WorksiteNode()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' children='true' notify='true'"
	 * @generated
	 */
  WorksiteNode getWorksiteNode();

  /**
	 * Returns the value of the '<em><b>Orbits Models</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.AbstractOrbitModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbits Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbits Models</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getWorksite_OrbitsModels()
	 * @model
	 * @generated
	 */
	EList<AbstractOrbitModel> getOrbitsModels();

		/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getWorksite_Environment()
	 * @model containment="true"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Worksite#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);
} // Worksite
