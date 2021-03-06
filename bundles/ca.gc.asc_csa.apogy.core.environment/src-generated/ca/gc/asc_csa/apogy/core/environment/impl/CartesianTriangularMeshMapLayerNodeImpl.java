package ca.gc.asc_csa.apogy.core.environment.impl;
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Triangular Mesh Map Layer Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianTriangularMeshMapLayerNodeImpl extends AbstractMapLayerNodeImpl implements CartesianTriangularMeshMapLayerNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshMapLayerNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianTriangularMeshMapLayer getCartesianTriangularMeshMapLayer() 
	{
		if(getAbstractMapLayer() instanceof CartesianTriangularMeshMapLayer)
		{
			return (CartesianTriangularMeshMapLayer) getAbstractMapLayer();
		}
		else
		{
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER:
				return getCartesianTriangularMeshMapLayer();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CartesianTriangularMeshMapLayerNodeImpl
