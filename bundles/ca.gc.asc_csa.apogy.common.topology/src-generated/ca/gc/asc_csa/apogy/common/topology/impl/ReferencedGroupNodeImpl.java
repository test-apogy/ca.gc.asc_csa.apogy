/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencedGroupNodeImpl.java,v 1.16.2.3 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.asc_csa.apogy.common.topology.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Referenced Group Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.impl.ReferencedGroupNodeImpl#getReferencedChildren <em>Referenced Children</em>}</li>
 * </ul>
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
		return ApogyCommonTopologyPackage.Literals.REFERENCED_GROUP_NODE;
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
					this, ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__CHILDREN) {
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
			case ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
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
			case ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
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
			case ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
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
			case ApogyCommonTopologyPackage.REFERENCED_GROUP_NODE__REFERENCED_CHILDREN:
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
