package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.NamedDescribedListComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;

public class ControllerConfigsComposite extends ScrolledComposite {

	private ISelectionChangedListener selectionChangedListener;
	private NamedDescribedListComposite controllersConfigsComposite;
	
	private ControllersConfiguration selectedControllerConfiguration;
	
	private ProgramsGroup controllersGroup;

	private Adapter adapter;
	
	private Button btnNew;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ControllerConfigsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		setExpandHorizontal(true);
		setExpandVertical(true);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));	
		
		controllersConfigsComposite = new NamedDescribedListComposite(composite, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				ControllerConfigsComposite.this.newSelection(selection);
			}
		};
		controllersConfigsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 5));

		btnNew = new Button(composite, SWT.NONE);
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNew.setText("New");
		btnNew.setEnabled(true);
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {

				ControllersConfiguration config = (ControllersConfiguration) ApogyCoreProgramsControllersFactory.eINSTANCE
						.create(ApogyCoreProgramsControllersPackage.Literals.CONTROLLERS_CONFIGURATION);
				config.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(controllersGroup, config, ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
				
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(controllersGroup);
				AddCommand command = new AddCommand(editingDomain, controllersGroup,
						ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, config);
				
				editingDomain.getCommandStack().execute(command);
				
				controllersConfigsComposite.setSelectedEObject(config);
			}
		});

		Button btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(controllersGroup);
				RemoveCommand command = new RemoveCommand(editingDomain, controllersGroup,
						ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, controllersConfigsComposite.getSelectedEObject());
				
				editingDomain.getCommandStack().execute(command);
			}
		});
		
		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		Button btnActivate = new Button(composite, SWT.NONE);
		btnActivate.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnActivate.setText("Activate");
		btnActivate.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ApogyCoreProgramsControllersFacade.INSTANCE.setActiveControllersConfiguration(
						(ControllersConfiguration) controllersConfigsComposite.getSelectedEObject(), true);
			}
		});

		Button btnDeactivate = new Button(composite, SWT.NONE);
		btnDeactivate.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnDeactivate.setText("Deactivate");
		btnDeactivate.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ApogyCoreProgramsControllersFacade.INSTANCE.setActiveControllersConfiguration(
						(ControllersConfiguration) controllersConfigsComposite.getSelectedEObject(), false);
			}
		});

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	protected void newSelection(ISelection selection) {
		this.selectedControllerConfiguration = (ControllersConfiguration) selection;
	}
	
	public ControllersConfiguration getSelectedControllerConfiguration() {
		return selectedControllerConfiguration;
	}

	@Override
	public void dispose() {
		super.dispose();
		if (selectionChangedListener != null) {
			controllersConfigsComposite.removeListener(SWT.Selection, (Listener) selectionChangedListener);
		}
		if(adapter != null){
			controllersGroup.eAdapters().remove(getControllersGroupAdapter());
		}
	}

	/**
	 * Sets the root object for the composite
	 * 
	 * @param eObject
	 *            The root eObject
	 */
	public void setControllersGroup(EObject eObject) {
		if(controllersGroup != null){
			controllersGroup.eAdapters().remove(getControllersGroupAdapter());
		}
		controllersGroup = (ProgramsGroup)eObject;
		controllersConfigsComposite.setEObjectsList(controllersGroup.getPrograms());
		controllersGroup.eAdapters().add(getControllersGroupAdapter());
	}
	
	private Adapter getControllersGroupAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					controllersConfigsComposite.setEObjectsList(controllersGroup.getPrograms());
				}
			};
		}
		return adapter;
	}
}