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
import org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraFactory;
import org.eclipse.symphony.examples.camera.symphony.SymphonyExampleCameraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleCameraFactoryImpl extends EFactoryImpl implements SymphonyExampleCameraFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyExampleCameraFactory init()
  {
		try {
			SymphonyExampleCameraFactory theSymphonyExampleCameraFactory = (SymphonyExampleCameraFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyExampleCameraPackage.eNS_URI);
			if (theSymphonyExampleCameraFactory != null) {
				return theSymphonyExampleCameraFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyExampleCameraFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleCameraFactoryImpl()
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
			case SymphonyExampleCameraPackage.CAMERA_SYMPHONY_SYSTEM_API_ADAPTER: return createCameraSymphonySystemApiAdapter();
			case SymphonyExampleCameraPackage.CAMERA_DATA: return createCameraData();
			case SymphonyExampleCameraPackage.PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER: return createPTUCameraSymphonySystemApiAdapter();
			case SymphonyExampleCameraPackage.PTU_CAMERA_DATA: return createPTUCameraData();
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
  public SymphonyExampleCameraPackage getSymphonyExampleCameraPackage()
  {
		return (SymphonyExampleCameraPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyExampleCameraPackage getPackage()
  {
		return SymphonyExampleCameraPackage.eINSTANCE;
	}

} //SymphonyExampleCameraFactoryImpl
