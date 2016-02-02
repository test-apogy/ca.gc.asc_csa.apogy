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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage.Literals;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class NewApogySystemComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text textFolder;
	private Text textFilename;
	private NewApogySystemSettings systemSettings;
	
	
	public NewApogySystemComposite(Composite parent, int style, NewApogySystemSettings systemSettings) {
		this(parent, style);
		this.systemSettings = systemSettings;
	}
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public NewApogySystemComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(3, false));
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		toolkit.adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Folder :");
		
		textFolder = new Text(this, SWT.BORDER | SWT.READ_ONLY);
		textFolder.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		toolkit.adapt(textFolder, true, true);
		
		Button btnBrowseButton = new Button(this, SWT.NONE);
		btnBrowseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {				
				ContainerSelectionDialog dialog = new ContainerSelectionDialog(
						getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
						"Select new file container");
				if (dialog.open() == ContainerSelectionDialog.OK) {
					Object[] result = dialog.getResult();
					if (result.length == 1) {
						systemSettings.setFolder(((Path) result[0]).toString());
					}
				}				
			}
		});
		btnBrowseButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		toolkit.adapt(btnBrowseButton, true, true);
		btnBrowseButton.setText("Browse");
		
		Label lblFilename = new Label(this, SWT.NONE);
		toolkit.adapt(lblFilename, true, true);
		lblFilename.setText("Filename :");
		
		textFilename = new Text(this, SWT.BORDER);
		textFilename.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		toolkit.adapt(textFilename, true, true);
		new Label(this, SWT.NONE);
				
		if (systemSettings!=null){
			m_bindingContext = initDataBindings();
		}
	}
	
	public NewApogySystemSettings getNewApogySystemSettings() {
		return systemSettings;
	}

	public void setNewApogySystemSettings(NewApogySystemSettings systemSettings) {
		setNewApogySystemSettings(systemSettings, true);
	}

	public void setNewApogySystemSettings(NewApogySystemSettings systemSettings,
			boolean update) {
		this.systemSettings = systemSettings;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}
			if (this.systemSettings != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextFilenameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textFilename);
		IObservableValue systemSettingsFilenameObserveValue = EMFObservables.observeValue(systemSettings, Literals.NEW_APOGY_SYSTEM_SETTINGS__FILENAME);
		bindingContext.bindValue(observeTextTextFilenameObserveWidget, systemSettingsFilenameObserveValue, null, null);
		//
		IObservableValue observeTextTextFolderObserveWidget = WidgetProperties.text(SWT.NONE).observe(textFolder);
		IObservableValue systemSettingsFolderObserveValue = EMFObservables.observeValue(systemSettings, Literals.NEW_APOGY_SYSTEM_SETTINGS__FOLDER);
		bindingContext.bindValue(observeTextTextFolderObserveWidget, systemSettingsFolderObserveValue, null, null);
		//
		return bindingContext;
	}
}