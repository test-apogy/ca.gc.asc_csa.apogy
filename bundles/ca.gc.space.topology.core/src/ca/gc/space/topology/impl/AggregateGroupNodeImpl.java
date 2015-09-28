/**
 * <copyright>
 * </copyright>
 *
 * $Id: AggregateGroupNodeImpl.java,v 1.13.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.space.topology.AggregateGroupNode;
import ca.gc.space.topology.INodeVisitor;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Aggregate Group Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.topology.impl.AggregateGroupNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link ca.gc.space.topology.impl.AggregateGroupNodeImpl#getAggregatedChildren <em>Aggregated Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregateGroupNodeImpl extends NodeImpl implements
		AggregateGroupNode {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> children;

	/**
	 * The cached value of the '{@link #getAggregatedChildren()
	 * <em>Aggregated Children</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAggregatedChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> aggregatedChildren;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateGroupNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyPackage.Literals.AGGREGATE_GROUP_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Node> getChildren() {
		return getAggregatedChildren();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EList<Node> getAggregatedChildren() {
		if (aggregatedChildren == null) {
			aggregatedChildren = new EObjectContainmentEList<Node>(Node.class,
					this, TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN) {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1584606995652427823L;

				public boolean add(Node object) {
					object.setParent(AggregateGroupNodeImpl.this);
					boolean val = super.add(object);
					return val;
				}

				public boolean addAll(
						java.util.Collection<? extends Node> collection) {

					for (Node node : collection) {
						node.setParent(AggregateGroupNodeImpl.this);
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

		return aggregatedChildren;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN:
				return ((InternalEList<?>)getAggregatedChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN:
				return getChildren();
			case TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN:
				return getAggregatedChildren();
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
			case TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
			case TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN:
				getAggregatedChildren().clear();
				getAggregatedChildren().addAll((Collection<? extends Node>)newValue);
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
			case TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN:
				getChildren().clear();
				return;
			case TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN:
				getAggregatedChildren().clear();
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
			case TopologyPackage.AGGREGATE_GROUP_NODE__CHILDREN:
				return children != null && !children.isEmpty();
			case TopologyPackage.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN:
				return aggregatedChildren != null && !aggregatedChildren.isEmpty();
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

} // AggregateGroupNodeImpl
