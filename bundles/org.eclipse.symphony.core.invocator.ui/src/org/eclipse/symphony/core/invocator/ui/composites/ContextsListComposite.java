package org.eclipse.symphony.core.invocator.ui.composites;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.invocator.Context;
import org.eclipse.symphony.core.invocator.ContextsList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class ContextsListComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private ContextsList contextsList;
	private Table tableContexts;

	private CheckboxTableViewer contextsListViewer;

	/**
	 * Returns the {@link Context} list viewer.
	 * 
	 * @return Reference to the viewer.
	 */
	public CheckboxTableViewer getContextsListViewer() {
		return contextsListViewer;
	}

	private AdapterImpl environmentAdapter;

	private EditingDomain editingDomain;

	private ISelectionChangedListener contextsListViewerSelectionListener;

	public ContextsListComposite(Composite parent, int style,
			ContextsList contextsList) {
		this(parent, style);
		setContextsList(contextsList);
	}

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ContextsListComposite(Composite parent, int style) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, true));

		contextsListViewer = CheckboxTableViewer.newCheckList(this, SWT.BORDER
				| SWT.SINGLE | SWT.FULL_SELECTION);
		contextsListViewer.getTable().setLinesVisible(true);
		contextsListViewer.setCheckStateProvider(new ICheckStateProvider() {
			@Override
			public boolean isGrayed(Object element) {
				return false;
			}

			@Override
			public boolean isChecked(Object element) {
				boolean checked = false;
				if (element instanceof Context && getEnvironment() != null) {
					checked = getEnvironment().getActiveContext() == element;
				}
				return checked;
			}
		});
		contextsListViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {

				if (event.getChecked()) {
					SetCommand command = new SetCommand(
							editingDomain,
							getEnvironment(),
							EMFEcoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT,
							event.getElement());
					editingDomain.getCommandStack().execute(command);
				}
			}
		});

		tableContexts = contextsListViewer.getTable();
		tableContexts.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true, 1, 1));
		toolkit.paintBordersFor(tableContexts);
		
//		EditingSupport editingSupport = new ContextsListEditingSupport(
//				contextsListViewer);		
//		
//		tableContexts.getColumns()[0].setEditingSupport(editingSupport);

//		ListViewerEditor.create(contextsListViewer,
//				new ColumnViewerEditorActivationStrategy(
//						contextsListViewer) {
//					@Override
//					protected boolean isEditorActivationEvent(
//							ColumnViewerEditorActivationEvent event) {
//						return event.eventType == ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION;
//					}
//				}, SWT.NONE);		

		Composite composite = new Composite(this, SWT.NONE);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));

		Button btnNew = new Button(composite, SWT.NONE);
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
								
				Context basicContext = EMFEcoreInvocatorFactory.eINSTANCE.createBasicContext();
				basicContext.setName("New Context");
				AddCommand command = new AddCommand(
						editingDomain,
						contextsList,
						EMFEcoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS,
						basicContext);
				editingDomain.getCommandStack().execute(command);
			}
		});
		btnNew.setText("New");
		toolkit.adapt(btnNew, true, true);

		Button btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setToolTipText("Not implemented yet!!!");
		btnDelete.setEnabled(false);
		btnDelete.setText("Delete");
		toolkit.adapt(btnDelete, true, true);
	}

	/**
	 * Returns the environment that contains the {@link ContextsList}.
	 * 
	 * @return Reference to the environment.
	 */
	private Environment getEnvironment() {
		return contextsList == null ? null : contextsList.getEnvironment();
	}

	/**
	 * Binds the {@link ContextsList} with the composite.
	 * 
	 * @param context
	 *            Reference to the list of contexts.
	 */
	public void setContextsList(ContextsList contextsList) {
		setContextsList(contextsList, true);
	}

	/**
	 * Sets the {@link ContextsList}.
	 * 
	 * @param contextsList
	 *            Reference to the list of context.
	 * @param update
	 *            If true then data bindings are created.
	 */
	private void setContextsList(ContextsList contextsList, boolean update) {
		this.contextsList = contextsList;
		editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(contextsList);
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (contextsList != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link ContextsListComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see ContextsListComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Contexts List Viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		/**
		 * Bind contexts list.
		 */
		ViewerSupport.bind(contextsListViewer, EMFObservables.observeList(
				contextsList,
				EMFEcoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS),
				EMFProperties.value(Symphony__CommonEMFPackage.Literals.NAMED__NAME));

		/**
		 * Set the default selection to the active context if any or the first
		 * item.
		 */
		Context defaultSelectedContext = getEnvironment().getActiveContext();
		if (defaultSelectedContext == null
				&& getEnvironment().getContextsList().getContexts().isEmpty()) {
			defaultSelectedContext = getEnvironment().getContextsList()
					.getContexts().get(0);
		}
		contextsListViewer.setSelection(new StructuredSelection(
				defaultSelectedContext), true);

		/**
		 * Listens to selection changed.
		 */
		contextsListViewer
				.addSelectionChangedListener(getContextsListViewerSelectionListener());

		/** Listens to changes to the environment. */
		getEnvironment().eAdapters().add(getEnvironmentAdapter());

		return bindingContext;
	}

	private ISelectionChangedListener getContextsListViewerSelectionListener() {
		if (contextsListViewerSelectionListener == null) {
			contextsListViewerSelectionListener = new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return contextsListViewerSelectionListener;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected context.
	 * 
	 * @return Reference to the context.
	 */
	public Context getSelectedContext() {
		IStructuredSelection selection = (IStructuredSelection) contextsListViewer
				.getSelection();
		return (Context) selection.getFirstElement();
	}

	/**
	 * This adapter listens {@link Environment#setActiveContext(Context)}
	 * changes.
	 * 
	 * @return Reference to the adapter.
	 */
	private Adapter getEnvironmentAdapter() {
		if (environmentAdapter == null) {
			environmentAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(Environment.class) == EMFEcoreInvocatorPackage.ENVIRONMENT__ACTIVE_CONTEXT) {
						contextsListViewer.refresh();
					}
				}
			};
		}
		return environmentAdapter;
	}

