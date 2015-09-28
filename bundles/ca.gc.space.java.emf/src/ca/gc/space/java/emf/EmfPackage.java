/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.java.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.java.emf.EmfFactory
 * @model kind="package"
 * @generated
 */
public interface EmfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "emf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/java/emf.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmfPackage eINSTANCE = ca.gc.space.java.emf.impl.EmfPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Comparable
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getComparable()
	 * @generated
	 */
	int COMPARABLE = 0;

	/**
	 * The number of structural features of the '<em>Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.util.Comparator <em>Comparator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Comparator
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 1;

	/**
	 * The number of structural features of the '<em>Comparator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getList()
	 * @generated
	 */
	int LIST = 13;

	/**
	 * The meta object id for the '<em>GVector</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.GVector
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getGVector()
	 * @generated
	 */
	int GVECTOR = 14;

	/**
	 * The meta object id for the '<em>Buffered Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.awt.image.BufferedImage
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getBufferedImage()
	 * @generated
	 */
	int BUFFERED_IMAGE = 15;

	/**
	 * The meta object id for the '<em>Class</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Class
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 16;

	/**
	 * The meta object id for the '<em>Core Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.CoreException
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getCoreException()
	 * @generated
	 */
	int CORE_EXCEPTION = 17;

	/**
	 * The meta object id for the '<em>IO Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.IOException
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getIOException()
	 * @generated
	 */
	int IO_EXCEPTION = 18;

	/**
	 * The meta object id for the '<em>Point2d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point2d
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getPoint2d()
	 * @generated
	 */
	int POINT2D = 19;

	/**
	 * The meta object id for the '<em>Image Data</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.ImageData
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getImageData()
	 * @generated
	 */
	int IMAGE_DATA = 20;

	/**
	 * The meta object id for the '<em>Canvas</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.widgets.Canvas
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getCanvas()
	 * @generated
	 */
	int CANVAS = 21;

	/**
	 * The meta object id for the '<em>Quat4d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Quat4d
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getQuat4d()
	 * @generated
	 */
	int QUAT4D = 22;

	/**
	 * The meta object id for the '<em>View</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.media.j3d.View
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 23;

	/**
	 * The meta object id for the '<em>Node Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getNodeArray()
	 * @generated
	 */
	int NODE_ARRAY = 24;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 12;

	/**
	 * The meta object id for the '<em>Matrix4d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix4d
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getMatrix4d()
	 * @generated
	 */
	int MATRIX4D = 2;

	/**
	 * The meta object id for the '<em>Matrix3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix3d
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getMatrix3d()
	 * @generated
	 */
	int MATRIX3D = 3;

	/**
	 * The meta object id for the '<em>Vector3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3d
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getVector3d()
	 * @generated
	 */
	int VECTOR3D = 4;

	/**
	 * The meta object id for the '<em>Point3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Point3d
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getPoint3d()
	 * @generated
	 */
	int POINT3D = 5;

	/**
	 * The meta object id for the '<em>Tuple3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Tuple3d
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getTuple3d()
	 * @generated
	 */
	int TUPLE3D = 6;

	/**
	 * The meta object id for the '<em>Input Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.InputStream
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 7;

	/**
	 * The meta object id for the '<em>Output Stream</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.OutputStream
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 8;


	/**
	 * The meta object id for the '<em>Branch Group</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.media.j3d.BranchGroup
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getBranchGroup()
	 * @generated
	 */
	int BRANCH_GROUP = 9;


	/**
	 * The meta object id for the '<em>Group</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.media.j3d.Group
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 10;


	/**
	 * The meta object id for the '<em>Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.media.j3d.Node
	 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 11;


	/**
	 * Returns the meta object for class '{@link java.lang.Comparable <em>Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparable</em>'.
	 * @see java.lang.Comparable
	 * @model instanceClass="java.lang.Comparable" typeParameters="T"
	 * @generated
	 */
	EClass getComparable();

	/**
	 * Returns the meta object for class '{@link java.util.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparator</em>'.
	 * @see java.util.Comparator
	 * @model instanceClass="java.util.Comparator" typeParameters="T"
	 * @generated
	 */
	EClass getComparator();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.GVector <em>GVector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>GVector</em>'.
	 * @see javax.vecmath.GVector
	 * @model instanceClass="javax.vecmath.GVector"
	 * @generated
	 */
	EDataType getGVector();

	/**
	 * Returns the meta object for data type '{@link java.awt.image.BufferedImage <em>Buffered Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Buffered Image</em>'.
	 * @see java.awt.image.BufferedImage
	 * @model instanceClass="java.awt.image.BufferedImage"
	 * @generated
	 */
	EDataType getBufferedImage();

	/**
	 * Returns the meta object for data type '{@link java.lang.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Class</em>'.
	 * @see java.lang.Class
	 * @model instanceClass="java.lang.Class" typeParameters="T"
	 * @generated
	 */
	EDataType getClass_();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.CoreException <em>Core Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Core Exception</em>'.
	 * @see org.eclipse.core.runtime.CoreException
	 * @model instanceClass="org.eclipse.core.runtime.CoreException"
	 * @generated
	 */
	EDataType getCoreException();

	/**
	 * Returns the meta object for data type '{@link java.io.IOException <em>IO Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Exception</em>'.
	 * @see java.io.IOException
	 * @model instanceClass="java.io.IOException"
	 * @generated
	 */
	EDataType getIOException();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point2d <em>Point2d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point2d</em>'.
	 * @see javax.vecmath.Point2d
	 * @model instanceClass="javax.vecmath.Point2d"
	 * @generated
	 */
	EDataType getPoint2d();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.ImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Data</em>'.
	 * @see org.eclipse.swt.graphics.ImageData
	 * @model instanceClass="org.eclipse.swt.graphics.ImageData"
	 * @generated
	 */
	EDataType getImageData();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.widgets.Canvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Canvas</em>'.
	 * @see org.eclipse.swt.widgets.Canvas
	 * @model instanceClass="org.eclipse.swt.widgets.Canvas"
	 * @generated
	 */
	EDataType getCanvas();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Quat4d <em>Quat4d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Quat4d</em>'.
	 * @see javax.vecmath.Quat4d
	 * @model instanceClass="javax.vecmath.Quat4d"
	 * @generated
	 */
	EDataType getQuat4d();

	/**
	 * Returns the meta object for data type '{@link javax.media.j3d.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View</em>'.
	 * @see javax.media.j3d.View
	 * @model instanceClass="javax.media.j3d.View"
	 * @generated
	 */
	EDataType getView();

	/**
	 * Returns the meta object for data type '<em>Node Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Array</em>'.
	 * @model instanceClass="javax.media.j3d.Node[]"
	 * @generated
	 */
	EDataType getNodeArray();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Matrix4d <em>Matrix4d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Matrix4d</em>'.
	 * @see javax.vecmath.Matrix4d
	 * @model instanceClass="javax.vecmath.Matrix4d"
	 * @generated
	 */
	EDataType getMatrix4d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Matrix3d <em>Matrix3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Matrix3d</em>'.
	 * @see javax.vecmath.Matrix3d
	 * @model instanceClass="javax.vecmath.Matrix3d"
	 * @generated
	 */
	EDataType getMatrix3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3d <em>Vector3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector3d</em>'.
	 * @see javax.vecmath.Vector3d
	 * @model instanceClass="javax.vecmath.Vector3d"
	 * @generated
	 */
	EDataType getVector3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Point3d <em>Point3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point3d</em>'.
	 * @see javax.vecmath.Point3d
	 * @model instanceClass="javax.vecmath.Point3d"
	 * @generated
	 */
	EDataType getPoint3d();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Tuple3d <em>Tuple3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tuple3d</em>'.
	 * @see javax.vecmath.Tuple3d
	 * @model instanceClass="javax.vecmath.Tuple3d"
	 * @generated
	 */
	EDataType getTuple3d();

	/**
	 * Returns the meta object for data type '{@link java.io.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Input Stream</em>'.
	 * @see java.io.InputStream
	 * @model instanceClass="java.io.InputStream"
	 * @generated
	 */
	EDataType getInputStream();

	/**
	 * Returns the meta object for data type '{@link java.io.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Stream</em>'.
	 * @see java.io.OutputStream
	 * @model instanceClass="java.io.OutputStream"
	 * @generated
	 */
	EDataType getOutputStream();

	/**
	 * Returns the meta object for data type '{@link javax.media.j3d.BranchGroup <em>Branch Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Branch Group</em>'.
	 * @see javax.media.j3d.BranchGroup
	 * @model instanceClass="javax.media.j3d.BranchGroup"
	 * @generated
	 */
	EDataType getBranchGroup();

	/**
	 * Returns the meta object for data type '{@link javax.media.j3d.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Group</em>'.
	 * @see javax.media.j3d.Group
	 * @model instanceClass="javax.media.j3d.Group"
	 * @generated
	 */
	EDataType getGroup();

	/**
	 * Returns the meta object for data type '{@link javax.media.j3d.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node</em>'.
	 * @see javax.media.j3d.Node
	 * @model instanceClass="javax.media.j3d.Node"
	 * @generated
	 */
	EDataType getNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EmfFactory getEmfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link java.lang.Comparable <em>Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Comparable
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getComparable()
		 * @generated
		 */
		EClass COMPARABLE = eINSTANCE.getComparable();

		/**
		 * The meta object literal for the '{@link java.util.Comparator <em>Comparator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Comparator
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getComparator()
		 * @generated
		 */
		EClass COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>GVector</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.GVector
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getGVector()
		 * @generated
		 */
		EDataType GVECTOR = eINSTANCE.getGVector();

		/**
		 * The meta object literal for the '<em>Buffered Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.awt.image.BufferedImage
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getBufferedImage()
		 * @generated
		 */
		EDataType BUFFERED_IMAGE = eINSTANCE.getBufferedImage();

		/**
		 * The meta object literal for the '<em>Class</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Class
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getClass_()
		 * @generated
		 */
		EDataType CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em>Core Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.CoreException
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getCoreException()
		 * @generated
		 */
		EDataType CORE_EXCEPTION = eINSTANCE.getCoreException();

		/**
		 * The meta object literal for the '<em>IO Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.IOException
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getIOException()
		 * @generated
		 */
		EDataType IO_EXCEPTION = eINSTANCE.getIOException();

		/**
		 * The meta object literal for the '<em>Point2d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point2d
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getPoint2d()
		 * @generated
		 */
		EDataType POINT2D = eINSTANCE.getPoint2d();

		/**
		 * The meta object literal for the '<em>Image Data</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.ImageData
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getImageData()
		 * @generated
		 */
		EDataType IMAGE_DATA = eINSTANCE.getImageData();

		/**
		 * The meta object literal for the '<em>Canvas</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.widgets.Canvas
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getCanvas()
		 * @generated
		 */
		EDataType CANVAS = eINSTANCE.getCanvas();

		/**
		 * The meta object literal for the '<em>Quat4d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Quat4d
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getQuat4d()
		 * @generated
		 */
		EDataType QUAT4D = eINSTANCE.getQuat4d();

		/**
		 * The meta object literal for the '<em>View</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.media.j3d.View
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getView()
		 * @generated
		 */
		EDataType VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em>Node Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getNodeArray()
		 * @generated
		 */
		EDataType NODE_ARRAY = eINSTANCE.getNodeArray();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em>Matrix4d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix4d
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getMatrix4d()
		 * @generated
		 */
		EDataType MATRIX4D = eINSTANCE.getMatrix4d();

		/**
		 * The meta object literal for the '<em>Matrix3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix3d
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getMatrix3d()
		 * @generated
		 */
		EDataType MATRIX3D = eINSTANCE.getMatrix3d();

		/**
		 * The meta object literal for the '<em>Vector3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3d
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getVector3d()
		 * @generated
		 */
		EDataType VECTOR3D = eINSTANCE.getVector3d();

		/**
		 * The meta object literal for the '<em>Point3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Point3d
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getPoint3d()
		 * @generated
		 */
		EDataType POINT3D = eINSTANCE.getPoint3d();

		/**
		 * The meta object literal for the '<em>Tuple3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Tuple3d
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getTuple3d()
		 * @generated
		 */
		EDataType TUPLE3D = eINSTANCE.getTuple3d();

		/**
		 * The meta object literal for the '<em>Input Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.InputStream
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getInputStream()
		 * @generated
		 */
		EDataType INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '<em>Output Stream</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.OutputStream
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getOutputStream()
		 * @generated
		 */
		EDataType OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '<em>Branch Group</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.media.j3d.BranchGroup
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getBranchGroup()
		 * @generated
		 */
		EDataType BRANCH_GROUP = eINSTANCE.getBranchGroup();

		/**
		 * The meta object literal for the '<em>Group</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.media.j3d.Group
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getGroup()
		 * @generated
		 */
		EDataType GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em>Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.media.j3d.Node
		 * @see ca.gc.space.java.emf.impl.EmfPackageImpl#getNode()
		 * @generated
		 */
		EDataType NODE = eINSTANCE.getNode();

	}

} //EmfPackage
