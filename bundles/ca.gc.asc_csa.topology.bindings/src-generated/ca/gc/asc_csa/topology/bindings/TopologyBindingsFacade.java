/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.topology.bindings.impl.TopologyBindingsFacadeImpl;
import ca.gc.space.topology.Node;

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
 * @see ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage#getTopologyBindingsFacade()
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
	 * @model unique="false" originalBindingUnique="false" originalToCopyNodeMapDataType="ca.gc.asc_csa.topology.bindings.Map<ca.gc.space.topology.Node, ca.gc.space.topology.Node>" originalToCopyNodeMapUnique="false"
	 * @generated
	 */
  AbstractTopologyBinding copy(AbstractTopologyBinding originalBinding, Map<Node, Node> originalToCopyNodeMap);
} // TopologyBindingsFacade
