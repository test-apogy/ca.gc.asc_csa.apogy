package org.eclipse.symphony.addons.sensors.imaging.camera.listeners;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.sensors.imaging.camera.Activator;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.FilterList;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.listeners.AbstractVariableFeatureReferenceListener;

import org.eclipse.symphony.addons.sensors.imaging.AbstractCamera;

public class CameraViewConfigurationListener 
{
	private AbstractVariableFeatureReferenceListener abstractVariableFeatureReferenceListener = null;
	
	private List<EObject> observedEObjects = new ArrayList<EObject>();
	private Adapter adapter;
	private CameraViewConfiguration cameraViewConfiguration;
	
	public CameraViewConfigurationListener(CameraViewConfiguration newCameraViewConfiguration)
	{
		setCameraViewConfiguration(newCameraViewConfiguration);
	}

	public CameraViewConfiguration getCameraViewConfiguration() 
	{
		return cameraViewConfiguration;
	}

	public void setCameraViewConfiguration(CameraViewConfiguration newCameraViewConfiguration) 
	{		
		// Unregister from previous objects.
		for(EObject obj : observedEObjects)
		{
			obj.eAdapters().remove(getAdapter());
		}
		observedEObjects.clear();
		
		this.cameraViewConfiguration = newCameraViewConfiguration;
		
		if(newCameraViewConfiguration != null)
		{
			newCameraViewConfiguration.eAdapters().add(getAdapter());
			
			newCameraViewConfiguration.getFilterList().eAdapters().add(getAdapter());			
			observedEObjects.add(newCameraViewConfiguration.getFilterList());			
			for(ImageFilter filter : newCameraViewConfiguration.getFilterList().getImageFilters())
			{
				filter.eAdapters().add(getAdapter());
				observedEObjects.add(filter);
			}
			
			newCameraViewConfiguration.getOverlayList().eAdapters().add(getAdapter());
			observedEObjects.add(newCameraViewConfiguration.getOverlayList());
			for(CameraOverlay overlay : newCameraViewConfiguration.getOverlayList().getOverlays())
			{
				overlay.eAdapters().add(getAdapter());	
				observedEObjects.add(overlay);
				
				if(overlay != null)
				{
					overlay.eAdapters().add(getAdapter());
					observedEObjects.add(overlay);
				}
			}
		}					
	}
	
	protected void cameraChanged(AbstractCamera newCamera)
	{		
	}
	
	protected void displayRectifiedChanged(boolean newRectified)
	{		
	}
	
	protected void imageSizeChanged(int newImageWidth, int newImageHeigh)
	{		
	}
	
	protected void imageFiltersChanged()
	{		
	}
	
