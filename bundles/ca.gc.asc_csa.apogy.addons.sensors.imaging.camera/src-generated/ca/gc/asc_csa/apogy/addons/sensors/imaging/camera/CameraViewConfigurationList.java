/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfigurationList#getCameraViewConfigurations <em>Camera View Configurations</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getCameraViewConfigurationList()
 * @model
 * @generated
 */
public interface CameraViewConfigurationList extends AbstractToolsListContainer
{
  /**
	 * Returns the value of the '<em><b>Camera View Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration#getCameraViewConfigurationList <em>Camera View Configuration List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Camera View Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera View Configurations</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getCameraViewConfigurationList_CameraViewConfigurations()
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration#getCameraViewConfigurationList
	 * @model opposite="cameraViewConfigurationList" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  EList<CameraViewConfiguration> getCameraViewConfigurations();

} // CameraViewConfigurationList
