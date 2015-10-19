/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.addons.Activator;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.impl.AbstractTwoPoints3DToolImpl;
import org.eclipse.symphony.addons.mobility.pathplanners.MeshWayPointPathPlanner;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner;
import org.eclipse.symphony.addons.vehicle.PathPlannerTool;
import org.eclipse.symphony.addons.vehicle.PathPlannerToolNode;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehicleFactory;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.NodeSelection;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Planner Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.PathPlannerToolImpl#isBusy <em>Busy</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.PathPlannerToolImpl#isAutoPathPlanEnabled <em>Auto Path Plan Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.PathPlannerToolImpl#getMeshLayer <em>Mesh Layer</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.PathPlannerToolImpl#getPathPlanner <em>Path Planner</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.PathPlannerToolImpl#getPlannedPath <em>Planned Path</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.PathPlannerToolImpl#getPathPlannerToolNode <em>Path Planner Tool Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathPlannerToolImpl extends AbstractTwoPoints3DToolImpl implements PathPlannerTool 
{
	/**
	 * The default value of the '{@link #isBusy() <em>Busy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBusy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BUSY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isBusy() <em>Busy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBusy()
	 * @generated
	 * @ordered
	 */
	protected boolean busy = BUSY_EDEFAULT;
	/**
	 * The default value of the '{@link #isAutoPathPlanEnabled() <em>Auto Path Plan Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoPathPlanEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_PATH_PLAN_ENABLED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isAutoPathPlanEnabled() <em>Auto Path Plan Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoPathPlanEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean autoPathPlanEnabled = AUTO_PATH_PLAN_ENABLED_EDEFAULT;
	public static int FROM_NODE_INDEX = 0;
	public static int TO_NODE_INDEX = 1;
	private int nextNode = FROM_NODE_INDEX;	
	
	/**
	 * The cached value of the '{@link #getMeshLayer() <em>Mesh Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeshLayer()
	 * @generated
	 * @ordered
	 */
	protected CartesianTriangularMeshMapLayer meshLayer;

	/**
	 * The cached value of the '{@link #getPathPlanner() <em>Path Planner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPlanner()
	 * @generated
	 * @ordered
	 */
	protected MeshWayPointPathPlanner pathPlanner;

	/**
	 * The cached value of the '{@link #getPlannedPath() <em>Planned Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedPath()
	 * @generated
	 * @ordered
	 */
	protected WayPointPath plannedPath;

	/**
	 * The cached value of the '{@link #getPathPlannerToolNode() <em>Path Planner Tool Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPlannerToolNode()
	 * @generated
	 * @ordered
	 */
	protected PathPlannerToolNode pathPlannerToolNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPlannerToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsVehiclePackage.Literals.PATH_PLANNER_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBusy() {
		return busy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusy(boolean newBusy) {
		boolean oldBusy = busy;
		busy = newBusy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__BUSY, oldBusy, busy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoPathPlanEnabled() {
		return autoPathPlanEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoPathPlanEnabled(boolean newAutoPathPlanEnabled) {
		boolean oldAutoPathPlanEnabled = autoPathPlanEnabled;
		autoPathPlanEnabled = newAutoPathPlanEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED, oldAutoPathPlanEnabled, autoPathPlanEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayer getMeshLayer() {
		if (meshLayer != null && meshLayer.eIsProxy()) {
			InternalEObject oldMeshLayer = (InternalEObject)meshLayer;
			meshLayer = (CartesianTriangularMeshMapLayer)eResolveProxy(oldMeshLayer);
			if (meshLayer != oldMeshLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__MESH_LAYER, oldMeshLayer, meshLayer));
			}
		}
		return meshLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayer basicGetMeshLayer() {
		return meshLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public void setMeshLayer(CartesianTriangularMeshMapLayer newMeshLayer) 
	{
		setMeshLayerGen(newMeshLayer);
		
		if(getPathPlanner() != null && newMeshLayer != null)
		{			
			getPathPlanner().setMesh(newMeshLayer.getCurrentMesh());	
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeshLayerGen(CartesianTriangularMeshMapLayer newMeshLayer) {
		CartesianTriangularMeshMapLayer oldMeshLayer = meshLayer;
		meshLayer = newMeshLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__MESH_LAYER, oldMeshLayer, meshLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("rawtypes")
	public MeshWayPointPathPlanner getPathPlanner() 
	{		
		if(pathPlanner == null)
		{
			SimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner<CartesianPolygon> tmp = PathplannersGraphFactory.eINSTANCE.createSimpleDirectedWeightedGraphBasedMeshWayPointPathPlanner();
			DistanceAndSlopesCostFunction das = PathplannersGraphFactory.eINSTANCE.createDistanceAndSlopesCostFunction();			
			das.setGravityAxis(CartesianAxis.Z);
			tmp.getCostFunctions().add(das);						
			tmp.setEnablePathSimplification(false);
			
			setPathPlanner(tmp);
		}
		return pathPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathPlanner(MeshWayPointPathPlanner newPathPlanner, NotificationChain msgs) {
		MeshWayPointPathPlanner oldPathPlanner = pathPlanner;
		pathPlanner = newPathPlanner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER, oldPathPlanner, newPathPlanner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPlanner(MeshWayPointPathPlanner newPathPlanner) {
		if (newPathPlanner != pathPlanner) {
			NotificationChain msgs = null;
			if (pathPlanner != null)
				msgs = ((InternalEObject)pathPlanner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER, null, msgs);
			if (newPathPlanner != null)
				msgs = ((InternalEObject)newPathPlanner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER, null, msgs);
			msgs = basicSetPathPlanner(newPathPlanner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER, newPathPlanner, newPathPlanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WayPointPath getPlannedPath() {
		return plannedPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlannedPath(WayPointPath newPlannedPath, NotificationChain msgs) {
		WayPointPath oldPlannedPath = plannedPath;
		plannedPath = newPlannedPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH, oldPlannedPath, newPlannedPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlannedPath(WayPointPath newPlannedPath) {
		if (newPlannedPath != plannedPath) {
			NotificationChain msgs = null;
			if (plannedPath != null)
				msgs = ((InternalEObject)plannedPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH, null, msgs);
			if (newPlannedPath != null)
				msgs = ((InternalEObject)newPlannedPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH, null, msgs);
			msgs = basicSetPlannedPath(newPlannedPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH, newPlannedPath, newPlannedPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public PathPlannerToolNode getPathPlannerToolNode() 
	{
		PathPlannerToolNode node = getPathPlannerToolNodeGen();
		
		if(node == null)
		{
			node = SymphonyToolsVehicleFactory.eINSTANCE.createPathPlannerToolNode();
			setPathPlannerToolNode(node);
		}
		
		return node;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannerToolNode getPathPlannerToolNodeGen() {
		if (pathPlannerToolNode != null && pathPlannerToolNode.eIsProxy()) {
			InternalEObject oldPathPlannerToolNode = (InternalEObject)pathPlannerToolNode;
			pathPlannerToolNode = (PathPlannerToolNode)eResolveProxy(oldPathPlannerToolNode);
			if (pathPlannerToolNode != oldPathPlannerToolNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE, oldPathPlannerToolNode, pathPlannerToolNode));
			}
		}
		return pathPlannerToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannerToolNode basicGetPathPlannerToolNode() {
		return pathPlannerToolNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathPlannerToolNode(PathPlannerToolNode newPathPlannerToolNode, NotificationChain msgs) {
		PathPlannerToolNode oldPathPlannerToolNode = pathPlannerToolNode;
		pathPlannerToolNode = newPathPlannerToolNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE, oldPathPlannerToolNode, newPathPlannerToolNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPlannerToolNode(PathPlannerToolNode newPathPlannerToolNode) {
		if (newPathPlannerToolNode != pathPlannerToolNode) {
			NotificationChain msgs = null;
			if (pathPlannerToolNode != null)
				msgs = ((InternalEObject)pathPlannerToolNode).eInverseRemove(this, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL, PathPlannerToolNode.class, msgs);
			if (newPathPlannerToolNode != null)
				msgs = ((InternalEObject)newPathPlannerToolNode).eInverseAdd(this, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL, PathPlannerToolNode.class, msgs);
			msgs = basicSetPathPlannerToolNode(newPathPlannerToolNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE, newPathPlannerToolNode, newPathPlannerToolNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE:
				if (pathPlannerToolNode != null)
					msgs = ((InternalEObject)pathPlannerToolNode).eInverseRemove(this, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL, PathPlannerToolNode.class, msgs);
				return basicSetPathPlannerToolNode((PathPlannerToolNode)otherEnd, msgs);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER:
				return basicSetPathPlanner(null, msgs);
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH:
				return basicSetPlannedPath(null, msgs);
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE:
				return basicSetPathPlannerToolNode(null, msgs);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__BUSY:
				return isBusy();
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED:
				return isAutoPathPlanEnabled();
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__MESH_LAYER:
				if (resolve) return getMeshLayer();
				return basicGetMeshLayer();
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER:
				return getPathPlanner();
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH:
				return getPlannedPath();
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE:
				if (resolve) return getPathPlannerToolNode();
				return basicGetPathPlannerToolNode();
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__BUSY:
				setBusy((Boolean)newValue);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED:
				setAutoPathPlanEnabled((Boolean)newValue);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__MESH_LAYER:
				setMeshLayer((CartesianTriangularMeshMapLayer)newValue);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER:
				setPathPlanner((MeshWayPointPathPlanner)newValue);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH:
				setPlannedPath((WayPointPath)newValue);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE:
				setPathPlannerToolNode((PathPlannerToolNode)newValue);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__BUSY:
				setBusy(BUSY_EDEFAULT);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED:
				setAutoPathPlanEnabled(AUTO_PATH_PLAN_ENABLED_EDEFAULT);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__MESH_LAYER:
				setMeshLayer((CartesianTriangularMeshMapLayer)null);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER:
				setPathPlanner((MeshWayPointPathPlanner)null);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH:
				setPlannedPath((WayPointPath)null);
				return;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE:
				setPathPlannerToolNode((PathPlannerToolNode)null);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__BUSY:
				return busy != BUSY_EDEFAULT;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__AUTO_PATH_PLAN_ENABLED:
				return autoPathPlanEnabled != AUTO_PATH_PLAN_ENABLED_EDEFAULT;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__MESH_LAYER:
				return meshLayer != null;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER:
				return pathPlanner != null;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH:
				return plannedPath != null;
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE:
				return pathPlannerToolNode != null;
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL___PLAN_PATH:
				return planPath();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (busy: ");
		result.append(busy);
		result.append(", autoPathPlanEnabled: ");
		result.append(autoPathPlanEnabled);
		result.append(')');
		return result.toString();
	}

	@Override
	public void setRootNode(Node newRootNode) 
	{
		if(newRootNode instanceof GroupNode)
		{
			((GroupNode) newRootNode).getChildren().add(getPathPlannerToolNode());
		}
		else
		{
			if(getPathPlannerToolNode().getParent() instanceof GroupNode)
			{
				((GroupNode)getPathPlannerToolNode().getParent()).getChildren().remove(getPathPlannerToolNode());
			}
		}
		
		super.setRootNode(newRootNode);
	}
	
	@Override
	public void selectionChanged(NodeSelection nodeSelection) 
	{	
		if(!isDisposed())
		{
			Node node = nodeSelection.getSelectedNode();
			
			Tuple3d relativePosition = null;
			if(nodeSelection.getRelativeIntersectionPoint() != null)
			{
				relativePosition = MathFacade.INSTANCE.createTuple3d(nodeSelection.getRelativeIntersectionPoint());
			}
			
			Tuple3d normal = null;
			if(nodeSelection.getAbsoluteIntersectionNormal() != null)
			{				
				normal = MathFacade.INSTANCE.createTuple3d(nodeSelection.getAbsoluteIntersectionNormal().x, nodeSelection.getAbsoluteIntersectionNormal().y, nodeSelection.getAbsoluteIntersectionNormal().z);
			}
				
			if(nextNode == TO_NODE_INDEX)
			{
				if(!isFromNodeLock())
				{
					updateFromNode(node, relativePosition, normal);
				}	
				else if(!isToNodeLock())
				{
					updateToNode(node, relativePosition, normal);
				}
				
				nextNode = FROM_NODE_INDEX;
			}
			else if(nextNode == FROM_NODE_INDEX)
			{
				if(!isToNodeLock())
				{
					updateToNode(node, relativePosition, normal);
				}
				else if(!isFromNodeLock())
				{
					updateFromNode(node, relativePosition, normal);
				}
				
				nextNode = TO_NODE_INDEX;
			}							
		}
		
	}
	
	@Override
	public void pointsRelativePoseChanged(Matrix4d newPose) 
	{
		if(getPathPlanner() != null)
		{
			setPlannedPath(null);
			
			planPathInternal();	
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean planPath() 
	{	
		boolean success = false;
		setBusy(true);
		try
		{						
			if(getPathPlanner() != null && getMeshLayer() != null)
			{
				CartesianPositionCoordinates from = getFromCartesianPositionCoordinates();
				CartesianPositionCoordinates to = getToCartesianPositionCoordinates();
				
				// If both current location and destination are defined.
				if(from != null && to != null)
				{
					String message = "Planning path from " + from.asPoint3d() + " to " + to.asPoint3d() + "...";
					Logger.INSTANCE.log(Activator.ID, PathPlannerToolImpl.this, message, EventSeverity.INFO);
					
					// Sets the mesh if not already done
					if(getPathPlanner().getMesh() != getMeshLayer().getCurrentMesh())
					{
						getPathPlanner().setMesh(getMeshLayer().getCurrentMesh());
					}
					
					// Plans a new path.
					WayPointPath newPath = getPathPlanner().plan(from, to);
					setPlannedPath(newPath);
					if(newPath != null)
					{
						success = true;
						Logger.INSTANCE.log(Activator.ID, PathPlannerToolImpl.this, "Path planning sucessfully completed.", EventSeverity.OK);
					}
					else
					{
						Logger.INSTANCE.log(Activator.ID, PathPlannerToolImpl.this, "Path planning failed to find path!", EventSeverity.ERROR);
					}
				}
				else
				{
					String message = "Failed to plan path : "; 
					if(from == null) message += "Current location is undefined.";
					if(to == null) message += " Destination is undefined.";
					
					Logger.INSTANCE.log(Activator.ID, PathPlannerToolImpl.this, message, EventSeverity.ERROR);
					setPlannedPath(null);
				}
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		setBusy(false);
		return success;
	}
	
	protected void updateFromNode(Node node, Tuple3d relativePosition,Tuple3d normal)
	{
		setFromNode(node);
		if(relativePosition != null)
		{
			setFromRelativePosition(EcoreUtil.copy(relativePosition));
			if(isAutoPathPlanEnabled() && getPathPlanner() != null)
			{
				planPathInternal();
			}
		}					
	}
	
	protected void updateToNode(Node node, Tuple3d relativePosition,Tuple3d normal)
	{
		setToNode(node);
		if(relativePosition != null)
		{
			setToRelativePosition(EcoreUtil.copy(relativePosition));
			
			if(isAutoPathPlanEnabled() && getPathPlanner() != null)
			{
				planPathInternal();
			}
		}		
	}
		
	private void planPathInternal()
	{
		if(!isBusy())
		{
			Job job = new Job("Planning Path")
			{
				@Override
				protected IStatus run(final IProgressMonitor monitor) 
				{					
					try
					{
						getPathPlanner().setProgressMonitor(monitor);												
						
						planPath() ;
					}
					catch(Throwable t)
					{
						t.printStackTrace();
					}
					
					return Status.OK_STATUS;
				}
			};
			job.schedule();
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "Path Planner is busy !", EventSeverity.ERROR);
		}
	}
	
	private CartesianPositionCoordinates getFromCartesianPositionCoordinates()
	{
		CartesianPositionCoordinates from = null;
		if(getFromAbsolutePosition() != null && getMeshLayer() != null)
		{
			// Express to in the mesh coordinate system.
			Matrix4d meshToWorld = getMeshLayer().getMap().getTransformation().asMatrix4d();
			Vector3d fromVector = new Vector3d(getFromAbsolutePosition().asTuple3d());
			meshToWorld.transform(fromVector);
			
			from = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(fromVector.x, fromVector.y, fromVector.z);
		}
		
		return from;
	}
	
	private CartesianPositionCoordinates getToCartesianPositionCoordinates()
	{
		CartesianPositionCoordinates to = null;
		if(getToAbsolutePosition() != null && getMeshLayer() != null)
		{
			// Express to in the mesh coordinate system.
			Matrix4d meshToWorld = getMeshLayer().getMap().getTransformation().asMatrix4d();
			Vector3d toVector = new Vector3d(getToAbsolutePosition().asTuple3d());
			meshToWorld.transform(toVector);
			
			to = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(toVector.x, toVector.y, toVector.z);
		}
		
		return to;
	}
	
} //PathPlannerToolImpl
