/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Point2d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.FeatureOfInterestList;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.environment.AbstractMapLayer;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer;
import org.eclipse.symphony.core.environment.ImageMapLayerPresentation;
import org.eclipse.symphony.core.environment.Map;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.RectangularRegionProvider;
import org.eclipse.symphony.core.environment.SurfaceWorksite;
import org.eclipse.symphony.core.environment.ui.Activator;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIFacade;
import org.eclipse.symphony.core.environment.ui.MapAnnotation;
import org.eclipse.symphony.core.environment.ui.MapViewConfiguration;
import org.eclipse.symphony.core.environment.ui.MapViewConfigurationList;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.ToolsList;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Ui Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Symphony__CoreEnvironmentUIFacadeImpl extends MinimalEObjectImpl.Container implements Symphony__CoreEnvironmentUIFacade
{
	
	private static Symphony__CoreEnvironmentUIFacade instance = null;
	
	public static Symphony__CoreEnvironmentUIFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new Symphony__CoreEnvironmentUIFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Symphony__CoreEnvironmentUIFacadeImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Symphony__CoreEnvironmentUIPackage.Literals.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE;
	}

//  /**
//   * <!-- begin-user-doc -->
//   * <!-- end-user-doc -->
//   * @generated_NOT
//   */
//  public void getImageMapLayerPresentationExtent(ImageMapLayerPresentation imageMapLayerPresentation, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner)
//  {
//	  Symphony__CoreEnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(imageMapLayerPresentation.getImageMapLayer(), lowerLeftCorner, upperRightCorner);
//  }

//  /**
//   * <!-- begin-user-doc -->
//   * <!-- end-user-doc -->
//   * @generated_NOT
//   */
//  public void getImageMapLayerPresentationExtent(List<ImageMapLayerPresentation> imageMapLayerPresentations, Tuple3d lowerLeftCorner, Tuple3d upperRightCorner)
//  {	  
//	  List<ImageMapLayerPresentation> visibilePresentations = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);
//	  Symphony__CoreEnvironmentFacade.INSTANCE.getRectangularRegionImageExtent(visibilePresentations, lowerLeftCorner, upperRightCorner);
//  }

//  /**
//   * <!-- begin-user-doc -->
//   * <!-- end-user-doc -->
//   * @generated_NOT
//   */
//  public AbstractEImage getImageMapLayerPresentationImage(List<ImageMapLayerPresentation> imageMapLayerPresentations)
//  {
//	  AbstractEImage result = EImagesUtilities.INSTANCE.createTransparentImage(0, 0);
//	  
//	  // If there are layers to assemble.
//	  if(!imageMapLayerPresentations.isEmpty())
//	  {
//		  List<ImageMapLayerPresentation> visiblePresentations = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);		  		  
//		  result =  Symphony__CoreEnvironmentFacade.INSTANCE.createEImage(visiblePresentations);
//	  }
//	  	  
//	  return result;
//  }

//  /**
//   * <!-- begin-user-doc -->
//   * <!-- end-user-doc -->
//   * @generated_NOT
//   */
//  public ImageMapLayerPresentation getBestResolutionMapLayer(List<ImageMapLayerPresentation> imageMapLayerPresentations)
//  {
//	  List<ImageMapLayerPresentation> visibleLayers = getVisibleImageMapLayerPresentation(imageMapLayerPresentations);
//	  
//	  ImageMapLayerPresentation best = null;
//	  
//	  for(ImageMapLayerPresentation layer : visibleLayers)
//	  {
//		  if(layer != null && layer.getImageMapLayer() != null)
//		  {
//			  if(best == null || layer.getImageMapLayer().getResolution() < best.getImageMapLayer().getResolution())
//			  {
//				  best = layer;
//			  }
//		  }
//	  }
//	  
//	  return best;
//  }

