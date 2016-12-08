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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.environment.surface.impl.ApogySurfaceEnvironmentFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class providing utilities methods to create fully initialze object.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getApogySurfaceEnvironmentFacade()
 * @model
 * @generated
 */
public interface ApogySurfaceEnvironmentFacade extends EObject 
{
	
	public static ApogySurfaceEnvironmentFacade INSTANCE = ApogySurfaceEnvironmentFacadeImpl.getInstance();

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assembles a list of ImageMapLayer into a single eImage reference to the Worksite frame.
	 * Note that only X,Y and Rz are used in transformation applied between ImageMapLayer and the worksite
	 * origin.
	 * <!-- end-model-doc -->
	 * @model unique="false" rectangularRegionImagesDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<? extends ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage>" rectangularRegionImagesUnique="false" rectangularRegionImagesMany="false"
	 * @generated
	 */
	AbstractEImage createEImage(List<? extends RectangularRegionImage> rectangularRegionImages);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return a list containing the position of the 4 corners of the specified ImageMapLayer
	 * @param imageMapLayer The specified ImageMapLayer.
	 * @return List containing the position (in the worksite frame) of the four corners of the ImageMapLayer.
	 * The list contains : lowerLeftCorner, lowerRightCorner, upperRightCorner and upperLeftCorner.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.surface.List<ca.gc.asc_csa.apogy.common.math.Tuple3d>" unique="false" many="false" rectangularRegionUnique="false"
	 * @generated
	 */
	List<Tuple3d> getAbsoluteRectangularRegionCorners(RectangularRegion rectangularRegion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the ImageMapLayer with the highest resolution (minimum meters/pixel).
	 * @return The ImageMapLayer with the highest resolution (minimum meters/pixel)
	 * <!-- end-model-doc -->
	 * @model unique="false" rectangularRegionImagesDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<? extends ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage>" rectangularRegionImagesUnique="false" rectangularRegionImagesMany="false"
	 * @generated
	 */
	RectangularRegionImage getBestResolutionRectangularRegionImage(List<? extends RectangularRegionImage> rectangularRegionImages);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the lower left and upper right corners of a specified RectangularRegionProvider.
	 * @param rectangularRegionProvider The specified RectangularRegionProvider.
	 * @param lowerLeftCorner The Tuple3d were to put the lower left coordinates.
	 * @param upperRightCorner The Tuple3d were to put the upper right coordinates.
	 * <!-- end-model-doc -->
	 * @model rectangularRegionProviderUnique="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
	 * @generated
	 */
	void getRectangularRegionExtent(RectangularRegionProvider rectangularRegionProvider, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the lower left and upper right corners of a specified ImageMapLayer.
	 * @param imageMapLayer The specified ImageMapLayer.
	 * @param lowerLeftCorner The Tuple3d were to put the lower left coordinates.
	 * @param upperRightCorner The Tuple3d were to put the upper right coordinates.
	 * TODO DEPRECATE - REMOVE
	 * <!-- end-model-doc -->
	 * @model rectangularRegionImageUnique="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
	 * @generated
	 */
	void getRectangularRegionImageExtent(RectangularRegionImage rectangularRegionImage, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return  the lower left and upper right corners of the region spanned by a list of RectangularRegionProviders.
	 * @param rectangularRegionProviders The list of RectangularRegionProviders.
	 * @param lowerLeftCorner The Tuple3d were to put the lower left coordinates.
	 * @param upperRightCorner The Tuple3d were to put the upper right coordinates.
	 * <!-- end-model-doc -->
	 * @model rectangularRegionProvidersDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<? extends ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider>" rectangularRegionProvidersUnique="false" rectangularRegionProvidersMany="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
	 * @generated
	 */
	void getRectangularRegionExtent(List<? extends RectangularRegionProvider> rectangularRegionProviders, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return  the lower left and upper right corners of the region spanned by a list of a ImageMapLayer.
	 * @param The list of ImageMapLayer.
	 * @param lowerLeftCorner The Tuple3d were to put the lower left coordinates.
	 * @param upperRightCorner The Tuple3d were to put the upper right coordinates.
	 * TODO DEPRECATE - REMOVE
	 * <!-- end-model-doc -->
	 * @model rectangularRegionImagesDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<? extends ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionImage>" rectangularRegionImagesUnique="false" rectangularRegionImagesMany="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
	 * @generated
	 */
	void getRectangularRegionImageExtent(List<? extends RectangularRegionImage> rectangularRegionImages, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether rectangularRegionA fits entirely in rectangularRegionB.
	 * The current implementation does not take into account the Transform.
	 * @param rectangularRegionA The first RectangularRegion.
	 * @param rectangularRegionB The second RectangularRegion.
	 * @return True if rectangularRegionA fits in rectangularRegionB, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" rectangularRegionAUnique="false" rectangularRegionBUnique="false"
	 * @generated
	 */
	boolean fitsInside(RectangularRegion rectangularRegionA, RectangularRegion rectangularRegionB);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether two RectangularRegion intersects.
	 * reference frame.
	 * @param rectangularRegionA The first RectangularRegion.
	 * @param transformAToB The transformation (expressed as a 4x4 matrix that expresses region A into region B)
	 * @param rectangularRegionB The second RectangularRegion.
	 * @return True if rectangularRegionA intersects rectangularRegionB, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" rectangularRegionAUnique="false" rectangularRegionBUnique="false" transformAToBUnique="false"
	 * @generated
	 */
	boolean intersects(RectangularRegion rectangularRegionA, RectangularRegion rectangularRegionB, Matrix4x4 transformAToB);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imageMapLayerPresentationUnique="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
	 * @generated
	 */
	void getImageMapLayerPresentationExtent(ImageMapLayerPresentation imageMapLayerPresentation, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imageMapLayerPresentationsDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
	 * @generated
	 */
	void getImageMapLayerPresentationExtent(List<ImageMapLayerPresentation> imageMapLayerPresentations, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns an image representing the assembly of the specified list of ImageMapLayerPresentation.
	 * @param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.
	 * @return The image representing the specified list of ImageMapLayerPresentation.
	 * <!-- end-model-doc -->
	 * @model unique="false" imageMapLayerPresentationsDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false"
	 * @generated
	 */
	AbstractEImage getImageMapLayerPresentationImage(List<ImageMapLayerPresentation> imageMapLayerPresentations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the ImageMapLayerPresentation with the highest resolution (minimum meters/pixel).
	 * @return The ImageMapLayerPresentation with the highest resolution (minimum meters/pixel)
	 * <!-- end-model-doc -->
	 * @model unique="false" imageMapLayerPresentationsDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false"
	 * @generated
	 */
	ImageMapLayerPresentation getBestResolutionMapLayer(List<ImageMapLayerPresentation> imageMapLayerPresentations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of visible ImageMapLayerPresentation from"" a specified imageMapLayerPresentations.
	 * @param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.
	 * @return The list of visible ImageMapLayerPresentation.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.surface.List<ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation>" unique="false" many="false" imageMapLayerPresentationsDataType="ca.gc.asc_csa.apogy.core.environment.surface.List<ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false"
	 * @generated
	 */
	List<ImageMapLayerPresentation> getVisibleImageMapLayerPresentation(List<ImageMapLayerPresentation> imageMapLayerPresentations);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the RectangularVolumeRegion bounding a triangular mesh.
	 * @param mesh The triangular mesh.
	 * @return The RectangularVolumeRegion.
	 * <!-- end-model-doc -->
	 * @model unique="false" meshUnique="false"
	 * @generated
	 */
	RectangularVolumeRegion getRectangularVolumeRegion(CartesianTriangularMesh mesh);

} // ApogySurfaceEnvironmentFacade
