package org.eclipse.symphony.common.topology.ui.properties.sections;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.ui.properties.ExtendedTabbedPropertySheetPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class NodePresentationPropertySection extends org.eclipse.ui.views.properties.tabbed.AdvancedPropertySection implements IFilter   
{	
	/**
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#createControls(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage)
	 */
	public void createControls(Composite parent,TabbedPropertySheetPage tabbedPropertySheetPage) 
	{
		super.createControls(parent, tabbedPropertySheetPage);
		ExtendedTabbedPropertySheetPage propertySheetPage = (ExtendedTabbedPropertySheetPage) tabbedPropertySheetPage;

		//Set the control enablement to false if there is no editing domain (makes it read-only)
		page.getControl().setEnabled(propertySheetPage.getEditingDomain() != null);				
		page.setPropertySourceProvider(new AdapterFactoryContentProvider(propertySheetPage.getAdapterFactory()));
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) 
	{
		IStructuredSelection newSel = new StructuredSelection();
		
		if(selection instanceof IStructuredSelection)
		{	
			Object object = ((IStructuredSelection) selection).getFirstElement();
						
			NodePresentation nodePresentation = (NodePresentation) Symphony__CommonConvertersFacade.INSTANCE.convert(object, NodePresentation.class);
			
			if(nodePresentation != null)
			{	
				newSel = new StructuredSelection(nodePresentation);					
			}			
		}
		
		super.setInput(part, newSel);
	}

	@Override
	public boolean select(Object toTest) 
	{
		boolean result = false;
		
		result = (Symphony__CommonConvertersFacade.INSTANCE.convert(toTest, NodePresentation.class) != null);
				
		return result;
	}
}