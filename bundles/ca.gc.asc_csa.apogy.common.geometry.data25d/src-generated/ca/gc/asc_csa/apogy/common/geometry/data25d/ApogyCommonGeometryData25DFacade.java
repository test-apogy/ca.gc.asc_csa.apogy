/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data25d.impl.Symphony__CommonGeometryData25DFacadeImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data25d.Symphony__CommonGeometryData25DPackage#getSymphony__CommonGeometryData25DFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonGeometryData25DFacade extends EObject {
	
	public static Symphony__CommonGeometryData25DFacade INSTANCE = Symphony__CommonGeometryData25DFacadeImpl.getInstance();
	
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

} // Symphony__CommonGeometryData25DFacade
