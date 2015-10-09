/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.impl.TopologyBindingsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Utility Binding facade.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage#getTopologyBindingsFacade()
 * @model
 * @generated
 */
public interface TopologyBindingsFacade extends EObject
{
	public static final TopologyBindingsFacade INSTANCE = TopologyBindingsFacadeImpl.getInstance();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Convenience method that copies a Binding.
	 * @param originalBinding The original binding to copy.
	 * @param originalToCopyNodeMap Maps original Nodes to copied ones.
	 * @return The copy of the original Binding.
	 * <!-- end-model-doc -->
	 * @model unique="false" originalBindingUnique="false" originalToCopyNodeMapDataType="org.eclipse.symphony.common.topology.bindings.Map<org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.common.topology.Node>" originalToCopyNodeMapUnique="false"
	 * @generated
	 */
  AbstractTopologyBinding copy(AbstractTopologyBinding originalBinding, Map<Node, Node> originalToCopyNodeMap);
} // TopologyBindingsFacade
