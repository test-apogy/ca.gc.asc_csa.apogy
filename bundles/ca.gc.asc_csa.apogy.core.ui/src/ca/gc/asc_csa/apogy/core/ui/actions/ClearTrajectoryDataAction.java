package ca.gc.asc_csa.apogy.core.ui.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import ca.gc.asc_csa.apogy.core.ui.views.MovableTrajectoryView;

public class ClearTrajectoryDataAction extends Action {

	/**
	 * The {@link TopologyView} to pin/un pin.
	 */
	private MovableTrajectoryView view;

	public ClearTrajectoryDataAction(MovableTrajectoryView view) 
	{
		super("Clear", IAction.AS_PUSH_BUTTON);

		if (view == null) {
			throw new IllegalArgumentException();
		}

		this.view = view;

		update();
	}

	@Override
	public void run() 
	{
		view.clearTrajectoryData();
	}

	public void update() {
		setChecked(view.isPinned());
	}

}
