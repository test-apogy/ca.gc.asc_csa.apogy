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
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.OperationCallComposite;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableFeatureReferenceComposite;

public class OperationCallView extends AbstractView {
	private OperationCallComposite operationCallComposite;
	private VariableFeatureReferenceComposite variableFeatureReferenceComposite;

	@Override
	public void updatePartName() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);

		Composite containerComposite = new Composite(parent, SWT.None);
		containerComposite.setLayout(new GridLayout(1, false));
		
		variableFeatureReferenceComposite = new VariableFeatureReferenceComposite(containerComposite, SWT.None);	
		variableFeatureReferenceComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		operationCallComposite = new OperationCallComposite(
				containerComposite, SWT.None){
			protected void newSelection(TreeSelection selection) {
				getSelectionProvider().setSelection(selection);
			}
		};
		operationCallComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	}

	@Override
	public void updateSelection(ISelection selection) {
		List<Object> operationCalls = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, OperationCall.class);
		
		if (!operationCalls.isEmpty())
		{
			InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
			VariablesList variables = session.getEnvironment().getVariablesList();
			OperationCall operationCall = (OperationCall) operationCalls.get(0);
			variableFeatureReferenceComposite.set(variables, operationCall);
			operationCallComposite.setOperationCall(operationCall);
		}
	}
	
	@Override
	public void dispose() {
		variableFeatureReferenceComposite.dispose();
		operationCallComposite.dispose();
		super.dispose();
	}
}