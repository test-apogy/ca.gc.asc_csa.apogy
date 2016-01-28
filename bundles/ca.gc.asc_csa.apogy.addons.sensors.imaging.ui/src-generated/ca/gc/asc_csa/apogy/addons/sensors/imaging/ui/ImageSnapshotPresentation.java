/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Snapshot Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionVisible <em>Image Projection Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionOnFOVVisible <em>Image Projection On FOV Visible</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage#getImageSnapshotPresentation()
 * @model
 * @generated
 */
public interface ImageSnapshotPresentation extends NodePresentation
{

  /**
	 * Returns the value of the '<em><b>Presentation Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Presentation Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
	 * @see #setPresentationMode(MeshPresentationMode)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage#getImageSnapshotPresentation_PresentationMode()
	 * @model unique="false"
	 * @generated
	 */
  MeshPresentationMode getPresentationMode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#getPresentationMode <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage#getImageSnapshotPresentation_Transparency()
	 * @model unique="false"
	 * @generated
	 */
  float getTransparency();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#getTransparency <em>Transparency</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage#getImageSnapshotPresentation_ImageProjectionVisible()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isImageProjectionVisible();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionVisible <em>Image Projection Visible</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ApogyAddonsSensorsImagingUIPackage#getImageSnapshotPresentation_ImageProjectionOnFOVVisible()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isImageProjectionOnFOVVisible();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.ImageSnapshotPresentation#isImageProjectionOnFOVVisible <em>Image Projection On FOV Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Projection On FOV Visible</em>' attribute.
	 * @see #isImageProjectionOnFOVVisible()
	 * @generated
	 */
	void setImageProjectionOnFOVVisible(boolean value);
} // ImageSnapshotPresentation
