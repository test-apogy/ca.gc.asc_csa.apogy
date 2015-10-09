package org.eclipse.symphony.addons.sensors.gps.ui;

import org.eclipse.symphony.addons.sensors.gps.ui.views.GPSView;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {

		layout.setEditorAreaVisible(false);
		layout.addStandaloneView(GPSView.ID, false, IPageLayout.LEFT, 1.0f,
				layout.getEditorArea());
	}
}
