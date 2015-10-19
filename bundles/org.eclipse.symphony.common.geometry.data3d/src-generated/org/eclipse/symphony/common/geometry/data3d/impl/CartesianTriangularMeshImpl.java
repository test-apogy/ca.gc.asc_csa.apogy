/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianTriangularMeshImpl.java,v 1.2.4.5 2015/09/22 19:39:41 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.symphony.common.geometry.data.impl.MeshImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;

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
		return Data3dPackage.Literals.CARTESIAN_TRIANGULAR_MESH;
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
			polygons = new EObjectContainmentEList<CartesianTriangle>(CartesianTriangle.class, this, Data3dPackage.CARTESIAN_TRIANGULAR_MESH__POLYGONS);
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
		return Geometry3dUtilities.getCartesianCoordinatesSetExtent(getPoints());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CartesianCoordinatesSet.class) {
			switch (baseOperationID) {
				case Data3dPackage.CARTESIAN_COORDINATES_SET___GET_EXTENT: return Data3dPackage.CARTESIAN_TRIANGULAR_MESH___GET_EXTENT;
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
			case Data3dPackage.CARTESIAN_TRIANGULAR_MESH___GET_EXTENT:
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
