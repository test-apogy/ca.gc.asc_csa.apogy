package org.eclipse.symphony.core.display.ui.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.symphony.core.display.ui.composites.DisplaysListComposite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DisplaysList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchesList;

public class TelemetryView extends ViewPart implements ISelectionListener 
{
	public static String partName = "Telemetry View";
	public static String ID = "org.eclipse.symphony.core.display.ui.views.TelemetryView";
	
	private DisplaysList displaysList = null;
	private Adapter watchListAdapter;
	private boolean pinView = false;	
	
	private DisplaysListComposite displaysListComposite;
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
	{	
		if(selection instanceof IStructuredSelection)
		{
			IStructuredSelection structuredSelection  = (IStructuredSelection) selection;
			
			if(structuredSelection.getFirstElement() instanceof DisplaysList)
			{
				if(!isPinView())
				{
					DisplaysList newWatchesList = (DisplaysList) structuredSelection.getFirstElement(); 
					
					// If the value is new.
					if(newWatchesList != displaysList)
					{
						// Sets the new value.
						setDisplaysList(newWatchesList);
					}
				}
			}	
			else if(structuredSelection.getFirstElement() instanceof AbstractFeatureDisplay)
			{						
				AbstractFeatureDisplay watchFeature = (AbstractFeatureDisplay) structuredSelection.getFirstElement();
				displaysListComposite.select(watchFeature);
			}		
			else if(structuredSelection.getFirstElement() instanceof AbstractFeatureNode)
				{
					AbstractFeatureNode node = (AbstractFeatureNode) structuredSelection.getFirstElement();
					displaysListComposite.select(node);
				}
				else if(structuredSelection.getFirstElement() instanceof Watch)
				{
					Watch watch = (Watch) structuredSelection.getFirstElement();
					displaysListComposite.select(watch.getTreeRootNode());
				}			
		}
	}

	@Override
	public void createPartControl(Composite parent) 
	{				
		displaysListComposite = new DisplaysListComposite(parent, SWT.NONE);
		
		// Register as a selection listener
		getSite().getPage().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}
		
	public boolean isPinView() {
		return pinView;
	}

	public void setPinView(boolean pinView) 
	{
		System.out.println("TelemetryView.setPinView() " + pinView);
		this.pinView = pinView;
	}

	public DisplaysList getDisplaysList() {
		return displaysList;
	}

	public void setDisplaysList(DisplaysList newDisplaysList) 
	{
		// Unregister listener from previous list if applicable.
		if(this.displaysList != null) this.displaysList.eAdapters().remove(getWatchListAdapter());
		
		// Register listener to new list if applicable.
		if(newDisplaysList != null) newDisplaysList.eAdapters().add(getWatchListAdapter());
				
		// Updates list.
		this.displaysList = newDisplaysList;
		
		// Have the list composite update its list.
		displaysListComposite.setDisplaysList(newDisplaysList);
		
		// Updates part name
		updatePartName(newDisplaysList);
	}	
	
	
	@Override
	public void dispose() 
	{
		// Unregister selection listener
		getSite().getPage().removeSelectionListener(this);
		
		// Unregister listener from previous list if applicable.
		if(this.displaysList != null) this.displaysList.eAdapters().remove(getWatchListAdapter());

		// Dispose of the watchesListComposite if applicable.
		if(displaysListComposite != null) displaysListComposite.dispose();
				
		super.dispose();
	}
	
	protected Adapter getWatchListAdapter()
	{
		if (watchListAdapter == null) {
			watchListAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) 
				{										
					if(msg.getFeatureID(WatchesList.class) == EMFEcoreInvocatorPackage.WATCHES_LIST__NAME)
					{
						// Update the part name.
						updatePartName(displaysList);
					}
				}
			};
		}
		
		return watchListAdapter;
	}
	
	protected void updatePartName(DisplaysList displayList)
	{
		// Update the part name.
		String displayedPartName = partName;
		
		if(displayList != null &&  displayList.getName() != null)
		{
			displayedPartName += " - " + displayList.getName();
		}
		
		setPartName(displayedPartName);
	}
}
