/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera;

import java.util.List;

import org.eclipse.symphony.addons.AbstractTool;
import org.eclipse.symphony.core.invocator.VariableFeatureReference;

import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getCameraViewConfigurationList <em>Camera View Configuration List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getCamera <em>Camera</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageWidth <em>Image Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageHeight <em>Image Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageCount <em>Image Count</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#isDisplayRectifiedImage <em>Display Rectified Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getOverlayList <em>Overlay List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getToolList <em>Tool List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getFilterList <em>Filter List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#isImageAutoSaveEnable <em>Image Auto Save Enable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#isSaveImageWithOverlays <em>Save Image With Overlays</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageAutoSaveFolderPath <em>Image Auto Save Folder Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration()
 * @model
 * @generated
 */
public interface CameraViewConfiguration extends VariableFeatureReference, AbstractTool
{

  /**
	 * Returns the value of the '<em><b>Camera View Configuration List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfigurationList#getCameraViewConfigurations <em>Camera View Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The  CameraViewConfiguration containing this CameraViewConfiguration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera View Configuration List</em>' container reference.
	 * @see #setCameraViewConfigurationList(CameraViewConfigurationList)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_CameraViewConfigurationList()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraViewConfigurationList#getCameraViewConfigurations
	 * @model opposite="cameraViewConfigurations" transient="false"
	 * @generated
	 */
	CameraViewConfigurationList getCameraViewConfigurationList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getCameraViewConfigurationList <em>Camera View Configuration List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera View Configuration List</em>' container reference.
	 * @see #getCameraViewConfigurationList()
	 * @generated
	 */
	void setCameraViewConfigurationList(CameraViewConfigurationList value);

		/**
	 * Returns the value of the '<em><b>Camera</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The Camera being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera</em>' reference.
	 * @see #setCamera(AbstractCamera)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_Camera()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  AbstractCamera getCamera();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getCamera <em>Camera</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera</em>' reference.
	 * @see #getCamera()
	 * @generated
	 */
  void setCamera(AbstractCamera value);

  /**
	 * Returns the value of the '<em><b>Image Width</b></em>' attribute.
	 * The default value is <code>"640"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Width of the image being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Width</em>' attribute.
	 * @see #setImageWidth(int)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_ImageWidth()
	 * @model default="640" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_DISPLAY_SETTINGS'"
	 * @generated
	 */
  int getImageWidth();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageWidth <em>Image Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Width</em>' attribute.
	 * @see #getImageWidth()
	 * @generated
	 */
  void setImageWidth(int value);

  /**
	 * Returns the value of the '<em><b>Image Height</b></em>' attribute.
	 * The default value is <code>"480"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Height of the image being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Height</em>' attribute.
	 * @see #setImageHeight(int)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_ImageHeight()
	 * @model default="480" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_DISPLAY_SETTINGS'"
	 * @generated
	 */
  int getImageHeight();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageHeight <em>Image Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Height</em>' attribute.
	 * @see #getImageHeight()
	 * @generated
	 */
  void setImageHeight(int value);

  /**
	 * Returns the value of the '<em><b>Image Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of image received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Count</em>' attribute.
	 * @see #setImageCount(int)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_ImageCount()
	 * @model default="0" unique="false" transient="true"
	 * @generated
	 */
	int getImageCount();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageCount <em>Image Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Count</em>' attribute.
	 * @see #getImageCount()
	 * @generated
	 */
	void setImageCount(int value);

		/**
	 * Returns the value of the '<em><b>Display Rectified Image</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Rectified Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Whether or not to display the rectified image is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Rectified Image</em>' attribute.
	 * @see #setDisplayRectifiedImage(boolean)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_DisplayRectifiedImage()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_DISPLAY_SETTINGS'"
	 * @generated
	 */
  boolean isDisplayRectifiedImage();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#isDisplayRectifiedImage <em>Display Rectified Image</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Rectified Image</em>' attribute.
	 * @see #isDisplayRectifiedImage()
	 * @generated
	 */
  void setDisplayRectifiedImage(boolean value);

