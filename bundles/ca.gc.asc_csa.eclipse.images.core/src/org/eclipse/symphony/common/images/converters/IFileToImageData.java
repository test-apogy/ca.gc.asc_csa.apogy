package org.eclipse.symphony.common.images.converters;

import org.eclipse.core.resources.IFile;
import org.eclipse.swt.graphics.ImageData;

import ca.gc.asc_csa.eclipse.converters.IConverter;

/**
 * Converter that produces an ImageData from a IFile.
 * @author pallard
 *
 */
public class IFileToImageData implements IConverter {

	public static String[] supportedFileExtensions = new String[]{"gif", "jpg", "jpeg", "png", "tiff", "tif", "bmp"};
	
	public IFileToImageData() 
	{		
	}

	@Override
	public Class<?> getOutputType() {
		return ImageData.class;
	}

	@Override
	public Class<?> getInputType() {
		return IFile.class;
	}

	@Override
	public boolean canConvert(Object input) 
	{		
		if(input != null)
		{
			IFile file = (IFile) input;
			String fileExtension = getFileExtension(file.getName());			
			
			// Check all the supported file extension to see if the current one is supported,
			for(int i = 0; i < supportedFileExtensions.length; i++)
			{
				String supportedExtension = supportedFileExtensions[i];
			
				if(fileExtension.endsWith(supportedExtension))
				{
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		IFile file = (IFile) input;			
		
		ImageData imageData = new ImageData(file.getLocation().toOSString());
		return imageData;
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
