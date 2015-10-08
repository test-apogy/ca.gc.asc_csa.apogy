/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data25d;

import ca.gc.space.mrt.geometry.data25d.impl.DataFacadeImpl;
import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;

import org.eclipse.emf.ecore.EObject;

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
public interface DataFacade extends EObject {
	
	public static DataFacade INSTANCE = DataFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coordinates25DUnique="false"
	 * @generated
	 */
	Coordinates25D createCoordinates25D(Coordinates25D coordinates25D);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" uUnique="false" vUnique="false" wUnique="false"
	 * @generated
	 */
	Coordinates25D createCoordinates25D(double u, double v, double w);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" volumetricCoordinatesSet25DUnique="false"
	 * @generated
	 */
	<T extends VolumetricCoordinatesSet25D> CartesianCoordinatesSet createCartesianCoordinatesSet(T volumetricCoordinatesSet25D);

} // DataFacade
