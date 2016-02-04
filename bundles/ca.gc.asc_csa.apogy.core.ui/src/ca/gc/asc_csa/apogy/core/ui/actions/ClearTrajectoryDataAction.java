package ca.gc.asc_csa.apogy.core.ui.actions;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
