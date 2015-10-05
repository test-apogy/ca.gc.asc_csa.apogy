package ca.gc.space.mrt.geometry.data3d.converters;

import java.io.File;
import java.net.URL;

import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.space.mrt.geometry.data3d.Activator;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;

public class URLTopoToCartesianTriangularMeshConverter extends URLToCartesianTriangularMeshConverter 
{
	private static String[] fileExtensions = new String[]{".topo", "xml"};
	
	public Class<?> getOutputType() 
	{		
		return CartesianTriangularMesh.class;
	}

	public Class<?> getInputType() 
	{
		return URL.class;
	}

	@Override
	public String[] getSupportedFileExtension() 
	{	
		return fileExtensions;
	}

	public Object convert(Object input) throws Exception 
	{				
		CartesianTriangularMesh mesh = null;
		
		try
		{		
			URL url = (URL) input;		
			
			File tempFile = copyURLContent(url);
			
			if(tempFile != null)
			{
				 mesh = (CartesianTriangularMesh) org.eclipse.symphony.common.converters.Activator.convert(tempFile, CartesianTriangularMesh.class);				 				 
			}
			
			if(mesh != null)
			{
				Logger.INSTANCE.log(Activator.ID, this, "Sucessfully loaded CartesianTriangularMesh from URL<" + url + ">", EventSeverity.OK);
			}
			else
			{
				Logger.INSTANCE.log(Activator.ID, this, "Could not load CartesianTriangularMesh from URL<" + url + ">!", EventSeverity.ERROR);
			}							
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		return mesh;
	}
}
