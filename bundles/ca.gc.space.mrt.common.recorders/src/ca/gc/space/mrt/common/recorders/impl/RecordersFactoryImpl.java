/**
 * Canadian Space Agency 2007.
 *
 * $Id: RecordersFactoryImpl.java,v 1.2.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package ca.gc.space.mrt.common.recorders.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.common.recorders.CsvExporter;
import ca.gc.space.mrt.common.recorders.Recorder;
import ca.gc.space.mrt.common.recorders.RecorderStatus;
import ca.gc.space.mrt.common.recorders.RecordersFactory;
import ca.gc.space.mrt.common.recorders.RecordersPackage;
import ca.gc.space.mrt.common.recorders.Recordings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordersFactoryImpl extends EFactoryImpl implements RecordersFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecordersFactory init() {
		try {
			RecordersFactory theRecordersFactory = (RecordersFactory)EPackage.Registry.INSTANCE.getEFactory(RecordersPackage.eNS_URI);
			if (theRecordersFactory != null) {
				return theRecordersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RecordersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordersFactoryImpl() {
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
			case RecordersPackage.RECORDINGS: return createRecordings();
			case RecordersPackage.RECORDER: return createRecorder();
			case RecordersPackage.CSV_EXPORTER: return createCsvExporter();
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
			case RecordersPackage.RECORDER_STATUS:
				return createRecorderStatusFromString(eDataType, initialValue);
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
			case RecordersPackage.RECORDER_STATUS:
				return convertRecorderStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recordings createRecordings() {
		RecordingsImpl recordings = new RecordingsImpl();
		return recordings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recorder createRecorder() {
		RecorderImpl recorder = new RecorderImpl();
		return recorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvExporter createCsvExporter() {
		CsvExporterImpl csvExporter = new CsvExporterImpl();
		return csvExporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecorderStatus createRecorderStatusFromString(EDataType eDataType, String initialValue) {
		RecorderStatus result = RecorderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecorderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordersPackage getRecordersPackage() {
		return (RecordersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RecordersPackage getPackage() {
		return RecordersPackage.eINSTANCE;
	}

} //RecordersFactoryImpl
