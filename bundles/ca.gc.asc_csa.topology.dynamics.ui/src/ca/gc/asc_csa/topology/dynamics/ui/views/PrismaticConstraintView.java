package ca.gc.asc_csa.topology.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.topology.dynamics.PrismaticConstraint;
import ca.gc.asc_csa.topology.dynamics.ui.Activator;
import ca.gc.asc_csa.topology.dynamics.ui.composites.PrismaticConstraintComposite;

public class PrismaticConstraintView extends AbstractPinableView<PrismaticConstraint>
{
	private PrismaticConstraint prismaticConstraint;
	public static final String ID = "ca.gc.asc_csa.topology.dynamics.ui.views.PrismaticConstraintView"; //$NON-NLS-1$

	private PrismaticConstraintComposite prismaticConstraintCompositeComposite = null;
	
	public PrismaticConstraintView() {
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
		prismaticConstraintCompositeComposite = new PrismaticConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public PrismaticConstraint getPrismaticConstraint() {
		return prismaticConstraint;
	}

	public void setPrismaticConstraint(PrismaticConstraint gearRatioConstraint) {
		this.prismaticConstraint = gearRatioConstraint;
		if(prismaticConstraintCompositeComposite != null) prismaticConstraintCompositeComposite.setPrismaticConstraint(this.prismaticConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<PrismaticConstraint> getObjectClass() {
		return PrismaticConstraint.class;
	}

	@Override
	public void setObject(PrismaticConstraint object) {
		
		prismaticConstraintCompositeComposite.setPrismaticConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed PrismaticConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
