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
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

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

	private Environment environment;
	private WritableValue environmentBinder;
	private EditingDomain editingDomain;
	private Text textName;

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
		toolkit.adapt(textName, true, true);
		
		Button btnCheckActive = new Button(compositeNewContext, SWT.CHECK);
		btnCheckActive.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		toolkit.adapt(btnCheckActive, true, true);
		
		Label lblSetActive = new Label(compositeNewContext, SWT.NONE);
		toolkit.adapt(lblSetActive, true, true);
		lblSetActive.setText("Set new context as active");
				
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
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(environment.getContextsList());		
		//setEnvironment(environment, true);			
	}

	/**
	 * Sets the {@link Environment}.
	 * @param environment Reference to the environment.
	 * @param update If true then data bindings are created.
	 */
	private void setEnvironment(Environment environment, boolean update) {
		this.environment = environment;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (environment != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

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
		DataBindingContext bindingContext = new DataBindingContext();
		if (environmentBinder == null) {
			environmentBinder = new WritableValue();
		}
		
		/*IObservableValue observeTextNameObserveWidget = WidgetProperties.text().observe(textName);	
		IObservableValue contextNameObserveValue = EMFProperties
				.value( ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
				.observeDetail(invocatorFacadeBinder);
		
		m_bindingContext.bindValue(observeTextStatusConnexionObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, String.class) {
					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? NO_ACTIVE_SESSION_STR : SESSION_ACTIVE_STR;

					}
				}));*/

		return bindingContext;
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