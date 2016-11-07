package ca.gc.asc_csa.apogy.core.invocator.ui.parts;
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NoActiveSessionComposite;

abstract public class AbstractApogySessionBasedPart {

	private Composite composite;
	private Adapter adapter;

	@Inject
	protected ESelectionService selectionService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		composite = parent;
		composite.setLayout(new FillLayout());
		createContentComposite(composite);
		setSession(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getApogyCoreInvocatorFacadeAdapter());
	}

	/**
	 * Specifies the {@link Composite} to insert in the part
	 */
	abstract protected Composite createContentComposite(Composite parent);

	/**
	 * Gets the content {@link Composite} in the part
	 * 
	 * @return Composite
	 */
	public Composite getContentComposite() {
		System.out.println("AbstractApogySessionBasedPart.getContentComposite()");
		return (Composite) composite.getChildren()[0];
	}

	/**
	 * This method is called when the {@link InvocatorSession} needs to be
	 * changed or initialized in the content composite.
	 * 
	 * @param invocatorSession
	 *            Reference to the InvocatorSession.
	 */
	abstract protected void setSessionInComposite(InvocatorSession invocatorSession);
	
	/**
	 * This method is called when the {@link InvocatorSession} needs to be
	 * changed or initialized in the composite. If there is no active
	 * session, this method disposes any existing content composite and replaces
	 * it with a {@link NoActiveSessionComposite}. If there is an active
	 * session, it disposes any NoActiveSessionComposite, replaces it with the
	 * content composite and calls setSessionInComposite.
	 * 
	 * @param invocatorSession
	 *            Reference to the InvocatorSession.
	 */
	private void setSession(InvocatorSession invocatorSession){
		// If there is no active session
		if(invocatorSession == null){
			// Verify if the content composite is not a NoActiveSessionComposite
			if(!(getContentComposite() instanceof NoActiveSessionComposite)){
				// Disposes the content composite
				getContentComposite().dispose();
				new NoActiveSessionComposite(composite, SWT.None);
			}
		}else{
			if(getContentComposite() instanceof NoActiveSessionComposite){
				// Disposes the NoActiveSessionComposite
				getContentComposite().dispose();
				createContentComposite(composite);		
				}
			setSessionInComposite(invocatorSession);		
		}
	}

	private Adapter getApogyCoreInvocatorFacadeAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					setSession(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
				}
			};
		}
		return adapter;
	}

	@PreDestroy
	protected void dispose() {
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getApogyCoreInvocatorFacadeAdapter());
	}
}