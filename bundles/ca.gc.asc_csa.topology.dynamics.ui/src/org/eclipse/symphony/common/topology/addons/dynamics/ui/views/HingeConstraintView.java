package org.eclipse.symphony.common.topology.addons.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.ui.Activator;
import org.eclipse.symphony.common.topology.addons.dynamics.ui.composites.HingeConstraintComposite;

public class HingeConstraintView extends AbstractPinableView<HingeConstraint>
{
	private HingeConstraint hingeConstraint;
	public static final String ID = "org.eclipse.symphony.common.topology.addons.dynamics.ui.views.PrismaticConstraintView"; //$NON-NLS-1$

	private HingeConstraintComposite hingeConstraintComposite = null;
	
	public HingeConstraintView() {
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
		hingeConstraintComposite = new HingeConstraintComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public HingeConstraint getHingeConstraint() {
		return hingeConstraint;
	}

	public void setHingeConstraint(HingeConstraint hingeConstraint) {
		this.hingeConstraint = hingeConstraint;
		if(hingeConstraintComposite != null) hingeConstraintComposite.setHingeConstraint(this.hingeConstraint);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<HingeConstraint> getObjectClass() {
		return HingeConstraint.class;
	}

	@Override
	public void setObject(HingeConstraint object) {
		
		hingeConstraintComposite.setHingeConstraint(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed PrismaticConstraint updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
