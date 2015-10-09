/**
 * Canadian Space Agency 2007.
 *
 * $Id: CSVDataLoggerImpl.java,v 1.4.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.addons.sensors.pose.CSVDataLogger;
import org.eclipse.symphony.addons.sensors.pose.PosePackage;
import org.eclipse.symphony.common.geometry.data3d.Pose;

import com.csvreader.CsvWriter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>CSV Data Logger</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.pose.impl.CSVDataLoggerImpl#getOutputFile <em>Output File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSVDataLoggerImpl extends EObjectImpl implements CSVDataLogger {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

	/**
	 * The default value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected String outputFile = OUTPUT_FILE_EDEFAULT;

	private CsvWriter csvWriter;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CSVDataLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PosePackage.Literals.CSV_DATA_LOGGER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFile() {
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setOutputFile(String newOutputFile) {
		String oldOutputFile = outputFile;
		outputFile = newOutputFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PosePackage.CSV_DATA_LOGGER__OUTPUT_FILE, oldOutputFile,
					outputFile));

		if (csvWriter != null) {
			csvWriter.close();
			csvWriter = null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void logPose(Pose pose) throws IOException {
		double tx = pose.getX();
		double ty = pose.getY();
		double tz = pose.getZ();

		double rx = pose.getXRotation();
		double ry = pose.getYRotation();
		double rz = pose.getZRotation();

		long timeStamp = System.currentTimeMillis();

		String[] record = new String[] { timeStamp + "", tx + "", ty + "",
				tz + "", rx + "", ry + "", rz + "" };

		getCsvWriter().writeRecord(record);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PosePackage.CSV_DATA_LOGGER__OUTPUT_FILE:
				return getOutputFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PosePackage.CSV_DATA_LOGGER__OUTPUT_FILE:
				setOutputFile((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PosePackage.CSV_DATA_LOGGER__OUTPUT_FILE:
				setOutputFile(OUTPUT_FILE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PosePackage.CSV_DATA_LOGGER__OUTPUT_FILE:
				return OUTPUT_FILE_EDEFAULT == null ? outputFile != null : !OUTPUT_FILE_EDEFAULT.equals(outputFile);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PosePackage.CSV_DATA_LOGGER___LOG_POSE__POSE:
				try {
					logPose((Pose)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outputFile: ");
		result.append(outputFile);
		result.append(')');
		return result.toString();
	}

	private CsvWriter getCsvWriter() throws IOException {
		if (csvWriter == null) {
			csvWriter = new CsvWriter(getOutputFile());
			csvWriter.writeRecord(new String[] { "Time stamp", "tx", "ty",
					"tz", "rx", "ry", "rz" });
		}

		return csvWriter;

	}

	@Override
	protected void finalize() throws Throwable {
		if (csvWriter != null) {
			csvWriter.close();
		}
	}

} // CSVDataLoggerImpl
