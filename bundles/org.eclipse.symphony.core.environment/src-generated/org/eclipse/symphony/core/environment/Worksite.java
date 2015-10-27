/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Worksite#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Worksite#getOrbitsModels <em>Orbits Models</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Worksite#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getWorksite()
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
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getWorksite_WorksiteNode()
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
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getWorksite_OrbitsModels()
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
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getWorksite_Environment()
	 * @model containment="true"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.Worksite#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);
} // Worksite
