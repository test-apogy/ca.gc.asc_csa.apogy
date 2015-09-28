/**
 * Canadian Space Agency 2008
 *
 * $Id: PolygonSamplingShapeImpl.java,v 1.2.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data.Coordinates;
import ca.gc.space.mrt.geometry.data.DataPackage;
import ca.gc.space.mrt.geometry.data.Polygon;
import ca.gc.space.mrt.geometry.data.PolygonSamplingShape;

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
