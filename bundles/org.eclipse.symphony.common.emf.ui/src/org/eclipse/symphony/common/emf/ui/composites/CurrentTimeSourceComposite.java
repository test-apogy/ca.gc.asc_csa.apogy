package org.eclipse.symphony.common.emf.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.symphony.common.emf.CurrentTimeSource;
import org.eclipse.symphony.common.emf.TimeSource;

public class CurrentTimeSourceComposite extends AbstractTimeSourceComposite 
{
	protected CurrentTimeSource currentTimeSource;
	protected DataBindingContext bindingContext;	
	
	protected Spinner updatePeriodSpinner;	
	protected Button resumeButton;
	protected Button pauseButton;
	
	public CurrentTimeSourceComposite(Composite parent, int style) 
	{
		this(parent, style, null);				
	}
	
	public CurrentTimeSourceComposite(Composite parent, int style, CurrentTimeSource currentTimeSource) 
	{
		super(parent, style);
		
		Composite top = new Composite(this, SWT.NONE);
		top.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		top.setLayout(new GridLayout(2, true));		
				
		Label updatePeriodLabel = new Label(top, SWT.None);
		updatePeriodLabel.setText("Update period (s):");
		updatePeriodSpinner = new Spinner(top, SWT.NONE);
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
				
				getCurrentTimeSource().setUpdatePeriod(period);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		
		pauseButton = new Button(top, SWT.PUSH);
		pauseButton.setText("Pause");
		pauseButton.addSelectionListener(new SelectionListener() 
		{		
			@Override
			public void widgetSelected(SelectionEvent e) 
			{				
				getCurrentTimeSource().pause();		
				pauseButton.setEnabled(false);
				resumeButton.setEnabled(true);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {				
			}
		});
						
		resumeButton = new Button(top, SWT.PUSH);
		resumeButton.setText("Run");
		resumeButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				getCurrentTimeSource().resume();
				pauseButton.setEnabled(true);
				resumeButton.setEnabled(false);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		
		setCurrentTimeSource(currentTimeSource);				
	}
	
	@Override
	public TimeSource getTimeSource() 
	{		
		return getCurrentTimeSource() ;
	}
	
	@Override
	public void activate(boolean active) 
	{
		if(active)
		{
			updatePeriodSpinner.setEnabled(true);
			pauseButton.setEnabled(true);
			resumeButton.setEnabled(true);
		}
		else
		{
			updatePeriodSpinner.setEnabled(false);
			pauseButton.setEnabled(false);
			resumeButton.setEnabled(false);
		}
	}
	
	public CurrentTimeSource getCurrentTimeSource() 
	{
		return currentTimeSource;
	}

	public void setCurrentTimeSource(CurrentTimeSource currentTimeSource) 
	{
		setCurrentTimeSource(currentTimeSource, true);
	}
	
	public void setCurrentTimeSource(CurrentTimeSource currentTimeSource, boolean update) 
	{
		this.currentTimeSource = currentTimeSource;
		
		if(update)
		{
			if(bindingContext != null)
			{
				bindingContext.dispose();
				bindingContext = null;
			}
			
			if(currentTimeSource != null)
			{
				bindingContext = initDataBindings();
				
				if(updatePeriodSpinner != null)
				{
					int periodDigits = updatePeriodSpinner.getDigits();
					updatePeriodSpinner.setSelection((int) Math.round(Math.pow(10, periodDigits) * currentTimeSource.getUpdatePeriod() * 0.001));
				}
				
				if(currentTimeSource.isPaused()) 
				{
					pauseButton.setEnabled(false);
					resumeButton.setEnabled(true);
				}
				else
				{
					pauseButton.setEnabled(true);
					resumeButton.setEnabled(false);
				}
			}
			else
			{
				pauseButton.setEnabled(false);
				resumeButton.setEnabled(false);				
			}
		}
		
		super.setTimeSource(currentTimeSource);
	}

	protected DataBindingContext initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
						
		return bindingContext;
	}	
}
