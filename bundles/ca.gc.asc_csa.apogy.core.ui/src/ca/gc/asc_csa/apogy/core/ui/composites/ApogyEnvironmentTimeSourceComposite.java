package org.eclipse.symphony.core.ui.composites;

import java.text.SimpleDateFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.symphony.common.databinding.converters.DateToStringConverter;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.TimeSource;
import org.eclipse.symphony.common.emf.ui.composites.AbstractTimeSourceComposite;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;

public class SymphonyEnvironmentTimeSourceComposite extends Composite 
{
	protected DataBindingContext bindingContext;	
	private Adapter activeTimeSourceAdapter = null;
	protected SymphonyEnvironment symphonyEnvironment;
				
	protected TimeSourcesListComposite timeSourcesListComposite;
	protected Label currentTimeValueLabel;
	protected Combo activeTimeSourceCombo;
	
	
	public SymphonyEnvironmentTimeSourceComposite(Composite parent, int style) 
	{
		this(parent, style, null);
	}

	public SymphonyEnvironmentTimeSourceComposite(Composite parent, int style, SymphonyEnvironment symphonyEnvironment) 
	{
		super(parent, style);
		setSymphonyEnvironment(symphonyEnvironment);
		setLayout(new FillLayout());				
		
		Composite top = new Composite(this, SWT.BORDER);			
		top.setLayout(new GridLayout(1, false));
						
		// Adds the current time displays
		Composite currentTimeComposite = new Composite(top, SWT.NONE);
		GridData currentTimeCompositeGridData = new GridData(SWT.FILL, SWT.TOP, true, false);
		currentTimeComposite.setLayoutData(currentTimeCompositeGridData);
		currentTimeComposite.setLayout(new GridLayout(2, true));		
		
		Label currentTimeLabel = new Label(currentTimeComposite, SWT.NONE);
		currentTimeLabel.setText("Current Environment Time : ");
		
		currentTimeValueLabel = new Label(currentTimeComposite, SWT.NONE);
		currentTimeValueLabel.setText("?");
		GridData currentTimeValueLabelGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		currentTimeValueLabelGridData.widthHint = 250;
		currentTimeValueLabelGridData.minimumWidth = 250;
		currentTimeValueLabel.setLayoutData(currentTimeValueLabelGridData);
		
		Label activeTimeSourceLabel = new Label(currentTimeComposite, SWT.NONE);
		activeTimeSourceLabel.setText("Active Time Source :");
		
		activeTimeSourceCombo = createActiveTimeSourceCombo(currentTimeComposite);		
		
		GridData activeTimeSourceComboGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		activeTimeSourceComboGridData.widthHint = 250;
		activeTimeSourceComboGridData.minimumWidth = 250;
		activeTimeSourceCombo.setLayoutData(activeTimeSourceComboGridData);
		
		// Creates and populate the TabFolder.
		timeSourcesListComposite = new TimeSourcesListComposite(top, SWT.BORDER);	
		GridData timeSourcesListCompositeGridData = new GridData(SWT.FILL, SWT.FILL, false, false);	
		timeSourcesListCompositeGridData.minimumWidth = 800;
		timeSourcesListCompositeGridData.widthHint = 800;
		timeSourcesListCompositeGridData.heightHint = 600;
		timeSourcesListCompositeGridData.minimumHeight = 600;
		timeSourcesListComposite.setLayoutData(timeSourcesListCompositeGridData);										
	}
	
	public SymphonyEnvironment getSymphonyEnvironment() 
	{
		return symphonyEnvironment;
	}

	public void setSymphonyEnvironment(SymphonyEnvironment symphonyEnvironment) 
	{
		setSymphonyEnvironment(symphonyEnvironment, true);
	}
	
	public void setSymphonyEnvironment(SymphonyEnvironment symphonyEnvironment, boolean update) 
	{
		if(this.symphonyEnvironment != null)
		{
			symphonyEnvironment.eAdapters().remove(getActiveTimeSourceAdapter());
		}
		
		this.symphonyEnvironment = symphonyEnvironment;
		
		if(symphonyEnvironment != null)
		{
			symphonyEnvironment.eAdapters().add(getActiveTimeSourceAdapter());
			
			// Sets the list of time source.
			if(timeSourcesListComposite != null) timeSourcesListComposite.setTimeSourcesList(symphonyEnvironment.getTimeSourcesList());
		}
		
		if(update)
		{
			if(timeSourcesListComposite != null)
			{
				// Clears Active Time Source Combo
				populateActiveTimeSourceCombo(activeTimeSourceCombo);
				
				// Clear items.
				timeSourcesListComposite.setTimeSourcesList(null);
								
				// Dispose of previous bindings.
				if(bindingContext != null)
				{
					bindingContext.dispose();
					bindingContext = null;
				}
				
				if(symphonyEnvironment != null)
				{
					// Clears Active Time Source Combo
					populateActiveTimeSourceCombo(activeTimeSourceCombo);
					
					// Sets the TimeSourceList.
					timeSourcesListComposite.setTimeSourcesList(symphonyEnvironment.getTimeSourcesList());
					
					setActiveTimeSource(symphonyEnvironment.getActiveTimeSource());
					bindingContext = initDataBindings();
				}
			}
		}
	}

