package org.eclipse.symphony.addons.sensors.gps.ui.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.addons.sensors.gps.ui.viewers.GPSViewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

/**
 * This view outputs the gps readings comming from a gps. The gps object is
 * obtained using the selection. This view listens for selections. If a
 * {@link IStructuredSelection} containing an object of type GPS is being
 * intercepted, the data from this gps object is then displayed.
 * 
 * @author sgemme
 * 
 */
public class GPSView extends ViewPart implements ISelectionListener {

	public static final String ID = "org.eclipse.symphony.addons.sensors.gps.ui.views.GPSView";
	private IMemento memento;
	private GPSViewer gpsViewer;

	public GPSView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		// We register as a selection listener.
		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(this);

		parent.setLayout(new GridLayout(1, true));

		gpsViewer = new GPSViewer(parent);

		parent.pack();

	}

	@Override
	public void setFocus() {

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		gpsViewer.setSelection(selection);
	}

	@Override
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		init(site);
		this.memento = memento;
	}

	@Override
	public void saveState(IMemento memento) {
		// IStructuredSelection sel = (IStructuredSelection) gpsViewer
		// .getSelection();
		// if (sel.isEmpty())
		// return;
		// IMemento selectionMemento = memento.createChild("selection");
		// Iterator<?> iter = sel.iterator();
		// while (iter.hasNext()) {
		// GPS gps = (GPS) iter.next();
		// selectionMemento.createChild("descriptor", gps.getConnection()
		// .toString());
		// }
	}

	private void restoreState() {
		IMemento selectionMemento = memento.getChild("selection");

		IMemento gpsMemento = selectionMemento.getChild("descriptor");

		if (gpsMemento != null) {
			// Set selection to this gps.
		}
	}

}
