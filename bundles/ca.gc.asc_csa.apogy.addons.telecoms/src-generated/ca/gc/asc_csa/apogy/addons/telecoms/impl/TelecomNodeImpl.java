package ca.gc.asc_csa.apogy.addons.telecoms.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telecom Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getStatusMonitorTool <em>Status Monitor Tool</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getPacketsToSend <em>Packets To Send</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getLatencyWarning <em>Latency Warning</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getLatencyAlarm <em>Latency Alarm</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getPacketLossWarning <em>Packet Loss Warning</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getPacketLossAlarm <em>Packet Loss Alarm</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getPacketLoss <em>Packet Loss</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.impl.TelecomNodeImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelecomNodeImpl extends MinimalEObjectImpl.Container implements TelecomNode {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = "localhost";

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketsToSend() <em>Packets To Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketsToSend()
	 * @generated
	 * @ordered
	 */
	protected static final int PACKETS_TO_SEND_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPacketsToSend() <em>Packets To Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketsToSend()
	 * @generated
	 * @ordered
	 */
	protected int packetsToSend = PACKETS_TO_SEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final int CONNECTION_TIMEOUT_EDEFAULT = 2000;

	/**
	 * The cached value of the '{@link #getConnectionTimeout() <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionTimeout()
	 * @generated
	 * @ordered
	 */
	protected int connectionTimeout = CONNECTION_TIMEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatencyWarning() <em>Latency Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyWarning()
	 * @generated
	 * @ordered
	 */
	protected static final double LATENCY_WARNING_EDEFAULT = 500.0;

	/**
	 * The cached value of the '{@link #getLatencyWarning() <em>Latency Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyWarning()
	 * @generated
	 * @ordered
	 */
	protected double latencyWarning = LATENCY_WARNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatencyAlarm() <em>Latency Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final double LATENCY_ALARM_EDEFAULT = 1000.0;

	/**
	 * The cached value of the '{@link #getLatencyAlarm() <em>Latency Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyAlarm()
	 * @generated
	 * @ordered
	 */
	protected double latencyAlarm = LATENCY_ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketLossWarning() <em>Packet Loss Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLossWarning()
	 * @generated
	 * @ordered
	 */
	protected static final double PACKET_LOSS_WARNING_EDEFAULT = 20.0;

	/**
	 * The cached value of the '{@link #getPacketLossWarning() <em>Packet Loss Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLossWarning()
	 * @generated
	 * @ordered
	 */
	protected double packetLossWarning = PACKET_LOSS_WARNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketLossAlarm() <em>Packet Loss Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLossAlarm()
	 * @generated
	 * @ordered
	 */
	protected static final double PACKET_LOSS_ALARM_EDEFAULT = 50.0;

	/**
	 * The cached value of the '{@link #getPacketLossAlarm() <em>Packet Loss Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLossAlarm()
	 * @generated
	 * @ordered
	 */
	protected double packetLossAlarm = PACKET_LOSS_ALARM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final double LATENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected double latency = LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketLoss() <em>Packet Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLoss()
	 * @generated
	 * @ordered
	 */
	protected static final double PACKET_LOSS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPacketLoss() <em>Packet Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketLoss()
	 * @generated
	 * @ordered
	 */
	protected double packetLoss = PACKET_LOSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final TelecomNodeStatus STATUS_EDEFAULT = TelecomNodeStatus.NOT_STARTED;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsTelecomsPackage.Literals.TELECOM_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomStatusMonitorTool getStatusMonitorTool() {
		if (eContainerFeatureID() != ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL) return null;
		return (TelecomStatusMonitorTool)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomStatusMonitorTool basicGetStatusMonitorTool() {
		if (eContainerFeatureID() != ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL) return null;
		return (TelecomStatusMonitorTool)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatusMonitorTool(TelecomStatusMonitorTool newStatusMonitorTool, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatusMonitorTool, ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusMonitorTool(TelecomStatusMonitorTool newStatusMonitorTool) {
		if (newStatusMonitorTool != eInternalContainer() || (eContainerFeatureID() != ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL && newStatusMonitorTool != null)) {
			if (EcoreUtil.isAncestor(this, newStatusMonitorTool))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatusMonitorTool != null)
				msgs = ((InternalEObject)newStatusMonitorTool).eInverseAdd(this, ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES, TelecomStatusMonitorTool.class, msgs);
			msgs = basicSetStatusMonitorTool(newStatusMonitorTool, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL, newStatusMonitorTool, newStatusMonitorTool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPacketsToSend() {
		return packetsToSend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPacketsToSend(int newPacketsToSend)
	{
		if (newPacketsToSend <= 0)
		{
			return;
		}
		
		int oldPacketsToSend = packetsToSend;
		packetsToSend = newPacketsToSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKETS_TO_SEND, oldPacketsToSend, packetsToSend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setConnectionTimeout(int newConnectionTimeout)
	{
		if (newConnectionTimeout < 0)
		{
			return;
		}
		
		int oldConnectionTimeout = connectionTimeout;
		connectionTimeout = newConnectionTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__CONNECTION_TIMEOUT, oldConnectionTimeout, connectionTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatencyWarning() {
		return latencyWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setLatencyWarning(double newLatencyWarning)
	{
		if (newLatencyWarning < 0.0 ||
			newLatencyWarning >= getLatencyAlarm())
		{
			return;
		}
		
		double oldLatencyWarning = latencyWarning;
		latencyWarning = newLatencyWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_WARNING, oldLatencyWarning, latencyWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatencyAlarm() {
		return latencyAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setLatencyAlarm(double newLatencyAlarm)
	{
		if (newLatencyAlarm < 0.0 ||
			newLatencyAlarm <= getLatencyWarning())
		{
			return;
		}
		
		double oldLatencyAlarm = latencyAlarm;
		latencyAlarm = newLatencyAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_ALARM, oldLatencyAlarm, latencyAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPacketLossWarning() {
		return packetLossWarning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPacketLossWarning(double newPacketLossWarning)
	{
		if (newPacketLossWarning < 0.0 ||
			newPacketLossWarning >= getPacketLossAlarm())
		{
			return;
		}
		
		double oldPacketLossWarning = packetLossWarning;
		packetLossWarning = newPacketLossWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_WARNING, oldPacketLossWarning, packetLossWarning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPacketLossAlarm() {
		return packetLossAlarm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPacketLossAlarm(double newPacketLossAlarm)
	{
		if (newPacketLossAlarm < 0.0 ||
			newPacketLossAlarm <= getPacketLossWarning())
		{
			return;
		}
		
		double oldPacketLossAlarm = packetLossAlarm;
		packetLossAlarm = newPacketLossAlarm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_ALARM, oldPacketLossAlarm, packetLossAlarm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(double newLatency) {
		double oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPacketLoss() {
		return packetLoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketLoss(double newPacketLoss) {
		double oldPacketLoss = packetLoss;
		packetLoss = newPacketLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS, oldPacketLoss, packetLoss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomNodeStatus getStatus() {
		TelecomStatusMonitorTool _statusMonitorTool = this.getStatusMonitorTool();
		boolean _isRunning = _statusMonitorTool.isRunning();
		boolean _equals = (_isRunning == false);
		if (_equals) {
			return TelecomNodeStatus.NOT_STARTED;
		}
		else {
			boolean _isEnabled = this.isEnabled();
			boolean _equals_1 = (_isEnabled == false);
			if (_equals_1) {
				return TelecomNodeStatus.NOT_ENABLED;
			}
			else {
				double _packetLoss = this.getPacketLoss();
				boolean _greaterEqualsThan = (_packetLoss >= 100.0);
				if (_greaterEqualsThan) {
					return TelecomNodeStatus.UNREACHABLE;
				}
				else {
					if (((this.getLatency() >= 0) && (this.getLatency() < this.getLatencyWarning()))) {
						double _packetLoss_1 = this.getPacketLoss();
						double _packetLossWarning = this.getPacketLossWarning();
						boolean _lessThan = (_packetLoss_1 < _packetLossWarning);
						if (_lessThan) {
							return TelecomNodeStatus.NORMAL;
						}
						else {
							if (((this.getPacketLoss() >= this.getPacketLossWarning()) && 
								(this.getPacketLoss() < this.getPacketLossAlarm()))) {
								return TelecomNodeStatus.PACKET_LOSS_WARNING;
							}
							else {
								return TelecomNodeStatus.PACKET_LOSS_ALARM;
							}
						}
					}
					else {
						if (((this.getLatency() >= this.getLatencyWarning()) && 
							(this.getLatency() < this.getLatencyAlarm()))) {
							double _packetLoss_2 = this.getPacketLoss();
							double _packetLossWarning_1 = this.getPacketLossWarning();
							boolean _lessThan_1 = (_packetLoss_2 < _packetLossWarning_1);
							if (_lessThan_1) {
								return TelecomNodeStatus.LATENCY_WARNING;
							}
							else {
								if (((this.getPacketLoss() >= this.getPacketLossWarning()) && 
									(this.getPacketLoss() < this.getPacketLossAlarm()))) {
									return TelecomNodeStatus.BOTH_WARNING;
								}
								else {
									return TelecomNodeStatus.BOTH_ALARM;
								}
							}
						}
						else {
							double _packetLoss_3 = this.getPacketLoss();
							double _packetLossWarning_2 = this.getPacketLossWarning();
							boolean _lessThan_2 = (_packetLoss_3 < _packetLossWarning_2);
							if (_lessThan_2) {
								return TelecomNodeStatus.LATENCY_ALARM;
							}
							else {
								if (((this.getPacketLoss() >= this.getPacketLossWarning()) && 
									(this.getPacketLoss() < this.getPacketLossAlarm()))) {
									return TelecomNodeStatus.BOTH_ALARM;
								}
								else {
									return TelecomNodeStatus.BOTH_ALARM;
								}
							}
						}
					}
				}
			}
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatusMonitorTool((TelecomStatusMonitorTool)otherEnd, msgs);
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL:
				return basicSetStatusMonitorTool(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL:
				return eInternalContainer().eInverseRemove(this, ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES, TelecomStatusMonitorTool.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL:
				if (resolve) return getStatusMonitorTool();
				return basicGetStatusMonitorTool();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ENABLED:
				return isEnabled();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__NAME:
				return getName();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ADDRESS:
				return getAddress();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKETS_TO_SEND:
				return getPacketsToSend();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__CONNECTION_TIMEOUT:
				return getConnectionTimeout();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_WARNING:
				return getLatencyWarning();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_ALARM:
				return getLatencyAlarm();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_WARNING:
				return getPacketLossWarning();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_ALARM:
				return getPacketLossAlarm();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY:
				return getLatency();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS:
				return getPacketLoss();
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS:
				return getStatus();
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL:
				setStatusMonitorTool((TelecomStatusMonitorTool)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__NAME:
				setName((String)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ADDRESS:
				setAddress((String)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKETS_TO_SEND:
				setPacketsToSend((Integer)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__CONNECTION_TIMEOUT:
				setConnectionTimeout((Integer)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_WARNING:
				setLatencyWarning((Double)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_ALARM:
				setLatencyAlarm((Double)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_WARNING:
				setPacketLossWarning((Double)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_ALARM:
				setPacketLossAlarm((Double)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY:
				setLatency((Double)newValue);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS:
				setPacketLoss((Double)newValue);
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL:
				setStatusMonitorTool((TelecomStatusMonitorTool)null);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKETS_TO_SEND:
				setPacketsToSend(PACKETS_TO_SEND_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__CONNECTION_TIMEOUT:
				setConnectionTimeout(CONNECTION_TIMEOUT_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_WARNING:
				setLatencyWarning(LATENCY_WARNING_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_ALARM:
				setLatencyAlarm(LATENCY_ALARM_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_WARNING:
				setPacketLossWarning(PACKET_LOSS_WARNING_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_ALARM:
				setPacketLossAlarm(PACKET_LOSS_ALARM_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS:
				setPacketLoss(PACKET_LOSS_EDEFAULT);
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS_MONITOR_TOOL:
				return basicGetStatusMonitorTool() != null;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKETS_TO_SEND:
				return packetsToSend != PACKETS_TO_SEND_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__CONNECTION_TIMEOUT:
				return connectionTimeout != CONNECTION_TIMEOUT_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_WARNING:
				return latencyWarning != LATENCY_WARNING_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY_ALARM:
				return latencyAlarm != LATENCY_ALARM_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_WARNING:
				return packetLossWarning != PACKET_LOSS_WARNING_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS_ALARM:
				return packetLossAlarm != PACKET_LOSS_ALARM_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__LATENCY:
				return latency != LATENCY_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__PACKET_LOSS:
				return packetLoss != PACKET_LOSS_EDEFAULT;
			case ApogyAddonsTelecomsPackage.TELECOM_NODE__STATUS:
				return getStatus() != STATUS_EDEFAULT;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", name: ");
		result.append(name);
		result.append(", address: ");
		result.append(address);
		result.append(", packetsToSend: ");
		result.append(packetsToSend);
		result.append(", connectionTimeout: ");
		result.append(connectionTimeout);
		result.append(", latencyWarning: ");
		result.append(latencyWarning);
		result.append(", latencyAlarm: ");
		result.append(latencyAlarm);
		result.append(", packetLossWarning: ");
		result.append(packetLossWarning);
		result.append(", packetLossAlarm: ");
		result.append(packetLossAlarm);
		result.append(", latency: ");
		result.append(latency);
		result.append(", packetLoss: ");
		result.append(packetLoss);
		result.append(')');
		return result.toString();
	}

} //TelecomNodeImpl
