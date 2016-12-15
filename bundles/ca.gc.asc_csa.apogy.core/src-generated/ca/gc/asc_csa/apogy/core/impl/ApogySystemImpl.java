package ca.gc.asc_csa.apogy.core.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.AssemblyLinksList;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.invocator.AbstractType;
import ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Apogy System</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl#getTopologyRoot <em>Topology Root</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl#getBindingSet <em>Binding Set</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl#getConnectionPointsList <em>Connection Points List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl#getAssemblyLinksList <em>Assembly Links List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl#getPoseProvider <em>Pose Provider</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.impl.ApogySystemImpl#getPoseProviderInstance <em>Pose Provider Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogySystemImpl extends TypeImpl implements ApogySystem {
	/**
	 * The cached value of the '{@link #getTopologyRoot() <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyRoot()
	 * @generated
	 * @ordered
	 */
	protected TopologyRoot topologyRoot;

	/**
	 * The cached value of the '{@link #getBindingSet() <em>Binding Set</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getBindingSet()
	 * @generated
	 * @ordered
	 */
	protected BindingsSet bindingSet;

	/**
	 * The cached value of the '{@link #getConnectionPointsList()
	 * <em>Connection Points List</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getConnectionPointsList()
	 * @generated
	 * @ordered
	 */
	protected ConnectionPointsList connectionPointsList;

	/**
	 * The cached value of the '{@link #getAssemblyLinksList() <em>Assembly Links List</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getAssemblyLinksList()
	 * @generated
	 * @ordered
	 */
	protected AssemblyLinksList assemblyLinksList;

	/**
	 * The cached value of the '{@link #getPoseProvider() <em>Pose Provider</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPoseProvider()
	 * @generated
	 * @ordered
	 */
  protected AbstractType poseProvider;

  /**
	 * The cached value of the '{@link #getPoseProviderInstance() <em>Pose Provider Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPoseProviderInstance()
	 * @generated
	 * @ordered
	 */
  protected PoseProvider poseProviderInstance;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogySystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCorePackage.Literals.APOGY_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyRoot getTopologyRoot() {
		return topologyRoot;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopologyRoot(TopologyRoot newTopologyRoot,
			NotificationChain msgs) {
		TopologyRoot oldTopologyRoot = topologyRoot;
		topologyRoot = newTopologyRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT, oldTopologyRoot, newTopologyRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyRoot(TopologyRoot newTopologyRoot) {
		if (newTopologyRoot != topologyRoot) {
			NotificationChain msgs = null;
			if (topologyRoot != null)
				msgs = ((InternalEObject)topologyRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT, null, msgs);
			if (newTopologyRoot != null)
				msgs = ((InternalEObject)newTopologyRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT, null, msgs);
			msgs = basicSetTopologyRoot(newTopologyRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT, newTopologyRoot, newTopologyRoot));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BindingsSet getBindingSet() {
		return bindingSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingSet(BindingsSet newBindingSet,
			NotificationChain msgs) {
		BindingsSet oldBindingSet = bindingSet;
		bindingSet = newBindingSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__BINDING_SET, oldBindingSet, newBindingSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingSet(BindingsSet newBindingSet) {
		if (newBindingSet != bindingSet) {
			NotificationChain msgs = null;
			if (bindingSet != null)
				msgs = ((InternalEObject)bindingSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM__BINDING_SET, null, msgs);
			if (newBindingSet != null)
				msgs = ((InternalEObject)newBindingSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM__BINDING_SET, null, msgs);
			msgs = basicSetBindingSet(newBindingSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__BINDING_SET, newBindingSet, newBindingSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionPointsList getConnectionPointsList() {
		return connectionPointsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionPointsList(
			ConnectionPointsList newConnectionPointsList, NotificationChain msgs) {
		ConnectionPointsList oldConnectionPointsList = connectionPointsList;
		connectionPointsList = newConnectionPointsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST, oldConnectionPointsList, newConnectionPointsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionPointsList(
			ConnectionPointsList newConnectionPointsList) {
		if (newConnectionPointsList != connectionPointsList) {
			NotificationChain msgs = null;
			if (connectionPointsList != null)
				msgs = ((InternalEObject)connectionPointsList).eInverseRemove(this, ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM, ConnectionPointsList.class, msgs);
			if (newConnectionPointsList != null)
				msgs = ((InternalEObject)newConnectionPointsList).eInverseAdd(this, ApogyCorePackage.CONNECTION_POINTS_LIST__APOGY_SYSTEM, ConnectionPointsList.class, msgs);
			msgs = basicSetConnectionPointsList(newConnectionPointsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST, newConnectionPointsList, newConnectionPointsList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyLinksList getAssemblyLinksList() {
		return assemblyLinksList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblyLinksList(
			AssemblyLinksList newAssemblyLinksList, NotificationChain msgs) {
		AssemblyLinksList oldAssemblyLinksList = assemblyLinksList;
		assemblyLinksList = newAssemblyLinksList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST, oldAssemblyLinksList, newAssemblyLinksList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyLinksList(AssemblyLinksList newAssemblyLinksList) {
		if (newAssemblyLinksList != assemblyLinksList) {
			NotificationChain msgs = null;
			if (assemblyLinksList != null)
				msgs = ((InternalEObject)assemblyLinksList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST, null, msgs);
			if (newAssemblyLinksList != null)
				msgs = ((InternalEObject)newAssemblyLinksList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST, null, msgs);
			msgs = basicSetAssemblyLinksList(newAssemblyLinksList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST, newAssemblyLinksList, newAssemblyLinksList));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractType getPoseProvider()
  {
		if (poseProvider != null && poseProvider.eIsProxy()) {
			InternalEObject oldPoseProvider = (InternalEObject)poseProvider;
			poseProvider = (AbstractType)eResolveProxy(oldPoseProvider);
			if (poseProvider != oldPoseProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER, oldPoseProvider, poseProvider));
			}
		}
		return poseProvider;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractType basicGetPoseProvider()
  {
		return poseProvider;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPoseProvider(AbstractType newPoseProvider)
  {
		AbstractType oldPoseProvider = poseProvider;
		poseProvider = newPoseProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER, oldPoseProvider, poseProvider));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PoseProvider getPoseProviderInstance()
  {
		if (poseProviderInstance != null && poseProviderInstance.eIsProxy()) {
			InternalEObject oldPoseProviderInstance = (InternalEObject)poseProviderInstance;
			poseProviderInstance = (PoseProvider)eResolveProxy(oldPoseProviderInstance);
			if (poseProviderInstance != oldPoseProviderInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER_INSTANCE, oldPoseProviderInstance, poseProviderInstance));
			}
		}
		return poseProviderInstance;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PoseProvider basicGetPoseProviderInstance()
  {
		return poseProviderInstance;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPoseProviderInstance(PoseProvider newPoseProviderInstance)
  {
		PoseProvider oldPoseProviderInstance = poseProviderInstance;
		poseProviderInstance = newPoseProviderInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER_INSTANCE, oldPoseProviderInstance, poseProviderInstance));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST:
				if (connectionPointsList != null)
					msgs = ((InternalEObject)connectionPointsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST, null, msgs);
				return basicSetConnectionPointsList((ConnectionPointsList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT:
				return basicSetTopologyRoot(null, msgs);
			case ApogyCorePackage.APOGY_SYSTEM__BINDING_SET:
				return basicSetBindingSet(null, msgs);
			case ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST:
				return basicSetConnectionPointsList(null, msgs);
			case ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST:
				return basicSetAssemblyLinksList(null, msgs);
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
			case ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT:
				return getTopologyRoot();
			case ApogyCorePackage.APOGY_SYSTEM__BINDING_SET:
				return getBindingSet();
			case ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST:
				return getConnectionPointsList();
			case ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST:
				return getAssemblyLinksList();
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER:
				if (resolve) return getPoseProvider();
				return basicGetPoseProvider();
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER_INSTANCE:
				if (resolve) return getPoseProviderInstance();
				return basicGetPoseProviderInstance();
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
			case ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT:
				setTopologyRoot((TopologyRoot)newValue);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__BINDING_SET:
				setBindingSet((BindingsSet)newValue);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST:
				setConnectionPointsList((ConnectionPointsList)newValue);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST:
				setAssemblyLinksList((AssemblyLinksList)newValue);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER:
				setPoseProvider((AbstractType)newValue);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER_INSTANCE:
				setPoseProviderInstance((PoseProvider)newValue);
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
			case ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT:
				setTopologyRoot((TopologyRoot)null);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__BINDING_SET:
				setBindingSet((BindingsSet)null);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST:
				setConnectionPointsList((ConnectionPointsList)null);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST:
				setAssemblyLinksList((AssemblyLinksList)null);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER:
				setPoseProvider((AbstractType)null);
				return;
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER_INSTANCE:
				setPoseProviderInstance((PoseProvider)null);
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
			case ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT:
				return topologyRoot != null;
			case ApogyCorePackage.APOGY_SYSTEM__BINDING_SET:
				return bindingSet != null;
			case ApogyCorePackage.APOGY_SYSTEM__CONNECTION_POINTS_LIST:
				return connectionPointsList != null;
			case ApogyCorePackage.APOGY_SYSTEM__ASSEMBLY_LINKS_LIST:
				return assemblyLinksList != null;
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER:
				return poseProvider != null;
			case ApogyCorePackage.APOGY_SYSTEM__POSE_PROVIDER_INSTANCE:
				return poseProviderInstance != null;
		}
		return super.eIsSet(featureID);
	}

} // ApogySystemImpl
