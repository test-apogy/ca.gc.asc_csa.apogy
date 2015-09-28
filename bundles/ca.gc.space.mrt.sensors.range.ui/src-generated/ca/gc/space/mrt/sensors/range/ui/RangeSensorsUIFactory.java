/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.range.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIPackage
 * @generated
 */
public interface RangeSensorsUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RangeSensorsUIFactory eINSTANCE = ca.gc.space.mrt.sensors.range.ui.impl.RangeSensorsUIFactoryImpl.init();

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
	RangeSensorsUIPackage getRangeSensorsUIPackage();

} //RangeSensorsUIFactory
