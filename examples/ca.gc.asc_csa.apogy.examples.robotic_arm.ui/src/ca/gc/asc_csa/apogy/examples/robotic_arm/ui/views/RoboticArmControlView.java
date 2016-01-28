package org.eclipse.symphony.examples.robotic_arm.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.converters.ui.Symphony__CommonConvertersUIFacade;
import org.eclipse.symphony.common.ui.views.AbstractView;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;
import org.eclipse.symphony.examples.robotic_arm.ui.composites.RoboticArmControlComposite;

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
		List<Object> roboticArms = Symphony__CommonConvertersUIFacade.INSTANCE.convert(selection, RoboticArm.class);
		
		if (!roboticArms.isEmpty())
		{
			roboticArmControlComposite.setRoboticArm((RoboticArm) roboticArms.get(0));
		}
	}
}