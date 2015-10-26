/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms.impl;

import javax.vecmath.Color3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.telecoms.AntennaRadiationPatternImageMapLayer;
import org.eclipse.symphony.addons.telecoms.DipoleAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern;
import org.eclipse.symphony.addons.telecoms.IsotropicAntenna;
import org.eclipse.symphony.addons.telecoms.SimpleConicalRadiationPattern;
import org.eclipse.symphony.addons.telecoms.SimpleRectangularFrustumRadiationPattern;
import org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsFactory;
import org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage;
import org.eclipse.symphony.addons.telecoms.TelecomNode;
import org.eclipse.symphony.addons.telecoms.TelecomNodeStatus;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorTool;
import org.eclipse.symphony.addons.telecoms.TelecomStatusMonitorToolList;
import org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsTelecomsFactoryImpl extends EFactoryImpl implements Symphony__AddonsTelecomsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsTelecomsFactory init() {
		try {
			Symphony__AddonsTelecomsFactory theSymphony__AddonsTelecomsFactory = (Symphony__AddonsTelecomsFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsTelecomsPackage.eNS_URI);
			if (theSymphony__AddonsTelecomsFactory != null) {
				return theSymphony__AddonsTelecomsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsTelecomsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsTelecomsFactoryImpl() {
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
			case Symphony__AddonsTelecomsPackage.TELECOM_NODE: return createTelecomNode();
			case Symphony__AddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL: return createTelecomStatusMonitorTool();
			case Symphony__AddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST: return createTelecomStatusMonitorToolList();
			case Symphony__AddonsTelecomsPackage.ISOTROPIC_ANTENNA: return createIsotropicAntenna();
			case Symphony__AddonsTelecomsPackage.DIPOLE_ANTENNA_RADIATION_PATTERN: return createDipoleAntennaRadiationPattern();
			case Symphony__AddonsTelecomsPackage.HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN: return createHalfWaveDipoleAntennaRadiationPattern();
			case Symphony__AddonsTelecomsPackage.SIMPLE_CONICAL_RADIATION_PATTERN: return createSimpleConicalRadiationPattern();
			case Symphony__AddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN: return createSimpleRectangularFrustumRadiationPattern();
			case Symphony__AddonsTelecomsPackage.URL_BASED_ANTENNA_RADIATION_PATTERN: return createURlBasedAntennaRadiationPattern();
			case Symphony__AddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER: return createAntennaRadiationPatternImageMapLayer();
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
			case Symphony__AddonsTelecomsPackage.TELECOM_NODE_STATUS:
				return createTelecomNodeStatusFromString(eDataType, initialValue);
			case Symphony__AddonsTelecomsPackage.COLOR3F:
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
			case Symphony__AddonsTelecomsPackage.TELECOM_NODE_STATUS:
				return convertTelecomNodeStatusToString(eDataType, instanceValue);
			case Symphony__AddonsTelecomsPackage.COLOR3F:
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
	public Symphony__AddonsTelecomsPackage getSymphony__AddonsTelecomsPackage() {
		return (Symphony__AddonsTelecomsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsTelecomsPackage getPackage() {
		return Symphony__AddonsTelecomsPackage.eINSTANCE;
	}

} //Symphony__AddonsTelecomsFactoryImpl
