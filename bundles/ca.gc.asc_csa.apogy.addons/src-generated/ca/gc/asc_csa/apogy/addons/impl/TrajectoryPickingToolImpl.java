/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.addons.Activator;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsFactory;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Picking Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.TrajectoryPickingToolImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.TrajectoryPickingToolImpl#getActivePath <em>Active Path</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.TrajectoryPickingToolImpl#getTrajectoryPickingToolNode <em>Trajectory Picking Tool Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoryPickingToolImpl extends Simple3DToolImpl implements TrajectoryPickingTool 
{
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
	 * The cached value of the '{@link #getActivePath() <em>Active Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivePath()
	 * @generated
	 * @ordered
	 */
	protected WayPointPath activePath;

	/**
	 * The cached value of the '{@link #getTrajectoryPickingToolNode() <em>Trajectory Picking Tool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoryPickingToolNode()
	 * @generated
	 * @ordered
	 */
	protected TrajectoryPickingToolNode trajectoryPickingToolNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrajectoryPickingToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.TRAJECTORY_PICKING_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WayPointPath> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList<WayPointPath>(WayPointPath.class, this, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPath getActivePath() {
		if (activePath != null && activePath.eIsProxy()) {
			InternalEObject oldActivePath = (InternalEObject)activePath;
			activePath = (WayPointPath)eResolveProxy(oldActivePath);
			if (activePath != oldActivePath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH, oldActivePath, activePath));
			}
		}
		return activePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPath basicGetActivePath() {
		return activePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivePath(WayPointPath newActivePath) {
		WayPointPath oldActivePath = activePath;
		activePath = newActivePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH, oldActivePath, activePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingToolNode getTrajectoryPickingToolNode() {
		if (trajectoryPickingToolNode != null && trajectoryPickingToolNode.eIsProxy()) {
			InternalEObject oldTrajectoryPickingToolNode = (InternalEObject)trajectoryPickingToolNode;
			trajectoryPickingToolNode = (TrajectoryPickingToolNode)eResolveProxy(oldTrajectoryPickingToolNode);
			if (trajectoryPickingToolNode != oldTrajectoryPickingToolNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE, oldTrajectoryPickingToolNode, trajectoryPickingToolNode));
			}
		}
		return trajectoryPickingToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingToolNode basicGetTrajectoryPickingToolNode() {
		return trajectoryPickingToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrajectoryPickingToolNode(TrajectoryPickingToolNode newTrajectoryPickingToolNode, NotificationChain msgs) {
		TrajectoryPickingToolNode oldTrajectoryPickingToolNode = trajectoryPickingToolNode;
		trajectoryPickingToolNode = newTrajectoryPickingToolNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE, oldTrajectoryPickingToolNode, newTrajectoryPickingToolNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectoryPickingToolNode(TrajectoryPickingToolNode newTrajectoryPickingToolNode) {
		if (newTrajectoryPickingToolNode != trajectoryPickingToolNode) {
			NotificationChain msgs = null;
			if (trajectoryPickingToolNode != null)
				msgs = ((InternalEObject)trajectoryPickingToolNode).eInverseRemove(this, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL, TrajectoryPickingToolNode.class, msgs);
			if (newTrajectoryPickingToolNode != null)
				msgs = ((InternalEObject)newTrajectoryPickingToolNode).eInverseAdd(this, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL, TrajectoryPickingToolNode.class, msgs);
			msgs = basicSetTrajectoryPickingToolNode(newTrajectoryPickingToolNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE, newTrajectoryPickingToolNode, newTrajectoryPickingToolNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void clearActivePath() 
	{
		if(getActivePath() != null)
		{
			getActivePath().getPoints().clear();
			
			Logger.INSTANCE.log(Activator.ID, this, "Active path cleared.", EventSeverity.OK);
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to clear active path : No active path selected!", EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE:
				if (trajectoryPickingToolNode != null)
					msgs = ((InternalEObject)trajectoryPickingToolNode).eInverseRemove(this, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL, TrajectoryPickingToolNode.class, msgs);
				return basicSetTrajectoryPickingToolNode((TrajectoryPickingToolNode)otherEnd, msgs);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE:
				return basicSetTrajectoryPickingToolNode(null, msgs);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS:
				return getPaths();
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH:
				if (resolve) return getActivePath();
				return basicGetActivePath();
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE:
				if (resolve) return getTrajectoryPickingToolNode();
				return basicGetTrajectoryPickingToolNode();
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends WayPointPath>)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH:
				setActivePath((WayPointPath)newValue);
				return;
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE:
				setTrajectoryPickingToolNode((TrajectoryPickingToolNode)newValue);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS:
				getPaths().clear();
				return;
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH:
				setActivePath((WayPointPath)null);
				return;
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE:
				setTrajectoryPickingToolNode((TrajectoryPickingToolNode)null);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS:
				return paths != null && !paths.isEmpty();
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__ACTIVE_PATH:
				return activePath != null;
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE:
				return trajectoryPickingToolNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL___CLEAR_ACTIVE_PATH:
				clearActivePath();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	
	@Override
	public void setVisible(boolean newVisible) 
	{	
		super.setVisible(newVisible);
		
		if(getRootNode() instanceof GroupNode)
		{
			GroupNode parent = (GroupNode) getRootNode();
			
			// If visible, attach the TrajectoryPickingToolNode to the root.
			if(newVisible)
			{
				if(!parent.getChildren().contains(getTrajectoryPickingToolNode()))
				{
					parent.getChildren().add(getTrajectoryPickingToolNode());
				}
			}
			// If not visible, detach the TrajectoryPickingToolNode to the root.
			else
			{
				if(parent.getChildren().contains(getTrajectoryPickingToolNode()))
				{
					parent.getChildren().remove(getTrajectoryPickingToolNode());
				}
			}
		}
		 // Forces the Trajectory3DToolNode to be created.
		getTrajectoryPickingToolNode();		
	}
	
	@Override
	public void setRootNode(Node newRootNode) 
	{			
		super.setRootNode(newRootNode);
					
		TrajectoryPickingToolNode toolNode = getTrajectoryPickingToolNode();
				
		if(toolNode != null)
		{
			if(newRootNode instanceof GroupNode)
			{
				GroupNode parent = (GroupNode) getRootNode();
				if(isVisible())
				{
					parent.getChildren().add(toolNode);
				}
				else
				{
					parent.getChildren().remove(toolNode);
				}
			}				
		}
	}

	@Override
	public void selectionChanged(NodeSelection nodeSelection) 
	{	
		// Add selected point to the current path.
		if(getActivePath() != null)
		{
			Point3d point = nodeSelection.getAbsoluteIntersectionPoint();
			getActivePath().getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point.x, point.y, point.z));
			
			String message = "Point added : (" + point.x + ", " + point.y + ", " + point.z + ")";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.OK);
		}
		else
		{			
			Logger.INSTANCE.log(Activator.ID, this, "Failed to add point : No active path selected!", EventSeverity.ERROR);
		}
	}
	
	@Override
	public void initialise() 
	{
		// First, initialize the TrajectoryPickingToolNode.		
		// TODO Do this in a Transaction friendly way.
		setTrajectoryPickingToolNode(ApogyAddonsFactory.eINSTANCE.createTrajectoryPickingToolNode());	
		
		// Then, initialize the rest.
		super.initialise();
		
				
	}
	
	@Override
	public void dispose() 
	{
		// Remove 3DTool Node.
		if(trajectoryPickingToolNode != null)
		{
			if(trajectoryPickingToolNode.getParent() instanceof GroupNode)
			{
				GroupNode parent =  (GroupNode) trajectoryPickingToolNode.getParent();			
				parent.getChildren().remove(trajectoryPickingToolNode);
			}		
			
			setTrajectoryPickingToolNode(null);
		}
		
		super.dispose();
	}	
	
} //TrajectoryPickingToolImpl
