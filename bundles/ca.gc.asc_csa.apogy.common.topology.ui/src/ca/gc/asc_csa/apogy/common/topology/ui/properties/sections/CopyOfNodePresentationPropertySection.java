package ca.gc.asc_csa.apogy.common.topology.ui.properties.sections;
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

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.ui.properties.ExtendedTabbedPropertySheetPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class CopyOfNodePresentationPropertySection extends org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection 
{
	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,TabbedPropertySheetPage tabbedPropertySheetPage) 
	{
		super.createControls(parent, tabbedPropertySheetPage);
		ExtendedTabbedPropertySheetPage propertySheetPage = (ExtendedTabbedPropertySheetPage) tabbedPropertySheetPage;

		// Set the control enablement to false if there is no editing domain (makes it read-only)
		page.getControl().setEnabled(propertySheetPage.getEditingDomain() != null);
		page.setPropertySourceProvider(new AdapterFactoryContentProvider(propertySheetPage.getAdapterFactory()));
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) 
	{
		IStructuredSelection newSel = new StructuredSelection();
		
		if(selection instanceof IStructuredSelection)
		{
			IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
			
			Node node = (Node) iStructuredSelection.getFirstElement();
			
			NodePresentation nodePresentation = Activator.getTopologyPresentationRegistry().getPresentationNode(node);
			if(nodePresentation != null)
			{				
				newSel = new StructuredSelection(nodePresentation);
			}
		}
		
		super.setInput(part, newSel);
	}
}