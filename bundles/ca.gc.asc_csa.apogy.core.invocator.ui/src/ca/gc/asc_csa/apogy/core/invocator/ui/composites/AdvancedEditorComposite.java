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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;

public class AdvancedEditorComposite extends Composite{

	private ISelectionChangedListener selectionChangedListener;
	private EObjectComposite eObjectComposite;
	
	private Button btnNew;
	

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public AdvancedEditorComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				dispose();
			}
		});
		setLayout(new GridLayout(2, false));

		eObjectComposite = new EObjectComposite(this, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				AdvancedEditorComposite.this.newSelection(selection);
			}
		};
		eObjectComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		
		btnNew = new Button(this, SWT.NONE);
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNew.setText("New");
		btnNew.setEnabled(true);
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (event.type == SWT.Selection) {
					System.out.println(
							"AdvancedEditorComposite.AdvancedEditorComposite(...).new Listener() {...}.handleEvent()" + " not yet implemented");
					/**
					 * Creates and opens the wizard to create a valid context
					 */
//					NewChildWizard newChildWizard = new NewChildWizard(eObjectComposite.getSelectedEObject().eClass());
//					WizardDialog dialog = new WizardDialog(getShell(), newChildWizard);
//				
//					dialog.open();
				}
			}
		});

		Button btnDelete = new Button(this, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (event.type == SWT.Selection) {
					// TODO: Delete button clicked
				}

			}
		});
	}

	protected void newSelection(ISelection selection) {
		checkEnableNewButton((EObject) ((TreeSelection) selection).getFirstElement());
	}

	@Override
	public void dispose() {
		super.dispose();
		if (selectionChangedListener != null) {
			eObjectComposite.removeListener(SWT.Selection, (Listener) selectionChangedListener);
		}
	}
		
	private void checkEnableNewButton(EObject eObject){
		boolean objectFull = true;
		if (eObject != null) {
			EList<EReference> structuralFeatures = eObject.eClass().getEAllContainments();
			for (int i = 0; i < structuralFeatures.size(); i++) {
				final Object value = eObject.eGet(structuralFeatures.get(i));
				if (value == null) {
					objectFull = false;
					break;
				}
				if (value instanceof List) {
					objectFull = false;
					break;
				}
			}
		}
		System.out.println("AdvancedEditorComposite.checkEnableNewButton(): " + objectFull);
		btnNew.setEnabled(!objectFull);
	}

	public void setEObject(EObject eObject){
		eObjectComposite.setEObject(eObject);
		checkEnableNewButton(eObject);
	}
}