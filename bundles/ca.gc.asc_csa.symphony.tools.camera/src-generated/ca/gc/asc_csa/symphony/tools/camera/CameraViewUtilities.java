/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.symphony.tools.camera.impl.CameraViewUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera View Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewUtilities()
 * @model
 * @generated
 */
public interface CameraViewUtilities extends EObject 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the identifier associated with a given CameraViewConfiguration.
	 * @param cameraViewConfiguration The given CameraViewConfiguration.
	 * @return The identifier, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" cameraViewConfigurationUnique="false"
	 * @generated
	 */
	String getCameraViewConfigurationIdentifier(CameraViewConfiguration cameraViewConfiguration);

	public static CameraViewUtilities INSTANCE = CameraViewUtilitiesImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the CameraViewConfiguration (in the Active Session) with the specified identifier.
	 * @param identifier The CameraViewConfiguration identifier.
	 * @return The CameraViewConfiguration with the specified identifier, null if non is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" identifierUnique="false"
	 * @generated
	 */
	CameraViewConfiguration getActiveCameraViewConfiguration(String identifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the CameraViewConfigurationList in the Active Session.
	 * @return The CameraViewConfigurationList in the Active Session, null if none is found.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	CameraViewConfigurationList getActiveCameraViewConfigurationList();

} // CameraViewUtilities
