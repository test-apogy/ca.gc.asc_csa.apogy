package ca.gc.space.mrt.common.ui.extensions;

import java.util.Iterator;

import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.IStructuredSelection;

import ca.gc.space.mrt.common.Startable;

public class StartableStartAction extends WorkbenchWindowActionDelegate
{
	@SuppressWarnings("unchecked")
	public void run(IAction action)
	{
		System.out.println("StartableStartAction.run()");
		
		try
		{
			IStructuredSelection sel = (IStructuredSelection) getSelection();
			
			Iterator it = sel.iterator();
			while(it.hasNext())
			{
				Startable startable = (Startable) it.next();						
				startable.setStarted(true);
			}		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
