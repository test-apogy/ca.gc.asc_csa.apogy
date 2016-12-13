package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.DecoratingObservableList;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.SubClassesListComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.io.jinput.ui.composites.ControllerSelectionComposite;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.CenteredLinearInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource;

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

public class BindedEDataTypeArgumentsComposite extends ScrolledComposite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Composite compositeArguments;
	private TableViewer tableViewerArguments;
	private Table tableArguments;

	private Section sectionValueSource;
	private Composite compositeValueSource;

	private Section sectionValue;
	private Composite compositeValue;

	private Section sectionConditioning;
	private Composite compositeConditioning;

	private OperationCallControllerBinding operationCallControllerBinding;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter adapter;;

	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public BindedEDataTypeArgumentsComposite(Composite parent, int style) {
		super(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, true));
		/**
		 * Arguments list
		 */
		Section sectionArgumentsList = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);
		sectionArgumentsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		sectionArgumentsList.setLayout(new FillLayout());
		sectionArgumentsList.setText("Arguments");

		compositeArguments = new Composite(sectionArgumentsList, SWT.None);
		GridLayout gridLayout_arguments = new GridLayout(1, false);
		gridLayout_arguments.marginWidth = 0;
		gridLayout_arguments.marginHeight = 0;
		gridLayout_arguments.marginBottom = 5;
		compositeArguments.setLayout(gridLayout_arguments);

		tableViewerArguments = new TableViewer(compositeArguments,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		tableArguments = tableViewerArguments.getTable();
		tableArguments.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2));
		tableArguments.setLinesVisible(true);
		tableArguments.setHeaderVisible(true);
		tableViewerArguments.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				updateDetailsComposites();
				newSelection(event.getSelection());
			}
		});

		TableViewerColumn tableViewerActionColumn = new TableViewerColumn(tableViewerArguments, SWT.NONE);
		TableColumn tableclmnAction = tableViewerActionColumn.getColumn();
		tableclmnAction.setWidth(100);
		tableclmnAction.setText("Parameter");

		TableViewerColumn tableViewerValueSourceColumn = new TableViewerColumn(tableViewerArguments, SWT.NONE);
		TableColumn tableclmnValueSource = tableViewerValueSourceColumn.getColumn();
		tableclmnValueSource.setWidth(175);
		tableclmnValueSource.setText("Value source");

		TableViewerColumn tableViewerValueColumn = new TableViewerColumn(tableViewerArguments, SWT.NONE);
		TableColumn tableclmnValue = tableViewerValueColumn.getColumn();
		tableclmnValue.setWidth(100);
		tableclmnValue.setText("Value");

		TableViewerColumn tableViewerConditioningColumn = new TableViewerColumn(tableViewerArguments, SWT.NONE);
		TableColumn tableclmnConditioning = tableViewerConditioningColumn.getColumn();
		tableclmnConditioning.setWidth(100);
		tableclmnConditioning.setText("Conditioning");
		sectionArgumentsList.setClient(compositeArguments);

		/**
		 * Value source
		 */
		sectionValueSource = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);
		sectionValueSource.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sectionValueSource.setLayout(new FillLayout());
		sectionValueSource.setText("Source");

		/**
		 * Conditioning
		 */
		sectionConditioning = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);
		sectionConditioning.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		sectionConditioning.setLayout(new FillLayout());
		sectionConditioning.setText("Conditioning");

		compositeConditioning = new Composite(sectionConditioning, SWT.None);
		GridLayout gridLayout_conditioning = new GridLayout(1, false);
		gridLayout_conditioning.marginWidth = 0;
		gridLayout_conditioning.marginHeight = 0;
		gridLayout_conditioning.marginBottom = 5;
		compositeArguments.setLayout(gridLayout_conditioning);

		/**
		 * Value source value
		 */
		sectionValue = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);
		sectionValue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sectionValue.setLayout(new FillLayout());
		sectionValue.setText("Value");

		compositeValue = new Composite(sectionValue, SWT.None){
			@Override
			public void dispose() {
			System.out.println(
					"BindedEDataTypeArgumentsComposite.BindedEDataTypeArgumentsComposite(...).new Composite() {...}.dispose()");
			super.dispose();
			}
		};
		GridLayout gridLayout_value = new GridLayout(1, false);
		gridLayout_value.marginWidth = 0;
		gridLayout_value.marginHeight = 0;
		gridLayout_value.marginBottom = 5;
		compositeArguments.setLayout(gridLayout_value);

		updateDetailsComposites();

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		m_bindingContext = initDataBindingsCustom();
	}

	private void updateCompositeValueSource() {
		if (compositeValueSource != null) {
			compositeValueSource.dispose();
		}

		if (getSelectedArgument() != null) {

			/**
			 * Value source
			 */
			compositeValueSource = new SubClassesListComposite(sectionValueSource, SWT.None) {
				@Override
				protected void newSelection(TreeSelection selection) {
					if (getSelectedArgument().getValueSource().eClass() != (EClass) selection.getFirstElement()) {
						ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(getSelectedArgument(),
								ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE,
								EcoreUtil.create((EClass) selection.getFirstElement()));
						if (getSelectedArgument().getValueSource() instanceof ControllerValueSource) {
							CenteredLinearInputConditioning conditioning = ApogyCoreProgramsControllersFactory.eINSTANCE
									.createCenteredLinearInputConditioning();
							conditioning.setDeadBand((float) 0.1);
							ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(getSelectedArgument().getValueSource(),
									ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
									conditioning);
						}
						updateCompositeValue();
						updateCompositeConditioning();
						tableViewerArguments.refresh();
						BindedEDataTypeArgumentsComposite.this.newSelection(null);
					}
				}

				@Override
				protected AdapterFactoryContentProvider getContentProvider() {
					return new AdapterFactoryContentProvider(adapterFactory) {
						@Override
						public boolean hasChildren(Object object) {
							return false;
						}

						@Override
						public Object[] getElements(Object object) {
							List<EClass> eClasses = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses((EClass) object);

							if (getSelectedArgument().getEParameter().getEType() != EcorePackage.Literals.EBOOLEAN) {
								eClasses.remove(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE);
							}
							;
							return eClasses.toArray();
						}
					};
				}

				@Override
				protected StyledCellLabelProvider getLabelProvider() {
					return new StyledCellLabelProvider() {
						@Override
						public void update(ViewerCell cell) {
							if (cell.getElement() instanceof EClass) {
								cell.setText(((EClass) cell.getElement()).getName());
							}
						}
					};
				}
			};

			((SubClassesListComposite) compositeValueSource)
					.setSuperClass(ApogyCoreProgramsControllersPackage.Literals.VALUE_SOURCE);
			((SubClassesListComposite) compositeValueSource)
					.setSelectedEClass((getSelectedArgument().getValueSource().eClass()));

			GridLayout gridLayout_valueSource = new GridLayout(1, false);
			gridLayout_valueSource.marginWidth = 0;
			gridLayout_valueSource.marginHeight = 0;
			gridLayout_valueSource.marginBottom = 5;
			compositeValueSource.setLayout(gridLayout_valueSource);
		} else {
			compositeValueSource = getNoContentComposite(sectionValueSource);
		}

		sectionValueSource.setClient(compositeValueSource);
		sectionValueSource.layout();
		layout();
	}

	private void updateCompositeValue() {
		if (compositeValue != null) {
			compositeValue.dispose();
		}

		if (getSelectedArgument() != null) {
			compositeValue = new Composite(sectionValue, SWT.None);
			compositeValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			GridLayout gridLayout_value = new GridLayout(2, false);
			gridLayout_value.marginWidth = 0;
			gridLayout_value.marginHeight = 0;
			gridLayout_value.marginBottom = 5;
			compositeValue.setLayout(gridLayout_value);

			if (getSelectedArgument().getValueSource() instanceof FixedValueSource) {
				// TODO replace by Apogy custom EMF with units.
				ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(compositeValue,
						getSelectedArgument().getValueSource());
			} else if (getSelectedArgument().getValueSource() instanceof ToggleValueSource) {
				compositeValue = getNoContentComposite(sectionValue);
			} else if (getSelectedArgument().getValueSource() instanceof ControllerValueSource) {
				compositeValue = new ControllerSelectionComposite(sectionValue, SWT.None);
				((ControllerSelectionComposite) compositeValue).setEComponentQualifier(
						((ControllerValueSource) getSelectedArgument().getValueSource()).getEComponentQualifier());
				compositeValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			}
		} else {
			compositeValue = getNoContentComposite(sectionValue);
		}
		sectionValue.setClient(compositeValue);
		sectionValue.layout();
		layout();
	}

	private void updateCompositeConditioning() {
		if (compositeConditioning != null) {
			compositeConditioning.dispose();
		}

		if (getSelectedArgument() != null && getSelectedArgument().getValueSource() instanceof ControllerValueSource) {
			ControllerValueSource controllerValueSource = (ControllerValueSource) getSelectedArgument()
					.getValueSource();

			compositeConditioning = new Composite(sectionConditioning, SWT.None);
			compositeConditioning.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			GridLayout gridLayout_value = new GridLayout(2, true);
			gridLayout_value.marginWidth = 0;
			gridLayout_value.marginHeight = 0;
			gridLayout_value.marginBottom = 5;
			compositeConditioning.setLayout(gridLayout_value);

			AbstractInputConditioningResponsePlotComposite plotComposite = new AbstractInputConditioningResponsePlotComposite(
					compositeConditioning, SWT.None);
			plotComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
			plotComposite.setAbstractInputConditioning(controllerValueSource.getConditioning());

			Composite conditionningEMFForms = new Composite(compositeConditioning, SWT.None);
			conditionningEMFForms.setLayout(new GridLayout());
			conditionningEMFForms.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
			conditionningEMFForms.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

			SubClassesListComposite subClassesListComposite = new SubClassesListComposite(compositeConditioning,
					SWT.None) {
				@Override
				protected void newSelection(TreeSelection selection) {
					if (!selection.isEmpty()) {
						EList<?> test = controllerValueSource.eContents();
						
						AbstractInputConditioning abstractInputConditioning = (AbstractInputConditioning) EcoreUtil
								.create((EClass) selection.getFirstElement());
						ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(controllerValueSource,
								ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
								abstractInputConditioning);

						plotComposite.setAbstractInputConditioning(controllerValueSource.getConditioning());
						ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(conditionningEMFForms,
								controllerValueSource.getConditioning());
						BindedEDataTypeArgumentsComposite.this.newSelection(null);
					}
				}
			};
			((SubClassesListComposite) subClassesListComposite)
					.setSuperClass(ApogyCoreProgramsControllersPackage.Literals.ABSTRACT_INPUT_CONDITIONING);
			if (controllerValueSource.getConditioning() != null) {
				((SubClassesListComposite) subClassesListComposite).setSelectedEClass(
						((EClass) ((StructuredSelection) subClassesListComposite.getSelection()).getFirstElement()));
			}
			ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(conditionningEMFForms,
					controllerValueSource.getConditioning());
			subClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			subClassesListComposite.moveAbove(plotComposite);

			compositeConditioning.layout();
		} else {
			compositeConditioning = getNoContentComposite(sectionConditioning);
		}

		sectionConditioning.setClient(compositeConditioning);
		sectionConditioning.layout();
		layout();
	}

	private void updateDetailsComposites() {
		updateCompositeValueSource();
		updateCompositeValue();
		updateCompositeConditioning();
	}

	/**
	 * 
	 * @param section
	 * @return
	 */
	private Composite getNoContentComposite(Section section) {
		NoContentComposite composite = new NoContentComposite(section, SWT.None) {
			@Override
			protected String getMessage() {
				return "No compatible selection";
			}
		};
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		return composite;
	}

	protected void packColumns() {
		for (TableColumn column : tableViewerArguments.getTable().getColumns()) {
			column.pack();
		}
	}

	private BindedEDataTypeArgument getSelectedArgument() {
		if (!tableViewerArguments.getStructuredSelection().isEmpty()) {
			return (BindedEDataTypeArgument) tableViewerArguments.getStructuredSelection().getFirstElement();
		}
		return null;
	}

	/**
	 * This method is called when a new selection is made in the
	 * parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	public EObject getSelectedEObject() {
		return (EObject) tableViewerArguments.getStructuredSelection().getFirstElement();
	}

	/**
	 * Returns the reference to the {@link ArgumentsList}.
	 * 
	 * @return Reference to the {@link ArgumentsList}.
	 */
	public ArgumentsList getArgumentsList() {
		return operationCallControllerBinding.getArgumentsList();
	}

	/**
	 * Gets the {@link EList} of {@link Argument} in the {@link ArgumentsList}.
	 * 
	 * @return List of {@link Argument}.
	 */
	public EList<Argument> getArguments() {
		return operationCallControllerBinding.getArgumentsList().getArguments();
	}

	/**
	 * Binds the {@link OperationCallControllerBinding} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCallControllerBinding}.
	 */
	@SuppressWarnings("unchecked")
	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
		if (this.operationCallControllerBinding != null) {
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		this.operationCallControllerBinding = operationCallControllerBinding;

		TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(operationCallControllerBinding);

		if(operationCallControllerBinding != null && operationCallControllerBinding.getArgumentsList() != null){
			tableViewerArguments
			.setInput(EMFEditProperties.list(domain, ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS)
					.observe(operationCallControllerBinding.getArgumentsList()));
			tableViewerArguments.refresh();
		}else{
			tableViewerArguments.setInput(null);
		}
		
		packColumns();
		this.operationCallControllerBinding.eAdapters().add(getAdapter());
	}

	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();

		tableViewerArguments.setContentProvider(new ArgumentsContentProvier(adapterFactory));
		tableViewerArguments.setLabelProvider(new ArgumentsLabelProvider(adapterFactory));

		return m_bindingContext;
	}

	/**
	 * Content provider for the arguments.
	 * 
	 */
	private class ArgumentsContentProvier extends AdapterFactoryContentProvider {

		public ArgumentsContentProvier(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object object) {
			List<Object> objects = new ArrayList<>();
			for (Object object1 : ((DecoratingObservableList<?>) object)) {
				if (object1 instanceof BindedEDataTypeArgument) {
					objects.add(object1);
				}
			}
			return objects.toArray();
		}

		@Override
		public boolean hasChildren(Object object) {
			return false;
		}

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			packColumns();
		}

	}

	/**
	 * Label provider for the arguments.
	 */
	private class ArgumentsLabelProvider extends AdapterFactoryLabelProvider {

		private static final int PARAMETER_COLUMN_ID = 0;
		private static final int VALUE_SOURCE_ID = 1;
		private static final int VALUE_ID = 2;
		private static final int CONDITIONING_ID = 3;

		public ArgumentsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";
					
			if(operationCallControllerBinding.getArgumentsList() == null || !operationCallControllerBinding.getArgumentsList().getArguments().contains(object)){
				return str;
			}

			ValueSource valueSource = ((BindedEDataTypeArgument) object).getValueSource();
			switch (columnIndex) {
			case PARAMETER_COLUMN_ID:
				str = super.getColumnText(object, 0);
				break;
			case VALUE_SOURCE_ID:
				if (valueSource != null) {
					str = valueSource.eClass().getName();
				}
				break;
			case VALUE_ID:
				if (valueSource instanceof FixedValueSource) {
					str = ((FixedValueSource) valueSource).getValue();
				} else if (valueSource instanceof ToggleValueSource) {
					str = "Initial : " + String.valueOf(((ToggleValueSource) valueSource).isInitialValue())
							+ ", Current : " + String.valueOf(((ToggleValueSource) valueSource).isCurrentValue());
				} else if (valueSource instanceof ControllerValueSource) {
					EComponentQualifier qualifier = ((ControllerValueSource) valueSource).getEComponentQualifier();
					str = qualifier.getEControllerName() + "." + qualifier.getEComponentName();
				}
				break;
			case CONDITIONING_ID:
				if (valueSource instanceof ControllerValueSource) {
					str = super.getColumnText(((ControllerValueSource) valueSource).getConditioning(), columnIndex);
				} else {
					str = "N/A";
				}

				break;
			default:
				break;
			}
			return str;
		}

		@Override
		public Image getColumnImage(Object object, int columnIndex) {
			ValueSource valueSource = ((BindedEDataTypeArgument) object).getValueSource();
			switch (columnIndex) {
			case CONDITIONING_ID:
				if (valueSource instanceof ControllerValueSource) {
					return super.getColumnImage(((ControllerValueSource) valueSource).getConditioning(), columnIndex);
				}
			default:
				return null;
			}
		}

	}

	/**
	 * Adapter that updates the treeViewer input if the {@link ArgumentsList} is
	 * changed.
	 * 
	 * @return
	 */
	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new EContentAdapter() {
				List<EStructuralFeature> features;

				@Override
				public void notifyChanged(Notification notification) {
					System.out.println(notification.getFeature());
					if(notification.getFeature() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST){
						System.out.println("1");
						if(notification.getNewValue() == null){
							System.out.println("2");
							if (!tableViewerArguments.getTable().isDisposed() && !tableViewerArguments.isBusy()) {
								tableViewerArguments.refresh();
								packColumns();
							}
						}else{
							System.out.println("3");
							setOperationCallControllerBinding(
									(OperationCallControllerBinding) ((ArgumentsList) notification.getNewValue())
											.getOperationCall());
						}
					}
					if (getEStructuralFeature().contains(notification.getFeature()) || notification.getNotifier() instanceof AbstractInputConditioning) {
						if (!tableViewerArguments.getTable().isDisposed() && !tableViewerArguments.isBusy()) {
							tableViewerArguments.refresh();
							packColumns();
						}				
					}
					newSelection(null);
					super.notifyChanged(notification);
				}

				private List<EStructuralFeature> getEStructuralFeature() {
					if (features == null) {
						features = new ArrayList<EStructuralFeature>();

						features.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION);
						features.add(ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER);
						
						features.add(ApogyCommonEMFPackage.Literals.NAMED__NAME);
						features.add(ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);
						features.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__COMPONENT);
						features.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING);
						features.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);
						
						features.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__CURRENT_VALUE);
						features.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__INITIAL_VALUE);
						
						features.add(ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE);

						features.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME);
						features.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME);
					}
					return features;

				}
			};
		}
		return adapter;
	}

	@Override
	public void dispose() {
		if (this.operationCallControllerBinding != null) {
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		toolkit.dispose();
		super.dispose();
	}

}