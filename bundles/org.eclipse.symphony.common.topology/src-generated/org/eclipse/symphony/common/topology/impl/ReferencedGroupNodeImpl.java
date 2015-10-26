/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencedGroupNodeImpl.java,v 1.16.2.3 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.topology.INodeVisitor;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ReferencedGroupNode;
import org.eclipse.symphony.common.topology.TopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Referenced Group Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.impl.ReferencedGroupNodeImpl#getReferencedChildren <em>Referenced Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferencedGroupNodeImpl extends GroupNodeImpl implements
		ReferencedGroupNode {
	/**
	 * The cached value of the '{@link #getReferencedChildren() <em>Referenced Children</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> referencedChildren;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedGroupNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.REFERENCED_GROUP_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Node> getChildren() {
		return getReferencedChildren();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Node> getReferencedChildren() {
		if (referencedChildren == null) {
			referencedChildren = new EObjectResolvingEList<Node>(Node.class,
					this, TopologyPackage.REFERENCED_GROUP_NODE__CHILDREN) {
				/**
						 * 
						 */
				private static final long serialVersionUID = 1L;

				public boolean add(Node object) {
					object.setParent(ReferencedGroupNodeImpl.this);
					boolean val = super.add(object);
					return val;
				}

				public boolean addAll(
						java.util.Collection<? extends Node> collection) {

					for (Node node : collection) {
						node.setParent(ReferencedGroupNodeImpl.this);
					}
					boolean val = super.addAll(collection);

					return val;
				}

				public boolean remove(Object object) {

					boolean val = super.remove(object);

					if (object instanceof Node) {
						Node node = (Node) object;

						node.setParent(null);
					}

					return val;
				}

				public boolean removeAll(java.util.Collection<?> collection) {

					boolean val = super.removeAll(collection);

					for (Object object : collection) {
						if (object instanceof Node) {
							Node node = (Node) object;

							node.setParent(null);
						}
					}

					return val;
				}

				public Node remove(int index) {

					Node node = super.remove(index);

					if (node != null) {
						node.setParent(null);
					}

					return node;
				}
			};
		}
		return referencedChildren;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
				return getReferencedChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
				getReferencedChildren().clear();
				getReferencedChildren().addAll((Collection<? extends Node>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
				getReferencedChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
				return referencedChildren != null && !referencedChildren.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void accept(INodeVisitor visitor) {
		if (visitor.getType().isInstance(this)) {
			visitor.visit(this);
		}

		// We do the same for all the children.
		for (Node child : getChildren()) {
			child.accept(visitor);
		}
	}

} // ReferencedGroupNodeImpl
