/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleLineRangeScanner.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Line Range Scanner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleLineRangeScanner()
 * @model
 * @generated
 */
public interface SimpleLineRangeScanner extends LineRangeScanner
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method that performs the acquisition of one scan. Upon successfull completion of the scan acquisition, the scanData should be updated with the latest scan and the method should return true. If the acquisition fails to complete preoberly, false should be returned.
	 * <!-- end-model-doc -->
	 * @model required="true"
	 * @generated
	 */
	boolean acquireScan();

} // SimpleLineRangeScanner
