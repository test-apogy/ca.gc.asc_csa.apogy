package org.eclipse.symphony.common.topology.addons.dynamics.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

public class HingeConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint hingeConstraint;
	private Button enabledButton;
	private ConstraintStateComposite currentAngularStateComposite;
	private Adapter constraintStatesAdapter;

	public HingeConstraintComposite(Composite parent, int style,
			org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint newHingeConstraint) {
		this(parent, style);
		setHingeConstraint(newHingeConstraint);
	}

	public HingeConstraintComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE).setText("Enabled:");

		enabledButton = new Button(this, SWT.CHECK);
		enabledButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));
		
		Group currentAngularStateGroup = new Group(this, SWT.NONE);
		currentAngularStateGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		currentAngularStateGroup.setText("Current Angular State");
		currentAngularStateGroup.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		currentAngularStateComposite = new ConstraintStateComposite(currentAngularStateGroup, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

		if (hingeConstraint != null) {
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
						hingeConstraint,
						org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.ABSTRACT_CONSTRAINT__ENABLED);
		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,
				null, null);
		//
		return bindingContext;
	}

	public org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint getHingeConstraint() {
		return hingeConstraint;
	}

	public void setHingeConstraint(org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint newHingeConstraint) 
	{			
		// Unregister listener from previous HingeConstraint
		if(getHingeConstraint() != null)
		{
			getHingeConstraint().eAdapters().remove(getConstraintStatesAdapter());
		}
		
		setHingeConstraint(newHingeConstraint, true);
		
		if(newHingeConstraint != null)
		{
			// Register listener to the new HingeConstraint
			newHingeConstraint.eAdapters().add(getConstraintStatesAdapter());
						
			currentAngularStateComposite.setConstraintState(newHingeConstraint.getAngularCurrentState());
		}
		else
		{			
			currentAngularStateComposite.setConstraintState(null);
		}
	}

	public void setHingeConstraint(
			org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint newHingeConstraint,
			boolean update) {
		hingeConstraint = newHingeConstraint;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (hingeConstraint != null) {
				m_bindingContext = initDataBindings();
			}
			else
			{
				enabledButton.setEnabled(false);
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
					if(msg.getFeature() == TopologyDynamicsPackage.Literals.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE)
					{														
						currentAngularStateComposite.setConstraintState((ConstraintState)msg.getNewValue(), true);						
					}													
				};
			};
		}
		return constraintStatesAdapter;
	}
}
