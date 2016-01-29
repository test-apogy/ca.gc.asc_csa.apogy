/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Tip Text Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getToolTipTextProvider()
 * @model
 * @generated
 */
public interface ToolTipTextProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cameraUnique="false" imageSnapshotUnique="false" mouseButtonUnique="false" xUnique="false" yUnique="false"
	 * @generated
	 */
	String getToolTipText(AbstractCamera camera, ImageSnapshot imageSnapshot, int mouseButton, int x, int y);

} // ToolTipTextProvider
