/**
 * Canadian Space Agency 2007.
 *
 * $Id: VolumetricCoordinatesSet25DImpl.java,v 1.5.4.3 2015/09/22 19:39:38 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.geometry.data25d.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.geometry.data25d.Coordinates25D;
import org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DPackage;
import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volumetric Coordinates Set25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VolumetricCoordinatesSet25DImpl extends CoordinatesSet25DImpl implements VolumetricCoordinatesSet25D
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumetricCoordinatesSet25DImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__CommonGeometryData25DPackage.Literals.VOLUMETRIC_COORDINATES_SET25_D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianPositionCoordinates getCartesianPositionCoordinates(Coordinates25D coordinates)
	{
		return Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(coordinates.getU(), coordinates.getV(), coordinates.getW());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Symphony__CommonGeometryData25DPackage.VOLUMETRIC_COORDINATES_SET25_D___GET_CARTESIAN_POSITION_COORDINATES__COORDINATES25D:
				return getCartesianPositionCoordinates((Coordinates25D)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //VolumetricCoordinatesSet25DImpl
