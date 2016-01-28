package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites;

import gov.nasa.worldwind.BasicModel;
import gov.nasa.worldwind.Configuration;
import gov.nasa.worldwind.avlist.AVKey;
import gov.nasa.worldwind.awt.WorldWindowGLJPanel;
import gov.nasa.worldwind.globes.Earth;
import gov.nasa.worldwind.globes.EarthFlat;
import gov.nasa.worldwind.view.orbit.BasicOrbitView;
import gov.nasa.worldwind.view.orbit.FlatOrbitView;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.AbstractWorldWindLayer;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;

public class EarthComposite extends Composite 
{
	private EarthViewMode mode = EarthViewMode.ROUND;
	private EarthViewConfiguration earthViewConfiguration;
	private Adapter earthViewConfigurationAdapter;	
		
	private List<AbstractWorldWindLayer> layers = new ArrayList<AbstractWorldWindLayer>();
	private WorldWindowGLJPanel worldWindowGLJPanel;
	
	public enum EarthViewMode
	{
		ROUND, FLAT
	}
	
	public EarthComposite(Composite parent, int style) 
	{
		super(parent, style);	
		
		setLayout(new FillLayout());
		
		Composite top = new Composite(this, SWT.EMBEDDED);
        
		java.awt.Frame worldFrame = SWT_AWT.new_Frame(top);
		java.awt.Panel panel = new java.awt.Panel(new java.awt.BorderLayout());
		worldFrame.add(panel);
		panel.add(getWorldWindowGLJPanel(), BorderLayout.CENTER);
		worldFrame.requestFocus();						
	}
	
	public void setEarthViewConfiguration(EarthViewConfiguration newEarthViewConfiguration)
	{
		System.out.println("EarthComposite.setEarthViewConfiguration(" + newEarthViewConfiguration + ")");
		
		// Unregister listener from previous EarthViewConfiguration if applicable.
		if(earthViewConfiguration != null)
		{
			earthViewConfiguration.eAdapters().remove(getEarthViewConfigurationAdapter());
		}
				
		// Clears previous layers.
		removeAllLayers();
				
		this.earthViewConfiguration = newEarthViewConfiguration;
		
		// Register to new EarthViewConfiguration if applicable.
		if(newEarthViewConfiguration != null)
		{
			// Initialize the displayed layers.
			initializeEarthViewConfiguration(newEarthViewConfiguration);
						
			// Registers listener to the new EarthViewConfiguration.
			newEarthViewConfiguration.eAdapters().add(getEarthViewConfigurationAdapter());
		}
	}
	
	public EarthViewConfiguration getEarthViewConfiguration()
	{
		return earthViewConfiguration;
	}
				
	public EarthViewMode getMode() {
		return mode;
	}

	public void setMode(EarthViewMode mode) 
	{
		this.mode = mode;
		
		if(mode == EarthViewMode.FLAT)
		{
			Configuration.setValue(AVKey.GLOBE_CLASS_NAME, EarthFlat.class.getName());
			Configuration.setValue(AVKey.VIEW_CLASS_NAME, FlatOrbitView.class.getName());
		}
		else
		{
			Configuration.setValue(AVKey.GLOBE_CLASS_NAME, Earth.class.getName());
			Configuration.setValue(AVKey.VIEW_CLASS_NAME, BasicOrbitView.class.getName());
		}
			
		getWorldWindowGLJPanel().setModel(new BasicModel());		
		getWorldWindowGLJPanel().redraw();
		
		// Re-initialize all layers.
		initializeEarthViewConfiguration(getEarthViewConfiguration());
	}

	protected void addLayer(AbstractWorldWindLayer abstractWorldWindLayer)
	{				
		if(abstractWorldWindLayer.getRenderableLayer() != null)
		{
			getWorldWindowGLJPanel().getModel().getLayers().add(abstractWorldWindLayer.getRenderableLayer());
			getWorldWindowGLJPanel().redraw();
		}
		
		layers.add(abstractWorldWindLayer);
	}
	
	protected void removeLayer(AbstractWorldWindLayer abstractWorldWindLayer)
	{
		if(abstractWorldWindLayer.getRenderableLayer() != null)
		{
			getWorldWindowGLJPanel().getModel().getLayers().remove(abstractWorldWindLayer.getRenderableLayer());
		}
	}			
	
	protected void removeAllLayers()
	{
		// Removes only the layers that have been added.
		for(AbstractWorldWindLayer layer : layers)
		{
			removeLayer(layer);
		}
		
		// Clears the list.
		layers.clear();
	}
	
	protected void updateAllLayers()
	{
		for(AbstractWorldWindLayer layer : layers)
		{
			try 
			{
				layer.update();
			} 
			catch (Exception e) 
			{				
				e.printStackTrace();
			}
		}				
	}
	
	protected void initializeEarthViewConfiguration(EarthViewConfiguration newEarthViewConfiguration)
	{
		if(newEarthViewConfiguration != null)
		{
			for(AbstractWorldWindLayer layer : newEarthViewConfiguration.getLayers())
			{
				addLayer(layer);
			}
		}
	}
	
	protected WorldWindowGLJPanel getWorldWindowGLJPanel()
	{
		if(worldWindowGLJPanel == null)
		{			
			worldWindowGLJPanel = new WorldWindowGLJPanel();
			worldWindowGLJPanel.setModel(new BasicModel());			
		}
		
		return worldWindowGLJPanel;
	}

	protected Adapter getEarthViewConfigurationAdapter() 
	{
		if(earthViewConfigurationAdapter == null)
		{
			earthViewConfigurationAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof EarthViewConfiguration)
					{
						int featureId = msg.getFeatureID(EarthViewConfiguration.class);
						
						switch(featureId)
						{
							case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION__LAYERS:
							{
								int eventType = msg.getEventType();
								switch(eventType)
								{
									case Notification.ADD:
										if(msg.getNewValue() instanceof AbstractWorldWindLayer)
										{
											addLayer((AbstractWorldWindLayer) msg.getNewValue());
										}
									break;
									
									case Notification.REMOVE:
										if(msg.getOldValue() instanceof AbstractWorldWindLayer)
										{
											addLayer((AbstractWorldWindLayer) msg.getOldValue());
										}										
									break;
									
									// TODO : add other cases.
								}
							}
							break;
						}
					}										
				}
			};
		}
		return earthViewConfigurationAdapter;
	}
}
