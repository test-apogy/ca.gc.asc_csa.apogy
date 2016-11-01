package ca.gc.asc_csa.apogy.core.programs.controllers.ui.parts;
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

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerBindingsComposite;

public class ControllerBindingsPart{
	
	private ControllerBindingsComposite composite;
	
	private ControllersConfiguration controllersConfiguration;
	private Adapter adapter;

	@Inject
	ESelectionService selectionService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		composite = new ControllerBindingsComposite(parent, SWT.None){
			@Override
			protected void newSelection(ISelection selection) 
			{
				selectionService.setSelection(selection);
			}
		};
	}
	
	@Inject @Optional
	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ControllersConfiguration selection){
		System.out.println("ControllerBindingsPart.setSelection()");
		setConfiguration(selection);
	}
	
//	@Inject @Optional
//	public void setSelection(@Named(IServiceConstants.ACTIVE_SELECTION) ISelection selection){
//		System.out.println("ControllerBindingsPart.setSelection()");
//		//setConfiguration(selection);
//	}

	
	/**
	 * This method is called when the {@link InvocatorSession} needs to be
	 * changed or initialized.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void setConfiguration(ControllersConfiguration controllersConfiguration) {
		System.out.println("ControllerBindingsPart.setConfiguration()");
		if(adapter != null){
			this.controllersConfiguration.eAdapters().remove(getControllersConfigurationAdapter());
		}
		this.controllersConfiguration = controllersConfiguration;
		if(this.controllersConfiguration != null){
			this.controllersConfiguration.eAdapters().add(getControllersConfigurationAdapter());
		}
	}

	private Adapter getControllersConfigurationAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					ControllerBindingsPart.this.composite.setControllersConfiguration(controllersConfiguration);
				}
			};
		}
		return adapter;
	}

	@PreDestroy
	protected void dispose() {
		if(adapter != null){
			this.controllersConfiguration.eAdapters().remove(getControllersConfigurationAdapter());
		}
		composite.dispose();
	}
}