	protected void overlaysChanged()
	{		
	}
	
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
					if(msg.getNotifier() instanceof CameraViewConfiguration)
					{
						CameraViewConfiguration cameraViewConfiguration = (CameraViewConfiguration) msg.getNotifier();
						int featureID = msg.getFeatureID(CameraViewConfiguration.class);
						switch (featureID) 
						{
							case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT:
							case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH:
								imageSizeChanged(cameraViewConfiguration.getImageWidth(), cameraViewConfiguration.getImageHeight());
							break;

							case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__CAMERA:
								cameraChanged((AbstractCamera) msg.getNewValue());
							break;
								
							case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE:
								displayRectifiedChanged(msg.getNewBooleanValue());
							break;
							
							case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__VARIABLE:
								if(msg.getOldValue() instanceof Variable)
								{
									getAbstractVariableFeatureReferenceListener().setVariableFeatureReference(null);
								}
								
								if(msg.getNewValue() instanceof Variable)
								{
									getAbstractVariableFeatureReferenceListener().setVariableFeatureReference(cameraViewConfiguration);									
								}
							break;
							
							default:
							break;
						}
					}
					else if(msg.getNotifier() instanceof FilterList)
					{
						imageFiltersChanged();
						
						if(msg.getEventType() == Notification.ADD)
						{
							if(msg.getNewValue() instanceof ImageFilter)
							{
								ImageFilter newFilter = (ImageFilter) msg.getNewValue();
								newFilter.eAdapters().add(getAdapter());
								observedEObjects.add(newFilter);
							}
						}
						else if(msg.getEventType() == Notification.ADD_MANY)
						{
							try
							{
								List<ImageFilter> newFilters = (List<ImageFilter>) msg.getNewValue();
								for(ImageFilter filter : newFilters)
								{
									filter.eAdapters().add(getAdapter());
									observedEObjects.add(filter);
								}
							}
							catch(Exception e)
							{								
							}
						}
						else if(msg.getEventType() == Notification.REMOVE)
						{
							if(msg.getOldValue() instanceof ImageFilter)
							{
								ImageFilter oldFilter = (ImageFilter) msg.getOldValue();
								oldFilter.eAdapters().remove(getAdapter());
								observedEObjects.remove(oldFilter);
							}
						}
						else if(msg.getEventType() == Notification.REMOVE_MANY)
						{
							try
							{
								List<ImageFilter> oldFilters = (List<ImageFilter>) msg.getOldValue();
								for(ImageFilter filter : oldFilters)
								{
									filter.eAdapters().remove(getAdapter());
									observedEObjects.remove(filter);
									observedEObjects.remove(filter);
								}
							}
							catch(Exception e)
							{								
							}
						}						
					}					
					else if(msg.getNotifier() instanceof ImageFilter)
					{
						imageFiltersChanged();
					}
					else if(msg.getNotifier() instanceof CameraOverlayList)
					{
						overlaysChanged();
						
						if(msg.getEventType() == Notification.ADD)
						{
							if(msg.getNewValue() instanceof CameraOverlay)
							{
								CameraOverlay newCameraOverlay = (CameraOverlay) msg.getNewValue();
								newCameraOverlay.eAdapters().add(getAdapter());
								observedEObjects.add(newCameraOverlay);
							}
						}
						else if(msg.getEventType() == Notification.ADD_MANY)
						{
							try
							{
								List<CameraOverlay> newCameraOverlays = (List<CameraOverlay>) msg.getNewValue();
								for(CameraOverlay newCameraOverlay : newCameraOverlays)
								{
									newCameraOverlay.eAdapters().add(getAdapter());
									observedEObjects.add(newCameraOverlay);
								}
							}
							catch(Exception e)
							{								
							}
						}
						else if(msg.getEventType() == Notification.REMOVE)
						{
							if(msg.getOldValue() instanceof CameraOverlay)
							{
								CameraOverlay oldCameraOverlay = (CameraOverlay) msg.getOldValue();
								oldCameraOverlay.eAdapters().remove(getAdapter());
								observedEObjects.remove(oldCameraOverlay);
							}
						}
						else if(msg.getEventType() == Notification.REMOVE_MANY)
						{
							try
							{
								List<CameraOverlay> oldCameraOverlays = (List<CameraOverlay>) msg.getOldValue();
								for(CameraOverlay cameraOverlays : oldCameraOverlays)
								{
									cameraOverlays.eAdapters().remove(getAdapter());
									observedEObjects.remove(cameraOverlays);
									observedEObjects.remove(cameraOverlays);
								}
							}
							catch(Exception e)
							{								
							}
						}		
					}					
					else if(msg.getNotifier() instanceof CameraOverlay)
					{
						overlaysChanged();
					}
						
				}
			};
		}
		
		return adapter;
	}
	
	private AbstractVariableFeatureReferenceListener getAbstractVariableFeatureReferenceListener()
	{
		if(abstractVariableFeatureReferenceListener == null)
		{
			abstractVariableFeatureReferenceListener = new AbstractVariableFeatureReferenceListener(cameraViewConfiguration)
			{
				@Override
				protected void instanceChanged(EObject oldInstance, EObject newInstance) 
				{					
						// Attempts to resolve the camera.
						if(!(oldInstance == null && newInstance == null) )
						{
							cameraChanged(resolveCamera());	
						}								
					}  
			  };
		  }
		  
		  return abstractVariableFeatureReferenceListener;
	  }
	 
	 private AbstractCamera resolveCamera()
	  {	  
		  AbstractCamera cam = null;
		  
		  try
		  {
			  EObject instance = Symphony__CoreInvocatorFacade.INSTANCE.getInstance(cameraViewConfiguration);
		  
			  if(instance instanceof AbstractCamera)
			  {
				  cam = (AbstractCamera) instance;
			  }
		  }
		  catch(Throwable t)
		  {
			  Logger.INSTANCE.log(Activator.ID, this, "Failed to resolve camera!", EventSeverity.ERROR, t);		  
		  }
		  
		  return cam;
	  }   
}
