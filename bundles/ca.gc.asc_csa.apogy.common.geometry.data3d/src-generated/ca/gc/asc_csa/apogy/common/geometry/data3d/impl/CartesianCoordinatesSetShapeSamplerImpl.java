/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianCoordinatesSetShapeSamplerImpl.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.impl;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data.impl.CoordinatesSetShapesSamplerImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetShapeSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Coordinates Set Shape Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CartesianCoordinatesSetShapeSamplerImpl extends CoordinatesSetShapesSamplerImpl<CartesianPositionCoordinates> implements CartesianCoordinatesSetShapeSampler {
	
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
		return ApogyCommonGeometryData3DPackage.Literals.CARTESIAN_COORDINATES_SET_SHAPE_SAMPLER;
	}
	
	@Override
	protected CoordinatesSet<CartesianPositionCoordinates> createCoordinatesSet(CoordinatesSet<CartesianPositionCoordinates> input)
	{
		return ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
	}
	
	@Override
	protected CartesianPositionCoordinates copyCoordinates(
			CartesianPositionCoordinates point) 
	{		
		return ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(point);
	}
	
} //CartesianCoordinatesSetShapeSamplerImpl
