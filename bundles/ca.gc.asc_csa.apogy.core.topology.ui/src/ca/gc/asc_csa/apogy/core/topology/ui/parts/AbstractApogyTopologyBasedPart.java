package ca.gc.asc_csa.apogy.core.topology.ui.parts;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;

abstract public class AbstractApogyTopologyBasedPart extends AbstractApogyPart{
	
	private Adapter adapter;

	
	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		new NoContentComposite(parent, SWT.None){
			@Override
			protected String getMessage() {
				return "No active session";
			}
		};	
	}
			
	@Override
	protected EObject getInitializeObject() {
		ApogyCoreTopologyFacade.INSTANCE.eAdapters().add(getAdapter());
		return ApogyCoreTopologyFacade.INSTANCE.getApogyTopology();
	} 
	
	abstract protected void newTopology(ApogyTopology apogyTopology);

	@Override
	protected void setCompositeContent(EObject eObject) {
		newTopology((ApogyTopology) eObject); 
	}
	/**
	 * Gets an adapter that sets the part's parentComposite to a
	 * {@link NoActiveSessionComposite} if there is no active session.
	 * 
	 * @return the {@link Adapter}
	 */
	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					setEObject(ApogyCoreTopologyFacade.INSTANCE.getApogyTopology());
				}
			};
		}
		return adapter;
	}

	public void dispose() {
		ApogyCoreTopologyFacade.INSTANCE.eAdapters().remove(getAdapter());
	}
}