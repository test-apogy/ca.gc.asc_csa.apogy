package org.eclipse.symphony.common.emf.ui.composites;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.symphony.common.databinding.converters.DateToStringConverter;
import org.eclipse.symphony.common.emf.BrowseableTimeSource;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.TimeSource;

public class BrowseableTimeSourceComposite extends AbstractTimeSourceComposite 
{	
	protected BrowseableTimeSource browseableTimeSource;
	protected DataBindingContext bindingContext;	
	
	protected Spinner updatePeriodSpinner;	
	protected Spinner timeAccelerationSpinner;
	
	protected Label startTimeValueLabel;
	protected DateTime dateWidget;			
	protected DateTime timeWidget;
	protected Button setStartTimeButton;
	
	protected Button playReverseButton;
	protected Button playPauseButton;
	protected Button playForwardButton;
	protected Button playResetButton;

	public BrowseableTimeSourceComposite(Composite parent, int style) 
	{
		this(parent, style, null);		
	}

	public BrowseableTimeSourceComposite(Composite parent, int style, BrowseableTimeSource acceleratedTimeSource) 
	{
		super(parent, style);	
			
		createContent();
		
		setBrowseableTimeSource(acceleratedTimeSource);	
	}
	
	protected void createContent()
	{
		Composite top = new Composite(this, SWT.NONE);
		top.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));		
		top.setLayout(new GridLayout(1, true));
		
		// Setup Composite
		Composite setupComposite = createSettingsComposite(top, SWT.NONE);		
		GridData topGridData = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		setupComposite.setLayoutData(topGridData);
										
		// Buttons Composite for time direction controls and reset.
		Composite buttonsComposite = createButtonsComposite(top, SWT.NONE);
		GridData buttonsCompositeGridData = new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1);
		buttonsComposite.setLayoutData(buttonsCompositeGridData);
			
		// Start Time Composite
		Composite startTimeComposite = createStartTimeComposite(top, SWT.NONE);		
		GridData startTimeCompositeGridData = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		startTimeComposite.setLayoutData(startTimeCompositeGridData);				
	}
	
	@Override
	public void activate(boolean active) 
	{		
		if(updatePeriodSpinner != null) updatePeriodSpinner.setEnabled(active);	
		if(timeAccelerationSpinner != null) timeAccelerationSpinner.setEnabled(active);
		
		if(startTimeValueLabel != null) startTimeValueLabel.setEnabled(active);	
		if(dateWidget != null) dateWidget.setEnabled(active);			
		if(timeWidget != null) timeWidget.setEnabled(active);
		if(setStartTimeButton != null) setStartTimeButton.setEnabled(active);
		
		if(playReverseButton != null) playReverseButton.setEnabled(active);
		if(playPauseButton != null) playPauseButton.setEnabled(active);
		if(playForwardButton != null) playForwardButton.setEnabled(active);
		if(playResetButton != null) playResetButton.setEnabled(active);		
	}

	@Override
	public TimeSource getTimeSource() 
	{		
		return getBrowseableTimeSource() ;
	}

	public BrowseableTimeSource getBrowseableTimeSource() 
	{
		return browseableTimeSource;
	}

	public void setBrowseableTimeSource(BrowseableTimeSource acceleratedTimeSource) 
	{
		setBrowseableTimeSource(acceleratedTimeSource, true);
	}

	public void setBrowseableTimeSource(BrowseableTimeSource acceleratedTimeSource, boolean update) 
	{
		this.browseableTimeSource = acceleratedTimeSource;
		
		if(update)
		{
			if(bindingContext != null)
			{
				bindingContext.dispose();
				bindingContext = null;
			}
			
			if(acceleratedTimeSource != null)
			{
				bindingContext = initDataBindings();
				
				int periodDigits = updatePeriodSpinner.getDigits();
				updatePeriodSpinner.setSelection((int) Math.round(Math.pow(10, periodDigits) * acceleratedTimeSource.getUpdatePeriod() * 0.001));
				
				int accelerationDigits = timeAccelerationSpinner.getDigits();
				timeAccelerationSpinner.setSelection((int) Math.round(Math.pow(10, accelerationDigits) * acceleratedTimeSource.getTimeAcceration()));
				
				// Initialize date and time
				setStartDate(acceleratedTimeSource.getStartTime());
			}
		}
		
		super.setTimeSource(acceleratedTimeSource);
	}
	
	protected Composite createStartTimeComposite(Composite parent, int style)
	{
		Composite startTimeComposite = new Composite(parent, SWT.NONE);
		startTimeComposite.setLayout(new GridLayout(2, false));
							
		Label startTimeLabel = new Label(startTimeComposite, SWT.NONE);
		startTimeLabel.setText("Start Time : ");
		
		startTimeValueLabel = new Label(startTimeComposite, SWT.NONE);
		startTimeValueLabel.setText("?");
		GridData startTimeValueLabelGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		startTimeValueLabelGridData.widthHint = 250;
		startTimeValueLabelGridData.minimumWidth = 250;
		startTimeValueLabel.setLayoutData(startTimeValueLabelGridData);
		
		dateWidget = new DateTime (startTimeComposite, SWT.CALENDAR | SWT.NONE);	
		dateWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		
		timeWidget = new DateTime (startTimeComposite, SWT.TIME | SWT.LONG);
		timeWidget.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 2, 1));
		
		setStartTimeButton = new Button (startTimeComposite, SWT.PUSH);
		setStartTimeButton.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false, 2, 1));
		setStartTimeButton.setText ("Set Start Time");
		setStartTimeButton.addSelectionListener (new SelectionAdapter () 
		{
			@Override
			public void widgetSelected (SelectionEvent e) 
			{
				if(getBrowseableTimeSource() != null)
				{
					getBrowseableTimeSource().setStartTime(getSelectedStartDate());
				}
			}
		});
		
		return startTimeComposite;
	}
	
	protected Composite createSettingsComposite(Composite parent, int style)
	{
		Composite settingsComposite = new Composite(parent, style);
		settingsComposite.setLayout(new GridLayout(4, true));
		
		Label updatePeriodLabel = new Label(settingsComposite, SWT.None);
		updatePeriodLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		updatePeriodLabel.setText("Update period (s):");
		
		updatePeriodSpinner = new Spinner(settingsComposite, SWT.NONE);
		GridData updatePeriodSpinnerGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		updatePeriodSpinnerGridData.widthHint = 100;
		updatePeriodSpinnerGridData.minimumWidth = 100;
		updatePeriodSpinner.setLayoutData(updatePeriodSpinnerGridData);
		updatePeriodSpinner.setDigits(3);
		updatePeriodSpinner.setMinimum(1);
		updatePeriodSpinner.setMaximum(60000);
		updatePeriodSpinner.setIncrement(1);
		updatePeriodSpinner.setSelection(1000);
		
		updatePeriodSpinner.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				int selection = updatePeriodSpinner.getSelection();
				int digits = updatePeriodSpinner.getDigits();
				int period = (int) Math.round((selection / Math.pow(10, digits)) * 1000);								
				getBrowseableTimeSource().setUpdatePeriod(period);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		
		Label timeAccelerationLabel = new Label(settingsComposite, SWT.None);
		timeAccelerationLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		timeAccelerationLabel.setText("Time Acceleration:");
		
		timeAccelerationSpinner = new Spinner(settingsComposite, SWT.NONE);
		GridData timeAccelerationSpinnerGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		timeAccelerationSpinnerGridData.widthHint = 100;
		timeAccelerationSpinnerGridData.minimumWidth = 100;
		timeAccelerationSpinner.setLayoutData(timeAccelerationSpinnerGridData);
		timeAccelerationSpinner.setDigits(1);
		timeAccelerationSpinner.setMinimum(1);
		timeAccelerationSpinner.setMaximum(100000);
		timeAccelerationSpinner.setIncrement(1);
		timeAccelerationSpinner.setSelection(100);
		
		timeAccelerationSpinner.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				int selection = timeAccelerationSpinner.getSelection();
				int digits = timeAccelerationSpinner.getDigits();
				float acceleration = (float) (selection / Math.pow(10, digits));								
				getBrowseableTimeSource().setTimeAcceration(acceleration);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		
		return settingsComposite;
	}
	
	protected Composite createButtonsComposite(Composite parent, int style)
	{
		Composite buttonsComposite = new Composite(parent, style);		
		buttonsComposite.setLayout(new GridLayout(4, false));
				
		// RESET
		playResetButton= new Button(buttonsComposite, SWT.PUSH);
		GridData resetButtonGridData = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		resetButtonGridData.minimumWidth = 75;
		resetButtonGridData.widthHint = 75;
		playResetButton.setLayoutData(resetButtonGridData);		
		playResetButton.setText("Reset");		
		playResetButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(getBrowseableTimeSource() != null)
				{
					getBrowseableTimeSource().reset();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
				
		
		// REVERSE
		playReverseButton = new Button(buttonsComposite, SWT.PUSH);
		GridData reverseButtonGridData = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		reverseButtonGridData.minimumWidth = 75;
		reverseButtonGridData.widthHint = 75;
		playReverseButton.setLayoutData(reverseButtonGridData);		
		playReverseButton.setText("Reverse");
		playReverseButton.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(getBrowseableTimeSource() != null)
				{
					getBrowseableTimeSource().playReverse();
				}
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {								
			}
		});
		
		// PAUSE
		playPauseButton = new Button(buttonsComposite, SWT.PUSH);	
		GridData pauseButtonGridData = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		pauseButtonGridData.minimumWidth = 75;
		pauseButtonGridData.widthHint = 75;
		playPauseButton.setLayoutData(pauseButtonGridData);
		
		playPauseButton.setText("Pause");
		
		playPauseButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{				
				if(getBrowseableTimeSource() != null)
				{
					getBrowseableTimeSource().pause();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {				
			}
		});
		
		// FORWARD
		playForwardButton = new Button(buttonsComposite, SWT.PUSH);
		GridData forwardButtonGridData = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		forwardButtonGridData.minimumWidth = 75;
		forwardButtonGridData.widthHint = 75;
		playForwardButton.setLayoutData(forwardButtonGridData);
		
		playForwardButton.setText("Forward");
		playForwardButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(getBrowseableTimeSource() != null)
				{
					getBrowseableTimeSource().playForward();
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {		
			}
		});
		
		return buttonsComposite;		
	}
	
	protected Date getSelectedStartDate()
	{
		Date date = null;
				
		if(dateWidget != null && timeWidget != null)
		{
			int year = dateWidget.getYear();
			int month = dateWidget.getMonth();
			int day = dateWidget.getDay();
			
			int hrs = timeWidget.getHours();
			int min = timeWidget.getMinutes();
			int sec = timeWidget.getSeconds();
			
			Calendar calendar = new GregorianCalendar(year, month, day, hrs, min, sec);
			date = calendar.getTime();
		}
		
		return date;
	}
	
	protected void setStartDate(Date date)
	{
		if(date != null)
		{
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);			
			
			if(dateWidget != null)
			{							
				dateWidget.setDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
				dateWidget.redraw();
			}
			
			if(timeWidget != null)
			{
				timeWidget.setHours(calendar.get(Calendar.HOUR_OF_DAY));
				timeWidget.setMinutes(calendar.get(Calendar.MINUTE));
				timeWidget.setSeconds(calendar.get(Calendar.SECOND));			
			}
		}
	}
	
	protected DataBindingContext initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		
		// Bind startTime if applicable.
		if(startTimeValueLabel != null)
		{
			IObservableValue startTimeLabelValue = PojoProperties.value("text").observe(startTimeValueLabel);		
			IObservableValue startTimeObserveValue = EMFProperties.value(FeaturePath.fromList(Symphony__CommonEMFPackage.Literals.BROWSEABLE_TIME_SOURCE__START_TIME)).observe(getBrowseableTimeSource());			
			UpdateValueStrategy startTimeValueStrategy = new UpdateValueStrategy();
			startTimeValueStrategy.setConverter(new DateToStringConverter(new SimpleDateFormat(DATE_FORMAT_STRING)));
			bindingContext.bindValue(startTimeLabelValue, startTimeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), startTimeValueStrategy);
		}
		
		return bindingContext;
	}
	
}
