package ca.gc.asc_csa.apogy.common.topology.ui.jme3.impl;
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

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Color3f;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.ApogyCommonTopologyUIJME3Package;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3TypeFactory;

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
		return ApogyCommonTopologyUIJME3Package.Literals.JME3_TYPE_FACTORY;
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
			case ApogyCommonTopologyUIJME3Package.JME3_TYPE_FACTORY___CREATE_COLOR_RGBA__COLOR3F:
				return createColorRGBA((Color3f)arguments.get(0));
			case ApogyCommonTopologyUIJME3Package.JME3_TYPE_FACTORY___CREATE_VECTOR3F__VECTOR3F:
				return createVector3f((javax.vecmath.Vector3f)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // JME3TypeFactoryImpl
