/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;

import java.awt.Graphics2D;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.OverlayAlignment;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyLogoOverlay;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.URLEImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apogy Logo Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyLogoOverlayImpl extends ImageCameraOverlayImpl implements ApogyLogoOverlay
{
	private AbstractEImage logoImage = null;
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyLogoOverlayImpl()
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
		return ApogyAddonsSensorsImagingCameraPackage.Literals.APOGY_LOGO_OVERLAY;
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
		  URLEImage urlImage = ApogyCommonImagesFactory.eINSTANCE.createURLEImage();
		  urlImage.setUrl("platform:/plugin/ca.gc.asc_csa.apogy.addons.sensors.imaging.camera/images/ApogyLogo.gif");		  		  
		  logoImage = urlImage;
	  }
	  
	  return logoImage;
  }
} //ApogyLogoOverlayImpl
