/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.imaging;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.swt.graphics.ImageData;

import org.eclipse.symphony.common.images.EImage;

import org.ros.node.ConnectedNode;

import org.eclipse.symphony.addons.ros.imaging.impl.Symphony__AddonsROSImagingFacadeImpl;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.ros.imaging.Symphony__AddonsROSImagingPackage#getSymphony__AddonsROSImagingFacade()
 * @model
 * @generated
 */
public interface Symphony__AddonsROSImagingFacade extends EObject {
	
	public static final Symphony__AddonsROSImagingFacade INSTANCE = Symphony__AddonsROSImagingFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" rosImageDataType="org.eclipse.symphony.addons.ros.imaging.Image" rosImageUnique="false"
	 * @generated
	 */
	EImage convertToEImage(Image rosImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" compressedImageDataType="org.eclipse.symphony.addons.ros.imaging.CompressedImage" compressedImageUnique="false"
	 * @generated
	 */
	EImage convertToEImage(CompressedImage compressedImage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.addons.ros.imaging.CompressedImage" unique="false" eImageUnique="false" connectedNodeDataType="org.eclipse.symphony.addons.ros.imaging.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
	CompressedImage convertToCompressedImage(EImage eImage, ConnectedNode connectedNode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.addons.ros.imaging.CompressedImage" unique="false" imageDataDataType="org.eclipse.symphony.common.images.ImageData" imageDataUnique="false" connectedNodeDataType="org.eclipse.symphony.addons.ros.imaging.ConnectedNode" connectedNodeUnique="false"
	 * @generated
	 */
	CompressedImage convertToCompressedImage(ImageData imageData, ConnectedNode connectedNode);

} // Symphony__AddonsROSImagingFacade
