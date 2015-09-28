package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.ui.commands;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Recorder;


public class StartRecorderCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
			
		new Job("StartRecorderCommand")
		{		
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
				
				while (selections.hasNext())
				{
					Object selection = selections.next();		
					if (selection instanceof Recorder)
					{
						Recorder recorder = (Recorder) selection;
						recorder.record();
					}
				}
				
				return Status.OK_STATUS;
			}
		}.schedule();
		return null;
	}
}