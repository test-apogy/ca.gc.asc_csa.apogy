package org.eclipse.symphony.common.emf.ui.composites;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.symphony.common.databinding.converters.DateToStringConverter;
import org.eclipse.symphony.common.emf.CollectionTimedTimeSource;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.TimeSource;


public class CollectionTimedTimeSourceComposite extends BrowseableTimeSourceComposite 
{		
	private CollectionTimedTimeSource collectionTimedTimeSource;
	
	protected Adapter collectionTimedTimeSourceAdapter = null;
	
	// Looping
	protected Button loopingEnabledButton;
	
	// Jump Buttons
	protected Button jumpToNextButton;
	protected Button jumpToPreviousButton;
	
	// Time line controls.
	protected Label timeLineStartTimeValueLabel = null;	
	protected Label timeLineEndTimeValueLabel = null;
	protected Slider timeScale;
		
	public CollectionTimedTimeSourceComposite(Composite parent, int style, CollectionTimedTimeSource acceleratedTimeSource) 
	{
		super(parent, style, acceleratedTimeSource);				
		
		setCollectionTimedTimeSource(acceleratedTimeSource);
	}

	public CollectionTimedTimeSource getCollectionTimedTimeSource() 
	{
		return collectionTimedTimeSource;
	}

	public void setCollectionTimedTimeSource(CollectionTimedTimeSource collectionTimedTimeSource) 
	{
		if(this.collectionTimedTimeSource != null)
		{
			this.collectionTimedTimeSource.eAdapters().remove(getCollectionTimedTimeSourceAdapter());
		}
		
		this.collectionTimedTimeSource = collectionTimedTimeSource;
		
		if(collectionTimedTimeSource != null)
		{
			collectionTimedTimeSource.eAdapters().add(getCollectionTimedTimeSourceAdapter());
		}
		
		super.setBrowseableTimeSource(collectionTimedTimeSource);
	}	
	
