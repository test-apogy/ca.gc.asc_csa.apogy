package ca.gc.space.mrt.geometry.data3d.converters;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import ca.gc.asc_csa.eclipse.converters.IConverter;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.Data3DIO;

public class TopoFileToCartesianTriangularMeshConverter implements IConverter {

	public Class<?> getOutputType() 
	{		
		return CartesianTriangularMesh.class;
	}

	public Class<?> getInputType() 
	{		
		return File.class;
	}

	public boolean canConvert(Object input) 
	{	
		if(input instanceof File)
		{
			File file = (File) input;	
			return (getFileExtension(file.getName()).endsWith(".topo") || getFileExtension(file.getName()).endsWith(".xml"));			
		}
		else
		{
			return false;
		}
	}

	public Object convert(Object input) throws Exception 
	{
		File file = (File) input;		
		InputStream inputStream = new FileInputStream(file);
		return Data3DIO.INSTANCE.loadTriangularMesh(inputStream);
	}

	/**
	 * Returns the file extebsion of a file name.
	 * @param url The url as a string.
	 * @return The file extension
	 */
	protected String getFileExtension(String url) 
	{
		String fileExtension = new String();
		String fileName = url;
		int index = fileName.lastIndexOf(".");
		if (index >= 0) {
			fileExtension = fileName.substring(index);
			fileExtension = fileExtension.toLowerCase();
		}

		
		return fileExtension;
	}
}
