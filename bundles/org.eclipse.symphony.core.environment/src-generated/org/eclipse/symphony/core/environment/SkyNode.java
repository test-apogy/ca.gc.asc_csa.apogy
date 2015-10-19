/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sky Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.SkyNode#getSky <em>Sky</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSkyNode()
 * @model
 * @generated
 */
public interface SkyNode extends GroupNode
{

  /**
	 * Returns the value of the '<em><b>Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sky</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky</em>' reference.
	 * @see #setSky(Sky)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getSkyNode_Sky()
	 * @model transient="true"
	 * @generated
	 */
  Sky getSky();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.SkyNode#getSky <em>Sky</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky</em>' reference.
	 * @see #getSky()
	 * @generated
	 */
  void setSky(Sky value);
} // SkyNode
