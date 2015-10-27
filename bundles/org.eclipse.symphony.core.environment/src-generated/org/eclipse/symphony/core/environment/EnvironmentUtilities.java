/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.environment.impl.EnvironmentUtilitiesImpl;

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
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getEnvironmentUtilities()
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
	 * @model unique="false" dateDataType="org.eclipse.symphony.core.environment.Date" dateUnique="false"
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
	 * @model unique="false" exceptions="org.eclipse.symphony.common.emf.Exception" rightAscensionStringUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  float parseDegMinSec(String degMinSecAngleString);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that sorts a list of stars by magnitude.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.SortedSet<org.eclipse.symphony.core.environment.Star>" unique="false" starsDataType="org.eclipse.symphony.core.environment.List<org.eclipse.symphony.core.environment.Star>" starsUnique="false" starsMany="false"
	 * @generated
	 */
  SortedSet<Star> sortByMagnitude(List<Star> stars);

} // EnvironmentUtilities
