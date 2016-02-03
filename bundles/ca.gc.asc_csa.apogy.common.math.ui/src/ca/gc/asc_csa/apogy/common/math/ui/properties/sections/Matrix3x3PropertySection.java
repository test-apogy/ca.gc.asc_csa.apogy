package ca.gc.asc_csa.apogy.common.math.ui.properties.sections;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.math.ui.composites.Matrix3x3Composite;
import ca.gc.asc_csa.apogy.common.ui.properties.sections.AbstractExtendedPropertySection;

public class Matrix3x3PropertySection extends AbstractExtendedPropertySection {

	@Override
	protected void render(EObject eObject) {
		((Matrix3x3Composite) getComposite()).setMatrix3x3((ca.gc.asc_csa.apogy.common.math.Matrix3x3) eObject);
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new Matrix3x3Composite(parent, SWT.NONE, getEditingDomain());
	}
}
