package ca.gc.asc_csa.apogy.common.topology.ui.wizards;
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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ImportFilePage extends WizardPage {
	
	private Text fileName;
	private String selectedFile;

	public ImportFilePage(String pageName, IStructuredSelection selection) {
		super(pageName);


	}

	@Override
	public void createControl(Composite parent) {

		Composite container = new Composite(parent, SWT.NULL);

		GridLayout layout = new GridLayout(3, true);

		// We add a label.
		container.setLayout(layout);

		// The label.
		Label fileNameLabel = new Label(container, SWT.NONE);

		fileNameLabel.setText("Topology file to import: ");

		fileName = new Text(container, SWT.NONE);

		// The button named 'browse...'
		Button browseButton = new Button(container, SWT.NONE);
		browseButton.setText("Browse...");

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);

		fileName.setLayoutData(gridData);

		browseButton.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
	
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				openFileSelection();
			}

		});

		setControl(container);
	}

	private void openFileSelection() {
		FileDialog fileSelector = new FileDialog(getShell());
		fileSelector.setFilterNames(new String[] { "Topology file" });
		fileSelector.setFilterExtensions(new String[] { "*.topo" });

		selectedFile = fileSelector.open();

		getShell().getDisplay().asyncExec(new Runnable() {

			@Override
			public void run() {
				if (selectedFile != null) {
					updateFileName(selectedFile);
				}
			}

		});
	}

	private void updateFileName(String fileName) {
		this.fileName.setText(fileName);
		setPageComplete(true);
	}

	public String getSelectedFile() {
		return selectedFile;
	}
}
