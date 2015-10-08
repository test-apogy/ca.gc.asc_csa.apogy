package org.eclipse.symphony.core.recordings.ui.commands;
import java.io.File;
import java.io.FileWriter;
import java.util.Date;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade;
import org.eclipse.symphony.core.recordings.Recording;
import org.eclipse.symphony.core.recordings.RecordingTrack;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.UIJob;


public class ExportToCSVCommand extends AbstractHandler implements IHandler 
{
	public static String FILE_EXTENSION = ".csv";
	private static String path = null;
	
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
			
		new Job("ExportChannelToCSVCommand")
		{		
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
				
				while (selections.hasNext())
				{
					Object selection = selections.next();		
					if (selection instanceof RecordingTrack)
					{
						RecordingTrack track = (RecordingTrack) selection;
						
						StringBuffer buffer = EMFEcoreInvocatorRecordingsFacade.INSTANCE.exportRecordingTrackToCSV(track);
						
						String fileName = createDefaultFileName(track);
						
						save(buffer, fileName);
					}
					else if(selection instanceof Recording)
					{
						Recording recording = (Recording) selection;
						
						StringBuffer buffer = EMFEcoreInvocatorRecordingsFacade.INSTANCE.exportRecordingTracksToCSV(recording.getRecordingTracks());
						
						String fileName = createDefaultFileName(recording);
						
						save(buffer, fileName);
					}
				}
				
				return Status.OK_STATUS;
			}
		}.schedule();
		return null;
	}
	
	protected String createDefaultFileName(final RecordingTrack track)
	{
		String name = null;				
		
		String feature = EMFEcoreInvocatorFacade.INSTANCE.getFullyQualifiedName(track.getChannel().getFeature());
				
		name =  "RecordingTrack_" + feature;
				
		return name + FILE_EXTENSION;
	}
	
	protected String createDefaultFileName(final Recording recording)
	{
		String name = null;
		if(recording.getName() != null)
		{			
			name = "Recording_" + recording.getName();
		}
		else
		{
			Date now = new Date();
			name =  "Recording_" + now.toString();
		}
		
		return name + FILE_EXTENSION;
	}
	
	protected void save(final StringBuffer stringBuffer, final String fileName)
	{
		UIJob job = new UIJob("Save as CSV") 
		{		
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) 
			{
				FileDialog fd = new FileDialog(new Shell(), SWT.SAVE);
		        fd.setText("Save as CSV");	        	       
		        fd.setFilterPath(getPath());	
		        fd.setFileName(fileName);
		        
		        String[] filterExt = { "*" + FILE_EXTENSION};
		        fd.setFilterExtensions(filterExt);
		        String selected = fd.open();
		        
		        if(selected != null)
		        {
			        // Tries saving the image to file.
			        try
			        {
			        	File csvFile = new File(selected);
			        	FileWriter fileWriter = new FileWriter(csvFile);
			            fileWriter.write(stringBuffer.toString());
			            fileWriter.close();
			        }
			        catch(Exception e)
			        {	        	
			        }
			        
			        // Update Path so next time it opens at the last location we tried.
			        try
			        {	        	
			        	path = selected.substring(0, selected.lastIndexOf(File.separator));
			        }
			        catch(Throwable t)
			        {	        	
			        }	   
		        }
		        return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
	
	protected String getPath()
	{
		if(path == null)
		{
			path = System.getProperty("user.dir");
		}
		
		return path;
	}
}