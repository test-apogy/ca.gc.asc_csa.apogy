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
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.ChooseEClassWizard;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NewChildWizard;
import ca.gc.asc_csa.apogy.common.ui.composites.NoSelectionComposite;
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
	private Composite compositeEMFForms;
	private Composite compositeArguments;
	
	boolean readOnly;
	
	private OperationCall operationCallInput;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public ArgumentsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());

		this.readOnly = true;
		
		
		

		compositeArguments = new Composite(this, SWT.None);
		compositeArguments.setLayout(new GridLayout(2, false));

		treeViewer = new TreeViewer(compositeArguments,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		treeInstance = treeViewer.getTree();
		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2));
		treeInstance.setLinesVisible(true);
		treeInstance.setHeaderVisible(true);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if (((StructuredSelection) event.getSelection()).getFirstElement() != null && !readOnly
						&& !(((StructuredSelection) event.getSelection()).getFirstElement() instanceof Argument)) {
					if (compositeEMFForms.getClass() == NoSelectionComposite.class) {
						compositeEMFForms.dispose();
						compositeEMFForms = new Composite(ArgumentsComposite.this, SWT.None);
						compositeEMFForms.setLayout(new FillLayout());
					}
					try {
						ECPSWTViewRenderer.INSTANCE.render(compositeEMFForms,
								(EObject) ((StructuredSelection) event.getSelection()).getFirstElement());
					} catch (ECPRendererException e) {
						System.out.println("Error");
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ArgumentsComposite.this.layout();
				} else if (compositeEMFForms.getClass() != NoSelectionComposite.class && !readOnly) {
					compositeEMFForms.dispose();
					compositeEMFForms = new NoSelectionComposite(ArgumentsComposite.this, SWT.None);
					ArgumentsComposite.this.layout();
				}
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
		

		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory){
			@Override
			public Object[] getChildren(Object object) {
				if(object instanceof OperationCall){
					return ((OperationCall) object).getArgumentsList().getArguments().toArray();
				}
				return super.getChildren(object);
			}
		});
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		ApogyCommonEMFUIFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);
		m_bindingContext = initDataBindingsCustom();
	}

	public ArgumentsComposite(Composite parent, int style, boolean readOnly) {
		this(parent, style);
		if (!readOnly) {
			this.readOnly = readOnly;

			treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
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

			btnNew = new Button(compositeArguments, SWT.None);
			btnNew.setText("New");
			btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
			btnNew.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					/**
					 * Creates and opens the wizard to create a new child
					 */
					Wizard wizard;
					if (getSelectedEObject() instanceof EClassArgument) {
						wizard = new ChooseEClassWizard(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE,
								getSelectedEObject(),
								(EClass) ((Argument) getSelectedEObject()).getEParameter().getEType()) {
							@Override
							public boolean performFinish() {
								EObject eObject = EcoreUtil
										.create(getChooseEClassImplementationWizardPage().getSelectedEClass());
								((EClassArgument) getParent()).setValue(eObject);
								treeViewer.setSelection(new StructuredSelection(eObject));
								return true;
							}
						};
					} else {
						System.out.println(getSelectedEObject());
						System.out.println(getSelectedEObject().eContents());
						wizard = new NewChildWizard(
								ApogyCommonEMFFacade.INSTANCE.getSettableEReferences(getSelectedEObject()),
								getSelectedEObject());
					}
					WizardDialog dialog = new WizardDialog(getShell(), wizard);
					dialog.open();
				}
			});

			btnDelete = new Button(compositeArguments, SWT.None);
			btnDelete.setText("Delete");
			btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false));
			btnDelete.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					EditingDomain editingDomain = AdapterFactoryEditingDomain
							.getEditingDomainFor(getSelectedEObject().eContainer());
					Command command = null;
					if (getSelectedEObject().eContainmentFeature().isMany()) {
						if (editingDomain == null) {
							getSelectedEObject().eContainer().eGet(getSelectedEObject().eContainmentFeature());
						} else {
							command = new RemoveCommand(editingDomain, getSelectedEObject().eContainer(),
									getSelectedEObject().eContainmentFeature(), getSelectedEObject());
						}

					} else {
						if (editingDomain == null) {
							getSelectedEObject().eContainer().eSet(getSelectedEObject().eContainmentFeature(), null);
						} else {
							command = new SetCommand(editingDomain, getSelectedEObject().eContainer(),
									getSelectedEObject().eContainmentFeature(), null);
						}
					}
					if (editingDomain != null) {
						editingDomain.getCommandStack().execute(command);
					}
				}
			});

			compositeEMFForms = new NoSelectionComposite(ArgumentsComposite.this, SWT.None);

			// layout();
			m_bindingContext = initDataBindingsButtons();
		}
	}

	/**
	 * This method is called when a new selection is made in the parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public EObject getSelectedEObject() {
		return (EObject) treeViewer.getStructuredSelection().getFirstElement();
	}

	public Argument getSelectedArgument() {
		System.out.println(treeViewer.getStructuredSelection().getPaths());
		if (getSelectedEObject() instanceof Argument) {
			return (Argument) getSelectedEObject();
		} else {
			System.out.println(treeViewer.getStructuredSelection().getPaths());
			return null;
			// return (Argument) treeViewer.getStructuredSelection().getPaths()
		}

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
		this.operationCallInput = operationCall;
		EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
		eObjectReference.setEObject(operationCall);
		treeViewer.setInput(eObjectReference);
		treeViewer.expandAll();
		
		
//		treeViewer.setInput(operationCall.getArgumentsList());
//		treeViewer.expandAll();
//		for (TreeColumn column : treeViewer.getTree().getColumns()) {
//			column.pack();
//		}
	}

	@SuppressWarnings("unchecked")
	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();
		

//		DelegatingListProperty<?, ?> delegatingListProperty = new DelegatingListProperty<Object, Object>() {
//
//			// private AdapterFactoryContentProvider adapterContentProvider;
//			private AdapterFactoryItemDelegator adapterFactoryItemDelegator;
//
//			@Override
//			protected IListProperty<Object, Object> doGetDelegate(Object source) {
//				if (source instanceof OperationCall) {
//					IListProperty<Object, Object> test = EMFProperties.list(
//							FeaturePath.fromList(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST,
//									ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS));
//					return test;
//				}
//				if (source instanceof EClassArgument) {
//					IListProperty<Object, Object> test = EMFProperties
//							.list(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE);
//					return EMFProperties.list(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE);
//				}
//				if (source instanceof EObject) {
////					getAdapterFactoryItemDelegator().getPropertyDescriptors(source);
////					EMFProperties.multiList(featurePaths)
////					EMFProperties.multiList(((EObject) source).eClass().getEAllContainments());
////					System.out.println(((EObject) source).eContainingFeature());
////					System.out.println(((EObject) source).eAllContents());
////					System.out.println(((EObject) source).eContainmentFeature());
//
//				}
//				System.out.println(source);
//				return null;
//			}
//
//			public AdapterFactoryItemDelegator getAdapterFactoryItemDelegator() {
//				if (adapterFactoryItemDelegator == null) {
//					adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);
//				}
//				return adapterFactoryItemDelegator;
//			}
//
//		};
//
//		ObservableListTreeContentProvider contentProvider = new ObservableListTreeContentProvider(
//				delegatingListProperty.listFactory(DisplayRealm.getRealm(treeViewer.getControl().getDisplay())), null) {
//			@Override
//			public IObservableSet<?> getKnownElements() {
//				IObservableSet<?> set = super.getKnownElements();
//				System.out.println(
//						"ArgumentsComposite.initDataBindingsCustom().new ObservableListTreeContentProvider() {...}.getKnownElements()");
//				return set;
//			}
//		};
//		treeViewer.setContentProvider(contentProvider);
//		treeViewer
//				.setLabelProvider(new ArgumentsLabelProvider(Properties.observeEach(contentProvider.getKnownElements(),
//						EMFProperties.value(ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS), EMFProperties
//								.value(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE),
//						EMFProperties.value(ApogyCoreInvocatorPackage.Literals.EENUM_ARGUMENT__EENUM),
//						EMFProperties.value(ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE))));

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
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Object.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								if(fromObject == operationCallInput){
									return false;
								}else if (fromObject instanceof EClassArgument
										&& ((EClassArgument) fromObject).getValue() == null) {
									return true;
								} else if (fromObject instanceof EObject
										&& !ApogyCommonEMFFacade.INSTANCE.getSettableEReferences((EObject)fromObject).isEmpty()) {
									return true;
								}
								return false;
							}
						}));
		m_bindingContext.bindValue(btnDeleteEnabledObserveValue, treeViewerSingleSelectionObservableValue, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(EObject.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								if(fromObject == operationCallInput){
									return false;
								}else if (fromObject instanceof Argument) {
									return false;
								}
								return true;
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
				} else if (object instanceof EClassArgument) {
					EClassArgument eClassArgumentObject = (EClassArgument) object;
					if (eClassArgumentObject.getValue() != null) {
						str = ((EClassArgument) object).getValue().toString();
					}
				} else if (object instanceof EEnumArgument) {
					str = ((EEnumArgument) object).getEEnumLiteral().getLiteral();
				} else {
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

	@Override
	public void dispose() {
		adapterFactory.dispose();
		super.dispose();
	}

}