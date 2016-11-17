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

import javax.annotation.PreDestroy;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NoActiveSessionComposite;

abstract public class AbstractApogySessionBasedPart extends AbstractApogyPart{
	
	private Adapter adapter;

	@Override
	protected Composite getNoContentComposite() {
		return new NoActiveSessionComposite(composite, SWT.None);
	}
	
	@Override
	protected Class<? extends Composite> getNoContentCompositeClass(){
		return NoActiveSessionComposite.class;
	}
	
	@Override
	protected EObject getInitializeObject() {
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getApogyCoreInvocatorFacadeAdapter());
		return ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
	} 
	
	abstract protected void newInvocatorSession(InvocatorSession invocatorSession);

	@Override
	protected void setContentCompositeSelection(EObject eObject) {
		newInvocatorSession((InvocatorSession) eObject); 
	}
	/**
	 * Gets an adapter that sets the part's composite to a
	 * {@link NoActiveSessionComposite} if there is no active session.
	 * 
	 * @return the {@link Adapter}
	 */
	private Adapter getApogyCoreInvocatorFacadeAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					setEObject(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
				}
			};
		}
		return adapter;
	}

	@PreDestroy
	protected void dispose() {
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getApogyCoreInvocatorFacadeAdapter());
		if (composite != null) {
			composite.dispose();
		}
	}
}