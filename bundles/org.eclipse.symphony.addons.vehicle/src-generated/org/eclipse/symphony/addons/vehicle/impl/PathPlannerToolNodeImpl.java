/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.vehicle.PathPlannerTool;
import org.eclipse.symphony.addons.vehicle.PathPlannerToolNode;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.common.topology.impl.AggregateGroupNodeImpl;

import ca.gc.space.mrt.geometry.paths.PathsFactory;
import ca.gc.space.mrt.geometry.paths.WayPointPath;
import ca.gc.space.mrt.geometry.paths.WayPointPathBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Planner Tool Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.PathPlannerToolNodeImpl#getPathPlannerTool <em>Path Planner Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathPlannerToolNodeImpl extends AggregateGroupNodeImpl implements PathPlannerToolNode 
{
	private Adapter adapter = null;
	private WayPointPath plannedPathOriginal = null;
	private WayPointPath plannedPathLocal = null;
	private WayPointPathBinding binding = null;
	
	/**
	 * The cached value of the '{@link #getPathPlannerTool() <em>Path Planner Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathPlannerTool()
	 * @generated
	 * @ordered
	 */
	protected PathPlannerTool pathPlannerTool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathPlannerToolNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyToolsVehiclePackage.Literals.PATH_PLANNER_TOOL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannerTool getPathPlannerTool() {
		if (pathPlannerTool != null && pathPlannerTool.eIsProxy()) {
			InternalEObject oldPathPlannerTool = (InternalEObject)pathPlannerTool;
			pathPlannerTool = (PathPlannerTool)eResolveProxy(oldPathPlannerTool);
			if (pathPlannerTool != oldPathPlannerTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL, oldPathPlannerTool, pathPlannerTool));
			}
		}
		return pathPlannerTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathPlannerTool basicGetPathPlannerTool() {
		return pathPlannerTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NotificationChain basicSetPathPlannerTool(PathPlannerTool newPathPlannerTool, NotificationChain msgs) 
	{
		internalUpdatePathPlannerTool(pathPlannerTool, newPathPlannerTool);
		return basicSetPathPlannerToolGen(newPathPlannerTool, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathPlannerToolGen(PathPlannerTool newPathPlannerTool, NotificationChain msgs) {
		PathPlannerTool oldPathPlannerTool = pathPlannerTool;
		pathPlannerTool = newPathPlannerTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL, oldPathPlannerTool, newPathPlannerTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPathPlannerTool(PathPlannerTool newPathPlannerTool) 
	{
		internalUpdatePathPlannerTool(pathPlannerTool, newPathPlannerTool);
		setPathPlannerToolGen(newPathPlannerTool);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathPlannerToolGen(PathPlannerTool newPathPlannerTool) {
		if (newPathPlannerTool != pathPlannerTool) {
			NotificationChain msgs = null;
			if (pathPlannerTool != null)
				msgs = ((InternalEObject)pathPlannerTool).eInverseRemove(this, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE, PathPlannerTool.class, msgs);
			if (newPathPlannerTool != null)
				msgs = ((InternalEObject)newPathPlannerTool).eInverseAdd(this, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE, PathPlannerTool.class, msgs);
			msgs = basicSetPathPlannerTool(newPathPlannerTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL, newPathPlannerTool, newPathPlannerTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL:
				if (pathPlannerTool != null)
					msgs = ((InternalEObject)pathPlannerTool).eInverseRemove(this, SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PATH_PLANNER_TOOL_NODE, PathPlannerTool.class, msgs);
				return basicSetPathPlannerTool((PathPlannerTool)otherEnd, msgs);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL:
				return basicSetPathPlannerTool(null, msgs);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL:
				if (resolve) return getPathPlannerTool();
				return basicGetPathPlannerTool();
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL:
				setPathPlannerTool((PathPlannerTool)newValue);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL:
				setPathPlannerTool((PathPlannerTool)null);
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
			case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL_NODE__PATH_PLANNER_TOOL:
				return pathPlannerTool != null;
		}
		return super.eIsSet(featureID);
	}

	private void internalUpdatePathPlannerTool(PathPlannerTool oldPathPlannerTool, PathPlannerTool newPathPlannerTool)
	{
		if(oldPathPlannerTool != null)
		{
			oldPathPlannerTool.eAdapters().remove(getAdapter());
			updateWayPointPath(null);
		}
		
		getChildren().clear();
		
		if(newPathPlannerTool != null)
		{
			newPathPlannerTool.eAdapters().add(getAdapter());
			updateWayPointPath(newPathPlannerTool.getPlannedPath());
		}
	}
	
	protected void updateWayPointPath(WayPointPath newWayPointPath)
	{
		if(plannedPathLocal != null)
		{
			getChildren().remove(plannedPathLocal);
		}
		
		if(binding != null)
		{
			binding.setTargetWayPointPath(null);
			binding.setSourceWayPointPath(null);
		}
		
		plannedPathOriginal = newWayPointPath;
		
		if(newWayPointPath != null)
		{
			plannedPathLocal = PathsFactory.eINSTANCE.createWayPointPath();			
			binding = new WayPointPathBinding(newWayPointPath, plannedPathLocal);
			getChildren().add(plannedPathLocal);
		}
	}
	
	protected Adapter getAdapter() 
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{	
					if(msg.getNotifier() instanceof PathPlannerTool)
					{
						int featureId = msg.getFeatureID(PathPlannerTool.class);
						
						switch (featureId) 
						{
							case SymphonyToolsVehiclePackage.PATH_PLANNER_TOOL__PLANNED_PATH:								
								updateWayPointPath((WayPointPath) msg.getNewValue());
							break;

						default:
							break;
						}
					}
				}
			};
		}
		
		return adapter;
	}
} //PathPlannerToolNodeImpl
