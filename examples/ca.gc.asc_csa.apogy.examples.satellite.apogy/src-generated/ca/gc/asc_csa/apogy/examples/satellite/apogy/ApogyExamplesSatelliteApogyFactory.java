/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package ca.gc.asc_csa.apogy.examples.satellite.apogy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage
 * @generated
 */
public interface ApogyExamplesSatelliteApogyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesSatelliteApogyFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ApogyExamplesSatelliteApogyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constellation System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation System Api Adapter</em>'.
	 * @generated
	 */
	ConstellationSystemApiAdapter createConstellationSystemApiAdapter();

	/**
	 * Returns a new object of class '<em>Constellation Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Data</em>'.
	 * @generated
	 */
	ConstellationData createConstellationData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesSatelliteApogyPackage getApogyExamplesSatelliteApogyPackage();

} //ApogyExamplesSatelliteApogyFactory