  /**
	 * Returns the value of the '<em><b>Overlay List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList#getCameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The list of overlay shown onto the camera image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overlay List</em>' containment reference.
	 * @see #setOverlayList(CameraOverlayList)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_OverlayList()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList#getCameraViewConfiguration
	 * @model opposite="cameraViewConfiguration" containment="true" required="true"
	 * @generated
	 */
  CameraOverlayList getOverlayList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getOverlayList <em>Overlay List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay List</em>' containment reference.
	 * @see #getOverlayList()
	 * @generated
	 */
  void setOverlayList(CameraOverlayList value);

  /**
	 * Returns the value of the '<em><b>Tool List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraToolList#getCameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The list of tools available for the camera.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tool List</em>' containment reference.
	 * @see #setToolList(CameraToolList)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_ToolList()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraToolList#getCameraViewConfiguration
	 * @model opposite="cameraViewConfiguration" containment="true" required="true"
	 * @generated
	 */
	CameraToolList getToolList();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getToolList <em>Tool List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool List</em>' containment reference.
	 * @see #getToolList()
	 * @generated
	 */
	void setToolList(CameraToolList value);

		/**
	 * Returns the value of the '<em><b>Filter List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.FilterList#getCameraViewConfiguration <em>Camera View Configuration</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The list of image filters to apply to the camera image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filter List</em>' containment reference.
	 * @see #setFilterList(FilterList)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_FilterList()
	 * @see ca.gc.asc_csa.symphony.tools.camera.FilterList#getCameraViewConfiguration
	 * @model opposite="cameraViewConfiguration" containment="true" required="true"
	 * @generated
	 */
  FilterList getFilterList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getFilterList <em>Filter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter List</em>' containment reference.
	 * @see #getFilterList()
	 * @generated
	 */
  void setFilterList(FilterList value);

		/**
	 * Returns the value of the '<em><b>Image Auto Save Enable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Whether or not to automatically save the image received.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Auto Save Enable</em>' attribute.
	 * @see #setImageAutoSaveEnable(boolean)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_ImageAutoSaveEnable()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_AUTOSAVE_SETTINGS'"
	 * @generated
	 */
	boolean isImageAutoSaveEnable();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#isImageAutoSaveEnable <em>Image Auto Save Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Auto Save Enable</em>' attribute.
	 * @see #isImageAutoSaveEnable()
	 * @generated
	 */
	void setImageAutoSaveEnable(boolean value);

		/**
	 * Returns the value of the '<em><b>Save Image With Overlays</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  If auto saving image, Whether or not to save the image with overlays.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Save Image With Overlays</em>' attribute.
	 * @see #setSaveImageWithOverlays(boolean)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_SaveImageWithOverlays()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_AUTOSAVE_SETTINGS'"
	 * @generated
	 */
	boolean isSaveImageWithOverlays();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#isSaveImageWithOverlays <em>Save Image With Overlays</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Save Image With Overlays</em>' attribute.
	 * @see #isSaveImageWithOverlays()
	 * @generated
	 */
	void setSaveImageWithOverlays(boolean value);

		/**
	 * Returns the value of the '<em><b>Image Auto Save Folder Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Path of the folder where to save images.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Auto Save Folder Path</em>' attribute.
	 * @see #setImageAutoSaveFolderPath(String)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraViewConfiguration_ImageAutoSaveFolderPath()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_AUTOSAVE_SETTINGS'"
	 * @generated
	 */
	String getImageAutoSaveFolderPath();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getImageAutoSaveFolderPath <em>Image Auto Save Folder Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Auto Save Folder Path</em>' attribute.
	 * @see #getImageAutoSaveFolderPath()
	 * @generated
	 */
	void setImageAutoSaveFolderPath(String value);

		/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera Image Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns the list of all  CameraImageAnnotation.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.symphony.tools.camera.List<ca.gc.asc_csa.symphony.tools.camera.CameraImageAnnotation>" unique="false" many="false"
	 * @generated
	 */
	List<CameraImageAnnotation> getCameraImageAnnotations();
} // CameraViewConfiguration
