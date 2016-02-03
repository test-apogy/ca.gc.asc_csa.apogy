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

import javax.vecmath.Color3f;

import org.eclipse.emf.ecore.EObject;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Type Factory</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.ApogyCommonTopologyUIJME3Package#getJME3TypeFactory()
 * @model
 * @generated
 */
public interface JME3TypeFactory extends EObject {

	public JME3TypeFactory INSTANCE = ApogyCommonTopologyUIJME3Factory.eINSTANCE
			.createJME3TypeFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.ColorRGBA" unique="false" colorDataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.Color3f" colorUnique="false"
	 * @generated
	 */
	ColorRGBA createColorRGBA(Color3f color);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.JMEVector3f" unique="false" vectorDataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.Vector3f" vectorUnique="false"
	 * @generated
	 */
	Vector3f createVector3f(javax.vecmath.Vector3f vector);

} // JME3TypeFactory
