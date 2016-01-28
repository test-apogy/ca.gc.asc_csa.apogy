/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.symphony.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.examples.camera.symphony.CameraData;
import org.eclipse.symphony.examples.camera.symphony.CameraSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.camera.symphony.PTUCameraData;
import org.eclipse.symphony.examples.camera.symphony.PTUCameraSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.camera.symphony.Symphony__ExamplesCameraSymphonyFactory;
import org.eclipse.symphony.examples.camera.symphony.Symphony__ExamplesCameraSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__ExamplesCameraSymphonyFactoryImpl extends EFactoryImpl implements Symphony__ExamplesCameraSymphonyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static Symphony__ExamplesCameraSymphonyFactory init()
  {
		try {
			Symphony__ExamplesCameraSymphonyFactory theSymphony__ExamplesCameraSymphonyFactory = (Symphony__ExamplesCameraSymphonyFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__ExamplesCameraSymphonyPackage.eNS_URI);
			if (theSymphony__ExamplesCameraSymphonyFactory != null) {
				return theSymphony__ExamplesCameraSymphonyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__ExamplesCameraSymphonyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Symphony__ExamplesCameraSymphonyFactoryImpl()
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
			case Symphony__ExamplesCameraSymphonyPackage.CAMERA_SYMPHONY_SYSTEM_API_ADAPTER: return createCameraSymphonySystemApiAdapter();
			case Symphony__ExamplesCameraSymphonyPackage.CAMERA_DATA: return createCameraData();
			case Symphony__ExamplesCameraSymphonyPackage.PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER: return createPTUCameraSymphonySystemApiAdapter();
			case Symphony__ExamplesCameraSymphonyPackage.PTU_CAMERA_DATA: return createPTUCameraData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraSymphonySystemApiAdapter createCameraSymphonySystemApiAdapter()
  {
		CameraSymphonySystemApiAdapterImpl cameraSymphonySystemApiAdapter = new CameraSymphonySystemApiAdapterImpl();
		return cameraSymphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraData createCameraData()
  {
		CameraDataImpl cameraData = new CameraDataImpl();
		return cameraData;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PTUCameraSymphonySystemApiAdapter createPTUCameraSymphonySystemApiAdapter()
  {
		PTUCameraSymphonySystemApiAdapterImpl ptuCameraSymphonySystemApiAdapter = new PTUCameraSymphonySystemApiAdapterImpl();
		return ptuCameraSymphonySystemApiAdapter;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PTUCameraData createPTUCameraData()
  {
		PTUCameraDataImpl ptuCameraData = new PTUCameraDataImpl();
		return ptuCameraData;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__ExamplesCameraSymphonyPackage getSymphony__ExamplesCameraSymphonyPackage() {
		return (Symphony__ExamplesCameraSymphonyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static Symphony__ExamplesCameraSymphonyPackage getPackage()
  {
		return Symphony__ExamplesCameraSymphonyPackage.eINSTANCE;
	}

} //Symphony__ExamplesCameraSymphonyFactoryImpl
