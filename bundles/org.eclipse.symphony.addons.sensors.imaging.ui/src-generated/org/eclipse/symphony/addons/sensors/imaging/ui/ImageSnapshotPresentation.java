/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.ui;

import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Snapshot Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionVisible <em>Image Projection Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionOnFOVVisible <em>Image Projection On FOV Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIPackage#getImageSnapshotPresentation()
 * @model
 * @generated
 */
public interface ImageSnapshotPresentation extends NodePresentation
{

  /**
	 * Returns the value of the '<em><b>Presentation Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presentation Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
	 * @see #setPresentationMode(MeshPresentationMode)
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIPackage#getImageSnapshotPresentation_PresentationMode()
	 * @model unique="false"
	 * @generated
	 */
  MeshPresentationMode getPresentationMode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getPresentationMode <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
	 * @see #getPresentationMode()
	 * @generated
	 */
  void setPresentationMode(MeshPresentationMode value);

  /**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(float)
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIPackage#getImageSnapshotPresentation_Transparency()
	 * @model unique="false"
	 * @generated
	 */
  float getTransparency();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
  void setTransparency(float value);

  /**
	 * Returns the value of the '<em><b>Image Projection Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Projection Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Projection Visible</em>' attribute.
	 * @see #setImageProjectionVisible(boolean)
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIPackage#getImageSnapshotPresentation_ImageProjectionVisible()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isImageProjectionVisible();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionVisible <em>Image Projection Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Projection Visible</em>' attribute.
	 * @see #isImageProjectionVisible()
	 * @generated
	 */
  void setImageProjectionVisible(boolean value);

		/**
	 * Returns the value of the '<em><b>Image Projection On FOV Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Projection On FOV Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Projection On FOV Visible</em>' attribute.
	 * @see #setImageProjectionOnFOVVisible(boolean)
	 * @see org.eclipse.symphony.addons.sensors.imaging.ui.MRTSensorsImagingUIPackage#getImageSnapshotPresentation_ImageProjectionOnFOVVisible()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isImageProjectionOnFOVVisible();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionOnFOVVisible <em>Image Projection On FOV Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Projection On FOV Visible</em>' attribute.
	 * @see #isImageProjectionOnFOVVisible()
	 * @generated
	 */
	void setImageProjectionOnFOVVisible(boolean value);
} // ImageSnapshotPresentation
