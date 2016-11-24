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

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.ui.composites.NoSelectionComposite;
import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;


abstract public class AbstractEObjectSelectionPart extends AbstractApogyPart{
	
	EObject eObject;

	@Override
	protected EObject getInitializeObject() {
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
		new NoSelectionComposite(parent, style); 
	}
	
	/**
	 * Specifies the {@link Composite} to create in the part. This method should
	 * also add a listener on the {@link ESelectionService} using
	 * .addPostSelectionListener(String partId, ISelectionListener listener).
	 * The partId is the selection provider's part ID in the RCP. This listener
	 * should check if the selection is the right type and then call the
	 * dependency injection method.
	 */
	@Override
	abstract protected void createContentComposite(Composite parent, int style);
}