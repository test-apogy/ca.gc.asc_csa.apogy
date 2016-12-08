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

import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Celestial Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Celestial Bodies
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CelestialBody#getMeanRadius <em>Mean Radius</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCelestialBody()
 * @model abstract="true"
 * @generated
 */
public interface CelestialBody extends GroupNode, Named {
	/**
	 * Returns the value of the '<em><b>Mean Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The mean radius of the body. Sub-classes should overload the getter to return the appropriate value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mean Radius</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getCelestialBody_MeanRadius()
	 * @model unique="false" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m'"
	 * @generated
	 */
	double getMeanRadius();

} // CelestialBody
