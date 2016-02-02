package ca.gc.asc_csa.apogy.common.images;
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

import java.awt.Color;
import java.awt.Font;

import java.awt.image.BufferedImage;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.graphics.ImageData;
import ca.gc.asc_csa.apogy.common.images.impl.EImagesUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EImages Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getEImagesUtilities()
 * @model
 * @generated
 */
public interface EImagesUtilities extends EObject
{
	public static EImagesUtilities INSTANCE = EImagesUtilitiesImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" originalImageRequired="true"
	 * @generated
	 */
	AbstractEImage copy(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false"
	 * @generated
	 */
	AbstractEImage convertToGrayScale(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" scaleFactorUnique="false"
	 * @generated
	 */
	AbstractEImage resize(AbstractEImage originalImage, double scaleFactor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" originalImageRequired="true" widthScaleFactorUnique="false" widthScaleFactorRequired="true" heightScaleFactorUnique="false" heightScaleFactorRequired="true"
	 * @generated
	 */
	AbstractEImage resize(AbstractEImage originalImage, double widthScaleFactor, double heightScaleFactor);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" originalImageRequired="true" newWidthUnique="false" newWidthRequired="true" newHeightUnique="false" newHeightRequired="true"
	 * @generated
	 */
	AbstractEImage resize(AbstractEImage originalImage, int newWidth, int newHeight);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" widthUnique="false" widthRequired="true" heightUnique="false" heightRequired="true"
	 * @generated
	 */
	AbstractEImage createTransparentImage(int width, int height);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.images.Exception" destinationFilePathUnique="false" destinationFilePathRequired="true" imageUnique="false"
	 * @generated
	 */
	void saveImageAsJPEG(String destinationFilePath, AbstractEImage image) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.images.Exception" destinationFilePathUnique="false" destinationFilePathRequired="true" imageUnique="false"
	 * @generated
	 */
	void saveImageAsPNG(String destinationFilePath, AbstractEImage image) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" overlayImageUnique="false" allowOverlayResizeUnique="false"
	 * @generated
	 */
	AbstractEImage applyOverlay(AbstractEImage originalImage, AbstractEImage overlayImage, boolean allowOverlayResize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false"
	 * @generated
	 */
	AbstractEImage flipHorizontal(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false"
	 * @generated
	 */
	AbstractEImage flipVertical(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" angleUnique="false" enableImageResizeUnique="false"
	 * @generated
	 */
	AbstractEImage rotate(AbstractEImage originalImage, double angle, boolean enableImageResize);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" widthTranslationUnique="false" heightTranslationUnique="false"
	 * @generated
	 */
	AbstractEImage translate(AbstractEImage originalImage, int widthTranslation, int heightTranslation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" imagesDataType="ca.gc.asc_csa.apogy.common.images.List<? extends ca.gc.asc_csa.apogy.common.images.AbstractEImage>" imagesUnique="false" imagesMany="false"
	 * @generated
	 */
	ImageSize getAllEncompassingImageSize(List<? extends AbstractEImage> images);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" imagesDataType="ca.gc.asc_csa.apogy.common.images.List<? extends ca.gc.asc_csa.apogy.common.images.AbstractEImage>" imagesUnique="false" imagesMany="false" allowImageResizeUnique="false" alignmentUnique="false"
	 * @generated
	 */
	AbstractEImage superPoseImages(List<? extends AbstractEImage> images, boolean allowImageResize, ImageAlignment alignment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" imageAUnique="false" imageBUnique="false" allowImageResizeUnique="false" alignmentUnique="false"
	 * @generated
	 */
	AbstractEImage superPoseImages(AbstractEImage imageA, AbstractEImage imageB, boolean allowImageResize, ImageAlignment alignment);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" borderWidthUnique="false" redUnique="false" greenUnique="false" blueUnique="false"
	 * @generated
	 */
	AbstractEImage addBorder(AbstractEImage originalImage, int borderWidth, int red, int green, int blue);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gets a sub image from a specified image. Note that the
	 * widthOffset and heightOffset are relative to the upper
	 * left corner of the image.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.images.Exception" originalImageUnique="false" widthOffsetUnique="false" heightOffsetUnique="false" subImageWidthUnique="false" subImageHeightUnique="false"
	 * @generated
	 */
	AbstractEImage getSubImage(AbstractEImage originalImage, int widthOffset, int heightOffset, int subImageWidth, int subImageHeight) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.images.BufferedImage" unique="false" imageDataDataType="ca.gc.asc_csa.apogy.common.images.ImageData" imageDataUnique="false"
	 * @generated
	 */
	BufferedImage convertToBufferedImage(ImageData imageData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.images.ImageData" unique="false" bufferedImageDataType="ca.gc.asc_csa.apogy.common.images.BufferedImage" bufferedImageUnique="false"
	 * @generated
	 */
	ImageData convertToImageData(BufferedImage bufferedImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" widthUnique="false" widthRequired="true" heightUnique="false" heightRequired="true" redUnique="false" greenUnique="false" blueUnique="false" alphaUnique="false"
	 * @generated
	 */
	AbstractEImage createUniformColorImage(int width, int height, int red, int green, int blue, int alpha);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" alphaUnique="false"
	 * @generated
	 */
	AbstractEImage applyAlpha(AbstractEImage originalImage, float alpha);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false"
	 * @generated
	 */
	AbstractEImage applyEdgeFilter(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" contrastUnique="false" brightnessUnique="false"
	 * @generated
	 */
	AbstractEImage applyContrastAndBrightnessFilter(AbstractEImage originalImage, double contrast, double brightness);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" exposureUnique="false"
	 * @generated
	 */
	AbstractEImage applyExposureFilter(AbstractEImage originalImage, double exposure);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false"
	 * @generated
	 */
	AbstractEImage applyInvertFilter(AbstractEImage originalImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" scaleUnique="false"
	 * @generated
	 */
	AbstractEImage applyRescaleFilter(AbstractEImage originalImage, double scale);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalImageUnique="false" gainUnique="false" biasUnique="false"
	 * @generated
	 */
	AbstractEImage applyGainFilter(AbstractEImage originalImage, double gain, double bias);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" textUnique="false" fontDataType="ca.gc.asc_csa.apogy.common.images.Font" fontUnique="false" textColorDataType="ca.gc.asc_csa.apogy.common.images.Color" textColorUnique="false" backgroundColorDataType="ca.gc.asc_csa.apogy.common.images.Color" backgroundColorUnique="false" borderWidthUnique="false"
	 * @generated
	 */
	AbstractEImage createTextImage(String text, Font font, Color textColor, Color backgroundColor, int borderWidth);

} // EImagesUtilities
