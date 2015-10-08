/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.space.topology.TopologyPackage;

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.addons.SymphonyToolsCorePackage;
import org.eclipse.symphony.addons.telecoms.AbstractAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer;
import org.eclipse.symphony.addons.telecoms.DipoleAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.IsotropicAntenna;
import org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern;
import org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern;
import org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsFactory;
import org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage;
import org.eclipse.symphony.addons.telecoms.TelecomNode;
import org.eclipse.symphony.addons.telecoms.TelecomNodeStatus;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList;
import org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyTelecomToolsPackageImpl extends EPackageImpl implements SymphonyTelecomToolsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telecomNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telecomStatusMonitorToolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass telecomStatusMonitorToolListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAntennaRadiationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isotropicAntennaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dipoleAntennaRadiationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass halfWaveDipoleAntennaRadiationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleConicalRadiationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRectangularFrustumRadiationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uRlBasedAntennaRadiationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass antennaRadiationPatternImageMapLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum telecomNodeStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.addons.telecoms.SymphonyTelecomToolsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SymphonyTelecomToolsPackageImpl() {
		super(eNS_URI, SymphonyTelecomToolsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SymphonyTelecomToolsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SymphonyTelecomToolsPackage init() {
		if (isInited) return (SymphonyTelecomToolsPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyTelecomToolsPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyTelecomToolsPackageImpl theSymphonyTelecomToolsPackage = (SymphonyTelecomToolsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyTelecomToolsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyTelecomToolsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SymphonyEnvironmentPackage.eINSTANCE.eClass();
		SymphonyToolsCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyTelecomToolsPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyTelecomToolsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyTelecomToolsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyTelecomToolsPackage.eNS_URI, theSymphonyTelecomToolsPackage);
		return theSymphonyTelecomToolsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelecomNode() {
		return telecomNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelecomNode_StatusMonitorTool() {
		return (EReference)telecomNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_Enabled() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_Name() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_Address() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_PacketsToSend() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_ConnectionTimeout() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_LatencyWarning() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_LatencyAlarm() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_PacketLossWarning() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_PacketLossAlarm() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_Latency() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_PacketLoss() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomNode_Status() {
		return (EAttribute)telecomNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelecomStatusMonitorTool() {
		return telecomStatusMonitorToolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelecomStatusMonitorTool_TelecomNodes() {
		return (EReference)telecomStatusMonitorToolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelecomStatusMonitorTool_StatusMonitorToolList() {
		return (EReference)telecomStatusMonitorToolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomStatusMonitorTool_Running() {
		return (EAttribute)telecomStatusMonitorToolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTelecomStatusMonitorTool_Disposed() {
		return (EAttribute)telecomStatusMonitorToolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTelecomStatusMonitorTool__Start() {
		return telecomStatusMonitorToolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTelecomStatusMonitorTool__Stop() {
		return telecomStatusMonitorToolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTelecomStatusMonitorTool__Dispose() {
		return telecomStatusMonitorToolEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTelecomStatusMonitorToolList() {
		return telecomStatusMonitorToolListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTelecomStatusMonitorToolList_TelecomStatusMonitors() {
		return (EReference)telecomStatusMonitorToolListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAntennaRadiationPattern() {
		return abstractAntennaRadiationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractAntennaRadiationPattern__ComputeGain__double_double() {
		return abstractAntennaRadiationPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsotropicAntenna() {
		return isotropicAntennaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDipoleAntennaRadiationPattern() {
		return dipoleAntennaRadiationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHalfWaveDipoleAntennaRadiationPattern() {
		return halfWaveDipoleAntennaRadiationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleConicalRadiationPattern() {
		return simpleConicalRadiationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleConicalRadiationPattern_ApexAngle() {
		return (EAttribute)simpleConicalRadiationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRectangularFrustumRadiationPattern() {
		return simpleRectangularFrustumRadiationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRectangularFrustumRadiationPattern_HorizontalFieldOfView() {
		return (EAttribute)simpleRectangularFrustumRadiationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRectangularFrustumRadiationPattern_VerticalFieldOfView() {
		return (EAttribute)simpleRectangularFrustumRadiationPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getURlBasedAntennaRadiationPattern() {
		return uRlBasedAntennaRadiationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getURlBasedAntennaRadiationPattern_Url() {
		return (EAttribute)uRlBasedAntennaRadiationPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAntennaRadiationPatternImageMapLayer() {
		return antennaRadiationPatternImageMapLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAntennaRadiationPatternImageMapLayer_AntennaRadiationPattern() {
		return (EReference)antennaRadiationPatternImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAntennaRadiationPatternImageMapLayer_SignalStrengthCutoff() {
		return (EAttribute)antennaRadiationPatternImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAntennaRadiationPatternImageMapLayer_BellowCutoffColor() {
		return (EAttribute)antennaRadiationPatternImageMapLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTelecomNodeStatus() {
		return telecomNodeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsFactory getSymphonyTelecomToolsFactory() {
		return (SymphonyTelecomToolsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		telecomNodeEClass = createEClass(TELECOM_NODE);
		createEReference(telecomNodeEClass, TELECOM_NODE__STATUS_MONITOR_TOOL);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__ENABLED);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__NAME);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__ADDRESS);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__PACKETS_TO_SEND);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__CONNECTION_TIMEOUT);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__LATENCY_WARNING);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__LATENCY_ALARM);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__PACKET_LOSS_WARNING);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__PACKET_LOSS_ALARM);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__LATENCY);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__PACKET_LOSS);
		createEAttribute(telecomNodeEClass, TELECOM_NODE__STATUS);

		telecomStatusMonitorToolEClass = createEClass(TELECOM_STATUS_MONITOR_TOOL);
		createEReference(telecomStatusMonitorToolEClass, TELECOM_STATUS_MONITOR_TOOL__TELECOM_NODES);
		createEReference(telecomStatusMonitorToolEClass, TELECOM_STATUS_MONITOR_TOOL__STATUS_MONITOR_TOOL_LIST);
		createEAttribute(telecomStatusMonitorToolEClass, TELECOM_STATUS_MONITOR_TOOL__RUNNING);
		createEAttribute(telecomStatusMonitorToolEClass, TELECOM_STATUS_MONITOR_TOOL__DISPOSED);
		createEOperation(telecomStatusMonitorToolEClass, TELECOM_STATUS_MONITOR_TOOL___START);
		createEOperation(telecomStatusMonitorToolEClass, TELECOM_STATUS_MONITOR_TOOL___STOP);
		createEOperation(telecomStatusMonitorToolEClass, TELECOM_STATUS_MONITOR_TOOL___DISPOSE);

		telecomStatusMonitorToolListEClass = createEClass(TELECOM_STATUS_MONITOR_TOOL_LIST);
		createEReference(telecomStatusMonitorToolListEClass, TELECOM_STATUS_MONITOR_TOOL_LIST__TELECOM_STATUS_MONITORS);

		abstractAntennaRadiationPatternEClass = createEClass(ABSTRACT_ANTENNA_RADIATION_PATTERN);
		createEOperation(abstractAntennaRadiationPatternEClass, ABSTRACT_ANTENNA_RADIATION_PATTERN___COMPUTE_GAIN__DOUBLE_DOUBLE);

		isotropicAntennaEClass = createEClass(ISOTROPIC_ANTENNA);

		dipoleAntennaRadiationPatternEClass = createEClass(DIPOLE_ANTENNA_RADIATION_PATTERN);

		halfWaveDipoleAntennaRadiationPatternEClass = createEClass(HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN);

		simpleConicalRadiationPatternEClass = createEClass(SIMPLE_CONICAL_RADIATION_PATTERN);
		createEAttribute(simpleConicalRadiationPatternEClass, SIMPLE_CONICAL_RADIATION_PATTERN__APEX_ANGLE);

		simpleRectangularFrustumRadiationPatternEClass = createEClass(SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN);
		createEAttribute(simpleRectangularFrustumRadiationPatternEClass, SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW);
		createEAttribute(simpleRectangularFrustumRadiationPatternEClass, SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW);

		uRlBasedAntennaRadiationPatternEClass = createEClass(URL_BASED_ANTENNA_RADIATION_PATTERN);
		createEAttribute(uRlBasedAntennaRadiationPatternEClass, URL_BASED_ANTENNA_RADIATION_PATTERN__URL);

		antennaRadiationPatternImageMapLayerEClass = createEClass(ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER);
		createEReference(antennaRadiationPatternImageMapLayerEClass, ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN);
		createEAttribute(antennaRadiationPatternImageMapLayerEClass, ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF);
		createEAttribute(antennaRadiationPatternImageMapLayerEClass, ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR);

		// Create enums
		telecomNodeStatusEEnum = createEEnum(TELECOM_NODE_STATUS);

		// Create data types
		color3fEDataType = createEDataType(COLOR3F);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		SymphonyToolsCorePackage theSymphonyToolsCorePackage = (SymphonyToolsCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyToolsCorePackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		SymphonyEnvironmentPackage theSymphonyEnvironmentPackage = (SymphonyEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEnvironmentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		telecomStatusMonitorToolListEClass.getESuperTypes().add(theSymphonyToolsCorePackage.getSimpleTool());
		abstractAntennaRadiationPatternEClass.getESuperTypes().add(theTopologyPackage.getNode());
		abstractAntennaRadiationPatternEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		isotropicAntennaEClass.getESuperTypes().add(this.getAbstractAntennaRadiationPattern());
		dipoleAntennaRadiationPatternEClass.getESuperTypes().add(this.getAbstractAntennaRadiationPattern());
		halfWaveDipoleAntennaRadiationPatternEClass.getESuperTypes().add(this.getAbstractAntennaRadiationPattern());
		simpleConicalRadiationPatternEClass.getESuperTypes().add(this.getAbstractAntennaRadiationPattern());
		simpleRectangularFrustumRadiationPatternEClass.getESuperTypes().add(this.getAbstractAntennaRadiationPattern());
		uRlBasedAntennaRadiationPatternEClass.getESuperTypes().add(this.getAbstractAntennaRadiationPattern());
		antennaRadiationPatternImageMapLayerEClass.getESuperTypes().add(theSymphonyEnvironmentPackage.getLineOfSightImageMapLayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(telecomNodeEClass, TelecomNode.class, "TelecomNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelecomNode_StatusMonitorTool(), this.getTelecomStatusMonitorTool(), this.getTelecomStatusMonitorTool_TelecomNodes(), "statusMonitorTool", null, 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_Name(), theEcorePackage.getEString(), "name", "", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_Address(), theEcorePackage.getEString(), "address", "localhost", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_PacketsToSend(), theEcorePackage.getEInt(), "packetsToSend", "1", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_ConnectionTimeout(), theEcorePackage.getEInt(), "connectionTimeout", "2000", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_LatencyWarning(), theEcorePackage.getEDouble(), "latencyWarning", "500.0", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_LatencyAlarm(), theEcorePackage.getEDouble(), "latencyAlarm", "1000.0", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_PacketLossWarning(), theEcorePackage.getEDouble(), "packetLossWarning", "20.0", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_PacketLossAlarm(), theEcorePackage.getEDouble(), "packetLossAlarm", "50.0", 0, 1, TelecomNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_Latency(), theEcorePackage.getEDouble(), "latency", "0.0", 0, 1, TelecomNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_PacketLoss(), theEcorePackage.getEDouble(), "packetLoss", "0.0", 0, 1, TelecomNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomNode_Status(), this.getTelecomNodeStatus(), "status", null, 0, 1, TelecomNode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(telecomStatusMonitorToolEClass, TelecomStatusMonitorTool.class, "TelecomStatusMonitorTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelecomStatusMonitorTool_TelecomNodes(), this.getTelecomNode(), this.getTelecomNode_StatusMonitorTool(), "telecomNodes", null, 0, -1, TelecomStatusMonitorTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTelecomStatusMonitorTool_StatusMonitorToolList(), this.getTelecomStatusMonitorToolList(), this.getTelecomStatusMonitorToolList_TelecomStatusMonitors(), "statusMonitorToolList", null, 0, 1, TelecomStatusMonitorTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomStatusMonitorTool_Running(), theEcorePackage.getEBoolean(), "running", "false", 0, 1, TelecomStatusMonitorTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTelecomStatusMonitorTool_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, TelecomStatusMonitorTool.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTelecomStatusMonitorTool__Start(), null, "start", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTelecomStatusMonitorTool__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTelecomStatusMonitorTool__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(telecomStatusMonitorToolListEClass, TelecomStatusMonitorToolList.class, "TelecomStatusMonitorToolList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTelecomStatusMonitorToolList_TelecomStatusMonitors(), this.getTelecomStatusMonitorTool(), this.getTelecomStatusMonitorTool_StatusMonitorToolList(), "telecomStatusMonitors", null, 0, -1, TelecomStatusMonitorToolList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAntennaRadiationPatternEClass, AbstractAntennaRadiationPattern.class, "AbstractAntennaRadiationPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAbstractAntennaRadiationPattern__ComputeGain__double_double(), theEcorePackage.getEDouble(), "computeGain", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "theta", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "phi", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(isotropicAntennaEClass, IsotropicAntenna.class, "IsotropicAntenna", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dipoleAntennaRadiationPatternEClass, DipoleAntennaRadiationPattern.class, "DipoleAntennaRadiationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(halfWaveDipoleAntennaRadiationPatternEClass, HalfWaveDipoleAntennaRadiationPattern.class, "HalfWaveDipoleAntennaRadiationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleConicalRadiationPatternEClass, SimpleConicalRadiationPattern.class, "SimpleConicalRadiationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleConicalRadiationPattern_ApexAngle(), theEcorePackage.getEDouble(), "apexAngle", "0.79", 0, 1, SimpleConicalRadiationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRectangularFrustumRadiationPatternEClass, SimpleRectangularFrustumRadiationPattern.class, "SimpleRectangularFrustumRadiationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleRectangularFrustumRadiationPattern_HorizontalFieldOfView(), theEcorePackage.getEDouble(), "horizontalFieldOfView", "0.79", 0, 1, SimpleRectangularFrustumRadiationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRectangularFrustumRadiationPattern_VerticalFieldOfView(), theEcorePackage.getEDouble(), "verticalFieldOfView", "1.57", 0, 1, SimpleRectangularFrustumRadiationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uRlBasedAntennaRadiationPatternEClass, URlBasedAntennaRadiationPattern.class, "URlBasedAntennaRadiationPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURlBasedAntennaRadiationPattern_Url(), theEcorePackage.getEString(), "url", null, 0, 1, URlBasedAntennaRadiationPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(antennaRadiationPatternImageMapLayerEClass, AntennaRadiationPatternImageMapLayer.class, "AntennaRadiationPatternImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAntennaRadiationPatternImageMapLayer_AntennaRadiationPattern(), this.getAbstractAntennaRadiationPattern(), null, "antennaRadiationPattern", null, 0, 1, AntennaRadiationPatternImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntennaRadiationPatternImageMapLayer_SignalStrengthCutoff(), theEcorePackage.getEDouble(), "signalStrengthCutoff", "-100.0", 0, 1, AntennaRadiationPatternImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAntennaRadiationPatternImageMapLayer_BellowCutoffColor(), this.getColor3f(), "bellowCutoffColor", null, 0, 1, AntennaRadiationPatternImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(telecomNodeStatusEEnum, TelecomNodeStatus.class, "TelecomNodeStatus");
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.NOT_STARTED);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.NOT_ENABLED);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.UNREACHABLE);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.NORMAL);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.PACKET_LOSS_WARNING);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.PACKET_LOSS_ALARM);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.LATENCY_WARNING);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.LATENCY_ALARM);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.BOTH_WARNING);
		addEEnumLiteral(telecomNodeStatusEEnum, TelecomNodeStatus.BOTH_ALARM);

		// Initialize data types
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "SymphonyTelecomTools",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)",
			 "modelName", "SymphonyTelecomTools",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.addons.telecoms/src-generated",
			 "editDirectory", "/org.eclipse.symphony.addons.telecoms.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.addons"
		   });	
		addAnnotation
		  (telecomNodeStatusEEnum, 
		   source, 
		   new String[] {
			 "documentation", " The different possible states of the TelecomNode"
		   });	
		addAnnotation
		  (telecomNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A node containing all the information required to attempt communication\nwith the desired network address, keeping track of the current latency,\npacket loss and overall state."
		   });	
		addAnnotation
		  (getTelecomNode_StatusMonitorTool(), 
		   source, 
		   new String[] {
			 "documentation", "The status monitor to which this node belongs"
		   });	
		addAnnotation
		  (getTelecomNode_Enabled(), 
		   source, 
		   new String[] {
			 "documentation", "Whether the network node is enabled, and thus, is actively\nreceiving updates.",
			 "propertyCategory", "Current Status",
			 "property", "Readonly",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_Name(), 
		   source, 
		   new String[] {
			 "documentation", "The current name of the telecom node",
			 "propertyCategory", "Connection Settings",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_Address(), 
		   source, 
		   new String[] {
			 "documentation", "The current address of the telecom node",
			 "propertyCategory", "Connection Settings",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_PacketsToSend(), 
		   source, 
		   new String[] {
			 "documentation", "The number of packets to send in each update requested (>= 1)",
			 "propertyCategory", "Connection Settings",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_ConnectionTimeout(), 
		   source, 
		   new String[] {
			 "documentation", "The time (in ms) to wait between waiting for a response and considering\na packet lost.",
			 "propertyCategory", "Connection Settings",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_LatencyWarning(), 
		   source, 
		   new String[] {
			 "documentation", "The point where packet latency (in ms) is becoming high (should be warned)",
			 "propertyCategory", "Warnings And Alarms",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_LatencyAlarm(), 
		   source, 
		   new String[] {
			 "documentation", "The point where packet latency (in ms) is so high as to be out of valid range (should be an alarm)",
			 "propertyCategory", "Warnings And Alarms",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_PacketLossWarning(), 
		   source, 
		   new String[] {
			 "documentation", "The point where packet loss (in %) is becoming high (should be warned)",
			 "propertyCategory", "Warnings And Alarms",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_PacketLossAlarm(), 
		   source, 
		   new String[] {
			 "documentation", "The point where packet loss (in %) is so high as to be out of valid range (should be an alarm)",
			 "propertyCategory", "Warnings And Alarms",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_Latency(), 
		   source, 
		   new String[] {
			 "documentation", "The current packet latency between this computer and the target address",
			 "propertyCategory", "Current Status",
			 "property", "Readonly",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_PacketLoss(), 
		   source, 
		   new String[] {
			 "documentation", "The current packet loss between this computer and the target address",
			 "propertyCategory", "Current Status",
			 "property", "Readonly",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomNode_Status(), 
		   source, 
		   new String[] {
			 "documentation", "The current status of the network node, as derived from the network\nnode\'s other state.",
			 "propertyCategory", "Current Status",
			 "property", "Readonly",
			 "notify", "true",
			 "children", "false",
			 "get", "<%org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool%> _statusMonitorTool = this.getStatusMonitorTool();\nboolean _isRunning = _statusMonitorTool.isRunning();\nboolean _equals = (_isRunning == false);\nif (_equals)\n{\n\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.NOT_STARTED;\n}\nelse\n{\n\tboolean _isEnabled = this.isEnabled();\n\tboolean _equals_1 = (_isEnabled == false);\n\tif (_equals_1)\n\t{\n\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.NOT_ENABLED;\n\t}\n\telse\n\t{\n\t\tdouble _packetLoss = this.getPacketLoss();\n\t\tboolean _greaterEqualsThan = (_packetLoss >= 100.0);\n\t\tif (_greaterEqualsThan)\n\t\t{\n\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.UNREACHABLE;\n\t\t}\n\t\telse\n\t\t{\n\t\t\tboolean _and = false;\n\t\t\tdouble _latency = this.getLatency();\n\t\t\tboolean _greaterEqualsThan_1 = (_latency >= 0);\n\t\t\tif (!_greaterEqualsThan_1)\n\t\t\t{\n\t\t\t\t_and = false;\n\t\t\t} else\n\t\t\t{\n\t\t\t\tdouble _latency_1 = this.getLatency();\n\t\t\t\tdouble _latencyWarning = this.getLatencyWarning();\n\t\t\t\tboolean _lessThan = (_latency_1 < _latencyWarning);\n\t\t\t\t_and = _lessThan;\n\t\t\t}\n\t\t\tif (_and)\n\t\t\t{\n\t\t\t\tdouble _packetLoss_1 = this.getPacketLoss();\n\t\t\t\tdouble _packetLossWarning = this.getPacketLossWarning();\n\t\t\t\tboolean _lessThan_1 = (_packetLoss_1 < _packetLossWarning);\n\t\t\t\tif (_lessThan_1)\n\t\t\t\t{\n\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.NORMAL;\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tboolean _and_1 = false;\n\t\t\t\t\tdouble _packetLoss_2 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_1 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _greaterEqualsThan_2 = (_packetLoss_2 >= _packetLossWarning_1);\n\t\t\t\t\tif (!_greaterEqualsThan_2)\n\t\t\t\t\t{\n\t\t\t\t\t\t_and_1 = false;\n\t\t\t\t\t} else\n\t\t\t\t\t{\n\t\t\t\t\t\tdouble _packetLoss_3 = this.getPacketLoss();\n\t\t\t\t\t\tdouble _packetLossAlarm = this.getPacketLossAlarm();\n\t\t\t\t\t\tboolean _lessThan_2 = (_packetLoss_3 < _packetLossAlarm);\n\t\t\t\t\t\t_and_1 = _lessThan_2;\n\t\t\t\t\t}\n\t\t\t\t\tif (_and_1)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.PACKET_LOSS_WARNING;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.PACKET_LOSS_ALARM;\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\telse\n\t\t\t{\n\t\t\t\tboolean _and_2 = false;\n\t\t\t\tdouble _latency_2 = this.getLatency();\n\t\t\t\tdouble _latencyWarning_1 = this.getLatencyWarning();\n\t\t\t\tboolean _greaterEqualsThan_3 = (_latency_2 >= _latencyWarning_1);\n\t\t\t\tif (!_greaterEqualsThan_3)\n\t\t\t\t{\n\t\t\t\t\t_and_2 = false;\n\t\t\t\t} else\n\t\t\t\t{\n\t\t\t\t\tdouble _latency_3 = this.getLatency();\n\t\t\t\t\tdouble _latencyAlarm = this.getLatencyAlarm();\n\t\t\t\t\tboolean _lessThan_3 = (_latency_3 < _latencyAlarm);\n\t\t\t\t\t_and_2 = _lessThan_3;\n\t\t\t\t}\n\t\t\t\tif (_and_2)\n\t\t\t\t{\n\t\t\t\t\tdouble _packetLoss_4 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_2 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _lessThan_4 = (_packetLoss_4 < _packetLossWarning_2);\n\t\t\t\t\tif (_lessThan_4)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.LATENCY_WARNING;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\tboolean _and_3 = false;\n\t\t\t\t\t\tdouble _packetLoss_5 = this.getPacketLoss();\n\t\t\t\t\t\tdouble _packetLossWarning_3 = this.getPacketLossWarning();\n\t\t\t\t\t\tboolean _greaterEqualsThan_4 = (_packetLoss_5 >= _packetLossWarning_3);\n\t\t\t\t\t\tif (!_greaterEqualsThan_4)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t_and_3 = false;\n\t\t\t\t\t\t} else\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\tdouble _packetLoss_6 = this.getPacketLoss();\n\t\t\t\t\t\t\tdouble _packetLossAlarm_1 = this.getPacketLossAlarm();\n\t\t\t\t\t\t\tboolean _lessThan_5 = (_packetLoss_6 < _packetLossAlarm_1);\n\t\t\t\t\t\t\t_and_3 = _lessThan_5;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (_and_3)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_WARNING;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t\telse\n\t\t\t\t{\n\t\t\t\t\tdouble _packetLoss_7 = this.getPacketLoss();\n\t\t\t\t\tdouble _packetLossWarning_4 = this.getPacketLossWarning();\n\t\t\t\t\tboolean _lessThan_6 = (_packetLoss_7 < _packetLossWarning_4);\n\t\t\t\t\tif (_lessThan_6)\n\t\t\t\t\t{\n\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.LATENCY_ALARM;\n\t\t\t\t\t}\n\t\t\t\t\telse\n\t\t\t\t\t{\n\t\t\t\t\t\tboolean _and_4 = false;\n\t\t\t\t\t\tdouble _packetLoss_8 = this.getPacketLoss();\n\t\t\t\t\t\tdouble _packetLossWarning_5 = this.getPacketLossWarning();\n\t\t\t\t\t\tboolean _greaterEqualsThan_5 = (_packetLoss_8 >= _packetLossWarning_5);\n\t\t\t\t\t\tif (!_greaterEqualsThan_5)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\t_and_4 = false;\n\t\t\t\t\t\t} else\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\tdouble _packetLoss_9 = this.getPacketLoss();\n\t\t\t\t\t\t\tdouble _packetLossAlarm_2 = this.getPacketLossAlarm();\n\t\t\t\t\t\t\tboolean _lessThan_7 = (_packetLoss_9 < _packetLossAlarm_2);\n\t\t\t\t\t\t\t_and_4 = _lessThan_7;\n\t\t\t\t\t\t}\n\t\t\t\t\t\tif (_and_4)\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t\telse\n\t\t\t\t\t\t{\n\t\t\t\t\t\t\treturn <%org.eclipse.symphony.addons.telecoms.TelecomNodeStatus%>.BOTH_ALARM;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t}\n}"
		   });	
		addAnnotation
		  (telecomStatusMonitorToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is used to keep track of all the relevant state for\na telecom status monitor tool."
		   });	
		addAnnotation
		  (getTelecomStatusMonitorTool__Start(), 
		   source, 
		   new String[] {
			 "documentation", "Operation used to start the telecom status monitor running."
		   });	
		addAnnotation
		  (getTelecomStatusMonitorTool__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "Operation used to stop the telecom status monitor."
		   });	
		addAnnotation
		  (getTelecomStatusMonitorTool__Dispose(), 
		   source, 
		   new String[] {
			 "documentation", "Operation used to dispose of the telecom status monitor\nwhen it is no longer needed"
		   });	
		addAnnotation
		  (getTelecomStatusMonitorTool_TelecomNodes(), 
		   source, 
		   new String[] {
			 "documentation", "All of the telecom nodes that are associated with the\nassociated with this status monitor tool"
		   });	
		addAnnotation
		  (getTelecomStatusMonitorTool_StatusMonitorToolList(), 
		   source, 
		   new String[] {
			 "documentation", "The list of telecom status monitors to which this particular monitor belongs"
		   });	
		addAnnotation
		  (getTelecomStatusMonitorTool_Running(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the telecom status monitor is currently running",
			 "property", "Readonly",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (getTelecomStatusMonitorTool_Disposed(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the telecom status monitor is currently disposed",
			 "property", "Readonly",
			 "notify", "true",
			 "children", "false"
		   });	
		addAnnotation
		  (telecomStatusMonitorToolListEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is used to keep track of the list of telecom status monitor\ntool."
		   });	
		addAnnotation
		  (getTelecomStatusMonitorToolList_TelecomStatusMonitors(), 
		   source, 
		   new String[] {
			 "documentation", "Used to keep track of all of the telecom status monitors"
		   });	
		addAnnotation
		  (abstractAntennaRadiationPatternEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract class defining a antenna radiation pattern, which is the directional (angular) dependence of\nthe strength of the radio waves from the antenna or other source."
		   });	
		addAnnotation
		  (getAbstractAntennaRadiationPattern__ComputeGain__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the gain of the antenna in the direction specified by a vector.\n@param theta The angle between the z axis and the direction vector, in radians.\n@param phi The angle between the x axis and the projection of the point in the x-y plane, in radians\n@return The gain, in dBi (decibels isotropic or dBi) associated with the radiation pattern in the specified direction.",
			 "csa_units", "dB"
		   });	
		addAnnotation
		  ((getAbstractAntennaRadiationPattern__ComputeGain__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getAbstractAntennaRadiationPattern__ComputeGain__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (isotropicAntennaEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that represent a theoretical antenna that acts as a point source of electromagnetic waves which radiates\nthe same intensity of radiation in all directions."
		   });	
		addAnnotation
		  (dipoleAntennaRadiationPatternEClass, 
		   source, 
		   new String[] {
			 "documentation", "Simple dipole antenna. The antenna axis is along the z-axis."
		   });	
		addAnnotation
		  (halfWaveDipoleAntennaRadiationPatternEClass, 
		   source, 
		   new String[] {
			 "documentation", "Simple half-wave dipole antenna. The antenna axis is along the z-axis."
		   });	
		addAnnotation
		  (simpleConicalRadiationPatternEClass, 
		   source, 
		   new String[] {
			 "documentation", "A simple radiation pattern defined as a rectangular frustum. Outside the frustum, gain is null."
		   });	
		addAnnotation
		  (getSimpleConicalRadiationPattern_ApexAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The apex angle of the cone. The cone is pointing toward +Z.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (simpleRectangularFrustumRadiationPatternEClass, 
		   source, 
		   new String[] {
			 "documentation", "A simple radiation pattern defined as a rectangular frustum. Outside the frustum, gain is null."
		   });	
		addAnnotation
		  (getSimpleRectangularFrustumRadiationPattern_HorizontalFieldOfView(), 
		   source, 
		   new String[] {
			 "documentation", "Horizontal field of view angle.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSimpleRectangularFrustumRadiationPattern_VerticalFieldOfView(), 
		   source, 
		   new String[] {
			 "documentation", "Vertical field of view angle.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (uRlBasedAntennaRadiationPatternEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines an antenna radiation pattern which actually pattern data is found in a URL."
		   });	
		addAnnotation
		  (getURlBasedAntennaRadiationPattern_Url(), 
		   source, 
		   new String[] {
			 "documentation", "The URL to the file containing the radiation pattern data.",
			 "propertyCategory", "URL"
		   });	
		addAnnotation
		  (getAntennaRadiationPatternImageMapLayer_AntennaRadiationPattern(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "ANTENNA"
		   });	
		addAnnotation
		  (getAntennaRadiationPatternImageMapLayer_SignalStrengthCutoff(), 
		   source, 
		   new String[] {
			 "documentation", "Cutoff signal strength under which no signal is usuable.",
			 "property", "Editable",
			 "propertyCategory", "CUTOFF_SETTINGS",
			 "csa_units", "dB"
		   });	
		addAnnotation
		  (getAntennaRadiationPatternImageMapLayer_BellowCutoffColor(), 
		   source, 
		   new String[] {
			 "documentation", "Color to use to mark line of sigh is available.",
			 "property", "Editable",
			 "propertyCategory", "CUTOFF_SETTINGS"
		   });
	}

} //SymphonyTelecomToolsPackageImpl
