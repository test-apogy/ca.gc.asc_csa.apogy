package ca.gc.asc_csa.apogy.core.invocator.ui.wizards;
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

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.TypesRegistryComposite;

public class SetVariableTypeWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.SetVariableTypeWizardPage";
		
	private Variable variable;
	
	public SetVariableTypeWizardPage(Variable variable){
		super(WIZARD_PAGE_ID);
		setTitle("Variable");
		setDescription("Select the type.");
		this.variable = variable;
	}
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(1, false));
				
		setControl(container);
		
		TypesRegistryComposite typesRegistryComposite = new TypesRegistryComposite(container, SWT.NONE){
			@Override
			protected void newSelection(ISelection selection) {
				variable.setVariableType(getSelectedType());
				validate();
			}
		};
		typesRegistryComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		validate();
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {	
		String errorMessage = "";		
				
		if(variable.getVariableType() == null){
			errorMessage = "You must select the variable type.";
		}
		setPageComplete(errorMessage.isEmpty());
	}
}