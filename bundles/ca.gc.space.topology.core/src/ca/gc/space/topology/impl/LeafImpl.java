/**
 * <copyright>
 * </copyright>
 *
 * $Id: LeafImpl.java,v 1.2.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.space.topology.Leaf;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Leaf</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class LeafImpl extends NodeImpl implements Leaf {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LeafImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.LEAF;
	}

} // LeafImpl
