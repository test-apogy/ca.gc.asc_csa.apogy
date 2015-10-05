/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.images.AbstractEImage;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.symphony.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.symphony.environment.RectangularRegion;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Configuration used for the Map View.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getMapLayers <em>Map Layers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getMapAnnotations <em>Map Annotations</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getDefaultRectangularRegion <em>Default Rectangular Region</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getMapImage <em>Map Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getMapImageRectangularRegion <em>Map Image Rectangular Region</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getExtent <em>Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration()
 * @model
 * @generated
 */
public interface MapViewConfiguration extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Map Layers</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.ImageMapLayerPresentation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * List of Maps being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Layers</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration_MapLayers()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
  EList<ImageMapLayerPresentation> getMapLayers();

  /**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * The default value is <code>"1.0,1.0,1.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Color of the map background.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(Color3f)
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration_BackgroundColor()
	 * @model default="1.0,1.0,1.0" unique="false" dataType="ca.gc.asc_csa.symphony.environment.ui.Color3f"
	 * @generated
	 */
  Color3f getBackgroundColor();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #getBackgroundColor()
	 * @generated
	 */
  void setBackgroundColor(Color3f value);

  /**
	 * Returns the value of the '<em><b>Map Annotations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.ui.MapAnnotation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * List of Symphony System instances being tracked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Annotations</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration_MapAnnotations()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
  EList<MapAnnotation> getMapAnnotations();

  /**
	 * Returns the value of the '<em><b>Default Rectangular Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Default region to use when none is covered by the map Layers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Rectangular Region</em>' reference.
	 * @see #setDefaultRectangularRegion(RectangularRegion)
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration_DefaultRectangularRegion()
	 * @model required="true" transient="true"
	 * @generated
	 */
	RectangularRegion getDefaultRectangularRegion();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getDefaultRectangularRegion <em>Default Rectangular Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Rectangular Region</em>' reference.
	 * @see #getDefaultRectangularRegion()
	 * @generated
	 */
	void setDefaultRectangularRegion(RectangularRegion value);

		/**
	 * Returns the value of the '<em><b>Map Image</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Image</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The image representing the active ImageMapLayers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Image</em>' reference.
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration_MapImage()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='None'"
	 * @generated
	 */
  AbstractEImage getMapImage();

  /**
	 * Returns the value of the '<em><b>Map Image Rectangular Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The rectangular region covered by the image layers defined in the map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Image Rectangular Region</em>' reference.
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration_MapImageRectangularRegion()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly'"
	 * @generated
	 */
	RectangularRegion getMapImageRectangularRegion();

		/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The rectangular region covered by the map (typically larger than mapImageRectangularRegion and contains mapImageRectangularRegion).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(RectangularRegion)
	 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage#getMapViewConfiguration_Extent()
	 * @model required="true" transient="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly'"
	 * @generated
	 */
	RectangularRegion getExtent();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(RectangularRegion value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Forces the updates of all derived values.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void forceUpdate();

} // MapViewConfiguration
