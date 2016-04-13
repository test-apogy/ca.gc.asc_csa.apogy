package ca.gc.asc_csa.apogy.examples.satellite.ui.parts;
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

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.progress.UIJob;

import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.examples.satellite.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ui.composites.ConstellationRequestsComposite;

public class ConstellationRequestsView extends AbstractView implements IEditingDomainProvider {

	// The ID of the view as specified by the extension.
	public static final String ID = "ca.gc.asc_csa.apogy.examples.satellite.ui.parts.ConstellationRequestsView";

	// Used to store the last selection.
	public static final String VIEW_CONFIG = Activator.ID + "."
			+ "CONSTELLATION_REQUESTS_CONFIG";

	// Part Name.
	public static final String PART_NAME = "Constellation Requests";

	// Reference to the composite.
	private ConstellationRequestsComposite constellationRequestsComposite;

	// Constellation State.
	private ConstellationRequestsList constellationRequestsList;

	/*
	 * The constructor.
	 */
	public ConstellationRequestsView() {
	}

	/*
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		constellationRequestsComposite = new ConstellationRequestsComposite(parent, SWT.NONE);
	}

	/*
	 * Update the {@link ConstellationRequestsComposite}.
	 * @param constellationRequestsList Constellation Requests List.
	 */
	private void setConstellationRequests(ConstellationRequestsList constellationRequestsList) {
		if (constellationRequestsList != null) {
			/* Displays the active constellation. */
			new UIJob("Update Constellation Dashboard Input") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					constellationRequestsComposite.setConstellationRequests(constellationRequestsList);
					return Status.OK_STATUS;
				}
			}.schedule();
		}
	}

	/*
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
	}

	@Override
	public void updatePartName() {
	}

	@Override
	public void updateSelection(ISelection selection) {

		List<Object> constellationRequestsLists = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection,
				ConstellationRequestsList.class);

		if (!constellationRequestsLists.isEmpty()) {
			constellationRequestsList = (ConstellationRequestsList) constellationRequestsLists.get(0);
			setConstellationRequests(constellationRequestsList);
		}
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(constellationRequestsList);
	}
}