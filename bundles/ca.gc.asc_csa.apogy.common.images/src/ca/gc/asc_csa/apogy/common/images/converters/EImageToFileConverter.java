package ca.gc.asc_csa.apogy.common.images.converters;

import java.io.File;
import java.util.Date;

import org.eclipse.swt.SWT;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;

public class EImageToFileConverter implements IConverter 
{
	public static String[] FILE_EXTENSIONS = new String[]{"jpg", "gif", "png", "bmp"};
	public static int[]    FILE_TYPES =      new int[]   {SWT.IMAGE_JPEG, SWT.IMAGE_GIF, SWT.IMAGE_PNG, SWT.IMAGE_BMP};
	
	@Override
	public Class<?> getOutputType() {		
		return File.class;
	}

	@Override
	public Class<?> getInputType() {		
		return EImage.class;
	}

	@Override
	public boolean canConvert(Object input) {		
		return input != null;
	}

	@Override
	public Object convert(Object input) throws Exception 
	{
		EImage eImage = (EImage) input;		
		
		// Saves the image in a file in the tmp folder .
		String tmpFolder = System.getProperty("user.home") + File.separator + System.getProperty("java.io.tmpdir");
		Date now = new Date();				
		
		
		// Tries all format until one that works is found.
		String fileName = null;
		try
		{			
			fileName = tmpFolder + File.separator + now.getTime() + ".jpg";										
			EImagesUtilities.INSTANCE.saveImageAsJPEG(fileName, eImage);				
			
			return new File(fileName);	
		}
		catch(Exception e)
		{
			File toDelete = new File(fileName);
			toDelete.delete();
			
			e.printStackTrace();
			
			return null;
		}							
	}
}
