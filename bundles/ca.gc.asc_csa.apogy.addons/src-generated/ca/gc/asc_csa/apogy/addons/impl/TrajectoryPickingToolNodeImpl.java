/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.impl;

import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.addons.TrajectoryPickingToolNode;

import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class TrajectoryPickingToolNodeImpl extends AggregateGroupNodeImpl implements TrajectoryPickingToolNode {
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
	 * @generated
	 */
	public NotificationChain basicSetTrajectoryPickingTool(TrajectoryPickingTool newTrajectoryPickingTool, NotificationChain msgs) {
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

} //TrajectoryPickingToolNodeImpl
