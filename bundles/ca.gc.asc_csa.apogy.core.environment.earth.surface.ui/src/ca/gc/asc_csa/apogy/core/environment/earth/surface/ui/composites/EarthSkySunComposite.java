package ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.composites;
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

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.databindings.DateToSunHorizontalCoordinatesStringConverter;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ui.databindings.DateToSunIntensityStringConverter;

public class EarthSkySunComposite extends Composite 
{
	public static final String DEGREE_STRING = 	"\u00b0";
	public static final String SQUARE_STRING = 	"\u00b2"; 
	
	public static final String AZIMUTH_FORMAT_STRING = "0.000";
	public static final String ELEVATION_FORMAT_STRING = "0.000";	
	public static final String INTENSITY_FORMAT_STRING = "0.0";
	
	// Earth Sky
	private EarthSky earthSky= null;

	// Sun Displays.
	private Label sunAzimuthValueLabel = null;
	private Label sunElevationValueLabel = null;
	private Label sunIntensityValueLabel = null;
	
	private DataBindingContext m_bindingContext;		
	
	public EarthSkySunComposite(Composite parent, int style) 
	{
		super(parent, style);
		
		setLayout(new GridLayout(2, true));
		
		// Sun Azimuth
		Label sunAzimuthLabel = new Label(this, SWT.NONE);				                        
		sunAzimuthLabel.setText("Azimuth (" + DEGREE_STRING + "):");
		
		GridData gridDataAzimuth = new GridData();
		gridDataAzimuth.horizontalAlignment = SWT.RIGHT;		
		sunAzimuthValueLabel = new Label(this, SWT.NONE);		
		sunAzimuthValueLabel.setLayoutData(gridDataAzimuth);
		sunAzimuthValueLabel.setText("-000.000");
		sunAzimuthValueLabel.setAlignment(SWT.RIGHT);
				
		// Sun Elevation
		Label sunElevationLabel = new Label(this, SWT.NONE);				                        
		sunElevationLabel.setText("Elevation (" + DEGREE_STRING +"):");
		
		GridData gridDataElevation = new GridData();
		gridDataElevation.horizontalAlignment = SWT.RIGHT;
		sunElevationValueLabel = new Label(this, SWT.NONE);
		sunElevationValueLabel.setLayoutData(gridDataElevation);
		sunElevationValueLabel.setText("-00.000");
		sunElevationValueLabel.setAlignment(SWT.RIGHT);
		
		// Sun Intensity
		Label sunIntensityLabel = new Label(this, SWT.NONE);	
		sunIntensityLabel.setText("Intensity (W/m" + SQUARE_STRING + "):");
		
		GridData gridDataIntensity = new GridData();
		gridDataIntensity.horizontalAlignment = SWT.RIGHT;
		sunIntensityValueLabel = new Label(this, SWT.NONE);
		sunIntensityValueLabel.setLayoutData(gridDataIntensity);
		sunIntensityValueLabel.setText("0000.0");
		sunIntensityValueLabel.setAlignment(SWT.RIGHT);
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
		// Updates EarthSky
		this.earthSky = newEarthSky;
		
		if (update) 
		{
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (newEarthSky != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}
	
	protected DataBindingContext initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		
		EarthSurfaceWorksite worksite = (EarthSurfaceWorksite) getEarthSky().getWorksite();
		if(worksite != null)
		{
			GeographicCoordinates geographicCoordinates = worksite.getGeographicalCoordinates();
				
			try
			{				
				// Sun azimuth.
				IObservableValue lblsunAzimuthValueLabel = PojoProperties.value("text").observe(sunAzimuthValueLabel);		
				IObservableValue sunAzimuthObserveValue = EMFProperties.value(FeaturePath.fromList(ApogyCommonEMFPackage.Literals.TIMED__TIME)).observe(getEarthSky());
				
				UpdateValueStrategy sunAzimuthValueStrategy = new UpdateValueStrategy();
				sunAzimuthValueStrategy.setConverter(new DateToSunHorizontalCoordinatesStringConverter(new DecimalFormat(AZIMUTH_FORMAT_STRING), geographicCoordinates, DateToSunHorizontalCoordinatesStringConverter.Coords.AZIMUTH));
				
				bindingContext.bindValue(lblsunAzimuthValueLabel, sunAzimuthObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), sunAzimuthValueStrategy);
	
				// Sun altitude.
				IObservableValue lblsunElevationValueLabel = PojoProperties.value("text").observe(sunElevationValueLabel);		
				IObservableValue sunElevationObserveValue = EMFProperties.value(FeaturePath.fromList(ApogyCommonEMFPackage.Literals.TIMED__TIME)).observe(getEarthSky());
				
				UpdateValueStrategy sunElevationValueStrategy = new UpdateValueStrategy();
				sunElevationValueStrategy.setConverter(new DateToSunHorizontalCoordinatesStringConverter(new DecimalFormat(ELEVATION_FORMAT_STRING), geographicCoordinates, DateToSunHorizontalCoordinatesStringConverter.Coords.ALTITUDE));
				
				bindingContext.bindValue(lblsunElevationValueLabel, sunElevationObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), sunElevationValueStrategy);
				
				// Sun intensity
				IObservableValue lblsunIntensity = PojoProperties.value("text").observe(sunIntensityValueLabel);
				IObservableValue sunIntensityObserveValue = EMFProperties.value(FeaturePath.fromList(ApogyCommonEMFPackage.Literals.TIMED__TIME)).observe(getEarthSky());
				
				UpdateValueStrategy sunIntensityValueStrategy = new UpdateValueStrategy();
				sunIntensityValueStrategy.setConverter(new DateToSunIntensityStringConverter(new DecimalFormat(INTENSITY_FORMAT_STRING), geographicCoordinates));
				
				bindingContext.bindValue(lblsunIntensity, sunIntensityObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), sunIntensityValueStrategy);
			}
			catch(Exception e)
			{	
				e.printStackTrace();
			}
		}

		
		return bindingContext;
	}
}
