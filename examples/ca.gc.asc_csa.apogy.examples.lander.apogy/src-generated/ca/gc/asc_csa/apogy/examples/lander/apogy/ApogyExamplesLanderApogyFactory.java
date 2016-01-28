/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.lander.apogy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage
 * @generated
 */
public interface ApogyExamplesLanderApogyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesLanderApogyFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.lander.apogy.impl.ApogyExamplesLanderApogyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Lander Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Apogy System Api Adapter</em>'.
	 * @generated
	 */
  LanderApogySystemApiAdapter createLanderApogySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Lander Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lander Data</em>'.
	 * @generated
	 */
	LanderData createLanderData();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesLanderApogyPackage getApogyExamplesLanderApogyPackage();

} //ApogyExamplesLanderApogyFactory
