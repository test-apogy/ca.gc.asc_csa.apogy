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

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.environment.impl.EnvironmentUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Utilities class providing conversion methods.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getEnvironmentUtilities()
 * @model
 * @generated
 */
public interface EnvironmentUtilities extends EObject
{
	public static EnvironmentUtilities INSTANCE = EnvironmentUtilitiesImpl.getInstance(); 
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convert from Date (UTC) to Julian.
	 * Uses formula found at http://en.wikipedia.org/wiki/Julian_date#cite_note-12
	 * <!-- end-model-doc -->
	 * @model unique="false" dateDataType="ca.gc.asc_csa.apogy.core.environment.Date" dateUnique="false"
	 * @generated
	 */
  double convertToJulianDate(Date date);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that parses Right Ascension angle expressed in
	 * HH:mm:ss format and return an angle in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" rightAscensionStringUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
  float parseRightAscension(String rightAscensionString) throws Exception;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that parses an angle expressed in deg:mm:ss format
	 * and return an angle in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" degMinSecAngleStringUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
  float parseDegMinSec(String degMinSecAngleString);

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

} // EnvironmentUtilities
