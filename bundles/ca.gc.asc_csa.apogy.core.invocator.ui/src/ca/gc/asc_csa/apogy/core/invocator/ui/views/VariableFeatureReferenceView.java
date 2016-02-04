package ca.gc.asc_csa.apogy.core.invocator.ui.views;
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

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableFeatureReferenceComposite;

public class VariableFeatureReferenceView extends AbstractView {
	private VariableFeatureReferenceComposite variableFeatureReferenceComposite;

	@Override
	public void updatePartName() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		variableFeatureReferenceComposite = new VariableFeatureReferenceComposite(
				parent, SWT.None);
	}

	@Override
	public void updateSelection(ISelection selection) {
		List<Object> vfrs = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, VariableFeatureReference.class);
		if (!vfrs.isEmpty()) {
			VariableFeatureReference vfr = (VariableFeatureReference) vfrs.get(0);
			InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE
					.getActiveInvocatorSession();
			VariablesList variables = session.getEnvironment()
					.getVariablesList();
			variableFeatureReferenceComposite.set(variables, vfr);
		}
	}
}