package ca.gc.asc_csa.apogy.addons.telecoms;
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telecom Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node containing all the information required to attempt communication
 * with the desired network address, keeping track of the current latency,
 * packet loss and overall state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getStatusMonitorTool <em>Status Monitor Tool</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getAddress <em>Address</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketsToSend <em>Packets To Send</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getLatencyWarning <em>Latency Warning</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getLatencyAlarm <em>Latency Alarm</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketLossWarning <em>Packet Loss Warning</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketLossAlarm <em>Packet Loss Alarm</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getLatency <em>Latency</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketLoss <em>Packet Loss</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode()
 * @model
 * @generated
 */
public interface TelecomNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Monitor Tool</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#getTelecomNodes <em>Telecom Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status monitor to which this node belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Monitor Tool</em>' container reference.
	 * @see #setStatusMonitorTool(TelecomStatusMonitorTool)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_StatusMonitorTool()
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool#getTelecomNodes
	 * @model opposite="telecomNodes" transient="false"
	 * @generated
	 */
	TelecomStatusMonitorTool getStatusMonitorTool();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getStatusMonitorTool <em>Status Monitor Tool</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Monitor Tool</em>' container reference.
	 * @see #getStatusMonitorTool()
	 * @generated
	 */
	void setStatusMonitorTool(TelecomStatusMonitorTool value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the network node is enabled, and thus, is actively
	 * receiving updates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_Enabled()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current name of the telecom node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_Name()
	 * @model default="" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current address of the telecom node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_Address()
	 * @model default="localhost" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Packets To Send</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of packets to send in each update requested (>= 1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packets To Send</em>' attribute.
	 * @see #setPacketsToSend(int)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_PacketsToSend()
	 * @model default="1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	int getPacketsToSend();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketsToSend <em>Packets To Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packets To Send</em>' attribute.
	 * @see #getPacketsToSend()
	 * @generated
	 */
	void setPacketsToSend(int value);

	/**
	 * Returns the value of the '<em><b>Connection Timeout</b></em>' attribute.
	 * The default value is <code>"2000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time (in ms) to wait between waiting for a response and considering
	 * a packet lost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection Timeout</em>' attribute.
	 * @see #setConnectionTimeout(int)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_ConnectionTimeout()
	 * @model default="2000" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	int getConnectionTimeout();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getConnectionTimeout <em>Connection Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Timeout</em>' attribute.
	 * @see #getConnectionTimeout()
	 * @generated
	 */
	void setConnectionTimeout(int value);

	/**
	 * Returns the value of the '<em><b>Latency Warning</b></em>' attribute.
	 * The default value is <code>"500.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point where packet latency (in ms) is becoming high (should be warned)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Warning</em>' attribute.
	 * @see #setLatencyWarning(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_LatencyWarning()
	 * @model default="500.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getLatencyWarning();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getLatencyWarning <em>Latency Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Warning</em>' attribute.
	 * @see #getLatencyWarning()
	 * @generated
	 */
	void setLatencyWarning(double value);

	/**
	 * Returns the value of the '<em><b>Latency Alarm</b></em>' attribute.
	 * The default value is <code>"1000.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point where packet latency (in ms) is so high as to be out of valid range (should be an alarm)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency Alarm</em>' attribute.
	 * @see #setLatencyAlarm(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_LatencyAlarm()
	 * @model default="1000.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getLatencyAlarm();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getLatencyAlarm <em>Latency Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency Alarm</em>' attribute.
	 * @see #getLatencyAlarm()
	 * @generated
	 */
	void setLatencyAlarm(double value);

	/**
	 * Returns the value of the '<em><b>Packet Loss Warning</b></em>' attribute.
	 * The default value is <code>"20.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point where packet loss (in %) is becoming high (should be warned)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packet Loss Warning</em>' attribute.
	 * @see #setPacketLossWarning(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_PacketLossWarning()
	 * @model default="20.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getPacketLossWarning();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketLossWarning <em>Packet Loss Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Loss Warning</em>' attribute.
	 * @see #getPacketLossWarning()
	 * @generated
	 */
	void setPacketLossWarning(double value);

	/**
	 * Returns the value of the '<em><b>Packet Loss Alarm</b></em>' attribute.
	 * The default value is <code>"50.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The point where packet loss (in %) is so high as to be out of valid range (should be an alarm)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packet Loss Alarm</em>' attribute.
	 * @see #setPacketLossAlarm(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_PacketLossAlarm()
	 * @model default="50.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getPacketLossAlarm();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketLossAlarm <em>Packet Loss Alarm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Loss Alarm</em>' attribute.
	 * @see #getPacketLossAlarm()
	 * @generated
	 */
	void setPacketLossAlarm(double value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current packet latency between this computer and the target address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_Latency()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	double getLatency();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(double value);

	/**
	 * Returns the value of the '<em><b>Packet Loss</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current packet loss between this computer and the target address
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packet Loss</em>' attribute.
	 * @see #setPacketLoss(double)
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_PacketLoss()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	double getPacketLoss();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode#getPacketLoss <em>Packet Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Loss</em>' attribute.
	 * @see #getPacketLoss()
	 * @generated
	 */
	void setPacketLoss(double value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current status of the network node, as derived from the network
	 * node's other state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus
	 * @see ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage#getTelecomNode_Status()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false' get='<%ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool%> _statusMonitorTool = this.getStatusMonitorTool();\nboolean _isRunning = _statusMonitorTool.isRunning();\nboolean _equals = (_isRunning == false);\nif (_equals)\n{\n\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.NOT_STARTED;\n}\nelse\n{\n\tboolean _isEnabled = this.isEnabled();\n\tboolean _equals_1 = (_isEnabled == false);\n\tif (_equals_1)\n\t{\n\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.NOT_ENABLED;\n\t}\n\telse\n\t{\n\t\tdouble _packetLoss = this.getPacketLoss();\n\t\tboolean _greaterEqualsThan = (_packetLoss >= 100.0);\n\t\tif (_greaterEqualsThan)\n\t\t{\n\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.UNREACHABLE;\n\t\t}\n\t\telse\n\t\t{\n\t\t\tif (((this.getLatency() >= 0) && (this.getLatency() < this.getLatencyWarning())))\n\t\t\t{\n\t\t\t\tdouble _packetLoss_1 = this.getPacketLoss();\n\t\t\t\tdouble _packetLossWarning = this.getPacketLossWarning();\n\t\t\t\tboolean _lessThan = (_packetLoss_1 < _packetLossWarning);\n\t\t\t\tif (_lessThan)\n\t\t\t\t{\n\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.NORMAL;\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tif (((this.getPacketLoss() >= this.getPacketLossWarning()) && \n\t\t\t\t\t\t(this.getPacketLoss() < this.getPacketLossAlarm())))\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.PACKET_LOSS_WARNING;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.PACKET_LOSS_ALARM;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\tif (((this.getLatency() >= this.getLatencyWarning()) && \n\t\t\t\t\t(this.getLatency() < this.getLatencyAlarm())))\n\t\t\t\t{\n\t\t\t\t\tdouble _packetLoss_2 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_1 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _lessThan_1 = (_packetLoss_2 < _packetLossWarning_1);\n\t\t\t\t\tif (_lessThan_1)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.LATENCY_WARNING;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\tif (((this.getPacketLoss() >= this.getPacketLossWarning()) && \n\t\t\t\t\t\t\t(this.getPacketLoss() < this.getPacketLossAlarm())))\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.BOTH_WARNING;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tdouble _packetLoss_3 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_2 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _lessThan_2 = (_packetLoss_3 < _packetLossWarning_2);\n\t\t\t\t\tif (_lessThan_2)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.LATENCY_ALARM;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\tif (((this.getPacketLoss() >= this.getPacketLossWarning()) && \n\t\t\t\t\t\t\t(this.getPacketLoss() < this.getPacketLossAlarm())))\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	TelecomNodeStatus getStatus();

} // TelecomNode
