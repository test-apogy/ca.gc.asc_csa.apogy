package ca.gc.asc_csa.apogy.addons.ros.imaging;
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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.graphics.ImageData;

import ca.gc.asc_csa.apogy.common.images.EImage;

import org.ros.node.ConnectedNode;

import ca.gc.asc_csa.apogy.addons.ros.imaging.impl.ApogyAddonsROSImagingFacadeImpl;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.ros.imaging.ApogyAddonsROSImagingPackage#getApogyAddonsROSImagingFacade()
 * @model
 * @generated
 */
public interface ApogyAddonsROSImagingFacade extends EObject {
	
	public static final ApogyAddonsROSImagingFacade INSTANCE = ApogyAddonsROSImagingFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rosImageDataType="ca.gc.asc_csa.apogy.addons.ros.imaging.Image" rosImageUnique="false"
	 * @generated
	 */
	EImage convertToEImage(Image rosImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" compressedImageDataType="ca.gc.asc_csa.apogy.addons.ros.imaging.CompressedImage" compressedImageUnique="false"
	 * @generated
	 */
	EImage convertToEImage(CompressedImage compressedImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.imaging.CompressedImage" unique="false" eImageUnique="false" connectedNodeDataType="ca.gc.asc_csa.apogy.addons.ros.imaging.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
	CompressedImage convertToCompressedImage(EImage eImage, ConnectedNode connectedNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.addons.ros.imaging.CompressedImage" unique="false" imageDataDataType="ca.gc.asc_csa.apogy.common.images.ImageData" imageDataUnique="false" connectedNodeDataType="ca.gc.asc_csa.apogy.addons.ros.imaging.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
	CompressedImage convertToCompressedImage(ImageData imageData, ConnectedNode connectedNode);

} // ApogyAddonsROSImagingFacade
