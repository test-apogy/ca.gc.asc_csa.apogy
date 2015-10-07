package org.eclipse.symphony.core.environment.orbit.earth.ui.views;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;
import org.eclipse.symphony.core.environment.orbit.earth.ui.composites.VisibilityPassSpacecraftPositionHistoryAzElComposite;
import org.eclipse.symphony.core.environment.orbit.earth.ui.composites.VisibilityPassSpacecraftPositionHistoryComposite;
import org.eclipse.symphony.core.environment.orbit.earth.ui.composites.VisibilityPassSpacecraftPositionHistoryRangeComposite;

import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class VisibilityPassSpacecraftPositionHistoryView extends AbstractView 
{	
	public static final String PART_NAME = "VisibilityPassSpacecraftPositionHistoryView";
	public static final String BUSY = "(BUSY)";
	
	private VisibilityPassSpacecraftPositionHistoryComposite historyComposite = null;
    private VisibilityPassSpacecraftPositionHistoryAzElComposite visibilityPassSpacecraftPositionHistoryAzElComposite;     
	private VisibilityPassSpacecraftPositionHistoryRangeComposite visibilityPassSpacecraftPositionHistoryRangeComposite;
    	
    public void createPartControl(Composite parent) 
    {
    	super.createPartControl(parent);
    	
    	parent.setLayout(new GridLayout(1,false));
    	       	       	   
    	historyComposite = new VisibilityPassSpacecraftPositionHistoryComposite(parent, SWT.BORDER);
    	historyComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
    	
//    	visibilityPassSpacecraftPositionHistoryAzElComposite = new VisibilityPassSpacecraftPositionHistoryAzElComposite(parent, SWT.BORDER);
//    	visibilityPassSpacecraftPositionHistoryAzElComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
//    	
//    	visibilityPassSpacecraftPositionHistoryRangeComposite = new VisibilityPassSpacecraftPositionHistoryRangeComposite(parent, SWT.BORDER);
//    	visibilityPassSpacecraftPositionHistoryRangeComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
    }

 	@Override
 	public void updatePartName() 
 	{ 		
		Display.getDefault().asyncExec(new Runnable() 
		{			
			@Override
			public void run() 
			{					
				String partName = PART_NAME;						
				if(busy) partName += " " + BUSY;				
				setPartName(partName);
			}
		});		
 	}

 	@SuppressWarnings("unchecked")
	@Override
 	public void updateSelection(ISelection selection) 
 	{ 		
		List<VisibilityPassSpacecraftPositionHistory> visibilityPassSpacecraftPositionHistories = (List<VisibilityPassSpacecraftPositionHistory>) org.eclipse.symphony.common.converters.Activator.convert(selection, VisibilityPassSpacecraftPositionHistory.class);
		if(!visibilityPassSpacecraftPositionHistories.isEmpty())
		{				
			VisibilityPassSpacecraftPositionHistory visibilityPassSpacecraftPositionHistory = visibilityPassSpacecraftPositionHistories.get(0);										
			setVisibilityPassSpacecraftPositionHistory(visibilityPassSpacecraftPositionHistory);								
		} 		
		else
		{
			List<VisibilityPass> passes = (List<VisibilityPass>) org.eclipse.symphony.common.converters.Activator.convert(selection, VisibilityPass.class);
			if(!passes.isEmpty())
			{
				VisibilityPassSpacecraftPositionHistory visibilityPassSpacecraftPositionHistory = passes.get(0).getPositionHistory();
				setVisibilityPassSpacecraftPositionHistory(visibilityPassSpacecraftPositionHistory);	
			}
		}
 	} 
     
 	public void setVisibilityPassSpacecraftPositionHistory(VisibilityPassSpacecraftPositionHistory visibilityPassSpacecraftPositionHistory)
 	{
 		if(visibilityPassSpacecraftPositionHistoryAzElComposite != null && !visibilityPassSpacecraftPositionHistoryAzElComposite.isDisposed())
 		{
 			visibilityPassSpacecraftPositionHistoryAzElComposite.setPositionHistory(visibilityPassSpacecraftPositionHistory);
 		}
 		
 		if(visibilityPassSpacecraftPositionHistoryRangeComposite != null && !visibilityPassSpacecraftPositionHistoryRangeComposite.isDisposed())
 		{
 			visibilityPassSpacecraftPositionHistoryRangeComposite.setPositionHistory(visibilityPassSpacecraftPositionHistory);
 		}
 		
 		if(historyComposite != null && !historyComposite.isDisposed())
 		{
 			historyComposite.setPositionHistory(visibilityPassSpacecraftPositionHistory);
 		}
 	}
}
