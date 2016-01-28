package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.RPROConstraint;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.composites.RPROConstraintComposite;

public class RPROConstraintView extends AbstractPinableView<RPROConstraint>
{
	private RPROConstraint rPROConstraint;
	public static final String ID = "ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ui.views.RPROConstraintView"; //$NON-NLS-1$

	private RPROConstraintComposite rPROConstraintCompositeComposite = null;
	
	public RPROConstraintView() {
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
		rPROConstraintCompositeComposite = new RPROConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public RPROConstraint getRPROConstraint() {
		return rPROConstraint;
	}

	public void setRPROConstraint(RPROConstraint rPROConstraint) {
		this.rPROConstraint = rPROConstraint;
		if(rPROConstraintCompositeComposite != null) rPROConstraintCompositeComposite.setRPROConstraint(this.rPROConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<RPROConstraint> getObjectClass() {
		return RPROConstraint.class;
	}

	@Override
	public void setObject(RPROConstraint object) {
		
		rPROConstraintCompositeComposite.setRPROConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed RPROConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
