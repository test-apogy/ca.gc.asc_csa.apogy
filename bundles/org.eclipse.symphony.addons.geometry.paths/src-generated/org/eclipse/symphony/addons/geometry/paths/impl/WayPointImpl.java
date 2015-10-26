/**
 * Canadian Space Agency 2007.
 *
 * $Id: WayPointImpl.java,v 1.4.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsPackage;
import org.eclipse.symphony.addons.geometry.paths.WayPoint;
import org.eclipse.symphony.common.geometry.data3d.impl.CartesianPositionCoordinatesImpl;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;
import org.eclipse.symphony.common.topology.INodeVisitor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Way Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.geometry.paths.impl.WayPointImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WayPointImpl extends CartesianPositionCoordinatesImpl implements WayPoint
{
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Node parent;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeId() <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeId()
	 * @generated
	 * @ordered
	 */
	protected String nodeId = NODE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WayPointImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__AddonsGeometryPathsPackage.Literals.WAY_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParent()
	{
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Node)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParent()
	{
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Node newParent)
	{
		Node oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription)
	{
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsGeometryPathsPackage.WAY_POINT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeId(String newNodeId) {
		String oldNodeId = nodeId;
		nodeId = newNodeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsGeometryPathsPackage.WAY_POINT__NODE_ID, oldNodeId, nodeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getChildren()
	{
		if (children == null) {
			children = new EObjectContainmentEList<Node>(Node.class, this, Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void accept(INodeVisitor visitor) 
	{
		if (visitor.getType().isInstance(this)) 
		{
			visitor.visit(this);
		}

		// We do the same for all the children.
		for (Node child : getChildren()) {
			child.accept(visitor);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__DESCRIPTION:
				return getDescription();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__NODE_ID:
				return getNodeId();
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT:
				setParent((Node)newValue);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__NODE_ID:
				setNodeId((String)newValue);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Node>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT:
				setParent((Node)null);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__NODE_ID:
				setNodeId(NODE_ID_EDEFAULT);
				return;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN:
				getChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT:
				return parent != null;
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeId != null : !NODE_ID_EDEFAULT.equals(nodeId);
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT: return Symphony__CommonTopologyPackage.NODE__PARENT;
				case Symphony__AddonsGeometryPathsPackage.WAY_POINT__DESCRIPTION: return Symphony__CommonTopologyPackage.NODE__DESCRIPTION;
				case Symphony__AddonsGeometryPathsPackage.WAY_POINT__NODE_ID: return Symphony__CommonTopologyPackage.NODE__NODE_ID;
				default: return -1;
			}
		}
		if (baseClass == GroupNode.class) {
			switch (derivedFeatureID) {
				case Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN: return Symphony__CommonTopologyPackage.GROUP_NODE__CHILDREN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case Symphony__CommonTopologyPackage.NODE__PARENT: return Symphony__AddonsGeometryPathsPackage.WAY_POINT__PARENT;
				case Symphony__CommonTopologyPackage.NODE__DESCRIPTION: return Symphony__AddonsGeometryPathsPackage.WAY_POINT__DESCRIPTION;
				case Symphony__CommonTopologyPackage.NODE__NODE_ID: return Symphony__AddonsGeometryPathsPackage.WAY_POINT__NODE_ID;
				default: return -1;
			}
		}
		if (baseClass == GroupNode.class) {
			switch (baseFeatureID) {
				case Symphony__CommonTopologyPackage.GROUP_NODE__CHILDREN: return Symphony__AddonsGeometryPathsPackage.WAY_POINT__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseOperationID) {
				case Symphony__CommonTopologyPackage.NODE___ACCEPT__INODEVISITOR: return Symphony__AddonsGeometryPathsPackage.WAY_POINT___ACCEPT__INODEVISITOR;
				default: return -1;
			}
		}
		if (baseClass == GroupNode.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__AddonsGeometryPathsPackage.WAY_POINT___ACCEPT__INODEVISITOR:
				accept((INodeVisitor)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", nodeId: ");
		result.append(nodeId);
		result.append(')');
		return result.toString();
	}

} //WayPointImpl
