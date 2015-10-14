/**
 * Canadian Space Agency 2007.
 *
 * $Id: CSVDataLoggerImpl.java,v 1.4.4.2 2015/05/21 15:51:31 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.impl;

import java.io.IOException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.pose.CSVDataLogger;
import org.eclipse.symphony.addons.sensors.pose.PosePackage;
import org.eclipse.symphony.common.geometry.data3d.Pose;

import com.csvreader.CsvWriter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>CSV Data Logger</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CSVDataLoggerImpl extends PoseDataLoggerImpl implements CSVDataLogger {
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
