/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.symphony.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic System Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for Dynamics System that is used as a container for many Dynamic System attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties#getMaterials <em>Materials</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getDynamicSystemProperties()
 * @model
 * @generated
 */
public interface DynamicSystemProperties extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of AbstractConstraint used with a Dynamic System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getDynamicSystemProperties_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Materials</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of AbstractMaterial used in the world.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Materials</em>' containment reference list.
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getDynamicSystemProperties_Materials()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractMaterial> getMaterials();

} // DynamicSystemProperties
