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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

import com.jme3.scene.Geometry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scene Object Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.jme3.ApogyCommonTopologyUIJME3Package#getSceneObjectRegistry()
 * @model
 * @generated
 */
public interface SceneObjectRegistry extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model npUnique="false"
	 * @generated
	 */
	void register(NodePresentation np);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.SceneObject" unique="false" jme3GeometryDataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Geometry" jme3GeometryUnique="false"
	 * @generated
	 */
	SceneObject getSceneObject(Geometry jme3Geometry);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" jme3GeometryDataType="ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Geometry" jme3GeometryUnique="false"
	 * @generated
	 */
	NodePresentation getPresentationNode(Geometry jme3Geometry);

} // SceneObjectRegistry
