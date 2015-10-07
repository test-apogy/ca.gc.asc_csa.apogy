package org.eclipse.symphony.core.environment.ui.composites;

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
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
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;
import org.eclipse.symphony.core.environment.ui.databindings.converters.RadiansToDegreesStringConverter;

import ca.gc.asc_csa.eclipse.core.databinding.converters.DoubleToStringConverter;

public class EarthSkyLocationComposite extends Composite 
{
	public static final String LONGITUDE_FORMAT_STRING = "0.000";
	public static final String LATITUDE_FORMAT_STRING = "0.000";
	public static final String ALTITUDE_FORMAT_STRING = "0.0";
	
	public static final String DEGREE_STRING = 	"\u00b0";
	
	// Earth Sky
	private EarthSky earthSky= null;

	// Location	
	private Label latitudeValueLabel = null;
	private Label longitudeValueLabel = null;	
	private Label altitudeValueLabel = null;	
	
	private DataBindingContext m_bindingContext;		
	
	public EarthSkyLocationComposite(Composite parent, int style) 
	{
		super(parent, style);
		
		setLayout(new GridLayout(2, true));
		
		// Latitude
		Label latitudeLabel = new Label(this, SWT.NONE);	
		latitudeLabel.setText("Latitude (" + DEGREE_STRING + "):");
		
		GridData gridDataLatitude = new GridData();
		gridDataLatitude.horizontalAlignment = SWT.RIGHT;
		latitudeValueLabel = new Label(this, SWT.NONE);		
		latitudeValueLabel.setLayoutData(gridDataLatitude);								
		latitudeValueLabel.setText("000.000");	
		latitudeValueLabel.setAlignment(SWT.RIGHT);
		
		// Longitude
		Label longitudeLabel = new Label(this, SWT.NONE);	
		longitudeLabel.setText("Longitude (" + DEGREE_STRING + "):");
		
		GridData gridDataLongitude = new GridData();
		gridDataLongitude.horizontalAlignment = SWT.RIGHT;
		longitudeValueLabel = new Label(this, SWT.NONE);
		longitudeValueLabel.setLayoutData(gridDataLongitude);
		longitudeValueLabel.setText("000.000");
		longitudeValueLabel.setAlignment(SWT.RIGHT);
		
		// Altitude
		Label altitudeLabel = new Label(this, SWT.NONE);	
		altitudeLabel.setText("Altitude (m):");
		
		GridData gridDataAltitude = new GridData();
		gridDataAltitude.horizontalAlignment = SWT.RIGHT;
		altitudeValueLabel = new Label(this, SWT.NONE);
		altitudeValueLabel.setLayoutData(gridDataAltitude);
		altitudeValueLabel.setText("000000.0");	
		altitudeValueLabel.setAlignment(SWT.RIGHT);
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
			// Longitude
			IObservableValue lblLongitudeValueLabel = PojoObservables.observeValue(longitudeValueLabel, "text");
			IObservableValue longitudeObserveValue = EMFProperties.value(FeaturePath.fromList(SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE)).observe(worksite);			
			UpdateValueStrategy longitudeValueStrategy = new UpdateValueStrategy();
			longitudeValueStrategy.setConverter(new RadiansToDegreesStringConverter(new DecimalFormat(LONGITUDE_FORMAT_STRING)));
			bindingContext.bindValue(lblLongitudeValueLabel, longitudeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), longitudeValueStrategy);
	
			// Latitude
			IObservableValue lblLatitudeValueLabel = PojoObservables.observeValue(latitudeValueLabel, "text");
			IObservableValue laltitudeObserveValue = EMFProperties.value(FeaturePath.fromList(SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE)).observe(worksite);			
			UpdateValueStrategy latitudeValueStrategy = new UpdateValueStrategy();
			latitudeValueStrategy.setConverter(new RadiansToDegreesStringConverter(new DecimalFormat(LATITUDE_FORMAT_STRING)));
			bindingContext.bindValue(lblLatitudeValueLabel, laltitudeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), latitudeValueStrategy);

			// Altitude
			IObservableValue lblaltitudeValueLabel = PojoObservables.observeValue(altitudeValueLabel, "text");
			IObservableValue altitudeObserveValue = EMFProperties.value(FeaturePath.fromList(SymphonyEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION)).observe(worksite);			
			UpdateValueStrategy atitudeValueStrategy = new UpdateValueStrategy();
			atitudeValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat(ALTITUDE_FORMAT_STRING)));
			bindingContext.bindValue(lblaltitudeValueLabel, altitudeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), atitudeValueStrategy);
	
		}
		
		return bindingContext;
	}
}