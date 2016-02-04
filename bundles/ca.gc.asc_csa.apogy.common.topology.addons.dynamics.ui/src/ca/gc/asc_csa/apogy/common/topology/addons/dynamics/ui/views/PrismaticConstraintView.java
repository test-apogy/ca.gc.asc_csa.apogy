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
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PrismaticConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites.PrismaticConstraintComposite;

public class PrismaticConstraintView extends AbstractPinableView<PrismaticConstraint>
{
	private PrismaticConstraint prismaticConstraint;
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.PrismaticConstraintView"; //$NON-NLS-1$

	private PrismaticConstraintComposite prismaticConstraintCompositeComposite = null;
	
	public PrismaticConstraintView() {
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
		prismaticConstraintCompositeComposite = new PrismaticConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public PrismaticConstraint getPrismaticConstraint() {
		return prismaticConstraint;
	}

	public void setPrismaticConstraint(PrismaticConstraint gearRatioConstraint) {
		this.prismaticConstraint = gearRatioConstraint;
		if(prismaticConstraintCompositeComposite != null) prismaticConstraintCompositeComposite.setPrismaticConstraint(this.prismaticConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<PrismaticConstraint> getObjectClass() {
		return PrismaticConstraint.class;
	}

	@Override
	public void setObject(PrismaticConstraint object) {
		
		prismaticConstraintCompositeComposite.setPrismaticConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed PrismaticConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
