/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.tools.telecoms.ui.SymphonyTelecomToolsUIPackage
 * @generated
 */
public interface SymphonyTelecomToolsUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymphonyTelecomToolsUIFactory eINSTANCE = ca.gc.asc_csa.symphony.tools.telecoms.ui.impl.SymphonyTelecomToolsUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Antenna Radiation Pattern Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Antenna Radiation Pattern Presentation</em>'.
	 * @generated
	 */
	AbstractAntennaRadiationPatternPresentation createAbstractAntennaRadiationPatternPresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SymphonyTelecomToolsUIPackage getSymphonyTelecomToolsUIPackage();

} //SymphonyTelecomToolsUIFactory
