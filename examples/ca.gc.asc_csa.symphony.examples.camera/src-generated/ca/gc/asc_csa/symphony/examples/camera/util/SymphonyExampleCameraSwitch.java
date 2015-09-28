/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.camera.util;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InitializationData;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeApiAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage
 * @generated
 */
public class SymphonyExampleCameraSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyExampleCameraPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleCameraSwitch()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyExampleCameraPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case SymphonyExampleCameraPackage.CAMERA_SYMPHONY_SYSTEM_API_ADAPTER: {
				CameraSymphonySystemApiAdapter cameraSymphonySystemApiAdapter = (CameraSymphonySystemApiAdapter)theEObject;
				T result = caseCameraSymphonySystemApiAdapter(cameraSymphonySystemApiAdapter);
				if (result == null) result = caseSymphonySystemApiAdapter(cameraSymphonySystemApiAdapter);
				if (result == null) result = caseTypeApiAdapter(cameraSymphonySystemApiAdapter);
				if (result == null) result = casePoseProvider(cameraSymphonySystemApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyExampleCameraPackage.CAMERA_DATA: {
				CameraData cameraData = (CameraData)theEObject;
				T result = caseCameraData(cameraData);
				if (result == null) result = caseSymphonyInitializationData(cameraData);
				if (result == null) result = caseInitializationData(cameraData);
				if (result == null) result = caseAbstractInitializationData(cameraData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyExampleCameraPackage.PTU_CAMERA_SYMPHONY_SYSTEM_API_ADAPTER: {
				PTUCameraSymphonySystemApiAdapter ptuCameraSymphonySystemApiAdapter = (PTUCameraSymphonySystemApiAdapter)theEObject;
				T result = casePTUCameraSymphonySystemApiAdapter(ptuCameraSymphonySystemApiAdapter);
				if (result == null) result = caseSymphonySystemApiAdapter(ptuCameraSymphonySystemApiAdapter);
				if (result == null) result = caseTypeApiAdapter(ptuCameraSymphonySystemApiAdapter);
				if (result == null) result = casePoseProvider(ptuCameraSymphonySystemApiAdapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyExampleCameraPackage.PTU_CAMERA_DATA: {
				PTUCameraData ptuCameraData = (PTUCameraData)theEObject;
				T result = casePTUCameraData(ptuCameraData);
				if (result == null) result = caseCameraData(ptuCameraData);
				if (result == null) result = caseSymphonyInitializationData(ptuCameraData);
				if (result == null) result = caseInitializationData(ptuCameraData);
				if (result == null) result = caseAbstractInitializationData(ptuCameraData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Symphony System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCameraSymphonySystemApiAdapter(CameraSymphonySystemApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCameraData(CameraData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Camera Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Camera Symphony System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePTUCameraSymphonySystemApiAdapter(PTUCameraSymphonySystemApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Camera Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Camera Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePTUCameraData(PTUCameraData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeApiAdapter(TypeApiAdapter object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePoseProvider(PoseProvider object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony System Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony System Api Adapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonySystemApiAdapter(SymphonySystemApiAdapter object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInitializationData(AbstractInitializationData object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializationData(InitializationData object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Symphony Initialization Data</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symphony Initialization Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSymphonyInitializationData(SymphonyInitializationData object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //SymphonyExampleCameraSwitch
