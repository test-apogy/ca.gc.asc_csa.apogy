/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.core.ConnectionPoint;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.environment.impl.Symphony__CoreEnvironmentFacadeImpl;
import org.eclipse.symphony.core.invocator.Environment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class providing utilities methods to create fully initialze object.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getSymphony__CoreEnvironmentFacade()
 * @model
 * @generated
 */
public interface Symphony__CoreEnvironmentFacade extends EObject
{
	
	public static Symphony__CoreEnvironmentFacade INSTANCE = Symphony__CoreEnvironmentFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
  StarField createAndInitializeStars();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create an empty EarthSurfaceWorksite with the CSA Mars Yard coordinates.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  EarthSurfaceWorksite createAndInitializeDefaultCSAWorksite();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model skyUnique="false" skyNodeUnique="false"
	 * @generated
	 */
  void initializeSkyNode(Sky sky, SkyNode skyNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model earthSkyUnique="false" earthSkyNodeUnique="false"
	 * @generated
	 */
  void initializeEarthSkyNode(EarthSky earthSky, EarthSkyNode earthSkyNode);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  GeographicCoordinates getMarsYardGeographicalCoordinates();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" magnitudeUnique="false" rightAscensionUnique="false" declinationUnique="false"
	 * @generated
	 */
  Star createStar(float magnitude, double rightAscension, double declination);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  TransformNode getMarsYardTransformNode();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
  EarthSurfaceEnvironment createAndInitializeEarthSurfaceEnvironment();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a International Standard Atmosphere at sea level.
	 * @see http://en.wikipedia.org/wiki/International_Standard_Atmosphere
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  Atmosphere createAndInitializeEarthAtmosphere();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" symphonySystemUnique="false" nodeIDUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getSunVector(SymphonySystem symphonySystem, String nodeID, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getSunVector(Node node, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" symphonySystemUnique="false" nodeIDUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getMoonVector(SymphonySystem symphonySystem, String nodeID, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getMoonVector(Node node, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" nodeUnique="false" targetSymphonySystemUnique="false" connectionPointUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(Node node, SymphonySystem targetSymphonySystem, ConnectionPoint connectionPoint, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" sourceSymphonySystemUnique="false" nodeIDUnique="false" targetSymphonySystemUnique="false" connectionPointUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(SymphonySystem sourceSymphonySystem, String nodeID, SymphonySystem targetSymphonySystem, ConnectionPoint connectionPoint, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" sourceSymphonySystemUnique="false" nodeIDUnique="false" targetSymphonySystemUnique="false" connectionPointNameUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(SymphonySystem sourceSymphonySystem, String nodeID, SymphonySystem targetSymphonySystem, String connectionPointName, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" sourceSymphonySystemUnique="false" nodeIDUnique="false" targetSystemfullyQualifiedNameUnique="false" connectionPointNameUnique="false" environmentUnique="false"
	 * @generated
	 */
  Tuple3d getVector(SymphonySystem sourceSymphonySystem, String nodeID, String targetSystemfullyQualifiedName, String connectionPointName, Environment environment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assembles a list of ImageMapLayer into a single eImage reference to the Worksite frame.
	 * Note that only X,Y and Rz are used in transformation applied between ImageMapLayer and the worksite
	 * origin.
	 * <!-- end-model-doc -->
	 * @model unique="false" rectangularRegionImagesDataType="org.eclipse.symphony.core.environment.List<? extends org.eclipse.symphony.core.environment.RectangularRegionImage>" rectangularRegionImagesUnique="false" rectangularRegionImagesMany="false"
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
	 * @model dataType="org.eclipse.symphony.core.environment.List<org.eclipse.symphony.common.math.Tuple3d>" unique="false" many="false" rectangularRegionUnique="false"
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
	 * @model unique="false" rectangularRegionImagesDataType="org.eclipse.symphony.core.environment.List<? extends org.eclipse.symphony.core.environment.RectangularRegionImage>" rectangularRegionImagesUnique="false" rectangularRegionImagesMany="false"
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
	 * @model rectangularRegionProvidersDataType="org.eclipse.symphony.core.environment.List<? extends org.eclipse.symphony.core.environment.RectangularRegionProvider>" rectangularRegionProvidersUnique="false" rectangularRegionProvidersMany="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
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
	 * @model rectangularRegionImagesDataType="org.eclipse.symphony.core.environment.List<? extends org.eclipse.symphony.core.environment.RectangularRegionImage>" rectangularRegionImagesUnique="false" rectangularRegionImagesMany="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
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
	 * @model imageMapLayerPresentationsDataType="org.eclipse.symphony.core.environment.List<org.eclipse.symphony.core.environment.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false" lowerLeftCornerUnique="false" upperRightCornerUnique="false"
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
	 * @model unique="false" imageMapLayerPresentationsDataType="org.eclipse.symphony.core.environment.List<org.eclipse.symphony.core.environment.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false"
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
	 * @model unique="false" imageMapLayerPresentationsDataType="org.eclipse.symphony.core.environment.List<org.eclipse.symphony.core.environment.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false"
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
	 * @model dataType="org.eclipse.symphony.core.environment.List<org.eclipse.symphony.core.environment.ImageMapLayerPresentation>" unique="false" many="false" imageMapLayerPresentationsDataType="org.eclipse.symphony.core.environment.List<org.eclipse.symphony.core.environment.ImageMapLayerPresentation>" imageMapLayerPresentationsUnique="false" imageMapLayerPresentationsMany="false"
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

} // Symphony__CoreEnvironmentFacade
