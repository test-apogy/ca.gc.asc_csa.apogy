package ca.gc.asc_csa.topology.dynamics.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.topology.dynamics.KinematicState;
import ca.gc.asc_csa.topology.dynamics.ui.Activator;
import ca.gc.asc_csa.topology.dynamics.ui.composites.KinematicStateComposite;

public class KinematicsStateView extends AbstractPinableView<KinematicState>
{
	private KinematicState kinematicState;
	public static final String ID = "ca.gc.asc_csa.topology.dynamics.ui.views.KinematicsStateView"; //$NON-NLS-1$

	private KinematicStateComposite kinematicStateComposite = null;
	
	public KinematicsStateView() {
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
		kinematicStateComposite = new KinematicStateComposite(container, SWT.None);	
		
		createActions();
		getSite().getPage().addSelectionListener(this);
	}

	public KinematicState getKinematicState() {
		return kinematicState;
	}

	public void setKinematicState(KinematicState kinematicState) {
		this.kinematicState = kinematicState;
		if(kinematicStateComposite != null) kinematicStateComposite.setKinematicState(this.kinematicState);
	}

	
	@Override
	public void setFocus() {
		// Set the focus
	}

	@Override
	public Class<KinematicState> getObjectClass() {
		return KinematicState.class;
	}

	@Override
	public void setObject(KinematicState object) {
		
		kinematicStateComposite.setKinematicState(object);
		
		Logger.INSTANCE.log(Activator.ID, this, "Displayed KinematicState updated to <" + object + ">.", EventSeverity.OK);
		
		super.setObject(object);
	}
}
