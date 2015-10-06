/**
 * Canadian Space Agency 2011
 */
package org.eclipse.symphony.common.images;

import java.awt.image.BufferedImage;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.symphony.common.images.impl.EImagesUtilitiesImpl;

import java.awt.Color;
import java.awt.Font;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EImages Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.images.ImagesCorePackage#getEImagesUtilities()
 * @model
 * @generated
 */
public interface EImagesUtilities extends EObject 
{
	public static EImagesUtilities INSTANCE = EImagesUtilitiesImpl.getInstance();
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2011";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model originalImageRequired="true"
	 * @generated
	 */
	AbstractEImage copy(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage convertToGrayScale(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage resize(AbstractEImage originalImage, double scaleFactor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model originalImageRequired="true" widthScaleFactorRequired="true" heightScaleFactorRequired="true"
	 * @generated
	 */
	AbstractEImage resize(AbstractEImage originalImage, double widthScaleFactor, double heightScaleFactor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model originalImageRequired="true" newWidthRequired="true" newHeightRequired="true"
	 * @generated
	 */
	AbstractEImage resize(AbstractEImage originalImage, int newWidth, int newHeight);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model widthRequired="true" heightRequired="true"
	 * @generated
	 */
	AbstractEImage createTransparentImage(int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.images.Exception" destinationFilePathRequired="true"
	 * @generated
	 */
	void saveImageAsJPEG(String destinationFilePath, AbstractEImage image) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.images.Exception" destinationFilePathRequired="true"
	 * @generated
	 */
	void saveImageAsPNG(String destinationFilePath, AbstractEImage image) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyOverlay(AbstractEImage originalImage, AbstractEImage overlayImage, boolean allowOverlayResize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage flipHorizontal(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage flipVertical(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage rotate(AbstractEImage originalImage, double angle, boolean enableImageResize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage translate(AbstractEImage originalImage, int widthTranslation, int heightTranslation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imagesDataType="org.eclipse.symphony.common.images.List<? extends org.eclipse.symphony.common.images.AbstractEImage>" imagesMany="false"
	 * @generated
	 */
	ImageSize getAllEncompassingImageSize(List<? extends AbstractEImage> images);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imagesDataType="org.eclipse.symphony.common.images.List<? extends org.eclipse.symphony.common.images.AbstractEImage>" imagesMany="false"
	 * @generated
	 */
	AbstractEImage superPoseImages(List<? extends AbstractEImage> images, boolean allowImageResize, ImageAlignment alignment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage superPoseImages(AbstractEImage imageA, AbstractEImage imageB, boolean allowImageResize, ImageAlignment alignment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage addBorder(AbstractEImage originalImage, int borderWidth, int red, int green, int blue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets a sub image from a specified image. Note that the widthOffset and heightOffset are relative to the upper left corner of the image.
	 * <!-- end-model-doc -->
	 * @model exceptions="org.eclipse.symphony.common.images.Exception"
	 * @generated
	 */
	AbstractEImage getSubImage(AbstractEImage originalImage, int widthOffset, int heightOffset, int subImageWidth, int subImageHeight) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.images.BufferedImage" imageDataDataType="org.eclipse.symphony.common.images.ImageData"
	 * @generated
	 */
	BufferedImage convertToBufferedImage(ImageData imageData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.images.ImageData" bufferedImageDataType="org.eclipse.symphony.common.images.BufferedImage"
	 * @generated
	 */
	ImageData convertToImageData(BufferedImage bufferedImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model widthRequired="true" heightRequired="true"
	 * @generated
	 */
	AbstractEImage createUniformColorImage(int width, int height, int red, int green, int blue, int alpha);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyAlpha(AbstractEImage originalImage, float alpha);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyEdgeFilter(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyContrastAndBrightnessFilter(AbstractEImage originalImage, double contrast, double brightness);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyExposureFilter(AbstractEImage originalImage, double exposure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyInvertFilter(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyRescaleFilter(AbstractEImage originalImage, double scale);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractEImage applyGainFilter(AbstractEImage originalImage, double gain, double bias);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model fontDataType="org.eclipse.symphony.common.images.Font" textColorDataType="org.eclipse.symphony.common.images.Color" backgroundColorDataType="org.eclipse.symphony.common.images.Color"
	 * @generated
	 */
	AbstractEImage createTextImage(String text, Font font, Color textColor, Color backgroundColor, int borderWidth);

} // EImagesUtilities