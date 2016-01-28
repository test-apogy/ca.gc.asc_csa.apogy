package ca.gc.asc_csa.apogy.core.environment.ui.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import ca.gc.asc_csa.apogy.core.environment.EarthSky;

public class EarthSkyComposite extends Composite 
{
			
	// Earth Sky
	private EarthSky earthSky= null;
	
	private EarthSkyLocationComposite earthSkyLocationComposite = null;
	private EarthSkySunComposite earthSkySunComposite = null;
	private EarthSkyMoonComposite earthSkyMoonComposite = null;
	private EarthSkyTimeComposite earthSkyTimeComposite = null;
	
	public EarthSkyComposite(Composite parent, int style) 
	{
		super(parent, style);	
		
		setLayout(new GridLayout(2, true));
				
		Group locationGroup = new Group(this, SWT.NONE);
		locationGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		locationGroup.setText("Location");		
		locationGroup.setLayout(new FillLayout(SWT.HORIZONTAL));				
		earthSkyLocationComposite = new EarthSkyLocationComposite(locationGroup, SWT.NONE);
		
		Group sunGroup = new Group(this, SWT.NONE);
		sunGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sunGroup.setText("Sun");		
		sunGroup.setLayout(new FillLayout(SWT.HORIZONTAL));								
		earthSkySunComposite = new EarthSkySunComposite(sunGroup, SWT.NONE);
		
		Group timeGroup = new Group(this, SWT.NONE);
		timeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		timeGroup.setText("Time");		
		timeGroup.setLayout(new FillLayout(SWT.HORIZONTAL));		
		earthSkyTimeComposite = new EarthSkyTimeComposite(timeGroup, SWT.NONE);
		
		Group moonGroup = new Group(this, SWT.NONE);
		moonGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		moonGroup.setText("Moon");		
		moonGroup.setLayout(new FillLayout(SWT.HORIZONTAL));		
		earthSkyMoonComposite = new EarthSkyMoonComposite(moonGroup, SWT.NONE);
	}
		
	public EarthSky getEarthSky() {
		return earthSky;
	}

	public void setEarthSky(EarthSky earthSky) 
	{		
		setEarthSky(earthSky, true);		
	}
	
	public void setEarthSky(EarthSky newEarthSky, boolean update) 
	{
		earthSkyLocationComposite.setEarthSky(newEarthSky);
		earthSkySunComposite.setEarthSky(newEarthSky);
		earthSkyMoonComposite.setEarthSky(newEarthSky);
		earthSkyTimeComposite.setEarthSky(newEarthSky);
		
		// Updates EarthSky
		this.earthSky = newEarthSky;			
	}

}