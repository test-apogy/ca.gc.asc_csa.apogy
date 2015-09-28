package ca.gc.asc_csa.symphony.environment.ui.listeners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.symphony.environment.ImageMapLayer;
import ca.gc.asc_csa.symphony.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;

public class MapViewConfigurationListener 
{
	private List<EObject> observedEObjects = new ArrayList<EObject>();
	private Adapter adapter;
	private MapViewConfiguration mapViewConfiguration;
	
	public MapViewConfigurationListener(MapViewConfiguration newCameraViewConfiguration)
	{
		setMapViewConfiguration(newCameraViewConfiguration);
	}

	public MapViewConfiguration getCameraViewConfiguration() 
	{
		return mapViewConfiguration;
	}

	public void setMapViewConfiguration(MapViewConfiguration newMapViewConfiguration) 
	{
		unregisterFromAll();
		
		this.mapViewConfiguration = newMapViewConfiguration;
		
		registerListenerTo(newMapViewConfiguration);					
	}
	
	public void dispose()
	{
		setMapViewConfiguration(null);
	}
	
	private void unregisterFromAll()
	{
		// Unregister from previous objects.
		for(EObject obj : observedEObjects)
		{
			obj.eAdapters().remove(getAdapter());
		}
		observedEObjects.clear();
	}
	
	private void registerListenerTo(MapViewConfiguration newMapViewConfiguration)
	{
		if(newMapViewConfiguration != null)
		{
			newMapViewConfiguration.eAdapters().add(getAdapter());
			observedEObjects.add(newMapViewConfiguration);
						
			// Listens to presentation layers.
			if(newMapViewConfiguration.getMapLayers() != null)
			{								
				for(ImageMapLayerPresentation imageMapLayerPresentation : newMapViewConfiguration.getMapLayers())
				{
					imageMapLayerPresentation.eAdapters().add(getAdapter());
					observedEObjects.add(imageMapLayerPresentation);
				}
			}						
		}
	}
	
	protected void mapViewConfigurationUpdate()
	{
		
	};
		
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{				
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof MapViewConfiguration)
					{
						int featureID = msg.getFeatureID(MapViewConfiguration.class); 
						
						switch(featureID)
						{
							case SymphonyEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS:
							{
								if(msg.getEventType() == Notification.ADD)
								{
									if(msg.getNewValue() instanceof ImageMapLayerPresentation)
									{
										ImageMapLayerPresentation newImageMapLayerPresentation = (ImageMapLayerPresentation) msg.getNewValue();
										newImageMapLayerPresentation.eAdapters().add(getAdapter());
										observedEObjects.add(newImageMapLayerPresentation);
									}
								}
								else if(msg.getEventType() == Notification.ADD_MANY)
								{
									try
									{
										List<ImageMapLayerPresentation> newImageMapLayerPresentations = (List<ImageMapLayerPresentation>) msg.getNewValue();
										for(ImageMapLayerPresentation imageMapLayerPresentation : newImageMapLayerPresentations)
										{
											imageMapLayerPresentation.eAdapters().add(getAdapter());
											observedEObjects.add(imageMapLayerPresentation);
										}
									}
									catch(Exception e)
									{								
									}
								}
								else if(msg.getEventType() == Notification.REMOVE)
								{
									if(msg.getOldValue() instanceof ImageMapLayerPresentation)
									{
										ImageMapLayerPresentation oldImageMapLayerPresentation = (ImageMapLayerPresentation) msg.getOldValue();
										oldImageMapLayerPresentation.eAdapters().remove(getAdapter());
										observedEObjects.remove(oldImageMapLayerPresentation);
									}
								}
								else if(msg.getEventType() == Notification.REMOVE_MANY)
								{
									try
									{
										List<ImageMapLayerPresentation> oldImageMapLayerPresentation = (List<ImageMapLayerPresentation>) msg.getOldValue();
										for(ImageMapLayerPresentation imageMapLayerPresentation : oldImageMapLayerPresentation)
										{
											imageMapLayerPresentation.eAdapters().remove(getAdapter());
											observedEObjects.remove(imageMapLayerPresentation);											
										}
									}
									catch(Exception e)
									{								
									}
								}		
								
								// Update.
								mapViewConfigurationUpdate();
							}	
							break;
							
							case SymphonyEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR:
								mapViewConfigurationUpdate();
							break;
							
							default:
							break;
						}
					}
					else if(msg.getNotifier() instanceof ImageMapLayerPresentation)
					{
						int featureID = msg.getFeatureID(ImageMapLayerPresentation.class); 
						switch(featureID)
						{
							case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__VISIBLE:
								mapViewConfigurationUpdate();
							break;
							
							case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
								mapViewConfigurationUpdate();
							break;
							
							case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__MAP_LAYER:
								mapViewConfigurationUpdate();
							break;
							
							default:
							break;
						}
					}
					else if(msg.getNotifier() instanceof ImageMapLayer)
					{
						int featureID = msg.getFeatureID(ImageMapLayer.class); 
						switch(featureID)
						{
							case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT:
								mapViewConfigurationUpdate();
							break;							
							
							case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH:
								mapViewConfigurationUpdate();
							break;		
							
							case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
								mapViewConfigurationUpdate();
							break;		
							
							default:
							break;
						}
					}
				}
			};
		}
		
		return adapter;
	}
}
