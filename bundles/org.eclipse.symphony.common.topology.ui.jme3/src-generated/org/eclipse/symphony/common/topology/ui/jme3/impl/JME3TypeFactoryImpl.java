/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui.jme3.impl;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.topology.ui.jme3.Symphony__CommonTopologyUIJME3Package;
import org.eclipse.symphony.common.topology.ui.jme3.JME3TypeFactory;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Type Factory</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class JME3TypeFactoryImpl extends MinimalEObjectImpl.Container implements
		JME3TypeFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected JME3TypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonTopologyUIJME3Package.Literals.JME3_TYPE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public ColorRGBA createColorRGBA(Color3f color) {
		ColorRGBA jme3Color = new ColorRGBA(color.x, color.y, color.z, 1.0f);

		return jme3Color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Vector3f createVector3f(javax.vecmath.Vector3f vector) {
		Vector3f jmeVector = new Vector3f(vector.x, vector.y, vector.z);

		return jmeVector;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonTopologyUIJME3Package.JME3_TYPE_FACTORY___CREATE_COLOR_RGBA__COLOR3F:
				return createColorRGBA((Color3f)arguments.get(0));
			case Symphony__CommonTopologyUIJME3Package.JME3_TYPE_FACTORY___CREATE_VECTOR3F__VECTOR3F:
				return createVector3f((javax.vecmath.Vector3f)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // JME3TypeFactoryImpl
