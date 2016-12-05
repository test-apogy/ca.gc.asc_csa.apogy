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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectListComposite;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.Trigger;

public class TriggerComposite extends ScrolledComposite {

	private Composite composite;
	private EObjectListComposite triggersListComposite;
	private Composite eComponentComposite;

	private OperationCallControllerBinding operationCallControllerBinding;

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
	public TriggerComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		setExpandHorizontal(true);
		setExpandVertical(true);

		composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(1, true));
		
		triggersListComposite = new EObjectListComposite(composite, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				Trigger trigger = null;
				if(getSelectedEObject() == ApogyCoreProgramsControllersPackage.Literals.TIME_TRIGGER){
					trigger = ApogyCoreProgramsControllersFactory.eINSTANCE.createTimeTrigger();
				}else if(getSelectedEObject() == ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_EDGE_TRIGGER){
					trigger = ApogyCoreProgramsControllersFactory.eINSTANCE.createControllerEdgeTrigger();
				}
				else if(getSelectedEObject() == ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_STATE_TRIGGER){
					trigger = ApogyCoreProgramsControllersFactory.eINSTANCE.createControllerStateTrigger();
				}
				operationCallControllerBinding.setTrigger(trigger);
				setEComponentComposite();
				TriggerComposite.this.newSelection(selection);
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
		triggersListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		
		eComponentComposite = new Composite(composite, SWT.NONE);
		eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		
		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	public Trigger getTrigger() {
		return this.operationCallControllerBinding == null ? null : this.operationCallControllerBinding.getTrigger();
	}

	private void setEComponentComposite(){
		
		if(eComponentComposite != null){
			eComponentComposite.dispose();
		}
		if(m_bindingContext != null){
			m_bindingContext.dispose();
		}
		Trigger trigger = this.operationCallControllerBinding.getTrigger();
		
		if(trigger instanceof TimeTrigger){
			// TODO replace by general apogy entrybox with units.
			
			eComponentComposite = new Composite(composite, SWT.BORDER);
			eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.UP, true, false, 1, 1));
			eComponentComposite.setLayout(new GridLayout(3, false));
			
			Label labelRefreshPeriod = new Label(eComponentComposite, SWT.None);
			labelRefreshPeriod.setText("Delay : ");
			labelRefreshPeriod.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
			
			Text textRefreshPeriod = new Text(eComponentComposite, SWT.WRAP | SWT.SINGLE);
			textRefreshPeriod.setText("Delay");
			textRefreshPeriod.setEditable(true);
			textRefreshPeriod.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
			
			Label labelMs = new Label(eComponentComposite, SWT.None);
			labelMs.setText("ms");
			labelMs.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
			
			m_bindingContext = new DataBindingContext();
			
			IObservableValue<?> observeTextTextvalue = WidgetProperties.text(SWT.Modify).observe(textRefreshPeriod);
			@SuppressWarnings("unchecked")
			IObservableValue<?> observeRefreshPeriodValue = EMFProperties.value(ApogyCoreProgramsControllersPackage.Literals.TIME_TRIGGER__REFRESH_PERIOD).observe(trigger);
			m_bindingContext.bindValue(observeTextTextvalue, observeRefreshPeriodValue,
					new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(String.class, long.class) {
						@Override
						public Object convert(Object fromObject) {
							if (fromObject != null) {
								try {
									long longvalue = Long.parseLong((String) fromObject);
									return longvalue;
								} catch (NumberFormatException e) {
									String message = this.getClass().getSimpleName()
											+ "Converter(String.class, long.class)" + "Value is not a parsable long";
									Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
								}
							}
							newSelection(new StructuredSelection(getSelectedTrigger()));
							return ((TimeTrigger) trigger).getRefreshPeriod();
						}
					}), new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(long.class, String.class) {
						@Override
						public Object convert(Object fromObject) {
							newSelection(new StructuredSelection(getSelectedTrigger()));
							return fromObject == null ? "<undef>" : String.valueOf((long) fromObject);
						}
					}));

		} else if (trigger instanceof ControllerEdgeTrigger) {
			eComponentComposite = new Composite(composite, SWT.BORDER);
			eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
			eComponentComposite.setLayout(new GridLayout(1, false));

			EObjectListComposite edgeTypesComposite = new EObjectListComposite(eComponentComposite, SWT.None) {
				@Override
				protected void newSelection(TreeSelection selection) {
					((ControllerEdgeTrigger) trigger)
							.setEdgeType(EdgeType.get(((EEnumLiteral) selection.getFirstElement()).getLiteral()));
					TriggerComposite.this.newSelection(selection);
				}

				@Override
				protected StyledCellLabelProvider getLabelProvider() {
					return new StyledCellLabelProvider() {
						@Override
						public void update(ViewerCell cell) {
							if (cell.getElement() instanceof EEnumLiteral) {
								cell.setText(((EEnumLiteral) cell.getElement()).getLiteral());
							}
						}
					};
				}
			};
			edgeTypesComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
			edgeTypesComposite.setEObjectsList(ApogyCoreProgramsControllersPackage.Literals.EDGE_TYPE.getELiterals());

			ControllerSelectionComposite controllerSelectionComposite = new ControllerSelectionComposite(
					eComponentComposite, SWT.NONE) {
				@Override
				protected void newSelection(ISelection selection) {
					TriggerComposite.this.newSelection(selection);
				}
			};
			controllerSelectionComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
			controllerSelectionComposite
					.setEComponentQualifier(((ControllerEdgeTrigger) trigger).getComponentQualifier());
		} else if (trigger instanceof ControllerStateTrigger) {
			eComponentComposite = new ControllerSelectionComposite(composite, SWT.BORDER) {
				@Override
				protected void newSelection(ISelection selection) {
					TriggerComposite.this.newSelection(selection);
				}
			};
			eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
			((ControllerSelectionComposite) eComponentComposite)
					.setEComponentQualifier(((ControllerStateTrigger) trigger).getComponentQualifier());

		}
		composite.layout();
	}

	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCall}.
	 */
	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
		if (this.operationCallControllerBinding != null) {
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		this.operationCallControllerBinding = operationCallControllerBinding;
		
		/**
		 * Set the triggers to select
		 */
		EList<EObject> eObjectsEClassList = new BasicEList<EObject>();
		eObjectsEClassList.addAll(ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(
				ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER
						.getEReferenceType()));
		triggersListComposite.setEObjectsList(eObjectsEClassList);
		
		setEComponentComposite();

		this.operationCallControllerBinding.eAdapters().add(getAdapter());
	}
	
	protected void newSelection(ISelection selection){
		
	}
	
	public EObject getSelectedTrigger(){
		return triggersListComposite.getSelectedEObject();
	}
	
	/**
	 * @return
	 */
	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getFeature() != null){
						if(msg.getFeature() != ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER){
							triggersListComposite.refreshTreeViewer();
						}else{
							setEComponentComposite();
						}
						
					}					
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
		super.dispose();
	}

}