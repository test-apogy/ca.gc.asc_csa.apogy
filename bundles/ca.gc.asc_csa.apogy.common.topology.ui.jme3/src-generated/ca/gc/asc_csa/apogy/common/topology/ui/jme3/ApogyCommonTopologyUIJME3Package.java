package ca.gc.asc_csa.apogy.common.topology.ui.jme3;
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
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.ApogyCommonTopologyUIJME3Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonTopologyUIJME3' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)' modelName='ApogyCommonTopologyUIJME3' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.common.topology.ui.jme3/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.topology.ui.jme3.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common.topology.ui'"
 * @generated
 */
public interface ApogyCommonTopologyUIJME3Package extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.common.topology.ui.jme3";

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
	ApogyCommonTopologyUIJME3Package eINSTANCE = ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.JME3TypeFactoryImpl <em>JME3 Type Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.JME3TypeFactoryImpl
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3TypeFactory()
	 * @generated
	 */
	int JME3_TYPE_FACTORY = 0;

	/**
	 * The number of structural features of the '<em>JME3 Type Factory</em>' class.
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
	 * The number of operations of the '<em>JME3 Type Factory</em>' class.
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
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getColor3f()
	 * @generated
	 */
	int COLOR3F = 1;

	/**
	 * The meta object id for the '<em>Color RGBA</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.math.ColorRGBA
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getColorRGBA()
	 * @generated
	 */
	int COLOR_RGBA = 2;

	/**
	 * The meta object id for the '<em>JME Vector3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.math.Vector3f
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJMEVector3f()
	 * @generated
	 */
	int JME_VECTOR3F = 3;

	/**
	 * The meta object id for the '<em>Vector3f</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Vector3f
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getVector3f()
	 * @generated
	 */
	int VECTOR3F = 4;


	/**
	 * The meta object id for the '<em>JME3 Scene Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3SceneObject()
	 * @generated
	 */
	int JME3_SCENE_OBJECT = 5;


	/**
	 * The meta object id for the '<em>JME3 Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.scene.Node
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3Node()
	 * @generated
	 */
	int JME3_NODE = 6;

	/**
	 * The meta object id for the '<em>JME3 Geometry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.jme3.scene.Geometry
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3Geometry()
	 * @generated
	 */
	int JME3_GEOMETRY = 7;

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3TypeFactory <em>JME3 Type Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JME3 Type Factory</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3TypeFactory
	 * @generated
	 */
	EClass getJME3TypeFactory();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3TypeFactory#createColorRGBA(javax.vecmath.Color3f) <em>Create Color RGBA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Color RGBA</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3TypeFactory#createColorRGBA(javax.vecmath.Color3f)
	 * @generated
	 */
	EOperation getJME3TypeFactory__CreateColorRGBA__Color3f();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3TypeFactory#createVector3f(javax.vecmath.Vector3f) <em>Create Vector3f</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Vector3f</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3TypeFactory#createVector3f(javax.vecmath.Vector3f)
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
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject <em>JME3 Scene Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JME3 Scene Object</em>'.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject
	 * @model instanceClass="ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject"
	 * @generated
	 */
	EDataType getJME3SceneObject();

	/**
	 * Returns the meta object for data type '{@link com.jme3.scene.Node <em>JME3 Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JME3 Node</em>'.
	 * @see com.jme3.scene.Node
	 * @model instanceClass="com.jme3.scene.Node"
	 * @generated
	 */
	EDataType getJME3Node();

	/**
	 * Returns the meta object for data type '{@link com.jme3.scene.Geometry <em>JME3 Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JME3 Geometry</em>'.
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
	ApogyCommonTopologyUIJME3Factory getApogyCommonTopologyUIJME3Factory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.JME3TypeFactoryImpl <em>JME3 Type Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.JME3TypeFactoryImpl
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3TypeFactory()
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
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getColor3f()
		 * @generated
		 */
		EDataType COLOR3F = eINSTANCE.getColor3f();

		/**
		 * The meta object literal for the '<em>Color RGBA</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.math.ColorRGBA
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getColorRGBA()
		 * @generated
		 */
		EDataType COLOR_RGBA = eINSTANCE.getColorRGBA();

		/**
		 * The meta object literal for the '<em>JME Vector3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.math.Vector3f
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJMEVector3f()
		 * @generated
		 */
		EDataType JME_VECTOR3F = eINSTANCE.getJMEVector3f();

		/**
		 * The meta object literal for the '<em>Vector3f</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Vector3f
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getVector3f()
		 * @generated
		 */
		EDataType VECTOR3F = eINSTANCE.getVector3f();

		/**
		 * The meta object literal for the '<em>JME3 Scene Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3SceneObject()
		 * @generated
		 */
		EDataType JME3_SCENE_OBJECT = eINSTANCE.getJME3SceneObject();

		/**
		 * The meta object literal for the '<em>JME3 Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.scene.Node
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3Node()
		 * @generated
		 */
		EDataType JME3_NODE = eINSTANCE.getJME3Node();

		/**
		 * The meta object literal for the '<em>JME3 Geometry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.jme3.scene.Geometry
		 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl.ApogyCommonTopologyUIJME3PackageImpl#getJME3Geometry()
		 * @generated
		 */
		EDataType JME3_GEOMETRY = eINSTANCE.getJME3Geometry();

	}

} //ApogyCommonTopologyUIJME3Package
