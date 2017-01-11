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

public class BindedEDataTypeArgumentComposite extends ScrolledComposite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Composite composite;

	private ValueSourceComposite compositeValueSource;

	private Section sectionConditioning;
	private ConditioningComposite compositeConditioning;

	private BindedEDataTypeArgument bindedEDataTypeArgument;

//	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
//			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter adapter;

	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public BindedEDataTypeArgumentComposite(Composite parent, int style) {
		super(parent, style);
		this.computeSize(1, 1);
		setExpandHorizontal(true);
		setExpandVertical(true);

		composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, true));

		/**
		 * Value source
		 */
		compositeValueSource = new ValueSourceComposite(compositeValueSource, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				BindedEDataTypeArgumentComposite.this.newSelection(selection);
			}
		};
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
		
		compositeConditioning = new ConditioningComposite(sectionConditioning, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				BindedEDataTypeArgumentComposite.this.newSelection(selection);
			}
		};
		compositeConditioning.setBackgroundMode(SWT.INHERIT_FORCE);

//		updateDetailsComposites();

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

//		m_bindingContext = initDataBindingsCustom();
	}
	
	
	public void setBindedEDataTypeArgument(BindedEDataTypeArgument bindedEDataTypeArgument) {
		this.bindedEDataTypeArgument = bindedEDataTypeArgument;
	}

	/**
	 * Updates the value source composite depending on the selected argument
	 */
//	private void updateCompositeValueSource() {
//		if (compositeValueSource != null) {
//			for (Control control : compositeValueSource.getChildren()) {
//				control.dispose();
//			}
//		}
//
//		if (getSelectedArgument() != null) {
//			ValueSourceComposite contentComposite = new ValueSourceComposite(compositeValueSource, SWT.None) {
//				@Override
//				protected void newSelection(ISelection selection) {
//					updateCompositeConditioning();
//				}
//			};
//			contentComposite.setBindedEDataTypeArgument(getSelectedArgument());
//		} else {
//			getNoContentComposite(compositeValueSource);
//		}
//		compositeValueSource.layout();
//		this.layout();
//	}

	/**
	 * Updates the conditioning composite depending on the selected argument.
	 */
//	private void updateCompositeConditioning() {
//		if (compositeConditioning != null) {
//			compositeConditioning.dispose();
//		}
//
//		if (getSelectedArgument() != null && getSelectedArgument().getValueSource() instanceof ControllerValueSource) {
//			compositeConditioning = new ConditioningComposite(sectionConditioning, SWT.NO_SCROLL) {
//				@Override
//				protected void newSelection(ISelection selection) {
//					BindedEDataTypeArgumentComposite.this.newSelection(selection);
//				}
//			};
//			((ConditioningComposite) compositeConditioning).setAbstractInputConditioning(
//					((ControllerValueSource) getSelectedArgument().getValueSource()).getConditioning());
//
//			if (((ControllerValueSource) getSelectedArgument().getValueSource()).getEComponentQualifier() != null) {
//				((ConditioningComposite) compositeConditioning).setEComponentQualifier(
//						((ControllerValueSource) getSelectedArgument().getValueSource()).getEComponentQualifier());
//			}
//
//			compositeConditioning.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
//		} else {
//			compositeConditioning = getNoContentComposite(sectionConditioning);
//		}
//
//		sectionConditioning.setClient(compositeConditioning);
//		sectionConditioning.layout();
//		layout();
//	}

	/**
	 * Updates the details composites depending on the selected argument.
	 */
//	private void updateDetailsComposites() {
//		updateCompositeValueSource();
//		updateCompositeConditioning();
//	}

	/**
	 * Returns a {@link NoContentComposite} if a detail section is not
	 * applicable.
	 * 
	 * @param section
	 *            The parent {@link Section}.
	 * @return Reference to the {@link NoContentComposite}.
	 */
