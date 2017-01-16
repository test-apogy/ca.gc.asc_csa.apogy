package ca.gc.asc_csa.apogy.core;
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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.impl.ApogyCoreFacadeImpl;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Apogy Core Facade.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getApogyCoreFacade()
 * @model
 * @generated
 */
public interface ApogyCoreFacade extends EObject {
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Create the 4 by 4 homogeneous matrix that represent the absolute pose of a pose initially
	 * defined as a relative pose in an ApogySystem frame.
	 * @param apogySystem The ApogySytem in which to interpret the relative pose.
	 * @param relativePose The relative pose in the Apogy System frame.
	 * @return The absolute pose expressed in 4 by 4 homogeneous matrix.
	 * <!-- end-model-doc -->
	 * @model unique="false" apogySystemUnique="false" relativePoseUnique="false"
	 * @generated
	 */
  Matrix4x4 computeAbsolutePoseMatrix(ApogySystem apogySystem, Matrix4x4 relativePose);

  /**
	 * @generated_NOT
	 */
	public static ApogyCoreFacade INSTANCE = ApogyCoreFacadeImpl
			.getInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a Result Node associated with a specified PositionedResult result.
	 * @param result The specified PositionedResult.
	 * @return The ResultNode.
	 * <!-- end-model-doc -->
	 * @model unique="false" resultUnique="false"
	 * @generated
	 */
	ResultNode createResultNode(PositionedResult result);

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Searches and returns the {@link ApogySystem} instance based on the specified fullyQualifiedName.
	 * @param environment Environment from which the search will be performed.
	 * @param param fullyQualifiedName Fully qualified name that refers the {@link ApogySystem} instance.
	 * @return Reference to the {@link ApogySystem} that matches the fully qualified name or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" environmentUnique="false" fullyQualifiedNameUnique="false"
	 * @generated
	 */
  ApogySystem getApogySystem(Environment environment, String fullyQualifiedName);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Loads FeatureOfInterest from file.
	 * @param url The URL locating the file.
	 * @return The list of loaded FeatureOfInterest.
	 * @throws An Exception if the file could not be loaded.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.List<ca.gc.asc_csa.apogy.core.FeatureOfInterest>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.Exception" urlUnique="false"
	 * @generated
	 */
	List<FeatureOfInterest> loadFeatureOfInterestFromFile(String url) throws Exception;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Saves a list of FeatureOfInterest to file (in CSV format).
	 * @param path The path to the file.
	 * @param foiList The list of FeatureOfInterest.
	 * @throws An Exception if the file could not be saved.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.core.Exception" pathUnique="false" foiListDataType="ca.gc.asc_csa.apogy.core.List<ca.gc.asc_csa.apogy.core.FeatureOfInterest>" foiListUnique="false" foiListMany="false"
	 * @generated
	 */
	void saveFeatureOfInterestToFile(String path, List<FeatureOfInterest> foiList) throws Exception;

} // ApogyCoreFacade
