package ca.gc.asc_csa.apogy.core.ui.composites;
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
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage.Literals;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class NewApogySessionComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text textFilename;
	private NewApogySessionSettings sessionSettings;
	private Button btnEnvironmentCheckButton;
	private Button btnProgramCheckButton;
	private Button btnToolsCheckButton;
	private Button btnDataProductsCheckButton;
	
	
	public NewApogySessionComposite(Composite parent, int style, NewApogySessionSettings sessionSettings) {
		this(parent, style);
		this.sessionSettings = sessionSettings;
	}
	
	/**
	 * Create the parentComposite.
	 * @param parent
	 * @param style
	 */
	public NewApogySessionComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(2, false));
		
		Label lblFilename = new Label(this, SWT.NONE);
		toolkit.adapt(lblFilename, true, true);
		lblFilename.setText("Filename :");
		
		textFilename = new Text(this, SWT.BORDER);
		textFilename.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(textFilename, true, true);
		
		Group grpContent = new Group(this, SWT.SHADOW_ETCHED_OUT);
		FillLayout fl_grpContent = new FillLayout(SWT.VERTICAL);
		fl_grpContent.marginHeight = 5;
		fl_grpContent.marginWidth = 5;
		fl_grpContent.spacing = 5;
		grpContent.setLayout(fl_grpContent);
		grpContent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1));
		grpContent.setText("Content");
		toolkit.adapt(grpContent);
		toolkit.paintBordersFor(grpContent);
		
		btnEnvironmentCheckButton = new Button(grpContent, SWT.CHECK);
		btnEnvironmentCheckButton.setSelection(true);
		toolkit.adapt(btnEnvironmentCheckButton, true, true);
		btnEnvironmentCheckButton.setText("Environment");
		
		btnProgramCheckButton = new Button(grpContent, SWT.CHECK);
		btnProgramCheckButton.setSelection(true);
		toolkit.adapt(btnProgramCheckButton, true, true);
		btnProgramCheckButton.setText("Programs");
		
		btnDataProductsCheckButton = new Button(grpContent, SWT.CHECK);
		btnDataProductsCheckButton.setSelection(true);
		toolkit.adapt(btnDataProductsCheckButton, true, true);
		btnDataProductsCheckButton.setText("DataProducts");
		
		btnToolsCheckButton = new Button(grpContent, SWT.CHECK);
		btnToolsCheckButton.setSelection(true);
		toolkit.adapt(btnToolsCheckButton, true, true);
		btnToolsCheckButton.setText("Tools");
		
		if (sessionSettings!=null){
			m_bindingContext = initDataBindings();
		}
	}
	
	public NewApogySessionSettings getNewApogySessionSettings() {
		return sessionSettings;
	}

	public void setNewApogySessionSettings(NewApogySessionSettings sessionSettings) {
		setNewApogySessionSettings(sessionSettings, true);
	}

	public void setNewApogySessionSettings(NewApogySessionSettings sessionSettings,
			boolean update) {
		this.sessionSettings = sessionSettings;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (this.sessionSettings != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextFilenameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textFilename);
		IObservableValue sessionSettingsFilenameObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_APOGY_SESSION_SETTINGS__FILENAME);
		bindingContext.bindValue(observeTextTextFilenameObserveWidget, sessionSettingsFilenameObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnToolsCheckButtonObserveWidget = WidgetProperties.selection().observe(btnToolsCheckButton);
		IObservableValue sessionSettingsCreateToolsObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_APOGY_SESSION_SETTINGS__CREATE_TOOLS);
		bindingContext.bindValue(observeSelectionBtnToolsCheckButtonObserveWidget, sessionSettingsCreateToolsObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnProgramCheckButtonObserveWidget = WidgetProperties.selection().observe(btnProgramCheckButton);
		IObservableValue sessionSettingsCreateProgramsObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_APOGY_SESSION_SETTINGS__CREATE_PROGRAMS);
		bindingContext.bindValue(observeSelectionBtnProgramCheckButtonObserveWidget, sessionSettingsCreateProgramsObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnEnvironmentCheckButtonObserveWidget = WidgetProperties.selection().observe(btnEnvironmentCheckButton);
		IObservableValue sessionSettingsCreateEnvironmentObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_APOGY_SESSION_SETTINGS__CREATE_ENVIRONMENT);
		bindingContext.bindValue(observeSelectionBtnEnvironmentCheckButtonObserveWidget, sessionSettingsCreateEnvironmentObserveValue, null, null);
		//
		IObservableValue observeSelectionBtnDataProductsCheckButtonObserveWidget = WidgetProperties.selection().observe(btnDataProductsCheckButton);
		IObservableValue sessionSettingsCreateDataProductsObserveValue = EMFObservables.observeValue(sessionSettings, Literals.NEW_APOGY_SESSION_SETTINGS__CREATE_DATA_PRODUCTS);
		bindingContext.bindValue(observeSelectionBtnDataProductsCheckButtonObserveWidget, sessionSettingsCreateDataProductsObserveValue, null, null);
		//
		return bindingContext;
	}
}