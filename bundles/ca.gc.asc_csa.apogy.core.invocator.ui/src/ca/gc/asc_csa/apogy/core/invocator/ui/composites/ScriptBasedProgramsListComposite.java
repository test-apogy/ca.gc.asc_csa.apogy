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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.ObservableTracker;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.databinding.observable.set.IObservableSet;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.IEMFListProperty;
import org.eclipse.emf.databinding.internal.EMFObservableListDecorator;
import org.eclipse.emf.databinding.internal.EMFObservableValueDecorator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.TreeStructureAdvisor;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.ToolTip;
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
import org.eclipse.ui.internal.EditorMenuManager;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramsGroupWizard;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewScriptBasedProgramWizard;

public class ScriptBasedProgramsListComposite extends ScrolledComposite {

	private DataBindingContext m_bindingContext;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private ISelectionChangedListener selectionChangedListener;

	private EObjectComposite eObjectComposite;
	private TreeViewer treeViewer;

	private WritableValue<ProgramsList> programsListBinder;
	private WritableList<ProgramsGroup> programsGroupsBinder;

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

		ColumnViewerToolTipSupport.enableFor(treeViewer, ToolTip.NO_RECREATE);
		Tree treeInstance = treeViewer.getTree();
		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		treeInstance.setLinesVisible(true);
		treeViewer.addSelectionChangedListener(getSelectionChangedListener());
		ApogyCommonEMFUIFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);

		// eObjectComposite = new EObjectComposite(compositeProgramsList,
		// SWT.None){
		// @Override
		// protected void newSelection(ISelection selection) {
		// ScriptBasedProgramsListComposite.this.newSelection(selection);
		// }
		//
		// @Override
		// protected AdapterFactoryContentProvider getContentProvider() {
		// return new ProgramsListsContentProvider(adapterFactory);
		// }
		// };
		// eObjectComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
		// true, 1, 3));

		Button btnNewGroup = new Button(compositeProgramsList, SWT.NONE);
		btnNewGroup.setText("New Group");
		btnNewGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNewGroup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				/**
				 * Creates and opens the wizard to create a valid ProgramsGroup
				 */
				NewProgramsGroupWizard newProgramsGroupWizard = new NewProgramsGroupWizard();
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
						getSelectedProgramsGroup());
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

		m_bindingContext = initDataBindingsCustom();
	}

	/**
	 * Listener used to listen {{@link #TreeViewer} selection changes.
	 * 
	 * @return Reference to the listener (Lazy Loaded).
	 */
	private ISelectionChangedListener getSelectionChangedListener() {
		if (selectionChangedListener == null) {
			selectionChangedListener = new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return selectionChangedListener;
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
//		return eObjectComposite.getSelectedEObject() instanceof ProgramsGroup;
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
		//		return eObjectComposite.getSelectedEObject() instanceof Program;
	}

	/**
	 * Sets the programsList in the composite
	 * 
	 * @param programsList
	 */
	public void setProgramsList(ProgramsList programsList) {
		this.programsListBinder.setValue(programsList);
	}

	/**
	 * Creates and returns the data bindings.
	 * 
	 * @return Reference to the data bindings.
	 */
	@SuppressWarnings("unchecked")
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext m_bindingContext = new DataBindingContext();

		if (this.programsListBinder == null) {
			this.programsListBinder = new WritableValue<ProgramsList>();
		}

		IObservableList<?> ProgramsListProgramsGroupsObserveList = EMFProperties.list(ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__PROGRAMS_GROUPS)
				.observeDetail(programsListBinder);
		treeViewer.setContentProvider(
				new ObservableListTreeContentProvider(new TreeFactoryProgramsGroup(), new TreeStructureAdvisorProgramsGroup()){
					@Override
					public boolean equals(Object obj) {
						// TODO Auto-generated method stub
						return super.equals(obj);
					}
					@Override
					public int hashCode() {
						// TODO Auto-generated method stub
						return super.hashCode();
					}
					@Override
					public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
						// TODO Auto-generated method stub
						super.inputChanged(viewer, oldInput, newInput);
					}
					@Override
					public Object[] getChildren(Object parentElement) {
						// TODO Auto-generated method stub
						return super.getChildren(parentElement);
					}
					@Override
					public Object[] getElements(Object inputElement) {
						// TODO Auto-generated method stub
						return super.getElements(inputElement);
					}
					@Override
					public IObservableSet getKnownElements() {
						// TODO Auto-generated method stub
						return super.getKnownElements();
					}
					@Override
					public Object getParent(Object element) {
						// TODO Auto-generated method stub
						return super.getParent(element);
					}
					@Override
					public IObservableSet getRealizedElements() {
						// TODO Auto-generated method stub
						return super.getRealizedElements();
					}
					@Override
					public boolean hasChildren(Object element) {
						// TODO Auto-generated method stub
						return super.hasChildren(element);
					}
					@Override
					public String toString() {
						// TODO Auto-generated method stub
						return super.toString();
					}
				});
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory) {
			@Override
			public void notifyChanged(Notification notification) {
////				this.setFireLabelUpdateNotifications(true);
				super.notifyChanged(notification);
			}

		});
		treeViewer.setInput(ProgramsListProgramsGroupsObserveList);

		return m_bindingContext;
	}

	@Override
	public void dispose() {
		m_bindingContext.dispose();
		super.dispose();
		programsListBinder.dispose();
	}

	private static class TreeFactoryProgramsGroup implements IObservableFactory<Object, IObservable> {
		private IEMFListProperty listProgramsGroup = EMFProperties.list(
				ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__PROGRAMS_GROUPS);
		private IEMFListProperty listPrograms = EMFProperties.list(
				ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS);
				
	

		@SuppressWarnings("unchecked")
		public IObservable createObservable(final Object target) {
			System.out.println("ScriptBasedProgramsListComposite.TreeFactoryProgramsGroup.createObservable() : " + target.getClass());
			if (target instanceof IObservableList<?>) {
				return (IObservable) target;
			}
			if(target instanceof ProgramsList){
				return listProgramsGroup.observe(target);
			}
			if(target instanceof ProgramsGroup){
				return listPrograms.observe(target);
			}
			if (target instanceof Program){
				System.out.println("ScriptBasedProgramsListComposite.TreeFactoryProgramsGroup.createObservable()");
			}				
			return null;
		}
	}

	private static class TreeStructureAdvisorProgramsGroup extends TreeStructureAdvisor {
		@Override
		public Boolean hasChildren(Object element) {
			if(element instanceof ProgramsList){
				return !((ProgramsList) element).getProgramsGroups().isEmpty();
			}
			if (element instanceof ProgramsGroup) {
				return !((ProgramsGroup) element).getPrograms().isEmpty();
			}
//			if(element instanceof Program){
//				return element.
//			}
			return false;
		}
		@Override
		public Object getParent(Object element) {
			if(element instanceof ProgramsList){
				return ((ProgramsList) element).getInvocatorSession();
			}
			if(element instanceof ProgramsGroup){
				return ((ProgramsGroup) element).getProgramsList();
			}
			if(element instanceof Program){
				return ((Program) element).getProgramsGroup();
			}
			// TODO Auto-generated method stub
			return super.getParent(element);
		}

//		@Override
//		public Object getParent(Object element) {
//			if (element instanceof Program) {
//				return ((Program) element).getProgramsGroup();
//			}
//			return super.getParent(element);
//		}
	}

}