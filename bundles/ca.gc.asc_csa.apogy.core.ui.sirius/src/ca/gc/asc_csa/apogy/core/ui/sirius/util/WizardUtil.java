package ca.gc.asc_csa.apogy.core.ui.sirius.util;
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

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class WizardUtil
{
	public static int displayWizard(Wizard wizard)
	{
		// Keep track of the Shell
        Shell shell = null;
        
        // Whether a shell was created
        boolean createdShell = false;
        
        // If there is a window to extract the shell from
        if (PlatformUI.getWorkbench() != null &&
        	PlatformUI.getWorkbench().getActiveWorkbenchWindow() != null)
        {
        	// Get the shell of the workbench window
            shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        }
        // Otherwise, there's no such window
        else
        {
        	// Create a shell and set the value accordingly
        	shell = new Shell();
        	createdShell = true;
        }
		
        // Create a dialog box to handle the wizard
		WizardDialog wizardDlg = new WizardDialog(shell, wizard);
		
		// Open up the new wizard and keep track of the result
		int result = wizardDlg.open();

		// If the shell was created
		if (createdShell == true)
		{
			// Dispose of it
			shell.dispose();
		}

		// Return the result of the wizard
		return result;
	}
}
