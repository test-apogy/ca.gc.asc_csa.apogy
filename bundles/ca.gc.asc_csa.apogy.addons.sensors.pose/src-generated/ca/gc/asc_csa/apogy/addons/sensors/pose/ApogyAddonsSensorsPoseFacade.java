/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage#getApogyAddonsSensorsPoseFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsSensorsPoseFacade extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" fileNameUnique="false"
	 * @generated
	 */
	CSVDataLogger createCSVDataLogger(String fileName);

} // ApogyAddonsSensorsPoseFacade
