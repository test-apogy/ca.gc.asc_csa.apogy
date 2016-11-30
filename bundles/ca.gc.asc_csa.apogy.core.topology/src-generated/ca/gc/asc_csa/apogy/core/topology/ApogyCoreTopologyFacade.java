package ca.gc.asc_csa.apogy.core.topology;
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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.topology.impl.ApogyCoreTopologyFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ApogyCoreTopologyFacade Singleton.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#getApogyTopology <em>Apogy Topology</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyCoreTopologyFacade()
 * @model
 * @generated
 */
public interface ApogyCoreTopologyFacade extends EObject
{

	/**
	 * Returns the value of the '<em><b>Apogy Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Apogy Topology Singleton.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apogy Topology</em>' reference.
	 * @see #setApogyTopology(ApogyTopology)
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyCoreTopologyFacade_ApogyTopology()
	 * @model transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	ApogyTopology getApogyTopology();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade#getApogyTopology <em>Apogy Topology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy Topology</em>' reference.
	 * @see #getApogyTopology()
	 * @generated
	 */
	void setApogyTopology(ApogyTopology value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false"
	 * @generated
	 */
	Node getVariableOriginNode(Variable variable);
	
	 /**
	 * <!-- begin-user-doc -->
	  * <!-- end-user-doc -->
	 * @model unique="false" abstractTypeImplementationUnique="false"
	 * @generated
	 */
	Node getAbstractTypeImplementationOriginNode(AbstractTypeImplementation abstractTypeImplementation);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" apogyEnvironmentUnique="false"
	 * @generated
	 */
	ApogyEnvironmentNode createApogyEnvironmentNode(ApogyEnvironment apogyEnvironment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializes the {@link ApogyTopology}.
	 * @param environment Refers the loaded environment.
	 * <!-- end-model-doc -->
	 * @model environmentUnique="false"
	 * @generated
	 */
	void initApogyTopology(ApogyEnvironment environment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disposes the {@link ApogyTopology}.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void disposeApogyTopology();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds the FeatureOfInterestNode associated with a specified FeatureOfInterest in the active session.
	 * @param featureOfInterest The specified FeatureOfInterest.
	 * @return The FeatureOfInterestNode associated with the specified FeatureOfInterest, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" featureOfInterestUnique="false"
	 * @generated
	 */
	FeatureOfInterestNode getFeatureOfInterestNode(FeatureOfInterest featureOfInterest);

	/**
    * @generated_NOT
	*/
	public static ApogyCoreTopologyFacade INSTANCE = ApogyCoreTopologyFacadeImpl.getInstance();
	
} // ApogyCoreTopologyFacade
