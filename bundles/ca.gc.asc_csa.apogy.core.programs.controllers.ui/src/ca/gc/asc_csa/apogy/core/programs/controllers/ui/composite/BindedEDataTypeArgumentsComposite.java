package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.DecoratingObservableList;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
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

	private TableViewer tableViewerArguments;
	private Composite composite;

	private Composite compositeValueSource;

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

		composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, true));
		/**
		 * Arguments list
		 */
		Section sectionArgumentsList = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);
		sectionArgumentsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		sectionArgumentsList.setLayout(new FillLayout());
		sectionArgumentsList.setText("Arguments");

		Composite compositeArguments = new Composite(sectionArgumentsList, SWT.None);
		GridLayout gridLayout_arguments = new GridLayout(1, false);
		gridLayout_arguments.marginWidth = 0;
		gridLayout_arguments.marginHeight = 0;
		gridLayout_arguments.marginBottom = 5;
		compositeArguments.setLayout(gridLayout_arguments);

		tableViewerArguments = new TableViewer(compositeArguments,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		Table tableArguments = tableViewerArguments.getTable();
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
		compositeValueSource = new Composite(composite, SWT.None);
		compositeValueSource.setLayout(new FillLayout());
		compositeValueSource.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		compositeValueSource.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		compositeValueSource.setBackgroundMode(SWT.INHERIT_FORCE);

		/**
		 * Conditioning
		 */
		sectionConditioning = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);
		sectionConditioning.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		sectionConditioning.setLayout(new FillLayout());
		sectionConditioning.setText("Conditioning");
		compositeConditioning = getNoContentComposite(sectionConditioning);

		updateDetailsComposites();

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		m_bindingContext = initDataBindingsCustom();
	}

	/**
	 * Updates the value source composite depending on the selected argument
	 */
	private void updateCompositeValueSource() {
		if (compositeValueSource != null) {
			for (Control control : compositeValueSource.getChildren()) {
				control.dispose();
			}
		}

		if (getSelectedArgument() != null) {
			ValueSourceComposite contentComposite = new ValueSourceComposite(compositeValueSource, SWT.None);
			// compositeValueSource.setLayoutData(new GridData(SWT.FILL,
			// SWT.FILL, true, true, 1, 1));
			contentComposite.setBindedEDataTypeArgument(getSelectedArgument());
		} else {
			getNoContentComposite(compositeValueSource);
			// compositeValueSource.setLayoutData(new GridData(SWT.FILL,
			// SWT.FILL, true, true, 1, 1));
		}
		compositeValueSource.layout();
		this.layout();
	}

	// /**
	// * Updates the value composite depending on the selected argument.
	// */
	// private void updateCompositeValue() {
	// if (compositeValue != null) {
	// compositeValue.dispose();
	// }
	//
	// if (getSelectedArgument() != null) {
	// compositeValue = new Composite(sectionValue, SWT.None);
	// compositeValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
	// GridLayout gridLayout_value = new GridLayout(2, false);
	// gridLayout_value.marginWidth = 0;
	// gridLayout_value.marginHeight = 0;
	// gridLayout_value.marginBottom = 5;
	// compositeValue.setLayout(gridLayout_value);
	//
	// /**
	// * Set the value composite depending on the value source.
	// */
	// if (getSelectedArgument().getValueSource() instanceof FixedValueSource) {
	// // TODO replace by Apogy custom EMF with units.
	// ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(compositeValue,
	// getSelectedArgument().getValueSource());
	// } else if (getSelectedArgument().getValueSource() instanceof
	// ToggleValueSource) {
	// compositeValue = getNoContentComposite(sectionValue);
	// } else if (getSelectedArgument().getValueSource() instanceof
	// ControllerValueSource) {
	// compositeValue = new ControllerSelectionComposite(sectionValue,
	// SWT.None);
	// ((ControllerSelectionComposite) compositeValue).setEComponentQualifier(
	// ((ControllerValueSource)
	// getSelectedArgument().getValueSource()).getEComponentQualifier());
	// compositeValue.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
	// }
	// } else {
	// compositeValue = getNoContentComposite(sectionValue);
	// }
	// sectionValue.setClient(compositeValue);
	// sectionValue.layout();
	// layout();
	// }

	/**
	 * Updates the conditioning composite depending on the selected argument.
	 */
	private void updateCompositeConditioning() {
		if (compositeConditioning != null) {
			compositeConditioning.dispose();
		}

		if (getSelectedArgument() != null && getSelectedArgument().getValueSource() instanceof ControllerValueSource) {
			compositeConditioning = new ConditioningComposite(sectionConditioning, SWT.NO_SCROLL) {
				@Override
				protected void newSelection(ISelection selection) {
					BindedEDataTypeArgumentsComposite.this.newSelection(selection);
				}
			};
			((ConditioningComposite) compositeConditioning).setAbstractInputConditioning(
					((ControllerValueSource) getSelectedArgument().getValueSource()).getConditioning());
			compositeConditioning.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		} else {
			compositeConditioning = getNoContentComposite(sectionConditioning);
		}

		sectionConditioning.setClient(compositeConditioning);
		sectionConditioning.layout();
		layout();
	}

	/**
	 * Updates the details composites depending on the selected argument.
	 */
	private void updateDetailsComposites() {
		updateCompositeValueSource();
		// updateCompositeValue();
		updateCompositeConditioning();
	}

	/**
	 * Returns a {@link NoContentComposite} if a detail section is not
	 * applicable.
	 * 
	 * @param section
	 *            The parent {@link Section}.
	 * @return Reference to the {@link NoContentComposite}.
	 */
	private Composite getNoContentComposite(Composite parent) {
		NoContentComposite composite = new NoContentComposite(parent, SWT.None) {
			@Override
			protected String getMessage() {
				return "No compatible selection";
			}
		};
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite.setBackgroundMode(SWT.INHERIT_FORCE);
		return composite;
	}

	/**
	 * Refreshed the viewer and adjusts the columns.
	 */
	protected void refreshViewer() {
		if (!tableViewerArguments.getTable().isDisposed() && !tableViewerArguments.isBusy()) {
			tableViewerArguments.refresh();
			for (TableColumn column : tableViewerArguments.getTable().getColumns()) {
				column.pack();
			}
		}
	}

	/**
	 * Gets the {@link BindedEDataTypeArgument} selected in the viewer
	 * 
	 * @return
	 */
	private BindedEDataTypeArgument getSelectedArgument() {
		if (!tableViewerArguments.getStructuredSelection().isEmpty()) {
			return (BindedEDataTypeArgument) tableViewerArguments.getStructuredSelection().getFirstElement();
		}
		return null;
	}

	/**
	 * This method is called when a new selection is made .
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
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

		if (operationCallControllerBinding != null && operationCallControllerBinding.getArgumentsList() != null) {
			tableViewerArguments.setInput(
					EMFEditProperties.list(domain, ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS)
							.observe(operationCallControllerBinding.getArgumentsList()));
		} else {
			tableViewerArguments.setInput(null);
		}

		refreshViewer();
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
			refreshViewer();
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

			System.out.println(operationCallControllerBinding.getEOperation().toString());
			System.out.println(operationCallControllerBinding.getArgumentsList().getArguments().size());
			// This is used in the case where refresh is called on an Argument
			// that is not in the ArgumentsList anymore.
			if (operationCallControllerBinding.getArgumentsList() == null
					|| !operationCallControllerBinding.getArgumentsList().getArguments().contains(object)) {
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
	 * Adapter that updates the tableViewer input if the
	 * {@link OperationCallControllerBinding} is changed.
	 * 
	 * @return
	 */
	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new EContentAdapter() {
				List<EStructuralFeature> featuresRefresh;

				@Override
				public void notifyChanged(Notification notification) {
					if (notification.getFeature() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST
							&& notification.getNewValue() != null) {
						setOperationCallControllerBinding(
								(OperationCallControllerBinding) ((ArgumentsList) notification.getNewValue())
										.getOperationCall());
					}
					if (getEStructuralFeatureRefresh().contains(notification.getFeature())
							|| notification.getNotifier() instanceof AbstractInputConditioning) {
						refreshViewer();
					}
					newSelection(null);
					super.notifyChanged(notification);
				}

				/**
				 * Provides a list of the structural features that should
				 * refresh the tableViewer. This method implements a pattern of
				 * lazy loading.
				 */
				private List<EStructuralFeature> getEStructuralFeatureRefresh() {
					if (featuresRefresh == null) {
						featuresRefresh = new ArrayList<EStructuralFeature>();
						featuresRefresh.add(
								ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER);

						featuresRefresh.add(ApogyCommonEMFPackage.Literals.NAMED__NAME);
						featuresRefresh.add(
								ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);
						featuresRefresh
								.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__COMPONENT);
						featuresRefresh.add(
								ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING);
						featuresRefresh.add(
								ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);

						featuresRefresh
								.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__CURRENT_VALUE);
						featuresRefresh
								.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__INITIAL_VALUE);

						featuresRefresh.add(ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE);

						featuresRefresh.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME);
						featuresRefresh.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME);
					}
					return featuresRefresh;

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