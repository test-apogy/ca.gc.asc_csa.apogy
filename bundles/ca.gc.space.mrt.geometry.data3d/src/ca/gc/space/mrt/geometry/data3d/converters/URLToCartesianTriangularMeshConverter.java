package ca.gc.space.mrt.geometry.data3d.converters;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.symphony.common.converters.IConverter;

public abstract class URLToCartesianTriangularMeshConverter implements IConverter 
{			
	public abstract String[] getSupportedFileExtension();
	
	
	public boolean canConvert(Object input) 
	{	
		if(input instanceof URL)
		{
			URL url = (URL) input;
			
			boolean canConvert = false;
						
			String[] fileExtensions = getSupportedFileExtension();
			int i = 0;						
			while(i < fileExtensions.length && !canConvert)
			{
				String fileExtension = fileExtensions[i];
				if(url.getFile().endsWith(fileExtension))
				{
					canConvert = true;
				}
				i++;
			}
			return canConvert;
		}
		else
		{
			return false;
		}
	}
	
	public String getFileName(URL url)
	{
		String fileName = url.getFile();
		
		int startIndex = fileName.lastIndexOf(File.separator);				
		int endIndex = fileName.lastIndexOf(".");
		if(startIndex > 0 && endIndex > 0)
		{
			fileName = fileName.substring(startIndex+1, endIndex);
		}
		
		return fileName;
	}
	
	public String getFileExtension(URL url)
	{
		String fileExtension = url.getFile();
		
		int index = fileExtension.lastIndexOf(".");
		if(index > 0)
		{
			fileExtension = fileExtension.substring(index);
		}
		
		return fileExtension;
	}
	
	public File copyURLContent(URL url)
	{		
		File tempFile = null;
		try
		{	
			String fileName = getFileName(url);
			String fileExtension = getFileExtension(url);
					
			tempFile = File.createTempFile(fileName, fileExtension);
								
			url.openConnection();
			InputStream reader = url.openStream();
		 			 	    	   		
			FileOutputStream writer = new FileOutputStream(tempFile);
			byte[] buffer = new byte[153600];
			int bytesRead = 0;
			while ((bytesRead = reader.read(buffer)) > 0)
			{  
			    writer.write(buffer, 0, bytesRead);
			    buffer = new byte[153600];
			}
			writer.close();
			reader.close();			
			
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		if(tempFile != null)
		{
			tempFile.deleteOnExit();
		}
		
		return tempFile;
	}	
}
