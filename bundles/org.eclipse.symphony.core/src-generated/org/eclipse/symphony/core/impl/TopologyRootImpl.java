/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.TopologyRoot;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Topology Root</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.impl.TopologyRootImpl#getOriginNode <em>Origin Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyRootImpl extends MinimalEObjectImpl.Container implements
		TopologyRoot {
	/**
	 * The cached value of the '{@link #getOriginNode() <em>Origin Node</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOriginNode()
	 * @generated
	 * @ordered
	 */
	protected Node originNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CorePackage.Literals.TOPOLOGY_ROOT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node getOriginNode() {
		return originNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginNode(Node newOriginNode,
			NotificationChain msgs) {
		Node oldOriginNode = originNode;
		originNode = newOriginNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, oldOriginNode, newOriginNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginNode(Node newOriginNode) {
		if (newOriginNode != originNode) {
			NotificationChain msgs = null;
			if (originNode != null)
				msgs = ((InternalEObject)originNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, null, msgs);
			if (newOriginNode != null)
				msgs = ((InternalEObject)newOriginNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, null, msgs);
			msgs = basicSetOriginNode(newOriginNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE, newOriginNode, newOriginNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				return basicSetOriginNode(null, msgs);
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
			case Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				return getOriginNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				setOriginNode((Node)newValue);
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
			case Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				setOriginNode((Node)null);
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
			case Symphony__CorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
				return originNode != null;
		}
		return super.eIsSet(featureID);
	}

} // TopologyRootImpl
