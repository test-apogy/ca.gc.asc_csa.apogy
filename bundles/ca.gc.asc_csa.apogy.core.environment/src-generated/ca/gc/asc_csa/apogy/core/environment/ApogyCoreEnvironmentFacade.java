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

import java.util.List;

import java.util.SortedSet;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.environment.impl.ApogyCoreEnvironmentFacadeImpl;
import ca.gc.asc_csa.apogy.core.invocator.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class providing utilities methods to create fully initialze object.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getApogyCoreEnvironmentFacade()
 * @model
 * @generated
 */
public interface ApogyCoreEnvironmentFacade extends EObject
{
	
	public static ApogyCoreEnvironmentFacade INSTANCE = ApogyCoreEnvironmentFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and initialize a StarField.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  StarField createAndInitializeStars();

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that sorts a list of stars by magnitude.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.SortedSet<ca.gc.asc_csa.apogy.core.environment.Star>" unique="false" starsDataType="ca.gc.asc_csa.apogy.core.environment.List<ca.gc.asc_csa.apogy.core.environment.Star>" starsUnique="false" starsMany="false"
	 * @generated
	 */
	SortedSet<Star> sortByMagnitude(List<Star> stars);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model skyUnique="false" skyNodeUnique="false"
	 * @generated
	 */
  void initializeSkyNode(Sky sky, SkyNode skyNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates and initialize a star.
	 * @param magnitude Star's magnitude.
	 * @param rightAscension Right Ascension position of the star.
	 * @param declination The declination of the star.
	 * <!-- end-model-doc -->
	 * @model unique="false" magnitudeUnique="false" rightAscensionUnique="false" declinationUnique="false"
	 * @generated
	 */
  Star createStar(float magnitude, double rightAscension, double declination);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" apogySystemUnique="false" nodeIDUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getSunVector(ApogySystem apogySystem, String nodeID, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getSunVector(Node node, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false" targetApogySystemUnique="false" connectionPointUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(Node node, ApogySystem targetApogySystem, ConnectionPoint connectionPoint, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" sourceApogySystemUnique="false" nodeIDUnique="false" targetApogySystemUnique="false" connectionPointUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(ApogySystem sourceApogySystem, String nodeID, ApogySystem targetApogySystem, ConnectionPoint connectionPoint, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" sourceApogySystemUnique="false" nodeIDUnique="false" targetApogySystemUnique="false" connectionPointNameUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(ApogySystem sourceApogySystem, String nodeID, ApogySystem targetApogySystem, String connectionPointName, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" sourceApogySystemUnique="false" nodeIDUnique="false" targetSystemfullyQualifiedNameUnique="false" connectionPointNameUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(ApogySystem sourceApogySystem, String nodeID, String targetSystemfullyQualifiedName, String connectionPointName, Environment environment);

} // ApogyCoreEnvironmentFacade
