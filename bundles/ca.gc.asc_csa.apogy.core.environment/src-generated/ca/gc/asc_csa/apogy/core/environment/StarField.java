/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents the brightest stars in the sky.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.StarField#getStars <em>Stars</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.StarField#getStarFieldFileName <em>Star Field File Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getStarField()
 * @model
 * @generated
 */
public interface StarField extends Node
{

  /**
	 * Returns the value of the '<em><b>Stars</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.Star}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stars</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Stars</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getStarField_Stars()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
  EList<Star> getStars();

  /**
	 * Returns the value of the '<em><b>Star Field File Name</b></em>' attribute.
	 * The default value is <code>"bright_star_catalog_5.txt"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Star Field File Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Star Field File Name</em>' attribute.
	 * @see #setStarFieldFileName(String)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getStarField_StarFieldFileName()
	 * @model default="bright_star_catalog_5.txt" unique="false"
	 * @generated
	 */
  String getStarFieldFileName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.StarField#getStarFieldFileName <em>Star Field File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Star Field File Name</em>' attribute.
	 * @see #getStarFieldFileName()
	 * @generated
	 */
  void setStarFieldFileName(String value);
} // StarField
