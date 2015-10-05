package ca.gc.space.mrt.geometry.data3d.converters;

import java.io.File;
import java.net.URL;

import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.space.mrt.geometry.data3d.Activator;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3DIO;

public class URLTRIToCartesianTriangularMeshConverter extends URLToCartesianTriangularMeshConverter 
{
	private static String[] fileExtensions = new String[]{".tri"};
	
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
			URL urlTri = (URL) input;		
			URL urlxyz = createXYZURL(urlTri);
						
			File tempFileTri = copyURLContent(urlTri);
			File tempFileXYZ = copyURLContent(urlxyz);
			
			// Loads mesh
			mesh = Data3DIO.INSTANCE.loadTriangularMeshFromTriXYZ(tempFileTri.getAbsolutePath(), tempFileXYZ.getAbsolutePath());
			
			if(mesh != null)
			{
				Logger.INSTANCE.log(Activator.ID, this, "Sucessfully loaded CartesianTriangularMesh from URL<" + urlTri + ">", EventSeverity.OK);
			}
			else
			{
				Logger.INSTANCE.log(Activator.ID, this, "Could not load CartesianTriangularMesh from URL<" + urlTri + ">!", EventSeverity.ERROR);
			}							
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		return mesh;
	}
	
	private URL createXYZURL(URL urlTri) throws Exception
	{
		int index = urlTri.toString().lastIndexOf(".");
		
		String newURLString = urlTri.toString().substring(0, index + 1) + "xyz";

		return new URL(newURLString);
	}
}
