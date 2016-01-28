/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.bindings;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.bindings.impl.ApogyCommonTopologyBindingsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Utility Binding Facade.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getApogyCommonTopologyBindingsFacade()
 * @model
 * @generated
 */
public interface ApogyCommonTopologyBindingsFacade extends EObject
{
	public static final ApogyCommonTopologyBindingsFacade INSTANCE = ApogyCommonTopologyBindingsFacadeImpl.getInstance();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convenience method that copies a Binding.
	 * @param originalBinding The original binding to copy.
	 * @param originalToCopyNodeMap Maps original Nodes to copied ones.
	 * @return The copy of the original Binding.
	 * <!-- end-model-doc -->
	 * @model unique="false" originalBindingUnique="false" originalToCopyNodeMapDataType="ca.gc.asc_csa.apogy.common.topology.bindings.Map<ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.common.topology.Node>" originalToCopyNodeMapUnique="false"
	 * @generated
	 */
  AbstractTopologyBinding copy(AbstractTopologyBinding originalBinding, Map<Node, Node> originalToCopyNodeMap);
} // ApogyCommonTopologyBindingsFacade
