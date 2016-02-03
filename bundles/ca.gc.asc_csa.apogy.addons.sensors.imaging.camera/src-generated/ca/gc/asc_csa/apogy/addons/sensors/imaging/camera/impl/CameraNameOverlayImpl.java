package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraNameOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

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
		return ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_NAME_OVERLAY;
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
