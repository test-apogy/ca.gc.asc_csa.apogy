/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Line Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage#getSimpleLineRangeScanner()
 * @model
 * @generated
 */
public interface SimpleLineRangeScanner extends LineRangeScanner {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that performs the acquisition of one scan.
	 * Upon successful completion of the scan acquisition,
	 * the scanData should be updated with the latest scan
	 * and the method should return true. If the acquisition
	 * fails to complete properly, false should be returned.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean acquireScan();

} // SimpleLineRangeScanner
