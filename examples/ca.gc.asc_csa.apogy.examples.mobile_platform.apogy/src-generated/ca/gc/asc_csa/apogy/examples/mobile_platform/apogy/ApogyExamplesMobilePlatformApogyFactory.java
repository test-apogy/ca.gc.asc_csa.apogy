/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.mobile_platform.apogy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.ApogyExamplesMobilePlatformApogyPackage
 * @generated
 */
public interface ApogyExamplesMobilePlatformApogyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesMobilePlatformApogyFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.mobile_platform.apogy.impl.ApogyExamplesMobilePlatformApogyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Mobile Platform Apogy System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Apogy System Api Adapter</em>'.
	 * @generated
	 */
	MobilePlatformApogySystemApiAdapter createMobilePlatformApogySystemApiAdapter();

		/**
	 * Returns a new object of class '<em>Mobile Platform Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Data</em>'.
	 * @generated
	 */
	MobilePlatformData createMobilePlatformData();

		/**
	 * Returns a new object of class '<em>Mobile Platform Apogy System Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Apogy System Annotation</em>'.
	 * @generated
	 */
	MobilePlatformApogySystemAnnotation createMobilePlatformApogySystemAnnotation();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesMobilePlatformApogyPackage getApogyExamplesMobilePlatformApogyPackage();

} //ApogyExamplesMobilePlatformApogyFactory
