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
	protected void setCompositeContent(EObject eObject) {
		this.eObject = eObject;
		setSelectionInContentComposite(eObject);
	}
	
	/**
	 * Sets the {@link EObject} to display in the parentComposite.
	 */
	abstract protected void setSelectionInContentComposite(EObject eObject);
	
	@Override
	protected void createNoContentComposite(Composite parent, int style) {
		new NoSelectionComposite(parent, style); 
	}
}