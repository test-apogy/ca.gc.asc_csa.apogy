/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPathBinding;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Picking Tool Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.TrajectoryPickingToolNodeImpl#getTrajectoryPickingTool <em>Trajectory Picking Tool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrajectoryPickingToolNodeImpl extends AggregateGroupNodeImpl implements TrajectoryPickingToolNode 
{
	private Adapter adapter = null;
	private Map<WayPointPath, WayPointPath> sourceToTargetWayPointPath = new HashMap<WayPointPath, WayPointPath>();
	private Map<WayPointPath, WayPointPathBinding> targetWayPointPathToBinding = new HashMap<WayPointPath, WayPointPathBinding>();
	
	/**
	 * The cached value of the '{@link #getTrajectoryPickingTool() <em>Trajectory Picking Tool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoryPickingTool()
	 * @generated
	 * @ordered
	 */
	protected TrajectoryPickingTool trajectoryPickingTool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrajectoryPickingToolNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.TRAJECTORY_PICKING_TOOL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingTool getTrajectoryPickingTool() {
		if (trajectoryPickingTool != null && trajectoryPickingTool.eIsProxy()) {
			InternalEObject oldTrajectoryPickingTool = (InternalEObject)trajectoryPickingTool;
			trajectoryPickingTool = (TrajectoryPickingTool)eResolveProxy(oldTrajectoryPickingTool);
			if (trajectoryPickingTool != oldTrajectoryPickingTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL, oldTrajectoryPickingTool, trajectoryPickingTool));
			}
		}
		return trajectoryPickingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingTool basicGetTrajectoryPickingTool() {
		return trajectoryPickingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NotificationChain basicSetTrajectoryPickingTool(TrajectoryPickingTool newTrajectoryPickingTool, NotificationChain msgs) 
	{
		internalUpdateTrajectoryPickingTool(trajectoryPickingTool, newTrajectoryPickingTool);
		return basicSetTrajectoryPickingToolGen(newTrajectoryPickingTool, msgs);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrajectoryPickingToolGen(TrajectoryPickingTool newTrajectoryPickingTool, NotificationChain msgs) {
		TrajectoryPickingTool oldTrajectoryPickingTool = trajectoryPickingTool;
		trajectoryPickingTool = newTrajectoryPickingTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL, oldTrajectoryPickingTool, newTrajectoryPickingTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectoryPickingTool(TrajectoryPickingTool newTrajectoryPickingTool) {
		if (newTrajectoryPickingTool != trajectoryPickingTool) {
			NotificationChain msgs = null;
			if (trajectoryPickingTool != null)
				msgs = ((InternalEObject)trajectoryPickingTool).eInverseRemove(this, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE, TrajectoryPickingTool.class, msgs);
			if (newTrajectoryPickingTool != null)
				msgs = ((InternalEObject)newTrajectoryPickingTool).eInverseAdd(this, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE, TrajectoryPickingTool.class, msgs);
			msgs = basicSetTrajectoryPickingTool(newTrajectoryPickingTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL, newTrajectoryPickingTool, newTrajectoryPickingTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL:
				if (trajectoryPickingTool != null)
					msgs = ((InternalEObject)trajectoryPickingTool).eInverseRemove(this, ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__TRAJECTORY_PICKING_TOOL_NODE, TrajectoryPickingTool.class, msgs);
				return basicSetTrajectoryPickingTool((TrajectoryPickingTool)otherEnd, msgs);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL:
				return basicSetTrajectoryPickingTool(null, msgs);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL:
				if (resolve) return getTrajectoryPickingTool();
				return basicGetTrajectoryPickingTool();
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL:
				setTrajectoryPickingTool((TrajectoryPickingTool)newValue);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL:
				setTrajectoryPickingTool((TrajectoryPickingTool)null);
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
			case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL_NODE__TRAJECTORY_PICKING_TOOL:
				return trajectoryPickingTool != null;
		}
		return super.eIsSet(featureID);
	}

	private void internalUpdateTrajectoryPickingTool(TrajectoryPickingTool oldTrajectory3DTool, TrajectoryPickingTool newTrajectory3DTool)
	{
		if(oldTrajectory3DTool != null)
		{
			oldTrajectory3DTool.eAdapters().remove(getAdapter());
			
			// Removes all previous WayPointPaths
			for(WayPointPath wayPointPath : oldTrajectory3DTool.getPaths())
			{
				removeWayPointPath(wayPointPath);
			}
		}
		
		getChildren().clear();
				
		if(newTrajectory3DTool != null)
		{
			// Adds the WayPointPaths
			for(WayPointPath wayPointPath : newTrajectory3DTool.getPaths())
			{
				addWayPointPath(wayPointPath);
			}
			
			newTrajectory3DTool.eAdapters().add(getAdapter());
		}
	}
	
	private void addWayPointPath(WayPointPath wayPointPath)
	{		
		WayPointPath targetWayPointPath = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		getChildren().add(targetWayPointPath);
		sourceToTargetWayPointPath.put(wayPointPath, targetWayPointPath);
		
		WayPointPathBinding binding = new WayPointPathBinding(wayPointPath, targetWayPointPath);
		targetWayPointPathToBinding.put(targetWayPointPath, binding);
		
	}
	
	private void removeWayPointPath(WayPointPath wayPointPath)
	{
		WayPointPath targetWayPointPath = sourceToTargetWayPointPath.get(wayPointPath);
		if(targetWayPointPath != null)
		{
			getChildren().remove(targetWayPointPath);
			sourceToTargetWayPointPath.remove(wayPointPath);
			
			// Remove binding.
			WayPointPathBinding binding = targetWayPointPathToBinding.get(targetWayPointPath);
			if(binding != null)
			{
				binding.setTargetWayPointPath(null);
				binding.setSourceWayPointPath(null);
				targetWayPointPathToBinding.remove(targetWayPointPath);				
			}			
		}		
	}
	
	private Adapter getAdapter() 
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{	
					if(msg.getNotifier() instanceof TrajectoryPickingTool)
					{
						int featureId = msg.getFeatureID(TrajectoryPickingTool.class);
						
						switch(featureId)
						{														
							case ApogyAddonsPackage.TRAJECTORY_PICKING_TOOL__PATHS:
								switch(msg.getEventType())
								{																
									case Notification.ADD:
										WayPointPath addedPath = (WayPointPath) msg.getNewValue();	
										addWayPointPath(addedPath);
									break;
									case Notification.REMOVE:
										WayPointPath removedPath = (WayPointPath) msg.getOldValue();
										removeWayPointPath(removedPath);
									break;
									
									// TODO Add Many + Remove Many
								}
							break;
						}
					}
				}
			};
		}
		
		return adapter;
	}

} //TrajectoryPickingToolNodeImpl
