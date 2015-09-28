/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.camera;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage
 * @generated
 */
public interface SymphonyExampleCameraFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  SymphonyExampleCameraFactory eINSTANCE = ca.gc.asc_csa.symphony.examples.camera.impl.SymphonyExampleCameraFactoryImpl.init();

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
  SymphonyExampleCameraPackage getSymphonyExampleCameraPackage();

} //SymphonyExampleCameraFactory
