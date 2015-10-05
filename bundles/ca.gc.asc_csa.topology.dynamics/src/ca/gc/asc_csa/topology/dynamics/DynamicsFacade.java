/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicsFacade.java,v 1.11.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.Tuple3d;

import ca.gc.asc_csa.topology.dynamics.impl.DynamicsFacadeImpl;
import ca.gc.space.topology.Node;

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
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getDynamicsFacade()
 * @model
 * @generated
 */
public interface DynamicsFacade extends EObject 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";
	public static final DynamicsFacade INSTANCE = DynamicsFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a node in a topology, traverse the tree and compute the mass of the tree.
	 * @param root The root of the topology for which the total mass is to be computed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	double findTotalMass(Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model propertyTypeDataType="ca.gc.asc_csa.topology.dynamics.Class<T>"
	 * @generated
	 */
	<T extends AbstractPhysicalBodySimulationProperties> T getPhysicalNodeSimulationProperty(PhysicalBody physicalBody, Class<T> propertyType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model propertyTypeDataType="ca.gc.asc_csa.topology.dynamics.Class<T>"
	 * @generated
	 */
	<T extends AbstractConstraintSimulationProperties> T getConstraintSimulationProperty(AbstractConstraint constraint, Class<T> propertyType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a node in a topology, traverse the tree and extracts the Set of RigidBody defined in the topology.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.topology.dynamics.Set<ca.gc.asc_csa.topology.dynamics.PhysicalBody>"
	 * @generated
	 */
	Set<PhysicalBody> getPhysicalBodies(Node root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Given a node in a topology, traverse the tree and computes the location of the center of mass of the tree.
	 * @param root The root of the topology for which the position of the center of mass is to be computed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	Tuple3d findCenterOfMass(Node root);

} // DynamicsFacade
