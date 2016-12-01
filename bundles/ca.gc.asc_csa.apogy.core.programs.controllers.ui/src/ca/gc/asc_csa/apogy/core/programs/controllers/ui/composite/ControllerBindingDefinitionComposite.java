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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectListComposite;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.Trigger;

public class ControllerBindingDefinitionComposite extends ScrolledComposite {

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
	public ControllerBindingDefinitionComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		setExpandHorizontal(true);
		setExpandVertical(true);

		composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, true));
		
		triggersListComposite = new EObjectListComposite(composite, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				EObject eObject = ApogyCoreProgramsControllersFactory.eINSTANCE.create((EClass)getSelectedEObject());
				operationCallControllerBinding.setTrigger((Trigger) eObject);
				setEComponentComposite();
				ControllerBindingDefinitionComposite.this.newSelection(selection);
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
		triggersListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		eComponentComposite = new Composite(composite, SWT.None);
		eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}

	public Trigger getTrigger() {
		return this.operationCallControllerBinding == null ? null : this.operationCallControllerBinding.getTrigger();
	}
	
	public BindedEDataTypeArgument getSelectedArgument(){
		// TODO
		return null;
	}

	private void setEComponentComposite(){
		
		if(eComponentComposite != null){
			eComponentComposite.dispose();
		}
		
		Trigger trigger = this.operationCallControllerBinding.getTrigger();
		
		if(trigger instanceof TimeTrigger){
			eComponentComposite = new BindedEDataTypeArgumentsComposite(composite, SWT.None);
			eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
		}else if(trigger instanceof ControllerEdgeTrigger){
			eComponentComposite = new Composite(composite, SWT.None);
			eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			eComponentComposite.setLayout(new FillLayout(SWT.VERTICAL));
			
			EObjectListComposite edgeTypesComposite = new EObjectListComposite(eComponentComposite, SWT.None){
				@Override
				protected void newSelection(TreeSelection selection) {
					// TODO
					super.newSelection(selection);
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
			edgeTypesComposite.setEObjectsList(ApogyCoreProgramsControllersPackage.Literals.EDGE_TYPE.getELiterals());
			
			ControllerSelectionComposite controllerSelectionComposite = new ControllerSelectionComposite(
					eComponentComposite, SWT.None);
			controllerSelectionComposite
					.setEComponentQualifier(((ControllerEdgeTrigger) trigger).getComponentQualifier());
	} else if (trigger instanceof ControllerStateTrigger) {
			eComponentComposite = new ControllerSelectionComposite(composite, SWT.None);
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

	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();

		return m_bindingContext;
	}

	
	protected void newSelection(ISelection selection){
		
	}
	/**
	 * TODO
	 * @return
	 */
	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					setOperationCallControllerBinding(operationCallControllerBinding);
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