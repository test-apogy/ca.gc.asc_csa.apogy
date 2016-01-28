package ca.gc.asc_csa.apogy.examples.robotic_arm.ui.views;

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