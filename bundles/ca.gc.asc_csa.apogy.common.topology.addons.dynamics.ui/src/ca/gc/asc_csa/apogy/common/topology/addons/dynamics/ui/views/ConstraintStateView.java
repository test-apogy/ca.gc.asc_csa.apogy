package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views;
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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites.ConstraintStateComposite;

public class ConstraintStateView extends AbstractPinableView<ConstraintState>
{
	private ConstraintState constraintState;
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.ConstraintStateView"; //$NON-NLS-1$

	private ConstraintStateComposite constraintStateComposite = null;
	
	public ConstraintStateView() {
	}
	
	/**
	 * Create contents of the view part.
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) 
	{
		super.createPartControl(parent);
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout(SWT.HORIZONTAL));
		constraintStateComposite = new ConstraintStateComposite(container, SWT.None);
		
		createActions();
		
		getSite().getPage().addSelectionListener(this);
	}

	public ConstraintState getConstraintState() {
		return constraintState;
	}

	public void setConstraintState(ConstraintState constraintState) {
		
		this.constraintState = constraintState;
		if(constraintState != null) constraintStateComposite.setConstraintState(this.constraintState);
	}
	
	@Override
	public Class<ConstraintState> getObjectClass() 
	{
		return ConstraintState.class;
	}

	@Override
	public void setFocus() {
	}
	
	@Override
	public void setObject(ConstraintState object) 
	{
		constraintStateComposite.setConstraintState(object);		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed ConstraintState updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
