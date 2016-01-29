/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Map Layer Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode#getAbstractMapLayer <em>Abstract Map Layer</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAbstractMapLayerNode()
 * @model
 * @generated
 */
public interface AbstractMapLayerNode extends AggregateGroupNode
{
  /**
	 * Returns the value of the '<em><b>Abstract Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract Map Layer</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Map Layer</em>' reference.
	 * @see #setAbstractMapLayer(AbstractMapLayer)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getAbstractMapLayerNode_AbstractMapLayer()
	 * @model transient="true"
	 * @generated
	 */
  AbstractMapLayer getAbstractMapLayer();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode#getAbstractMapLayer <em>Abstract Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract Map Layer</em>' reference.
	 * @see #getAbstractMapLayer()
	 * @generated
	 */
  void setAbstractMapLayer(AbstractMapLayer value);

} // AbstractMapLayerNode