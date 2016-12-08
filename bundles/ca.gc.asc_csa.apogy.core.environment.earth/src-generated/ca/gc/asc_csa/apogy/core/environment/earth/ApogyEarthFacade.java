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
package ca.gc.asc_csa.apogy.core.environment.earth;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.environment.earth.impl.ApogyEarthFacadeImpl;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Earth Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getApogyEarthFacade()
 * @model
 * @generated
 */
public interface ApogyEarthFacade extends EObject 
{
	public static ApogyEarthFacade INSTANCE = ApogyEarthFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" apogySystemUnique="false" nodeIDUnique="false" environmentUnique="false"
	 * @generated
	 */
	Tuple3d getMoonVector(ApogySystem apogySystem, String nodeID, Environment environment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false" environmentUnique="false"
	 * @generated
	 */
	Tuple3d getMoonVector(Node node, Environment environment);

} // ApogyEarthFacade
