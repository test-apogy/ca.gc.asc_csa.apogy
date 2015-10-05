/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging.impl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ImagesCoreFactory;

import ca.gc.space.mrt.sensors.imaging.AzimuthDirection;
import ca.gc.space.mrt.sensors.imaging.ElevationDirection;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.ImagingUtilities;
import ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Utilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ImagingUtilitiesImpl extends MinimalEObjectImpl.Container implements ImagingUtilities 
{
	private static ImagingUtilities instance = null;

	public static ImagingUtilities getInstance() 
	{
		if (instance == null) {
			instance = new ImagingUtilitiesImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingUtilitiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRTSensorsImagingPackage.Literals.IMAGING_UTILITIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double linearConvertToHorizontalAngle(ImageSnapshot imageSnapshot, int horizontalPixelPosition) 
	{		
		double hCenter = ((double) imageSnapshot.getImage().getWidth()) / 2.0;
		double ratio = (hCenter - horizontalPixelPosition) /  ((double) imageSnapshot.getImage().getWidth());		
		double angle = ratio * imageSnapshot.getFieldOfView().getHorizontalFieldOfViewAngle();
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double linearConvertToVerticalAngle(ImageSnapshot imageSnapshot, int verticalPixelPosition) 
	{
		double vCenter = ((double) imageSnapshot.getImage().getHeight()) / 2.0;
		double ratio = (vCenter - verticalPixelPosition) /  ((double) imageSnapshot.getImage().getHeight());		
		double angle = ratio * imageSnapshot.getFieldOfView().getVerticalFieldOfViewAngle();
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbstractEImage getAzimuthElevationOverlay(int imageWidth, int imageHeight, double panAngle, double tiltAngle, double horizontalFOVAngle, double verticalFOVAngle, AzimuthDirection azimuthDirection, ElevationDirection elevationDirection, int angleInterval, String fontName, int fontSize, Color positiveColor, Color negativeColor, int lineWidth) 
	{				
		AbstractEImage abstractImage = EImagesUtilities.INSTANCE.createTransparentImage(imageWidth, imageHeight);

		BufferedImage image = abstractImage.asBufferedImage();
		
		Graphics2D g2d = image.createGraphics();	  	
		Font font = new Font(fontName, Font.BOLD, fontSize);	  
		g2d.setFont(font);
		
		g2d.setStroke(new BasicStroke(lineWidth));	
		g2d.setColor(positiveColor);	
				
		int centerX = (int) Math.round(((double) imageWidth / 2.0));
		int centerY = (int) Math.round(((double) imageHeight / 2.0));
		
		// Finds the left and right azimuths.
		double leftSideAzimuth = 0;
		double rightSideAzimuth = 0;
		if(azimuthDirection == AzimuthDirection.POSITIVE_TOWARD_LEFT)
		{
			leftSideAzimuth = panAngle + (horizontalFOVAngle / 2.0);
			rightSideAzimuth = panAngle - (horizontalFOVAngle / 2.0);
		}
		else
		{
			leftSideAzimuth = panAngle - (horizontalFOVAngle / 2.0);
			rightSideAzimuth = panAngle + (horizontalFOVAngle / 2.0);
		}
		
		// Finds the top and bottom tilt.
		double topSideElevation = 0;
		double bottomSideElevation = 0;
		if(elevationDirection == ElevationDirection.POSITIVE_UP)
		{
			topSideElevation = tiltAngle + (verticalFOVAngle / 2.0);
			bottomSideElevation = tiltAngle - (verticalFOVAngle / 2.0);
		}
		else
		{
			topSideElevation = tiltAngle - (verticalFOVAngle / 2.0);
			bottomSideElevation = tiltAngle + (verticalFOVAngle / 2.0);
		}				
		
		double pixelPerAzimuthDegree = ( (double) imageWidth / (double) horizontalFOVAngle);
		double pixelPerElevationDegree = ( (double) imageHeight / (double) verticalFOVAngle);
					

		// HORIZONTAL
		
		// Finds the closest integer on the left side		
		int leftMostAngle = (int) Math.round(leftSideAzimuth);
		
		// Adds horizontal ticks
		double azimuth = leftMostAngle;
		
		boolean done = false;		
		while (!done)
		{			
			// Selects the color.
			if(azimuth >= 0) g2d.setColor(positiveColor);
			else g2d.setColor(negativeColor);
					
			int x = 0;
		
			if(azimuthDirection == AzimuthDirection.POSITIVE_TOWARD_LEFT)
			{
				x = (int) Math.round((leftSideAzimuth - azimuth) * pixelPerAzimuthDegree);
			}
			else
			{				
				x = (int) Math.round((azimuth - leftSideAzimuth) * pixelPerAzimuthDegree);
			}
			
			if(Math.IEEEremainder(azimuth, (double) angleInterval) == 0.0)
			{
				String text = Double.toString(azimuth);
				
				FontMetrics fontMetrics = g2d.getFontMetrics(font);
				Rectangle2D textArea = fontMetrics.getStringBounds(text, g2d);
										
				int xOffset = Math.round(((float) textArea.getWidth() / 2.0f));
				
				g2d.drawLine(x, centerY - 10, x , centerY + 10);								
				g2d.drawString(text, x - xOffset, centerY + 10 + (int) textArea.getHeight());				
			}
			else
			{
				g2d.drawLine(x, centerY - 5, x , centerY + 5);
			}
			
			// Increment azimuth and checks is azimuth is done.			
			if(azimuthDirection == AzimuthDirection.POSITIVE_TOWARD_LEFT)
			{
				azimuth -= 1;
				done = azimuth <= rightSideAzimuth;
			}
			else
			{
				azimuth += 1;
				done = azimuth >= rightSideAzimuth;
			}
		}		
		
		int azimuthZero = -1;
		
		// Draws the horizontal line.
		if(leftSideAzimuth >= 0)
		{
			// If the entire interval is positive
			if(rightSideAzimuth >=0)
			{
				g2d.setColor(positiveColor);
				g2d.drawLine(0, centerY, imageWidth, centerY);	
			}
			else
			{
				// Find where zero is in pixels.
				azimuthZero = (int) (pixelPerAzimuthDegree * leftSideAzimuth);

				// Left side is Positive
				g2d.setColor(positiveColor);
				g2d.drawLine(0, centerY, azimuthZero, centerY);
				
				// Right Side is negative
				g2d.setColor(negativeColor);
				g2d.drawLine(azimuthZero, centerY, imageWidth, centerY);				
			}
		}
		else
		{
			if(rightSideAzimuth <= 0)
			{			
				// The entire interval is negative
				g2d.setColor(negativeColor);
				g2d.drawLine(0, centerY, imageWidth, centerY);
			}
			else
			{
				// Find where zero is in pixels.
				azimuthZero = (int) Math.abs((pixelPerAzimuthDegree * leftSideAzimuth));

				// Left side is Negative
				g2d.setColor(negativeColor);
				g2d.drawLine(0, centerY, azimuthZero, centerY);
				
				// Right Side is Positive
				g2d.setColor(positiveColor);
				g2d.drawLine(azimuthZero, centerY, imageWidth, centerY);	
			}
		}
		
		// VERTICAL
		
		int topMostAngle = (int) Math.round(topSideElevation);
		
		// Adds vertical ticks		
		double elevation = topMostAngle;	
		
		done = false;				
		while(!done)
		{		
			// Selects the color.
			if(elevation >= 0) g2d.setColor(positiveColor);
			else g2d.setColor(negativeColor);
						
			int y = 0;
			if(elevationDirection == ElevationDirection.POSITIVE_UP)
			{
				y = (int) Math.round((topSideElevation - elevation) * pixelPerElevationDegree);
			}
			else
			{
				y = (int) Math.round((elevation - topSideElevation) * pixelPerElevationDegree);
			}
			
			if(Math.IEEEremainder(elevation, (double) angleInterval) == 0.0)
			{
				String text = Double.toString(elevation);
				
				FontMetrics fontMetrics = g2d.getFontMetrics(font);
				Rectangle2D textArea = fontMetrics.getStringBounds(text, g2d);
				
				int xOffset = (int) textArea.getWidth() + 14;
				int yOffset = (int) (textArea.getHeight() / 2.0f);
				
				g2d.drawLine(centerX -10, y, centerX +10 , y);
				g2d.drawString(text, centerX - xOffset, y + yOffset);				
			}
			else
			{
				g2d.drawLine(centerX - 5, y, centerX  + 5 , y);
			}
			
			// Increment elevation and checks is azimuth is done.			
			if(elevationDirection == ElevationDirection.POSITIVE_UP)
			{
				elevation -= 1;
				done = elevation <= bottomSideElevation;
			}
			else
			{
				elevation += 1;
				done = elevation >= bottomSideElevation;
			}
						
		}
		
		// Draws the vertical line.
		if(topSideElevation >= 0)
		{
			// If the entire interval is positive
			if(bottomSideElevation >= 0)
			{
				g2d.setColor(positiveColor);
				g2d.drawLine(centerX, 0, centerX, imageHeight);
			}
			else
			{
				int elevationZero = (int) Math.round(pixelPerElevationDegree * topSideElevation);
				
				g2d.setColor(positiveColor);
				g2d.drawLine(centerX, 0, centerX, elevationZero);
				
				g2d.setColor(negativeColor);
				g2d.drawLine(centerX, elevationZero, centerX, imageHeight);
			}
		}
		else
		{
			if(bottomSideElevation >= 0)
			{
				int elevationZero = (int) Math.abs(pixelPerElevationDegree * topSideElevation);
				
				g2d.setColor(negativeColor);
				g2d.drawLine(centerX, 0, centerX, elevationZero);
				
				g2d.setColor(positiveColor);
				g2d.drawLine(centerX, elevationZero, centerX, imageHeight);
			}
			else
			{
				// Entire range is negative
				g2d.setColor(negativeColor);
				g2d.drawLine(centerX, 0, centerX, imageHeight);
			}
		}		
				
		EImage result = ImagesCoreFactory.eINSTANCE.createEImage();
		result.setImageContent(image);		
		g2d.dispose(); 
				
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MRTSensorsImagingPackage.IMAGING_UTILITIES___LINEAR_CONVERT_TO_HORIZONTAL_ANGLE__IMAGESNAPSHOT_INT:
				return linearConvertToHorizontalAngle((ImageSnapshot)arguments.get(0), (Integer)arguments.get(1));
			case MRTSensorsImagingPackage.IMAGING_UTILITIES___LINEAR_CONVERT_TO_VERTICAL_ANGLE__IMAGESNAPSHOT_INT:
				return linearConvertToVerticalAngle((ImageSnapshot)arguments.get(0), (Integer)arguments.get(1));
			case MRTSensorsImagingPackage.IMAGING_UTILITIES___GET_AZIMUTH_ELEVATION_OVERLAY__INT_INT_DOUBLE_DOUBLE_DOUBLE_DOUBLE_AZIMUTHDIRECTION_ELEVATIONDIRECTION_INT_STRING_INT_COLOR_COLOR_INT:
				return getAzimuthElevationOverlay((Integer)arguments.get(0), (Integer)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4), (Double)arguments.get(5), (AzimuthDirection)arguments.get(6), (ElevationDirection)arguments.get(7), (Integer)arguments.get(8), (String)arguments.get(9), (Integer)arguments.get(10), (Color)arguments.get(11), (Color)arguments.get(12), (Integer)arguments.get(13));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImagingUtilitiesImpl
