package ca.gc.asc_csa.apogy.core.invocator.ui.parts;
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.ISelectionListener;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.parts.AbstractEObjectSelectionPart;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramArgumentsPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramPartSelection;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.OperationCallDetailsComposite;

public class ProgramArgumentsPart extends AbstractEObjectSelectionPart {


	@Override
	protected void setCompositeContents(EObject eObject) {
		((OperationCallDetailsComposite) getActualComposite()).setOperationCall((OperationCall) eObject);
	}

	@Override
	protected void createContentComposite(Composite parent, int style) {
		new OperationCallDetailsComposite(parent, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				if (selection.isEmpty()) {
					setNullSelection();
				} else {
					EObject eObject = ((OperationCallDetailsComposite) getActualComposite()).getSelectedEObject();
					if (eObject != null) {
						ProgramArgumentsPartSelection selectionSent = ApogyCoreInvocatorUIFactory.eINSTANCE
								.createProgramArgumentsPartSelection();
						selectionSent.setEObject(eObject);
						selectionService.setSelection(selectionSent);
					}
				}
			}
		};
	}

	@Override
	protected void setNullSelection() {
		selectionService.setSelection(ApogyCoreInvocatorUIFactory.eINSTANCE.createProgramArgumentsPartSelection());
	}
	
	@Override
	protected List<String> getSelectionProvidersIds() {
		List<String> ids = new ArrayList<>();
		
		ids.add("ca.gc.asc_csa.apogy.rcp.part.ProgramPart");
		
		return ids;
	}

	@Override
	protected List<ISelectionListener> getSelectionListeners() {
		List<ISelectionListener> listeners = new ArrayList<ISelectionListener>();
		
		listeners.add(new ISelectionListener() {
			@Override
			public void selectionChanged(MPart part, Object selection) {
				if(selection instanceof ProgramPartSelection){
					setEObject(((ProgramPartSelection) selection).getOperationCall());
				}
			}
		});
	
		return listeners;
	}
}