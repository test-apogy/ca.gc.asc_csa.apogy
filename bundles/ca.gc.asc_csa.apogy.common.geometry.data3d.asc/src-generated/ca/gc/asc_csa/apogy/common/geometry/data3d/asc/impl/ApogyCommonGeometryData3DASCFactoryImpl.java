package ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonGeometryData3DASCFactoryImpl extends EFactoryImpl implements ApogyCommonGeometryData3DASCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonGeometryData3DASCFactory init() {
		try {
			ApogyCommonGeometryData3DASCFactory theApogyCommonGeometryData3DASCFactory = (ApogyCommonGeometryData3DASCFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonGeometryData3DASCPackage.eNS_URI);
			if (theApogyCommonGeometryData3DASCFactory != null) {
				return theApogyCommonGeometryData3DASCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonGeometryData3DASCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DASCFactoryImpl() {
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
			case ApogyCommonGeometryData3DASCPackage.ASC3DIO: return createASC3DIO();
			case ApogyCommonGeometryData3DASCPackage.ASC_HEADER_DATA: return createASCHeaderData();
			case ApogyCommonGeometryData3DASCPackage.COORDINATES2_D: return createCoordinates2D();
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
			case ApogyCommonGeometryData3DASCPackage.ALTITUDE_MODE:
				return createAltitudeModeFromString(eDataType, initialValue);
			case ApogyCommonGeometryData3DASCPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
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
			case ApogyCommonGeometryData3DASCPackage.ALTITUDE_MODE:
				return convertAltitudeModeToString(eDataType, instanceValue);
			case ApogyCommonGeometryData3DASCPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASC3DIO createASC3DIO() {
		ASC3DIOImpl asc3DIO = new ASC3DIOImpl();
		return asc3DIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASCHeaderData createASCHeaderData() {
		ASCHeaderDataImpl ascHeaderData = new ASCHeaderDataImpl();
		return ascHeaderData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinates2D createCoordinates2D() {
		Coordinates2DImpl coordinates2D = new Coordinates2DImpl();
		return coordinates2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeMode createAltitudeModeFromString(EDataType eDataType, String initialValue) {
		AltitudeMode result = AltitudeMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltitudeModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DASCPackage getApogyCommonGeometryData3DASCPackage() {
		return (ApogyCommonGeometryData3DASCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonGeometryData3DASCPackage getPackage() {
		return ApogyCommonGeometryData3DASCPackage.eINSTANCE;
	}

} //ApogyCommonGeometryData3DASCFactoryImpl
