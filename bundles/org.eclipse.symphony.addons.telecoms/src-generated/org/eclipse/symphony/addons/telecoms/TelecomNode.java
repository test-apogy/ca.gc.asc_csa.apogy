/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms;

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
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getStatusMonitorTool <em>Status Monitor Tool</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketsToSend <em>Packets To Send</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getConnectionTimeout <em>Connection Timeout</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyWarning <em>Latency Warning</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyAlarm <em>Latency Alarm</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossWarning <em>Packet Loss Warning</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossAlarm <em>Packet Loss Alarm</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLoss <em>Packet Loss</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode()
 * @model
 * @generated
 */
public interface TelecomNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Status Monitor Tool</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getTelecomNodes <em>Telecom Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status monitor to which this node belongs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status Monitor Tool</em>' container reference.
	 * @see #setStatusMonitorTool(TelecomStatusMonitorTool)
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_StatusMonitorTool()
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getTelecomNodes
	 * @model opposite="telecomNodes" transient="false"
	 * @generated
	 */
	TelecomStatusMonitorTool getStatusMonitorTool();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getStatusMonitorTool <em>Status Monitor Tool</em>}' container reference.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_Enabled()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#isEnabled <em>Enabled</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_Name()
	 * @model default="" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_Address()
	 * @model default="localhost" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getAddress <em>Address</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_PacketsToSend()
	 * @model default="1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	int getPacketsToSend();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketsToSend <em>Packets To Send</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_ConnectionTimeout()
	 * @model default="2000" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Connection Settings' notify='true' children='false'"
	 * @generated
	 */
	int getConnectionTimeout();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getConnectionTimeout <em>Connection Timeout</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_LatencyWarning()
	 * @model default="500.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getLatencyWarning();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyWarning <em>Latency Warning</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_LatencyAlarm()
	 * @model default="1000.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getLatencyAlarm();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyAlarm <em>Latency Alarm</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_PacketLossWarning()
	 * @model default="20.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getPacketLossWarning();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossWarning <em>Packet Loss Warning</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_PacketLossAlarm()
	 * @model default="50.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Warnings And Alarms' notify='true' children='false'"
	 * @generated
	 */
	double getPacketLossAlarm();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossAlarm <em>Packet Loss Alarm</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_Latency()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	double getLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatency <em>Latency</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_PacketLoss()
	 * @model default="0.0" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false'"
	 * @generated
	 */
	double getPacketLoss();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLoss <em>Packet Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packet Loss</em>' attribute.
	 * @see #getPacketLoss()
	 * @generated
	 */
	void setPacketLoss(double value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.telecoms.TelecomNodeStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current status of the network node, as derived from the network
	 * node's other state.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNodeStatus
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getTelecomNode_Status()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='Current Status' property='Readonly' notify='true' children='false' get='<%org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool%> _statusMonitorTool = this.getStatusMonitorTool();\nboolean _isRunning = _statusMonitorTool.isRunning();\nboolean _equals = (_isRunning == false);\nif (_equals)\n{\n\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.NOT_STARTED;\n}\nelse\n{\n\tboolean _isEnabled = this.isEnabled();\n\tboolean _equals_1 = (_isEnabled == false);\n\tif (_equals_1)\n\t{\n\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.NOT_ENABLED;\n\t}\n\telse\n\t{\n\t\tdouble _packetLoss = this.getPacketLoss();\n\t\tboolean _greaterEqualsThan = (_packetLoss >= 100.0);\n\t\tif (_greaterEqualsThan)\n\t\t{\n\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.UNREACHABLE;\n\t\t}\n\t\telse\n\t\t{\n\t\t\tboolean _and = false;\n\t\t\tdouble _latency = this.getLatency();\n\t\t\tboolean _greaterEqualsThan_1 = (_latency >= 0);\n\t\t\tif (!_greaterEqualsThan_1)\n\t\t\t{\n\t\t\t\t_and = false;\n\t\t\t} else\n\t\t\t{\n\t\t\t\tdouble _latency_1 = this.getLatency();\n\t\t\t\tdouble _latencyWarning = this.getLatencyWarning();\n\t\t\t\tboolean _lessThan = (_latency_1 < _latencyWarning);\n\t\t\t\t_and = _lessThan;\n\t\t\t}\n\t\t\tif (_and)\n\t\t\t{\n\t\t\t\tdouble _packetLoss_1 = this.getPacketLoss();\n\t\t\t\tdouble _packetLossWarning = this.getPacketLossWarning();\n\t\t\t\tboolean _lessThan_1 = (_packetLoss_1 < _packetLossWarning);\n\t\t\t\tif (_lessThan_1)\n\t\t\t\t{\n\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.NORMAL;\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tboolean _and_1 = false;\n\t\t\t\t\tdouble _packetLoss_2 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_1 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _greaterEqualsThan_2 = (_packetLoss_2 >= _packetLossWarning_1);\n\t\t\t\t\tif (!_greaterEqualsThan_2)\n\t\t\t\t\t{\n\t\t\t\t\t\t_and_1 = false;\n\t\t\t\t\t} else\n\t\t\t\t\t{\n\t\t\t\t\t\tdouble _packetLoss_3 = this.getPacketLoss();\n\t\t\t\t\t\tdouble _packetLossAlarm = this.getPacketLossAlarm();\n\t\t\t\t\t\tboolean _lessThan_2 = (_packetLoss_3 < _packetLossAlarm);\n\t\t\t\t\t\t_and_1 = _lessThan_2;\n\t\t\t\t\t}\n\t\t\t\t\tif (_and_1)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.PACKET_LOSS_WARNING;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.PACKET_LOSS_ALARM;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\tboolean _and_2 = false;\n\t\t\t\tdouble _latency_2 = this.getLatency();\n\t\t\t\tdouble _latencyWarning_1 = this.getLatencyWarning();\n\t\t\t\tboolean _greaterEqualsThan_3 = (_latency_2 >= _latencyWarning_1);\n\t\t\t\tif (!_greaterEqualsThan_3)\n\t\t\t\t{\n\t\t\t\t\t_and_2 = false;\n\t\t\t\t} else\n\t\t\t\t{\n\t\t\t\t\tdouble _latency_3 = this.getLatency();\n\t\t\t\t\tdouble _latencyAlarm = this.getLatencyAlarm();\n\t\t\t\t\tboolean _lessThan_3 = (_latency_3 < _latencyAlarm);\n\t\t\t\t\t_and_2 = _lessThan_3;\n\t\t\t\t}\n\t\t\t\tif (_and_2)\n\t\t\t\t{\n\t\t\t\t\tdouble _packetLoss_4 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_2 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _lessThan_4 = (_packetLoss_4 < _packetLossWarning_2);\n\t\t\t\t\tif (_lessThan_4)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.LATENCY_WARNING;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\tboolean _and_3 = false;\n\t\t\t\t\t\tdouble _packetLoss_5 = this.getPacketLoss();\n\t\t\t\t\t\tdouble _packetLossWarning_3 = this.getPacketLossWarning();\n\t\t\t\t\t\tboolean _greaterEqualsThan_4 = (_packetLoss_5 >= _packetLossWarning_3);\n\t\t\t\t\t\tif (!_greaterEqualsThan_4)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t_and_3 = false;\n\t\t\t\t\t\t} else\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\tdouble _packetLoss_6 = this.getPacketLoss();\n\t\t\t\t\t\t\tdouble _packetLossAlarm_1 = this.getPacketLossAlarm();\n\t\t\t\t\t\t\tboolean _lessThan_5 = (_packetLoss_6 < _packetLossAlarm_1);\n\t\t\t\t\t\t\t_and_3 = _lessThan_5;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (_and_3)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_WARNING;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tdouble _packetLoss_7 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_4 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _lessThan_6 = (_packetLoss_7 < _packetLossWarning_4);\n\t\t\t\t\tif (_lessThan_6)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.LATENCY_ALARM;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\tboolean _and_4 = false;\n\t\t\t\t\t\tdouble _packetLoss_8 = this.getPacketLoss();\n\t\t\t\t\t\tdouble _packetLossWarning_5 = this.getPacketLossWarning();\n\t\t\t\t\t\tboolean _greaterEqualsThan_5 = (_packetLoss_8 >= _packetLossWarning_5);\n\t\t\t\t\t\tif (!_greaterEqualsThan_5)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t_and_4 = false;\n\t\t\t\t\t\t} else\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\tdouble _packetLoss_9 = this.getPacketLoss();\n\t\t\t\t\t\t\tdouble _packetLossAlarm_2 = this.getPacketLossAlarm();\n\t\t\t\t\t\t\tboolean _lessThan_7 = (_packetLoss_9 < _packetLossAlarm_2);\n\t\t\t\t\t\t\t_and_4 = _lessThan_7;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (_and_4)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}'"
	 * @generated
	 */
	TelecomNodeStatus getStatus();

} // TelecomNode
