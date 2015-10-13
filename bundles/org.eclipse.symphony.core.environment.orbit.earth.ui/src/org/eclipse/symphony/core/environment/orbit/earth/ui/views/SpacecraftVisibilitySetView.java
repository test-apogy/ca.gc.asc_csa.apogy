package org.eclipse.symphony.core.environment.orbit.earth.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import org.eclipse.symphony.core.environment.orbit.earth.ui.composites.SpacecraftsVisibilitySetComposite;

import org.eclipse.symphony.common.ui.views.AbstractView;

public class SpacecraftVisibilitySetView extends AbstractView 
{	
	public static final String PART_NAME = "SpacecraftVisibilitySetView";
	public static final String BUSY = "(BUSY)";
	
	private SpacecraftsVisibilitySet spacecraftsVisibilitySet;
    private SpacecraftsVisibilitySetComposite spacecraftsVisibilitySetComposite = null; 
         
    public void createPartControl(Composite parent) 
    {
    	super.createPartControl(parent);
    	
    	parent.setLayout(new GridLayout(1,false));
    	       	       	   
    	spacecraftsVisibilitySetComposite = new SpacecraftsVisibilitySetComposite(parent, SWT.BORDER);
    	spacecraftsVisibilitySetComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
    }

 	@Override
 	public void updatePartName() 
 	{ 		
		final SpacecraftsVisibilitySet newSpacecraftsVisibilitySet = spacecraftsVisibilitySet;
		
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{					
				String partName = PART_NAME;
				if(newSpacecraftsVisibilitySet != null)
				{
					if(newSpacecraftsVisibilitySet.getName() != null && newSpacecraftsVisibilitySet.getName().length() > 0)
					{
						partName += " - " + newSpacecraftsVisibilitySet.getName();
					}
					else
					{
						partName += " - ?"; 
					}
							
					if(busy) partName += " " + BUSY;
				}				
				setPartName(partName);
			}
		});		
 	}

 	@SuppressWarnings("unchecked")
	@Override
 	public void updateSelection(ISelection selection) 
 	{ 		
		List<SpacecraftsVisibilitySet> spacecraftsVisibilitySets = (List<SpacecraftsVisibilitySet>) org.eclipse.symphony.common.converters.Activator.convert(selection, SpacecraftsVisibilitySet.class);
		if(!spacecraftsVisibilitySets.isEmpty())
		{				
			SpacecraftsVisibilitySet spacecraftsVisibilitySet = spacecraftsVisibilitySets.get(0);										
			setSpacecraftsVisibilitySet(spacecraftsVisibilitySet);								
		} 		
 	} 
     
 	public void setSpacecraftsVisibilitySet(SpacecraftsVisibilitySet spacecraftsVisibilitySet)
 	{
 		this.spacecraftsVisibilitySet = spacecraftsVisibilitySet;
 		
 		if(spacecraftsVisibilitySetComposite != null && !spacecraftsVisibilitySetComposite.isDisposed())
 		{
 			spacecraftsVisibilitySetComposite.setSpacecraftsVisibilitySet(spacecraftsVisibilitySet);
 		}
 	}
}
