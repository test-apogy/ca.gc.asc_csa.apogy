/**
 * Canadian Space Agency 2007.
 *
 * $Id: DataFacade.java,v 1.4.4.2 2015/05/21 15:51:20 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data25d;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.data25d.impl.DataFacadeImpl;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data25d.Data25dPackage#getDataFacade()
 * @model
 * @generated
 */
public interface DataFacade extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";
	public static final DataFacade INSTANCE = DataFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Coordinates25D createCoordinates25D(Coordinates25D coordinates25D);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Coordinates25D createCoordinates25D(double u, double v, double w);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends VolumetricCoordinatesSet25D> CartesianCoordinatesSet createCartesianCoordinatesSet(T volumetricCoordinatesSet25D);

} // DataFacade
