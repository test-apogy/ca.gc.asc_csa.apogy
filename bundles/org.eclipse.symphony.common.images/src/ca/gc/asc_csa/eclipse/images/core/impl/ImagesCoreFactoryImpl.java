/**
 * Canadian Space Agency 2011
 */
package ca.gc.asc_csa.eclipse.images.core.impl;

import ca.gc.asc_csa.eclipse.images.core.*;

import java.awt.Color;
import java.awt.Font;

import java.awt.image.BufferedImage;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.swt.graphics.ImageData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImagesCoreFactoryImpl extends EFactoryImpl implements ImagesCoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImagesCoreFactory init() {
		try {
			ImagesCoreFactory theImagesCoreFactory = (ImagesCoreFactory)EPackage.Registry.INSTANCE.getEFactory(ImagesCorePackage.eNS_URI);
			if (theImagesCoreFactory != null) {
				return theImagesCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImagesCoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagesCoreFactoryImpl() {
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
			case ImagesCorePackage.EIMAGE: return createEImage();
			case ImagesCorePackage.IMAGES_ALBUM: return createImagesAlbum();
			case ImagesCorePackage.URLE_IMAGE: return createURLEImage();
			case ImagesCorePackage.EIMAGES_UTILITIES: return createEImagesUtilities();
			case ImagesCorePackage.IMAGE_SIZE: return createImageSize();
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
			case ImagesCorePackage.IMAGE_ALIGNMENT:
				return createImageAlignmentFromString(eDataType, initialValue);
			case ImagesCorePackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ImagesCorePackage.IMAGE_DATA:
				return createImageDataFromString(eDataType, initialValue);
			case ImagesCorePackage.BUFFERED_IMAGE:
				return createBufferedImageFromString(eDataType, initialValue);
			case ImagesCorePackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case ImagesCorePackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case ImagesCorePackage.FONT:
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
			case ImagesCorePackage.IMAGE_ALIGNMENT:
				return convertImageAlignmentToString(eDataType, instanceValue);
			case ImagesCorePackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ImagesCorePackage.IMAGE_DATA:
				return convertImageDataToString(eDataType, instanceValue);
			case ImagesCorePackage.BUFFERED_IMAGE:
				return convertBufferedImageToString(eDataType, instanceValue);
			case ImagesCorePackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case ImagesCorePackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case ImagesCorePackage.FONT:
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
	public EImage createEImage() {
		EImageImpl eImage = new EImageImpl();
		return eImage;
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
	 * @generated
	 */
	public ImageData createImageDataFromString(EDataType eDataType, String initialValue) {
		return (ImageData)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageDataToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedImage createBufferedImageFromString(EDataType eDataType, String initialValue) {
		return (BufferedImage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferedImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
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
	public ImagesCorePackage getImagesCorePackage() {
		return (ImagesCorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImagesCorePackage getPackage() {
		return ImagesCorePackage.eINSTANCE;
	}

} //ImagesCoreFactoryImpl
