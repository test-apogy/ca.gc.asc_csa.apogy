/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.camera.util;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.symphony.core.PoseProvider;
import ca.gc.asc_csa.symphony.core.SymphonyInitializationData;
import ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.camera.CameraData;
import ca.gc.asc_csa.symphony.examples.camera.CameraSymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.camera.PTUCameraData;
import ca.gc.asc_csa.symphony.examples.camera.PTUCameraSymphonySystemApiAdapter;
import ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage
 * @generated
 */
public class SymphonyExampleCameraAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyExampleCameraPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleCameraAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyExampleCameraPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyExampleCameraSwitch<Adapter> modelSwitch =
    new SymphonyExampleCameraSwitch<Adapter>() {
			@Override
			public Adapter caseCameraSymphonySystemApiAdapter(CameraSymphonySystemApiAdapter object) {
				return createCameraSymphonySystemApiAdapterAdapter();
			}
			@Override
			public Adapter caseCameraData(CameraData object) {
				return createCameraDataAdapter();
			}
			@Override
			public Adapter casePTUCameraSymphonySystemApiAdapter(PTUCameraSymphonySystemApiAdapter object) {
				return createPTUCameraSymphonySystemApiAdapterAdapter();
			}
			@Override
			public Adapter casePTUCameraData(PTUCameraData object) {
				return createPTUCameraDataAdapter();
			}
			@Override
			public Adapter caseTypeApiAdapter(TypeApiAdapter object) {
				return createTypeApiAdapterAdapter();
			}
			@Override
			public Adapter casePoseProvider(PoseProvider object) {
				return createPoseProviderAdapter();
			}
			@Override
			public Adapter caseSymphonySystemApiAdapter(SymphonySystemApiAdapter object) {
				return createSymphonySystemApiAdapterAdapter();
			}
			@Override
			public Adapter caseAbstractInitializationData(AbstractInitializationData object) {
				return createAbstractInitializationDataAdapter();
			}
			@Override
			public Adapter caseInitializationData(InitializationData object) {
				return createInitializationDataAdapter();
			}
			@Override
			public Adapter caseSymphonyInitializationData(SymphonyInitializationData object) {
				return createSymphonyInitializationDataAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.examples.camera.CameraSymphonySystemApiAdapter <em>Camera Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.examples.camera.CameraSymphonySystemApiAdapter
	 * @generated
	 */
  public Adapter createCameraSymphonySystemApiAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.examples.camera.CameraData <em>Camera Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.examples.camera.CameraData
	 * @generated
	 */
  public Adapter createCameraDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.examples.camera.PTUCameraSymphonySystemApiAdapter <em>PTU Camera Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.examples.camera.PTUCameraSymphonySystemApiAdapter
	 * @generated
	 */
  public Adapter createPTUCameraSymphonySystemApiAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.examples.camera.PTUCameraData <em>PTU Camera Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.examples.camera.PTUCameraData
	 * @generated
	 */
  public Adapter createPTUCameraDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter <em>Type Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter
	 * @generated
	 */
	public Adapter createTypeApiAdapterAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.PoseProvider <em>Pose Provider</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.PoseProvider
	 * @generated
	 */
  public Adapter createPoseProviderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter <em>Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter
	 * @generated
	 */
  public Adapter createSymphonySystemApiAdapterAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData <em>Abstract Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData
	 * @generated
	 */
	public Adapter createAbstractInitializationDataAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData <em>Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData
	 * @generated
	 */
	public Adapter createInitializationDataAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.symphony.core.SymphonyInitializationData <em>Symphony Initialization Data</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyInitializationData
	 * @generated
	 */
  public Adapter createSymphonyInitializationDataAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //SymphonyExampleCameraAdapterFactory
