package org.eclipse.symphony.common.geometry.data3d.pif.ui.popup.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.vecmath.Point3f;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.symphony.common.geometry.data3d.pif.PifReader;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class NewAction implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;

	/**
	 * Constructor for Action1.
	 */
	public NewAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (selection != null) {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection ssel = (IStructuredSelection) selection;
				if (ssel.getFirstElement() instanceof IFile) {
					IFile file = (IFile) ssel.getFirstElement();
					final String name = file.getLocation().toOSString();

					Job job = new Job("PIF to XYZ Export") {

						@Override
						protected IStatus run(IProgressMonitor monitor) {
							monitor.beginTask("Importing",
									IProgressMonitor.UNKNOWN);
							try {
								PifReader reader = new PifReader(name);

								List<Point3f> points = reader.getPoints();
								writePoints(points);

							} catch (final IOException e) {
								e.printStackTrace();
								Runnable run = new Runnable() {

									@Override
									public void run() {
										MessageDialog.openError(
												shell,
												"Error",
												"Error while importing file "
														+ name + ": "
														+ e.getMessage());
									}
								};

								shell.getDisplay().asyncExec(run);

							} finally {
								monitor.done();
							}
							return Status.OK_STATUS;
						}

						private void writePoints(List<Point3f> points)
								throws FileNotFoundException {
							File f = new File(name);
							String dir = f.getParent();

							final String outputFile = dir + File.separator
									+ f.getName().replace(".pf", ".xyz");

							FileOutputStream fos = new FileOutputStream(
									new File(outputFile));

							PrintWriter writer = new PrintWriter(fos);

							for (Point3f p : points) {
								writer.println(p.x + " " + p.y + " " + p.z);
							}

							writer.flush();
							writer.close();

							Runnable run = new Runnable() {

								@Override
								public void run() {
									MessageDialog.openInformation(shell,
											"Info", "File exported to "
													+ outputFile);

								}
							};

							shell.getDisplay().asyncExec(run);

						}

					};

					job.setUser(true);
					job.schedule();

				}
			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

}
