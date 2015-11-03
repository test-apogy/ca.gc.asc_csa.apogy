package org.eclipse.symphony.core.environment.ui.composites;

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
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.ui.databindings.converters.DateToMoonHorizontalCoordinatesStringConverter;

import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;

public class EarthSkyMoonComposite extends Composite 
{
	public static final String DEGREE_STRING = 	"\u00b0";
	public static final String SQUARE_STRING = 	"\u00b2"; 
	
	public static final String AZIMUTH_FORMAT_STRING = "0.000";
	public static final String ELEVATION_FORMAT_STRING = "0.000";

	
	// Earth Sky
	private EarthSky earthSky= null;

	// Moon Displays.
	private Label moonAzimuthValueLabel = null;
	private Label moonElevationValueLabel = null;
	
	private DataBindingContext m_bindingContext;		
	
	public EarthSkyMoonComposite(Composite parent, int style) 
	{
		super(parent, style);
		
		setLayout(new GridLayout(2, true));
		
		// Moon Azimuth
		Label moonAzimuthLabel = new Label(this, SWT.NONE);				                        
		moonAzimuthLabel.setText("Azimuth (" + DEGREE_STRING + "):");
		
		GridData gridDataAzimuth = new GridData();
		gridDataAzimuth.horizontalAlignment = SWT.RIGHT;
		moonAzimuthValueLabel = new Label(this, SWT.NONE);
		moonAzimuthValueLabel.setLayoutData(gridDataAzimuth);
		moonAzimuthValueLabel.setText("-000.000");
		moonAzimuthValueLabel.setAlignment(SWT.RIGHT);
		
		// Moon Elevation
		Label moonElevationLabel = new Label(this, SWT.NONE);				                        
		moonElevationLabel.setText("Elevation (" + DEGREE_STRING + "):");
		
		GridData gridDataElevation = new GridData();
		gridDataElevation.horizontalAlignment = SWT.RIGHT;
		moonElevationValueLabel = new Label(this, SWT.NONE);
		moonElevationValueLabel.setLayoutData(gridDataElevation);
		moonElevationValueLabel.setText("-000.000");
		moonElevationValueLabel.setAlignment(SWT.RIGHT);
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
		
		EarthSurfaceWorksite worksite = (EarthSurfaceWorksite) getEarthSky().getSurfaceWorksite();
		
		if(worksite != null)
		{
			GeographicCoordinates geographicCoordinates = worksite.getGeographicalCoordinates();
			
			try
			{			
				// Moon azimuth.
				IObservableValue lblmoonAzimuthValueLabel = PojoProperties.value("text").observe(moonAzimuthValueLabel);		
				IObservableValue moonAzimuthObserveValue = EMFProperties.value(FeaturePath.fromList(Symphony__CommonEMFPackage.Literals.TIMED__TIME)).observe(getEarthSky());
				
				UpdateValueStrategy moonAzimuthValueStrategy = new UpdateValueStrategy();
				moonAzimuthValueStrategy.setConverter(new DateToMoonHorizontalCoordinatesStringConverter(new DecimalFormat(AZIMUTH_FORMAT_STRING), geographicCoordinates, DateToMoonHorizontalCoordinatesStringConverter.Coords.AZIMUTH));
				
				bindingContext.bindValue(lblmoonAzimuthValueLabel, moonAzimuthObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), moonAzimuthValueStrategy);
	
				// Moon altitude.
				IObservableValue lblmoonElevationValueLabel = PojoProperties.value("text").observe(moonElevationValueLabel);		
				IObservableValue moonElevationObserveValue = EMFProperties.value(FeaturePath.fromList(Symphony__CommonEMFPackage.Literals.TIMED__TIME)).observe(getEarthSky());
				
				UpdateValueStrategy moonElevationValueStrategy = new UpdateValueStrategy();
				moonElevationValueStrategy.setConverter(new DateToMoonHorizontalCoordinatesStringConverter(new DecimalFormat(ELEVATION_FORMAT_STRING), geographicCoordinates, DateToMoonHorizontalCoordinatesStringConverter.Coords.ALTITUDE));
				
				bindingContext.bindValue(lblmoonElevationValueLabel, moonElevationObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), moonElevationValueStrategy);
			}
			catch (Exception e)
			{	
				e.printStackTrace();
			}
		}

		return bindingContext;
	}
}
