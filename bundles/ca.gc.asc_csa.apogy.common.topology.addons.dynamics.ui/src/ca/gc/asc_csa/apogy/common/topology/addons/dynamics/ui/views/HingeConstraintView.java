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
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.HingeConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites.HingeConstraintComposite;

public class HingeConstraintView extends AbstractPinableView<HingeConstraint>
{
	private HingeConstraint hingeConstraint;
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.PrismaticConstraintView"; //$NON-NLS-1$

	private HingeConstraintComposite hingeConstraintComposite = null;
	
	public HingeConstraintView() {
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
		hingeConstraintComposite = new HingeConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public HingeConstraint getHingeConstraint() {
		return hingeConstraint;
	}

	public void setHingeConstraint(HingeConstraint hingeConstraint) {
		this.hingeConstraint = hingeConstraint;
		if(hingeConstraintComposite != null) hingeConstraintComposite.setHingeConstraint(this.hingeConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<HingeConstraint> getObjectClass() {
		return HingeConstraint.class;
	}

	@Override
	public void setObject(HingeConstraint object) {
		
		hingeConstraintComposite.setHingeConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed PrismaticConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
