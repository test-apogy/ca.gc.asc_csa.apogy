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
import ca.gc.asc_csa.apogy.common.databinding.converters.DateToStringConverter;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.TimeSource;

public abstract class AbstractTimeSourceComposite extends Composite 
{	
	public static final String DATE_FORMAT_STRING = "yyyy.MM.dd HH:mm:ss.SSS z";
	
	protected Label timeSourceTimeValueLabel;
	
	private DataBindingContext bindingContext;
	
	public AbstractTimeSourceComposite(Composite parent, int style) 
	{
		super(parent, style);	
		setLayout(new GridLayout(1,false));
		
		Composite top = new Composite(this, SWT.NONE);
		top.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
		top.setLayout(new GridLayout(2, false));
		
		Label startTimeLabel = new Label(top, SWT.NONE);
		startTimeLabel.setText("Source Time : ");
		
		timeSourceTimeValueLabel = new Label(top, SWT.NONE);
		timeSourceTimeValueLabel.setText("?");
		GridData startTimeValueLabelGridData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		startTimeValueLabelGridData.widthHint = 250;
		startTimeValueLabelGridData.minimumWidth = 250;
		timeSourceTimeValueLabel.setLayoutData(startTimeValueLabelGridData);		
	}

	public abstract void activate(boolean active);
	
	public abstract TimeSource getTimeSource();
	
	public void setTimeSource(TimeSource timeSource)
	{
		if(bindingContext != null)
		{
			bindingContext.dispose();
			bindingContext = null;
		}
		
		if(timeSource != null)
		{
			bindingContext = initDataBindings();
		}
	}
	
	private DataBindingContext initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
						
		// Bind current time if applicable
		if(timeSourceTimeValueLabel != null)
		{
			IObservableValue timeSourceTimeLabelValue = PojoProperties.value("text").observe(timeSourceTimeValueLabel);		
			IObservableValue timeSourceTimeObserveValue = EMFProperties.value(FeaturePath.fromList(ApogyCommonEMFPackage.Literals.TIMED__TIME)).observe(getTimeSource());			
			UpdateValueStrategy timeSourceTimeValueStrategy = new UpdateValueStrategy();
			timeSourceTimeValueStrategy.setConverter(new DateToStringConverter(new SimpleDateFormat(DATE_FORMAT_STRING)));
			bindingContext.bindValue(timeSourceTimeLabelValue, timeSourceTimeObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), timeSourceTimeValueStrategy);
		}				
		return bindingContext;
	}	
}
