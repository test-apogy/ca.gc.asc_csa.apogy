/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.symphony;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.mobile_platform.symphony.SymphonyExampleMobilePlatformPackage
 * @generated
 */
public interface SymphonyExampleMobilePlatformFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyExampleMobilePlatformFactory eINSTANCE = org.eclipse.symphony.examples.mobile_platform.symphony.impl.SymphonyExampleMobilePlatformFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Mobile Platform Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Symphony System Api Adapter</em>'.
	 * @generated
	 */
	MobilePlatformSymphonySystemApiAdapter createMobilePlatformSymphonySystemApiAdapter();

		/**
	 * Returns a new object of class '<em>Mobile Platform Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Data</em>'.
	 * @generated
	 */
	MobilePlatformData createMobilePlatformData();

		/**
	 * Returns a new object of class '<em>Mobile Platform Symphony System Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform Symphony System Annotation</em>'.
	 * @generated
	 */
	MobilePlatformSymphonySystemAnnotation createMobilePlatformSymphonySystemAnnotation();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  SymphonyExampleMobilePlatformPackage getSymphonyExampleMobilePlatformPackage();

} //SymphonyExampleMobilePlatformFactory
