package org.eclipse.symphony.common.obsolete.mrt.ui.extensions;

import java.util.Iterator;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.common.obsolete.mrt.Startable;

public class StartableStopAction extends WorkbenchWindowActionDelegate
{
	@SuppressWarnings({ "rawtypes" })
	public void run(IAction action)
	{				
		try
		{
			IStructuredSelection sel = (IStructuredSelection) getSelection();
			
			Iterator it = sel.iterator();
			while(it.hasNext())
			{
				Startable startable = (Startable) it.next();						
				startable.setStarted(false);
			}		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}