//  /**
//   * <!-- begin-user-doc -->
//   * <!-- end-user-doc -->
//   * @generated_NOT
//   */
//  public List<ImageMapLayerPresentation> getVisibleImageMapLayerPresentation(List<ImageMapLayerPresentation> imageMapLayerPresentations)
//  {
//	  // Creates a list of the visible layers.
//	  List<ImageMapLayerPresentation> visibleLayers = new ArrayList<ImageMapLayerPresentation>();
//	  for(ImageMapLayerPresentation layer : imageMapLayerPresentations)
//	  {
//		  if(layer.isVisible() && layer.getImageMapLayer() != null)
//		  {
//			  visibleLayers.add(layer);
//		  }
//	  }
//	  
//	  return visibleLayers;
//  }

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<RectangularRegionProvider> getVisibleRectangularRegionProvider(MapViewConfiguration mapViewConfiguration) 
	{
		List<RectangularRegionProvider> results = new ArrayList<RectangularRegionProvider>();
		
		for(MapAnnotation annotation : mapViewConfiguration.getMapAnnotations())
		{
			if(annotation.isVisible())
			{
				if(annotation instanceof RectangularRegionProvider)
				{
					results.add((RectangularRegionProvider) annotation);
				}
			}
		}
		
		for(ImageMapLayerPresentation imlp : mapViewConfiguration.getMapLayers())
		{
			if(imlp.isVisible())
			{
				if(imlp instanceof RectangularRegionProvider)
				{
					results.add((RectangularRegionProvider) imlp);
				}
			}
		}
		
		return results;
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public AbstractEImage getImageMapLayerPresentationImage(MapViewConfiguration mapViewConfiguration, RectangularRegion mapViewExtent, int maximumImageSizePixels)
  {
	  AbstractEImage result = null;
	  	 
	  // Gets the image covered by the specified list of ImageMapLayerPresentation.	  
	  AbstractEImage mapImage = mapViewConfiguration.getMapImage();

	  // Computes the resolution of the MapViewConfiguration.
	  double horizontalResolution = (mapImage.getWidth() / mapViewConfiguration.getMapImageRectangularRegion().getXDimension());
	  double verticalResolution = (mapImage.getHeight() / mapViewConfiguration.getMapImageRectangularRegion().getYDimension());	
	  
	  // If the specified mapViewExtent is entirely covered by the MapViewConfiguration.
	  if(Symphony__CoreEnvironmentFacade.INSTANCE.fitsInside(mapViewExtent, mapViewConfiguration.getMapImageRectangularRegion()))
	  {		  		  
		  // Gets the sub image representing mapViewExtent within mapViewConfiguration.		  
		  double minX = mapViewExtent.getXMin();
		  double maxX = mapViewExtent.getXMax();
		  
		  double minY = mapViewExtent.getYMin();
		  double maxY = mapViewExtent.getYMax();
		  		  		  
		  int x = (int) Math.round((minX - mapViewConfiguration.getMapImageRectangularRegion().getXMin()) * horizontalResolution);									
		  int y = mapImage.getHeight() - (int) Math.round((maxY - mapViewConfiguration.getMapImageRectangularRegion().getYMin()) * verticalResolution);			
		  if(x < 0) x = 0;
		  if(y < 0) y = 0;			
		  int width  = (int) Math.round((maxX -minX) * horizontalResolution);
		  int height = (int) Math.round((maxY -minY) * verticalResolution);
		  
		  if(width <= 0) width = 1;
		  if(height <= 0) height = 1;
		  
		  try
		  {
			  // Gets the sub image that falls within the zoom rectangle.
			  result = EImagesUtilities.INSTANCE.getSubImage(mapImage, x, y, width, height);
			  
			  if(width * height > maximumImageSizePixels)
			  {
				  // Rescale the image.
				  double scaleFactor = Math.sqrt((double) maximumImageSizePixels / (mapImage.getWidth() * mapImage.getHeight()));				  				 				  
				  result = EImagesUtilities.INSTANCE.resize(result, scaleFactor);
			  }
		  }
		  catch(Throwable t)
		  {
			  Logger.INSTANCE.log(Activator.ID, this, "getImageMapLayerPresentationImage failed!", EventSeverity.ERROR, t);
			  t.printStackTrace();
		  }
	  }
	  else
	  {
		  // Finds the size of the image that covers the specified MapViewExtent.
		  int resultWidth = (int) Math.round(horizontalResolution * mapViewExtent.getXDimension());
		  int resultHeight = (int) Math.round(verticalResolution * mapViewExtent.getYDimension());
		  		  
		  if(resultWidth <= 0) resultWidth = 1;
		  if(resultHeight <= 0) resultHeight = 1;
		  
		  double scaleFactor = 1.0;
		  
		  // If the required size is too large, scale it.
		  if((resultWidth * resultHeight) > maximumImageSizePixels)
		  {
			  scaleFactor = Math.sqrt((double) maximumImageSizePixels / (resultWidth * resultHeight));
			  resultWidth = (int) Math.floor(scaleFactor * resultWidth);
			  resultHeight = (int) Math.floor(scaleFactor * resultHeight);	
			  
			  // Scales the mapImage.
			  mapImage = EImagesUtilities.INSTANCE.resize(mapImage, scaleFactor);
		  }
		  		  		  
		  // Creates an image of the needed size.
		  int red = (int) Math.floor(mapViewConfiguration.getBackgroundColor().getX() * 255);
		  int green = (int) Math.floor(mapViewConfiguration.getBackgroundColor().getX() * 255);
		  int blue = (int) Math.floor(mapViewConfiguration.getBackgroundColor().getX() * 255);
		  result = EImagesUtilities.INSTANCE.createUniformColorImage(resultWidth, resultHeight, red, green, blue, 255);
		  		 		  		  
		  // Computes how much the mapImage needs to be translated.
		  double xTranslation = mapViewConfiguration.getMapImageRectangularRegion().getXMin() - mapViewExtent.getXMin();
		  int widthTranslation = (int) Math.round((xTranslation) * horizontalResolution * scaleFactor);
		  
		  double yTranslation = mapViewExtent.getYMax() - mapViewConfiguration.getMapImageRectangularRegion().getYMax();
		  int heightTranslation = (int) Math.round(yTranslation * verticalResolution * scaleFactor);		  
		  
		  AffineTransform affineTransform = new AffineTransform();		  
		  affineTransform.translate(widthTranslation, heightTranslation);
		  		 		 
		  Graphics2D g = (Graphics2D) result.asBufferedImage().createGraphics();
		  g.drawImage(mapImage.asBufferedImage(), affineTransform, null);
		  g.dispose();			  		  
	  }
	  
	  return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getTrajectoryLength(XYSeries xySeries)
  {
	  double length  = 0.0;
	  if(xySeries != null && xySeries.getItemCount() > 1)
	  {
		  XYDataItem previousXYDataItem = xySeries.getDataItem(0);
		  XYDataItem currentXYDataItem = null;
		  for(int i = 1; i < xySeries.getItemCount(); i++)
		  {
			  currentXYDataItem = xySeries.getDataItem(i);
			  
			  Point2d p0 = new Point2d(previousXYDataItem.getXValue(), previousXYDataItem.getYValue());
			  Point2d p1 = new Point2d(currentXYDataItem.getXValue(), currentXYDataItem.getYValue());
			  
			  length += p1.distance(p0);
			  
			  previousXYDataItem = currentXYDataItem;
		  }
	  }
	  
	  return length;
  }

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getMapViewConfigurationIdentifier(MapViewConfiguration mapViewConfiguration) 
	{
		String identifier = null;
		
		if(mapViewConfiguration != null)
		{
			identifier = Symphony__CommonEMFFacade.INSTANCE.getID(mapViewConfiguration);
		}
		
		return identifier;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public MapViewConfiguration getActiveMapViewConfiguration(String identifier) 
	{
		MapViewConfiguration mapViewConfiguration = null;
		
		if(identifier != null)
		{			
			MapViewConfigurationList mapViewConfigurationList = getActiveMapViewConfigurationList();
			if(mapViewConfigurationList != null)
			{
				Iterator<MapViewConfiguration> it = mapViewConfigurationList.getMapViewConfigurations().iterator();
				while(mapViewConfiguration == null && it.hasNext())
				{
					MapViewConfiguration next = it.next();				
					if(getMapViewConfigurationIdentifier(next).compareTo(identifier) == 0)
					{
						mapViewConfiguration = next;
					}
				}
			}
		}		
		
		return mapViewConfiguration;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public MapViewConfigurationList getActiveMapViewConfigurationList() 
	{
		MapViewConfigurationList mapViewConfigurationList = null;
		
		InvocatorSession session = Symphony__CoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if(session != null)
		{
			ToolsList toolsList = session.getToolsList();
			if(toolsList != null)
			{
				Iterator<AbstractToolsListContainer> it = toolsList.getToolsListContainers().iterator();
				while(mapViewConfigurationList == null && it.hasNext())
				{
					AbstractToolsListContainer abstractToolsListContainer = it.next();
					if(abstractToolsListContainer instanceof MapViewConfigurationList)
					{
						mapViewConfigurationList = (MapViewConfigurationList) abstractToolsListContainer;
					}
				}
			}
		}
		
		return mapViewConfigurationList;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<FeatureOfInterestList> getFeatureOfInterestLists(InvocatorSession session) 
	{
		List<FeatureOfInterestList> featureOfInterestLists = new ArrayList<FeatureOfInterestList>();
		
		if(session != null && session.getEnvironment() instanceof SymphonyEnvironment)
		{
			SymphonyEnvironment se = (SymphonyEnvironment) session.getEnvironment();
			if(se.getActiveWorksite() instanceof SurfaceWorksite)
			{
				SurfaceWorksite surfaceWorksite = (SurfaceWorksite) se.getActiveWorksite();
				for(Map map : surfaceWorksite.getMapsList().getMaps())
				{
					for(AbstractMapLayer layer : map.getLayers())
					{
						if(layer instanceof FeaturesOfInterestMapLayer)
						{
							FeaturesOfInterestMapLayer featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer) layer;
							featureOfInterestLists.add(featuresOfInterestMapLayer.getFeatures());
						}
					}
				}
			}
		}
		
		return featureOfInterestLists;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case Symphony__CoreEnvironmentUIPackage.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE___GET_VISIBLE_RECTANGULAR_REGION_PROVIDER__MAPVIEWCONFIGURATION:
				return getVisibleRectangularRegionProvider((MapViewConfiguration)arguments.get(0));
			case Symphony__CoreEnvironmentUIPackage.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__MAPVIEWCONFIGURATION_RECTANGULARREGION_INT:
				return getImageMapLayerPresentationImage((MapViewConfiguration)arguments.get(0), (RectangularRegion)arguments.get(1), (Integer)arguments.get(2));
			case Symphony__CoreEnvironmentUIPackage.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE___GET_TRAJECTORY_LENGTH__XYSERIES:
				return getTrajectoryLength((XYSeries)arguments.get(0));
			case Symphony__CoreEnvironmentUIPackage.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE___GET_MAP_VIEW_CONFIGURATION_IDENTIFIER__MAPVIEWCONFIGURATION:
				return getMapViewConfigurationIdentifier((MapViewConfiguration)arguments.get(0));
			case Symphony__CoreEnvironmentUIPackage.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION__STRING:
				return getActiveMapViewConfiguration((String)arguments.get(0));
			case Symphony__CoreEnvironmentUIPackage.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION_LIST:
				return getActiveMapViewConfigurationList();
			case Symphony__CoreEnvironmentUIPackage.SYMPHONY_CORE_ENVIRONMENT_UI_FACADE___GET_FEATURE_OF_INTEREST_LISTS__INVOCATORSESSION:
				return getFeatureOfInterestLists((InvocatorSession)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Symphony__CoreEnvironmentUIFacadeImpl