/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.Symphony__AddonsPackage;
import org.eclipse.symphony.addons.Trajectory3DTool;
import org.eclipse.symphony.addons.Trajectory3DToolNode;
import org.eclipse.symphony.addons.geometry.paths.Symphony__AddonsGeometryPathsFactory;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.geometry.paths.WayPointPathBinding;
import org.eclipse.symphony.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory3 DTool Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.impl.Trajectory3DToolNodeImpl#getTrajectory3DTool <em>Trajectory3 DTool</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trajectory3DToolNodeImpl extends AggregateGroupNodeImpl implements Trajectory3DToolNode 
{
	private Adapter adapter = null;
	
	private Map<WayPointPath, WayPointPath> sourceToTargetWayPointPath = new HashMap<WayPointPath, WayPointPath>();
	private Map<WayPointPath, WayPointPathBinding> targetWayPointPathToBinding = new HashMap<WayPointPath, WayPointPathBinding>();
	
	
	/**
	 * The cached value of the '{@link #getTrajectory3DTool() <em>Trajectory3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectory3DTool()
	 * @generated
	 * @ordered
	 */
	protected Trajectory3DTool trajectory3DTool;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Trajectory3DToolNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsPackage.Literals.TRAJECTORY3_DTOOL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DTool getTrajectory3DTool() {
		if (trajectory3DTool != null && trajectory3DTool.eIsProxy()) {
			InternalEObject oldTrajectory3DTool = (InternalEObject)trajectory3DTool;
			trajectory3DTool = (Trajectory3DTool)eResolveProxy(oldTrajectory3DTool);
			if (trajectory3DTool != oldTrajectory3DTool) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, oldTrajectory3DTool, trajectory3DTool));
			}
		}
		return trajectory3DTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trajectory3DTool basicGetTrajectory3DTool() {
		return trajectory3DTool;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public NotificationChain basicSetTrajectory3DTool(Trajectory3DTool newTrajectory3DTool, NotificationChain msgs)
	{
		internalUpdateTrajectory3DTool(trajectory3DTool, newTrajectory3DTool);		
		return basicSetTrajectory3DToolGen(newTrajectory3DTool, msgs);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrajectory3DToolGen(Trajectory3DTool newTrajectory3DTool, NotificationChain msgs) {
		Trajectory3DTool oldTrajectory3DTool = trajectory3DTool;
		trajectory3DTool = newTrajectory3DTool;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, oldTrajectory3DTool, newTrajectory3DTool);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}
	
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTrajectory3DTool(Trajectory3DTool newTrajectory3DTool) 
	{
		internalUpdateTrajectory3DTool(trajectory3DTool, newTrajectory3DTool);
		setTrajectory3DToolGen(newTrajectory3DTool);	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectory3DToolGen(Trajectory3DTool newTrajectory3DTool) {
		if (newTrajectory3DTool != trajectory3DTool) {
			NotificationChain msgs = null;
			if (trajectory3DTool != null)
				msgs = ((InternalEObject)trajectory3DTool).eInverseRemove(this, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, Trajectory3DTool.class, msgs);
			if (newTrajectory3DTool != null)
				msgs = ((InternalEObject)newTrajectory3DTool).eInverseAdd(this, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, Trajectory3DTool.class, msgs);
			msgs = basicSetTrajectory3DTool(newTrajectory3DTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL, newTrajectory3DTool, newTrajectory3DTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL:
				if (trajectory3DTool != null)
					msgs = ((InternalEObject)trajectory3DTool).eInverseRemove(this, Symphony__AddonsPackage.TRAJECTORY3_DTOOL__TRAJECTORY3_DTOOL_NODE, Trajectory3DTool.class, msgs);
				return basicSetTrajectory3DTool((Trajectory3DTool)otherEnd, msgs);
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL:
				return basicSetTrajectory3DTool(null, msgs);
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL:
				if (resolve) return getTrajectory3DTool();
				return basicGetTrajectory3DTool();
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL:
				setTrajectory3DTool((Trajectory3DTool)newValue);
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL:
				setTrajectory3DTool((Trajectory3DTool)null);
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
			case Symphony__AddonsPackage.TRAJECTORY3_DTOOL_NODE__TRAJECTORY3_DTOOL:
				return trajectory3DTool != null;
		}
		return super.eIsSet(featureID);
	}
	
	private void internalUpdateTrajectory3DTool(Trajectory3DTool oldTrajectory3DTool, Trajectory3DTool newTrajectory3DTool)
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
		WayPointPath targetWayPointPath = Symphony__AddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
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
					if(msg.getNotifier() instanceof Trajectory3DTool)
					{
						int featureId = msg.getFeatureID(Trajectory3DTool.class);
						
						switch(featureId)
						{
							case Symphony__AddonsPackage.TRAJECTORY3_DTOOL__PATHS:
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
								}
							break;
						}
					}
				}
			};
		}
		
		return adapter;
	}

	
} //Trajectory3DToolNodeImpl