	@Override
	protected void createContent() 
	{
		Composite top = new Composite(this, SWT.NONE);
		top.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, false));		
		top.setLayout(new GridLayout(1, true));
		
		// Setup Composite
		Composite setupComposite = createSettingsComposite(top, SWT.NONE);		
		GridData topGridData = new GridData(SWT.LEFT, SWT.TOP, true, false, 1, 1);
		setupComposite.setLayoutData(topGridData);
									
		// Time Line
		Composite timeLineComposite = createTimeLineComposite(top, SWT.NONE);
		GridData timeLineCompositeGridData = new GridData(SWT.LEFT, SWT.TOP, true, false, 1, 1);
		timeLineComposite.setLayoutData(timeLineCompositeGridData);
		
		// Buttons Composite for time direction controls and reset.
		Composite buttonsComposite = createButtonsComposite(top, SWT.NONE);
		GridData buttonsCompositeGridData = new GridData(SWT.LEFT, SWT.TOP, true, false, 1, 1);
		buttonsComposite.setLayoutData(buttonsCompositeGridData);	
	}
	
	@Override
	protected Composite createButtonsComposite(Composite parent, int style) 
	{
		Composite buttonsComposite = new Composite(parent, style);		
		buttonsComposite.setLayout(new GridLayout(6, false));
				
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
				
		// Jump Previous
		jumpToPreviousButton = new Button(buttonsComposite, SWT.PUSH);
		GridData jumpToPreviousButtonGridData = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		jumpToPreviousButtonGridData.minimumWidth = 75;
		jumpToPreviousButtonGridData.widthHint = 75;
		jumpToPreviousButton.setLayoutData(jumpToPreviousButtonGridData);		
		jumpToPreviousButton.setText("Previous");
		jumpToPreviousButton.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(getBrowseableTimeSource() != null)
				{
					getCollectionTimedTimeSource().jumpToPrevious();
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
		
		// Jump Next
		jumpToNextButton = new Button(buttonsComposite, SWT.PUSH);
		GridData jumpToNextButtonGridData = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		jumpToNextButtonGridData.minimumWidth = 75;
		jumpToNextButtonGridData.widthHint = 75;
		jumpToNextButton.setLayoutData(jumpToNextButtonGridData);		
		jumpToNextButton.setText("Next");
		jumpToNextButton.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				if(getBrowseableTimeSource() != null)
				{
					getCollectionTimedTimeSource().jumpToNext();
				}				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {								
			}
		});
		
		return buttonsComposite;		
	}
	
	@Override
	protected Composite createSettingsComposite(Composite parent, int style) 
	{
		Composite settingsComposite = new Composite(parent, style);
		settingsComposite.setLayout(new GridLayout(5, true));
		
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
			
		loopingEnabledButton = new Button(settingsComposite, SWT.CHECK);		
		loopingEnabledButton.setText("Loop Enable");
		
		return settingsComposite;
	}
	
	protected Composite createTimeLineComposite(Composite parent, int style)
	{
		Composite timeLineComposite = new Composite(parent, style);
		timeLineComposite.setLayout(new GridLayout(3, true));
		
		// Start Time Label
		Label startTimeLabel = new Label(timeLineComposite, SWT.NONE);
		startTimeLabel.setText("Start Time:");
		
		// Filler
		new Label(timeLineComposite, SWT.NONE);
		
		// End Time Label
		Label endTimeLabel = new Label(timeLineComposite, SWT.NONE);
		endTimeLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		endTimeLabel.setAlignment(SWT.RIGHT);
		endTimeLabel.setText("End Time:");
	
		
		// Start Time Value
		timeLineStartTimeValueLabel = new Label(timeLineComposite, SWT.NONE);
		GridData startTimeValueLabelGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		startTimeValueLabelGridData.minimumWidth = 225;
		startTimeValueLabelGridData.widthHint = 225;		
		timeLineStartTimeValueLabel.setLayoutData(startTimeValueLabelGridData);
		timeLineStartTimeValueLabel.setAlignment(SWT.LEFT);
		timeLineStartTimeValueLabel.setText("N/A");
		
		// Filler
		new Label(timeLineComposite, SWT.NONE);
		
		// End Time Value
		timeLineEndTimeValueLabel = new Label(timeLineComposite, SWT.NONE);
		GridData endTimeValueLabelGridData = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		endTimeValueLabelGridData.minimumWidth = 225;
		endTimeValueLabelGridData.widthHint = 225;		
		timeLineEndTimeValueLabel.setLayoutData(endTimeValueLabelGridData);
		timeLineEndTimeValueLabel.setAlignment(SWT.RIGHT);
		timeLineEndTimeValueLabel.setText("N/A");
		
		// Time slider
		timeScale = new Slider(timeLineComposite, SWT.HORIZONTAL);	
		timeScale.setDragDetect(true);
		timeScale.setThumb(1);
		timeScale.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		timeScale.setMinimum(0);
		timeScale.setMaximum(100);
		
		timeScale.addMouseListener(new MouseListener() 
		{	
			@Override
			public void mouseUp(MouseEvent e) 
			{
				if(getCollectionTimedTimeSource() != null)
				{
					 int selection = timeScale.getSelection();
					 
					 Date earliest = getCollectionTimedTimeSource().getEarliestDate();
					 Date latest = getCollectionTimedTimeSource().getLatestDate();
					 
					 if(earliest != null && latest != null)
					 {
						 long startTime = earliest.getTime();
						 long endTime = latest.getTime();
						 
						 long delta = (long) Math.round((selection / 100.0) * (endTime - startTime));
						 Date selectedTime = new Date(startTime + delta);
						 
						 System.out.println("selectedTime " + selectedTime);
						 
						 getCollectionTimedTimeSource().setTime(selectedTime);
					 }
				}
			}
			
			@Override
			public void mouseDown(MouseEvent e) 
			{
				if(getCollectionTimedTimeSource() != null)
				{					
					getCollectionTimedTimeSource().pause();
				}
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {				
			}
		});
		
		return timeLineComposite;
	}
	
	@Override
	protected DataBindingContext initDataBindings() 
	{
		DataBindingContext dataBindingContext = super.initDataBindings();
		
		// Bind StartTime.
		if(timeLineStartTimeValueLabel != null)
		{					
			IObservableValue startTimeLabelValue = PojoProperties.value("text").observe(timeLineStartTimeValueLabel);		
			IObservableValue startTimeObserveValue = EMFProperties.value(FeaturePath.fromList(EMFEcorePackage.Literals.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE)).observe(getTimeSource());			
			UpdateValueStrategy startTimeValueStrategy = new UpdateValueStrategy();
			startTimeValueStrategy.setConverter(new DateToStringConverter(new SimpleDateFormat(DATE_FORMAT_STRING)));
			dataBindingContext.bindValue(startTimeLabelValue, startTimeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), startTimeValueStrategy);
		}
		
		// Bind EndTime.
		if(timeLineEndTimeValueLabel != null)
		{
			IObservableValue endTimeLabelValue = PojoProperties.value("text").observe(timeLineEndTimeValueLabel);		
			IObservableValue endTimeObserveValue = EMFProperties.value(FeaturePath.fromList(EMFEcorePackage.Literals.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE)).observe(getTimeSource());			
			UpdateValueStrategy endTimeValueStrategy = new UpdateValueStrategy();
			endTimeValueStrategy.setConverter(new DateToStringConverter(new SimpleDateFormat(DATE_FORMAT_STRING)));
			dataBindingContext.bindValue(endTimeLabelValue, endTimeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), endTimeValueStrategy);
		}
		
		// Bind Loop
		if(loopingEnabledButton != null)
		{
			IObservableValue loopButtonValue = WidgetProperties.selection().observe(loopingEnabledButton);	
			IObservableValue loopObserveValue = EMFProperties.value(FeaturePath.fromList(EMFEcorePackage.Literals.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE)).observe(getTimeSource());			
			UpdateValueStrategy loopValueStrategy = new UpdateValueStrategy();		
			dataBindingContext.bindValue(loopButtonValue, loopObserveValue, loopValueStrategy, loopValueStrategy);
		}
		
		return dataBindingContext;
	}
	
	protected void setTimeScaleTime(Date time)
	{
		if(!timeScale.isDisposed())
		{
			if(getCollectionTimedTimeSource() != null)
			{			
				if(timeScale != null && time != null)
				{
					Date earliest = getCollectionTimedTimeSource().getEarliestDate();
					Date latest = getCollectionTimedTimeSource().getLatestDate();
					
					long timeSpan = latest.getTime() - earliest.getTime();
					long delta = time.getTime() - earliest.getTime();
					
					double ratio = 0.0;
					if(timeSpan != 0.0)
					{
						ratio = (double) delta / (double) timeSpan;	
					}
					
					int selection = (int) Math.round(timeScale.getMaximum() * ratio);
					timeScale.setSelection(selection);
					timeScale.setToolTipText(time.toString());
				}
			}
			else
			{
				timeScale.setSelection(0);
			}		
		}
	}
	
	protected Adapter getCollectionTimedTimeSourceAdapter()
	{
		if(collectionTimedTimeSourceAdapter == null)
		{
			collectionTimedTimeSourceAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(final Notification msg) 
				{
					if(msg.getNotifier() instanceof TimeSource)
					{
						int featureId = msg.getFeatureID(TimeSource.class);
						
						switch (featureId) 
						{
							case EMFEcorePackage.TIME_SOURCE__TIME:
							{
								if(msg.getNewValue() instanceof Date)
								{
									Display.getDefault().asyncExec(new Runnable() 
									{								
										@Override
										public void run() 
										{									
											Date currentTime = (Date) msg.getNewValue();
											setTimeScaleTime(currentTime);										
										}
									});													
								}
							}
							break;

							default:
							break;
						}						
					}
				}
			};
		}
		
		return collectionTimedTimeSourceAdapter;
	}
}
