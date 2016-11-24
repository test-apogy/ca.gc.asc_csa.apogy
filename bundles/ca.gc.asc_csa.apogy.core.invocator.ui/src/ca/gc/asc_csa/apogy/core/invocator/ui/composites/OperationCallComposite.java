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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EOperationsComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;

public class OperationCallComposite extends ScrolledComposite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	
	private DataBindingContext m_bindingContext;
	private Section sctnOperation;	
	private VariableFeatureReferenceComposite variableFeatureReferenceComposite;
	private EOperationsComposite eOperationsComposite;
	private Section sctnArguments;
	private OperationCallArgumentsComposite argumentsComposite;
	private OperationCall operationCall;	

	private AdapterImpl operationCallAdapter;
	AdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * Create the parentComposite.
	 * @param parent Reference to the parent parentComposite.
	 * @param style Composite style.
	 */
	public OperationCallComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		setLayout(new GridLayout(1, true));
		setExpandHorizontal(true);
		setExpandVertical(true);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(3, true));
		
		/**
		 * Operation
		 */
		variableFeatureReferenceComposite = new VariableFeatureReferenceComposite(composite, SWT.NONE);
		GridLayout gridLayout_2 = (GridLayout) variableFeatureReferenceComposite.getLayout();
		gridLayout_2.marginWidth = 0;
		gridLayout_2.marginHeight = 0;
		GridData gd_variableFeatureReferenceComposite = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		variableFeatureReferenceComposite.setLayoutData(gd_variableFeatureReferenceComposite);
		
		sctnOperation = toolkit.createSection(composite, Section.TITLE_BAR);
		sctnOperation.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		sctnOperation.setText("Operation");
		
		eOperationsComposite = new EOperationsComposite(sctnOperation, SWT.NONE);
		FillLayout fillLayout = (FillLayout) eOperationsComposite.getLayout();
		fillLayout.marginWidth = 0;
		fillLayout.marginHeight = 0;
		sctnOperation.setClient(eOperationsComposite);
				
		/** 
		 * Arguments.
		 */
		sctnArguments = toolkit.createSection(composite, Section.EXPANDED | Section.TITLE_BAR);			
		sctnArguments.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		sctnArguments.setText("Arguments");
		sctnArguments.setExpanded(true);
		
		argumentsComposite = new OperationCallArgumentsComposite(sctnArguments, SWT.NONE){
			@Override
			protected void newSelection(TreeSelection selection) {
				OperationCallComposite.this.newSelection(selection);
			}
		};
		GridLayout gridLayout_1 = (GridLayout) argumentsComposite.getLayout();
		gridLayout_1.marginWidth = 0;
		gridLayout_1.marginHeight = 0;
		sctnArguments.setClient(argumentsComposite);
		
		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}
	
	/** 
	 * This method is called when a new selection is made in the parentComposite. 
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection){		
	}		
	
	/**
	 * Returns the reference to the {@link OperationCall}.
	 * @return Reference to the {@link OperationCall}.
	 */
	public OperationCall getOperationCall(){
		return operationCall;
	}
	
	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * @param operationCall Reference to the {@link OperationCall}.
	 */
	public void setOperationCall(OperationCall operationCall){
		
		if (this.operationCall != null){
			this.operationCall.eAdapters().remove(getOperationCallAdapter());
		}
		
		this.operationCall = operationCall;
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		
		if (operationCall != null){			
			m_bindingContext = initDataBindings();	
			operationCall.eAdapters().add(getOperationCallAdapter());
		}
	}

	/**
	 * Invokes {@link #initDataBindingsCustom()}
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}
	
	/**
	 * Custom implementation of data bindings.  Use this pattern to prevent Window Pro builder to override the code.
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();
		
		if (getOperationCall().getVariable()!=null){		
			eOperationsComposite.setEClass(ApogyCoreInvocatorFacade.INSTANCE.getInstanceClass(getOperationCall()), getOperationCall().getEOperation());
			argumentsComposite.setOperationCall(getOperationCall());
		}else{
			eOperationsComposite.setEClass(null);
			argumentsComposite.setOperationCall(null);			
		}
		
		variableFeatureReferenceComposite.set(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList(), operationCall);
		
		return bindingContext;
	}
	
	/** 
	 * Returns a lazy loaded adapter used to listen to {@link OperationCall} events.
	 * @return Reference to the adapter.
	 */
	private Adapter getOperationCallAdapter() {
		
		if (operationCallAdapter == null){
			operationCallAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					switch (msg.getFeatureID(OperationCall.class)){			
						/**
						 * Only need to listen Arguments List because this feature is reset if any OperationCall 
						 * feature is set.  
						 * @see {link OperationCallItemProvider#createSetCommand}.
						 */
						case ApogyCoreInvocatorPackage.OPERATION_CALL__ARGUMENTS_LIST:
							setOperationCall(operationCall);  // Unable to set bidirectional binding with Tree Selection.
							break;					
					}
				}
			};
		}		
		return operationCallAdapter;
	}
	
	/**
	 * Disposes the current parentComposite.
	 */
	@Override
	public void dispose() {
		super.dispose();
		
		toolkit.dispose();
		
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		
		if (operationCall != null){
			operationCall.eAdapters().remove(getOperationCallAdapter());
		}
	}
}