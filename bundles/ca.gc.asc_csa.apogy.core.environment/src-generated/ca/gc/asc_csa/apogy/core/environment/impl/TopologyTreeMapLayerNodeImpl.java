/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Tree Map Layer Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerNodeImpl#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.TopologyTreeMapLayerNodeImpl#getTransientParent <em>Transient Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologyTreeMapLayerNodeImpl extends AggregateGroupNodeImpl implements TopologyTreeMapLayerNode 
{
	/**
	 * The cached value of the '{@link #getTransientParent() <em>Transient Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientParent()
	 * @generated
	 * @ordered
	 */
	protected Node transientParent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyTreeMapLayerNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.TOPOLOGY_TREE_MAP_LAYER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayer getTopologyTreeMapLayer() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER) return null;
		return (TopologyTreeMapLayer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayer basicGetTopologyTreeMapLayer() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER) return null;
		return (TopologyTreeMapLayer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NotificationChain basicSetTopologyTreeMapLayer(TopologyTreeMapLayer newTopologyTreeMapLayer, NotificationChain msgs) 
	{
		if(newTopologyTreeMapLayer != null)
		{
			newTopologyTreeMapLayer.getAbstractMapLayerNode().getAggregatedChildren().add(this);
		}
		
		return basicSetTopologyTreeMapLayerGen(newTopologyTreeMapLayer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyTreeMapLayerGen(TopologyTreeMapLayer newTopologyTreeMapLayer, NotificationChain msgs) 
	{
		msgs = eBasicSetContainer((InternalEObject)newTopologyTreeMapLayer, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER, msgs);
		return msgs;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyTreeMapLayer(TopologyTreeMapLayer newTopologyTreeMapLayer) 
	{
		if (newTopologyTreeMapLayer != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER && newTopologyTreeMapLayer != null)) {
			if (EcoreUtil.isAncestor(this, newTopologyTreeMapLayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTopologyTreeMapLayer != null)
				msgs = ((InternalEObject)newTopologyTreeMapLayer).eInverseAdd(this, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT, TopologyTreeMapLayer.class, msgs);
			msgs = basicSetTopologyTreeMapLayer(newTopologyTreeMapLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER, newTopologyTreeMapLayer, newTopologyTreeMapLayer));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyTreeMapLayerGen(TopologyTreeMapLayer newTopologyTreeMapLayer) {
		if (newTopologyTreeMapLayer != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER && newTopologyTreeMapLayer != null)) {
			if (EcoreUtil.isAncestor(this, newTopologyTreeMapLayer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTopologyTreeMapLayer != null)
				msgs = ((InternalEObject)newTopologyTreeMapLayer).eInverseAdd(this, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT, TopologyTreeMapLayer.class, msgs);
			msgs = basicSetTopologyTreeMapLayer(newTopologyTreeMapLayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER, newTopologyTreeMapLayer, newTopologyTreeMapLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getTransientParent() {
		if (transientParent != null && transientParent.eIsProxy()) {
			InternalEObject oldTransientParent = (InternalEObject)transientParent;
			transientParent = (Node)eResolveProxy(oldTransientParent);
			if (transientParent != oldTransientParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT, oldTransientParent, transientParent));
			}
		}
		return transientParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTransientParent() {
		return transientParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientParent(Node newTransientParent) {
		Node oldTransientParent = transientParent;
		transientParent = newTransientParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT, oldTransientParent, transientParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTopologyTreeMapLayer((TopologyTreeMapLayer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER:
				return basicSetTopologyTreeMapLayer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER:
				return eInternalContainer().eInverseRemove(this, ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT, TopologyTreeMapLayer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER:
				if (resolve) return getTopologyTreeMapLayer();
				return basicGetTopologyTreeMapLayer();
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT:
				if (resolve) return getTransientParent();
				return basicGetTransientParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER:
				setTopologyTreeMapLayer((TopologyTreeMapLayer)newValue);
				return;
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT:
				setTransientParent((Node)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER:
				setTopologyTreeMapLayer((TopologyTreeMapLayer)null);
				return;
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT:
				setTransientParent((Node)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER:
				return basicGetTopologyTreeMapLayer() != null;
			case ApogyCoreEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT:
				return transientParent != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Node getParent() 
	{
		return getTransientParent();
	}
	
	@Override
	public void setParent(Node newParent) 
	{					
		setTransientParent(newParent);		
	}
	
} //TopologyTreeMapLayerNodeImpl
