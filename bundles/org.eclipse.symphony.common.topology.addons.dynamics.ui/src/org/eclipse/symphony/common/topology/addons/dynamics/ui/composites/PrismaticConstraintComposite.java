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

public class PrismaticConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint prismaticConstraint;
	private Button enabledButton;	
	private ConstraintStateComposite linearConstraintStateComposite;
	
	private Adapter constraintStatesAdapter;

	public PrismaticConstraintComposite(
			Composite parent,
			int style,
			org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint newPrismaticConstraint) {
		this(parent, style);
		setPrismaticConstraint(newPrismaticConstraint);
	}

	public PrismaticConstraintComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		new Label(this, SWT.NONE).setText("Enabled:");

		enabledButton = new Button(this, SWT.CHECK);
		enabledButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false));
		
		Group grpCurrentLinearState = new Group(this, SWT.NONE);
		grpCurrentLinearState.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpCurrentLinearState.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		grpCurrentLinearState.setText("Current Linear State");
		
		linearConstraintStateComposite = new ConstraintStateComposite(grpCurrentLinearState, SWT.NONE);
		new Label(this, SWT.NONE);
		new Label(this, SWT.NONE);

		if (prismaticConstraint != null) {
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
						prismaticConstraint,
						org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage.Literals.ABSTRACT_CONSTRAINT__ENABLED);
		//
		DataBindingContext bindingContext = new DataBindingContext();
		//
		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,
				null, null);
		//
		return bindingContext;
	}

	public org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint getPrismaticConstraint() {
		return prismaticConstraint;
	}

	public void setPrismaticConstraint(org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint newPrismaticConstraint) 
	{
		// Unregister listener from previous PrismaticConstraint
		if(getPrismaticConstraint() != null)
		{
			getPrismaticConstraint().eAdapters().remove(getConstraintStatesAdapter());
		}
		
		setPrismaticConstraint(newPrismaticConstraint, true);
		
		if(newPrismaticConstraint != null)
		{
			// Register listener to the new PrismaticConstraint
			newPrismaticConstraint.eAdapters().add(getConstraintStatesAdapter());
						
			linearConstraintStateComposite.setConstraintState(newPrismaticConstraint.getLinearCurrentState());
		}
		else
		{			
			linearConstraintStateComposite.setConstraintState(null);
		}
	}

	public void setPrismaticConstraint(
			org.eclipse.symphony.common.topology.addons.dynamics.PrismaticConstraint newPrismaticConstraint,
			boolean update) {
		prismaticConstraint = newPrismaticConstraint;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (prismaticConstraint != null) {
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
					if(msg.getFeature() == TopologyDynamicsPackage.Literals.PRISMATIC_CONSTRAINT__LINEAR_CURRENT_STATE)
					{														
						linearConstraintStateComposite.setConstraintState((ConstraintState)msg.getNewValue(), true);						
					}													
				};
			};
		}
		return constraintStatesAdapter;
	}
}
