/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.apogy.examples.camera.apogy.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData;
import ca.gc.asc_csa.apogy.examples.camera.apogy.CameraApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraData;
import ca.gc.asc_csa.apogy.examples.camera.apogy.PTUCameraApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyFactory;
import ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesCameraApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesCameraApogyFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static ApogyExamplesCameraApogyFactory init()
  {
		try {
			ApogyExamplesCameraApogyFactory theApogyExamplesCameraApogyFactory = (ApogyExamplesCameraApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesCameraApogyPackage.eNS_URI);
			if (theApogyExamplesCameraApogyFactory != null) {
				return theApogyExamplesCameraApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesCameraApogyFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesCameraApogyFactoryImpl()
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
			case ApogyExamplesCameraApogyPackage.CAMERA_APOGY_SYSTEM_API_ADAPTER: return createCameraApogySystemApiAdapter();
			case ApogyExamplesCameraApogyPackage.CAMERA_DATA: return createCameraData();
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_APOGY_SYSTEM_API_ADAPTER: return createPTUCameraApogySystemApiAdapter();
			case ApogyExamplesCameraApogyPackage.PTU_CAMERA_DATA: return createPTUCameraData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraApogySystemApiAdapter createCameraApogySystemApiAdapter()
  {
		CameraApogySystemApiAdapterImpl cameraApogySystemApiAdapter = new CameraApogySystemApiAdapterImpl();
		return cameraApogySystemApiAdapter;
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
  public PTUCameraApogySystemApiAdapter createPTUCameraApogySystemApiAdapter()
  {
		PTUCameraApogySystemApiAdapterImpl ptuCameraApogySystemApiAdapter = new PTUCameraApogySystemApiAdapterImpl();
		return ptuCameraApogySystemApiAdapter;
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
	public ApogyExamplesCameraApogyPackage getApogyExamplesCameraApogyPackage() {
		return (ApogyExamplesCameraApogyPackage)getEPackage();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static ApogyExamplesCameraApogyPackage getPackage()
  {
		return ApogyExamplesCameraApogyPackage.eINSTANCE;
	}

} //ApogyExamplesCameraApogyFactoryImpl
