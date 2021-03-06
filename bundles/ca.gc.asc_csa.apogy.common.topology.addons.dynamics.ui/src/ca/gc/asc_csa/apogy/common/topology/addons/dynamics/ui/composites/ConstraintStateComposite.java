package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites;
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

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.common.databinding.converters.DoubleToStringConverter;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage.Literals;

public class ConstraintStateComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState constraintState;
	private Text forceText;
	private Text positionText;
	private Text velocityText;

	public ConstraintStateComposite(Composite parent, int style,
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState newConstraintState) {
		this(parent, style);
		setConstraintState(newConstraintState);
	}

	public ConstraintStateComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE).setText("Force:");

		forceText = new Text(this, SWT.NONE);
		forceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		new Label(this, SWT.NONE).setText("Position:");

		positionText = new Text(this, SWT.NONE);
		positionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,	false));

		new Label(this, SWT.NONE).setText("Velocity:");

		velocityText = new Text(this, SWT.NONE);
		velocityText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,	false));

		if (constraintState != null) 
		{
			m_bindingContext = initDataBindings();
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	private DataBindingContext initDataBindings() 
	{
		DataBindingContext bindingContext = new DataBindingContext();
		
		// Force
		IObservableValue forceObserveWidget = PojoProperties.value("text").observe(forceText);	
		IObservableValue forceObserveValue = EMFProperties.value(Literals.CONSTRAINT_STATE__FORCE).observe(constraintState);
		
		UpdateValueStrategy forceUpdateValueStrategy = new UpdateValueStrategy();
		forceUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));
		
		bindingContext.bindValue(forceObserveWidget, forceObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), forceUpdateValueStrategy);
		
		// Position
		IObservableValue positionObserveWidget = PojoProperties.value("text").observe(positionText);
		IObservableValue positionObserveValue = EMFProperties.value(Literals.CONSTRAINT_STATE__POSITION).observe(constraintState);
		
		UpdateValueStrategy positionUpdateValueStrategy = new UpdateValueStrategy();
		positionUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));
		
		bindingContext.bindValue(positionObserveWidget, positionObserveValue,new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), positionUpdateValueStrategy);
		
		// Velocity
		IObservableValue velocityObserveWidget = PojoProperties.value("text").observe(velocityText);
		IObservableValue velocityObserveValue = EMFProperties.value(Literals.CONSTRAINT_STATE__VELOCITY).observe(constraintState);
		
		UpdateValueStrategy velocityUpdateValueStrategy = new UpdateValueStrategy();
		velocityUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));
		
		bindingContext.bindValue(velocityObserveWidget, velocityObserveValue,new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), velocityUpdateValueStrategy);
		
		return bindingContext;
	}

	public ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState getConstraintState() {
		return constraintState;
	}

	public void setConstraintState(
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState newConstraintState) {
		setConstraintState(newConstraintState, true);
	}

	public void setConstraintState(
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState newConstraintState,
			boolean update) {
		constraintState = newConstraintState;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (constraintState != null) {
				m_bindingContext = initDataBindings();
			}
			else
			{
				// Clear the displayed value
				forceText.setText("");
				velocityText.setText("");
				positionText.setText("");
			}
		}
	}

}
