/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.AbstractOrbitModel;
import org.eclipse.symphony.core.AbstractWorksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.Worksite#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.Worksite#getOrbitsModels <em>Orbits Models</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.Worksite#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getWorksite()
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
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getWorksite_WorksiteNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  WorksiteNode getWorksiteNode();

  /**
	 * Returns the value of the '<em><b>Orbits Models</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.AbstractOrbitModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbits Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbits Models</em>' reference list.
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getWorksite_OrbitsModels()
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
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getWorksite_Environment()
	 * @model containment="true"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.Worksite#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);
} // Worksite
