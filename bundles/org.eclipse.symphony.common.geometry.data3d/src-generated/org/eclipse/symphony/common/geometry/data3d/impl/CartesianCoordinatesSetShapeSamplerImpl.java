/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianCoordinatesSetShapeSamplerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data.CoordinatesSet;
import org.eclipse.symphony.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetShapeSampler;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Data3dFacade;
import org.eclipse.symphony.common.geometry.data3d.Data3dFactory;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Set Shape Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CartesianCoordinatesSetShapeSamplerImpl extends CoordinatesSetShapesSamplerImpl<CartesianPositionCoordinates> implements CartesianCoordinatesSetShapeSampler {
	private static Data3dFacade data3dFacade = Data3dFactory.eINSTANCE.createData3dFacade();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetShapeSamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER;
	}
	
	@Override
	protected CoordinatesSet<CartesianPositionCoordinates> createCoordinatesSet(CoordinatesSet<CartesianPositionCoordinates> input)
	{
		return Data3dFactory.eINSTANCE.createCartesianCoordinatesSet();
	}
	
	@Override
	protected CartesianPositionCoordinates copyCoordinates(
			CartesianPositionCoordinates point) 
	{		
		return data3dFacade.createCartesianPositionCoordinates(point);
	}
	
} //CartesianCoordinatesSetShapeSamplerImpl
