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
//	private NoActiveSessionComposite noActiveSessionComposite;
	private Adapter adapter;
	
	@Inject ESelectionService selectionService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
//		noActiveSessionComposite = new NoActiveSessionComposite(parent, SWT.None);
//		noActiveSessionComposite.setVisible(false);
		composite = createContentComposite(parent);
		setSession(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getApogyCoreInvocatorFacadeAdapter());
	}

	
	abstract protected Composite createContentComposite(Composite parent);
	
	public Composite getContentComposite(){
		return composite;
	}
	
	protected void setSession(InvocatorSession invocatorSession){	
//		if(invocatorSession == null && composite.isVisible()){
//			composite.setVisible(false);
//			noActiveSessionComposite.setVisible(true);
//		}else if(invocatorSession != null && noActiveSessionComposite.isVisible()){
//			composite.setVisible(true);
//			noActiveSessionComposite.setVisible(false);
//		}
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
	protected void dispose(){
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getApogyCoreInvocatorFacadeAdapter());
		System.out.println("ApogyAdvancedEditorPart.dispose()");
	}
}