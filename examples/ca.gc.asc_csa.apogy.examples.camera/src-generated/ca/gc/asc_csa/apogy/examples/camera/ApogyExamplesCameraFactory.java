/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.examples.camera.Symphony__ExamplesCameraPackage
 * @generated
 */
public interface Symphony__ExamplesCameraFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__ExamplesCameraFactory eINSTANCE = org.eclipse.symphony.examples.camera.impl.Symphony__ExamplesCameraFactoryImpl.init();

	/**
	 * Returns a new Camera object, which has the same type as
	 * the given camera.
	 * 
	 * @param camera The camera with a particular implementation. 
	 * @return The new camera, which has the same type as the old one
	 * @generated_NOT
	 */
	Camera makeCameraSameType(Camera camera);
	
	/**
	 * Returns a new PTUCamera object, which has the same type as
	 * the given PTU camera.
	 * 
	 * @param ptuCamera The PTU camera with a particular implementation. 
	 * @return The new PTU camera, which has the same type as the old one.
	 * @generated_NOT
	 */
	PTUCamera makePTUCameraSameType(PTUCamera ptuCamera);
	
	/**
	 * Returns a new object of class '<em>Camera Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Stub</em>'.
	 * @generated
	 */
	CameraStub createCameraStub();

	/**
	 * Returns a new object of class '<em>Camera Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Simulated</em>'.
	 * @generated
	 */
	CameraSimulated createCameraSimulated();

	/**
	 * Returns a new object of class '<em>PTU Camera Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Stub</em>'.
	 * @generated
	 */
	PTUCameraStub createPTUCameraStub();

	/**
	 * Returns a new object of class '<em>PTU Camera Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PTU Camera Simulated</em>'.
	 * @generated
	 */
	PTUCameraSimulated createPTUCameraSimulated();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__ExamplesCameraPackage getSymphony__ExamplesCameraPackage();

} //Symphony__ExamplesCameraFactory
