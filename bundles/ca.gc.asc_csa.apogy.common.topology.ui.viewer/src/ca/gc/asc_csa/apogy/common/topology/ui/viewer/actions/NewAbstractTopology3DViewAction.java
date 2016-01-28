package ca.gc.asc_csa.apogy.common.topology.ui.viewer.actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.views.AbstractTopology3DView;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class NewAbstractTopology3DViewAction extends Action 
{
	/**
	 * The counter indicating the next id to assign to the view, in order to
	 * make it unique.
	 */
	private static int viewCounter = 1;			
	private ImageDescriptor imageDescriptor = null;

	private String description = "Opens a new Camera View.";
	private String toolTipText = description;
	private String text = description;
	
	private AbstractTopology3DView view = null;
	
	public NewAbstractTopology3DViewAction(AbstractTopology3DView view)
	{	
		this.view = view;
		
		imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		
//		try
//		{
//			imageDescriptor = Activator.getDefault().getImageDescriptor("/icons/new_view.gif");			
//		}
//		catch(Exception e)
//		{
//			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
//		}	
		setImageDescriptor(imageDescriptor);								
	}
	
	public String getDescription() 
	{
		return this.description;
	}
	
	public String getText() 
	{		
		return text;
	}

	public String getToolTipText() 
	{		
		return toolTipText;
	}
	
	@Override
	public void run() 
	{
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if(window != null)
		{
			IWorkbenchPage page = window.getActivePage();
			if(page != null)
			{
				try
				{
					// We find the next secondary id.
					String secondaryId = createNextSecondaryID(page);
					
					// We assign the secondary ID it to the view.
					page.showView(view.getViewID(), secondaryId, 1);										
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
		}
	}
	
	public int getStyle() 
	{		
		return IAction.AS_PUSH_BUTTON;
	}
	
	@Override
	public ImageDescriptor getImageDescriptor() 
	{	
		return imageDescriptor;
	}
	
	private String createNextSecondaryID(IWorkbenchPage page)
	{
		// We find the next secondary id.
		boolean exists = true;
		String secondaryId = null;
		IViewReference[] viewReferences = page.getViewReferences();
		List<String> secondaryIds = new ArrayList<String>(viewReferences.length);
		List<IViewReference> topologyViews = new ArrayList<IViewReference>();

		for (int i = 0; i < viewReferences.length; i++) 
		{
			if (viewReferences[i].getId().equals(view.getViewID())) 
			{
				if (viewReferences[i].getSecondaryId() != null) 
				{
					secondaryIds.add(viewReferences[i].getSecondaryId());
				}
				topologyViews.add(viewReferences[i]);
			}
		}

		Collections.sort(secondaryIds);

		while (exists) 
		{
			secondaryId = "View #" + viewCounter; //$NON-NLS-1$

			int pos = Collections.binarySearch(secondaryIds, secondaryId);
			exists = pos >= 0;
			viewCounter++;
		}
		
		return secondaryId;
	}
}
