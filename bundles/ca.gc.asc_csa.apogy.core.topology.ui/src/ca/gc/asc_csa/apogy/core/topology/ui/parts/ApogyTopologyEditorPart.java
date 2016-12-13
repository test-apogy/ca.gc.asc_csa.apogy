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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectEditorComposite;
import ca.gc.asc_csa.apogy.core.ApogyTopology;

public class ApogyTopologyEditorPart extends AbstractApogyTopologyBasedPart {

	@Override
	protected void setNullSelection() {
		selectionService.setSelection(null);
	}

	@Override
	protected void createContentComposite(Composite parent, int style) {
		new EObjectEditorComposite(parent, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()) {
					setNullSelection();
				} else {
					EObject eObject = ((EObjectEditorComposite) getActualComposite()).getSelectedEObject();
					if (eObject != null) {
						selectionService.setSelection(eObject);
					}
				}
			}
		};
	}

	@Override
	protected void newTopology(ApogyTopology apogyTopology) {
		((EObjectEditorComposite) getActualComposite()).setEObject(apogyTopology);
	}
}