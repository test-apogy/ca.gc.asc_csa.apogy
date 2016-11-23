package ca.gc.asc_csa.apogy.common.ui.composites;
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

import org.eclipse.swt.widgets.Composite;

public class NoSelectionComposite extends NoContentComposite {
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public NoSelectionComposite(Composite parent, int style) {
		super(parent, style);
	}
	
	@Override
	protected String getMessage() {
		return "No compatible selection";
	}
}