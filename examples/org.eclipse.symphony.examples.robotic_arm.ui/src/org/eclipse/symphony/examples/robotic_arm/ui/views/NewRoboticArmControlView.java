package org.eclipse.symphony.examples.robotic_arm.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.views.AbstractView;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;
import org.eclipse.symphony.examples.robotic_arm.ui.composites.NewRoboticArmControlComposite;

public class NewRoboticArmControlView extends AbstractView
{
	/**
	 * This is the composite which has all of the content
	 * for the view.
	 */
	private NewRoboticArmControlComposite roboticArmControlComposite;
	
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
		this.roboticArmControlComposite = new NewRoboticArmControlComposite(parent, SWT.NONE);		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void updateSelection(ISelection selection)
	{
		// Attempt to get a robotic arm reference
		List<RoboticArm> roboticArms = (List<RoboticArm>) org.eclipse.symphony.common.converters.Activator.convert(selection, RoboticArm.class);
		
		if (!roboticArms.isEmpty()){
			roboticArmControlComposite.setRoboticArm(roboticArms.get(0));
		}
	}
}