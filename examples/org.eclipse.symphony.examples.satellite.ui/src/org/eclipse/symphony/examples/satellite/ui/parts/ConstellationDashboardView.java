package org.eclipse.symphony.examples.satellite.ui.parts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.examples.satellite.ui.composites.ConstellationDashboardComposite;
import org.eclipse.ui.part.ViewPart;

public class ConstellationDashboardView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.eclipse.symphony.examples.satellite.ui.parts.ConstellationDashboardView";

	/**
	 * The constructor.
	 */
	public ConstellationDashboardView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		new ConstellationDashboardComposite(parent, SWT.NONE);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
//		viewer.getControl().setFocus();
	}
}
