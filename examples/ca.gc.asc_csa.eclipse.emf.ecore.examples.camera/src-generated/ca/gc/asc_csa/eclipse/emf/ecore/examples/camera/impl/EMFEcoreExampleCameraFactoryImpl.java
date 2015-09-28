/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.PTUCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleCameraFactoryImpl extends EFactoryImpl implements EMFEcoreExampleCameraFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFEcoreExampleCameraFactory init()
	{
		try {
			EMFEcoreExampleCameraFactory theEMFEcoreExampleCameraFactory = (EMFEcoreExampleCameraFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreExampleCameraPackage.eNS_URI);
			if (theEMFEcoreExampleCameraFactory != null) {
				return theEMFEcoreExampleCameraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreExampleCameraFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreExampleCameraFactoryImpl()
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
			case EMFEcoreExampleCameraPackage.CAMERA_STUB: return createCameraStub();
			case EMFEcoreExampleCameraPackage.CAMERA_SIMULATED: return createCameraSimulated();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_STUB: return createPTUCameraStub();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA_SIMULATED: return createPTUCameraSimulated();
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
			case EMFEcoreExampleCameraPackage.THROWABLE:
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
			case EMFEcoreExampleCameraPackage.THROWABLE:
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
	public EMFEcoreExampleCameraPackage getEMFEcoreExampleCameraPackage()
	{
		return (EMFEcoreExampleCameraPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFEcoreExampleCameraPackage getPackage()
	{
		return EMFEcoreExampleCameraPackage.eINSTANCE;
	}

} //EMFEcoreExampleCameraFactoryImpl
