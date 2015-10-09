/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data25d;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.geometry.data25d.Data25dPackage
 * @generated
 */
public interface Data25dFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Data25dFactory eINSTANCE = org.eclipse.symphony.common.geometry.data25d.impl.Data25dFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coordinates25 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates25 D</em>'.
	 * @generated
	 */
	Coordinates25D createCoordinates25D();

	/**
	 * Returns a new object of class '<em>Coordinates Set25 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates Set25 D</em>'.
	 * @generated
	 */
	CoordinatesSet25D createCoordinatesSet25D();

	/**
	 * Returns a new object of class '<em>Volumetric Coordinates Set25 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volumetric Coordinates Set25 D</em>'.
	 * @generated
	 */
	VolumetricCoordinatesSet25D createVolumetricCoordinatesSet25D();

	/**
	 * Returns a new object of class '<em>Polygon25 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon25 D</em>'.
	 * @generated
	 */
	Polygon25D createPolygon25D();

	/**
	 * Returns a new object of class '<em>Mesh25 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh25 D</em>'.
	 * @generated
	 */
	Mesh25D createMesh25D();

	/**
	 * Returns a new object of class '<em>Volumetric Mesh25 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volumetric Mesh25 D</em>'.
	 * @generated
	 */
	VolumetricMesh25D createVolumetricMesh25D();

	/**
	 * Returns a new object of class '<em>Data Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Facade</em>'.
	 * @generated
	 */
	DataFacade createDataFacade();

	/**
	 * Returns a new object of class '<em>Data25 DIO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data25 DIO</em>'.
	 * @generated
	 */
	Data25DIO createData25DIO();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Data25dPackage getData25dPackage();

} //Data25dFactory