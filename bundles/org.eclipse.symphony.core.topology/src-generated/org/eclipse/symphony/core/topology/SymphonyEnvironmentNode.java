/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology;

import org.eclipse.symphony.common.topology.ReferencedGroupNode;
import org.eclipse.symphony.core.ResultsListNode;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symphony Environment Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Specialized Nodes.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getSymphonyEnvironment <em>Symphony Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getResultsListNode <em>Results List Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getSymphonySystemAPIsNode <em>Symphony System AP Is Node</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSymphonyEnvironmentNode()
 * @model
 * @generated
 */
public interface SymphonyEnvironmentNode extends ReferencedGroupNode
{
  /**
	 * Returns the value of the '<em><b>Symphony Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symphony Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Symphony Environment</em>' reference.
	 * @see #setSymphonyEnvironment(SymphonyEnvironment)
	 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSymphonyEnvironmentNode_SymphonyEnvironment()
	 * @model transient="true"
	 * @generated
	 */
  SymphonyEnvironment getSymphonyEnvironment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getSymphonyEnvironment <em>Symphony Environment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symphony Environment</em>' reference.
	 * @see #getSymphonyEnvironment()
	 * @generated
	 */
  void setSymphonyEnvironment(SymphonyEnvironment value);

  /**
	 * Returns the value of the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Worksite Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksite Node</em>' reference.
	 * @see #setWorksiteNode(WorksiteNode)
	 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSymphonyEnvironmentNode_WorksiteNode()
	 * @model required="true" transient="true" derived="true"
	 * @generated
	 */
  WorksiteNode getWorksiteNode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.topology.SymphonyEnvironmentNode#getWorksiteNode <em>Worksite Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksite Node</em>' reference.
	 * @see #getWorksiteNode()
	 * @generated
	 */
  void setWorksiteNode(WorksiteNode value);

  /**
	 * Returns the value of the '<em><b>Results List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results List Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Results List Node</em>' reference.
	 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSymphonyEnvironmentNode_ResultsListNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  ResultsListNode getResultsListNode();

  /**
	 * Returns the value of the '<em><b>Symphony System AP Is Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symphony System AP Is Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Symphony System AP Is Node</em>' reference.
	 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSymphonyEnvironmentNode_SymphonySystemAPIsNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  SymphonySystemAPIsNode getSymphonySystemAPIsNode();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void dispose();

} // SymphonyEnvironmentNode