	protected Combo createActiveTimeSourceCombo(Composite parent)
	{
		final Combo combo = new Combo(parent, SWT.READ_ONLY);
		
		// Populate the Combo.
		populateActiveTimeSourceCombo(combo);
		
		combo.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{	
				try
				{
					int index = combo.getSelectionIndex();
					
					if(getSymphonyEnvironment() != null && getSymphonyEnvironment().getTimeSourcesList() != null)
					{
						TimeSource timeSource =  getSymphonyEnvironment().getTimeSourcesList().getTimeSources().get(index);
						getSymphonyEnvironment().setActiveTimeSource(timeSource);
					}
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) 
			{								
			}
		});
		
		
		if(getSymphonyEnvironment() != null && getSymphonyEnvironment().getActiveTimeSource() != null)
		{
			combo.select(getSymphonyEnvironment().getTimeSourcesList().getTimeSources().indexOf(getSymphonyEnvironment().getActiveTimeSource()));
		}
		
		return combo;
	}
		
	protected void populateActiveTimeSourceCombo(Combo combo)
	{
		if(getSymphonyEnvironment() != null)
		{
			int size = getSymphonyEnvironment().getTimeSourcesList().getTimeSources().size();
			String[] items = new String[size];
			
			for(int i = 0; i < size; i++)
			{
				TimeSource timeSource = getSymphonyEnvironment().getTimeSourcesList().getTimeSources().get(i);
				String timeSourceText = getTimeSourceText(timeSource);
				items[i] = timeSourceText;									
			}
			
			combo.setItems(items);
		}
	}
	
	protected String getTimeSourceText(TimeSource timeSource)
	{
		String text = timeSource.eClass().getName();
		return text;
	}
		
	protected void setActiveTimeSource(TimeSource activeTimeSource)
	{
		timeSourcesListComposite.setSelectedTimeSourceTab(activeTimeSource);
		
		if(activeTimeSourceCombo != null)
		{
			if(activeTimeSource!= null)
			{
				activeTimeSourceCombo.select(getSymphonyEnvironment().getTimeSourcesList().getTimeSources().indexOf(activeTimeSource));
			}
			else
			{
				activeTimeSourceCombo.select(-1);
			}
			
		}
	}
	
	protected DataBindingContext initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		
		// Bind SymphonyEnvironment current time to currentTimeLabel.	
		IObservableValue currentTimeLabelValue = PojoProperties.value("text").observe(currentTimeValueLabel);		
		IObservableValue currentTimeObserveValue = EMFProperties.value(FeaturePath.fromList(Symphony__CommonEMFPackage.Literals.TIMED__TIME)).observe(getSymphonyEnvironment());			
		UpdateValueStrategy currentTimeValueStrategy = new UpdateValueStrategy();
		currentTimeValueStrategy.setConverter(new DateToStringConverter(new SimpleDateFormat(AbstractTimeSourceComposite.DATE_FORMAT_STRING)));
		bindingContext.bindValue(currentTimeLabelValue, currentTimeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), currentTimeValueStrategy);
						
		return bindingContext;
	}
	
	protected Adapter getActiveTimeSourceAdapter()
	{
		if(activeTimeSourceAdapter == null)
		{
			activeTimeSourceAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof SymphonyEnvironment)
					{
						int featureId = msg.getFeatureID(SymphonyEnvironment.class);
						
						if(featureId == Symphony__CorePackage.SYMPHONY_ENVIRONMENT__ACTIVE_TIME_SOURCE)
						{
							TimeSource newActiveTimeSource = (TimeSource) msg.getNewValue();
							setActiveTimeSource(newActiveTimeSource);
						}							
					}					
				}
			};
		}
		
		return activeTimeSourceAdapter;
	}
}
