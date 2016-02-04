package ca.gc.asc_csa.apogy.addons.sensors.gps.ui.views;
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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ui.viewers.GPSViewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

public class GPSView extends ViewPart implements ISelectionListener {

	public static final String ID = "ca.gc.asc_csa.apogy.addons.sensors.gps.ui.views.GPSView";
//	private IMemento memento;
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
//		this.memento = memento;
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

//	private void restoreState() {
//		IMemento selectionMemento = memento.getChild("selection");
//
//		IMemento gpsMemento = selectionMemento.getChild("descriptor");
//
//		if (gpsMemento != null) {
//			// Set selection to this gps.
//		}
//	}

}
