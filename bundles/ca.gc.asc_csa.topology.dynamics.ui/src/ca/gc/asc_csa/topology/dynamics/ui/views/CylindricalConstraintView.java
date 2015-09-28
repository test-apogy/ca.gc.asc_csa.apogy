package ca.gc.asc_csa.topology.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.topology.dynamics.CylindricalConstraint;
import ca.gc.asc_csa.topology.dynamics.ui.Activator;
import ca.gc.asc_csa.topology.dynamics.ui.composites.CylindricalConstraintComposite;

public class CylindricalConstraintView extends AbstractPinableView<CylindricalConstraint>
{
	private CylindricalConstraint cylindricalConstraint;
	public static final String ID = "ca.gc.asc_csa.topology.dynamics.ui.views.CylindricalConstraintView"; //$NON-NLS-1$

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
