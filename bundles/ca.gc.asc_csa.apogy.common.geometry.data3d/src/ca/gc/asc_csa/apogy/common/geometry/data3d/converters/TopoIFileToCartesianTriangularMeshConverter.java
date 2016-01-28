package ca.gc.asc_csa.apogy.common.geometry.data3d.converters;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;

public class TopoIFileToCartesianTriangularMeshConverter implements IConverter {

	public Class<?> getOutputType() 
	{		
		return CartesianTriangularMesh.class;
	}

	public Class<?> getInputType() 
	{
		return IFile.class;
	}

	public boolean canConvert(Object input) 
	{	
		if(input instanceof IFile)
		{
			IFile file = (IFile) input;	
			return (getFileExtension(file.getName()).endsWith(".topo"));			
		}
		else
		{
			return false;
		}
	}

	public Object convert(Object input) throws Exception 
	{
		IFile file = (IFile) input;		
		InputStream inputStream = file.getContents();		
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
