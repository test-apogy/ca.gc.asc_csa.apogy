/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ui.ApogyAddonsSensorsRangeUIPackage
 * @generated
 */
public interface ApogyAddonsSensorsRangeUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsSensorsRangeUIFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.sensors.range.ui.impl.ApogyAddonsSensorsRangeUIFactoryImpl.init();

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
	ApogyAddonsSensorsRangeUIPackage getApogyAddonsSensorsRangeUIPackage();

} //ApogyAddonsSensorsRangeUIFactory
