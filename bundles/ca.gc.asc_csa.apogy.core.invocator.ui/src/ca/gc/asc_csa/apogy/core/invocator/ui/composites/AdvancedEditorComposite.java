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

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NewChildWizard;

public class AdvancedEditorComposite extends Composite {

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
					/**
					 * Creates and opens the wizard to create a new child
					 */
					NewChildWizard newChildWizard = new NewChildWizard(
							ApogyCommonEMFFacade.INSTANCE.getSettableEReferences(eObjectComposite.getSelectedEObject()),
							eObjectComposite.getSelectedEObject());
					// Listener that sets the new child as the selected item
					newChildWizard.getCreatedChild().addChangeListener(new IChangeListener() {
						@SuppressWarnings("unchecked")
						@Override
						public void handleChange(ChangeEvent event) {
							eObjectComposite.setSelectedEObject(((WritableValue<EObject>)event.getObservable()).getValue());
						}
					});
					WizardDialog dialog = new WizardDialog(getShell(), newChildWizard);

					dialog.open();
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
					// Get the editing domain of the object
					EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(eObjectComposite.getSelectedEObject());

					Command command = null;
					if (editingDomain != null) {
						// If the containing feature is a list, the object is
						// removed from the list
						if(eObjectComposite.getSelectedEObject().eContainingFeature() != null) {
							if (eObjectComposite.getSelectedEObject().eContainingFeature().isMany()) {
								command = new RemoveCommand(editingDomain,
										(EList<?>) eObjectComposite.getSelectedEObject().eContainer()
												.eGet(eObjectComposite.getSelectedEObject().eContainingFeature()),
										eObjectComposite.getSelectedEObject());
							}
							// Otherwise, if the feature is not a list, the
							// EStructuralFeature of the parent is set to null
							else {
								command = new SetCommand(editingDomain,
										eObjectComposite.getSelectedEObject().eContainer(),
										eObjectComposite.getSelectedEObject().eContainingFeature(), null);
							} 
						}
					}
					editingDomain.getCommandStack().execute(command);
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

	private void checkEnableNewButton(EObject eObject) {
		if (eObject != null) {
			btnNew.setEnabled(!ApogyCommonEMFFacade.INSTANCE.getSettableEReferences(eObject).isEmpty());
		} else {
			btnNew.setEnabled(false);
		}

	}

	/**
	 * Sets the root object for the composite
	 * 
	 * @param eObject
	 *            The root eObject
	 */
	public void setEObject(EObject eObject) {
		eObjectComposite.setEObject(eObject);
		checkEnableNewButton(eObject);
	}
	
	public EObject getSelectedEObject(){
		return eObjectComposite.getSelectedEObject();
	}
}