/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.common.geometry.data3d.las.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonGeometryData3DLASFactoryImpl extends EFactoryImpl implements Symphony__CommonGeometryData3DLASFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonGeometryData3DLASFactory init() {
		try {
			Symphony__CommonGeometryData3DLASFactory theSymphony__CommonGeometryData3DLASFactory = (Symphony__CommonGeometryData3DLASFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonGeometryData3DLASPackage.eNS_URI);
			if (theSymphony__CommonGeometryData3DLASFactory != null) {
				return theSymphony__CommonGeometryData3DLASFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonGeometryData3DLASFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonGeometryData3DLASFactoryImpl() {
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
			case Symphony__CommonGeometryData3DLASPackage.LAS_HEADER: return createLASHeader();
			case Symphony__CommonGeometryData3DLASPackage.VARIABLE_LENGTH_RECORD: return createVariableLengthRecord();
			case Symphony__CommonGeometryData3DLASPackage.LAS_READER: return createLASReader();
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT: return createLASPoint();
			case Symphony__CommonGeometryData3DLASPackage.LAS_FACADE: return createLASFacade();
			case Symphony__CommonGeometryData3DLASPackage.LAS_WRITER: return createLASWriter();
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
			case Symphony__CommonGeometryData3DLASPackage.SCAN_DIRECTION:
				return createScanDirectionFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.EDGE_OF_FLIGHT_LINE:
				return createEdgeOfFlightLineFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.CHAR_ARRAY:
				return createCharArrayFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.LONG_ARRAY:
				return createLongArrayFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case Symphony__CommonGeometryData3DLASPackage.EXCEPTION:
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
			case Symphony__CommonGeometryData3DLASPackage.SCAN_DIRECTION:
				return convertScanDirectionToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.EDGE_OF_FLIGHT_LINE:
				return convertEdgeOfFlightLineToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.CHAR_ARRAY:
				return convertCharArrayToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.LONG_ARRAY:
				return convertLongArrayToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case Symphony__CommonGeometryData3DLASPackage.EXCEPTION:
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
	public LASHeader createLASHeader() {
		LASHeaderImpl lasHeader = new LASHeaderImpl();
		return lasHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableLengthRecord createVariableLengthRecord() {
		VariableLengthRecordImpl variableLengthRecord = new VariableLengthRecordImpl();
		return variableLengthRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASReader createLASReader() {
		LASReaderImpl lasReader = new LASReaderImpl();
		return lasReader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASPoint createLASPoint() {
		LASPointImpl lasPoint = new LASPointImpl();
		return lasPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASFacade createLASFacade() {
		LASFacadeImpl lasFacade = new LASFacadeImpl();
		return lasFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LASWriter createLASWriter() {
		LASWriterImpl lasWriter = new LASWriterImpl();
		return lasWriter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScanDirection createScanDirectionFromString(EDataType eDataType, String initialValue) {
		ScanDirection result = ScanDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScanDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeOfFlightLine createEdgeOfFlightLineFromString(EDataType eDataType, String initialValue) {
		EdgeOfFlightLine result = EdgeOfFlightLine.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEdgeOfFlightLineToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char[] createCharArrayFromString(EDataType eDataType, String initialValue) {
		return (char[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long[] createLongArrayFromString(EDataType eDataType, String initialValue) {
		return (long[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLongArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType, String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType, String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createOutputStreamFromString(EDataType eDataType, String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
	public Symphony__CommonGeometryData3DLASPackage getSymphony__CommonGeometryData3DLASPackage() {
		return (Symphony__CommonGeometryData3DLASPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonGeometryData3DLASPackage getPackage() {
		return Symphony__CommonGeometryData3DLASPackage.eINSTANCE;
	}

} //Symphony__CommonGeometryData3DLASFactoryImpl
