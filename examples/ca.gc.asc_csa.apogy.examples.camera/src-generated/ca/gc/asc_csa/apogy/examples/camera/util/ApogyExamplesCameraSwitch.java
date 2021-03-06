package ca.gc.asc_csa.apogy.examples.camera.util;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator;
import ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit;
import ca.gc.asc_csa.apogy.addons.sensors.Sensor;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.examples.camera.Camera;
import ca.gc.asc_csa.apogy.examples.camera.CameraSimulated;
import ca.gc.asc_csa.apogy.examples.camera.CameraStub;
import ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage;
import ca.gc.asc_csa.apogy.examples.camera.PTUCamera;
import ca.gc.asc_csa.apogy.examples.camera.PTUCameraSimulated;
import ca.gc.asc_csa.apogy.examples.camera.PTUCameraStub;

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
 * @see ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage
 * @generated
 */
public class ApogyExamplesCameraSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyExamplesCameraPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyExamplesCameraSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ApogyExamplesCameraPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case ApogyExamplesCameraPackage.CAMERA: {
				Camera camera = (Camera)theEObject;
				T result = caseCamera(camera);
				if (result == null) result = caseAbstractCamera(camera);
				if (result == null) result = caseZoomable(camera);
				if (result == null) result = caseSensor(camera);
				if (result == null) result = caseNamed(camera);
				if (result == null) result = caseAggregateGroupNode(camera);
				if (result == null) result = caseGroupNode(camera);
				if (result == null) result = caseNode(camera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesCameraPackage.CAMERA_STUB: {
				CameraStub cameraStub = (CameraStub)theEObject;
				T result = caseCameraStub(cameraStub);
				if (result == null) result = caseCamera(cameraStub);
				if (result == null) result = caseAbstractCamera(cameraStub);
				if (result == null) result = caseZoomable(cameraStub);
				if (result == null) result = caseSensor(cameraStub);
				if (result == null) result = caseNamed(cameraStub);
				if (result == null) result = caseAggregateGroupNode(cameraStub);
				if (result == null) result = caseGroupNode(cameraStub);
				if (result == null) result = caseNode(cameraStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesCameraPackage.CAMERA_SIMULATED: {
				CameraSimulated cameraSimulated = (CameraSimulated)theEObject;
				T result = caseCameraSimulated(cameraSimulated);
				if (result == null) result = caseCamera(cameraSimulated);
				if (result == null) result = caseAbstractCamera(cameraSimulated);
				if (result == null) result = caseZoomable(cameraSimulated);
				if (result == null) result = caseSensor(cameraSimulated);
				if (result == null) result = caseNamed(cameraSimulated);
				if (result == null) result = caseAggregateGroupNode(cameraSimulated);
				if (result == null) result = caseGroupNode(cameraSimulated);
				if (result == null) result = caseNode(cameraSimulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesCameraPackage.PTU_CAMERA: {
				PTUCamera ptuCamera = (PTUCamera)theEObject;
				T result = casePTUCamera(ptuCamera);
				if (result == null) result = caseCamera(ptuCamera);
				if (result == null) result = casePanTiltUnit(ptuCamera);
				if (result == null) result = caseAbstractCamera(ptuCamera);
				if (result == null) result = caseZoomable(ptuCamera);
				if (result == null) result = caseAbstractActuator(ptuCamera);
				if (result == null) result = caseSensor(ptuCamera);
				if (result == null) result = caseNamed(ptuCamera);
				if (result == null) result = caseAggregateGroupNode(ptuCamera);
				if (result == null) result = caseGroupNode(ptuCamera);
				if (result == null) result = caseNode(ptuCamera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB: {
				PTUCameraStub ptuCameraStub = (PTUCameraStub)theEObject;
				T result = casePTUCameraStub(ptuCameraStub);
				if (result == null) result = caseCameraStub(ptuCameraStub);
				if (result == null) result = casePTUCamera(ptuCameraStub);
				if (result == null) result = caseCamera(ptuCameraStub);
				if (result == null) result = casePanTiltUnit(ptuCameraStub);
				if (result == null) result = caseAbstractCamera(ptuCameraStub);
				if (result == null) result = caseZoomable(ptuCameraStub);
				if (result == null) result = caseAbstractActuator(ptuCameraStub);
				if (result == null) result = caseSensor(ptuCameraStub);
				if (result == null) result = caseNamed(ptuCameraStub);
				if (result == null) result = caseAggregateGroupNode(ptuCameraStub);
				if (result == null) result = caseGroupNode(ptuCameraStub);
				if (result == null) result = caseNode(ptuCameraStub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED: {
				PTUCameraSimulated ptuCameraSimulated = (PTUCameraSimulated)theEObject;
				T result = casePTUCameraSimulated(ptuCameraSimulated);
				if (result == null) result = caseCameraSimulated(ptuCameraSimulated);
				if (result == null) result = casePTUCamera(ptuCameraSimulated);
				if (result == null) result = caseCamera(ptuCameraSimulated);
				if (result == null) result = casePanTiltUnit(ptuCameraSimulated);
				if (result == null) result = caseAbstractCamera(ptuCameraSimulated);
				if (result == null) result = caseZoomable(ptuCameraSimulated);
				if (result == null) result = caseAbstractActuator(ptuCameraSimulated);
				if (result == null) result = caseSensor(ptuCameraSimulated);
				if (result == null) result = caseNamed(ptuCameraSimulated);
				if (result == null) result = caseAggregateGroupNode(ptuCameraSimulated);
				if (result == null) result = caseGroupNode(ptuCameraSimulated);
				if (result == null) result = caseNode(ptuCameraSimulated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCamera(Camera object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraStub(CameraStub object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraSimulated(CameraSimulated object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Camera</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractCamera(AbstractCamera object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Zoomable</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zoomable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseZoomable(Zoomable object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Actuator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Actuator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractActuator(AbstractActuator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Pan Tilt Unit</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pan Tilt Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePanTiltUnit(PanTiltUnit object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Camera</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePTUCamera(PTUCamera object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Camera Stub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Camera Stub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTUCameraStub(PTUCameraStub object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>PTU Camera Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PTU Camera Simulated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePTUCameraSimulated(PTUCameraSimulated object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupNode(GroupNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Group Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateGroupNode(AggregateGroupNode object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
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

} //ApogyExamplesCameraSwitch
