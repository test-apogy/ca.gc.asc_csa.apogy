package ca.gc.asc_csa.apogy.core.invocator.ui.views;
/**
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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca,
 *     Canadian Space Agency (CSA) - Initial API and implementation
 **/


import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ContextsDefinitionComposite;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ScriptBasedProgramsListComposite;

public class ScriptBasedProgramsListView extends AbstractView implements IEditingDomainProvider
{
	private ScriptBasedProgramsListComposite composite;
	private Adapter adapter;

	public ScriptBasedProgramsListView() {
	}
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "ca.gc.asc_csa.apogy.core.invocator.ui.views.ScriptBasedProgramsListView";

	@Override
	public void updatePartName(){
	}
	

	@Override
	public void createPartControl(Composite parent)
	{
		// Call the superclass's version of the method
		super.createPartControl(parent);
		
		// Create the control composite
		composite = new ScriptBasedProgramsListComposite(parent, SWT.NONE){
			@Override
			protected void newSelection(TreeSelection selection) {
				getSelectionProvider().setSelection(selection);
			}
		};
	
		InvocatorSession activeSession = ApogyCoreInvocatorFacade.INSTANCE
				.getActiveInvocatorSession();
		composite.setProgramsList(activeSession == null ? null
				: activeSession.getProgramsList());
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(
				getApogyCoreInvocatorFacadeAdapter());
	}

	@Override
	public void updateSelection(ISelection arg0) {
	}		
	
	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList());
	}	
	
	private Adapter getApogyCoreInvocatorFacadeAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(ApogyCoreInvocatorFacade.class) == ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION) {
						InvocatorSession activeSession = ApogyCoreInvocatorFacade.INSTANCE
								.getActiveInvocatorSession();
						composite.setProgramsList(activeSession == null ? null : activeSession.getProgramsList());
					}
				}
			};
		}
		return adapter;
	}
}