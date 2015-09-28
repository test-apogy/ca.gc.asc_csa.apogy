/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonyTopology;
import ca.gc.space.topology.GroupNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Symphony Topology</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.impl.SymphonyTopologyImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymphonyTopologyImpl extends MinimalEObjectImpl.Container
		implements SymphonyTopology {

	/**
	 * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRootNode()
	 * @generated
	 * @ordered
	 */
	protected GroupNode rootNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyTopologyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCorePackage.Literals.SYMPHONY_TOPOLOGY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GroupNode getRootNode() {
		if (rootNode != null && rootNode.eIsProxy()) {
			InternalEObject oldRootNode = (InternalEObject)rootNode;
			rootNode = (GroupNode)eResolveProxy(oldRootNode);
			if (rootNode != oldRootNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyCorePackage.SYMPHONY_TOPOLOGY__ROOT_NODE, oldRootNode, rootNode));
			}
		}
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GroupNode basicGetRootNode() {
		return rootNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootNode(GroupNode newRootNode) {
		GroupNode oldRootNode = rootNode;
		rootNode = newRootNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCorePackage.SYMPHONY_TOPOLOGY__ROOT_NODE, oldRootNode, rootNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCorePackage.SYMPHONY_TOPOLOGY__ROOT_NODE:
				if (resolve) return getRootNode();
				return basicGetRootNode();
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
			case SymphonyCorePackage.SYMPHONY_TOPOLOGY__ROOT_NODE:
				setRootNode((GroupNode)newValue);
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
			case SymphonyCorePackage.SYMPHONY_TOPOLOGY__ROOT_NODE:
				setRootNode((GroupNode)null);
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
			case SymphonyCorePackage.SYMPHONY_TOPOLOGY__ROOT_NODE:
				return rootNode != null;
		}
		return super.eIsSet(featureID);
	}

} // SymphonyTopologyImpl
