package ca.gc.asc_csa.apogy.common.emf.ui.composites;
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

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import ca.gc.asc_csa.apogy.common.emf.FixedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;

public class FixedTimeSourceComposite extends AbstractTimeSourceComposite 
{
	protected FixedTimeSource fixedTimeSource;
	protected DataBindingContext bindingContext;	
	
	protected DateTime dateWidget;			
	protected DateTime timeWidget;
	protected Button applyButton;
	
	public FixedTimeSourceComposite(Composite parent, int style) 
	{
		this(parent, style, null);				
	}
	
	public FixedTimeSourceComposite(Composite parent, int style, FixedTimeSource fixedTimeSource) 
	{
		super(parent, style);
		
		
		Composite top = new Composite(this, SWT.NONE);
		top.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));		
		top.setLayout(new GridLayout(1, true));
		
		dateWidget = new DateTime (top, SWT.CALENDAR | SWT.NONE);				
		timeWidget = new DateTime (top, SWT.TIME | SWT.LONG);
				
		applyButton = new Button (top, SWT.PUSH);
		applyButton.setText ("Apply");
		GridData applyButtonGridData = new GridData (SWT.TOP, SWT.TOP, false, false);
		applyButtonGridData.minimumWidth = 100;
		applyButtonGridData.widthHint = 100;
		applyButton.setLayoutData(applyButtonGridData);
		applyButton.addSelectionListener (new SelectionAdapter () 
		{
			@Override
			public void widgetSelected (SelectionEvent e) 
			{
				if(getFixedTimeSource() != null)
				{
					getFixedTimeSource().setTime(getSelectedDate());
				}
			}
		});
		
		setFixedTimeSource(fixedTimeSource);
	}
	
	@Override
	public TimeSource getTimeSource() 
	{
		return getFixedTimeSource();
	}
	
	@Override
	public void activate(boolean active) 
	{
		dateWidget.setEnabled(active);
		timeWidget.setEnabled(active);
		applyButton.setEnabled(active);		
	}
	
	public FixedTimeSource getFixedTimeSource() 
	{
		return fixedTimeSource;
	}

	public void setFixedTimeSource(FixedTimeSource fixedTimeSource) 
	{
		setFixedTimeSource(fixedTimeSource, true);
	}
	
	public void setFixedTimeSource(FixedTimeSource fixedTimeSource, boolean update) 
	{
		this.fixedTimeSource = fixedTimeSource;
		
		if(update)
		{
			if(bindingContext != null)
			{
				bindingContext.dispose();
				bindingContext = null;
			}
			
			if(fixedTimeSource != null)
			{
				// Updates the displayed Date and Time
				setDate(fixedTimeSource.getTime());
				
				bindingContext = initDataBindings();
			}
		}
		
		super.setTimeSource(fixedTimeSource);
	}

	public Date getSelectedDate()
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
	
	protected void setDate(Date date)
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
		
		return bindingContext;
	}
	
}
