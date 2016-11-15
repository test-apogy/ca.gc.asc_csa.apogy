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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.property.list.DelegatingListProperty;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactory;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramsGroupWizard;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewScriptBasedProgramWizard;

public class ScriptBasedProgramsListComposite extends ScrolledComposite {

	private TreeViewer treeViewer;

	public ScriptBasedProgramsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite compositeProgramsList = new Composite(this, SWT.NONE);
		compositeProgramsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		compositeProgramsList.setLayout(new GridLayout(2, false));

		treeViewer = new TreeViewer(compositeProgramsList,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);

		Tree treeInstance = treeViewer.getTree();
		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		treeInstance.setLinesVisible(true);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});
		ApogyCommonEMFUIFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);

		Button btnNewGroup = new Button(compositeProgramsList, SWT.NONE);
		btnNewGroup.setText("New Group");
		btnNewGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNewGroup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				/**
				 * Creates and opens the wizard to create a valid ProgramsGroup
				 */
				NewProgramsGroupWizard newProgramsGroupWizard = new NewProgramsGroupWizard(){
					@Override
					public boolean performFinish() {
						
						EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getProgramsList());

						/** Check if there is a domain. */
						if (editingDomain == null) {
							/** No Domain */
							getProgramsList().getProgramsGroups().add(getProgramsGroup());
						} else {
							/** Use the command stack. */
							AddCommand command = new AddCommand(editingDomain, getProgramsList(),
									ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__PROGRAMS_GROUPS, getProgramsGroup());
							editingDomain.getCommandStack().execute(command);
						}
						ScriptBasedProgramsListComposite.this.treeViewer.setSelection(new StructuredSelection(getProgramsGroup()));
						return true;
					}
				};
				WizardDialog dialog = new WizardDialog(getShell(), newProgramsGroupWizard);
				dialog.open();
			}
		});

		Button btnNewProgram = new Button(compositeProgramsList, SWT.NONE);
		btnNewProgram.setText("New Program");
		btnNewProgram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNewProgram.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				/**
				 * Creates and opens the wizard to create a valid Program
				 */
				NewScriptBasedProgramWizard newScriptBasedProgramWizard = new NewScriptBasedProgramWizard(
						getSelectedProgramsGroup()){
					@Override
					public boolean performFinish() {
						ProgramFactory factory = ProgramFactoriesRegistry.INSTANCE.getFactory(getProgramType());
						
						Program program = factory.createProgram();
						program.setName(getProgramSettings().getName());
						program.setDescription(getProgramSettings().getDescription());

						EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getCreationProgramsGroup());

						/** Use the command stack. */
						AddCommand command = new AddCommand(editingDomain, getCreationProgramsGroup(),
								ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, program);
						editingDomain.getCommandStack().execute(command);
						
						ScriptBasedProgramsListComposite.this.treeViewer.setSelection(new StructuredSelection(program));
						return true;
					}
				};
				WizardDialog dialog = new WizardDialog(getShell(), newScriptBasedProgramWizard);
				dialog.open();
			}
		});

		Button btnDelete = new Button(compositeProgramsList, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EditingDomain editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(getSelectedProgramsGroup());
				EObject owner = null;
				if (isProgramSelected()) {
					owner = getSelectedProgram();

				} else if (isProgramsGroupSelected()) {
					owner = getSelectedProgramsGroup();
				}
				if (owner != null) {
					SetCommand command = new SetCommand(editingDomain, owner,
							ApogyCommonEMFPackage.Literals.ARCHIVABLE__ARCHIVED, true);
					editingDomain.getCommandStack().execute(command);
				}
			}
		});
		this.setContent(compositeProgramsList);
		this.setMinSize(compositeProgramsList.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		initDataBindingsCustom();
	}

	/**
	 * This is used to indicate if a program should belong to the list. By
	 * default all types of {@link Program} are applicable. However the
	 * developers may override this method to exclude some programs from the
	 * list.
	 * 
	 * @param program
	 *            Reference to the program.
	 * @return Return true means the {@link Program} is applicable.
	 */
	protected boolean isApplicable(Program program) {
		return true;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected {@link Program}.
	 * 
	 * @return Reference to the selected program.
	 */
	public Program getSelectedProgram() {
		if (isProgramSelected()) {
			return (Program) treeViewer.getStructuredSelection().getFirstElement();
		}
		return null;
	}

	/**
	 * Returns the selected {@link ProgramsGroup}.
	 * 
	 * @return Reference to the selected programsGroup.
	 */
	public ProgramsGroup getSelectedProgramsGroup() {
		Object selection = treeViewer.getStructuredSelection().getFirstElement();
		
		if (isProgramSelected()) {
			return ((Program) selection).getProgramsGroup();
		} else if (isProgramsGroupSelected()) {
			return (ProgramsGroup) selection;
		}
		return null;
	}

	/**
	 * Returns a boolean to know if a {@link ProgramsGroup} or another object is
	 * selected
	 * 
	 * @return true if a ProgramsGroup is selected, false otherwise
	 */
	private boolean isProgramsGroupSelected() {
		return treeViewer.getStructuredSelection().getFirstElement() instanceof ProgramsGroup;
	}

	/**
	 * Returns a boolean to know if a {@link Program} or another object is
	 * selected
	 * 
	 * @return true if a program is selected, false otherwise
	 */
	private boolean isProgramSelected() {
		return treeViewer.getStructuredSelection().getFirstElement() instanceof Program;
	}

	/**
	 * Sets the programsList in the composite
	 * 
	 * @param programsList
	 */
	public void setProgramsList(ProgramsList programsList) {
		treeViewer.setInput(programsList);
	}

	/**
	 * Creates and returns the data bindings.
	 * 
	 * @return Reference to the data bindings.
	 */
	@SuppressWarnings("unchecked")
	private void initDataBindingsCustom() {
		DelegatingListProperty<?, ?> delegatingListProperty = new DelegatingListProperty<Object, Object>(){
			@Override
			protected IListProperty<Object, Object> doGetDelegate(Object source) {
				if(source instanceof ProgramsList){
					return EMFProperties.list(ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__PROGRAMS_GROUPS);
				}
				if(source instanceof ProgramsGroup){
					return EMFProperties.list(ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS);
				}
				return null;
			}
		};		
		ViewerSupport.bind(treeViewer, null, delegatingListProperty, EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));
	}
}