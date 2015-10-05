package ca.gc.asc_csa.topology.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.topology.dynamics.ConstraintState;
import ca.gc.asc_csa.topology.dynamics.ui.Activator;
import ca.gc.asc_csa.topology.dynamics.ui.composites.ConstraintStateComposite;

public class ConstraintStateView extends AbstractPinableView<ConstraintState>
{
	private ConstraintState constraintState;
	public static final String ID = "ca.gc.asc_csa.topology.dynamics.ui.views.ConstraintStateView"; //$NON-NLS-1$

	private ConstraintStateComposite constraintStateComposite = null;
	
	public ConstraintStateView() {
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
		constraintStateComposite = new ConstraintStateComposite(container, SWT.None);
		
		createActions();
		
		getSite().getPage().addSelectionListener(this);
	}

	public ConstraintState getConstraintState() {
		return constraintState;
	}

	public void setConstraintState(ConstraintState constraintState) {
		
		this.constraintState = constraintState;
		if(constraintState != null) constraintStateComposite.setConstraintState(this.constraintState);
	}
	
	@Override
	public Class<ConstraintState> getObjectClass() 
	{
		return ConstraintState.class;
	}

	@Override
	public void setFocus() {
	}
	
	@Override
	public void setObject(ConstraintState object) 
	{
		constraintStateComposite.setConstraintState(object);		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed ConstraintState updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
