package ca.gc.asc_csa.symphony.environment.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.ui.views.AbstractView;
import ca.gc.asc_csa.symphony.environment.EarthSky;
import ca.gc.asc_csa.symphony.environment.EnvironmentFacade;
import ca.gc.asc_csa.symphony.environment.GeographicCoordinates;
import ca.gc.asc_csa.symphony.environment.ui.Activator;
import ca.gc.asc_csa.symphony.environment.ui.composites.EarthSkyComposite;

public class EarthSkyView extends AbstractView
{		
	public static final String PART_NAME = "Earth Sky View";
	private EarthSky earthSky;
	
	private GeographicCoordinates marsYardCoordinates = EnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();
	
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

	@SuppressWarnings("unchecked")
	@Override
	public void updateSelection(ISelection selection) {		
		Activator.getDefault();
		List<EarthSky> earthSkies = (List<EarthSky>) org.eclipse.symphony.common.converters.Activator.convert(selection, EarthSky.class);
		if(!earthSkies.isEmpty())
		{				
				EarthSky sky = earthSkies.get(0);										
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
