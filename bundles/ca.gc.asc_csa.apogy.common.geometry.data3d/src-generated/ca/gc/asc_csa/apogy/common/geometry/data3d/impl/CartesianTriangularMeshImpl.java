package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.MeshImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetExtent;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Triangular Mesh</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianTriangularMeshImpl extends MeshImpl<CartesianPositionCoordinates, CartesianTriangle> implements
		CartesianTriangularMesh {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMeshImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_TRIANGULAR_MESH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<CartesianTriangle> getPolygons() {
		if (polygons == null) {
			polygons = new EObjectContainmentEList<CartesianTriangle>(CartesianTriangle.class, this, ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH__POLYGONS);
		}
		return polygons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianCoordinatesSetExtent getExtent() 
	{
		return Geometry3DUtilities.getCartesianCoordinatesSetExtent(getPoints());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractCartesianCoordinatesSet.class) {
			switch (baseOperationID) {
				case ApogyCommonGeometryData3DPackage.ABSTRACT_CARTESIAN_COORDINATES_SET___GET_EXTENT: return ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH___GET_EXTENT;
				default: return -1;
			}
		}
		if (baseClass == CartesianCoordinatesSet.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH___GET_EXTENT:
				return getExtent();
		}
		return super.eInvoke(operationID, arguments);
	}

//	@Override
//	public boolean equals(Object obj) {
//	
//		boolean equals = false;		
//		if (super.equals(obj) && obj instanceof CartesianTriangularMesh)
//		{
//			CartesianTriangularMesh mesh = (CartesianTriangularMesh) obj;
//			equals = (mesh.getPoints().size() == this.getPoints().size());
//			
//			// Checks to ensure all the point are the same.
//			if(equals)
//			{				
//				int j = 0;
//				while((j < mesh.getPoints().size()) && (equals))
//				{
//					equals = mesh.getPoints().get(j).equals(this.getPoints().get(j));
//					j++;
//				}
//			}
//		}
//					
//		return equals;
//	}
} // TriangularMeshImpl
