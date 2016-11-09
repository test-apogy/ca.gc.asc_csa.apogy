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

import javax.annotation.PreDestroy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.NoEObjectSelectionComposite;
import ca.gc.asc_csa.apogy.common.ui.parts.AbstractApogyPart;

abstract public class AbstractSelectionBasedPart extends AbstractApogyPart{
	
	EObject eObject;

	@Override
	protected EObject getInitializeObject() {
		return eObject;
	}

	@Override
	protected void setContentCompositeSelection(EObject eObject) {
		this.eObject = eObject;
		setSelectionInContentComposite(eObject);
	}
	
	/**
	 * Sets the {@link EObject} to display in the composite.
	 */
	abstract protected void setSelectionInContentComposite(EObject eObject);
	
	@Override
	protected Class<? extends Composite> getNoContentCompositeClass(){
		return NoEObjectSelectionComposite.class;
	}

	@Override
	protected Composite getNoContentComposite() {
		return new NoEObjectSelectionComposite(composite, SWT.None); 
	}

	@PreDestroy
	protected void dispose() {
		getContentComposite().dispose();
		composite.dispose();
	}
}