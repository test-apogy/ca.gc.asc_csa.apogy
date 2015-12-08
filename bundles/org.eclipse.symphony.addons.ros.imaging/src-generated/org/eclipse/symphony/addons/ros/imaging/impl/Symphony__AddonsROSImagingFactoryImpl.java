/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.imaging.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.symphony.addons.ros.imaging.*;

import org.ros.node.ConnectedNode;

import sensor_msgs.CompressedImage;
import sensor_msgs.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__AddonsROSImagingFactoryImpl extends EFactoryImpl implements Symphony__AddonsROSImagingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__AddonsROSImagingFactory init() {
		try {
			Symphony__AddonsROSImagingFactory theSymphony__AddonsROSImagingFactory = (Symphony__AddonsROSImagingFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__AddonsROSImagingPackage.eNS_URI);
			if (theSymphony__AddonsROSImagingFactory != null) {
				return theSymphony__AddonsROSImagingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__AddonsROSImagingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSImagingFactoryImpl() {
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
			case Symphony__AddonsROSImagingPackage.SYMPHONY_ADDONS_ROS_IMAGING_FACADE: return createSymphony__AddonsROSImagingFacade();
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
			case Symphony__AddonsROSImagingPackage.IMAGE:
				return createImageFromString(eDataType, initialValue);
			case Symphony__AddonsROSImagingPackage.COMPRESSED_IMAGE:
				return createCompressedImageFromString(eDataType, initialValue);
			case Symphony__AddonsROSImagingPackage.CONNECTED_NODE:
				return createConnectedNodeFromString(eDataType, initialValue);
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
			case Symphony__AddonsROSImagingPackage.IMAGE:
				return convertImageToString(eDataType, instanceValue);
			case Symphony__AddonsROSImagingPackage.COMPRESSED_IMAGE:
				return convertCompressedImageToString(eDataType, instanceValue);
			case Symphony__AddonsROSImagingPackage.CONNECTED_NODE:
				return convertConnectedNodeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSImagingFacade createSymphony__AddonsROSImagingFacade() {
		Symphony__AddonsROSImagingFacadeImpl symphony__AddonsROSImagingFacade = new Symphony__AddonsROSImagingFacadeImpl();
		return symphony__AddonsROSImagingFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImageFromString(EDataType eDataType, String initialValue) {
		return (Image)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressedImage createCompressedImageFromString(EDataType eDataType, String initialValue) {
		return (CompressedImage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressedImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectedNode createConnectedNodeFromString(EDataType eDataType, String initialValue) {
		return (ConnectedNode)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectedNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__AddonsROSImagingPackage getSymphony__AddonsROSImagingPackage() {
		return (Symphony__AddonsROSImagingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__AddonsROSImagingPackage getPackage() {
		return Symphony__AddonsROSImagingPackage.eINSTANCE;
	}

} //Symphony__AddonsROSImagingFactoryImpl
