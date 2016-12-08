/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.environment.surface;

import org.eclipse.core.runtime.IProgressMonitor;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

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
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getHeight <em>Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#isOpaque <em>Opaque</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getImage <em>Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getLegend <em>Legend</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getImageMapLayer()
 * @model
 * @generated
 */
public interface ImageMapLayer extends AbstractMapLayer, RectangularRegionImage {
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
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getImageMapLayer_Width()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='SIZE_AND_RESOLUTION' apogy_units='m'"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getWidth <em>Width</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getImageMapLayer_Height()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='SIZE_AND_RESOLUTION' apogy_units='m'"
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getHeight <em>Height</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getImageMapLayer_Opaque()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isOpaque();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#isOpaque <em>Opaque</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getImageMapLayer_Image()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGES'"
	 * @generated
	 */
	AbstractEImage getImage();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getImage <em>Image</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getImageMapLayer_Legend()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGES'"
	 * @generated
	 */
	AbstractEImage getLegend();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer#getLegend <em>Legend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' containment reference.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(AbstractEImage value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resolution, in meters / pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getImageMapLayer_Resolution()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='SIZE_AND_RESOLUTION' apogy_units='m/pixel'"
	 * @generated
	 */
	double getResolution();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update the image using the image parameters.
	 * <!-- end-model-doc -->
	 * @model progressMonitorDataType="ca.gc.asc_csa.apogy.core.environment.surface.IProgressMonitor" progressMonitorUnique="false"
	 * @generated
	 */
	void updateImage(IProgressMonitor progressMonitor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the RectangularRegion represented by this ImageMapLayer.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	RectangularRegion getImageMapLayerRegion();

} // ImageMapLayer
