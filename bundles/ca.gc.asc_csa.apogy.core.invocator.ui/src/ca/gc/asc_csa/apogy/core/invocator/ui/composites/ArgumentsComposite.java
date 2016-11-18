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
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.core.databinding.property.list.DelegatingListProperty;
import org.eclipse.core.databinding.property.list.IListProperty;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListTreeContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NewChildWizard;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.EClassArgument;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;

public class ArgumentsComposite extends Composite {

	private TreeViewer treeViewer;
	private Tree treeInstance;
	private TreeViewerColumn treeViewerParameterColumn;
	private Button btnNew;
	private Button btnDelete;

	boolean readOnly;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private OperationCall operationCall;
	private DataBindingContext m_bindingContext;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 *            Reference to the parent composite.
	 * @param style
	 *            Composite style.
	 */
	public ArgumentsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		treeInstance = treeViewer.getTree();
		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		treeInstance.setLinesVisible(true);
		treeInstance.setHeaderVisible(true);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TreeViewerColumn treeViewerActionColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnAction = treeViewerActionColumn.getColumn();
		treeclmnAction.setWidth(100);
		treeclmnAction.setText("Parameter");

		treeViewerParameterColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnParameter = treeViewerParameterColumn.getColumn();
		treeclmnParameter.setWidth(100);
		treeclmnParameter.setText("Value");

		ApogyCommonEMFUIFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);

		this.readOnly = false;
		m_bindingContext = initDataBindingsCustom();
	}

	public ArgumentsComposite(Composite parent, int style, boolean readOnly) {
		this(parent, style);
		if (!readOnly) {
			this.readOnly = readOnly;
			/**
			 * Cell edition support
			 */
			TextCellEditor cellEditor = new TextCellEditor(treeViewer.getTree());

			treeViewerParameterColumn.setEditingSupport(new EditingSupport(treeViewer) {
				@Override
				protected void setValue(Object element, Object value) {
					((EDataTypeArgument) element).setValue((String) value);
				}

				@Override
				protected Object getValue(Object element) {
					return ((EDataTypeArgument) element).getValue();
				}

				@Override
				protected TextCellEditor getCellEditor(Object element) {
					return cellEditor;
				}

				@Override
				protected boolean canEdit(Object element) {
					if (element instanceof EDataTypeArgument) {
						return true;
					}
					return false;
				}
			});

			btnNew = new Button(this, SWT.None);
			btnNew.setText("New");
			btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
			btnNew.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					/**
					 * Creates and opens the wizard to create a new child
					 */
//					TODO replace by ChooseEclass
//					NewChildWizard newChildWizard = new NewChildWizard(
//							ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE, getSelectedArgument());
//					WizardDialog dialog = new WizardDialog(getShell(), newChildWizard);
//
//					dialog.open();
				}
			});

			btnDelete = new Button(this, SWT.None);
			btnDelete.setText("Delete");
			btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
			btnDelete.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					// FIXME Move to core + UI facade
					EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(operationCall);

					if (editingDomain == null) {
						((EClassArgument) getSelectedArgument()).setValue(null);
					} else {
						SetCommand command = new SetCommand(editingDomain, getSelectedArgument(),
								ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE, null);
						editingDomain.getCommandStack().execute(command);
					}
				}
			});

			m_bindingContext = initDataBindingsButtons();
		}
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public Argument getSelectedArgument() {
		return (Argument) treeViewer.getStructuredSelection().getFirstElement();
	}

	/**
	 * Returns the reference to the {@link ArgumentsList}.
	 * 
	 * @return Reference to the {@link ArgumentsList}.
	 */
	public ArgumentsList getArgumentsList() {
		return (ArgumentsList) treeViewer.getInput();
	}

	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCall}.
	 */
	public void setOperationCall(OperationCall operationCall) {
		this.operationCall = operationCall;
		treeViewer.setInput(operationCall);
		treeViewer.expandAll();
		for (TreeColumn column : treeViewer.getTree().getColumns()) {
			column.pack();
		}
	}

	@SuppressWarnings("unchecked")
	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();

		DelegatingListProperty<?, ?> delegatingListProperty = new DelegatingListProperty<Object, Object>() {
			@Override
			protected IListProperty<Object, Object> doGetDelegate(Object source) {
				if (source instanceof OperationCall) {
					return EMFProperties.list(
							FeaturePath.fromList(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
									ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS));
				}
				if (source instanceof EClassArgument) {
					return EMFProperties.list(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE);
				}
				return null;
			}
		};

		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(
				delegatingListProperty.listFactory(DisplayRealm.getRealm(treeViewer.getControl().getDisplay())), null);
		treeViewer.setContentProvider(contentProvider);
		treeViewer
				.setLabelProvider(new ArgumentsLabelProvider(Properties.observeEach(contentProvider.getKnownElements(),
						EMFProperties.value(ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS), EMFProperties
								.value(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE),
						EMFProperties.value(ApogyCoreInvocatorPackage.Literals.EENUM_ARGUMENT__EENUM),
						EMFProperties.value(ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE))));

		return m_bindingContext;
	}

	protected DataBindingContext initDataBindingsButtons() {
		if (m_bindingContext == null) {
			m_bindingContext = new DataBindingContext();
		}

		IObservableValue<?> treeViewerSingleSelectionObservableValue = ViewerProperties.singleSelection()
				.observe(treeViewer);

		IObservableValue<?> btnNewEnabledObserveValue = WidgetProperties.enabled().observe(btnNew);
		IObservableValue<?> btnDeleteEnabledObserveValue = WidgetProperties.enabled().observe(btnDelete);

		m_bindingContext.bindValue(btnNewEnabledObserveValue, treeViewerSingleSelectionObservableValue, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Argument.class, Boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						if(fromObject instanceof EClassArgument){
							if(((EClassArgument) fromObject).getValue() == null){
								return true;
							}
						}
						return false;
					}
				}));
		m_bindingContext.bindValue(btnDeleteEnabledObserveValue, treeViewerSingleSelectionObservableValue, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Argument.class, Boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						if(fromObject instanceof EClassArgument){
							if(((EClassArgument) fromObject).getValue() != null){
								return true;
							}
						}
						return false;
					}
				}));

		return m_bindingContext;
	}

	private class ArgumentsLabelProvider extends ObservableMapLabelProvider {

		private AdapterFactoryLabelProvider adapterLabelProvider;

		@SuppressWarnings("rawtypes")
		public ArgumentsLabelProvider(IObservableMap[] attributeMaps) {
			super(attributeMaps);
		}

		private static final int PARAMETER_COLUMN_ID = 0;
		private static final int VALUE_ID = 1;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case PARAMETER_COLUMN_ID:
				str = getAdapterLabelProvider().getText(object);
				if (str.contains("(")) {
					str = str.substring(0, str.indexOf("("));
				}
				break;
			case VALUE_ID:
				if (object instanceof EDataTypeArgument) {
					str = ((EDataTypeArgument) object).getValue();
				}else if(object instanceof EClassArgument){
					EClassArgument eClassArgumentObject = (EClassArgument) object;
					if(eClassArgumentObject.getValue() != null){
						str = ((EClassArgument) object).getValue().toString();
					}			
				}else if(object instanceof EEnumArgument){
					str = ((EEnumArgument) object).getEEnumLiteral().getLiteral();
				}else {
					str = object.getClass().getName();
				}
				break;
			default:
				break;
			}
			return str;
		}

		public AdapterFactoryLabelProvider getAdapterLabelProvider() {
			if (adapterLabelProvider == null) {
				adapterLabelProvider = new AdapterFactoryLabelProvider(adapterFactory);
			}
			return adapterLabelProvider;
		}

	}

	public EObject getSelectedEObject() {
		return (EObject) treeViewer.getStructuredSelection().getFirstElement();
	}

	@Override
	public void dispose() {
		adapterFactory.dispose();
		super.dispose();
	}

}