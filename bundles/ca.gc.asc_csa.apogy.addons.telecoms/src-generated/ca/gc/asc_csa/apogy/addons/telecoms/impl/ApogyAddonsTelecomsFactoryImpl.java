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

import javax.vecmath.Color3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.addons.telecoms.AntennaRadiationPatternImageMapLayer;
import ca.gc.asc_csa.apogy.addons.telecoms.DipoleAntennaRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.HalfWaveDipoleAntennaRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.IsotropicAntenna;
import ca.gc.asc_csa.apogy.addons.telecoms.SimpleConicalRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsFactory;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomNodeStatus;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList;
import ca.gc.asc_csa.apogy.addons.telecoms.URlBasedAntennaRadiationPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsTelecomsFactoryImpl extends EFactoryImpl implements ApogyAddonsTelecomsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsTelecomsFactory init() {
		try {
			ApogyAddonsTelecomsFactory theApogyAddonsTelecomsFactory = (ApogyAddonsTelecomsFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsTelecomsPackage.eNS_URI);
			if (theApogyAddonsTelecomsFactory != null) {
				return theApogyAddonsTelecomsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsTelecomsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsTelecomsFactoryImpl() {
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE: return createTelecomNode();
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL: return createTelecomStatusMonitorTool();
			case ApogyAddonsTelecomsPackage.TELECOM_STATUS_MONITOR_TOOL_LIST: return createTelecomStatusMonitorToolList();
			case ApogyAddonsTelecomsPackage.ISOTROPIC_ANTENNA: return createIsotropicAntenna();
			case ApogyAddonsTelecomsPackage.DIPOLE_ANTENNA_RADIATION_PATTERN: return createDipoleAntennaRadiationPattern();
			case ApogyAddonsTelecomsPackage.HALF_WAVE_DIPOLE_ANTENNA_RADIATION_PATTERN: return createHalfWaveDipoleAntennaRadiationPattern();
			case ApogyAddonsTelecomsPackage.SIMPLE_CONICAL_RADIATION_PATTERN: return createSimpleConicalRadiationPattern();
			case ApogyAddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN: return createSimpleRectangularFrustumRadiationPattern();
			case ApogyAddonsTelecomsPackage.URL_BASED_ANTENNA_RADIATION_PATTERN: return createURlBasedAntennaRadiationPattern();
			case ApogyAddonsTelecomsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER: return createAntennaRadiationPatternImageMapLayer();
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE_STATUS:
				return createTelecomNodeStatusFromString(eDataType, initialValue);
			case ApogyAddonsTelecomsPackage.COLOR3F:
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
			case ApogyAddonsTelecomsPackage.TELECOM_NODE_STATUS:
				return convertTelecomNodeStatusToString(eDataType, instanceValue);
			case ApogyAddonsTelecomsPackage.COLOR3F:
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
	public ApogyAddonsTelecomsPackage getApogyAddonsTelecomsPackage() {
		return (ApogyAddonsTelecomsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsTelecomsPackage getPackage() {
		return ApogyAddonsTelecomsPackage.eINSTANCE;
	}

} //ApogyAddonsTelecomsFactoryImpl
