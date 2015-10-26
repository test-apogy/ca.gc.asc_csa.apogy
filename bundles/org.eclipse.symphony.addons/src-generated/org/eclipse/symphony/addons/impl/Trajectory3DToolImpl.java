/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

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
import org.eclipse.symphony.addons.Symphony__AddonsFactory;
import org.eclipse.symphony.addons.Symphony__AddonsPackage;
import org.eclipse.symphony.addons.Trajectory3DTool;
import org.eclipse.symphony.addons.Trajectory3DToolNode;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFactory;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodeSelection;
import org.eclipse.symphony.core.PoseProvider;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory3 DTool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl#isPenDown <em>Pen Down</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl#getDistanceThreshold <em>Distance Threshold</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl#getTotalDistance <em>Total Distance</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl#getPoseProvider <em>Pose Provider</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolImpl#getTrajectory3DToolNode <em>Trajectory3 DTool Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trajectory3DToolImpl extends Simple3DToolImpl implements Trajectory3DTool 
{
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
		return Symphony__AddonsPackage.Literals.TRAJECTORY3_DTOOL;
	}
		
	@Override
	public void setRootNode(Node newRootNode) 
	{
		if(newRootNode instanceof GroupNode)
		{
			((GroupNode) newRootNode).getChildren().add(getTrajectory3DToolNode());
		}
		else
		{
			if(getTrajectory3DToolNode().getParent() instanceof GroupNode)
			{
				((GroupNode)getTrajectory3DToolNode().getParent()).getChildren().remove(getTrajectory3DToolNode());
			}
		}
		super.setRootNode(newRootNode);
	}
	
	@Override
	public void setActive(boolean newActive) 
	{		
		super.setActive(newActive);
		
		if(newActive)
		{
			initialize();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN, oldPenDown, penDown));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__VARIABLE, oldVariable, variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__VARIABLE, oldVariable, variable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD, oldDistanceThreshold, distanceThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getTotalDistance() 
	{		
		double d = getTotalDistanceGen();
		
		// Force update if distance is zero.
		if(d == 0)
		{
			d = computeTotalDistance();
			setTotalDistance(d);
		}
		
		return d;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE, oldTotalDistance, totalDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WayPointPath> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<WayPointPath>(WayPointPath.class, this, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PATHS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER, oldPoseProvider, poseProvider));
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
		if(poseProvider != null)
		{
			// Remove Adapter from previous poseProvider.
			poseProvider.eAdapters().remove(getPoseProviderAdapter());
		}
		
		setPoseProviderGen(newPoseProvider);
		
		if(newPoseProvider != null)
		{
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER, oldPoseProvider, poseProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Trajectory3DToolNode getTrajectory3DToolNode()
	{
		Trajectory3DToolNode node = getTrajectory3DToolNodeGen();
		
		if(node == null)
		{
			node = Symphony__AddonsFactory.eINSTANCE.createTrajectory3DToolNode();
			setTrajectory3DToolNode(node);
		}
		
		return node;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DToolNode getTrajectory3DToolNodeGen() {
		if (trajectory3DToolNode != null && trajectory3DToolNode.eIsProxy()) {
			InternalEObject oldTrajectory3DToolNode = (InternalEObject)trajectory3DToolNode;
			trajectory3DToolNode = (Trajectory3DToolNode)eResolveProxy(oldTrajectory3DToolNode);
			if (trajectory3DToolNode != oldTrajectory3DToolNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, oldTrajectory3DToolNode, trajectory3DToolNode));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, oldTrajectory3DToolNode, newTrajectory3DToolNode);
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
				msgs = ((InternalEObject)trajectory3DToolNode).eInverseRemove(this, Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, Trajectory3DToolNode.class, msgs);
			if (newTrajectory3DToolNode != null)
				msgs = ((InternalEObject)newTrajectory3DToolNode).eInverseAdd(this, Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, Trajectory3DToolNode.class, msgs);
			msgs = basicSetTrajectory3DToolNode(newTrajectory3DToolNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, newTrajectory3DToolNode, newTrajectory3DToolNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
				if (trajectory3DToolNode != null)
					msgs = ((InternalEObject)trajectory3DToolNode).eInverseRemove(this, Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, Trajectory3DToolNode.class, msgs);
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				return isPenDown();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				return getDistanceThreshold();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				return getTotalDistance();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				return getPaths();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				if (resolve) return getPoseProvider();
				return basicGetPoseProvider();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				setPenDown((Boolean)newValue);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				setDistanceThreshold((Double)newValue);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				setTotalDistance((Double)newValue);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends WayPointPath>)newValue);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				setPoseProvider((PoseProvider)newValue);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				setPenDown(PEN_DOWN_EDEFAULT);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				setVariable((Variable)null);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				setDistanceThreshold(DISTANCE_THRESHOLD_EDEFAULT);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				setTotalDistance(TOTAL_DISTANCE_EDEFAULT);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				getPaths().clear();
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				setPoseProvider((PoseProvider)null);
				return;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PEN_DOWN:
				return penDown != PEN_DOWN_EDEFAULT;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__VARIABLE:
				return variable != null;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__DISTANCE_THRESHOLD:
				return distanceThreshold != DISTANCE_THRESHOLD_EDEFAULT;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TOTAL_DISTANCE:
				return totalDistance != TOTAL_DISTANCE_EDEFAULT;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PATHS:
				return paths != null && !paths.isEmpty();
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__POSE_PROVIDER:
				return poseProvider != null;
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE:
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
	public void dispose() 
	{
		// Unregister listeners.
		if(getPoseProvider() != null)
		{
			setPoseProvider(null);
		}
		
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
	
	private void initialize()
	{
		 // Forces the Trajectory3DToolNode to be created.
		 getTrajectory3DToolNode();
		
		 try
		 {
			  AbstractTypeImplementation abstractTypeImplementation = EMFEcoreInvocatorFacade.INSTANCE.getTypeImplementation(getVariable());			  
			  if(abstractTypeImplementation.getAdapterInstance() instanceof SymphonySystemApiAdapter)
			  {
				  SymphonySystemApiAdapter symphonySystemApiAdapter = (SymphonySystemApiAdapter) abstractTypeImplementation.getAdapterInstance();
				  setPoseProvider(symphonySystemApiAdapter);
				  
				  // Resets pose.						 
				  lastPoseAdded = null;
				  currentWayPointPath = null;
				  
				  if(symphonySystemApiAdapter.getPoseTransform() != null)
				  {					 
					  updatePose(symphonySystemApiAdapter.getPoseTransform());
				  }				  				
			  }
			  
			  // Updates total distance.
			  setTotalDistance(computeTotalDistance());
		  }
		  catch(Throwable t)
		  {			 
		  }	
	}
	
	private void penUp()
	{
		// Sets the current path to null.
		currentWayPointPath = null;
	}
	
	private void penDown()
	{
		// Adds a new path to the list
		WayPointPath newWayPointPath = Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath(); 
		getPaths().add(newWayPointPath);
		currentWayPointPath = newWayPointPath;
	}
	
	private void updatePose(Matrix4x4 newPose)
	{				
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
		getCurrentWayPointPath().getPoints().add(Data3dFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y, point.z));
		
		// Update last pose.
		lastPoseAdded = new Point3d(point);
		
		// Updates total distance.			
		setTotalDistance(computeTotalDistance());
	}
	
	/**
	 * Returns the current WayPointPath into whic new point should be added.
	 * @return The WayPointPath.
	 */
	private WayPointPath getCurrentWayPointPath()
	{
		if(currentWayPointPath == null)
		{
			if(getPaths().isEmpty())
			{
				currentWayPointPath = Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
				getPaths().add(currentWayPointPath);
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
	
	protected Adapter getPoseProviderAdapter()
	{
	  if(poseProviderAdapter == null)
	  {
		  poseProviderAdapter = new AdapterImpl()
		  {
			  @Override
			  public void notifyChanged(Notification msg) 
			  {
				  if(msg.getFeatureID(PoseProvider.class) == SymphonyCorePackage.POSE_PROVIDER__POSE_TRANSFORM)
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
		  };
	  }
	  
	  return poseProviderAdapter;
	}
	
} //Trajectory3DToolImpl
