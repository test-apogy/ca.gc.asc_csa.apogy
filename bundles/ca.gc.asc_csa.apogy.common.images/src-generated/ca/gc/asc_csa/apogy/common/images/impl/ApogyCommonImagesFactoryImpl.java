/**
 * Canadian Space Agency 2011
 */
package org.eclipse.symphony.common.images.impl;


import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.symphony.common.images.Activator;
import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.images.ImageAlignment;
import org.eclipse.symphony.common.images.ImageSize;
import org.eclipse.symphony.common.images.ImagesAlbum;
import org.eclipse.symphony.common.images.Symphony__CommonImagesFactory;
import org.eclipse.symphony.common.images.Symphony__CommonImagesPackage;
import org.eclipse.symphony.common.images.URLEImage;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonImagesFactoryImpl extends EFactoryImpl implements Symphony__CommonImagesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonImagesFactory init() {
		try {
			Symphony__CommonImagesFactory theSymphony__CommonImagesFactory = (Symphony__CommonImagesFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonImagesPackage.eNS_URI);
			if (theSymphony__CommonImagesFactory != null) {
				return theSymphony__CommonImagesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonImagesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonImagesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__CommonImagesPackage.EIMAGE: return createEImage();
			case Symphony__CommonImagesPackage.IMAGES_ALBUM: return createImagesAlbum();
			case Symphony__CommonImagesPackage.URLE_IMAGE: return createURLEImage();
			case Symphony__CommonImagesPackage.EIMAGES_UTILITIES: return createEImagesUtilities();
			case Symphony__CommonImagesPackage.IMAGE_SIZE: return createImageSize();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonImagesPackage.IMAGE_ALIGNMENT:
				return createImageAlignmentFromString(eDataType, initialValue);
			case Symphony__CommonImagesPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case Symphony__CommonImagesPackage.IMAGE_DATA:
				return createImageDataFromString(eDataType, initialValue);
			case Symphony__CommonImagesPackage.BUFFERED_IMAGE:
				return createBufferedImageFromString(eDataType, initialValue);
			case Symphony__CommonImagesPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case Symphony__CommonImagesPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case Symphony__CommonImagesPackage.FONT:
				return createFontFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonImagesPackage.IMAGE_ALIGNMENT:
				return convertImageAlignmentToString(eDataType, instanceValue);
			case Symphony__CommonImagesPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case Symphony__CommonImagesPackage.IMAGE_DATA:
				return convertImageDataToString(eDataType, instanceValue);
			case Symphony__CommonImagesPackage.BUFFERED_IMAGE:
				return convertBufferedImageToString(eDataType, instanceValue);
			case Symphony__CommonImagesPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case Symphony__CommonImagesPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case Symphony__CommonImagesPackage.FONT:
				return convertFontToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagesAlbum createImagesAlbum() {
		ImagesAlbumImpl imagesAlbum = new ImagesAlbumImpl();
		return imagesAlbum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLEImage createURLEImage() {
		URLEImageImpl urleImage = new URLEImageImpl();
		return urleImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EImage createEImage() {
		EImageImpl eImage = new EImageImpl();
		return eImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EImagesUtilities createEImagesUtilities() {
		EImagesUtilitiesImpl eImagesUtilities = new EImagesUtilitiesImpl();
		return eImagesUtilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageSize createImageSize() {
		ImageSizeImpl imageSize = new ImageSizeImpl();
		return imageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageAlignment createImageAlignmentFromString(EDataType eDataType, String initialValue) {
		ImageAlignment result = ImageAlignment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageAlignmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonImagesPackage getPackage() {
		return Symphony__CommonImagesPackage.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ImageData createImageDataFromString(EDataType eDataType, String initialValue)
	{
		// Extract the byte array from the string encoded version.		
		byte[] data = Base64.decode(initialValue);
		
		// Creates an input stream to be read by the ImageLoader.
		ByteArrayInputStream inputStream = new ByteArrayInputStream(data);	
		
		// Loads the ImageData from the input stream.
		ImageLoader loader = new ImageLoader();
		ImageData imageData = loader.load(inputStream)[0];
		
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String convertImageDataToString(EDataType eDataType, Object instanceValue)
	{
		ImageData imageData = (ImageData) instanceValue;

		// Creates an ImageLoader that contains the ImageData.
		ImageLoader loader = new ImageLoader();
		loader.data = new ImageData[]{imageData};
		
		// Writes the content of the ImageLoader to an output stream. 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();	
		loader.save(outputStream, SWT.IMAGE_JPEG);
		
		// Encode the output stream byte array to a XML compatible string.
		String data = Base64.encode(outputStream.toByteArray());
		
		return data;						
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public BufferedImage createBufferedImageFromString(EDataType eDataType, String initialValue) 
	{		
		// Extract the byte array from the string encoded version.		
		byte[] data = Base64.decode(initialValue);
		
		// Creates an input stream to be read by the ImageLoader.
		ByteArrayInputStream inputStream = new ByteArrayInputStream(data);	
		
		try
		{
			BufferedImage bufferedImage = javax.imageio.ImageIO.read(inputStream);
			return bufferedImage;
		}
		catch(Exception e)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to load BufferedImage from string !", EventSeverity.ERROR, e);
			return null;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String convertBufferedImageToString(EDataType eDataType, Object instanceValue) 
	{
		try
		{
			BufferedImage bufferedImage = (BufferedImage) instanceValue;
					
			// Writes the content of the BufferedImage to an output stream. 
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();	
			javax.imageio.ImageIO.write(bufferedImage, "png", outputStream);
			
			// Encode the output stream byte array to a XML compatible string.
			String data = Base64.encode(outputStream.toByteArray());
			
			return data;
		}
		catch(Exception e)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to convert BufferedImage to string !", EventSeverity.ERROR, e);
			
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) 
	{
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		return (Color)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Font createFontFromString(EDataType eDataType, String initialValue) {
		return (Font)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonImagesPackage getSymphony__CommonImagesPackage() {
		return (Symphony__CommonImagesPackage)getEPackage();
	}	
} //Symphony__CommonImagesFactoryImpl
