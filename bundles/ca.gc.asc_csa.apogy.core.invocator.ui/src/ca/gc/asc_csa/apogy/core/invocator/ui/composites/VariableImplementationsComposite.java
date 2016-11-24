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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.edit.EMFEcoreInvocatorEditUtilities;

public class VariableImplementationsComposite extends ScrolledComposite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Context context;

	private TreeViewer variableImplementationsViewer;

	private EditingDomain editingDomain;

	final private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Tree treeVariableImplementations;
	private Text txtName;
	private Text txtInterface;
	private Text txtImplementation;

	private ISelectionChangedListener variableImplementationsViewerListener;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 * @param style
	 */
	public VariableImplementationsComposite(Composite parent, int style) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		setLayout(new FillLayout());
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite composite = new Composite(this, SWT.None);
		GridLayout gl_composite = new GridLayout(1, false);
		composite.setLayout(gl_composite);
		toolkit.adapt(composite);

		variableImplementationsViewer = new TreeViewer(composite,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);

		ColumnViewerToolTipSupport.enableFor(variableImplementationsViewer, ToolTip.NO_RECREATE);
		treeVariableImplementations = variableImplementationsViewer.getTree();
		GridData gd_treeVariableImplementations = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_treeVariableImplementations.heightHint = 100;
		treeVariableImplementations.setLayoutData(gd_treeVariableImplementations);
		treeVariableImplementations.setLinesVisible(true);
		treeVariableImplementations.setHeaderVisible(true);
		toolkit.paintBordersFor(treeVariableImplementations);

		TreeViewerColumn treeViewerColumnFeature = new TreeViewerColumn(variableImplementationsViewer, SWT.NONE);
		TreeColumn columnFeature = treeViewerColumnFeature.getColumn();
		columnFeature.setWidth(150);
		columnFeature.setText("Feature");

		TreeViewerColumn treeViewerColumnInterface = new TreeViewerColumn(variableImplementationsViewer, SWT.NONE);
		TreeColumn columnInterface = treeViewerColumnInterface.getColumn();
		columnInterface.setWidth(150);
		columnInterface.setText("Interface");

		TreeViewerColumn treeViewerColumnImplementation = new TreeViewerColumn(variableImplementationsViewer, SWT.NONE);
		TreeColumn columnImplementation = treeViewerColumnImplementation.getColumn();
		columnImplementation.setWidth(150);
		columnImplementation.setText("Implementation");
		EditingSupport editingSupport = new VariableImplementationEditingSupport(
				treeViewerColumnImplementation.getViewer());
		treeViewerColumnImplementation.setEditingSupport(editingSupport);

		TreeViewerEditor.create(variableImplementationsViewer,
				new ColumnViewerEditorActivationStrategy(variableImplementationsViewer) {
					@Override
					protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
						return event.eventType == ColumnViewerEditorActivationEvent.MOUSE_CLICK_SELECTION;
					}
				}, SWT.NONE);

		variableImplementationsViewer.setContentProvider(new VariableImplementationContentProvider());
		variableImplementationsViewer.setLabelProvider(new VariableImplementationLabelProvider(adapterFactory));

		variableImplementationsViewer.addSelectionChangedListener(getVariableImplementationsViewerListener());

		Section sctnDetails = toolkit.createSection(composite, Section.TITLE_BAR | Section.EXPANDED);
		sctnDetails.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.paintBordersFor(sctnDetails);
		sctnDetails.setText("Details");
		sctnDetails.setExpanded(true);

		Composite compositeDetails = toolkit.createComposite(sctnDetails, SWT.NONE);
		toolkit.paintBordersFor(compositeDetails);
		sctnDetails.setClient(compositeDetails);
		compositeDetails.setLayout(new GridLayout(2, false));

		Label lblName = toolkit.createLabel(compositeDetails, "Name:", SWT.NONE);
		lblName.setSize(69, 21);

		txtName = toolkit.createText(compositeDetails, "", SWT.READ_ONLY);
		txtName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		toolkit.createLabel(compositeDetails, "Interface:", SWT.NONE);

		txtInterface = toolkit.createText(compositeDetails, "", SWT.READ_ONLY);
		txtInterface.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblImplementation = toolkit.createLabel(compositeDetails, "Implementation:", SWT.NONE);
		lblImplementation.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		txtImplementation = toolkit.createText(compositeDetails, "", SWT.READ_ONLY);
		txtImplementation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	/**
	 * Binds the {@link Context} with the parentComposite.
	 * 
	 * @param context
	 *            Reference to the list of context.
	 */
	public void setContext(Context context) {
		setContext(context, true);
	}

	/**
	 * Sets the {@link Context}.
	 * 
	 * @param context
	 *            Reference to the context.
	 * @param update
	 *            If true then data bindings are created.
	 */
	private void setContext(Context context, boolean update) {
		this.context = context;
		editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (context != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings.
	 * 
	 * @return Reference to the data bindings.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		/**
		 * Bind Viewer Selection
		 */
		IObservableValue<?> observeSingleSelectionVariableImplementationsViewer = ViewerProperties.singleSelection()
				.observe(variableImplementationsViewer);

		/**
		 * Bind Name.
		 */
		IObservableValue<?> observeTextTxtNameObserveWidget = WidgetProperties.text().observe(txtName);

		bindingContext.bindValue(observeTextTxtNameObserveWidget, observeSingleSelectionVariableImplementationsViewer,
				null,
				new UpdateValueStrategy().setConverter(new Converter(AbstractTypeImplementation.class, String.class) {
					@Override
					public Object convert(Object fromObject) {
						if (fromObject != null) {
							return EMFEcoreInvocatorEditUtilities.getName((AbstractTypeImplementation) fromObject);
						}
						return null;
					}
				}));

		/**
		 * Bind Interface.
		 */
		IObservableValue<?> observeTextTxtInterfaceObserveWidget = WidgetProperties.text().observe(txtInterface);

		bindingContext.bindValue(observeTextTxtInterfaceObserveWidget,
				observeSingleSelectionVariableImplementationsViewer, null,
				new UpdateValueStrategy().setConverter(new Converter(AbstractTypeImplementation.class, String.class) {
					@Override
					public Object convert(Object fromObject) {
						if (fromObject != null) {
							return EMFEcoreInvocatorEditUtilities
									.getInterfaceName((AbstractTypeImplementation) fromObject, true);
						}
						return null;
					}
				}));

		/**
		 * Bind Implementation.
		 */
		IObservableValue<?> observeTextTxtImplementationObserveWidget = WidgetProperties.text()
				.observe(txtImplementation);

		bindingContext.bindValue(observeTextTxtImplementationObserveWidget,
				observeSingleSelectionVariableImplementationsViewer, null,
				new UpdateValueStrategy().setConverter(new Converter(AbstractTypeImplementation.class, String.class) {
					@Override
					public Object convert(Object fromObject) {
						if (fromObject != null) {
							return EMFEcoreInvocatorEditUtilities
									.getImplementationName((AbstractTypeImplementation) fromObject, true);
						}
						return null;
					}
				}));

		/**
		 * Set the content of the list.
		 */
		variableImplementationsViewer.setInput(context);
		variableImplementationsViewer.expandAll();

		/** Select the first element by default. */

		if (context.getVariableImplementationsList().getVariableImplementations() != null
				&& context.getVariableImplementationsList().getVariableImplementations().isEmpty()) {

			TreePath treePath = new TreePath(
					new Object[] { context.getVariableImplementationsList().getVariableImplementations().get(0) });
			ITreeSelection defaultElementSelected = new TreeSelection(treePath);
			variableImplementationsViewer.setSelection(defaultElementSelected, true);
		}

		return bindingContext;
	}

	@Override
	public void dispose() {
		super.dispose();
		variableImplementationsViewer.removeSelectionChangedListener(getVariableImplementationsViewerListener());
	}

	/**
	 * Listener used to listen {{@link #variableImplementationsViewer} selection
	 * changes.
	 * 
	 * @return Reference to the listener (Lazy Loaded).
	 */
	private ISelectionChangedListener getVariableImplementationsViewerListener() {
		if (variableImplementationsViewerListener == null) {
			variableImplementationsViewerListener = new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return variableImplementationsViewerListener;
	}

	/**
	 * This method is called when a new selection is made in the parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected {@link AbstractTypeImplementation}.
	 * 
	 * @return Reference to the {@link AbstractTypeImplementation}.
	 */
	public AbstractTypeImplementation getSelectedImplementation() {
		IStructuredSelection selection = (IStructuredSelection) variableImplementationsViewer.getSelection();
		return (AbstractTypeImplementation) selection.getFirstElement();
	}

	/**
	 * 
	 * 
	 *
	 */
	private class VariableImplementationLabelProvider extends AdapterFactoryLabelProvider
			implements ITableLabelProvider {

		public VariableImplementationLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		private static final int FEATURE_COLUMN_ID = 0;
		private static final int INTERFACE_COLUMN_ID = 1;
		private static final int IMPLEMENTATION_COLUMN_ID = 2;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case FEATURE_COLUMN_ID:
				str = EMFEcoreInvocatorEditUtilities.getName((AbstractTypeImplementation) object);
				break;
			case INTERFACE_COLUMN_ID:
				str = EMFEcoreInvocatorEditUtilities.getInterfaceName((AbstractTypeImplementation) object, false);
				break;

			case IMPLEMENTATION_COLUMN_ID:
				str = EMFEcoreInvocatorEditUtilities.getImplementationName((AbstractTypeImplementation) object, false);
				break;

			default:
				break;
			}

			return str;
		}
	}

	/**
	 * 
	 * 
	 *
	 */
	private class VariableImplementationContentProvider implements ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean hasChildren(Object element) {
			return (!((AbstractTypeImplementation) element).getTypeMemberImplementations().isEmpty());
		}

		@Override
		public Object getParent(Object element) {
			/** Not used. */
			return null;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return context.getVariableImplementationsList().getVariableImplementations().toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			AbstractTypeImplementation abstractTypeImplementation = (AbstractTypeImplementation) parentElement;
			return abstractTypeImplementation.getTypeMemberImplementations().toArray();
		}
	}

	/**
	 * 
	 * 
	 *
	 */
	private final class VariableImplementationEditingSupport extends EditingSupport {

		private ColumnViewer viewer = null;

		private IBaseLabelProvider labelProvider = new LabelProvider() {
			@Override
			public String getText(Object element) {
				return ((EClass) element).getInstanceTypeName();
			}
		};

		private IStructuredContentProvider contentProvider = new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				Object[] elements = null;
				if (inputElement instanceof VariableImplementation) {
					VariableImplementation variableImplementation = (VariableImplementation) inputElement;

					if (variableImplementation.getVariable().getVariableType() != null) {
						EClass interfaceClass = variableImplementation.getVariable().getVariableType()
								.getInterfaceClass();
						elements = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(interfaceClass).toArray();
					}
				}
				if (inputElement instanceof TypeMemberImplementation) {
					TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) inputElement;

					if (typeMemberImplementation.getTypeMember().getMemberType() != null) {
						EClass interfaceClass = typeMemberImplementation.getTypeMember().getMemberType()
								.getInterfaceClass();
						elements = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(interfaceClass).toArray();
					}
				}
				return elements;
			}
		};

		public VariableImplementationEditingSupport(ColumnViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			ComboBoxViewerCellEditor cellEditor = null;
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer().getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(labelProvider);
			cellEditor.setContentProvider(contentProvider);
			cellEditor.setInput(element);
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			AbstractTypeImplementation implementation = (AbstractTypeImplementation) element;
			return implementation.getImplementationClass() == null ? null
					: implementation.getImplementationClass().getInstanceTypeName();
		}

		@Override
		protected void setValue(Object element, Object value) {
			EClass eClass = (EClass) value;
			AbstractTypeImplementation implementation = (AbstractTypeImplementation) element;

			SetCommand command = new SetCommand(editingDomain, implementation,
					ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS, eClass);
			editingDomain.getCommandStack().execute(command);

			this.viewer.refresh();
			txtImplementation.setText(EMFEcoreInvocatorEditUtilities.getImplementationName(implementation, true));
		}
	}
}