/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lidar.symphony;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.lidar.symphony.Symphony__ExamplesLidarSymphonyPackage
 * @generated
 */
public interface Symphony__ExamplesLidarSymphonyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__ExamplesLidarSymphonyFactory eINSTANCE = org.eclipse.symphony.examples.lidar.symphony.impl.Symphony__ExamplesLidarSymphonyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Lidar Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lidar Symphony System Api Adapter</em>'.
	 * @generated
	 */
	LidarSymphonySystemApiAdapter createLidarSymphonySystemApiAdapter();

		/**
	 * Returns a new object of class '<em>Lidar Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lidar Data</em>'.
	 * @generated
	 */
	LidarData createLidarData();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__ExamplesLidarSymphonyPackage getSymphony__ExamplesLidarSymphonyPackage();

} //Symphony__ExamplesLidarSymphonyFactory
