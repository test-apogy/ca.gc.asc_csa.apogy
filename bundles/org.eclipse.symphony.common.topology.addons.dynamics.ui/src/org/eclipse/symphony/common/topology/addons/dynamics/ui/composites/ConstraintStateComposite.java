package org.eclipse.symphony.common.topology.addons.dynamics.ui.composites;

import java.text.DecimalFormat;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.common.databinding.converters.DoubleToStringConverter;

public class ConstraintStateComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState constraintState;
	private Text forceText;
	private Text positionText;
	private Text velocityText;

	public ConstraintStateComposite(Composite parent, int style,
			org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState newConstraintState) {
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
		// Force
		IObservableValue forceObserveWidget = PojoObservables.observeValue(forceText, "text");	
		IObservableValue forceObserveValue = EMFObservables.observeValue(
						constraintState,
						org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.CONSTRAINT_STATE__FORCE);
		
		UpdateValueStrategy forceUpdateValueStrategy = new UpdateValueStrategy();
		forceUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));		
		
		// Position
		IObservableValue positionObserveWidget = PojoObservables.observeValue(positionText, "text");
		IObservableValue positionObserveValue = EMFObservables.observeValue(
						constraintState,
						org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.CONSTRAINT_STATE__POSITION);
		UpdateValueStrategy positionUpdateValueStrategy = new UpdateValueStrategy();
		positionUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));
		
		// Velocity
		IObservableValue velocityObserveWidget = PojoObservables.observeValue(velocityText, "text");
		IObservableValue velocityObserveValue = EMFObservables.observeValue(
						constraintState,
						org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.CONSTRAINT_STATE__VELOCITY);
		UpdateValueStrategy velocityUpdateValueStrategy = new UpdateValueStrategy();
		velocityUpdateValueStrategy.setConverter(new DoubleToStringConverter(new DecimalFormat("0.000")));
				
		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(forceObserveWidget, forceObserveValue, new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), forceUpdateValueStrategy);
		bindingContext.bindValue(positionObserveWidget, positionObserveValue,new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), positionUpdateValueStrategy);
		bindingContext.bindValue(velocityObserveWidget, velocityObserveValue,new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER), velocityUpdateValueStrategy);
		//
		return bindingContext;
	}

	public org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState getConstraintState() {
		return constraintState;
	}

	public void setConstraintState(
			org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState newConstraintState) {
		setConstraintState(newConstraintState, true);
	}

	public void setConstraintState(
			org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState newConstraintState,
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
