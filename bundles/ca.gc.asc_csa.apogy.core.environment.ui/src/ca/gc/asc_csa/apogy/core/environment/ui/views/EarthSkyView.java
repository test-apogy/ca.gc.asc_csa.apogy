package org.eclipse.symphony.core.environment.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIFacade;
import org.eclipse.symphony.common.ui.views.AbstractView;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.ui.Activator;
import org.eclipse.symphony.core.environment.ui.composites.EarthSkyComposite;

public class EarthSkyView extends AbstractView
{		
	public static final String PART_NAME = "Earth Sky View";
	private EarthSky earthSky;
	
	private GeographicCoordinates marsYardCoordinates = Symphony__CoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();
	
	// Default values are the ones for Mars Yard.
	public double defaultObserverLongitude =  marsYardCoordinates.getLongitude();
	public double defaultObserverLatitude =  marsYardCoordinates.getLatitude();			
	
	private EarthSkyComposite earthSkyComposite;
		
	
	@Override
	public void createPartControl(Composite parent) 
	{		
		super.createPartControl(parent);
		earthSkyComposite = new EarthSkyComposite(parent, SWT.NONE);					
	}

	@Override
	public void updatePartName() {		
		setPartName(PART_NAME);
	}

	@Override
	public void updateSelection(ISelection selection)
	{		
		Activator.getDefault();
		
		List<Object> earthSkies = Symphony__CommonConvertersUIFacade.INSTANCE.convert(selection, EarthSky.class);
		
		if(!earthSkies.isEmpty())
		{				
			EarthSky sky = (EarthSky) earthSkies.get(0);										
			setEarthSky(sky);								
		}
	}
	

	public EarthSky getEarthSky() {
		return earthSky;
	}

	public void setEarthSky(EarthSky earthSky) 
	{
		this.earthSky = earthSky;
		
		if(earthSkyComposite != null && !earthSkyComposite.isDisposed())
		{
			earthSkyComposite.setEarthSky(earthSky);
		}
	}
}
