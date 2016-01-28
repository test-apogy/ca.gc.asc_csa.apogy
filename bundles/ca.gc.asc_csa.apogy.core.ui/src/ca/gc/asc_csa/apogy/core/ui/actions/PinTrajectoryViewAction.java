package ca.gc.asc_csa.apogy.core.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import ca.gc.asc_csa.apogy.core.ui.views.MovableTrajectoryView;

public class PinTrajectoryViewAction extends Action {

	/**
	 * The {@link TopologyView} to pin/un pin.
	 */
	private MovableTrajectoryView view;

	public PinTrajectoryViewAction(MovableTrajectoryView view) 
	{
		super("Pin", IAction.AS_CHECK_BOX);

		if (view == null) {
			throw new IllegalArgumentException();
		}

		this.view = view;

		update();
	}

	@Override
	public void run() 
	{
		view.setPinned(isChecked());
	}

	public void update() {
		setChecked(view.isPinned());
	}

}
