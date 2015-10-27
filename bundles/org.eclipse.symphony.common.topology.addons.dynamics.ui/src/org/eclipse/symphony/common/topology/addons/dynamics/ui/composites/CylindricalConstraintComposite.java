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
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyAddonsDynamicsPackage.Literals;

public class CylindricalConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint cylindricalConstraint;
	private Button enabledButton;
	
	private ConstraintStateComposite angularConstraintStateComposite;
	private ConstraintStateComposite linearConstraintStateComposite;
	
	private Adapter constraintStatesAdapter;

	public CylindricalConstraintComposite(
			Composite parent,
			int style,
			org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint newCylindricalConstraint) {
		this(parent, style);
		setCylindricalConstraint(newCylindricalConstraint);
	}

	public CylindricalConstraintComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE).setText("Enabled:");

		enabledButton = new Button(this, SWT.CHECK);
		enabledButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));
		
		Group angularCurrentStateGroup = new Group(this, SWT.NONE);
		angularCurrentStateGroup.setText("Current Angular State");
		angularCurrentStateGroup.setLayout(new FillLayout(SWT.HORIZONTAL));
		angularCurrentStateGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		angularConstraintStateComposite = new ConstraintStateComposite(angularCurrentStateGroup, SWT.NONE);
		
		Group linearCurrentStateGroup = new Group(this, SWT.NONE);
		linearCurrentStateGroup.setText("Current Linear State");
		linearCurrentStateGroup.setLayout(new FillLayout(SWT.HORIZONTAL));
		linearCurrentStateGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		
		linearConstraintStateComposite = new ConstraintStateComposite(linearCurrentStateGroup, SWT.NONE);		
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

		if (cylindricalConstraint != null) {
			m_bindingContext = initDataBindings();
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	private DataBindingContext initDataBindings() {
		IObservableValue enabledObserveWidget = WidgetProperties.selection().observe(enabledButton);
		IObservableValue enabledObserveValue = EMFProperties.value(Literals.ABSTRACT_CONSTRAINT__ENABLED).observe(cylindricalConstraint);

		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,	null, null);
		//
		return bindingContext;
	}

	public org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint getCylindricalConstraint() {
		return cylindricalConstraint;
	}

	public void setCylindricalConstraint(org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint newCylindricalConstraint) 
	{
		// Unregister listener from previous CylindricalConstraint
		if(getCylindricalConstraint() != null)
		{
			getCylindricalConstraint().eAdapters().remove(getConstraintStatesAdapter());
		}
		
		setCylindricalConstraint(newCylindricalConstraint, true);
		
		if(newCylindricalConstraint != null)
		{
			// Register listener to the new CylindricalConstraint
			newCylindricalConstraint.eAdapters().add(getConstraintStatesAdapter());
			
			angularConstraintStateComposite.setConstraintState(newCylindricalConstraint.getAngularCurrentState());
			linearConstraintStateComposite.setConstraintState(newCylindricalConstraint.getLinearCurrentState());
		}
		else
		{
			angularConstraintStateComposite.setConstraintState(null);
			linearConstraintStateComposite.setConstraintState(null);
		}
	}

	public void setCylindricalConstraint(
			org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint newCylindricalConstraint,
			boolean update) {
		cylindricalConstraint = newCylindricalConstraint;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (cylindricalConstraint != null) {
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
					if(msg.getFeature() == Literals.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE)
					{														
						angularConstraintStateComposite.setConstraintState((ConstraintState)msg.getNewValue(), true);						
					}
					// If the linear current state has been changed.
					else if(msg.getFeature() == Literals.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE)
					{
						linearConstraintStateComposite.setConstraintState((ConstraintState)msg.getNewValue());
					}										
				};
			};
		}
		return constraintStatesAdapter;
	}
}
