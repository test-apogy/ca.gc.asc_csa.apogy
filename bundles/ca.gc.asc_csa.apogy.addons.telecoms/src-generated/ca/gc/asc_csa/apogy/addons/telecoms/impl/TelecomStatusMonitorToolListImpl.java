/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.telecoms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.addons.impl.SimpleToolImpl;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telecom Status Monitor Tool List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomStatusMonitorToolListImpl#getTelecomStatusMonitors <em>Telecom Status Monitors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelecomStatusMonitorToolListImpl extends SimpleToolImpl implements TelecomStatusMonitorToolList {
	/**
	 * The cached value of the '{@link #getTelecomStatusMonitors() <em>Telecom Status Monitors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecomStatusMonitors()
	 * @generated
	 * @ordered
	 */
	protected EList<TelecomStatusMonitorTool> telecomStatusMonitors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomStatusMonitorToolListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsTelecomsPackage.Literals.TELECOM_STATUS_MONITOR_TOOL_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TelecomStatusMonitorTool> getTelecomStatusMonitors() {
		if (telecomStatusMonitors == null) {
			telecomStatusMonitors = new EObjectContainmentWithInverseEList<TelecomStatusMonitorTool>(TelecomStatusMonitorTool.class, this, ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS, ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST);
		}
		return telecomStatusMonitors;
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
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTelecomStatusMonitors()).basicAdd(otherEnd, msgs);
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
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS:
				return ((InternalEList<?>)getTelecomStatusMonitors()).basicRemove(otherEnd, msgs);
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
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS:
				return getTelecomStatusMonitors();
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
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS:
				getTelecomStatusMonitors().clear();
				getTelecomStatusMonitors().addAll((Collection<? extends TelecomStatusMonitorTool>)newValue);
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
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS:
				getTelecomStatusMonitors().clear();
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
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS:
				return telecomStatusMonitors != null && !telecomStatusMonitors.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * Used to perform the required cleanup when the list of
	 * telecom status monitors is being disposed
	 */
	@Override
	public void dispose()
	{
		// If this hasn't been disposed already
		if (isDisposed() == false)
		{
			// Go through all of the telecom status monitors
			for (TelecomStatusMonitorTool monitor : getTelecomStatusMonitors())
			{
				// Dispose of each of them
				monitor.dispose();
			}
		}
		
		// Call the superclass' version of this method
		super.dispose();
	}

} //TelecomStatusMonitorToolListImpl
