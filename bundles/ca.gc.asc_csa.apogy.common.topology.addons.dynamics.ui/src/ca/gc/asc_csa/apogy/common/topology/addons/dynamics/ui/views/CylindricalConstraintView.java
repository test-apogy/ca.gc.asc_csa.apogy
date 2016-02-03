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
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites.CylindricalConstraintComposite;

public class CylindricalConstraintView extends AbstractPinableView<CylindricalConstraint>
{
	private CylindricalConstraint cylindricalConstraint;
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.CylindricalConstraintView"; //$NON-NLS-1$

	private CylindricalConstraintComposite cylindricalConstraintComposite = null;
	
	public CylindricalConstraintView() {
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
		cylindricalConstraintComposite = new CylindricalConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public CylindricalConstraint getCylindricalConstraint() {
		return cylindricalConstraint;
	}

	public void setCylindricalConstraint(CylindricalConstraint cylindricalConstraint) {
		this.cylindricalConstraint = cylindricalConstraint;
		if(cylindricalConstraintComposite != null) cylindricalConstraintComposite.setCylindricalConstraint(this.cylindricalConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<CylindricalConstraint> getObjectClass() {
		return CylindricalConstraint.class;
	}

	@Override
	public void setObject(CylindricalConstraint object) {
		
		cylindricalConstraintComposite.setCylindricalConstraint(object);
		
		// Logs a message to says the SMA has been set.
		Logger.INSTANCE.log(Activator.ID, this, "Displayed CylindricalConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
