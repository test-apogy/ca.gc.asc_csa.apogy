package org.eclipse.symphony.core.environment.tests;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

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
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{

	// The shared instance
	private static Activator plugin;
	
	private BundleContext context = null;
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.symphony.core.environment.tests";
	
	// Folder where the data files are.
	public static final String DATA_FOLDER = "data";
	
	// Folder where the tests files are.
	public static final String RESULTS_FOLDER = "results";
	
	
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
		
	@Override
	public void start(BundleContext context) throws Exception {
		this.context = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		this.context = null;
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
		//return System.getProperty("java.io.tmpdir");
		return System.getProperty("user.home");
	}
	
	private String getFolderPath(String folderName)
	{
		String path = null;
		
		try 
		{						
			URL url = FileLocator.find(context.getBundle(), new Path(folderName), null);			
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
	
	public void saveToFile(String s, String fileName)
	{
		String path = getTempDir() + File.separatorChar + fileName;
		
		try
		{
			File file = new File(path);
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			
			out.write(s);
			out.flush();
			out.close();
		}
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
	}

}
