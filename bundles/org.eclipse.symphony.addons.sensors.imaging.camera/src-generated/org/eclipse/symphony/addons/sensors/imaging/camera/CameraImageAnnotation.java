/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Image Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation#isVisible <em>Visible</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getCameraImageAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface CameraImageAnnotation extends Named, Described {

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Whether or not the camera image annotation is visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getCameraImageAnnotation_Visible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called to dispose of the CameraImageAnnotation. This method should be overridden by sub-classes
	 * to release resources, unregister listeners, etc.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void dispose();
} // CameraImageAnnotation
