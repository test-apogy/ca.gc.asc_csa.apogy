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
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.common.databinding.converters.DoubleToStringConverter;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage.Literals;

public class GearRatioConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint gearRatioConstraint;
	private Button enabledButton;
	private Text forceText;

	public GearRatioConstraintComposite(
			Composite parent,
			int style,
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint newGearRatioConstraint) {
		this(parent, style);
		setGearRatioConstraint(newGearRatioConstraint);
	}

	public GearRatioConstraintComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE).setText("Enabled:");

		enabledButton = new Button(this, SWT.CHECK);
		enabledButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));

		new Label(this, SWT.NONE).setText("Force:");

		forceText = new Text(this, SWT.NONE);
		forceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		if (gearRatioConstraint != null) {
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
		
		// Enabled
		IObservableValue enabledObserveWidget = WidgetProperties.selection().observe(enabledButton);
		IObservableValue enabledObserveValue = EMFProperties.value(Literals.ABSTRACT_CONSTRAINT__ENABLED).observe(gearRatioConstraint);

		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,	null, null);
		
		// Force
		IObservableValue forceObserveWidget = PojoProperties.value("text").observe(forceText);	
		IObservableValue forceObserveValue = EMFProperties.value(Literals.GEAR_RATIO_CONSTRAINT__FORCE).observe(gearRatioConstraint);
		
		UpdateValueStrategy forceUpdateValueStrategy = new UpdateValueStrategy();
		forceUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));		
		
		bindingContext.bindValue(forceObserveWidget, forceObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), forceUpdateValueStrategy);
		
		return bindingContext;
	}

	public ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint getGearRatioConstraint() {
		return gearRatioConstraint;
	}

	public void setGearRatioConstraint(
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint newGearRatioConstraint) {
		setGearRatioConstraint(newGearRatioConstraint, true);
	}

	public void setGearRatioConstraint(
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.GearRatioConstraint newGearRatioConstraint,
			boolean update) {
		gearRatioConstraint = newGearRatioConstraint;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (gearRatioConstraint != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

}
