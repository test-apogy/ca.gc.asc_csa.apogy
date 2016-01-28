package ca.gc.asc_csa.apogy.addons.telecoms.ui.views;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomNode;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorTool;
import ca.gc.asc_csa.apogy.addons.telecoms.TelecomStatusMonitorToolList;
import ca.gc.asc_csa.apogy.addons.telecoms.ui.composites.TelecomStatusMonitorToolComposite;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;

public class TelecomStatusMonitorToolView extends AbstractView
{
	public final static String partName = "Telecom Status Monitor View";
	public final static String ID = "ca.gc.asc_csa.apogy.addons.telecoms.ui.views.TelecomStatusMonitorToolView";
	
	private TelecomStatusMonitorToolComposite statusMonitorToolComposite;
	
	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	@Override
	public void createPartControl(Composite parent)
	{
		// Create the appropriate composite
		statusMonitorToolComposite = new TelecomStatusMonitorToolComposite(parent, SWT.NONE);
		
		// Register this as a selection listener
		getSite().getPage().addSelectionListener(this);
	}

	@Override
	public void updatePartName()
	{
		// Just set the view's name 
		setPartName(partName); 
	}
	
	@Override
	public void dispose()
	{
		// Unregister the selection listener
		getSite().getPage().removeSelectionListener(this);
		
		// Dispose of the composite
		statusMonitorToolComposite.dispose();
		
		// Call the superclass' version
		super.dispose();
	}

	@Override
	public void updateSelection(ISelection selection)
	{
		// If this is a structured selection
		if (selection instanceof IStructuredSelection)
		{
			// Cast down
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			
			// If the selected object is a TelecomStatusMonitorToolList
			if (structuredSelection.getFirstElement() instanceof TelecomStatusMonitorToolList)
			{
				// Cast down
				TelecomStatusMonitorToolList telecomStatusMonitorToolList = (TelecomStatusMonitorToolList) structuredSelection.getFirstElement();
				
				// If the monitor tool list has child monitor tools
				if (telecomStatusMonitorToolList.getTelecomStatusMonitors().size() > 0)
				{
					// If the currently displayed monitor tool is not contained by this monitor tool list
					if (telecomStatusMonitorToolList.getTelecomStatusMonitors().contains(statusMonitorToolComposite.getTelecomStatusMonitorTool()) == false)
					{
						// Extract the first child monitor tool and set it as the active one
						TelecomStatusMonitorTool telecomStatusMonitorTool = (TelecomStatusMonitorTool) telecomStatusMonitorToolList.getTelecomStatusMonitors().get(0);
						statusMonitorToolComposite.setTelecomStatusMonitorTool(telecomStatusMonitorTool);
					}
				}
				// Otherwise, this has no child monitor tools
				else
				{
					// Simply just set it to null
					statusMonitorToolComposite.setTelecomStatusMonitorTool(null);
				}
			}
			// Else if the selected object is a TelecomStatusMonitorTool
			else if (structuredSelection.getFirstElement() instanceof TelecomStatusMonitorTool)
			{
				// Cast down
				TelecomStatusMonitorTool telecomStatusMonitorTool = (TelecomStatusMonitorTool) structuredSelection.getFirstElement();
				
				// If this is not the same as the currently displayed status monitor tool
				if (telecomStatusMonitorTool != statusMonitorToolComposite.getTelecomStatusMonitorTool())
				{
					// Set the new one as the active one
					statusMonitorToolComposite.setTelecomStatusMonitorTool(telecomStatusMonitorTool);
				}
			}
			// Else if the selected object is a TelecomNode
			else if (structuredSelection.getFirstElement() instanceof TelecomNode)
			{
				// Cast down
				TelecomNode telecomNode = (TelecomNode) structuredSelection.getFirstElement();
				
				// Get the telecom status monitor tool associated with this telecom node
				TelecomStatusMonitorTool telecomStatusMonitorTool = telecomNode.getStatusMonitorTool();
				
				// If this is not the same as the currently displayed status monitor tool
				if (telecomStatusMonitorTool != statusMonitorToolComposite.getTelecomStatusMonitorTool())
				{
					// Set the new one as the active one
					statusMonitorToolComposite.setTelecomStatusMonitorTool(telecomStatusMonitorTool);
				}
			}
		}
	}
}