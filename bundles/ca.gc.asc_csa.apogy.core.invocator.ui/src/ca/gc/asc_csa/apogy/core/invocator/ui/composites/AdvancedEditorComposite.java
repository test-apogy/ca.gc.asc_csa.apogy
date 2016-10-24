package ca.gc.asc_csa.apogy.core.invocator.ui.composites;
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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;

public class AdvancedEditorComposite extends Composite implements ISelectionProvider{
	
	private ISelectionChangedListener selectionChangedListener;
	private EObjectComposite eObjectComposite;
	
	
	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public AdvancedEditorComposite(Composite parent, int style, ESelectionService selectionService) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				dispose();
			}
		});

		eObjectComposite = new EObjectComposite(this,
				SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				selectionService.setSelection(selection);
			}
		};
	
		if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null){
			eObjectComposite.setEObject(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		}
		
		Button btnNewChild = new Button(this, SWT.NONE);
		btnNewChild.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNewChild.setText("New child");
		btnNewChild.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(event.type == SWT.Selection){
					// TODO: New Child button clicked
				}
				
			}
		});
		
		Button btnDelete = new Button(this, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(event.type == SWT.Selection){
					// TODO: Delete button clicked
				}
				
			}
		});
		
		Button btnValidate = new Button(this, SWT.NONE);
		btnValidate.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnValidate.setText("Validate");
		btnValidate.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(event.type == SWT.Selection){
					// TODO: Validate button clicked
				}
				
			}
		});
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if(selectionChangedListener != null){
			eObjectComposite.removeListener(SWT.Selection, (Listener) selectionChangedListener);
		}
	}
	
	/**
	 * Selection provider methods
	 */
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListener = listener;
		eObjectComposite.addListener(SWT.Selection, (Listener) listener); 
	}

	@Override
	public ISelection getSelection() {
		return (ISelection) eObjectComposite.getSelectedEObject();
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		eObjectComposite.removeListener(SWT.Selection, (Listener) listener);
	}

	@Override
	public void setSelection(ISelection selection) {
	}
	
}