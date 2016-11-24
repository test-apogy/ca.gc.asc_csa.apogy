package ca.gc.asc_csa.apogy.common.emf.ui.parts;
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

import java.util.Iterator;
import java.util.List;

import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;


abstract public class AbstractEObjectSelectionPart extends AbstractApogyPart{
	
	EObject eObject;
	
	@Override
	protected EObject getInitializeObject() {
		if(getSelectionListeners().size() == getSelectionProvidersIds().size()){
			Iterator<ISelectionListener> iteListeners = getSelectionListeners().iterator();
			for(Iterator<String> iteIds = getSelectionProvidersIds().iterator(); iteIds.hasNext();){
				selectionService.addSelectionListener(iteIds.next(), iteListeners.next());
			}
		} else {
			String message = this.getClass().getSimpleName() + ".createContentComposite(): "
					+ "Error while creating the part SelectionListeners. The number of Ids should be the same as the number of SelectionListeners";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
		}
		
		return eObject;
	}

	@Override
	protected final void setCompositeContent(EObject eObject) {
		this.eObject = eObject;
		setCompositeContents(eObject);
	}
	
	/**
	 * Sets the {@link EObject} to display in the content composite.
	 */
	abstract protected void setCompositeContents(EObject eObject);
	
	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		new NoContentComposite(parent, style){
			@Override
			protected String getMessage() {
				return "No compatible selection";
			}
		}; 
	}
	
	/**
	 * Specifies the {@link Composite} to create in the part.
	 */
	@Override
	abstract protected void createContentComposite(Composite parent, int style);
	
	
	/**
	 * This method returns a list of the IDs of the parts that the concrete part
	 * listens. This is used to set a {@link NoContentComposite} when the
	 * selection is set to null.
	 * 
	 * @return {@link List} of {@link String}
	 */
	abstract protected List<String> getSelectionProvidersIds();

	/**
	 * This method returns a list of the {@link ISelectionListener} of the parts
	 * that the concrete part listens. This is used to set a
	 * {@link NoContentComposite} when the selection is set to null.
	 * 
	 * These listeners should verify if the selection is the right type and if
	 * it is, use the dependency injection setSelectionMethod().
	 * 
	 * @return {@link List} of {@link ISelectionListener}
	 */
	abstract protected List<ISelectionListener> getSelectionListeners();
}