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
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage.Literals;

public class PrismaticConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint prismaticConstraint;
	private Button enabledButton;	
	private ConstraintStateComposite linearConstraintStateComposite;
	
	private Adapter constraintStatesAdapter;

	public PrismaticConstraintComposite(
			Composite parent,
			int style,
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint newPrismaticConstraint) {
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

	private DataBindingContext initDataBindings()
	{
		DataBindingContext bindingContext = new DataBindingContext();

		IObservableValue enabledObserveWidget = WidgetProperties.selection().observe(enabledButton);
		IObservableValue enabledObserveValue = EMFProperties.value(Literals.ABSTRACT_CONSTRAINT__ENABLED).observe(prismaticConstraint);

		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,	null, null);

		return bindingContext;
	}

	public ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint getPrismaticConstraint() {
		return prismaticConstraint;
	}

	public void setPrismaticConstraint(ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint newPrismaticConstraint) 
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
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint newPrismaticConstraint,
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
					if(msg.getFeature() == Literals.PRISMATIC_CONSTRAINT__LINEAR_CURRENT_STATE)
					{														
						linearConstraintStateComposite.setConstraintState((ConstraintState)msg.getNewValue(), true);						
					}													
				};
			};
		}
		return constraintStatesAdapter;
	}
}
