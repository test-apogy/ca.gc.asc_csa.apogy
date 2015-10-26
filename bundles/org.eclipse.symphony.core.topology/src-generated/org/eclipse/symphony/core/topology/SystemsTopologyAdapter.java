/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.ReferencedGroupNode;
import org.eclipse.symphony.core.SymphonyEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Systems Topology Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getSystemsGroup <em>Systems Group</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSystemsTopologyAdapter()
 * @model
 * @generated
 */
public interface SystemsTopologyAdapter extends EObject
{
  /**
	 * Returns the value of the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Deployment to monitor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' reference.
	 * @see #setDeployment(SymphonyEnvironment)
	 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSystemsTopologyAdapter_Deployment()
	 * @model transient="true"
	 * @generated
	 */
  SymphonyEnvironment getDeployment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getDeployment <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' reference.
	 * @see #getDeployment()
	 * @generated
	 */
  void setDeployment(SymphonyEnvironment value);

  /**
	 * Returns the value of the '<em><b>Systems Group</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The topology representing the Systems found in the Deployment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Systems Group</em>' reference.
	 * @see #setSystemsGroup(ReferencedGroupNode)
	 * @see org.eclipse.symphony.core.topology.SymphonyTopologyPackage#getSystemsTopologyAdapter_SystemsGroup()
	 * @model transient="true"
	 * @generated
	 */
  ReferencedGroupNode getSystemsGroup();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.topology.SystemsTopologyAdapter#getSystemsGroup <em>Systems Group</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systems Group</em>' reference.
	 * @see #getSystemsGroup()
	 * @generated
	 */
  void setSystemsGroup(ReferencedGroupNode value);

} // SystemsTopologyAdapter
