package ca.gc.asc_csa.topology.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.topology.dynamics.GearRatioConstraint;
import ca.gc.asc_csa.topology.dynamics.ui.Activator;
import ca.gc.asc_csa.topology.dynamics.ui.composites.GearRatioConstraintComposite;

public class GearRatioConstraintView extends AbstractPinableView<GearRatioConstraint>
{
	private GearRatioConstraint gearRatioConstraint;
	public static final String ID = "ca.gc.asc_csa.topology.dynamics.ui.views.GearRatioConstraintView"; //$NON-NLS-1$

	private GearRatioConstraintComposite gearRatioConstraintComposite = null;
	
	public GearRatioConstraintView() {
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
		gearRatioConstraintComposite = new GearRatioConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public GearRatioConstraint getGearRatioConstraint() {
		return gearRatioConstraint;
	}

	public void setGearRatioConstraint(GearRatioConstraint gearRatioConstraint) {
		this.gearRatioConstraint = gearRatioConstraint;
		if(gearRatioConstraintComposite != null) gearRatioConstraintComposite.setGearRatioConstraint(this.gearRatioConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<GearRatioConstraint> getObjectClass() {
		return GearRatioConstraint.class;
	}

	@Override
	public void setObject(GearRatioConstraint object) {
		
		gearRatioConstraintComposite.setGearRatioConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this,  "Displayed GearRatioConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
