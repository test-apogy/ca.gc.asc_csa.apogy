/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms.impl;

import ca.gc.asc_csa.symphony.tools.telecoms.*;

import javax.vecmath.Color3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyTelecomToolsFactoryImpl extends EFactoryImpl implements SymphonyTelecomToolsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymphonyTelecomToolsFactory init() {
		try {
			SymphonyTelecomToolsFactory theSymphonyTelecomToolsFactory = (SymphonyTelecomToolsFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyTelecomToolsPackage.eNS_URI);
			if (theSymphonyTelecomToolsFactory != null) {
				return theSymphonyTelecomToolsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyTelecomToolsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SymphonyTelecomToolsPackage.TELECOM_NODE: return createTelecomNode();
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL: return createTelecomStatusMonitorTool();
			case SymphonyTelecomToolsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST: return createTelecomStatusMonitorToolList();
			case SymphonyTelecomToolsPackage.ISOTROPIC_ANTENNA: return createIsotropicAntenna();
			case SymphonyTelecomToolsPackage.DIPOLE_ANTENNA_RADIATION_PATTERN: return createDipoleAntennaRadiationPattern();
			case SymphonyTelecomToolsPackage.HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN: return createHalfWaveDipoleAntennaRadiationPattern();
			case SymphonyTelecomToolsPackage.SIMPLE_CONICAL_RADIATION_PATTERN: return createSimpleConicalRadiationPattern();
			case SymphonyTelecomToolsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN: return createSimpleRectangularFrustumRadiationPattern();
			case SymphonyTelecomToolsPackage.URL_BASED_ANTENNA_RADIATION_PATTERN: return createURlBasedAntennaRadiationPattern();
			case SymphonyTelecomToolsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER: return createAntennaRadiationPatternImageMapLayer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SymphonyTelecomToolsPackage.TELECOM_NODE_STATUS:
				return createTelecomNodeStatusFromString(eDataType, initialValue);
			case SymphonyTelecomToolsPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SymphonyTelecomToolsPackage.TELECOM_NODE_STATUS:
				return convertTelecomNodeStatusToString(eDataType, instanceValue);
			case SymphonyTelecomToolsPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomNode createTelecomNode() {
		TelecomNodeImpl telecomNode = new TelecomNodeImpl();
		return telecomNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomStatusMonitorTool createTelecomStatusMonitorTool() {
		TelecomStatusMonitorToolImpl telecomStatusMonitorTool = new TelecomStatusMonitorToolImpl();
		return telecomStatusMonitorTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomStatusMonitorToolList createTelecomStatusMonitorToolList() {
		TelecomStatusMonitorToolListImpl telecomStatusMonitorToolList = new TelecomStatusMonitorToolListImpl();
		return telecomStatusMonitorToolList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsotropicAntenna createIsotropicAntenna() {
		IsotropicAntennaImpl isotropicAntenna = new IsotropicAntennaImpl();
		return isotropicAntenna;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DipoleAntennaRadiationPattern createDipoleAntennaRadiationPattern() {
		DipoleAntennaRadiationPatternImpl dipoleAntennaRadiationPattern = new DipoleAntennaRadiationPatternImpl();
		return dipoleAntennaRadiationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalfWaveDipoleAntennaRadiationPattern createHalfWaveDipoleAntennaRadiationPattern() {
		HalfWaveDipoleAntennaRadiationPatternImpl halfWaveDipoleAntennaRadiationPattern = new HalfWaveDipoleAntennaRadiationPatternImpl();
		return halfWaveDipoleAntennaRadiationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleConicalRadiationPattern createSimpleConicalRadiationPattern() {
		SimpleConicalRadiationPatternImpl simpleConicalRadiationPattern = new SimpleConicalRadiationPatternImpl();
		return simpleConicalRadiationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRectangularFrustumRadiationPattern createSimpleRectangularFrustumRadiationPattern() {
		SimpleRectangularFrustumRadiationPatternImpl simpleRectangularFrustumRadiationPattern = new SimpleRectangularFrustumRadiationPatternImpl();
		return simpleRectangularFrustumRadiationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URlBasedAntennaRadiationPattern createURlBasedAntennaRadiationPattern() {
		URlBasedAntennaRadiationPatternImpl uRlBasedAntennaRadiationPattern = new URlBasedAntennaRadiationPatternImpl();
		return uRlBasedAntennaRadiationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntennaRadiationPatternImageMapLayer createAntennaRadiationPatternImageMapLayer() {
		AntennaRadiationPatternImageMapLayerImpl antennaRadiationPatternImageMapLayer = new AntennaRadiationPatternImageMapLayerImpl();
		return antennaRadiationPatternImageMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomNodeStatus createTelecomNodeStatusFromString(EDataType eDataType, String initialValue) {
		TelecomNodeStatus result = TelecomNodeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelecomNodeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f createColor3fFromString(EDataType eDataType, String initialValue) {
		return (Color3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColor3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymphonyTelecomToolsPackage getSymphonyTelecomToolsPackage() {
		return (SymphonyTelecomToolsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymphonyTelecomToolsPackage getPackage() {
		return SymphonyTelecomToolsPackage.eINSTANCE;
	}

} //SymphonyTelecomToolsFactoryImpl
