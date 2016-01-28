/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.symphony;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.camera.symphony.Symphony__ExamplesCameraSymphonyPackage
 * @generated
 */
public interface Symphony__ExamplesCameraSymphonyFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__ExamplesCameraSymphonyFactory eINSTANCE = org.eclipse.symphony.examples.camera.symphony.impl.Symphony__ExamplesCameraSymphonyFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Camera Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Symphony System Api Adapter</em>'.
	 * @generated
	 */
  CameraSymphonySystemApiAdapter createCameraSymphonySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>Camera Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Data</em>'.
	 * @generated
	 */
  CameraData createCameraData();

  /**
	 * Returns a new object of class '<em>PTU Camera Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Symphony System Api Adapter</em>'.
	 * @generated
	 */
  PTUCameraSymphonySystemApiAdapter createPTUCameraSymphonySystemApiAdapter();

  /**
	 * Returns a new object of class '<em>PTU Camera Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Data</em>'.
	 * @generated
	 */
  PTUCameraData createPTUCameraData();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__ExamplesCameraSymphonyPackage getSymphony__ExamplesCameraSymphonyPackage();

} //Symphony__ExamplesCameraSymphonyFactory
