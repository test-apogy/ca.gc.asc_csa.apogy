/**
 * <copyright>
 * </copyright>
 *
 * $Id: DynamicSystemProperties.java,v 1.8.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
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
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties#getContraints <em>Contraints</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.DynamicSystemProperties#getMaterials <em>Materials</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getDynamicSystemProperties()
 * @model
 * @generated
 */
public interface DynamicSystemProperties extends AggregateGroupNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Contraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.addons.dynamics.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of AbstractConstraint used with a Dynamic System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contraints</em>' containment reference list.
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getDynamicSystemProperties_Contraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConstraint> getContraints();

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
