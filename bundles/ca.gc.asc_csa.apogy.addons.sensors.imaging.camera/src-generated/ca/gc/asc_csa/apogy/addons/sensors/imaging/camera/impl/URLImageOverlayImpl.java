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

import java.awt.Graphics2D;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageSizePolicy;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.OverlayAlignment;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.URLImageOverlay;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.images.URLEImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Image Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.URLImageOverlayImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.URLImageOverlayImpl#getImageSizePolicy <em>Image Size Policy</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.URLImageOverlayImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLImageOverlayImpl extends ImageCameraOverlayImpl implements URLImageOverlay {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageSizePolicy() <em>Image Size Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageSizePolicy()
	 * @generated
	 * @ordered
	 */
	protected static final ImageSizePolicy IMAGE_SIZE_POLICY_EDEFAULT = ImageSizePolicy.FIXED_SIZE;
	/**
	 * The cached value of the '{@link #getImageSizePolicy() <em>Image Size Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageSizePolicy()
	 * @generated
	 * @ordered
	 */
	protected ImageSizePolicy imageSizePolicy = IMAGE_SIZE_POLICY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected AbstractEImage image;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLImageOverlayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsImagingCameraPackage.Literals.URL_IMAGE_OVERLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setUrl(String newUrl) 
	{
		setUrlGen(newUrl);		
		
		try
		{
			URLEImage urlEImage = ApogyCommonImagesFactory.eINSTANCE.createURLEImage();
			urlEImage.setUrl(newUrl);
			setImage(urlEImage);
		}
		catch(Throwable t)
		{
			setImage(null);
			t.printStackTrace();
		}
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlGen(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageSizePolicy getImageSizePolicy() {
		return imageSizePolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageSizePolicy(ImageSizePolicy newImageSizePolicy) {
		ImageSizePolicy oldImageSizePolicy = imageSizePolicy;
		imageSizePolicy = newImageSizePolicy == null ? IMAGE_SIZE_POLICY_EDEFAULT : newImageSizePolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY, oldImageSizePolicy, imageSizePolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage getImage() {
		if (image != null && image.eIsProxy()) {
			InternalEObject oldImage = (InternalEObject)image;
			image = (AbstractEImage)eResolveProxy(oldImage);
			if (image != oldImage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE, oldImage, image));
			}
		}
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEImage basicGetImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(AbstractEImage newImage) {
		AbstractEImage oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__URL:
				return getUrl();
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY:
				return getImageSizePolicy();
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE:
				if (resolve) return getImage();
				return basicGetImage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__URL:
				setUrl((String)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY:
				setImageSizePolicy((ImageSizePolicy)newValue);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE:
				setImage((AbstractEImage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY:
				setImageSizePolicy(IMAGE_SIZE_POLICY_EDEFAULT);
				return;
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE:
				setImage((AbstractEImage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE_SIZE_POLICY:
				return imageSizePolicy != IMAGE_SIZE_POLICY_EDEFAULT;
			case ApogyAddonsSensorsImagingCameraPackage.URL_IMAGE_OVERLAY__IMAGE:
				return image != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", imageSizePolicy: ");
		result.append(imageSizePolicy);
		result.append(')');
		return result.toString();
	}

	  @Override
	  public AbstractEImage getOverlay(AbstractCamera camera, OverlayAlignment overlayAlignment, int overlayWidth, int overlayHeight) 
	  {
		  AbstractEImage image = EImagesUtilities.INSTANCE.createTransparentImage(overlayWidth, overlayHeight);

		  // Resize the image if required.
		  AbstractEImage resizedImage = null;
		  if(getImageSizePolicy() != ImageSizePolicy.FIXED_SIZE)
		  {			  
			  double widthScaleFactor = 1.0;
			  double heightScaleFactor = 1.0;
			  
			  switch (getImageSizePolicy().getValue()) 
			  {
					case ImageSizePolicy.ALLOW_RESIZE_HORIZONTAL_VALUE:
						widthScaleFactor = (double) overlayWidth / ((double) getImage().getWidth());
					break;
					
					case ImageSizePolicy.ALLOW_RESIZE_VERTICAL_VALUE:
						heightScaleFactor = (double) overlayHeight /((double) getImage().getHeight());
					break;
		
					case ImageSizePolicy.ALLOW_RESIZE_BOTH_VALUE:
						widthScaleFactor = (double) overlayWidth / ((double) getImage().getWidth());
						heightScaleFactor = (double) overlayHeight /((double) getImage().getHeight());
					break;
					
					default:
					break;
			  }			  			 
			  
			  resizedImage = EImagesUtilities.INSTANCE.resize(getImage(), widthScaleFactor, heightScaleFactor);
		  }
		  else
		  {
			  resizedImage = EImagesUtilities.INSTANCE.copy(getImage());
		  }
		  
		  // Determine where to draw the logo.
		  int x = 0;
		  int y = 0;
		  
		  switch (overlayAlignment.getValue()) 
		  {
		  	case OverlayAlignment.CENTER_VALUE:	
		  		x = (int) Math.floor(((overlayWidth - resizedImage.getWidth()) * 0.5));
		  		y = (int) Math.floor(((overlayHeight - resizedImage.getHeight()) * 0.5));
			break;
			
		  	case OverlayAlignment.LOWER_LEFT_CORNER_VALUE:	
		  		x = 0;
		  		y = overlayHeight - resizedImage.getHeight();
			break;
			
		  	case OverlayAlignment.LOWER_RIGHT_CORNER_VALUE:	
		  		x = overlayWidth - (int) Math.round(resizedImage.getWidth());
		  		y = overlayHeight - (int) Math.round(resizedImage.getHeight());
			break;
			
		  	case OverlayAlignment.UPPER_LEFT_CORNER_VALUE:	
		  		x = 0;
		  		y = 0;
			break;
			
		  	case OverlayAlignment.UPPER_RIGHT_CORNER_VALUE:		 
		  		x = overlayWidth - (int) Math.round(resizedImage.getWidth());
		  		y = 0; 
			break;

		  	default:
			break;
		  }
		  // Draws logo onto transparent image.
		  Graphics2D g2d = image.asBufferedImage().createGraphics();	
		  g2d.drawImage(resizedImage.asBufferedImage(), x, y, null);
		  g2d.dispose();
		  
		  return image;
	  }
} //URLImageOverlayImpl
