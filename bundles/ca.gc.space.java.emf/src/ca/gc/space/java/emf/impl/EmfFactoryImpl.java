/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.java.emf.impl;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.media.j3d.BranchGroup;
import javax.media.j3d.Group;
import javax.media.j3d.Node;
import javax.media.j3d.View;
import javax.vecmath.GVector;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Point2d;
import javax.vecmath.Point3d;
import javax.vecmath.Quat4d;
import javax.vecmath.Tuple3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Canvas;

import ca.gc.space.java.emf.EmfFactory;
import ca.gc.space.java.emf.EmfPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class EmfFactoryImpl extends EFactoryImpl implements EmfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static EmfFactory init() {
		try {
			EmfFactory theEmfFactory = (EmfFactory)EPackage.Registry.INSTANCE.getEFactory(EmfPackage.eNS_URI);
			if (theEmfFactory != null) {
				return theEmfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EmfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public EmfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EmfPackage.MATRIX4D:
				return createMatrix4dFromString(eDataType, initialValue);
			case EmfPackage.MATRIX3D:
				return createMatrix3dFromString(eDataType, initialValue);
			case EmfPackage.VECTOR3D:
				return createVector3dFromString(eDataType, initialValue);
			case EmfPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case EmfPackage.TUPLE3D:
				return createTuple3dFromString(eDataType, initialValue);
			case EmfPackage.INPUT_STREAM:
				return createInputStreamFromString(eDataType, initialValue);
			case EmfPackage.OUTPUT_STREAM:
				return createOutputStreamFromString(eDataType, initialValue);
			case EmfPackage.BRANCH_GROUP:
				return createBranchGroupFromString(eDataType, initialValue);
			case EmfPackage.GROUP:
				return createGroupFromString(eDataType, initialValue);
			case EmfPackage.NODE:
				return createNodeFromString(eDataType, initialValue);
			case EmfPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			case EmfPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case EmfPackage.GVECTOR:
				return createGVectorFromString(eDataType, initialValue);
			case EmfPackage.BUFFERED_IMAGE:
				return createBufferedImageFromString(eDataType, initialValue);
			case EmfPackage.CLASS:
				return createClassFromString(eDataType, initialValue);
			case EmfPackage.CORE_EXCEPTION:
				return createCoreExceptionFromString(eDataType, initialValue);
			case EmfPackage.IO_EXCEPTION:
				return createIOExceptionFromString(eDataType, initialValue);
			case EmfPackage.POINT2D:
				return createPoint2dFromString(eDataType, initialValue);
			case EmfPackage.IMAGE_DATA:
				return createImageDataFromString(eDataType, initialValue);
			case EmfPackage.CANVAS:
				return createCanvasFromString(eDataType, initialValue);
			case EmfPackage.QUAT4D:
				return createQuat4dFromString(eDataType, initialValue);
			case EmfPackage.VIEW:
				return createViewFromString(eDataType, initialValue);
			case EmfPackage.NODE_ARRAY:
				return createNodeArrayFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EmfPackage.MATRIX4D:
				return convertMatrix4dToString(eDataType, instanceValue);
			case EmfPackage.MATRIX3D:
				return convertMatrix3dToString(eDataType, instanceValue);
			case EmfPackage.VECTOR3D:
				return convertVector3dToString(eDataType, instanceValue);
			case EmfPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case EmfPackage.TUPLE3D:
				return convertTuple3dToString(eDataType, instanceValue);
			case EmfPackage.INPUT_STREAM:
				return convertInputStreamToString(eDataType, instanceValue);
			case EmfPackage.OUTPUT_STREAM:
				return convertOutputStreamToString(eDataType, instanceValue);
			case EmfPackage.BRANCH_GROUP:
				return convertBranchGroupToString(eDataType, instanceValue);
			case EmfPackage.GROUP:
				return convertGroupToString(eDataType, instanceValue);
			case EmfPackage.NODE:
				return convertNodeToString(eDataType, instanceValue);
			case EmfPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			case EmfPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case EmfPackage.GVECTOR:
				return convertGVectorToString(eDataType, instanceValue);
			case EmfPackage.BUFFERED_IMAGE:
				return convertBufferedImageToString(eDataType, instanceValue);
			case EmfPackage.CLASS:
				return convertClassToString(eDataType, instanceValue);
			case EmfPackage.CORE_EXCEPTION:
				return convertCoreExceptionToString(eDataType, instanceValue);
			case EmfPackage.IO_EXCEPTION:
				return convertIOExceptionToString(eDataType, instanceValue);
			case EmfPackage.POINT2D:
				return convertPoint2dToString(eDataType, instanceValue);
			case EmfPackage.IMAGE_DATA:
				return convertImageDataToString(eDataType, instanceValue);
			case EmfPackage.CANVAS:
				return convertCanvasToString(eDataType, instanceValue);
			case EmfPackage.QUAT4D:
				return convertQuat4dToString(eDataType, instanceValue);
			case EmfPackage.VIEW:
				return convertViewToString(eDataType, instanceValue);
			case EmfPackage.NODE_ARRAY:
				return convertNodeArrayToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4d createMatrix4dFromString(EDataType eDataType,
			String initialValue) {
		return (Matrix4d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrix4dToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3d createMatrix3dFromString(EDataType eDataType,
			String initialValue) {
		return (Matrix3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrix3dToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d createVector3dFromString(EDataType eDataType,
			String initialValue) {
		return (Vector3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector3dToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Point3d createPoint3dFromString(EDataType eDataType,
			String initialValue) {

		Pattern pattern = Pattern.compile("\\((.*), (.*), (.*)\\)");

		Matcher match = pattern.matcher(initialValue);

		if (match == null || !match.matches()) {
			throw new IllegalArgumentException("Value " + initialValue
					+ " is invalid");
		}

		String xStr = match.group(1);
		String yStr = match.group(2);
		String zStr = match.group(3);

		double x = Double.parseDouble(xStr);
		double y = Double.parseDouble(yStr);
		double z = Double.parseDouble(zStr);

		return new Point3d(x, y, z);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3dToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d createTuple3dFromString(EDataType eDataType,
			String initialValue) {
		return (Tuple3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTuple3dToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStreamFromString(EDataType eDataType,
			String initialValue) {
		return (InputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputStreamToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createOutputStreamFromString(EDataType eDataType,
			String initialValue) {
		return (OutputStream)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputStreamToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BranchGroup createBranchGroupFromString(EDataType eDataType,
			String initialValue) {
		return (BranchGroup)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBranchGroupToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroupFromString(EDataType eDataType, String initialValue) {
		return (Group)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNodeFromString(EDataType eDataType, String initialValue) {
		return (Node)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GVector createGVectorFromString(EDataType eDataType,
			String initialValue) {
		return (GVector)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGVectorToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedImage createBufferedImageFromString(EDataType eDataType,
			String initialValue) {
		return (BufferedImage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBufferedImageToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> createClassFromString(EDataType eDataType,
			String initialValue) {
		return (Class<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CoreException createCoreExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (CoreException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoreExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IOException createIOExceptionFromString(EDataType eDataType,
			String initialValue) {
		return (IOException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOExceptionToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Point2d createPoint2dFromString(EDataType eDataType,
			String initialValue) {

		Pattern pattern = Pattern.compile("\\((.*), (.*)\\)");

		Matcher match = pattern.matcher(initialValue);

		if (match == null || !match.matches()) {
			throw new IllegalArgumentException("Value " + initialValue
					+ " is invalid");
		}

		String xStr = match.group(1);
		String yStr = match.group(2);

		double x = Double.parseDouble(xStr);
		double y = Double.parseDouble(yStr);

		return new Point2d(x, y);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint2dToString(EDataType eDataType,
			Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
	public Canvas createCanvasFromString(EDataType eDataType, String initialValue) {
		return (Canvas)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCanvasToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quat4d createQuat4dFromString(EDataType eDataType, String initialValue) {
		return (Quat4d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuat4dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createViewFromString(EDataType eDataType, String initialValue) {
		return (View)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node[] createNodeArrayFromString(EDataType eDataType, String initialValue) {
		return (Node[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNodeArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EmfPackage getEmfPackage() {
		return (EmfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EmfPackage getPackage() {
		return EmfPackage.eINSTANCE;
	}

} // EmfFactoryImpl
