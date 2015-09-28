/**
 * Canadian Space Agency 2007.
 *
 * $Id: RecordersSwitch.java,v 1.2.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package ca.gc.space.mrt.common.recorders.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.gc.space.mrt.common.processors.Monitorable;
import ca.gc.space.mrt.common.recorders.CsvExporter;
import ca.gc.space.mrt.common.recorders.Recorder;
import ca.gc.space.mrt.common.recorders.RecordersPackage;
import ca.gc.space.mrt.common.recorders.Recordings;
import ca.gc.space.mrt.common.recorders.RecordingsExporter;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.recorders.RecordersPackage
 * @generated
 */
public class RecordersSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RecordersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordersSwitch() {
		if (modelPackage == null) {
			modelPackage = RecordersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RecordersPackage.RECORDINGS: {
				Recordings recordings = (Recordings)theEObject;
				T result = caseRecordings(recordings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecordersPackage.RECORDER: {
				Recorder recorder = (Recorder)theEObject;
				T result = caseRecorder(recorder);
				if (result == null) result = caseMonitorable(recorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecordersPackage.RECORDINGS_EXPORTER: {
				RecordingsExporter recordingsExporter = (RecordingsExporter)theEObject;
				T result = caseRecordingsExporter(recordingsExporter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecordersPackage.CSV_EXPORTER: {
				CsvExporter csvExporter = (CsvExporter)theEObject;
				T result = caseCsvExporter(csvExporter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recordings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recordings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordings(Recordings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recorder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recorder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecorder(Recorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recordings Exporter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recordings Exporter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordingsExporter(RecordingsExporter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Csv Exporter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Csv Exporter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCsvExporter(CsvExporter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorable(Monitorable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RecordersSwitch
