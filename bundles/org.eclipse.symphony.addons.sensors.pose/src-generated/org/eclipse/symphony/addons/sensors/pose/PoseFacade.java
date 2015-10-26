/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.pose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage#getPoseFacade()
 * @model
 * @generated
 */
public interface PoseFacade extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" fileNameUnique="false"
	 * @generated
	 */
	CSVDataLogger createCSVDataLogger(String fileName);

} // PoseFacade
