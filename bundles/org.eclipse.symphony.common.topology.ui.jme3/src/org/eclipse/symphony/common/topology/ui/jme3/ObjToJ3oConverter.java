package org.eclipse.symphony.common.topology.ui.jme3;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.jme3.app.Application;
import com.jme3.app.SimpleApplication;
import com.jme3.asset.plugins.FileLocator;
import com.jme3.export.binary.BinaryExporter;
import com.jme3.scene.Spatial;

public class ObjToJ3oConverter extends SimpleApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception 
	{		
		String[] argArray  = (String[]) context.getArguments().get("application.args");
			
		this.start();
		
		final SimpleApplication simpleApplication = this;
		
		Future<Object> future = this.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				getAssetManager().registerLocator("/", FileLocator.class);
				
				for(String s : argArray)
				{
					System.out.println("Exporting <" + s + ">.");
					export(simpleApplication, s);
				}		
								
				return new String("Done !");
			}
		});
			
		// Wait for this to be done.
		System.out.println(future.get());
										
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() 
	{		
		stop(true);
	}
	
	private void export(Application application, String path)
	{
		try
		{
			Spatial loadedModel = application.getAssetManager().loadModel(path);			
			String exportFileName = stipFileExtension(path) + ".j3o";			
			BinaryExporter exporter = BinaryExporter.getInstance();			
			File file = new File(exportFileName);
			exporter.save(loadedModel, file);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	private String stipFileExtension(String path)
	{
		int index = path.lastIndexOf(".");
		return path.substring(0, index);
	}

	@Override
	public void simpleInitApp() {
		// TODO Auto-generated method stub
		
	}

}