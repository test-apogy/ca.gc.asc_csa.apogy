/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.math.Tuple3d;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ApogyCommonTopologyAddonsDynamicsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamics Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Helper class containing a variety of dynamic topology utilities methods.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getApogyCommonTopologyAddonsDynamicsFacade()
 * @model
 * @generated
 */
public interface ApogyCommonTopologyAddonsDynamicsFacade extends EObject
{
	public static final ApogyCommonTopologyAddonsDynamicsFacade INSTANCE = ApogyCommonTopologyAddonsDynamicsFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a node in a topology, traverse the tree and computes the location of the center of mass of the tree.
	 * @param root The root of the topology for which the position of the center of mass is to be computed.
	 * <!-- end-model-doc -->
	 * @model unique="false" rootUnique="false"
	 * @generated
	 */
	Tuple3d findCenterOfMass(Node root);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a node in a topology, traverse the tree and compute the mass of the tree.
	 * @param root The root of the topology for which the total mass is to be computed.
	 * <!-- end-model-doc -->
	 * @model unique="false" rootUnique="false"
	 * @generated
	 */
	double findTotalMass(Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a node in a topology, traverse the tree and extracts the Set of PhysicalBody defined in the topology.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.addons.dynamics.Set<ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PhysicalBody>" unique="false" rootUnique="false"
	 * @generated
	 */
	Set<PhysicalBody> getPhysicalBodies(Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" physicalBodyUnique="false" propertyTypeUnique="false"
	 * @generated
	 */
	<T extends AbstractPhysicalBodySimulationProperties> T getPhysicalNodeSimulationProperty(PhysicalBody physicalBody, Class<T> propertyType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" constraintUnique="false" propertyTypeUnique="false"
	 * @generated
	 */
	<T extends AbstractConstraintSimulationProperties> T getConstraintSimulationProperty(AbstractConstraint constraint, Class<T> propertyType);

} // ApogyCommonTopologyAddonsDynamicsFacade
