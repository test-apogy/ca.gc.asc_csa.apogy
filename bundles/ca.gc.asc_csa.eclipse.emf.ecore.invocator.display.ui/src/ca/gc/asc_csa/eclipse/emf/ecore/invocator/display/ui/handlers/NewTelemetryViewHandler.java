package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.ui.handlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.ui.views.TelemetryView;

public class NewTelemetryViewHandler extends AbstractHandler implements IHandler 
{

	private static int counter = 1;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		if(HandlerUtil.getActivePart(event) instanceof TelemetryView)
		{
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IWorkbenchPage page = window.getActivePage();

			
			// DEBUG
			TelemetryView telemetryView = (TelemetryView) HandlerUtil.getActivePart(event);
			 IContributionItem[] items =  telemetryView.getViewSite().getActionBars().getToolBarManager().getItems();
			 for(int i =0; i < items.length; i++)
			 {
				 System.out.println(" i  = " + items[i]);
			 }
			
			 String originalID = telemetryView.getViewSite().getId();
			 System.out.println("TelemetryView ID" + telemetryView.getViewSite().getId());
			 
			// DEBUG			
			 			 			 		
			if(page != null)
			{				
				try
				{
					IViewPart newView = page.showView(TelemetryView.ID,  getNextSecondaryId(page), IWorkbenchPage.VIEW_ACTIVATE);
					
					IContributionItem[] copy = telemetryView.getViewSite().getActionBars().getToolBarManager().getItems().clone();
					
					newView.getViewSite().getActionBars().getMenuManager().add(copy[0]);	
					newView.getViewSite().getActionBars().getMenuManager().add(copy[1]);
					
					
					newView.getViewSite().getActionBars().getMenuManager().setVisible(true);
					newView.getViewSite().getActionBars().getMenuManager().update();
					
					newView.getViewSite().getActionBars().getToolBarManager().add(copy[0]);
					newView.getViewSite().getActionBars().getToolBarManager().add(copy[1]);
					newView.getViewSite().getActionBars().getToolBarManager().update(true);
					
					newView.getViewSite().getActionBars().updateActionBars();
					
					
					String newID = newView.getViewSite().getId();
					System.out.println("TelemetryView ID" + originalID);
					System.out.println("TelemetryView ID" + newID);
					
					System.out.println("SecondaryId " + newView.getViewSite().getSecondaryId());
					
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
		}
		
		return null;
	}

	private String getNextSecondaryId(final IWorkbenchPage page)
	{
		String secondaryId = null;	
		
		IViewReference[] viewReferences = page.getViewReferences();
		
		List<String> secondaryIds = new ArrayList<String>(viewReferences.length);
		List<IViewReference> telemetryViews = new ArrayList<IViewReference>();

		for (int i = 0; i < viewReferences.length; i++) {
			if (viewReferences[i].getId().equals(TelemetryView.ID)) {
				if (viewReferences[i].getSecondaryId() != null) {
					secondaryIds.add(viewReferences[i]
							.getSecondaryId());
				}
				telemetryViews.add(viewReferences[i]);
			}
		}

		Collections.sort(secondaryIds);
		
		boolean exists = true;
		while (exists) 
		{
			secondaryId = Integer.toString(counter); //$NON-NLS-1$

			int pos = Collections.binarySearch(secondaryIds, secondaryId);

			exists = pos >= 0;

			counter++;
		}
		
		return secondaryId;
	}
}
