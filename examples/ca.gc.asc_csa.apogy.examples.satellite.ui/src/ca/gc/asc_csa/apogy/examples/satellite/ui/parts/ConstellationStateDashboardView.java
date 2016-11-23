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
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.ui.composites.ConstellationStateDashboardComposite;

public class ConstellationStateDashboardView extends AbstractView implements IEditingDomainProvider {

	// The ID of the view as specified by the extension.
	public static final String ID = "ca.gc.asc_csa.apogy.examples.satellite.ui.parts.ConstellationStateDashboardView";

	// Used to store the last selection.
	public static final String VIEW_CONFIG = Activator.ID + "."
			+ "CONSTELLATION_STATE_CONFIG";

	// Part Name.
	public static final String PART_NAME = "Constellation Dashboard";

	// Reference to the parentComposite.
	private ConstellationStateDashboardComposite constellationStateDashboardComposite;

	// Constellation State.
	private ConstellationState constellationState;

	// Used to store the latest Constellation State.
//	private String configurationId;

	/*
	 * The constructor.
	 */
	public ConstellationStateDashboardView() {
	}

	/*
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		constellationStateDashboardComposite = new ConstellationStateDashboardComposite(parent, SWT.NONE);

		// Attempts to initialize the CameraViewConfiguration.
//		setConstellationState(EarthViewUtilities.INSTANCE.getActiveEarthViewConfiguration(earthViewConfigurationId));
	}

	/*
	 * Update the {@link ConstellationStateDashboardComposite}.
	 */
	private void setConstellationState(ConstellationState constellationState) {
		if (constellationState != null) {
			/* Displays the active constellation. */
			new UIJob("Update Constellation Dashboard Input") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					constellationStateDashboardComposite.setConstellationState(constellationState);
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

		List<Object> constellationStates = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection,
				ConstellationState.class);

		if (!constellationStates.isEmpty()) {
			constellationState = (ConstellationState) constellationStates.get(0);
			setConstellationState(constellationState);
		}
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(constellationState);
	}

	
	// FIXME Implement the memento.
//	@Override
//	public void init(IViewSite site, IMemento memento) throws PartInitException {
//		super.init(site, memento);
//		if (memento != null) {
//			configurationId = memento.getString(VIEW_CONFIG);
//			Logger.INSTANCE.log(Activator.ID, this, "Initializing with Configuration ID <" + configurationId + "> of <" + PART_NAME +">",
//					EventSeverity.INFO);
//		}
//	}
//
//	@Override
//	public void saveState(IMemento memento) {
//		if (constellationState != null) {
//			configurationId = getConstellationStateIdentifier();
//			memento.putString(VIEW_CONFIG, configurationId);
//		}
//		Logger.INSTANCE.log(Activator.ID, this,
//				"Saving state Configuration ID <" + configurationId + "> of <" + PART_NAME +">", EventSeverity.INFO);
//
//		super.saveState(memento);
//	}
//	
//	protected String getConstellationStateIdentifier(){		
//		return constellationState == null ? null : ApogyCommonEMFFacade.INSTANCE.getID(constellationState);
//	}
}