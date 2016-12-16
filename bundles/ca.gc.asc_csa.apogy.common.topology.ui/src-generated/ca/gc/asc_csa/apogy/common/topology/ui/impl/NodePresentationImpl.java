package ca.gc.asc_csa.apogy.common.topology.ui.impl;
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

import java.lang.ref.WeakReference;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.ShadowMode;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getTopologyPresentationSet <em>Topology Presentation Set</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getColor <em>Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getShadowMode <em>Shadow Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#isUseInBoundingCalculation <em>Use In Bounding Calculation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getCentroid <em>Centroid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getMin <em>Min</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getMax <em>Max</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getXRange <em>XRange</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getYRange <em>YRange</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getZRange <em>ZRange</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl#getSceneObject <em>Scene Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodePresentationImpl extends MinimalEObjectImpl.Container implements NodePresentation 
{
	/**
	 * The cached value of the '{@link #getTopologyPresentationSet() <em>Topology Presentation Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyPresentationSet()
	 * @generated
	 * @ordered
	 */
	protected EList<TopologyPresentationSet> topologyPresentationSet;
	private Adapter adapter;
	private NodePresentationRef ref;
	
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final RGB COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected RGB color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShadowMode() <em>Shadow Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowMode()
	 * @generated
	 * @ordered
	 */
	protected static final ShadowMode SHADOW_MODE_EDEFAULT = ShadowMode.INHERIT;

	/**
	 * The cached value of the '{@link #getShadowMode() <em>Shadow Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowMode()
	 * @generated
	 * @ordered
	 */
	protected ShadowMode shadowMode = SHADOW_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseInBoundingCalculation() <em>Use In Bounding Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInBoundingCalculation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_IN_BOUNDING_CALCULATION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseInBoundingCalculation() <em>Use In Bounding Calculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInBoundingCalculation()
	 * @generated
	 * @ordered
	 */
	protected boolean useInBoundingCalculation = USE_IN_BOUNDING_CALCULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXRange() <em>XRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXRange()
	 * @generated
	 * @ordered
	 */
	protected static final double XRANGE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getYRange() <em>YRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYRange()
	 * @generated
	 * @ordered
	 */
	protected static final double YRANGE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getZRange() <em>ZRange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZRange()
	 * @generated
	 * @ordered
	 */
	protected static final double ZRANGE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getSceneObject() <em>Scene Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneObject()
	 * @generated
	 * @ordered
	 */
	protected static final SceneObject SCENE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSceneObject() <em>Scene Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneObject()
	 * @generated
	 * @ordered
	 */
	protected SceneObject sceneObject = SCENE_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected NodePresentationImpl() 
	{
		super();
		this.eAdapters().add(getAdapter());
		
		// Register a listener to the preference store		
		ref = new NodePresentationRef(this);
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(ref);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyUIPackage.Literals.NODE_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopologyPresentationSet> getTopologyPresentationSet() {
		if (topologyPresentationSet == null) {
			topologyPresentationSet = new EObjectWithInverseResolvingEList.ManyInverse<TopologyPresentationSet>(TopologyPresentationSet.class, this, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET, ApogyCommonTopologyUIPackage.TOPOLOGY_PRESENTATION_SET__NODE_PRESENTATION_LIST);
		}
		return topologyPresentationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (Node)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGB getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(RGB newColor) {
		RGB oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseInBoundingCalculation() {
		return useInBoundingCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseInBoundingCalculation(boolean newUseInBoundingCalculation) {
		boolean oldUseInBoundingCalculation = useInBoundingCalculation;
		useInBoundingCalculation = newUseInBoundingCalculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION, oldUseInBoundingCalculation, useInBoundingCalculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getCentroid() {
		Tuple3d centroid = basicGetCentroid();
		return centroid != null && centroid.eIsProxy() ? (Tuple3d)eResolveProxy((InternalEObject)centroid) : centroid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d basicGetCentroid() 
	{
		Tuple3d tuple = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
		tuple.setX(0.0);
		tuple.setY(0.0);
		tuple.setZ(0.0);

		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getMin() {
		Tuple3d min = basicGetMin();
		return min != null && min.eIsProxy() ? (Tuple3d)eResolveProxy((InternalEObject)min) : min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d basicGetMin() 
	{
		Tuple3d tuple = null;

		if (getSceneObject() != null && getSceneObject().getMin() != null) {
			tuple = ApogyCommonMathFactory.eINSTANCE.createTuple3d();

			javax.vecmath.Tuple3d min = getSceneObject().getMin();

			tuple.setX(min.x);
			tuple.setY(min.y);
			tuple.setZ(min.z);
		}

		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getMax() {
		Tuple3d max = basicGetMax();
		return max != null && max.eIsProxy() ? (Tuple3d)eResolveProxy((InternalEObject)max) : max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d basicGetMax() 
	{
		Tuple3d tuple = null;

		if (getSceneObject() != null && getSceneObject().getMax() != null) {
			tuple = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
			javax.vecmath.Tuple3d max = getSceneObject().getMax();

			tuple.setX(max.x);
			tuple.setY(max.y);
			tuple.setZ(max.z);
		}

		return tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getXRange() 
	{
		double range = 0.0;
		if (getMin() != null && getMax() != null) {
			range = Math.abs(getMin().getX() - getMax().getX());
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getYRange() 
	{
		double range = 0.0;
		if (getMin() != null && getMax() != null) {
			range = Math.abs(getMin().getY() - getMax().getY());
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getZRange() 
	{
		double range = 0.0;
		if (getMin() != null && getMax() != null) {
			range = Math.abs(getMin().getZ() - getMax().getZ());
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneObject getSceneObject() {
		return sceneObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setSceneObject(SceneObject newSceneObject)
	{
		
		//why are two NodePresentation created for each node ?
		
		
		boolean updateRequired = (newSceneObject != sceneObject);
		
		setSceneObjectGen(newSceneObject);
		
		// Initialize the scene object just set if required.
		if(updateRequired)
		{
			initialSceneObject();
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneObjectGen(SceneObject newSceneObject) {
		SceneObject oldSceneObject = sceneObject;
		sceneObject = newSceneObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT, oldSceneObject, sceneObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTopologyPresentationSet()).basicAdd(otherEnd, msgs);
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
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET:
				return ((InternalEList<?>)getTopologyPresentationSet()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShadowMode getShadowMode() {
		return shadowMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShadowMode(ShadowMode newShadowMode) {
		ShadowMode oldShadowMode = shadowMode;
		shadowMode = newShadowMode == null ? SHADOW_MODE_EDEFAULT : newShadowMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE, oldShadowMode, shadowMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET:
				return getTopologyPresentationSet();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR:
				return getColor();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE:
				return isVisible();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE:
				return getShadowMode();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION:
				return isUseInBoundingCalculation();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID:
				if (resolve) return getCentroid();
				return basicGetCentroid();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN:
				if (resolve) return getMin();
				return basicGetMin();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX:
				if (resolve) return getMax();
				return basicGetMax();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE:
				return getXRange();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE:
				return getYRange();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE:
				return getZRange();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT:
				return getSceneObject();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET:
				getTopologyPresentationSet().clear();
				getTopologyPresentationSet().addAll((Collection<? extends TopologyPresentationSet>)newValue);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE:
				setNode((Node)newValue);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR:
				setColor((RGB)newValue);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE:
				setShadowMode((ShadowMode)newValue);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION:
				setUseInBoundingCalculation((Boolean)newValue);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT:
				setSceneObject((SceneObject)newValue);
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
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET:
				getTopologyPresentationSet().clear();
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE:
				setNode((Node)null);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE:
				setShadowMode(SHADOW_MODE_EDEFAULT);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION:
				setUseInBoundingCalculation(USE_IN_BOUNDING_CALCULATION_EDEFAULT);
				return;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT:
				setSceneObject(SCENE_OBJECT_EDEFAULT);
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
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__TOPOLOGY_PRESENTATION_SET:
				return topologyPresentationSet != null && !topologyPresentationSet.isEmpty();
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__NODE:
				return node != null;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE:
				return shadowMode != SHADOW_MODE_EDEFAULT;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__USE_IN_BOUNDING_CALCULATION:
				return useInBoundingCalculation != USE_IN_BOUNDING_CALCULATION_EDEFAULT;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__CENTROID:
				return basicGetCentroid() != null;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MIN:
				return basicGetMin() != null;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__MAX:
				return basicGetMax() != null;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__XRANGE:
				return getXRange() != XRANGE_EDEFAULT;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__YRANGE:
				return getYRange() != YRANGE_EDEFAULT;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__ZRANGE:
				return getZRange() != ZRANGE_EDEFAULT;
			case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SCENE_OBJECT:
				return SCENE_OBJECT_EDEFAULT == null ? sceneObject != null : !SCENE_OBJECT_EDEFAULT.equals(sceneObject);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", visible: ");
		result.append(visible);
		result.append(", shadowMode: ");
		result.append(shadowMode);
		result.append(", useInBoundingCalculation: ");
		result.append(useInBoundingCalculation);
		result.append(", sceneObject: ");
		result.append(sceneObject);
		result.append(')');
		return result.toString();
	}

	protected void initialSceneObject() 
	{
		// Applies the current values of the preferences.
		applyPreferences();
		
		sceneObject.setVisible(isVisible());
		sceneObject.setColor(getColor());
	}
	
	protected void applyPreferences() 
	{
	}
		
	protected void updateSceneObject(Notification notification) 
	{
		if(notification.getNotifier() instanceof NodePresentation)
		{
			int featureId = notification.getFeatureID(NodePresentation.class);
			
			switch (featureId) 
			{
				case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__COLOR:
					sceneObject.setColor(getColor());
				break;
				
				case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__VISIBLE:
					sceneObject.setVisible(isVisible());
				break;
				
				case ApogyCommonTopologyUIPackage.NODE_PRESENTATION__SHADOW_MODE:
					sceneObject.setShadowMode(getShadowMode());
				break;
				
			default:
				break;
			}
		}		
	}
	
	private Adapter getAdapter() 
	{
		if (adapter == null) 
		{
			adapter = new AdapterImpl() 
			{				
				@Override
				public void notifyChanged(Notification notification) 
				{
					if (sceneObject != null) 
					{
						updateSceneObject(notification);
					}
				}
			};
		}
		return adapter;
	}
	
	/**
	 * This class has been created to solve a memory leak problem.
	 * 
	 * @author sgemme
	 * 
	 */
	private class NodePresentationRef extends WeakReference<NodePresentationImpl> implements IPropertyChangeListener 
	{

		public NodePresentationRef(NodePresentationImpl nodePresentation) 
		{
			super(nodePresentation);
		}

		@Override
		public void propertyChange(PropertyChangeEvent event) 
		{
			if (get() != null) 
			{
				get().applyPreferences();
			} 
			else 
			{
				Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
			}
		}
	}
	
} //NodePresentationImpl
