/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms;

import ca.gc.space.topology.TopologyPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='SymphonyTelecomTools' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='SymphonyTelecomTools' complianceLevel='6.0' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.addons.telecoms/src-generated' editDirectory='/org.eclipse.symphony.addons.telecoms.edit/src-generated' basePackage='org.eclipse.symphony.addons'"
 * @generated
 */
public interface SymphonyTelecomToolsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "telecoms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.addons.telecoms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "telecoms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymphonyTelecomToolsPackage eINSTANCE = org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.TelecomNodeImpl <em>Telecom Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.TelecomNodeImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomNode()
	 * @generated
	 */
	int TELECOM_NODE = 0;

	/**
	 * The feature id for the '<em><b>Status Monitor Tool</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__STATUS_MONITOR_TOOL = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__ENABLED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Packets To Send</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__PACKETS_TO_SEND = 4;

	/**
	 * The feature id for the '<em><b>Connection Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__CONNECTION_TIMEOUT = 5;

	/**
	 * The feature id for the '<em><b>Latency Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__LATENCY_WARNING = 6;

	/**
	 * The feature id for the '<em><b>Latency Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__LATENCY_ALARM = 7;

	/**
	 * The feature id for the '<em><b>Packet Loss Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__PACKET_LOSS_WARNING = 8;

	/**
	 * The feature id for the '<em><b>Packet Loss Alarm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__PACKET_LOSS_ALARM = 9;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__LATENCY = 10;

	/**
	 * The feature id for the '<em><b>Packet Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__PACKET_LOSS = 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE__STATUS = 12;

	/**
	 * The number of structural features of the '<em>Telecom Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Telecom Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl <em>Telecom Status Monitor Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomStatusMonitorTool()
	 * @generated
	 */
	int TELECOM_STATUS_MONITOR_TOOL = 1;

	/**
	 * The feature id for the '<em><b>Telecom Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES = 0;

	/**
	 * The feature id for the '<em><b>Status Monitor Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST = 1;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL__RUNNING = 2;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL__DISPOSED = 3;

	/**
	 * The number of structural features of the '<em>Telecom Status Monitor Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL___START = 0;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL___STOP = 1;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL___DISPOSE = 2;

	/**
	 * The number of operations of the '<em>Telecom Status Monitor Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolListImpl <em>Telecom Status Monitor Tool List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolListImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomStatusMonitorToolList()
	 * @generated
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST__NAME = SymphonyToolsCorePackage.SIMPLE_TOOL__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST__DESCRIPTION = SymphonyToolsCorePackage.SIMPLE_TOOL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Tool List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST__TOOL_LIST = SymphonyToolsCorePackage.SIMPLE_TOOL__TOOL_LIST;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST__ACTIVE = SymphonyToolsCorePackage.SIMPLE_TOOL__ACTIVE;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST__DISPOSED = SymphonyToolsCorePackage.SIMPLE_TOOL__DISPOSED;

	/**
	 * The feature id for the '<em><b>Telecom Status Monitors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS = SymphonyToolsCorePackage.SIMPLE_TOOL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Telecom Status Monitor Tool List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST_FEATURE_COUNT = SymphonyToolsCorePackage.SIMPLE_TOOL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST___DISPOSE = SymphonyToolsCorePackage.SIMPLE_TOOL___DISPOSE;

	/**
	 * The number of operations of the '<em>Telecom Status Monitor Tool List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELECOM_STATUS_MONITOR_TOOL_LIST_OPERATION_COUNT = SymphonyToolsCorePackage.SIMPLE_TOOL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.AbstractAntennaRadiationPatternImpl <em>Abstract Antenna Radiation Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.AbstractAntennaRadiationPatternImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getAbstractAntennaRadiationPattern()
	 * @generated
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN__PARENT = TopologyPackage.NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN__DESCRIPTION = TopologyPackage.NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN__NODE_ID = TopologyPackage.NODE__NODE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN__NAME = TopologyPackage.NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT = TopologyPackage.NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR = TopologyPackage.NODE___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Compute Gain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE = TopologyPackage.NODE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT = TopologyPackage.NODE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.IsotropicAntennaImpl <em>Isotropic Antenna</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.IsotropicAntennaImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getIsotropicAntenna()
	 * @generated
	 */
	int ISOTROPIC_ANTENNA = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA__PARENT = ABSTRACT_ANTENNA_RADIATION_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA__DESCRIPTION = ABSTRACT_ANTENNA_RADIATION_PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA__NODE_ID = ABSTRACT_ANTENNA_RADIATION_PATTERN__NODE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA__NAME = ABSTRACT_ANTENNA_RADIATION_PATTERN__NAME;

	/**
	 * The number of structural features of the '<em>Isotropic Antenna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA_FEATURE_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA___ACCEPT__INODEVISITOR = ABSTRACT_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Compute Gain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA___COMPUTE_GAIN__DOUBLE_DOUBLE = ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Isotropic Antenna</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOTROPIC_ANTENNA_OPERATION_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.DipoleAntennaRadiationPatternImpl <em>Dipole Antenna Radiation Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.DipoleAntennaRadiationPatternImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getDipoleAntennaRadiationPattern()
	 * @generated
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN__PARENT = ABSTRACT_ANTENNA_RADIATION_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN__DESCRIPTION = ABSTRACT_ANTENNA_RADIATION_PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN__NODE_ID = ABSTRACT_ANTENNA_RADIATION_PATTERN__NODE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN__NAME = ABSTRACT_ANTENNA_RADIATION_PATTERN__NAME;

	/**
	 * The number of structural features of the '<em>Dipole Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR = ABSTRACT_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Compute Gain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE = ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Dipole Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIPOLE_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.HalfWaveDipoleAntennaRadiationPatternImpl <em>Half Wave Dipole Antenna Radiation Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.HalfWaveDipoleAntennaRadiationPatternImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getHalfWaveDipoleAntennaRadiationPattern()
	 * @generated
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN__PARENT = ABSTRACT_ANTENNA_RADIATION_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN__DESCRIPTION = ABSTRACT_ANTENNA_RADIATION_PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN__NODE_ID = ABSTRACT_ANTENNA_RADIATION_PATTERN__NODE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN__NAME = ABSTRACT_ANTENNA_RADIATION_PATTERN__NAME;

	/**
	 * The number of structural features of the '<em>Half Wave Dipole Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR = ABSTRACT_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Compute Gain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE = ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Half Wave Dipole Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.SimpleConicalRadiationPatternImpl <em>Simple Conical Radiation Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.SimpleConicalRadiationPatternImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getSimpleConicalRadiationPattern()
	 * @generated
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN__PARENT = ABSTRACT_ANTENNA_RADIATION_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN__DESCRIPTION = ABSTRACT_ANTENNA_RADIATION_PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN__NODE_ID = ABSTRACT_ANTENNA_RADIATION_PATTERN__NODE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN__NAME = ABSTRACT_ANTENNA_RADIATION_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Apex Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Conical Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN_FEATURE_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN___ACCEPT__INODEVISITOR = ABSTRACT_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Compute Gain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE = ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Simple Conical Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONICAL_RADIATION_PATTERN_OPERATION_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.SimpleRectangularFrustumRadiationPatternImpl <em>Simple Rectangular Frustum Radiation Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.SimpleRectangularFrustumRadiationPatternImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getSimpleRectangularFrustumRadiationPattern()
	 * @generated
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__PARENT = ABSTRACT_ANTENNA_RADIATION_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__DESCRIPTION = ABSTRACT_ANTENNA_RADIATION_PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__NODE_ID = ABSTRACT_ANTENNA_RADIATION_PATTERN__NODE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__NAME = ABSTRACT_ANTENNA_RADIATION_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Horizontal Field Of View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vertical Field Of View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Rectangular Frustum Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN_FEATURE_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN___ACCEPT__INODEVISITOR = ABSTRACT_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Compute Gain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE = ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Simple Rectangular Frustum Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN_OPERATION_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.URlBasedAntennaRadiationPatternImpl <em>URl Based Antenna Radiation Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.URlBasedAntennaRadiationPatternImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getURlBasedAntennaRadiationPattern()
	 * @generated
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN__PARENT = ABSTRACT_ANTENNA_RADIATION_PATTERN__PARENT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN__DESCRIPTION = ABSTRACT_ANTENNA_RADIATION_PATTERN__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN__NODE_ID = ABSTRACT_ANTENNA_RADIATION_PATTERN__NODE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN__NAME = ABSTRACT_ANTENNA_RADIATION_PATTERN__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN__URL = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>URl Based Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR = ABSTRACT_ANTENNA_RADIATION_PATTERN___ACCEPT__INODEVISITOR;

	/**
	 * The operation id for the '<em>Compute Gain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE = ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>URl Based Antenna Radiation Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT = ABSTRACT_ANTENNA_RADIATION_PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.impl.AntennaRadiationPatternImageMapLayerImpl <em>Antenna Radiation Pattern Image Map Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.impl.AntennaRadiationPatternImageMapLayerImpl
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getAntennaRadiationPatternImageMapLayer()
	 * @generated
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__NAME = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__DESCRIPTION = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Map</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__MAP = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__MAP;

	/**
	 * The feature id for the '<em><b>Abstract Map Layer Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__WIDTH = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__HEIGHT = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__HEIGHT;

	/**
	 * The feature id for the '<em><b>Opaque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__OPAQUE = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OPAQUE;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__IMAGE = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__IMAGE;

	/**
	 * The feature id for the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__LEGEND = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LEGEND;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__RESOLUTION = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Required Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION;

	/**
	 * The feature id for the '<em><b>Cartesian Triangular Mesh Map Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER;

	/**
	 * The feature id for the '<em><b>Line Of Sight Available Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR;

	/**
	 * The feature id for the '<em><b>Line Of Sight Not Available Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR;

	/**
	 * The feature id for the '<em><b>Observer Pose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__OBSERVER_POSE = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE;

	/**
	 * The feature id for the '<em><b>Target Height Above Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND;

	/**
	 * The feature id for the '<em><b>Use Height Perpendicular To Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND;

	/**
	 * The feature id for the '<em><b>Antenna Radiation Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signal Strength Cutoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bellow Cutoff Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Antenna Radiation Pattern Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER_FEATURE_COUNT = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER___GET_REGION = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_REGION;

	/**
	 * The operation id for the '<em>Get Region Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER___GET_REGION_IMAGE = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_REGION_IMAGE;

	/**
	 * The operation id for the '<em>Get Resolution</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER___GET_RESOLUTION = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_RESOLUTION;

	/**
	 * The operation id for the '<em>Update Image</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR;

	/**
	 * The operation id for the '<em>Get Image Map Layer Region</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION;

	/**
	 * The number of operations of the '<em>Antenna Radiation Pattern Image Map Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER_OPERATION_COUNT = SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.addons.telecoms.TelecomNodeStatus <em>Telecom Node Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNodeStatus
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomNodeStatus()
	 * @generated
	 */
	int TELECOM_NODE_STATUS = 11;


	/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 12;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.TelecomNode <em>Telecom Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telecom Node</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode
	 * @generated
	 */
	EClass getTelecomNode();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getStatusMonitorTool <em>Status Monitor Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Status Monitor Tool</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getStatusMonitorTool()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EReference getTelecomNode_StatusMonitorTool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#isEnabled()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getName()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getAddress()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketsToSend <em>Packets To Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packets To Send</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketsToSend()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_PacketsToSend();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getConnectionTimeout <em>Connection Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Timeout</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getConnectionTimeout()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_ConnectionTimeout();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyWarning <em>Latency Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Warning</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyWarning()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_LatencyWarning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyAlarm <em>Latency Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency Alarm</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getLatencyAlarm()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_LatencyAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossWarning <em>Packet Loss Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Loss Warning</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossWarning()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_PacketLossWarning();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossAlarm <em>Packet Loss Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Loss Alarm</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLossAlarm()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_PacketLossAlarm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getLatency()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_Latency();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLoss <em>Packet Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packet Loss</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getPacketLoss()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_PacketLoss();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomNode#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNode#getStatus()
	 * @see #getTelecomNode()
	 * @generated
	 */
	EAttribute getTelecomNode_Status();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool <em>Telecom Status Monitor Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telecom Status Monitor Tool</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool
	 * @generated
	 */
	EClass getTelecomStatusMonitorTool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getTelecomNodes <em>Telecom Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom Nodes</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getTelecomNodes()
	 * @see #getTelecomStatusMonitorTool()
	 * @generated
	 */
	EReference getTelecomStatusMonitorTool_TelecomNodes();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList <em>Status Monitor Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Status Monitor Tool List</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#getStatusMonitorToolList()
	 * @see #getTelecomStatusMonitorTool()
	 * @generated
	 */
	EReference getTelecomStatusMonitorTool_StatusMonitorToolList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#isRunning()
	 * @see #getTelecomStatusMonitorTool()
	 * @generated
	 */
	EAttribute getTelecomStatusMonitorTool_Running();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#isDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#isDisposed()
	 * @see #getTelecomStatusMonitorTool()
	 * @generated
	 */
	EAttribute getTelecomStatusMonitorTool_Disposed();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#start() <em>Start</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start</em>' operation.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#start()
	 * @generated
	 */
	EOperation getTelecomStatusMonitorTool__Start();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#stop()
	 * @generated
	 */
	EOperation getTelecomStatusMonitorTool__Stop();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool#dispose()
	 * @generated
	 */
	EOperation getTelecomStatusMonitorTool__Dispose();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList <em>Telecom Status Monitor Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telecom Status Monitor Tool List</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList
	 * @generated
	 */
	EClass getTelecomStatusMonitorToolList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList#getTelecomStatusMonitors <em>Telecom Status Monitors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Telecom Status Monitors</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList#getTelecomStatusMonitors()
	 * @see #getTelecomStatusMonitorToolList()
	 * @generated
	 */
	EReference getTelecomStatusMonitorToolList_TelecomStatusMonitors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern <em>Abstract Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Antenna Radiation Pattern</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern
	 * @generated
	 */
	EClass getAbstractAntennaRadiationPattern();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern#computeGain(double, double) <em>Compute Gain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Gain</em>' operation.
	 * @see org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern#computeGain(double, double)
	 * @generated
	 */
	EOperation getAbstractAntennaRadiationPattern__ComputeGain__double_double();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.IsotropicAntenna <em>Isotropic Antenna</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Isotropic Antenna</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.IsotropicAntenna
	 * @generated
	 */
	EClass getIsotropicAntenna();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.DipoleAntennaRadiationPattern <em>Dipole Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dipole Antenna Radiation Pattern</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.DipoleAntennaRadiationPattern
	 * @generated
	 */
	EClass getDipoleAntennaRadiationPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern <em>Half Wave Dipole Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Half Wave Dipole Antenna Radiation Pattern</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern
	 * @generated
	 */
	EClass getHalfWaveDipoleAntennaRadiationPattern();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern <em>Simple Conical Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Conical Radiation Pattern</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern
	 * @generated
	 */
	EClass getSimpleConicalRadiationPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern#getApexAngle <em>Apex Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apex Angle</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern#getApexAngle()
	 * @see #getSimpleConicalRadiationPattern()
	 * @generated
	 */
	EAttribute getSimpleConicalRadiationPattern_ApexAngle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern <em>Simple Rectangular Frustum Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Rectangular Frustum Radiation Pattern</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern
	 * @generated
	 */
	EClass getSimpleRectangularFrustumRadiationPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getHorizontalFieldOfView <em>Horizontal Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Field Of View</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getHorizontalFieldOfView()
	 * @see #getSimpleRectangularFrustumRadiationPattern()
	 * @generated
	 */
	EAttribute getSimpleRectangularFrustumRadiationPattern_HorizontalFieldOfView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getVerticalFieldOfView <em>Vertical Field Of View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Field Of View</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern#getVerticalFieldOfView()
	 * @see #getSimpleRectangularFrustumRadiationPattern()
	 * @generated
	 */
	EAttribute getSimpleRectangularFrustumRadiationPattern_VerticalFieldOfView();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern <em>URl Based Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>URl Based Antenna Radiation Pattern</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern
	 * @generated
	 */
	EClass getURlBasedAntennaRadiationPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern#getUrl()
	 * @see #getURlBasedAntennaRadiationPattern()
	 * @generated
	 */
	EAttribute getURlBasedAntennaRadiationPattern_Url();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer <em>Antenna Radiation Pattern Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antenna Radiation Pattern Image Map Layer</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer
	 * @generated
	 */
	EClass getAntennaRadiationPatternImageMapLayer();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getAntennaRadiationPattern <em>Antenna Radiation Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antenna Radiation Pattern</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getAntennaRadiationPattern()
	 * @see #getAntennaRadiationPatternImageMapLayer()
	 * @generated
	 */
	EReference getAntennaRadiationPatternImageMapLayer_AntennaRadiationPattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getSignalStrengthCutoff <em>Signal Strength Cutoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Strength Cutoff</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getSignalStrengthCutoff()
	 * @see #getAntennaRadiationPatternImageMapLayer()
	 * @generated
	 */
	EAttribute getAntennaRadiationPatternImageMapLayer_SignalStrengthCutoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getBellowCutoffColor <em>Bellow Cutoff Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bellow Cutoff Color</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer#getBellowCutoffColor()
	 * @see #getAntennaRadiationPatternImageMapLayer()
	 * @generated
	 */
	EAttribute getAntennaRadiationPatternImageMapLayer_BellowCutoffColor();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.addons.telecoms.TelecomNodeStatus <em>Telecom Node Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Telecom Node Status</em>'.
	 * @see org.eclipse.symphony.addons.telecoms.TelecomNodeStatus
	 * @generated
	 */
	EEnum getTelecomNodeStatus();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Color3f <em>Color3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color3f</em>'.
	 * @see javax.vecmath.Color3f
	 * @model instanceClass="javax.vecmath.Color3f"
	 * @generated
	 */
	EDataType getColor3f();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymphonyTelecomToolsFactory getSymphonyTelecomToolsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.TelecomNodeImpl <em>Telecom Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.TelecomNodeImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomNode()
		 * @generated
		 */
		EClass TELECOM_NODE = eINSTANCE.getTelecomNode();

		/**
		 * The meta object literal for the '<em><b>Status Monitor Tool</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECOM_NODE__STATUS_MONITOR_TOOL = eINSTANCE.getTelecomNode_StatusMonitorTool();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__ENABLED = eINSTANCE.getTelecomNode_Enabled();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__NAME = eINSTANCE.getTelecomNode_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__ADDRESS = eINSTANCE.getTelecomNode_Address();

		/**
		 * The meta object literal for the '<em><b>Packets To Send</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__PACKETS_TO_SEND = eINSTANCE.getTelecomNode_PacketsToSend();

		/**
		 * The meta object literal for the '<em><b>Connection Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__CONNECTION_TIMEOUT = eINSTANCE.getTelecomNode_ConnectionTimeout();

		/**
		 * The meta object literal for the '<em><b>Latency Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__LATENCY_WARNING = eINSTANCE.getTelecomNode_LatencyWarning();

		/**
		 * The meta object literal for the '<em><b>Latency Alarm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__LATENCY_ALARM = eINSTANCE.getTelecomNode_LatencyAlarm();

		/**
		 * The meta object literal for the '<em><b>Packet Loss Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__PACKET_LOSS_WARNING = eINSTANCE.getTelecomNode_PacketLossWarning();

		/**
		 * The meta object literal for the '<em><b>Packet Loss Alarm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__PACKET_LOSS_ALARM = eINSTANCE.getTelecomNode_PacketLossAlarm();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__LATENCY = eINSTANCE.getTelecomNode_Latency();

		/**
		 * The meta object literal for the '<em><b>Packet Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__PACKET_LOSS = eINSTANCE.getTelecomNode_PacketLoss();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_NODE__STATUS = eINSTANCE.getTelecomNode_Status();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl <em>Telecom Status Monitor Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomStatusMonitorTool()
		 * @generated
		 */
		EClass TELECOM_STATUS_MONITOR_TOOL = eINSTANCE.getTelecomStatusMonitorTool();

		/**
		 * The meta object literal for the '<em><b>Telecom Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES = eINSTANCE.getTelecomStatusMonitorTool_TelecomNodes();

		/**
		 * The meta object literal for the '<em><b>Status Monitor Tool List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST = eINSTANCE.getTelecomStatusMonitorTool_StatusMonitorToolList();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_STATUS_MONITOR_TOOL__RUNNING = eINSTANCE.getTelecomStatusMonitorTool_Running();

		/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TELECOM_STATUS_MONITOR_TOOL__DISPOSED = eINSTANCE.getTelecomStatusMonitorTool_Disposed();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TELECOM_STATUS_MONITOR_TOOL___START = eINSTANCE.getTelecomStatusMonitorTool__Start();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TELECOM_STATUS_MONITOR_TOOL___STOP = eINSTANCE.getTelecomStatusMonitorTool__Stop();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TELECOM_STATUS_MONITOR_TOOL___DISPOSE = eINSTANCE.getTelecomStatusMonitorTool__Dispose();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolListImpl <em>Telecom Status Monitor Tool List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.TelecomStatusMonitorToolListImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomStatusMonitorToolList()
		 * @generated
		 */
		EClass TELECOM_STATUS_MONITOR_TOOL_LIST = eINSTANCE.getTelecomStatusMonitorToolList();

		/**
		 * The meta object literal for the '<em><b>Telecom Status Monitors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS = eINSTANCE.getTelecomStatusMonitorToolList_TelecomStatusMonitors();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.AbstractAntennaRadiationPatternImpl <em>Abstract Antenna Radiation Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.AbstractAntennaRadiationPatternImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getAbstractAntennaRadiationPattern()
		 * @generated
		 */
		EClass ABSTRACT_ANTENNA_RADIATION_PATTERN = eINSTANCE.getAbstractAntennaRadiationPattern();

		/**
		 * The meta object literal for the '<em><b>Compute Gain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE = eINSTANCE.getAbstractAntennaRadiationPattern__ComputeGain__double_double();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.IsotropicAntennaImpl <em>Isotropic Antenna</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.IsotropicAntennaImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getIsotropicAntenna()
		 * @generated
		 */
		EClass ISOTROPIC_ANTENNA = eINSTANCE.getIsotropicAntenna();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.DipoleAntennaRadiationPatternImpl <em>Dipole Antenna Radiation Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.DipoleAntennaRadiationPatternImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getDipoleAntennaRadiationPattern()
		 * @generated
		 */
		EClass DIPOLE_ANTENNA_RADIATION_PATTERN = eINSTANCE.getDipoleAntennaRadiationPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.HalfWaveDipoleAntennaRadiationPatternImpl <em>Half Wave Dipole Antenna Radiation Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.HalfWaveDipoleAntennaRadiationPatternImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getHalfWaveDipoleAntennaRadiationPattern()
		 * @generated
		 */
		EClass HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN = eINSTANCE.getHalfWaveDipoleAntennaRadiationPattern();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.SimpleConicalRadiationPatternImpl <em>Simple Conical Radiation Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.SimpleConicalRadiationPatternImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getSimpleConicalRadiationPattern()
		 * @generated
		 */
		EClass SIMPLE_CONICAL_RADIATION_PATTERN = eINSTANCE.getSimpleConicalRadiationPattern();

		/**
		 * The meta object literal for the '<em><b>Apex Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE = eINSTANCE.getSimpleConicalRadiationPattern_ApexAngle();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.SimpleRectangularFrustumRadiationPatternImpl <em>Simple Rectangular Frustum Radiation Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.SimpleRectangularFrustumRadiationPatternImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getSimpleRectangularFrustumRadiationPattern()
		 * @generated
		 */
		EClass SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN = eINSTANCE.getSimpleRectangularFrustumRadiationPattern();

		/**
		 * The meta object literal for the '<em><b>Horizontal Field Of View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW = eINSTANCE.getSimpleRectangularFrustumRadiationPattern_HorizontalFieldOfView();

		/**
		 * The meta object literal for the '<em><b>Vertical Field Of View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW = eINSTANCE.getSimpleRectangularFrustumRadiationPattern_VerticalFieldOfView();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.URlBasedAntennaRadiationPatternImpl <em>URl Based Antenna Radiation Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.URlBasedAntennaRadiationPatternImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getURlBasedAntennaRadiationPattern()
		 * @generated
		 */
		EClass URL_BASED_ANTENNA_RADIATION_PATTERN = eINSTANCE.getURlBasedAntennaRadiationPattern();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_ANTENNA_RADIATION_PATTERN__URL = eINSTANCE.getURlBasedAntennaRadiationPattern_Url();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.impl.AntennaRadiationPatternImageMapLayerImpl <em>Antenna Radiation Pattern Image Map Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.impl.AntennaRadiationPatternImageMapLayerImpl
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getAntennaRadiationPatternImageMapLayer()
		 * @generated
		 */
		EClass ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER = eINSTANCE.getAntennaRadiationPatternImageMapLayer();

		/**
		 * The meta object literal for the '<em><b>Antenna Radiation Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN = eINSTANCE.getAntennaRadiationPatternImageMapLayer_AntennaRadiationPattern();

		/**
		 * The meta object literal for the '<em><b>Signal Strength Cutoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF = eINSTANCE.getAntennaRadiationPatternImageMapLayer_SignalStrengthCutoff();

		/**
		 * The meta object literal for the '<em><b>Bellow Cutoff Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR = eINSTANCE.getAntennaRadiationPatternImageMapLayer_BellowCutoffColor();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.addons.telecoms.TelecomNodeStatus <em>Telecom Node Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.addons.telecoms.TelecomNodeStatus
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getTelecomNodeStatus()
		 * @generated
		 */
		EEnum TELECOM_NODE_STATUS = eINSTANCE.getTelecomNodeStatus();

		/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see org.eclipse.symphony.addons.telecoms.impl.SymphonyTelecomToolsPackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();

	}

} //SymphonyTelecomToolsPackage