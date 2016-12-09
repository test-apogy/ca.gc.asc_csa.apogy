package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.views;
/*
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

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.composites.EarthSkyComposite;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.Activator;

public class EarthSkyView extends AbstractView
{		
	public static final String PART_NAME = "Earth Sky View";
	private EarthSky earthSky;
	
	private GeographicCoordinates marsYardCoordinates = ApogyEarthSurfaceEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();
	
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
		
		List<Object> earthSkies = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, EarthSky.class);
		
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
