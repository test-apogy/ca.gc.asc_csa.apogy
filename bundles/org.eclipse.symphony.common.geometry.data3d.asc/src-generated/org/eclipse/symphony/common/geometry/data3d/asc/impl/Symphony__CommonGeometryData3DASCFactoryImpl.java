/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.geometry.data3d.asc.ASC3DIO;
import org.eclipse.symphony.common.geometry.data3d.asc.ASCHeaderData;
import org.eclipse.symphony.common.geometry.data3d.asc.AltitudeMode;
import org.eclipse.symphony.common.geometry.data3d.asc.Coordinates2D;
import org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCFactory;
import org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryData3DASCFactoryImpl extends EFactoryImpl implements Symphony__CommonGeometryData3DASCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonGeometryData3DASCFactory init() {
		try {
			Symphony__CommonGeometryData3DASCFactory theSymphony__CommonGeometryData3DASCFactory = (Symphony__CommonGeometryData3DASCFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonGeometryData3DASCPackage.eNS_URI);
			if (theSymphony__CommonGeometryData3DASCFactory != null) {
				return theSymphony__CommonGeometryData3DASCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonGeometryData3DASCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData3DASCFactoryImpl() {
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
			case Symphony__CommonGeometryData3DASCPackage.ASC3DIO: return createASC3DIO();
			case Symphony__CommonGeometryData3DASCPackage.ASC_HEADER_DATA: return createASCHeaderData();
			case Symphony__CommonGeometryData3DASCPackage.COORDINATES2_D: return createCoordinates2D();
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
			case Symphony__CommonGeometryData3DASCPackage.ALTITUDE_MODE:
				return createAltitudeModeFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DASCPackage.EXCEPTION:
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
			case Symphony__CommonGeometryData3DASCPackage.ALTITUDE_MODE:
				return convertAltitudeModeToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DASCPackage.EXCEPTION:
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
	public Symphony__CommonGeometryData3DASCPackage getSymphony__CommonGeometryData3DASCPackage() {
		return (Symphony__CommonGeometryData3DASCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonGeometryData3DASCPackage getPackage() {
		return Symphony__CommonGeometryData3DASCPackage.eINSTANCE;
	}

} //Symphony__CommonGeometryData3DASCFactoryImpl
