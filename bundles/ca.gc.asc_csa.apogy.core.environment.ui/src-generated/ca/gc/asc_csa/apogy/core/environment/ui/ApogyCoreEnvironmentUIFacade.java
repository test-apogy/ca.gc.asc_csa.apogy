/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.ui;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestList;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIFacadeImpl;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import org.jfree.data.xy.XYSeries;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Ui Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#getApogyCoreEnvironmentUIFacade()
 * @model
 * @generated
 */
public interface ApogyCoreEnvironmentUIFacade extends EObject
{
  public static ApogyCoreEnvironmentUIFacade INSTANCE = ApogyCoreEnvironmentUIFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns an image representing the assembly of the specified list of ImageMapLayerPresentation.
	 * @param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.
	 * @return The image representing the specified list of ImageMapLayerPresentation.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.ui.List<ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider>" unique="false" many="false" mapViewConfigurationUnique="false"
	 * @generated
	 */
	List<RectangularRegionProvider> getVisibleRectangularRegionProvider(MapViewConfiguration mapViewConfiguration);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns an image representing the specified MapViewExtent using a specified MapViewConfiguration.
	 * If the MapViewExtent is larger than the area covered by the MapViewConfiguration, transparent pixels will be added.
	 * @param mapViewConfiguration The specified MapViewConfiguration.
	 * @param mapViewExtent The specified ground area to be covered.
	 * @param maximumImageSizePixels The maximum size, in pixel, of the generated image.
	 * @return The image representing the specified MapViewExtent.
	 * <!-- end-model-doc -->
	 * @model unique="false" mapViewConfigurationUnique="false" mapViewExtentUnique="false" maximumImageSizePixelsUnique="false"
	 * @generated
	 */
  AbstractEImage getImageMapLayerPresentationImage(MapViewConfiguration mapViewConfiguration, RectangularRegion mapViewExtent, int maximumImageSizePixels);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the length of a 2D trajectory.
	 * @param The XYSeries.
	 * @return The length of the trajectory represented in the XYSerie.
	 * <!-- end-model-doc -->
	 * @model unique="false" xySeriesDataType="ca.gc.asc_csa.apogy.core.environment.ui.XYSeries" xySeriesUnique="false"
	 * @generated
	 */
  double getTrajectoryLength(XYSeries xySeries);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the identifier associated with a given MapViewConfiguration.
	 * @param mapViewConfiguration The given MapViewConfiguration.
	 * @return The identifier, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" mapViewConfigurationUnique="false"
	 * @generated
	 */
	String getMapViewConfigurationIdentifier(MapViewConfiguration mapViewConfiguration);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the MapViewConfiguration (in the Active Session) with the specified identifier.
	 * @param identifier The MapViewConfiguration identifier.
	 * @return The MapViewConfiguration with the specified identifier, null if non is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" identifierUnique="false"
	 * @generated
	 */
	MapViewConfiguration getActiveMapViewConfiguration(String identifier);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the MapViewConfigurationList in the Active Session.
	 * @return The MapViewConfigurationList in the Active Session, null if none is found.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	MapViewConfigurationList getActiveMapViewConfigurationList();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.ui.List<ca.gc.asc_csa.apogy.core.FeatureOfInterestList>" unique="false" many="false" sessionUnique="false"
	 * @generated
	 */
	List<FeatureOfInterestList> getFeatureOfInterestLists(InvocatorSession session);

} // ApogyCoreEnvironmentUIFacade
