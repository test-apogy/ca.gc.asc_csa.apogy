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
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites.UniversalConstraintComposite;

public class UniversalConstraintView extends AbstractPinableView<UniversalConstraint>
{
	private UniversalConstraint prismaticConstraint;
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.UniversalConstraint"; //$NON-NLS-1$

	private UniversalConstraintComposite universalConstraintComposite = null;
	
	public UniversalConstraintView() {
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
		universalConstraintComposite = new UniversalConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public UniversalConstraint getUniversalConstraint() {
		return prismaticConstraint;
	}

	public void setUniversalConstraint(UniversalConstraint gearRatioConstraint) {
		this.prismaticConstraint = gearRatioConstraint;
		if(universalConstraintComposite != null) universalConstraintComposite.setUniversalConstraint(this.prismaticConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<UniversalConstraint> getObjectClass() {
		return UniversalConstraint.class;
	}

	@Override
	public void setObject(UniversalConstraint object) {
		
		universalConstraintComposite.setUniversalConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed UniversalConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}







