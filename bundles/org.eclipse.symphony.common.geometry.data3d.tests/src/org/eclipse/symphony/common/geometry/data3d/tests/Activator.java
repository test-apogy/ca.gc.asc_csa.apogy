package org.eclipse.symphony.common.geometry.data3d.tests;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Plugin;

public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "ca.gc.space.mrt.geometry.data3d.tests";

	public static final String MARS_VTP_FILE = "subsampled_Mars_DEM_20cm_resolution-tri.vtp";

	// Folder where the tests inputs files are.
	public static final String DATA_FOLDER = "data";
	
	// Folder where the tests results are.
	public static final String RESULTS_FOLDER = "results";
	
	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
		plugin = this;
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns the path of the folder where tests results should be saved.
	 * @return The path.
	 */
	public String getResultsPath()
	{
		return getFolderPath(RESULTS_FOLDER);
	}
	
	public String getDataPath()
	{
		return getFolderPath(DATA_FOLDER);
	}
	
	public String getTempDir()
	{
		return System.getProperty("java.io.tmpdir");
	}
	
	private String getFolderPath(String folderName)
	{
		String path = null;
		
		try 
		{			
			URL url = FileLocator.find(getBundle(), new Path(folderName), null);			
			IPath location = new Path(FileLocator.resolve(url).getPath());
						
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			
			// Creates a project for the tests.
			IProject project = root.getProject(PLUGIN_ID);	
						
			if(!project.exists()) project.create(null);	
			if(!project.isOpen()) project.open(null); 

			IFolder link = project.getFolder(folderName);	
			if(!link.exists())
			{
				link.createLink(location, IResource.NONE, null);		
			}
			
			path = link.getLocation().toString();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return path;
	}
	
	public IFile getIFile(String folderName, String fileName)
	{
		IFile iFile = null;
		
		try
		{
			URL url = FileLocator.find(getBundle(), new Path(folderName), null);			
			IPath location = new Path(FileLocator.resolve(url).getPath());
			
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot root = workspace.getRoot();
			IProject project = root.getProject(Activator.PLUGIN_ID);	
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
			IFolder iFolder = project.getFolder(folderName);
			if(!iFolder.exists())
			{
				iFolder.createLink(location, IResource.NONE, null);		
			}
			
			iFile = iFolder.getFile(fileName);						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return iFile;
	}
}
