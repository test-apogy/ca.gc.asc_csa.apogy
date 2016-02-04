package ca.gc.asc_csa.apogy.examples.robotic_arm.ui.views;
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

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ui.composites.RoboticArmControlComposite;

public class RoboticArmControlView extends AbstractView
{
	/**
	 * This is the composite which has all of the content
	 * for the view.
	 */
	private RoboticArmControlComposite roboticArmControlComposite;
	
	@Override
	public void updatePartName()
	{
		// Nothing to do here
	}
	
	@Override
	public void createPartControl(Composite parent)
	{
		// Call the superclass's version of the method
		super.createPartControl(parent);
		
		// Create the control composite and attach it to
		// the scrolled composite
		this.roboticArmControlComposite = new RoboticArmControlComposite(parent, SWT.NONE);		
	}
	
	@Override
	public void updateSelection(ISelection selection)
	{
		// Attempt to get a robotic arm reference
		List<Object> roboticArms = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, RoboticArm.class);
		
		if (!roboticArms.isEmpty())
		{
			roboticArmControlComposite.setRoboticArm((RoboticArm) roboticArms.get(0));
		}
	}
}