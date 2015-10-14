/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.jme3;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='JME3' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)' modelName='JM3' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.common.topology.ui.jme3/src-generated' editDirectory='/org.eclipse.symphony.common.topology.ui.jme3.edit/src-generated' basePackage='org.eclipse.symphony.common.topology.ui'"
 * @generated
 */
public interface JME3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jme3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.topology.ui.jme3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jme3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JME3Package eINSTANCE = org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.topology.ui.jme3.impl.JME3TypeFactoryImpl <em>Type Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3TypeFactoryImpl
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3TypeFactory()
	 * @generated
	 */
	int JME3_TYPE_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>Type Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JME3_TYPE_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Color RGBA</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JME3_TYPE_FACTORY___CREATE_COLOR_RGBA__COLOR3F = 0;

	/**
	 * The operation id for the '<em>Create Vector3f</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JME3_TYPE_FACTORY___CREATE_VECTOR3F__VECTOR3F = 1;

	/**
	 * The number of operations of the '<em>Type Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JME3_TYPE_FACTORY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '<em>Color3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Color3f
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 1;

	/**
	 * The meta object id for the '<em>Color RGBA</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.math.ColorRGBA
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getColorRGBA()
	 * @generated
	 */
	int COLOR_RGBA = 2;

	/**
	 * The meta object id for the '<em>JME Vector3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.math.Vector3f
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJMEVector3f()
	 * @generated
	 */
	int JME_VECTOR3F = 3;

	/**
	 * The meta object id for the '<em>Vector3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3f
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getVector3f()
	 * @generated
	 */
	int VECTOR3F = 4;


	/**
	 * The meta object id for the '<em>Scene Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3SceneObject()
	 * @generated
	 */
	int JME3_SCENE_OBJECT = 5;


	/**
	 * The meta object id for the '<em>Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.scene.Node
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3Node()
	 * @generated
	 */
	int JME3_NODE = 6;

	/**
	 * The meta object id for the '<em>Geometry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.scene.Geometry
	 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3Geometry()
	 * @generated
	 */
	int JME3_GEOMETRY = 7;

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory <em>Type Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Factory</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory
	 * @generated
	 */
	EClass getJME3TypeFactory();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory#createColorRGBA(javax.vecmath.Color3f) <em>Create Color RGBA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Color RGBA</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory#createColorRGBA(javax.vecmath.Color3f)
	 * @generated
	 */
	EOperation getJME3TypeFactory__CreateColorRGBA__Color3f();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory#createVector3f(javax.vecmath.Vector3f) <em>Create Vector3f</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Vector3f</em>' operation.
	 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory#createVector3f(javax.vecmath.Vector3f)
	 * @generated
	 */
	EOperation getJME3TypeFactory__CreateVector3f__Vector3f();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Color3f <em>Color3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color3f</em>'.
	 * @see javax.vecmath.Color3f
	 * @model instanceClass="javax.vecmath.Color3f"
	 * @generated
	 */
	EDataType getColor3f();

	/**
	 * Returns the meta object for data type '{@link com.jme3.math.ColorRGBA <em>Color RGBA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color RGBA</em>'.
	 * @see com.jme3.math.ColorRGBA
	 * @model instanceClass="com.jme3.math.ColorRGBA"
	 * @generated
	 */
	EDataType getColorRGBA();

	/**
	 * Returns the meta object for data type '{@link com.jme3.math.Vector3f <em>JME Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JME Vector3f</em>'.
	 * @see com.jme3.math.Vector3f
	 * @model instanceClass="com.jme3.math.Vector3f"
	 * @generated
	 */
	EDataType getJMEVector3f();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Vector3f <em>Vector3f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector3f</em>'.
	 * @see javax.vecmath.Vector3f
	 * @model instanceClass="javax.vecmath.Vector3f"
	 * @generated
	 */
	EDataType getVector3f();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject <em>Scene Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scene Object</em>'.
	 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject
	 * @model instanceClass="org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject"
	 * @generated
	 */
	EDataType getJME3SceneObject();

	/**
	 * Returns the meta object for data type '{@link com.jme3.scene.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node</em>'.
	 * @see com.jme3.scene.Node
	 * @model instanceClass="com.jme3.scene.Node"
	 * @generated
	 */
	EDataType getJME3Node();

	/**
	 * Returns the meta object for data type '{@link com.jme3.scene.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Geometry</em>'.
	 * @see com.jme3.scene.Geometry
	 * @model instanceClass="com.jme3.scene.Geometry"
	 * @generated
	 */
	EDataType getJME3Geometry();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JME3Factory getJME3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.topology.ui.jme3.impl.JME3TypeFactoryImpl <em>Type Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3TypeFactoryImpl
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3TypeFactory()
		 * @generated
		 */
		EClass JME3_TYPE_FACTORY = eINSTANCE.getJME3TypeFactory();

		/**
		 * The meta object literal for the '<em><b>Create Color RGBA</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JME3_TYPE_FACTORY___CREATE_COLOR_RGBA__COLOR3F = eINSTANCE.getJME3TypeFactory__CreateColorRGBA__Color3f();

		/**
		 * The meta object literal for the '<em><b>Create Vector3f</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JME3_TYPE_FACTORY___CREATE_VECTOR3F__VECTOR3F = eINSTANCE.getJME3TypeFactory__CreateVector3f__Vector3f();

		/**
		 * The meta object literal for the '<em>Color3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Color3f
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();

		/**
		 * The meta object literal for the '<em>Color RGBA</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.math.ColorRGBA
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getColorRGBA()
		 * @generated
		 */
		EDataType COLOR_RGBA = eINSTANCE.getColorRGBA();

		/**
		 * The meta object literal for the '<em>JME Vector3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.math.Vector3f
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJMEVector3f()
		 * @generated
		 */
		EDataType JME_VECTOR3F = eINSTANCE.getJMEVector3f();

		/**
		 * The meta object literal for the '<em>Vector3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3f
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getVector3f()
		 * @generated
		 */
		EDataType VECTOR3F = eINSTANCE.getVector3f();

		/**
		 * The meta object literal for the '<em>Scene Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3SceneObject()
		 * @generated
		 */
		EDataType JME3_SCENE_OBJECT = eINSTANCE.getJME3SceneObject();

		/**
		 * The meta object literal for the '<em>Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.scene.Node
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3Node()
		 * @generated
		 */
		EDataType JME3_NODE = eINSTANCE.getJME3Node();

		/**
		 * The meta object literal for the '<em>Geometry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.scene.Geometry
		 * @see org.eclipse.symphony.common.topology.ui.jme3.impl.JME3PackageImpl#getJME3Geometry()
		 * @generated
		 */
		EDataType JME3_GEOMETRY = eINSTANCE.getJME3Geometry();

	}

} //JME3Package
