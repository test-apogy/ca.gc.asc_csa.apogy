/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.imaging.AbstractCamera;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tool Tip Text Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getToolTipTextProvider()
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
