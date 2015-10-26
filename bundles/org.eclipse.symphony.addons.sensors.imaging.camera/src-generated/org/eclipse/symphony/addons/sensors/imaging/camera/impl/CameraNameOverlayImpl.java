/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.sensors.imaging.AbstractCamera;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraNameOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Name Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CameraNameOverlayImpl extends AbstractTextOverlayImpl implements CameraNameOverlay
{
	
	public static final String DEFAULT_DISPLAYED_TEXT = "<?>";	  
	private String stringToDisplay = DEFAULT_DISPLAYED_TEXT;
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraNameOverlayImpl()
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
		return SymphonyCameraToolsPackage.Literals.CAMERA_NAME_OVERLAY;
	}
  
  @Override
  public String getDisplayedString() 
  {
	  // Sets the camera name
	  AbstractCamera camera = getCamera();
	  stringToDisplay = DEFAULT_DISPLAYED_TEXT;
	  
	  if(camera != null)
	  {
		  stringToDisplay = camera.getName();
		  if(stringToDisplay == null || stringToDisplay.length() == 0)
		  {
			  stringToDisplay = DEFAULT_DISPLAYED_TEXT;
		  }
	  }
	  
	  return stringToDisplay;
  }
  		
		
  protected AbstractCamera getCamera()
  {
	  AbstractCamera camera = null;
	  
	  if(getCameraOverlayList() != null)
	  {
		  CameraViewConfiguration cvc = getCameraOverlayList().getCameraViewConfiguration();
		  if(cvc != null)
		  {
			  camera = cvc.getCamera();
		  }
	  }
	  
	  return camera;
  }
  
  protected InvocatorSession getSession()
  {
	  if(getCameraOverlayList() != null)
	  {
		  if(getCameraOverlayList().getCameraViewConfiguration() != null)
		  {
			  if(getCameraOverlayList().getCameraViewConfiguration().getToolList() != null)
			  {
				  if(getCameraOverlayList().getCameraViewConfiguration().getToolList().eContainer() instanceof InvocatorSession)
				  {
					  return (InvocatorSession) getCameraOverlayList().getCameraViewConfiguration().getToolList().eContainer();
				  }
			  }
		  }
	  }
	  
	  return null;
  }   
} //CameraNameOverlayImpl
