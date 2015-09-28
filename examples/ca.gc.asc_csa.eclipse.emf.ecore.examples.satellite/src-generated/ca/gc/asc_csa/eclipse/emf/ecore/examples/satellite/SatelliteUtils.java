/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite;

import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.impl.SatelliteUtilsImpl;
import java.util.Date;

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
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteUtils()
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
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.ImageOrder>" unique="false" imageOrdersDataType="ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.List<ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.ImageOrder>" imageOrdersUnique="false" imageOrdersMany="false"
	 * @generated
	 */
	SortedSet<ImageOrder> sortImageOrderByPriority(List<ImageOrder> imageOrders);

} // SatelliteUtils
