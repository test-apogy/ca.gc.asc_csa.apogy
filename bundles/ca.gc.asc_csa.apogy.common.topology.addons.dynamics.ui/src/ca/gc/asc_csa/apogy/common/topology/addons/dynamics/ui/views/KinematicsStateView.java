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
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites.KinematicStateComposite;

public class KinematicsStateView extends AbstractPinableView<KinematicState>
{
	private KinematicState kinematicState;
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.KinematicsStateView"; //$NON-NLS-1$

	private KinematicStateComposite kinematicStateComposite = null;
	
	public KinematicsStateView() {
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
		kinematicStateComposite = new KinematicStateComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public KinematicState getKinematicState() {
		return kinematicState;
	}

	public void setKinematicState(KinematicState kinematicState) {
		this.kinematicState = kinematicState;
		if(kinematicStateComposite != null) kinematicStateComposite.setKinematicState(this.kinematicState);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<KinematicState> getObjectClass() {
		return KinematicState.class;
	}

	@Override
	public void setObject(KinematicState object) {
		
		kinematicStateComposite.setKinematicState(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed KinematicState updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
