package org.eclipse.symphony.core.environment.ui.composites;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

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
import org.eclipse.symphony.core.environment.ui.databindings.converters.DateToJulianDayStringConverter;
import org.eclipse.symphony.core.environment.ui.databindings.converters.DateToSideralTimeStringConverter;

import org.eclipse.symphony.common.databinding.converters.DateToStringConverter;
import org.eclipse.symphony.common.emf.EMFEcorePackage;

public class EarthSkyTimeComposite extends Composite 
{
	public static final String JULIAN_DAY_FORMAT_STRING = "0.00000";
	public static final String DATE_FORMAT_STRING = "yyyy.MM.dd HH:mm:ss z";

	
	// Earth Sky
	private EarthSky earthSky= null;

	// Time Displays.
	private Label localTimeValueLabel = null;
	private Label julianDayValueLabel = null;
	private Label sideralTimeValueLabel = null;
	
	private DataBindingContext m_bindingContext;		
	
	public EarthSkyTimeComposite(Composite parent, int style) 
	{
		super(parent, style);
		
		setLayout(new GridLayout(2, true));
		
		// Local Time
		Label localLabel = new Label(this, SWT.NONE);	
		localLabel.setText("Local Time:");
		
		GridData gridData1 = new GridData();
		gridData1.horizontalAlignment = SWT.RIGHT;
		localTimeValueLabel = new Label(this, SWT.NONE);
		localTimeValueLabel.setLayoutData(gridData1);
		localTimeValueLabel.setText("2000.01.01 HH:MM:ss zzz");		
		localTimeValueLabel.setAlignment(SWT.RIGHT);
		
		// Julian Day
		Label julianDateLabel = new Label(this, SWT.NONE);				                        
		julianDateLabel.setText("Julian Day:");
		
		GridData gridData2 = new GridData();
		gridData2.horizontalAlignment = SWT.RIGHT;
		julianDayValueLabel = new Label(this, SWT.NONE);	
		julianDayValueLabel.setLayoutData(gridData2);
		julianDayValueLabel.setText("0000000.00000");
		julianDayValueLabel.setAlignment(SWT.RIGHT);
		
		// Sideral time.
		Label sideralTimeLabel = new Label(this, SWT.NONE);				
		sideralTimeLabel.setText("Sideral Time:");
		
		GridData gridData3 = new GridData();
		gridData3.horizontalAlignment = SWT.RIGHT;
		sideralTimeValueLabel = new Label(this, SWT.NONE);
		sideralTimeValueLabel.setLayoutData(gridData3);
		sideralTimeValueLabel.setText("00:00:00");
		sideralTimeValueLabel.setAlignment(SWT.RIGHT);
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
			
			// Local Time		
			IObservableValue lbllocalTimeValueLabel = PojoProperties.value("text").observe(localTimeValueLabel);		
			IObservableValue localTimeObserveValue = EMFProperties.value(FeaturePath.fromList(EMFEcorePackage.Literals.TIMED__TIME)).observe(getEarthSky());
			
			UpdateValueStrategy localTimeValueStrategy = new UpdateValueStrategy();
			localTimeValueStrategy.setConverter(new DateToStringConverter(new SimpleDateFormat(DATE_FORMAT_STRING)));
			
			bindingContext.bindValue(lbllocalTimeValueLabel, localTimeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), localTimeValueStrategy);
	
			// Julian Day
			IObservableValue lbljulianDayValueLabel = PojoProperties.value("text").observe(julianDayValueLabel);		
			IObservableValue julianDayObserveValue = EMFProperties.value(FeaturePath.fromList(EMFEcorePackage.Literals.TIMED__TIME)).observe(getEarthSky());
			
			UpdateValueStrategy julianDayValueStrategy = new UpdateValueStrategy();
			julianDayValueStrategy.setConverter(new DateToJulianDayStringConverter(new DecimalFormat(JULIAN_DAY_FORMAT_STRING)));
			
			bindingContext.bindValue(lbljulianDayValueLabel, julianDayObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), julianDayValueStrategy);
	
			
			try
			{			
				// Sideral Time
				IObservableValue lblsideralTimeValueLabel = PojoProperties.value("text").observe(sideralTimeValueLabel);		
				IObservableValue sideralTimeObserveValue = EMFProperties.value(FeaturePath.fromList(EMFEcorePackage.Literals.TIMED__TIME)).observe(getEarthSky());
				
				UpdateValueStrategy sideralTimeValueStrategy = new UpdateValueStrategy();
				sideralTimeValueStrategy.setConverter(new DateToSideralTimeStringConverter(geographicCoordinates.getLongitude()));
				
				bindingContext.bindValue(lblsideralTimeValueLabel, sideralTimeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), sideralTimeValueStrategy);
			}
			catch(Exception e)
			{	
				e.printStackTrace();
			}
		}
		
		return bindingContext;
	}
}
