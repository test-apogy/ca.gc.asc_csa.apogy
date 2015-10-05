/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import java.awt.Graphics2D;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ImagesCoreFactory;
import org.eclipse.symphony.common.images.URLEImage;

import ca.gc.asc_csa.symphony.tools.camera.OverlayAlignment;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyLogoOverlay;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symphony Logo Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SymphonyLogoOverlayImpl extends ImageCameraOverlayImpl implements SymphonyLogoOverlay
{
	private AbstractEImage logoImage = null;
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SymphonyLogoOverlayImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyCameraToolsPackage.Literals.SYMPHONY_LOGO_OVERLAY;
	}

  @Override
  public AbstractEImage getOverlay(AbstractCamera camera, OverlayAlignment overlayAlignment, int overlayWidth, int overlayHeight) 
  {
	  AbstractEImage image = EImagesUtilities.INSTANCE.createTransparentImage(overlayWidth, overlayHeight);

	  // Resize the logo.	  
	  double widthScaleFactor = (double) overlayWidth / (4 * (double) getLogoImage().getWidth());
	  double heightScaleFactor = (double) overlayHeight /(4 * (double) getLogoImage().getHeight());
	  double scaleFactor = 1.0;
	  if(widthScaleFactor < heightScaleFactor)
	  {
		  scaleFactor = widthScaleFactor;
	  }
	  else
	  {
		  scaleFactor = heightScaleFactor;
	  }
	  
	  AbstractEImage resizedLogo = EImagesUtilities.INSTANCE.resize(getLogoImage(), scaleFactor);
	  
	  // Determine where to draw the logo.
	  int x = 0;
	  int y = 0;
	  
	  switch (overlayAlignment.getValue()) 
	  {
	  	case OverlayAlignment.CENTER_VALUE:	
	  		x = (int) Math.floor(((overlayWidth - resizedLogo.getWidth()) * 0.5));
	  		y = (int) Math.floor(((overlayHeight - resizedLogo.getHeight()) * 0.5));
		break;
		
	  	case OverlayAlignment.LOWER_LEFT_CORNER_VALUE:	
	  		x = 0;
	  		y = overlayHeight - resizedLogo.getHeight();
		break;
		
	  	case OverlayAlignment.LOWER_RIGHT_CORNER_VALUE:	
	  		x = overlayWidth - (int) Math.round(resizedLogo.getWidth());
	  		y = overlayHeight - (int) Math.round(resizedLogo.getHeight());
		break;
		
	  	case OverlayAlignment.UPPER_LEFT_CORNER_VALUE:	
	  		x = 0;
	  		y = 0;
		break;
		
	  	case OverlayAlignment.UPPER_RIGHT_CORNER_VALUE:		 
	  		x = overlayWidth - (int) Math.round(resizedLogo.getWidth());
	  		y = 0; 
		break;

	  	default:
		break;
	  }
	  // Draws logo onto transparent image.
	  Graphics2D g2d = image.asBufferedImage().createGraphics();	
	  g2d.drawImage(resizedLogo.asBufferedImage(), x, y, null);
	  g2d.dispose();
	  
	  return image;
  }
  
  protected AbstractEImage getLogoImage()
  {
	  if(logoImage == null)
	  {
		  URLEImage urlImage = ImagesCoreFactory.eINSTANCE.createURLEImage();
		  urlImage.setUrl("platform:/plugin/ca.gc.asc_csa.symphony.tools.camera/images/SymphonyLogo.gif");		  		  
		  logoImage = urlImage;
	  }
	  
	  return logoImage;
  }
} //SymphonyLogoOverlayImpl
