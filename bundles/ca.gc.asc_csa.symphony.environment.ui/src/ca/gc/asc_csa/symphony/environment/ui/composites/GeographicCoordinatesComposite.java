package ca.gc.asc_csa.symphony.environment.ui.composites;

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.eclipse.core.databinding.converters.DoubleToStringConverter;
import ca.gc.asc_csa.eclipse.core.databinding.converters.StringToDoubleConverter;
import ca.gc.asc_csa.symphony.environment.GeographicCoordinates;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.ui.databindings.converters.DegreeStringToRadiansConverter;
import ca.gc.asc_csa.symphony.environment.ui.databindings.converters.RadiansToDegreesStringConverter;

public class GeographicCoordinatesComposite extends Composite 
{
	public static final String DEGREE_STRING = 	"\u00b0";
	
	protected GeographicCoordinates geographicCoordinates;
	protected DecimalFormat decimalFormat;
	
	private DataBindingContext m_bindingContext;
	
	private Text longitudeText;
	private Text latitudeText;
	private Text elevationText;
	private EditingDomain editingDomain;
	private boolean enableEditing = true;
	
	public GeographicCoordinatesComposite(Composite parent, int style) 
	{
		this(parent, style, null);		
	}

	public GeographicCoordinatesComposite(Composite parent, int style, EditingDomain editingDomain)
	{
		super(parent, style);
		this.editingDomain = editingDomain;
		
		setLayout(new GridLayout(3, true));

		Label latitudeLabel = new Label(this, SWT.NONE);
		latitudeLabel.setText("Latitude (" + DEGREE_STRING + ")");
		latitudeLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Label longitudeLabel = new Label(this, SWT.NONE);
		longitudeLabel.setText("Longitude (" + DEGREE_STRING + ")");
		longitudeLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
				
		Label elevationLabel = new Label(this, SWT.NONE);
		elevationLabel.setText("Elevation (m)");
		elevationLabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		latitudeText = new Text(this, SWT.BORDER | SWT.SINGLE);
		latitudeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		
		longitudeText = new Text(this, SWT.BORDER | SWT.SINGLE);
		longitudeText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		elevationText = new Text(this, SWT.BORDER | SWT.SINGLE);
		elevationText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	}
	
	@Override
	protected void checkSubclass() 
	{
		// Disable the check that prevents subclassing of SWT components
	}
	
	public boolean isEnableEditing() 
	{
		return enableEditing;
	}
	
	public void setEnableEditing(final boolean enableEditing) 
	{
		this.enableEditing = enableEditing;
		
		if (m_bindingContext != null) 
		{
			m_bindingContext.dispose();
			m_bindingContext = null;
		}		
		
		// Sets the Editing propert of the text fields.
		getDisplay().asyncExec(new Runnable()
    	{
    		public void run()
    		{
    			if(enableEditing)
    			{			
    				longitudeText.setEditable(true);
    				latitudeText.setEditable(true);
    				elevationText.setEditable(true);			
    			}
    			else
    			{
    				longitudeText.setEditable(false);
    				latitudeText.setEditable(false);
    				elevationText.setEditable(false);			
    			}
    		}
    	});
				
		if (geographicCoordinates != null) 
		{
			if(this.enableEditing)
			{				
				m_bindingContext = custom_initDataBindings();
			}
			else
			{				
				m_bindingContext = initDataBindingsNoEditing();
			}
		}				
	}
	
	public GeographicCoordinates getGeographicCoordinates() 
	{
		return geographicCoordinates;
	}

	public void setGeographicCoordinates(GeographicCoordinates newGeographicCoordinates) 
	{
		setGeographicCoordinates(newGeographicCoordinates, true);
	}

	public void setGeographicCoordinates(GeographicCoordinates newGeographicCoordinates, boolean update) {
		geographicCoordinates = newGeographicCoordinates;
		if (update) 
		{
			if (m_bindingContext != null) 
			{
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (geographicCoordinates != null) 
			{
				if(enableEditing)
				{
					m_bindingContext = custom_initDataBindings();
				}
				else
				{
					m_bindingContext = initDataBindingsNoEditing();
				}
			}
		}
	}
	
	protected DecimalFormat getDecimalFormat()
	{
		if(decimalFormat == null)
		{
			decimalFormat = new DecimalFormat("0.0000000");
		}
		return decimalFormat;
	}
	
	protected DataBindingContext custom_initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue longitudeObserveWidget = SWTObservables.observeText(longitudeText, SWT.FocusOut);
		IObservableValue xObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE):
				EMFEditObservables.observeValue(editingDomain, geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE);
		UpdateValueStrategy strategy = new UpdateValueStrategy();
		strategy.setConverter(new DegreeStringToRadiansConverter());
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new RadiansToDegreesStringConverter(getDecimalFormat()));
		bindingContext.bindValue(longitudeObserveWidget, xObserveValue, strategy, strategy_1);
		//
		IObservableValue yObserveWidget = SWTObservables.observeText(latitudeText, SWT.FocusOut);
		IObservableValue yObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE):
				EMFEditObservables.observeValue(editingDomain, geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE);
					
		UpdateValueStrategy strategy_2 = new UpdateValueStrategy();
		strategy_2.setConverter(new DegreeStringToRadiansConverter());
		UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new RadiansToDegreesStringConverter(getDecimalFormat()));
		bindingContext.bindValue(yObserveWidget, yObserveValue, strategy_2, strategy_3);
		//
		IObservableValue zObserveWidget = SWTObservables.observeText(elevationText, SWT.FocusOut);
		IObservableValue zObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION):
				EMFEditObservables.observeValue(editingDomain, geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION);
					
		UpdateValueStrategy strategy_4 = new UpdateValueStrategy();
		strategy_4.setConverter(new StringToDoubleConverter());
		UpdateValueStrategy strategy_5 = new UpdateValueStrategy();
		strategy_5.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));
		bindingContext.bindValue(zObserveWidget, zObserveValue, strategy_4, strategy_5);
		//
		return bindingContext;
	}
	
	protected DataBindingContext initDataBindingsNoEditing() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue xObserveWidget = SWTObservables.observeText(longitudeText, SWT.FocusOut);
		IObservableValue xObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE):
				EMFEditObservables.observeValue(editingDomain, geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE);
		
		UpdateValueStrategy strategy_1 = new UpdateValueStrategy();
		strategy_1.setConverter(new RadiansToDegreesStringConverter(getDecimalFormat()));
		bindingContext.bindValue(xObserveWidget, xObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy_1);
		//
		IObservableValue yObserveWidget = SWTObservables.observeText(latitudeText, SWT.FocusOut);
		IObservableValue yObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE):
				EMFEditObservables.observeValue(editingDomain, geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE);
					
		
		UpdateValueStrategy strategy_3 = new UpdateValueStrategy();
		strategy_3.setConverter(new RadiansToDegreesStringConverter(getDecimalFormat()));
		bindingContext.bindValue(yObserveWidget, yObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy_3);
		//
		IObservableValue zObserveWidget = SWTObservables.observeText(elevationText, SWT.FocusOut);
		IObservableValue zObserveValue = editingDomain == null ? 
				EMFObservables.observeValue(geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION):
				EMFEditObservables.observeValue(editingDomain, geographicCoordinates, SymphonyEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION);
					
		
		UpdateValueStrategy strategy_5 = new UpdateValueStrategy();
		strategy_5.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));
		bindingContext.bindValue(zObserveWidget, zObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), strategy_5);
		//
		return bindingContext;
	}
}
