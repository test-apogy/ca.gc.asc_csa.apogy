/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.jme3.impl;

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.topology.ui.jme3.Symphony__CommonTopologyUIJME3Factory;
import org.eclipse.symphony.common.topology.ui.jme3.Symphony__CommonTopologyUIJME3Package;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;
import org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyUIJME3PackageImpl extends EPackageImpl implements Symphony__CommonTopologyUIJME3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jme3TypeFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorRGBAEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jmeVector3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vector3fEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jme3SceneObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jme3NodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jme3GeometryEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.common.topology.ui.jme3.Symphony__CommonTopologyUIJME3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonTopologyUIJME3PackageImpl() {
		super(eNS_URI, Symphony__CommonTopologyUIJME3Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Symphony__CommonTopologyUIJME3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonTopologyUIJME3Package init() {
		if (isInited) return (Symphony__CommonTopologyUIJME3Package)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyUIJME3Package.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonTopologyUIJME3PackageImpl theSymphony__CommonTopologyUIJME3Package = (Symphony__CommonTopologyUIJME3PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonTopologyUIJME3PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonTopologyUIJME3PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSymphony__CommonTopologyUIJME3Package.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonTopologyUIJME3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonTopologyUIJME3Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonTopologyUIJME3Package.eNS_URI, theSymphony__CommonTopologyUIJME3Package);
		return theSymphony__CommonTopologyUIJME3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJME3TypeFactory() {
		return jme3TypeFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJME3TypeFactory__CreateColorRGBA__Color3f() {
		return jme3TypeFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJME3TypeFactory__CreateVector3f__Vector3f() {
		return jme3TypeFactoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorRGBA() {
		return colorRGBAEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJMEVector3f() {
		return jmeVector3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVector3f() {
		return vector3fEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJME3SceneObject() {
		return jme3SceneObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJME3Node() {
		return jme3NodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJME3Geometry() {
		return jme3GeometryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyUIJME3Factory getSymphony__CommonTopologyUIJME3Factory() {
		return (Symphony__CommonTopologyUIJME3Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jme3TypeFactoryEClass = createEClass(JME3_TYPE_FACTORY);
		createEOperation(jme3TypeFactoryEClass, JME3_TYPE_FACTORY___CREATE_COLOR_RGBA__COLOR3F);
		createEOperation(jme3TypeFactoryEClass, JME3_TYPE_FACTORY___CREATE_VECTOR3F__VECTOR3F);

		// Create data types
		color3fEDataType = createEDataType(COLOR3F);
		colorRGBAEDataType = createEDataType(COLOR_RGBA);
		jmeVector3fEDataType = createEDataType(JME_VECTOR3F);
		vector3fEDataType = createEDataType(VECTOR3F);
		jme3SceneObjectEDataType = createEDataType(JME3_SCENE_OBJECT);
		jme3NodeEDataType = createEDataType(JME3_NODE);
		jme3GeometryEDataType = createEDataType(JME3_GEOMETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(jme3TypeFactoryEClass, JME3TypeFactory.class, "JME3TypeFactory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getJME3TypeFactory__CreateColorRGBA__Color3f(), this.getColorRGBA(), "createColorRGBA", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getColor3f(), "color", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJME3TypeFactory__CreateVector3f__Vector3f(), this.getJMEVector3f(), "createVector3f", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVector3f(), "vector", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorRGBAEDataType, ColorRGBA.class, "ColorRGBA", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jmeVector3fEDataType, Vector3f.class, "JMEVector3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vector3fEDataType, javax.vecmath.Vector3f.class, "Vector3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jme3SceneObjectEDataType, JME3SceneObject.class, "JME3SceneObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jme3NodeEDataType, Node.class, "JME3Node", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jme3GeometryEDataType, Geometry.class, "JME3Geometry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "Symphony__CommonTopologyUIJME3",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)",
			 "modelName", "Symphony__CommonTopologyUIJME3",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.common.topology.ui.jme3/src-generated",
			 "editDirectory", "/org.eclipse.symphony.common.topology.ui.jme3.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.common.topology.ui"
		   });
	}

} //Symphony__CommonTopologyUIJME3PackageImpl
