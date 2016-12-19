package ca.gc.asc_csa.apogy.common.ui.dialogs;
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;

public class CloseWizardEscapeDialog extends MessageDialog {
	
	Wizard parentWizard;

	public CloseWizardEscapeDialog(Wizard parentWizard) {
		super(parentWizard.getShell(), "Closing wizard", null,
				"Progress will be lost if the wizard is colsed.\nAre you sure you want to close the wizard?",
				MessageDialog.QUESTION, new String[] { "Yes", "No" }, 1);
		this.parentWizard = parentWizard;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		this.close();
		switch (buttonId) {
		case 0:
			parentWizard.getShell().setVisible(false);
			parentWizard.dispose();
			this.close();
			break;
		case 1:
			this.cancelPressed();
			break;
		default:
			break;
		}
	}
}