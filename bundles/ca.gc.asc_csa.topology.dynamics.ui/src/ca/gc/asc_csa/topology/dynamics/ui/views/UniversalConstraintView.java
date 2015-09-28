package ca.gc.asc_csa.topology.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.topology.dynamics.UniversalConstraint;
import ca.gc.asc_csa.topology.dynamics.ui.Activator;
import ca.gc.asc_csa.topology.dynamics.ui.composites.UniversalConstraintComposite;

public class UniversalConstraintView extends AbstractPinableView<UniversalConstraint>
{
	private UniversalConstraint prismaticConstraint;
	public static final String ID = "ca.gc.asc_csa.topology.dynamics.ui.views.UniversalConstraint"; //$NON-NLS-1$

	private UniversalConstraintComposite universalConstraintComposite = null;
	
	public UniversalConstraintView() {
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
		universalConstraintComposite = new UniversalConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public UniversalConstraint getUniversalConstraint() {
		return prismaticConstraint;
	}

	public void setUniversalConstraint(UniversalConstraint gearRatioConstraint) {
		this.prismaticConstraint = gearRatioConstraint;
		if(universalConstraintComposite != null) universalConstraintComposite.setUniversalConstraint(this.prismaticConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<UniversalConstraint> getObjectClass() {
		return UniversalConstraint.class;
	}

	@Override
	public void setObject(UniversalConstraint object) {
		
		universalConstraintComposite.setUniversalConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed UniversalConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}







