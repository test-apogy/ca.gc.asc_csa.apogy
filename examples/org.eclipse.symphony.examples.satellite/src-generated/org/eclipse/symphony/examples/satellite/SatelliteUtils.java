/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.examples.satellite.impl.SatelliteUtilsImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Utils</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Utilities class for the Satellite example.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteUtils()
 * @model
 * @generated
 */
public interface SatelliteUtils extends EObject 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" satelliteUnique="false" startTimeUnique="false" rollAngleUnique="false"
	 * @generated
	 */
	SatelliteCommandRoll createSatelliteCommandRoll(Satellite satellite, Date startTime, double rollAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" satelliteUnique="false" imageTimeUnique="false" imageOrderUnique="false"
	 * @generated
	 */
	SatelliteCommandAcquireImage createSatelliteCommandAcquireImage(Satellite satellite, Date imageTime, ImageOrder imageOrder);

	public static SatelliteUtils INSTANCE = SatelliteUtilsImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.examples.satellite.SortedSet<org.eclipse.symphony.examples.satellite.ImageOrder>" unique="false" imageOrdersDataType="org.eclipse.symphony.examples.satellite.List<org.eclipse.symphony.examples.satellite.ImageOrder>" imageOrdersUnique="false" imageOrdersMany="false"
	 * @generated
	 */
	SortedSet<ImageOrder> sortImageOrderByPriority(List<ImageOrder> imageOrders);

} // SatelliteUtils
