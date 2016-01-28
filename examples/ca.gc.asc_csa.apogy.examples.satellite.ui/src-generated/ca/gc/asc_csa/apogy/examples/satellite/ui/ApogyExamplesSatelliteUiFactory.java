/**
 * Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiPackage
 * @generated
 */
public interface ApogyExamplesSatelliteUiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesSatelliteUiFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyExamplesSatelliteUiFacade createApogyExamplesSatelliteUiFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesSatelliteUiPackage getApogyExamplesSatelliteUiPackage();

} //ApogyExamplesSatelliteUiFactory
