package org.eclipse.symphony.common.topology.addons.dynamics.ui.composites;

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.common.databinding.converters.DoubleToStringConverter;

public class GearRatioConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint gearRatioConstraint;
	private Button enabledButton;
	private Text forceText;

	public GearRatioConstraintComposite(
			Composite parent,
			int style,
			org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint newGearRatioConstraint) {
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

	private DataBindingContext initDataBindings() {
		IObservableValue enabledObserveWidget = SWTObservables
				.observeSelection(enabledButton);
		IObservableValue enabledObserveValue = EMFObservables
				.observeValue(
						gearRatioConstraint,
						org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.ABSTRACT_CONSTRAINT__ENABLED);
		// Force
		IObservableValue forceObserveWidget = PojoObservables.observeValue(forceText, "text");	
		IObservableValue forceObserveValue = EMFObservables.observeValue(gearRatioConstraint,org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.GEAR_RATIO_CONSTRAINT__FORCE);
		UpdateValueStrategy forceUpdateValueStrategy = new UpdateValueStrategy();
		forceUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));		

		
		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,	null, null);
		
		bindingContext.bindValue(forceObserveWidget, forceObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), forceUpdateValueStrategy);
		//
		return bindingContext;
	}

	public org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint getGearRatioConstraint() {
		return gearRatioConstraint;
	}

	public void setGearRatioConstraint(
			org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint newGearRatioConstraint) {
		setGearRatioConstraint(newGearRatioConstraint, true);
	}

	public void setGearRatioConstraint(
			org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint newGearRatioConstraint,
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
