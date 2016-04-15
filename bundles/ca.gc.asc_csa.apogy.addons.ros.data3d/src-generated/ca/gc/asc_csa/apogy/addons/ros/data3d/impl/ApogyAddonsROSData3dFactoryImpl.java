/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.data3d.impl;

import ca.gc.asc_csa.apogy.addons.ros.data3d.*;

import geometry_msgs.Point;
import geometry_msgs.Pose;
import geometry_msgs.Quaternion;

import java.nio.ByteBuffer;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ros.message.MessageFactory;
import sensor_msgs.PointCloud2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyAddonsROSData3dFactoryImpl extends EFactoryImpl implements ApogyAddonsROSData3dFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyAddonsROSData3dFactory init() {
		try {
			ApogyAddonsROSData3dFactory theApogyAddonsROSData3dFactory = (ApogyAddonsROSData3dFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyAddonsROSData3dPackage.eNS_URI);
			if (theApogyAddonsROSData3dFactory != null) {
				return theApogyAddonsROSData3dFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyAddonsROSData3dFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSData3dFactoryImpl() {
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
			case ApogyAddonsROSData3dPackage.APOGY_ADDONS_ROS_DATA3D_FACADE: return createApogyAddonsROSData3dFacade();
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
			case ApogyAddonsROSData3dPackage.POINT_CLOUD2:
				return createPointCloud2FromString(eDataType, initialValue);
			case ApogyAddonsROSData3dPackage.BYTE_BUFFER:
				return createByteBufferFromString(eDataType, initialValue);
			case ApogyAddonsROSData3dPackage.MESSAGE_FACTORY:
				return createMessageFactoryFromString(eDataType, initialValue);
			case ApogyAddonsROSData3dPackage.ROS_POINT:
				return createROSPointFromString(eDataType, initialValue);
			case ApogyAddonsROSData3dPackage.ROS_QUATERNION:
				return createROSQuaternionFromString(eDataType, initialValue);
			case ApogyAddonsROSData3dPackage.ROS_POSE:
				return createROSPoseFromString(eDataType, initialValue);
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
			case ApogyAddonsROSData3dPackage.POINT_CLOUD2:
				return convertPointCloud2ToString(eDataType, instanceValue);
			case ApogyAddonsROSData3dPackage.BYTE_BUFFER:
				return convertByteBufferToString(eDataType, instanceValue);
			case ApogyAddonsROSData3dPackage.MESSAGE_FACTORY:
				return convertMessageFactoryToString(eDataType, instanceValue);
			case ApogyAddonsROSData3dPackage.ROS_POINT:
				return convertROSPointToString(eDataType, instanceValue);
			case ApogyAddonsROSData3dPackage.ROS_QUATERNION:
				return convertROSQuaternionToString(eDataType, instanceValue);
			case ApogyAddonsROSData3dPackage.ROS_POSE:
				return convertROSPoseToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSData3dFacade createApogyAddonsROSData3dFacade() {
		ApogyAddonsROSData3dFacadeImpl apogyAddonsROSData3dFacade = new ApogyAddonsROSData3dFacadeImpl();
		return apogyAddonsROSData3dFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCloud2 createPointCloud2FromString(EDataType eDataType, String initialValue) {
		return (PointCloud2)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPointCloud2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByteBuffer createByteBufferFromString(EDataType eDataType, String initialValue) {
		return (ByteBuffer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertByteBufferToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFactory createMessageFactoryFromString(EDataType eDataType, String initialValue) {
		return (MessageFactory)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageFactoryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createROSPointFromString(EDataType eDataType, String initialValue) {
		return (Point)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertROSPointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quaternion createROSQuaternionFromString(EDataType eDataType, String initialValue) {
		return (Quaternion)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertROSQuaternionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose createROSPoseFromString(EDataType eDataType, String initialValue) {
		return (Pose)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertROSPoseToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAddonsROSData3dPackage getApogyAddonsROSData3dPackage() {
		return (ApogyAddonsROSData3dPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyAddonsROSData3dPackage getPackage() {
		return ApogyAddonsROSData3dPackage.eINSTANCE;
	}

} //ApogyAddonsROSData3dFactoryImpl
