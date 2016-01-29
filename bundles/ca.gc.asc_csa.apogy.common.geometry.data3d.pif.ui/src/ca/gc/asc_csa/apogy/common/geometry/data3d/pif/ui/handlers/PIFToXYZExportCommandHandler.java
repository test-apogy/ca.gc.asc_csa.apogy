package ca.gc.asc_csa.apogy.common.geometry.data3d.pif.ui.handlers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.vecmath.Point3f;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import ca.gc.asc_csa.apogy.common.geometry.data3d.pif.PifReader;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class PIFToXYZExportCommandHandler extends AbstractHandler implements IHandler
{
	private static final String INPUT_FILE_EXTENSION = ".pf";
	private static final String OUTPUT_FILE_EXTENSION = ".xyz";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		while (selections.hasNext())
		{
			Object selection = selections.next();
			
			if (selection instanceof IFile)
			{
				final IFile file = (IFile) selection;
				
				String filePath = file.getLocation().toOSString();
				
				if (filePath.endsWith(INPUT_FILE_EXTENSION) == true)
				{
					Job job = new PIFToXYZExportJob(filePath);

					job.setUser(true);
					job.schedule();
				
					break;
				}
			}
		}
		
		return null;
	}

	private class PIFToXYZExportJob extends Job
	{
		private static final String JOB_NAME = "PIF to XYZ Export";
		
		private String filePath;
		private Shell shell;
		
		public PIFToXYZExportJob(String filePath)
		{
			super(JOB_NAME);
			
			this.filePath = filePath;
			this.shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		}

		@Override
		protected IStatus run(IProgressMonitor monitor)
		{
			monitor.beginTask("Importing...", IProgressMonitor.UNKNOWN);
			
			try
			{
				PifReader reader = new PifReader(filePath);

				List<Point3f> points = reader.getPoints();
				
				writePoints(points);
			}
			catch (final IOException e)
			{
				e.printStackTrace();
				
				Runnable run = new Runnable()
				{
					@Override
					public void run()
					{
						MessageDialog.openError(shell,
												"Error",
												"Error while importing file " + filePath + ": "	+ e.getMessage());
					}
				};

				shell.getDisplay().asyncExec(run);
			}
			finally
			{
				monitor.done();
			}
			
			return Status.OK_STATUS;
		}
		
		private void writePoints(List<Point3f> points) throws FileNotFoundException
		{
			File f = new File(filePath);
			String dir = f.getParent();

			final String outputFile = dir + File.separator + f.getName().replace(INPUT_FILE_EXTENSION,
																			     OUTPUT_FILE_EXTENSION);

			FileOutputStream fos = new FileOutputStream(new File(outputFile));

			PrintWriter writer = new PrintWriter(fos);

			for (Point3f p : points)
			{
				writer.println(p.x + " " + p.y + " " + p.z);
			}

			writer.flush();
			writer.close();

			Runnable run = new Runnable()
			{
				@Override
				public void run()
				{
					MessageDialog.openInformation(shell, "Info", "File exported to " + outputFile);
				}
			};

			shell.getDisplay().asyncExec(run);
		}
	}
}
