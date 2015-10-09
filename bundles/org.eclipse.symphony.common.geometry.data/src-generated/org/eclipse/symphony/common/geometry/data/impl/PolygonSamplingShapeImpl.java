/**
 * Canadian Space Agency 2008
 *
 * $Id: PolygonSamplingShapeImpl.java,v 1.2.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.common.geometry.data.Coordinates;
import org.eclipse.symphony.common.geometry.data.DataPackage;
import org.eclipse.symphony.common.geometry.data.Polygon;
import org.eclipse.symphony.common.geometry.data.PolygonSamplingShape;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PolygonSamplingShapeImpl<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends EObjectImpl implements PolygonSamplingShape<CoordinatesType, PolygonType>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonSamplingShapeImpl()
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
		return DataPackage.Literals.POLYGON_SAMPLING_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPolygonInside(PolygonType polygon)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //PolygonSamplingShapeImpl
