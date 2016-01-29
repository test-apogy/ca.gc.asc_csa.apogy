/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.telecoms.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.telecoms.ui.ApogyAddonsTelecomsUIPackage
 * @generated
 */
public interface ApogyAddonsTelecomsUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsTelecomsUIFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.telecoms.ui.impl.ApogyAddonsTelecomsUIFactoryImpl.init();

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
	ApogyAddonsTelecomsUIPackage getApogyAddonsTelecomsUIPackage();

} //ApogyAddonsTelecomsUIFactory
