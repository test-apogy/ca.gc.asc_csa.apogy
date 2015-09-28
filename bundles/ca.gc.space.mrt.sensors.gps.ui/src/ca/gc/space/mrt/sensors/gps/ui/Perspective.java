package ca.gc.space.mrt.sensors.gps.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import ca.gc.space.mrt.sensors.gps.ui.views.GPSView;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {

		layout.setEditorAreaVisible(false);
		layout.addStandaloneView(GPSView.ID, false, IPageLayout.LEFT, 1.0f,
				layout.getEditorArea());
	}
}
