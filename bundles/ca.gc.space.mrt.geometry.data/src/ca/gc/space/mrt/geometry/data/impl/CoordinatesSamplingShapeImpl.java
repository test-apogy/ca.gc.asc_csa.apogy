/**
 * Canadian Space Agency 2008
 *
 * $Id: CoordinatesSamplingShapeImpl.java,v 1.2.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data.Coordinates;
import ca.gc.space.mrt.geometry.data.CoordinatesSamplingShape;
import ca.gc.space.mrt.geometry.data.DataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinates Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CoordinatesSamplingShapeImpl<T extends Coordinates> extends EObjectImpl implements CoordinatesSamplingShape<T>
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinatesSamplingShapeImpl()
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
		return DataPackage.Literals.COORDINATES_SAMPLING_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInside(T point)
	{
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //CoordinatesSamplingShapeImpl
