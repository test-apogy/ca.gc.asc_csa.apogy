/**
 * Canadian Space Agency 2011
 */
package org.eclipse.symphony.common.images.impl;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ImageAlignment;
import org.eclipse.symphony.common.images.ImageSize;
import org.eclipse.symphony.common.images.Symphony__CommonImagesFactory;
import org.eclipse.symphony.common.images.Symphony__CommonImagesPackage;
import com.jhlabs.image.ContrastFilter;
import com.jhlabs.image.EdgeFilter;
import com.jhlabs.image.ExposureFilter;
import com.jhlabs.image.FlipFilter;
import com.jhlabs.image.GainFilter;
import com.jhlabs.image.GrayscaleFilter;
import com.jhlabs.image.InvertFilter;
import com.jhlabs.image.RescaleFilter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EImages Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EImagesUtilitiesImpl extends MinimalEObjectImpl.Container implements EImagesUtilities 
{
	private static EImagesUtilities instance = null;
	
	public static EImagesUtilities getInstance() 
	{
		if (instance == null) 
		{
			instance = new EImagesUtilitiesImpl();
		}
		return instance;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EImagesUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonImagesPackage.Literals.EIMAGES_UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage copy(AbstractEImage originalImage) 
	{
		EImage copy = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		
		if(originalImage.asBufferedImage() != null)
		{
			BufferedImage b = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		    Graphics g = b.getGraphics();
		    g.drawImage(originalImage.asBufferedImage(), 0, 0, null);
		    g.dispose();
		    
		    copy.setImageContent(b);
		}
		
		return copy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage convertToGrayScale(AbstractEImage originalImage) 
	{
		GrayscaleFilter grayscaleFilter = new GrayscaleFilter();
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		
		grayscaleFilter.setDimensions(width, height);		
		grayscaleFilter.filter(sourceImage, destinationImage);
				
		EImage grayScaleImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		grayScaleImage.setImageContent(destinationImage);
		
		return grayScaleImage;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage resize(AbstractEImage originalImage, double scaleFactor) 
	{
		return resize(originalImage, scaleFactor, scaleFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage resize(AbstractEImage originalImage, double widthScaleFactor, double heightScaleFactor) 
	{
		int height = (int) Math.round(heightScaleFactor * originalImage.getHeight());
		int width = (int) Math.round(widthScaleFactor * originalImage.getWidth());	
		
		return resize(originalImage, width, height);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage resize(AbstractEImage originalImage, int newWidth, int newHeight) 
	{
		java.awt.Image image = originalImage.asBufferedImage().getScaledInstance(newWidth, newHeight, java.awt.Image.SCALE_SMOOTH);
		
		BufferedImage result = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = result.createGraphics(); 
		g2d.drawImage(image, 0, 0, null);		
		
		EImage scaledImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		scaledImage.setImageContent(result);
		
		g2d.dispose();
		
	    return scaledImage;	 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage createTransparentImage(int width, int height) 
	{
		return createUniformColorImage(width, height, 0, 0, 0, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage createUniformColorImage(int width, int height, int red, int green, int blue, int alpha) 
	{
		BufferedImage bufferedImage = new BufferedImage (width, height, BufferedImage.TYPE_INT_ARGB);
	    Graphics g = bufferedImage.createGraphics ();   	    	    	    
	    g.setColor(new Color(red, green, blue, alpha));
	    g.fillRect(0, 0, width, height);
	    	    
	    EImage eImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
	    eImage.setImageContent(bufferedImage);
	    return eImage;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyAlpha(AbstractEImage originalImage, float alpha) 
	{
		BufferedImage bufferedImage = new BufferedImage (originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = bufferedImage.createGraphics ();   
	    
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
		g2d.drawImage(originalImage.asBufferedImage(),0,0,null);
	    
		EImage eImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
	    eImage.setImageContent(bufferedImage);
	    return eImage;			    
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyEdgeFilter(AbstractEImage originalImage) 
	{
		EdgeFilter filter = new EdgeFilter();
				
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		filter.filter(sourceImage, destinationImage);
		
		EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		filteredImage.setImageContent(destinationImage);
		return filteredImage;	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyContrastAndBrightnessFilter(AbstractEImage originalImage, double contrast, double brightness) 
	{
		ContrastFilter filter = new ContrastFilter();
		
		filter.setContrast((float) contrast);
		filter.setBrightness((float) brightness);
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		filter.filter(sourceImage, destinationImage);
		
		EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		filteredImage.setImageContent(destinationImage);
		return filteredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyExposureFilter(AbstractEImage originalImage, double exposure) 
	{
		ExposureFilter filter = new ExposureFilter();
		
		filter.setExposure((float) exposure);		
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		filter.filter(sourceImage, destinationImage);
		
		EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		filteredImage.setImageContent(destinationImage);
		return filteredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyInvertFilter(AbstractEImage originalImage) 
	{
		InvertFilter filter = new InvertFilter();
				
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		filter.filter(sourceImage, destinationImage);
		
		EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		filteredImage.setImageContent(destinationImage);
		return filteredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyRescaleFilter(AbstractEImage originalImage, double scale) 
	{
		RescaleFilter filter = new RescaleFilter();
		
		filter.setScale((float) scale);
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		filter.filter(sourceImage, destinationImage);
		
		EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		filteredImage.setImageContent(destinationImage);
		return filteredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyGainFilter(AbstractEImage originalImage, double gain, double bias) 
	{
		GainFilter filter = new GainFilter();
		
		filter.setGain((float) gain);
		filter.setBias((float) bias);
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		filter.filter(sourceImage, destinationImage);
		
		EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		filteredImage.setImageContent(destinationImage);
		return filteredImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage createTextImage(String text, Font font, Color textColor, Color backgroundColor, int borderWidth) 
	{
        // First, gets the size of image required to draw the text.
		Rectangle2D imageRectangle = getRawTextImageSize(text, font);		
		int w = (int)Math.ceil(imageRectangle.getWidth()) + borderWidth * 2;
		int h = (int)Math.ceil(imageRectangle.getHeight()) + borderWidth * 2;
				
		// Creates an image with uniform background of the required size.							
		BufferedImage img = EImagesUtilities.INSTANCE.createUniformColorImage(w, h, backgroundColor.getRed(), backgroundColor.getGreen(), backgroundColor.getBlue(), backgroundColor.getAlpha()).asBufferedImage();
		
		Graphics g = img.getGraphics();
        g.setColor(textColor);    
                  
        g.setFont(font);        
        FontMetrics fm = g.getFontMetrics();
        int x = img.getWidth() - fm.stringWidth(text) - borderWidth;
        int y = fm.getHeight() - fm.getDescent() + borderWidth;           
        
        g.drawString(text, x, y);
        g.dispose();
        
        EImage image = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
        image.setImageContent(img);
        
		return image;
	}
	
	private static Rectangle2D getRawTextImageSize(String text, Font font)
	{		
		BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_4BYTE_ABGR);  
        Graphics g = img.getGraphics();  
        g.setFont(font);  
        FontRenderContext frc = g.getFontMetrics().getFontRenderContext();            
        Rectangle2D rect = font.getStringBounds(text, frc);  
        g.dispose();  
        
        return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void saveImageAsJPEG(String destinationFilePath, AbstractEImage image) throws Exception 
	{
		File file = new File(destinationFilePath);
		javax.imageio.ImageIO.write(image.asBufferedImage(), "jpg", file);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void saveImageAsPNG(String destinationFilePath, AbstractEImage image) throws Exception 
	{
		File file = new File(destinationFilePath);
		javax.imageio.ImageIO.write(image.asBufferedImage(), "png", file);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage applyOverlay(AbstractEImage originalImage, AbstractEImage overlayImage, boolean allowOverlayResize) 
	{
		if(overlayImage != null && overlayImage.asBufferedImage() != null)
		{
			BufferedImage result = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
			BufferedImage overlay = overlayImage.asBufferedImage();
						
			if(allowOverlayResize)
			{				
				overlay = resize(overlayImage, originalImage.getWidth(), originalImage.getHeight()).asBufferedImage();								    						
			}			
			
			Graphics2D g2d = result.createGraphics(); 
			g2d.drawImage(originalImage.asBufferedImage(), 0, 0, null);
			g2d.drawImage(overlay, 0, 0, null);
			
			EImage resultImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
			resultImage.setImageContent(result);
			
			g2d.dispose();
			
			return resultImage;	 
		}
		else
		{			
			// Returns a copy of the original.
			return copy(originalImage);
		}			
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage flipHorizontal(AbstractEImage originalImage) 
	{
		FlipFilter flipFilter = new FlipFilter(FlipFilter.FLIP_H);
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		flipFilter.filter(sourceImage, destinationImage);
						
		EImage flippedImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		flippedImage.setImageContent(destinationImage);
		return flippedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage flipVertical(AbstractEImage originalImage) 
	{
		FlipFilter flipFilter = new FlipFilter(FlipFilter.FLIP_V);
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		BufferedImage sourceImage = originalImage.asBufferedImage();
		BufferedImage destinationImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
				
		flipFilter.filter(sourceImage, destinationImage);
		
		EImage flippedImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		flippedImage.setImageContent(destinationImage);
		return flippedImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ImageSize getAllEncompassingImageSize(List<? extends AbstractEImage> images) 
	{
		ImageSize imageSize = Symphony__CommonImagesFactory.eINSTANCE.createImageSize();
		
		for(AbstractEImage image : images)
		{
			if(image.getWidth() > imageSize.getWidth())
			{
				imageSize.setWidth(image.getWidth());
			}
			
			if(image.getHeight() > imageSize.getHeight())
			{
				imageSize.setHeight(image.getHeight());
			}
		}
		
		return imageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	
	@Override
	public AbstractEImage superPoseImages(List<? extends AbstractEImage> images, boolean allowImageResize,ImageAlignment alignment) 
	{
		// First, find the image size that will fit all images together.
		ImageSize resultImageSize = getAllEncompassingImageSize(images);
		
		// Creates an transparent image of the proper size		
		AbstractEImage result = createTransparentImage(resultImageSize.getWidth(), resultImageSize.getHeight());				
		
		// Superpose the images one after the other.
		for(AbstractEImage image : images)
		{
			result = superPoseImages(result, image, allowImageResize, alignment);
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage superPoseImages(AbstractEImage imageA, AbstractEImage imageB, boolean allowImageResize, ImageAlignment alignment) 
	{
		AbstractEImage imageBCopy = imageB;

		// If allowImageResize, resize imageB
		if(allowImageResize)
		{
			imageBCopy = resize(imageB, imageA.getWidth(), imageA.getHeight());
		}
		
		BufferedImage result = new BufferedImage(imageA.getWidth(), imageA.getHeight(), BufferedImage.TYPE_INT_ARGB);
				
		Graphics2D g2d = result.createGraphics(); 
		
		int imageOffsetX = 0;
		int imageOffsetY = 0;
		int imageWidth = imageBCopy.getWidth();
		int imageHeight = imageBCopy.getHeight();
		
		if(imageBCopy.getHeight() > imageA.getHeight())
		{
			imageHeight = imageA.getHeight();
		}		
		
		if(imageBCopy.getWidth() > imageA.getWidth())
		{
			imageWidth = imageA.getWidth();
		}
		
		switch (alignment.getValue()) 
		{
			case ImageAlignment.CENTER_VALUE:
			{
				imageOffsetX = Math.round(((imageA.getWidth() - imageWidth) * 0.5f));
				imageOffsetY = Math.round(((imageA.getHeight() - imageHeight) * 0.5f));
			}
			break;			
			case ImageAlignment.LOWER_LEFT_CORNER_VALUE:
			{
				imageOffsetX = 0;
				imageOffsetY = Math.round((imageA.getHeight() - imageHeight));
			}
			break;			
			case ImageAlignment.UPPER_LEFT_CORNER_VALUE:
			{
				imageOffsetX = 0;
				imageOffsetY = 0;
			}
			break;
			case ImageAlignment.LOWER_RIGHT_CORNER_VALUE:
			{
				imageOffsetX = Math.round(imageA.getWidth() - imageWidth);
				imageOffsetY = Math.round((imageA.getHeight() - imageHeight));
			}
			break;
			case ImageAlignment.UPPER_RIGHT_CORNER_VALUE:
			{
				imageOffsetX = Math.round(imageA.getWidth() - imageWidth);
				imageOffsetY = 0;
			}
			break;
						
			default:
			break;
		}
		
		g2d.drawImage(imageA.asBufferedImage(), 0, 0, null);
		g2d.drawImage(imageBCopy.asBufferedImage(), imageOffsetX, imageOffsetY, null);
		g2d.dispose();
		
		EImage resultImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		resultImage.setImageContent(result);
		
		g2d.dispose();
				
		return resultImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage addBorder(AbstractEImage originalImage, int borderWidth, int red, int green, int blue) 
	{
		BufferedImage result = copy(originalImage).asBufferedImage();
		Graphics2D g2d = result.createGraphics(); 
		
		if(borderWidth > 0)
		{
			Color color = new Color(red, green, blue);
			g2d.setColor(color);	
			g2d.setStroke(new BasicStroke(1));
							
			int x0 = 0;
			int x1 = originalImage.getWidth() - 1;		
			int y0 = 0;
			int y1 = originalImage.getHeight() - 1;
					
			// Adds line to makeup the border.
			for(int i = 0; i < borderWidth; i++)
			{				
				g2d.drawLine(x0, y0, x1, y0);
				g2d.drawLine(x1, y0, x1, y1);
				g2d.drawLine(x1, y1, x0, y1);
				g2d.drawLine(x0, y1, x0, y0);
				
				x0 +=1;
				x1 -=1;
				y0 +=1;
				y1 -=1;
			}
								
			g2d.dispose();
		}
		
		EImage resultImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
		resultImage.setImageContent(result);
				
		return resultImage;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage getSubImage(AbstractEImage originalImage, int widthOffset, int heightOffset, int subImageWidth, int subImageHeight) throws Exception 
	{
		// Check that the offsets are valid
		if(originalImage.getHeight() > heightOffset && originalImage.getWidth() > widthOffset)
		{			
			BufferedImage result = new BufferedImage(subImageWidth, subImageHeight, BufferedImage.TYPE_INT_ARGB);
			Graphics2D g2d = result.createGraphics(); 
									
			g2d.drawImage(originalImage.asBufferedImage(), 0, 0, subImageWidth, subImageHeight, widthOffset, heightOffset, widthOffset+subImageWidth, heightOffset+subImageWidth, null);
			
			EImage resultImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
			resultImage.setImageContent(result);
						
			g2d.dispose();
			
			return resultImage;
		}
		else
		{
			throw new IllegalArgumentException("Specified offsets are outside the original image !");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage rotate(AbstractEImage originalImage, double angle, boolean enableImageResize) 
	{
		BufferedImage sourceImage = originalImage.asBufferedImage(); 
		
		int w = sourceImage.getWidth();
	    int h = sourceImage.getHeight();
	    	    	   
	    if(enableImageResize)
	    {
	    	// Computes resultant image size
	    	Point2D size = getResultingRectangleSizeForRotatedImage(w,h,angle);	    	
	    	int newWidth  = (int) Math.round(size.getX());
	    	int newHeight = (int) Math.round(size.getY());
	    		    		    
	    	BufferedImage rot = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
				    		    	
			AffineTransform affineTransform = new AffineTransform();
			affineTransform.translate(newWidth/2, newHeight/2);
			affineTransform.rotate(angle);
			affineTransform.translate(-w/2, -h/2);
			
		    Graphics2D g = (Graphics2D) rot.createGraphics();
		    g.drawImage(sourceImage, affineTransform, null);
		    g.dispose();
			
			EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
			filteredImage.setImageContent(rot);
			return filteredImage;
	    }
	    else
	    {
		    BufferedImage rot = new BufferedImage(h, w, BufferedImage.TYPE_INT_ARGB);
			
			AffineTransform xform = AffineTransform.getRotateInstance(angle, w / 2, h / 2);
		    Graphics2D g = (Graphics2D) rot.createGraphics();
		    g.drawImage(sourceImage, xform, null);
		    g.dispose();
	
			EImage filteredImage = Symphony__CommonImagesFactory.eINSTANCE.createEImage();
			filteredImage.setImageContent(rot);
			return filteredImage;
	    }
	    
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage translate(AbstractEImage originalImage, int widthTranslation, int heightTranslation) 
	{
		int newWidth = originalImage.getWidth() + Math.abs(widthTranslation);
		int newHeight = originalImage.getHeight() + Math.abs(heightTranslation);
		
		// Creates an transparent image large enough to contain the image + the translation.
		AbstractEImage result  = createTransparentImage(newWidth, newHeight);
		
		ImageAlignment imageAlignment = ImageAlignment.CENTER;
		if(widthTranslation > 0)
		{
			if(heightTranslation > 0)
			{
				imageAlignment = ImageAlignment.LOWER_RIGHT_CORNER;
			}
			else
			{
				imageAlignment = ImageAlignment.UPPER_RIGHT_CORNER;
			}
		}
		else 
		{
			if(heightTranslation > 0)
			{
				imageAlignment = ImageAlignment.LOWER_LEFT_CORNER;
			}
			else
			{
				imageAlignment = ImageAlignment.UPPER_LEFT_CORNER;
			}
		}
		
		result = superPoseImages(result, originalImage, false, imageAlignment);
		
		
		return result;
	}

	private Point2D getResultingRectangleSizeForRotatedImage(int w, int h, double angle)
	{
		// Creates a list of points representing the corners.
		double halfWidth = w * 0.5;
		double halfheight = h * 0.5;
		
		List<Point2D> corners = new ArrayList<Point2D>();
		
		corners.add(new Point2D.Double(-halfWidth, -halfheight));
		corners.add(new Point2D.Double(-halfWidth, halfheight));
		corners.add(new Point2D.Double(halfWidth, halfheight));
		corners.add(new Point2D.Double(halfWidth, -halfheight));
		
		List<Point2D> rotatedCorners = applyRotation(corners, angle);
		
		double width = 0;
		double height = 0;
		
		for(Point2D p : rotatedCorners)
		{
			if(Math.abs(p.getX()) >  width)
			{
				width = Math.abs(p.getX());
			}
			
			if(Math.abs(p.getY()) >  height)
			{
				height = Math.abs(p.getY());
			}
		}
		
		return new Point2D.Double(width * 2.0, height * 2.0);
	}
	
	private List<Point2D> applyRotation(List<Point2D> points, double angle)
	{
		List<Point2D> results = new ArrayList<Point2D>();
		
		AffineTransform rotation = AffineTransform.getRotateInstance(angle);
		
		for(Point2D p : points)
		{
			Point2D result = new Point2D.Double();
			rotation.transform(p, result);
			results.add(result);
		}
		
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___COPY__ABSTRACTEIMAGE:
				return copy((AbstractEImage)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___CONVERT_TO_GRAY_SCALE__ABSTRACTEIMAGE:
				return convertToGrayScale((AbstractEImage)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE:
				return resize((AbstractEImage)arguments.get(0), (Double)arguments.get(1));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_DOUBLE_DOUBLE:
				return resize((AbstractEImage)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___RESIZE__ABSTRACTEIMAGE_INT_INT:
				return resize((AbstractEImage)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___CREATE_TRANSPARENT_IMAGE__INT_INT:
				return createTransparentImage((Integer)arguments.get(0), (Integer)arguments.get(1));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___SAVE_IMAGE_AS_JPEG__STRING_ABSTRACTEIMAGE:
				try {
					saveImageAsJPEG((String)arguments.get(0), (AbstractEImage)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___SAVE_IMAGE_AS_PNG__STRING_ABSTRACTEIMAGE:
				try {
					saveImageAsPNG((String)arguments.get(0), (AbstractEImage)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_OVERLAY__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN:
				return applyOverlay((AbstractEImage)arguments.get(0), (AbstractEImage)arguments.get(1), (Boolean)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___FLIP_HORIZONTAL__ABSTRACTEIMAGE:
				return flipHorizontal((AbstractEImage)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___FLIP_VERTICAL__ABSTRACTEIMAGE:
				return flipVertical((AbstractEImage)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___ROTATE__ABSTRACTEIMAGE_DOUBLE_BOOLEAN:
				return rotate((AbstractEImage)arguments.get(0), (Double)arguments.get(1), (Boolean)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___TRANSLATE__ABSTRACTEIMAGE_INT_INT:
				return translate((AbstractEImage)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___GET_ALL_ENCOMPASSING_IMAGE_SIZE__LIST:
				return getAllEncompassingImageSize((List<? extends AbstractEImage>)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___SUPER_POSE_IMAGES__LIST_BOOLEAN_IMAGEALIGNMENT:
				return superPoseImages((List<? extends AbstractEImage>)arguments.get(0), (Boolean)arguments.get(1), (ImageAlignment)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___SUPER_POSE_IMAGES__ABSTRACTEIMAGE_ABSTRACTEIMAGE_BOOLEAN_IMAGEALIGNMENT:
				return superPoseImages((AbstractEImage)arguments.get(0), (AbstractEImage)arguments.get(1), (Boolean)arguments.get(2), (ImageAlignment)arguments.get(3));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___ADD_BORDER__ABSTRACTEIMAGE_INT_INT_INT_INT:
				return addBorder((AbstractEImage)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___GET_SUB_IMAGE__ABSTRACTEIMAGE_INT_INT_INT_INT:
				try {
					return getSubImage((AbstractEImage)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___CONVERT_TO_BUFFERED_IMAGE__IMAGEDATA:
				return convertToBufferedImage((ImageData)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___CONVERT_TO_IMAGE_DATA__BUFFEREDIMAGE:
				return convertToImageData((BufferedImage)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___CREATE_UNIFORM_COLOR_IMAGE__INT_INT_INT_INT_INT_INT:
				return createUniformColorImage((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_ALPHA__ABSTRACTEIMAGE_FLOAT:
				return applyAlpha((AbstractEImage)arguments.get(0), (Float)arguments.get(1));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_EDGE_FILTER__ABSTRACTEIMAGE:
				return applyEdgeFilter((AbstractEImage)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_CONTRAST_AND_BRIGHTNESS_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE:
				return applyContrastAndBrightnessFilter((AbstractEImage)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_EXPOSURE_FILTER__ABSTRACTEIMAGE_DOUBLE:
				return applyExposureFilter((AbstractEImage)arguments.get(0), (Double)arguments.get(1));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_INVERT_FILTER__ABSTRACTEIMAGE:
				return applyInvertFilter((AbstractEImage)arguments.get(0));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_RESCALE_FILTER__ABSTRACTEIMAGE_DOUBLE:
				return applyRescaleFilter((AbstractEImage)arguments.get(0), (Double)arguments.get(1));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___APPLY_GAIN_FILTER__ABSTRACTEIMAGE_DOUBLE_DOUBLE:
				return applyGainFilter((AbstractEImage)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES___CREATE_TEXT_IMAGE__STRING_FONT_COLOR_COLOR_INT:
				return createTextImage((String)arguments.get(0), (Font)arguments.get(1), (Color)arguments.get(2), (Color)arguments.get(3), (Integer)arguments.get(4));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public BufferedImage convertToBufferedImage(ImageData data) 
	{
		ColorModel colorModel = null;
		PaletteData palette = data.palette;
		if (palette.isDirect) {
			colorModel = new DirectColorModel(data.depth, palette.redMask, palette.greenMask, palette.blueMask);
			BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int pixel = data.getPixel(x, y);
					RGB rgb = palette.getRGB(pixel);
					bufferedImage.setRGB(x, y,  rgb.red << 16 | rgb.green << 8 | rgb.blue);
				}
			}
			return bufferedImage;
		} else {
			RGB[] rgbs = palette.getRGBs();
			byte[] red = new byte[rgbs.length];
			byte[] green = new byte[rgbs.length];
			byte[] blue = new byte[rgbs.length];
			for (int i = 0; i < rgbs.length; i++) {
				RGB rgb = rgbs[i];
				red[i] = (byte)rgb.red;
				green[i] = (byte)rgb.green;
				blue[i] = (byte)rgb.blue;
			}
			if (data.transparentPixel != -1) {
				colorModel = new IndexColorModel(data.depth, rgbs.length, red, green, blue, data.transparentPixel);
			} else {
				colorModel = new IndexColorModel(data.depth, rgbs.length, red, green, blue);
			}		
			BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int pixel = data.getPixel(x, y);
					pixelArray[0] = pixel;
					raster.setPixel(x, y, pixelArray);
				}
			}
			return bufferedImage;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ImageData convertToImageData(BufferedImage bufferedImage) 
	{
		if (bufferedImage.getColorModel() instanceof DirectColorModel) 
		{
			DirectColorModel colorModel = (DirectColorModel)bufferedImage.getColorModel();
			PaletteData palette = new PaletteData(colorModel.getRedMask(), colorModel.getGreenMask(), colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF)); 
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha()) {
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
					}
				}
			}
			return data;		
		} 
		else if (bufferedImage.getColorModel() instanceof IndexColorModel) 
		{
			IndexColorModel colorModel = (IndexColorModel)bufferedImage.getColorModel();
			int size = colorModel.getMapSize();
			byte[] reds = new byte[size];
			byte[] greens = new byte[size];
			byte[] blues = new byte[size];
			colorModel.getReds(reds);
			colorModel.getGreens(greens);
			colorModel.getBlues(blues);
			RGB[] rgbs = new RGB[size];
			for (int i = 0; i < rgbs.length; i++) {
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF, blues[i] & 0xFF);
			}
			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}
			return data;
		}
		else
		{
			try
			{							
				// Save a tmp file with the buffered image data and load it back.
				File tempFile = File.createTempFile("convertToImageData", "png");
				
				ImageIO.write(bufferedImage, "png", tempFile);
				
				FileInputStream inputStream = new FileInputStream(tempFile);
				ImageData imageData = new ImageData(inputStream);
				
				tempFile.deleteOnExit();
				
				return imageData;
			}
			catch(Exception e)
			{		
				e.printStackTrace();
			}
		}
		return null;
	}

} //EImagesUtilitiesImpl
