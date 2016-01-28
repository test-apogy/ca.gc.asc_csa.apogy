/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.camera.Camera;
import org.eclipse.symphony.examples.camera.CameraSimulated;
import org.eclipse.symphony.examples.camera.CameraStub;
import org.eclipse.symphony.examples.camera.Symphony__ExamplesCameraFactory;
import org.eclipse.symphony.examples.camera.Symphony__ExamplesCameraPackage;
import org.eclipse.symphony.examples.camera.PTUCamera;
import org.eclipse.symphony.examples.camera.PTUCameraSimulated;
import org.eclipse.symphony.examples.camera.PTUCameraStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesCameraFactoryImpl extends EFactoryImpl implements Symphony__ExamplesCameraFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__ExamplesCameraFactory init()
	{
		try {
			Symphony__ExamplesCameraFactory theSymphony__ExamplesCameraFactory = (Symphony__ExamplesCameraFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesCameraPackage.eNS_URI);
			if (theSymphony__ExamplesCameraFactory != null) {
				return theSymphony__ExamplesCameraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesCameraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesCameraFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case Symphony__ExamplesCameraPackage.CAMERA_STUB: return createCameraStub();
			case Symphony__ExamplesCameraPackage.CAMERA_SIMULATED: return createCameraSimulated();
			case Symphony__ExamplesCameraPackage.PTU_CAMERA_STUB: return createPTUCameraStub();
			case Symphony__ExamplesCameraPackage.PTU_CAMERA_SIMULATED: return createPTUCameraSimulated();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case Symphony__ExamplesCameraPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case Symphony__ExamplesCameraPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * Returns a new Camera object, which has the same type as
	 * the given camera.
	 * 
	 * @param camera The camera with a particular implementation. 
	 * @return The new camera, which has the same type as the old one
	 * @generated_NOT
	 */
	@Override
	public Camera makeCameraSameType(Camera camera)
	{
		// Keep track of the new camera instance
		Camera newCamera = null;
		
		// If the given camera instance is a simulated implementation
		if (camera instanceof CameraSimulated)
		{
			// Create a simulated instance
			newCamera = eINSTANCE.createCameraSimulated();
		}
		// Else if the given camera instance is a stub implementation
		else if (camera instanceof CameraStub)
		{
			// Create a stub instance
			newCamera = eINSTANCE.createCameraStub();
		}
		
		// Return the new camera instance
		return newCamera;
	}

	/**
	 * Returns a new PTUCamera object, which has the same type as
	 * the given PTU camera.
	 * 
	 * @param ptuCamera The PTU camera with a particular implementation. 
	 * @return The new PTU camera, which has the same type as the old one.
	 * @generated_NOT
	 */
	@Override
	public PTUCamera makePTUCameraSameType(PTUCamera ptuCamera)
	{
		// Keep track of the new PTU camera instance
		PTUCamera newPtuCamera = null;
		
		// If the given PTU camera instance is a simulated implementation
		if (ptuCamera instanceof PTUCameraSimulated)
		{
			// Create a simulated instance
			newPtuCamera = eINSTANCE.createPTUCameraSimulated();
		}
		// Else if the given PTU camera instance is a stub implementation
		else if (ptuCamera instanceof PTUCameraStub)
		{
			// Create a stub instance
			newPtuCamera = eINSTANCE.createPTUCameraStub();
		}
		
		// Return the new PTU camera instance
		return newPtuCamera;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraStub createCameraStub() {
		CameraStubImpl cameraStub = new CameraStubImpl();
		return cameraStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraSimulated createCameraSimulated() {
		CameraSimulatedImpl cameraSimulated = new CameraSimulatedImpl();
		return cameraSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCameraStub createPTUCameraStub() {
		PTUCameraStubImpl ptuCameraStub = new PTUCameraStubImpl();
		return ptuCameraStub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCameraSimulated createPTUCameraSimulated() {
		PTUCameraSimulatedImpl ptuCameraSimulated = new PTUCameraSimulatedImpl();
		return ptuCameraSimulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Throwable createThrowableFromString(EDataType eDataType, String initialValue)
	{
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThrowableToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesCameraPackage getSymphony__ExamplesCameraPackage() {
		return (Symphony__ExamplesCameraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__ExamplesCameraPackage getPackage()
	{
		return Symphony__ExamplesCameraPackage.eINSTANCE;
	}

} //Symphony__ExamplesCameraFactoryImpl
