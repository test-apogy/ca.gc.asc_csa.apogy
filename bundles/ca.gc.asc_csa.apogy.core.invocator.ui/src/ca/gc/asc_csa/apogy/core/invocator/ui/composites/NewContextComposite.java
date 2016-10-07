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
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage.Literals;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class NewContextComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private WritableValue environmentBinder;
	private WritableValue namedBinder;
	private EditingDomain editingDomain;
	private Text textName;
	//private Button btnCheckActive;

	public NewContextComposite(Composite parent, int style,
			Context context,
			Environment environment) {
		this(parent, style);
		setEnvironment(environment);
	}

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public NewContextComposite(Composite parent, int style) {
		super(parent, SWT.NONE);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, false));
		
		Section sctnNewContext = toolkit.createSection(this, Section.TITLE_BAR);
		sctnNewContext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.paintBordersFor(sctnNewContext);
		sctnNewContext.setText("New Context");
		
		Composite compositeNewContext = new Composite(sctnNewContext, SWT.NONE);
		toolkit.adapt(compositeNewContext);
		toolkit.paintBordersFor(compositeNewContext);
		sctnNewContext.setClient(compositeNewContext);
		compositeNewContext.setLayout(new GridLayout(2, false));
		
		Label lblName = new Label(compositeNewContext, SWT.NONE);
		toolkit.adapt(lblName, true, true);
		lblName.setText("Name");
		
		textName = new Text(compositeNewContext, SWT.NONE);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		textName.setText("Name");
		toolkit.adapt(textName, true, true);
		
		/*btnCheckActive = new Button(compositeNewContext, SWT.CHECK);
		btnCheckActive.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		toolkit.adapt(btnCheckActive, true, true);
		btnCheckActive.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
		        if(event.detail == SWT.CHECK) {
		        	SetCommand command = new SetCommand(editingDomain, getEnvironment(),
							ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST, productList);
				
		        } else { //Otherwise, unset the saved value
		           
		        }
		    	editingDomain.getCommandStack().execute(command);
		    }
		});
		
		Label lblSetActive = new Label(compositeNewContext, SWT.NONE);
		toolkit.adapt(lblSetActive, true, true);
		lblSetActive.setText("Set new context as active");*/
				
		/** Perform a layout otherwise the VariableImplementation Content is not displayed without resize. */
		layout(true, true);
		
		initDataBindings();
	}
	
	/** 
	 * This method is called when a new selection is made in the composite. 
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(ISelection selection){		
	}

	/**
	 * Binds the {@link Environment} with the composite.
	 * @param environment Reference to the environment.
	 */
	public void setEnvironment(Environment environment) {
		if (environmentBinder == null) {
			environmentBinder = new WritableValue();
		}
		environmentBinder.setValue(environment);
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(environment);		
		
		/*if(environment != null && environment.getContextsList().getContexts().size() == 1){
			btnCheckActive.setEnabled(false);
		}*/
		//setEnvironment(environment, true);			
	}
	
	public Environment getEnvironment(){
		if(environmentBinder == null || environmentBinder.getValue() == null){
			return null;
		}else{
			return (Environment)environmentBinder.getValue();
		}
	}
	
	public void setNamed(Named named) {
		if (namedBinder == null) {
			namedBinder = new WritableValue();
		}
		namedBinder.setValue(named);
		/*if(named == ((Environment)environmentBinder.getValue()).getActiveContext()){
			btnCheckActive.setSelection(true);
		}*/
	}

	/**
	 * Sets the {@link Environment}.
	 * @param environment Reference to the environment.
	 * @param update If true then data bindings are created.
	 */
	/*private void setEnvironment(Environment environment, boolean update) {
		this.environmentBinder.setValue(environment); 
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (environment != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}*/

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link NewContextComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see NewContextComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Variables viewer and the Type Members viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext m_bindingContext = new DataBindingContext();
		if (environmentBinder == null) {
			environmentBinder = new WritableValue();
		}
		if (namedBinder == null) {
			namedBinder = new WritableValue();
		}

		IObservableValue observeTextNameObserveWidget = WidgetProperties.text().observe(textName);
		IObservableValue contextNameObserveValue = EMFProperties.value(Literals.NAMED__NAME).observeDetail(namedBinder);
		m_bindingContext.bindValue(observeTextNameObserveWidget, contextNameObserveValue);

		/*IObservableValue observeSelectionBtnCheckActiveWidget = WidgetProperties.selection().observe(btnCheckActive);
		IObservableValue environmentActiveContextObserveValue = EMFProperties
				.value(ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT).observeDetail(environmentBinder);

		m_bindingContext.bindValue(observeSelectionBtnCheckActiveWidget, environmentActiveContextObserveValue,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
				.setConverter(new Converter(Boolean.class, Context.class) {
					@Override
					public Object convert(Object arg0) {
						if (((Boolean)arg0).booleanValue()) {
							return namedBinder.getValue();
						} else {
							if(getEnvironment().getContextsList() == null || getEnvironment().getContextsList().getContexts().isEmpty()){
								return null;
							}else{
								return getEnvironment().getContextsList().getContexts().get(0);
							}
						}
					}
				}), null);*/
				
		return m_bindingContext;
	}

	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}
}