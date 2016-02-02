package ca.gc.asc_csa.apogy.core.ui.sirius.util.topology;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.wizard.Wizard;

public class NodeClassWizard extends Wizard
{
	private static final String NODE_CLASS_WIZARD_TITLE = "Node Class Selection";
	private static final String NODE_CLASS_WIZARD_PAGE_NAME = "Page";
	private static final String NODE_CLASS_WIZARD_PAGE_TITLE = "Select the type of the new topology node";

	private final NodeClassPage page;

	public NodeClassWizard()
	{
		this.setWindowTitle(NODE_CLASS_WIZARD_TITLE);
		
		page = new NodeClassPage(NODE_CLASS_WIZARD_PAGE_NAME, NODE_CLASS_WIZARD_PAGE_TITLE);
		this.addPage(page);
	}

	public EClass getSelectedNodeClass()
	{
		return page.getSelectedClass();
	}
	
	@Override
	public boolean performFinish()
	{
		return true;
	}
}