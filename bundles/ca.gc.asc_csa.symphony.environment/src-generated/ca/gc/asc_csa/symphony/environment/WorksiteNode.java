/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment;

import ca.gc.space.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Worksite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.WorksiteNode#getWorksite <em>Worksite</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getWorksiteNode()
 * @model
 * @generated
 */
public interface WorksiteNode extends GroupNode
{
  /**
	 * Returns the value of the '<em><b>Worksite</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Worksite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksite</em>' reference.
	 * @see #setWorksite(Worksite)
	 * @see ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage#getWorksiteNode_Worksite()
	 * @model transient="true"
	 * @generated
	 */
  Worksite getWorksite();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.WorksiteNode#getWorksite <em>Worksite</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksite</em>' reference.
	 * @see #getWorksite()
	 * @generated
	 */
  void setWorksite(Worksite value);

} // WorksiteNode
