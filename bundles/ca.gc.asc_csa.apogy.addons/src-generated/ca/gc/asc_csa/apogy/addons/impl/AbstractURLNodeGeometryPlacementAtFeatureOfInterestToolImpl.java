/**
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
package ca.gc.asc_csa.apogy.addons.impl;

import ca.gc.asc_csa.apogy.addons.AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.URLNode;

import java.lang.reflect.InvocationTargetException;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract URL Node Geometry Placement At Feature Of Interest Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.AbstractURLNodeGeometryPlacementAtFeatureOfInterestToolImpl#getCadTransformNode <em>Cad Transform Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.AbstractURLNodeGeometryPlacementAtFeatureOfInterestToolImpl#getUrlNode <em>Url Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractURLNodeGeometryPlacementAtFeatureOfInterestToolImpl extends GeometryPlacementAtFeatureOfInterestToolImpl implements AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool 
{
	private TransformNode cadTransformNode;
	private URLNode urlNode = null;

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractURLNodeGeometryPlacementAtFeatureOfInterestToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformNode getCadTransformNode() {
		TransformNode cadTransformNode = basicGetCadTransformNode();
		return cadTransformNode != null && cadTransformNode.eIsProxy() ? (TransformNode)eResolveProxy((InternalEObject)cadTransformNode) : cadTransformNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNode getUrlNode() {
		URLNode urlNode = basicGetUrlNode();
		return urlNode != null && urlNode.eIsProxy() ? (URLNode)eResolveProxy((InternalEObject)urlNode) : urlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public URLNode basicGetUrlNode() 
	{
		if(urlNode == null)
		{
			urlNode = ApogyCommonTopologyFactory.eINSTANCE.createURLNode();
			urlNode.setUrl(getGeometryURL());
		}
		
		return urlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TransformNode basicGetCadTransformNode() 
	{
		if(cadTransformNode == null)
		{
			cadTransformNode = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();
			cadTransformNode.setNodeId(getName());		
			if(getGeometryOffsets() != null)
			{
				cadTransformNode.setTransformation(getGeometryOffsets().asMatrix4d());
			}
			else
			{
				Matrix4d m = new Matrix4d();
				m.setIdentity();
				cadTransformNode.setTransformation(m);
			}
		}
		return cadTransformNode;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 getGeometryOffsets() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometryURL() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__CAD_TRANSFORM_NODE:
				if (resolve) return getCadTransformNode();
				return basicGetCadTransformNode();
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE:
				if (resolve) return getUrlNode();
				return basicGetUrlNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__CAD_TRANSFORM_NODE:
				return basicGetCadTransformNode() != null;
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE:
				return basicGetUrlNode() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL___GET_GEOMETRY_OFFSETS:
				return getGeometryOffsets();
			case ApogyAddonsPackage.ABSTRACT_URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL___GET_GEOMETRY_URL:
				return getGeometryURL();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public Node loadGeometry() 
	{
		getCadTransformNode().getChildren().add(getUrlNode());
		return getCadTransformNode();
	}
	

} //AbstractURLNodeGeometryPlacementAtFeatureOfInterestToolImpl
