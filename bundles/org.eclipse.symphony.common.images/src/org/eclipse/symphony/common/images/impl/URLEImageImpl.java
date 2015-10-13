/**
 * Canadian Space Agency 2011
 */
package org.eclipse.symphony.common.images.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.images.Activator;
import org.eclipse.symphony.common.images.ImagesCorePackage;
import org.eclipse.symphony.common.images.URLEImage;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URLE Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.images.impl.URLEImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.images.impl.URLEImageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.images.impl.URLEImageImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLEImageImpl extends MinimalEObjectImpl.Container implements URLEImage 
{
	private boolean dirty = true;
	private BufferedImage bufferedImage = null;
	
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLEImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagesCorePackage.Literals.URLE_IMAGE;
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
		dirty = true;
		setUrlGen(newUrl); 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlGen(String newUrl) 
	{
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagesCorePackage.URLE_IMAGE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public BufferedImage asBufferedImage() 
	{
		if(dirty || bufferedImage == null)
		{
			bufferedImage = loadBufferedImage();
		}
		
		return bufferedImage;
	}

	@Override
	public int getWidth() 
	{		
		if(asBufferedImage() != null)
		{
			return asBufferedImage().getWidth();
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagesCorePackage.URLE_IMAGE__WIDTH, oldWidth, width));
	}

	@Override
	public int getHeight() 
	{
		if(asBufferedImage() != null)
		{
			return asBufferedImage().getHeight();
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagesCorePackage.URLE_IMAGE__HEIGHT, oldHeight, height));
	}	
	
	protected BufferedImage loadBufferedImage()
	{
		BufferedImage bufferedImage = null;
		try
		{
			URL url = new URL(getUrl());
			File tempFile = copyURLContent(url);
			bufferedImage = ImageIO.read(tempFile);
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
			
			Logger.INSTANCE.log(Activator.ID, this, "Error occured while loading image data from <" + getUrl() + ">!", EventSeverity.ERROR, ex);			
			bufferedImage = null;
		}
				
		return bufferedImage;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImagesCorePackage.URLE_IMAGE__WIDTH:
				return getWidth();
			case ImagesCorePackage.URLE_IMAGE__HEIGHT:
				return getHeight();
			case ImagesCorePackage.URLE_IMAGE__URL:
				return getUrl();
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
			case ImagesCorePackage.URLE_IMAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ImagesCorePackage.URLE_IMAGE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ImagesCorePackage.URLE_IMAGE__URL:
				setUrl((String)newValue);
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
			case ImagesCorePackage.URLE_IMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ImagesCorePackage.URLE_IMAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ImagesCorePackage.URLE_IMAGE__URL:
				setUrl(URL_EDEFAULT);
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
			case ImagesCorePackage.URLE_IMAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ImagesCorePackage.URLE_IMAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ImagesCorePackage.URLE_IMAGE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImagesCorePackage.URLE_IMAGE___AS_BUFFERED_IMAGE:
				return asBufferedImage();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
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
} //URLEImageImpl
