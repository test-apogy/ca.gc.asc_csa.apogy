/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.jme3.impl;

import javax.vecmath.Color3f;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonTopologyUIJME3FactoryImpl extends EFactoryImpl implements Symphony__CommonTopologyUIJME3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonTopologyUIJME3Factory init() {
		try {
			Symphony__CommonTopologyUIJME3Factory theSymphony__CommonTopologyUIJME3Factory = (Symphony__CommonTopologyUIJME3Factory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonTopologyUIJME3Package.eNS_URI);
			if (theSymphony__CommonTopologyUIJME3Factory != null) {
				return theSymphony__CommonTopologyUIJME3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonTopologyUIJME3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyUIJME3FactoryImpl() {
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
			case Symphony__CommonTopologyUIJME3Package.JME3_TYPE_FACTORY: return createJME3TypeFactory();
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
			case Symphony__CommonTopologyUIJME3Package.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case Symphony__CommonTopologyUIJME3Package.COLOR_RGBA:
				return createColorRGBAFromString(eDataType, initialValue);
			case Symphony__CommonTopologyUIJME3Package.JME_VECTOR3F:
				return createJMEVector3fFromString(eDataType, initialValue);
			case Symphony__CommonTopologyUIJME3Package.VECTOR3F:
				return createVector3fFromString(eDataType, initialValue);
			case Symphony__CommonTopologyUIJME3Package.JME3_SCENE_OBJECT:
				return createJME3SceneObjectFromString(eDataType, initialValue);
			case Symphony__CommonTopologyUIJME3Package.JME3_NODE:
				return createJME3NodeFromString(eDataType, initialValue);
			case Symphony__CommonTopologyUIJME3Package.JME3_GEOMETRY:
				return createJME3GeometryFromString(eDataType, initialValue);
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
			case Symphony__CommonTopologyUIJME3Package.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case Symphony__CommonTopologyUIJME3Package.COLOR_RGBA:
				return convertColorRGBAToString(eDataType, instanceValue);
			case Symphony__CommonTopologyUIJME3Package.JME_VECTOR3F:
				return convertJMEVector3fToString(eDataType, instanceValue);
			case Symphony__CommonTopologyUIJME3Package.VECTOR3F:
				return convertVector3fToString(eDataType, instanceValue);
			case Symphony__CommonTopologyUIJME3Package.JME3_SCENE_OBJECT:
				return convertJME3SceneObjectToString(eDataType, instanceValue);
			case Symphony__CommonTopologyUIJME3Package.JME3_NODE:
				return convertJME3NodeToString(eDataType, instanceValue);
			case Symphony__CommonTopologyUIJME3Package.JME3_GEOMETRY:
				return convertJME3GeometryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JME3TypeFactory createJME3TypeFactory() {
		JME3TypeFactoryImpl jme3TypeFactory = new JME3TypeFactoryImpl();
		return jme3TypeFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f createColor3fFromString(EDataType eDataType, String initialValue) {
		return (Color3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColor3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorRGBA createColorRGBAFromString(EDataType eDataType, String initialValue) {
		return (ColorRGBA)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorRGBAToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3f createJMEVector3fFromString(EDataType eDataType, String initialValue) {
		return (Vector3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJMEVector3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.vecmath.Vector3f createVector3fFromString(EDataType eDataType, String initialValue) {
		return (javax.vecmath.Vector3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVector3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JME3SceneObject createJME3SceneObjectFromString(EDataType eDataType, String initialValue) {
		return (JME3SceneObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJME3SceneObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createJME3NodeFromString(EDataType eDataType, String initialValue) {
		return (Node)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJME3NodeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createJME3GeometryFromString(EDataType eDataType, String initialValue) {
		return (Geometry)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJME3GeometryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonTopologyUIJME3Package getSymphony__CommonTopologyUIJME3Package() {
		return (Symphony__CommonTopologyUIJME3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonTopologyUIJME3Package getPackage() {
		return Symphony__CommonTopologyUIJME3Package.eINSTANCE;
	}

} //Symphony__CommonTopologyUIJME3FactoryImpl