//	private Composite getNoContentComposite(Composite parent) {
//		NoContentComposite composite = new NoContentComposite(parent, SWT.None) {
//			@Override
//			protected String getMessage() {
//				return "No compatible selection";
//			}
//		};
//		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
//		composite.setBackgroundMode(SWT.INHERIT_FORCE);
//		return composite;
//	}


	/**
	 * Gets the {@link BindedEDataTypeArgument} selected in the viewer
	 * 
	 * @return
	 */
//	private BindedEDataTypeArgument getSelectedArgument() {
//		if (!tableViewerArguments.getStructuredSelection().isEmpty()) {
//			return (BindedEDataTypeArgument) tableViewerArguments.getStructuredSelection().getFirstElement();
//		}
//		return null;
//	}

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
//	@SuppressWarnings("unchecked")
//	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
//		if (this.operationCallControllerBinding != null) {
//			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
//		}
//		this.operationCallControllerBinding = operationCallControllerBinding;
//
//		TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain
//				.getEditingDomainFor(operationCallControllerBinding);
//
//		if (operationCallControllerBinding != null && operationCallControllerBinding.getArgumentsList() != null) {
//			tableViewerArguments.setInput(
//					EMFEditProperties.list(domain, ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS)
//							.observe(operationCallControllerBinding.getArgumentsList()));
//		} else {
//			tableViewerArguments.setInput(null);
//		}
//
//		refreshViewer();
//		this.operationCallControllerBinding.eAdapters().add(getAdapter());
//	}

//	protected DataBindingContext initDataBindingsCustom() {
//		m_bindingContext = new DataBindingContext();
//
//		tableViewerArguments.setContentProvider(new ArgumentsContentProvier(adapterFactory));
//		tableViewerArguments.setLabelProvider(new ArgumentsLabelProvider(adapterFactory));
//
//		return m_bindingContext;
//	}

	/**
	 * Adapter that updates the tableViewer input if the
	 * {@link OperationCallControllerBinding} is changed.
	 * 
	 * @return
	 */
//	private Adapter getAdapter() {
//		if (adapter == null) {
//			adapter = new EContentAdapter() {
//				List<EStructuralFeature> featuresRefresh;
//
//				@Override
//				public void notifyChanged(Notification notification) {
//					if (notification.getFeature() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST
//							&& notification.getNewValue() != null) {
//						setOperationCallControllerBinding(
//								(OperationCallControllerBinding) ((ArgumentsList) notification.getNewValue())
//										.getOperationCall());
//					}
//					if (getEStructuralFeatureRefresh().contains(notification.getFeature())
//							|| notification.getNotifier() instanceof AbstractInputConditioning) {
//						refreshViewer();
//					}
//					newSelection(null);
//					super.notifyChanged(notification);
//				}
//
//				/**
//				 * Provides a list of the structural features that should
//				 * refresh the tableViewer. This method implements a pattern of
//				 * lazy loading.
//				 */
//				private List<EStructuralFeature> getEStructuralFeatureRefresh() {
//					if (featuresRefresh == null) {
//						featuresRefresh = new ArrayList<EStructuralFeature>();
//						featuresRefresh.add(
//								ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER);
//
//						featuresRefresh.add(ApogyCommonEMFPackage.Literals.NAMED__NAME);
//						featuresRefresh.add(
//								ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);
//						featuresRefresh
//								.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__COMPONENT);
//						featuresRefresh.add(
//								ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING);
//						featuresRefresh.add(
//								ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);
//
//						featuresRefresh
//								.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__CURRENT_VALUE);
//						featuresRefresh
//								.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__INITIAL_VALUE);
//
//						featuresRefresh.add(ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE);
//
//						featuresRefresh.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME);
//						featuresRefresh.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME);
//					}
//					return featuresRefresh;
//
//				}
//			};
//		}
//		return adapter;
//	}

	@Override
	public void dispose() {
//		if (this.operationCallControllerBinding != null) {
//			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
//		}
		toolkit.dispose();
		super.dispose();
	}

}