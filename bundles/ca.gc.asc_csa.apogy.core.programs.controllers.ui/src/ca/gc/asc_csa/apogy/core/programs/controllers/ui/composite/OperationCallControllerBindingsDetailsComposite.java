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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EOperationsComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableFeatureReferenceComposite;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

public class OperationCallControllerBindingsDetailsComposite extends ScrolledComposite{

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	
	private VariableFeatureReferenceComposite variableFeatureReferenceComposite;
	private EOperationsComposite eOperationsComposite;
	private TriggerComposite triggerComposite;
	
	private DataBindingContext m_bindingContext;
	
	private Adapter adapter;
	
	private OperationCallControllerBinding operationCallControllerBinding;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 * @param style
	 */
	public OperationCallControllerBindingsDetailsComposite(Composite parent, int style) {
		super(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, true));
	
		/**
		 * VariableFeatureReference
		 */
		variableFeatureReferenceComposite = new VariableFeatureReferenceComposite(composite, SWT.NONE){
			@Override
			protected void newSelection(ISelection selection) {
				if (operationCallControllerBinding.getVariable() != null) {
					eOperationsComposite.setEClass(
							ApogyCoreInvocatorFacade.INSTANCE.getInstanceClass(operationCallControllerBinding),
							operationCallControllerBinding.getEOperation());
				}
				OperationCallControllerBindingsDetailsComposite.this.newSelection(selection);
			}
		};
		GridLayout gridLayout = (GridLayout) variableFeatureReferenceComposite.getLayout();
		gridLayout.marginWidth = 0;
		gridLayout.marginHeight = 0;
		variableFeatureReferenceComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 2, 1));
	
		Section sectionOperaion = toolkit.createSection(composite,  Section.EXPANDED | Section.TITLE_BAR);		
		sectionOperaion.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		sectionOperaion.setLayout(new FillLayout());
		sectionOperaion.setText("Operation");
		eOperationsComposite = new EOperationsComposite(sectionOperaion, SWT.NONE){
			@Override
			protected void newSelection(TreeSelection selection) {
				operationCallControllerBinding.setEOperation(eOperationsComposite.getSelectedEOperation());
				// TODO move to facade
				ApogyCoreInvocatorUIFacade.INSTANCE.setEOperationInitArguments(eOperationsComposite.getSelectedEOperation(), operationCallControllerBinding);
				if(operationCallControllerBinding.getArgumentsList() != null){
					for(int i = 0; i <  operationCallControllerBinding.getArgumentsList().getArguments().size(); i++){
						BindedEDataTypeArgument bindedArgument = ApogyCoreProgramsControllersFactory.eINSTANCE.createBindedEDataTypeArgument();
						ControllerValueSource valueSource = ApogyCoreProgramsControllersFactory.eINSTANCE.createControllerValueSource();
						valueSource.setConditioning(ApogyCoreProgramsControllersFactory.eINSTANCE.createLinearInputConditioning());
						bindedArgument.setValueSource(valueSource);
						operationCallControllerBinding.getArgumentsList().getArguments().set(i, bindedArgument);
					}
				}
				OperationCallControllerBindingsDetailsComposite.this.newSelection(selection);
			}
		};
		sectionOperaion.setClient(eOperationsComposite);

		
		Section sectionTrigger = toolkit.createSection(composite,  Section.EXPANDED | Section.TITLE_BAR);		
		sectionTrigger.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		sectionTrigger.setLayout(new FillLayout());
		sectionTrigger.setText("Trigger");
		triggerComposite = new TriggerComposite(sectionTrigger, SWT.None){
			@Override
			protected void newSelection(ISelection selection) {
				OperationCallControllerBindingsDetailsComposite.this.newSelection(selection);
			}
		};
		triggerComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		triggerComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		sectionTrigger.setClient(triggerComposite);
		
		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));	

		m_bindingContext = initDataBindings();
	}	
	
	/**
	 * This method is called when a new selection is made in the parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}
	
	public OperationCallControllerBinding getOperationCallControllerBinding(){
		return this.operationCallControllerBinding;
	}
	
	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
		if(this.operationCallControllerBinding != null){
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		this.operationCallControllerBinding = operationCallControllerBinding;
		
		variableFeatureReferenceComposite.set(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList(), this.operationCallControllerBinding);
		if (this.operationCallControllerBinding.getVariable()!=null){		
			eOperationsComposite.setEClass(ApogyCoreInvocatorFacade.INSTANCE.getInstanceClass(this.operationCallControllerBinding), this.operationCallControllerBinding.getEOperation());
		}else{
			eOperationsComposite.setEClass(null);
		}
		triggerComposite.setOperationCallControllerBinding(this.operationCallControllerBinding);
	
		this.operationCallControllerBinding.eAdapters().add(getAdapter());
	}
	
	protected DataBindingContext initDataBindings() {
		m_bindingContext = new DataBindingContext();

		
		return m_bindingContext;
	}
	
	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification notification) {
					if (notification.getFeature() == ApogyCoreInvocatorPackage.Literals.PROGRAM__PROGRAMS_GROUP) {
						setOperationCallControllerBinding(operationCallControllerBinding);
					}
				}
			};
		}
		return adapter;
	}

	@Override
	public void dispose() {
		if(this.operationCallControllerBinding != null){
			operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		super.dispose();
	}
}