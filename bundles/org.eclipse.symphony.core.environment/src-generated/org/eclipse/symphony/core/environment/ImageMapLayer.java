/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.symphony.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Map Layer containing a 2D image.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#getImage <em>Image</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.ImageMapLayer#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getImageMapLayer()
 * @model
 * @generated
 */
public interface ImageMapLayer extends AbstractMapLayer, RectangularRegionImage
{
  /**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The width of the region covered by the map, in meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getImageMapLayer_Width()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='SIZE_AND_RESOLUTION' symphony_units='m'"
	 * @generated
	 */
  double getWidth();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
  void setWidth(double value);

  /**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The height of the region covered by the map, in meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getImageMapLayer_Height()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='SIZE_AND_RESOLUTION' symphony_units='m'"
	 * @generated
	 */
  double getHeight();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
  void setHeight(double value);

  /**
	 * Returns the value of the '<em><b>Opaque</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the map is opaque (i.e. cannot be superimposed on other ImageMapLayer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opaque</em>' attribute.
	 * @see #setOpaque(boolean)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getImageMapLayer_Opaque()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isOpaque();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#isOpaque <em>Opaque</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opaque</em>' attribute.
	 * @see #isOpaque()
	 * @generated
	 */
  void setOpaque(boolean value);

  /**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(AbstractEImage)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getImageMapLayer_Image()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGES'"
	 * @generated
	 */
  AbstractEImage getImage();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
  void setImage(AbstractEImage value);

  /**
	 * Returns the value of the '<em><b>Legend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An image containing the legend associated with the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legend</em>' containment reference.
	 * @see #setLegend(AbstractEImage)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getImageMapLayer_Legend()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGES'"
	 * @generated
	 */
  AbstractEImage getLegend();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.ImageMapLayer#getLegend <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' containment reference.
	 * @see #getLegend()
	 * @generated
	 */
  void setLegend(AbstractEImage value);

  /**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Map Layer Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the RectangularRegion represented by this ImageMapLayer.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	RectangularRegion getImageMapLayerRegion();

		/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resolution, in meters / pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getImageMapLayer_Resolution()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='SIZE_AND_RESOLUTION' symphony_units='m/pixel'"
	 * @generated
	 */
  double getResolution();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the image using the image parameters.
	 * <!-- end-model-doc -->
	 * @model progressMonitorDataType="org.eclipse.symphony.core.environment.IProgressMonitor" progressMonitorUnique="false"
	 * @generated
	 */
	void updateImage(IProgressMonitor progressMonitor);

} // ImageMapLayer
