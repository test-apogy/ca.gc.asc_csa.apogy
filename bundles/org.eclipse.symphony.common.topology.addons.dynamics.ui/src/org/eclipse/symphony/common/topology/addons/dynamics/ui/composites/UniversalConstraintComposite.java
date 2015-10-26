package org.eclipse.symphony.common.topology.addons.dynamics.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage.Literals;
import org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint;

public class UniversalConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint universalConstraint;
	private Button enabledButton;
	private ConstraintStateComposite angular0ConstraintStateComposite;
	private ConstraintStateComposite angular1ConstraintStateComposite;
	private Adapter constraintStatesAdapter;

	public UniversalConstraintComposite(
			Composite parent,
			int style,
			org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint newUniversalConstraint) {
		this(parent, style);
		setUniversalConstraint(newUniversalConstraint);
	}

	public UniversalConstraintComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE).setText("Enabled:");

		enabledButton = new Button(this, SWT.CHECK);
		enabledButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));
		
		Group grpAngularCurrent = new Group(this, SWT.NONE);
		grpAngularCurrent.setText("Angular 0 Current State");
		grpAngularCurrent.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		grpAngularCurrent.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		angular0ConstraintStateComposite = new ConstraintStateComposite(grpAngularCurrent, SWT.NONE);
		
		Group grpAngularCurrent_1 = new Group(this, SWT.NONE);
		grpAngularCurrent_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpAngularCurrent_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		grpAngularCurrent_1.setText("Angular 1 Current State");
		
		angular1ConstraintStateComposite = new ConstraintStateComposite(grpAngularCurrent_1, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

		if (universalConstraint != null) {
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

		IObservableValue enabledObserveWidget = WidgetProperties.selection().observe(enabledButton);
		IObservableValue enabledObserveValue = EMFProperties.value(Literals.ABSTRACT_CONSTRAINT__ENABLED).observe(universalConstraint);

		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,	null, null);

		return bindingContext;
	}

	public UniversalConstraint getUniversalConstraint() {
		return universalConstraint;
	}

	public void setUniversalConstraint(UniversalConstraint newUniversalConstraint) 
	{
		// Unregister listener from previous CylindricalConstraint
		if(getUniversalConstraint() != null)
		{
			getUniversalConstraint().eAdapters().remove(getConstraintStatesAdapter());
		}
		
		setUniversalConstraint(newUniversalConstraint, true);
		
		if(newUniversalConstraint != null)
		{
			// Register listener to the new CylindricalConstraint
			newUniversalConstraint.eAdapters().add(getConstraintStatesAdapter());
			
			angular0ConstraintStateComposite.setConstraintState(newUniversalConstraint.getAngular0CurrentState());
			angular1ConstraintStateComposite.setConstraintState(newUniversalConstraint.getAngular1CurrentState());
		}
		else
		{
			angular0ConstraintStateComposite.setConstraintState(null);
			angular1ConstraintStateComposite.setConstraintState(null);
		}				
	}

	public void setUniversalConstraint(
			org.eclipse.symphony.common.topology.addons.dynamics.UniversalConstraint newUniversalConstraint,
			boolean update) {
		universalConstraint = newUniversalConstraint;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (universalConstraint != null) {
				m_bindingContext = initDataBindings();
			}
			else
			{
				enabledButton.setSelection(false);
			}
		}
	}
	
	private Adapter getConstraintStatesAdapter()
	{
		if(constraintStatesAdapter == null)
		{
			constraintStatesAdapter = new AdapterImpl()
			{
				public void notifyChanged(org.eclipse.emf.common.notify.Notification msg) 
				{										
					// If the angular current state has been changed.
					if(msg.getFeature() == Literals.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE)
					{														
						angular0ConstraintStateComposite.setConstraintState((ConstraintState)msg.getNewValue(), true);						
					}
					// If the linear current state has been changed.
					else if(msg.getFeature() == Literals.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE)
					{
						angular1ConstraintStateComposite.setConstraintState((ConstraintState)msg.getNewValue());
					}										
				};
			};
		}
		return constraintStatesAdapter;
	}
}
