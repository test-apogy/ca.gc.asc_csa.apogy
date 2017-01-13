package ca.gc.asc_csa.apogy.addons.impl;
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

import java.util.Collection;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.addons.ApogyAddonsFactory;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.Trajectory3DTool;
import ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory3 DTool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.Trajectory3DToolImpl#isPenDown <em>Pen Down</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.Trajectory3DToolImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.Trajectory3DToolImpl#getDistanceThreshold <em>Distance Threshold</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.Trajectory3DToolImpl#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.Trajectory3DToolImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.Trajectory3DToolImpl#getPoseProvider <em>Pose Provider</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.Trajectory3DToolImpl#getTrajectory3DToolNode <em>Trajectory3 DTool Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trajectory3DToolImpl extends Simple3DToolImpl implements Trajectory3DTool 
{
	private VariableAdapter variableAdapter = null;
	private Adapter poseProviderAdapter = null;  
	private Point3d lastPoseAdded = null;
	private WayPointPath currentWayPointPath = null;
	
	/**
	 * The default value of the '{@link #isPenDown() <em>Pen Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenDown()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PEN_DOWN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPenDown() <em>Pen Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPenDown()
	 * @generated
	 * @ordered
	 */
	protected boolean penDown = PEN_DOWN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #getDistanceThreshold() <em>Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_THRESHOLD_EDEFAULT = 0.01;

	/**
	 * The cached value of the '{@link #getDistanceThreshold() <em>Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceThreshold()
	 * @generated
	 * @ordered
	 */
	protected double distanceThreshold = DISTANCE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalDistance() <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_DISTANCE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getTotalDistance() <em>Total Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalDistance()
	 * @generated
	 * @ordered
	 */
	protected double totalDistance = TOTAL_DISTANCE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<WayPointPath> paths;

	/**
	 * The cached value of the '{@link #getPoseProvider() <em>Pose Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseProvider()
	 * @generated
	 * @ordered
	 */
	protected PoseProvider poseProvider;
	/**
	 * The cached value of the '{@link #getTrajectory3DToolNode() <em>Trajectory3 DTool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectory3DToolNode()
	 * @generated
	 * @ordered
	 */
	protected Trajectory3DToolNode trajectory3DToolNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Trajectory3DToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL;
	}
		
	@Override
	public void setRootNode(Node newRootNode) 
	{		
		System.out.println("Trajectory3DToolImpl.setRootNode(" + newRootNode + ")");				
		super.setRootNode(newRootNode);				
		Trajectory3DToolNode toolNode = getTrajectory3DToolNode();
		
		if(toolNode != null)
		{
			if(newRootNode instanceof GroupNode)
			{
				((GroupNode) newRootNode).getChildren().add(toolNode);
			}
			else
			{
				if(toolNode.getParent() instanceof GroupNode)
				{
					((GroupNode) toolNode.getParent()).getChildren().remove(toolNode);
				}
			}
		}				
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPenDown() {
		return penDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPenDown(boolean newPenDown) 
	{
		setPenDownGen(newPenDown);
		
		if(newPenDown)
		{
			penDown();
		}
		else
		{
			penUp();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenDownGen(boolean newPenDown) {
		boolean oldPenDown = penDown;
		penDown = newPenDown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN, oldPenDown, penDown));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (Variable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.TRAJECTORY3_DTOOL__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariable() {
		return variable;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY3_DTOOL__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDistanceThreshold() {
		return distanceThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceThreshold(double newDistanceThreshold) {
		double oldDistanceThreshold = distanceThreshold;
		distanceThreshold = newDistanceThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD, oldDistanceThreshold, distanceThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getTotalDistance() 
	{		
		// Force update if distance is zero.		
		if(totalDistance == 0)
		{
			double newDistance = computeTotalDistance();
						
			// If the distance is not zero.
			if(newDistance != 0)
			{
				// Updates the TotalDistance in a Transaction friendly way.
				ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__TOTAL_DISTANCE, newDistance) ;				
			}
		}
		
		return getTotalDistanceGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalDistanceGen() {
		return totalDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalDistance(double newTotalDistance) {
		double oldTotalDistance = totalDistance;
		totalDistance = newTotalDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE, oldTotalDistance, totalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WayPointPath> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<WayPointPath>(WayPointPath.class, this, ApogyAddonsPackage.TRAJECTORY3_DTOOL__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseProvider getPoseProvider() {
		if (poseProvider != null && poseProvider.eIsProxy()) {
			InternalEObject oldPoseProvider = (InternalEObject)poseProvider;
			poseProvider = (PoseProvider)eResolveProxy(oldPoseProvider);
			if (poseProvider != oldPoseProvider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER, oldPoseProvider, poseProvider));
			}
		}
		return poseProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseProvider basicGetPoseProvider() {
		return poseProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPoseProvider(PoseProvider newPoseProvider) 
	{
		System.out.println("==> Trajectory3DToolImpl.setPoseProvider(" +  newPoseProvider + ")");
		
		if(poseProvider != null)
		{
			// Remove Adapter from previous poseProvider.
			poseProvider.eAdapters().remove(getPoseProviderAdapter());
		}
		
		setPoseProviderGen(newPoseProvider);
		
		// If the new Pose Provider is not null.
		if(newPoseProvider != null)
		{
			// Updates the Pose.
			if(newPoseProvider.getPoseTransform() != null)
			{					 
				updatePose(newPoseProvider.getPoseTransform());
			}
			
			// Register to the new Pose provider.
			newPoseProvider.eAdapters().add(getPoseProviderAdapter());
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseProviderGen(PoseProvider newPoseProvider) {
		PoseProvider oldPoseProvider = poseProvider;
		poseProvider = newPoseProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER, oldPoseProvider, poseProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DToolNode getTrajectory3DToolNode() {
		if (trajectory3DToolNode != null && trajectory3DToolNode.eIsProxy()) {
			InternalEObject oldTrajectory3DToolNode = (InternalEObject)trajectory3DToolNode;
			trajectory3DToolNode = (Trajectory3DToolNode)eResolveProxy(oldTrajectory3DToolNode);
			if (trajectory3DToolNode != oldTrajectory3DToolNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, oldTrajectory3DToolNode, trajectory3DToolNode));
			}
		}
		return trajectory3DToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DToolNode basicGetTrajectory3DToolNode() {
		return trajectory3DToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrajectory3DToolNode(Trajectory3DToolNode newTrajectory3DToolNode, NotificationChain msgs) {
		Trajectory3DToolNode oldTrajectory3DToolNode = trajectory3DToolNode;
		trajectory3DToolNode = newTrajectory3DToolNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, oldTrajectory3DToolNode, newTrajectory3DToolNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectory3DToolNode(Trajectory3DToolNode newTrajectory3DToolNode) {
		if (newTrajectory3DToolNode != trajectory3DToolNode) {
			NotificationChain msgs = null;
			if (trajectory3DToolNode != null)
				msgs = ((InternalEObject)trajectory3DToolNode).eInverseRemove(this, ApogyAddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, Trajectory3DToolNode.class, msgs);
			if (newTrajectory3DToolNode != null)
				msgs = ((InternalEObject)newTrajectory3DToolNode).eInverseAdd(this, ApogyAddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, Trajectory3DToolNode.class, msgs);
			msgs = basicSetTrajectory3DToolNode(newTrajectory3DToolNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, newTrajectory3DToolNode, newTrajectory3DToolNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				if (trajectory3DToolNode != null)
					msgs = ((InternalEObject)trajectory3DToolNode).eInverseRemove(this, ApogyAddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, Trajectory3DToolNode.class, msgs);
				return basicSetTrajectory3DToolNode((Trajectory3DToolNode)otherEnd, msgs);
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
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				return basicSetTrajectory3DToolNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				return isPenDown();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				return getDistanceThreshold();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				return getTotalDistance();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				return getPaths();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				if (resolve) return getPoseProvider();
				return basicGetPoseProvider();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				if (resolve) return getTrajectory3DToolNode();
				return basicGetTrajectory3DToolNode();
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
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				setPenDown((Boolean)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				setDistanceThreshold((Double)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				setTotalDistance((Double)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends WayPointPath>)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				setPoseProvider((PoseProvider)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				setTrajectory3DToolNode((Trajectory3DToolNode)newValue);
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
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				setPenDown(PEN_DOWN_EDEFAULT);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				setVariable((Variable)null);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				setDistanceThreshold(DISTANCE_THRESHOLD_EDEFAULT);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				setTotalDistance(TOTAL_DISTANCE_EDEFAULT);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				getPaths().clear();
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				setPoseProvider((PoseProvider)null);
				return;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				setTrajectory3DToolNode((Trajectory3DToolNode)null);
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
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				return penDown != PEN_DOWN_EDEFAULT;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				return variable != null;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				return distanceThreshold != DISTANCE_THRESHOLD_EDEFAULT;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				return totalDistance != TOTAL_DISTANCE_EDEFAULT;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				return paths != null && !paths.isEmpty();
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				return poseProvider != null;
			case ApogyAddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				return trajectory3DToolNode != null;
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
		result.append(" (penDown: ");
		result.append(penDown);
		result.append(", distanceThreshold: ");
		result.append(distanceThreshold);
		result.append(", totalDistance: ");
		result.append(totalDistance);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public void selectionChanged(NodeSelection nodeSelection) 
	{
		// Nothing to do.	
	}
	
	@Override
	public void initialise() 
	{	
		// First, initialize the Trajectory3DToolNode.		
		ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, ApogyAddonsFactory.eINSTANCE.createTrajectory3DToolNode());
				
		// Then, initialize the rest.
		super.initialise();										
		
		try
		{
			// Attempts to initialize the Pose Provider.
			ApogySystemApiAdapter apogySystemApiAdapter = resolveApogySystemApiAdapter(getVariable());
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__POSE_PROVIDER, apogySystemApiAdapter);
			
			if(apogySystemApiAdapter != null)
			{												  
				// Resets pose.						 
				lastPoseAdded = null;
				currentWayPointPath = null;
				  
				if(apogySystemApiAdapter.getPoseTransform() != null)
				{					 
					updatePose(apogySystemApiAdapter.getPoseTransform());
				}				  				
			}
			  
			 // Updates total distance.
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__TOTAL_DISTANCE, computeTotalDistance());
		 }
		 catch(Throwable t)
		 {			 
		 }	
		
		// Registers to the active session.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getVariableAdapter());	
		getVariableAdapter().setInvocatorSession(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
	
	@Override
	public void dispose() 
	{
		// Unregister listeners.
		if(getPoseProvider() != null)
		{
			setPoseProvider(null);
		}
				
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getVariableAdapter());
		getVariableAdapter().setInvocatorSession(null);
		
		// Remove 3DTool Node.
		if(getTrajectory3DToolNode() != null)
		{
			if(getTrajectory3DToolNode().getParent() instanceof GroupNode)
			{
				GroupNode parent =  (GroupNode) getTrajectory3DToolNode().getParent();			
				parent.getChildren().remove(getTrajectory3DToolNode());
			}			
		}
		
		super.dispose();
	}
	
	private void penUp()
	{
		// Sets the current path to null.
		currentWayPointPath = null;
	}
	
	private void penDown()
	{
		// Adds a new path to the list
		WayPointPath newWayPointPath = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath(); 
		getPaths().add(newWayPointPath);
		currentWayPointPath = newWayPointPath;
	}
	
	private void updatePose(Matrix4x4 newPose)
	{				
		// TODO Transaction friendly !
		
		try
		{						
			Matrix4d m = newPose.asMatrix4d();							
			Vector3d v = new Vector3d();
			m.get(v);			  
			Point3d position = new Point3d(v);
						
			if(lastPoseAdded == null)
			{									
				// Adds the new point.
				addPoint(position);						
			}
			else if(getDistanceThreshold() > 0)
			{
				// Check to see if the distance threshold has been exceeded.
				if(lastPoseAdded.distance(position) >= getDistanceThreshold())
				{
					addPoint(position);
				}
			}
			else
			{
				// Adds the new point.
				addPoint(position);							
			}						 
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	/**
	 * Adds a point to the current path.
	 * @param newPose The new position.
	 */
	private void addPoint(Point3d point)
	{						
		// Adds the point to the current WayPointPath		
		CartesianPositionCoordinates coordinates = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y, point.z);
		ApogyCommonEmfTransactionFacade.INSTANCE.basicAdd(getCurrentWayPointPath(), ApogyCommonGeometryDataPackage.Literals.COORDINATES_SET__POINTS, coordinates);		
		// getCurrentWayPointPath().getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y, point.z));
		
		// Update last pose.
		lastPoseAdded = new Point3d(point);
		
		// Updates total distance.					
		ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__TOTAL_DISTANCE, computeTotalDistance());		
	}
	
	/**
	 * Returns the current WayPointPath into which new point should be added.
	 * @return The WayPointPath.
	 */
	private WayPointPath getCurrentWayPointPath()
	{
		if(currentWayPointPath == null)
		{
			if(getPaths().isEmpty())
			{
				currentWayPointPath = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
				ApogyCommonEmfTransactionFacade.INSTANCE.basicAdd(this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__PATHS, currentWayPointPath);
				
				//getPaths().add(currentWayPointPath);
			}
			else
			{
				currentWayPointPath = getPaths().get(getPaths().size() - 1);
			}
		}
		
		return currentWayPointPath;
	}
	
	private double computeTotalDistance()
	{
		double distance = 0.0;
		
		List<WayPointPath> paths = getPaths();
		for(WayPointPath wayPointPath : paths)
		{
			distance += wayPointPath.getLength();
		}
		
		return distance;
	}
	
	protected ApogySystemApiAdapter resolveApogySystemApiAdapter(Variable variable)
	{		
		ApogySystemApiAdapter apogySystemApiAdapter = null;
		
		if(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null)
		{
			if(variable != null)
			{
				AbstractTypeImplementation abstractTypeImplementation = ApogyCoreInvocatorFacade.INSTANCE.getTypeImplementation(variable);
				if(abstractTypeImplementation != null)
				{			
					if(abstractTypeImplementation.getAdapterInstance() instanceof ApogySystemApiAdapter)
					{
						apogySystemApiAdapter = (ApogySystemApiAdapter) abstractTypeImplementation.getAdapterInstance();
									  						  			
					}
				}
			}
		}
		
		System.out.println("resolveApogySystemApiAdapter (" + variable + ") = " + apogySystemApiAdapter);
		
		return apogySystemApiAdapter;
	}
	
	protected Adapter getPoseProviderAdapter()
	{
	  if(poseProviderAdapter == null)
	  {
		  poseProviderAdapter = new AdapterImpl()
		  {
			  @Override
			  public void notifyChanged(Notification msg) 
			  {
				  //if(isActive())
				  {
					  if(msg.getFeatureID(PoseProvider.class) == ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM)
					  {		
						  if(isPenDown())
						  {
							  if(msg.getNewValue() instanceof Matrix4x4)
							  {
								  Matrix4x4 newPose = (Matrix4x4) msg.getNewValue();	
								  
								  updatePose(newPose);						  						 
							  }
						  }
					  }	
				  }
			  }  
		  };
	  }
	  
	  return poseProviderAdapter;
	}
	
	private VariableAdapter getVariableAdapter()
	{
		if(variableAdapter == null)
		{
			variableAdapter = new VariableAdapter();
		}
		
		return variableAdapter;
	}
		
	private class VariableAdapter extends AdapterImpl
	{
		private InvocatorSession currentInvocatorSession = null;
		private Environment currentEnvironment = null;
		private Context currentContext = null;
					
		public void notifyChanged(Notification msg) 
		{		
			System.out.println("NOTIFICATION : " + msg);
			
			// Monitor changes to the active InvocatorSession.
			if(msg.getNotifier() instanceof ApogyCoreInvocatorFacade)
			{
				int featureId = msg.getFeatureID(ApogyCoreInvocatorFacade.class);
				switch (featureId) 
				{
					case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
					{	
						setInvocatorSession((InvocatorSession) msg.getNewValue());						
					}
					break;

				default:
					break;
				}
			}
			else if(msg.getNotifier() instanceof InvocatorSession)
			{
				int featureId = msg.getFeatureID(InvocatorSession.class);
				switch (featureId) 
				{
					case ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
					{
						setEnvironment((Environment) msg.getNewValue()); 
					}
					break;

				default:
					break;
				}
			}
			else if(msg.getNotifier() instanceof Environment)
			{
				int featureId = msg.getFeatureID(Environment.class);
				switch (featureId) 
				{
					case ApogyCoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT:
					{
						setContext((Context) msg.getNewValue());						
					}
					break;
				}
			}
			else if(msg.getNotifier() instanceof Context)
			{
				int featureId = msg.getFeatureID(Context.class);
				switch (featureId) 
				{
					case ApogyCoreInvocatorPackage.CONTEXT__INSTANCES_CREATION_DATE:					
					{
						// Updates the Pose Provider in a Transaction friendly way.
						ApogySystemApiAdapter apogySystemApiAdapter = resolveApogySystemApiAdapter(getVariable());
						System.out.println("-----------------------------------------> " + apogySystemApiAdapter);
						ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(Trajectory3DToolImpl.this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__POSE_PROVIDER, apogySystemApiAdapter);
					}
					break;
				}
				
			}
		}
		
		public void setInvocatorSession(InvocatorSession newInvocatorSession)
		{
			System.out.println(getName() + "setInvocatorSession " + newInvocatorSession);
			
			if(currentInvocatorSession != null)
			{
				currentInvocatorSession.eAdapters().remove(this);										
			}
			
			currentInvocatorSession = newInvocatorSession;
			
			if(currentInvocatorSession != null)
			{						
				currentInvocatorSession.eAdapters().add(this);
				setEnvironment(currentInvocatorSession.getEnvironment());				
			}
		}
		
		public void setEnvironment(Environment newEnvironment)
		{
			System.out.println(getName() + "setEnvironment " + newEnvironment);
			
			if(currentEnvironment != null)
			{
				currentEnvironment.eAdapters().remove(this);								
			}
			
			setContext(null);
			
			currentEnvironment = newEnvironment;
			
			if(currentEnvironment != null)
			{
				currentEnvironment.eAdapters().add(this);
				setContext(currentEnvironment.getActiveContext());		
			}			
		}
		
		public void setContext(Context newContext)
		{
			System.out.println(getName() + " setContext " + newContext);
			
			if(currentContext != null)
			{
				currentContext.eAdapters().remove(this);
			}
			
			currentContext = newContext;
			
			if(currentContext != null)
			{
				currentContext.eAdapters().add(this);
			}
				
			// Updates the Pose Provider in a Transaction friendly way.
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(Trajectory3DToolImpl.this, ApogyAddonsPackage.Literals.TRAJECTORY3_DTOOL__POSE_PROVIDER, resolveApogySystemApiAdapter(getVariable()));
		}
	}
	
} //Trajectory3DToolImpl
