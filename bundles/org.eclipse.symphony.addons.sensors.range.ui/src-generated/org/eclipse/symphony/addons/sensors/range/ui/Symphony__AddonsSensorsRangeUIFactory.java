/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage
 * @generated
 */
public interface Symphony__AddonsSensorsRangeUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsRangeUIFactory eINSTANCE = org.eclipse.symphony.addons.sensors.range.ui.impl.Symphony__AddonsSensorsRangeUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Raster Scan Data Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raster Scan Data Presentation</em>'.
	 * @generated
	 */
	RasterScanDataPresentation createRasterScanDataPresentation();

	/**
	 * Returns a new object of class '<em>Simple Sonar Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Sonar Presentation</em>'.
	 * @generated
	 */
	SimpleSonarPresentation createSimpleSonarPresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsSensorsRangeUIPackage getSymphony__AddonsSensorsRangeUIPackage();

} //Symphony__AddonsSensorsRangeUIFactory