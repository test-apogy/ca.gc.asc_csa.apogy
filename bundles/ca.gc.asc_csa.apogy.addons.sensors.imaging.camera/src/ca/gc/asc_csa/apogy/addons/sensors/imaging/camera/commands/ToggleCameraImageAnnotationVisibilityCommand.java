package org.eclipse.symphony.addons.sensors.imaging.camera.commands;

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
import org.eclipse.symphony.addons.sensors.imaging.camera.Activator;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraImageAnnotation;
import org.eclipse.ui.handlers.HandlerUtil;

public class ToggleCameraImageAnnotationVisibilityCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		final Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		Job job = new Job("Toggle Camera Overlay Visibility.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				try
				{
					while (selections.hasNext()) 
					{
						Object selection = selections.next();

						if (selection instanceof CameraImageAnnotation) 
						{
							try
							{
								CameraImageAnnotation cameraImageAnnotation = (CameraImageAnnotation) selection;
								cameraImageAnnotation.setVisible(!cameraImageAnnotation.isVisible());
							}
							catch(Throwable t)
							{
								t.printStackTrace();
							}
						}						
					}		
					return Status.OK_STATUS;
				}
				catch(Throwable t)
				{
					return new Status(IStatus.ERROR, Activator.ID, "Failed to toggle overlay visibility !", t);
				}
				
			}
		};
		job.schedule();
		
		return null;
	}
}
