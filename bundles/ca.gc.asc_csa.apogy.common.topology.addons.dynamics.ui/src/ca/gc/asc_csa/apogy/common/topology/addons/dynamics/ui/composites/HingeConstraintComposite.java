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
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage.Literals;

public class HingeConstraintComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint hingeConstraint;
	private Button enabledButton;
	private ConstraintStateComposite currentAngularStateComposite;
	private Adapter constraintStatesAdapter;

	public HingeConstraintComposite(Composite parent, int style,
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint newHingeConstraint) {
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

	private DataBindingContext initDataBindings()
	{
		DataBindingContext bindingContext = new DataBindingContext();
		
		IObservableValue enabledObserveWidget = WidgetProperties.selection().observe(enabledButton);
		IObservableValue enabledObserveValue = EMFProperties.value(Literals.ABSTRACT_CONSTRAINT__ENABLED).observe(hingeConstraint);

		bindingContext.bindValue(enabledObserveWidget, enabledObserveValue,	null, null);

		return bindingContext;
	}

	public HingeConstraint getHingeConstraint()
	{
		return hingeConstraint;
	}

	public void setHingeConstraint(HingeConstraint newHingeConstraint) 
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
			ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint newHingeConstraint,
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
					if(msg.getFeature() == Literals.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE)
					{														
						currentAngularStateComposite.setConstraintState((ConstraintState)msg.getNewValue(), true);						
					}													
				};
			};
		}
		return constraintStatesAdapter;
	}
}