//	private final class ContextsListEditingSupport extends
//			EditingSupport {
//
//		private ColumnViewer viewer = null;
//
//		private IBaseLabelProvider labelProvider = new LabelProvider();
//
//		private IStructuredContentProvider contentProvider = new IStructuredContentProvider() {
//
//			@Override
//			public void inputChanged(Viewer viewer, Object oldInput,
//					Object newInput) {
//			}
//
//			@Override
//			public void dispose() {
//			}
//
//			@Override
//			public Object[] getElements(Object inputElement) {
//				Object[] elements = null;
//				if (inputElement instanceof VariableImplementation) {
//					VariableImplementation variableImplementation = (VariableImplementation) inputElement;
//
//					if (variableImplementation.getVariable().getVariableType() != null) {
//						EClass interfaceClass = variableImplementation
//								.getVariable().getVariableType()
//								.getInterfaceClass();
//						elements = EMFEcoreFacade.INSTANCE.getAllSubEClasses(
//								interfaceClass).toArray();
//					}
//				}
//				if (inputElement instanceof TypeMemberImplementation) {
//					TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) inputElement;
//
//					if (typeMemberImplementation.getTypeMember()
//							.getMemberType() != null) {
//						EClass interfaceClass = typeMemberImplementation
//								.getTypeMember().getMemberType()
//								.getInterfaceClass();
//						elements = EMFEcoreFacade.INSTANCE.getAllSubEClasses(
//								interfaceClass).toArray();
//					}
//				}
//
//				return elements;
//			}
//		};
//
//		public ContextsListEditingSupport(ColumnViewer viewer) {
//			super(viewer);
//			this.viewer = viewer;
//		}
//
//		@Override
//		protected CellEditor getCellEditor(Object element) {
//			ComboBoxViewerCellEditor cellEditor = null;
//			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
//					.getControl(), SWT.READ_ONLY);
//			cellEditor.setLabelProvider(labelProvider);
//			cellEditor.setContentProvider(contentProvider);
//			cellEditor.setInput(element);
//			return cellEditor;
//		}
//
//		@Override
//		protected boolean canEdit(Object element) {
//			return true;
//		}
//
//		@Override
//		protected Object getValue(Object element) {
//			AbstractTypeImplementation implementation = (AbstractTypeImplementation) element;
//			return implementation.getImplementationClass() == null ? null
//					: implementation.getImplementationClass()
//							.getInstanceTypeName();
//		}
//
//		@Override
//		protected void setValue(Object element, Object value) {
//			EClass eClass = (EClass) value;
//			AbstractTypeImplementation implementation = (AbstractTypeImplementation) element;
//
//			SetCommand command = new SetCommand(
//					editingDomain,
//					implementation,
//					EMFEcoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS,
//					eClass);
//			editingDomain.getCommandStack().execute(command);
//
//			this.viewer.refresh();
//		}
//	}
//
	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		getEnvironment().eAdapters().remove(getEnvironmentAdapter());
		contextsListViewer
				.removeSelectionChangedListener(getContextsListViewerSelectionListener());
	}
}