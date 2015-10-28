/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.asc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.geometry.data3d.asc.Symphony__CommonGeometryData3DASCPackage
 * @generated
 */
public interface Symphony__CommonGeometryData3DASCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CommonGeometryData3DASCFactory eINSTANCE = org.eclipse.symphony.common.geometry.data3d.asc.impl.Symphony__CommonGeometryData3DASCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ASC3DIO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASC3DIO</em>'.
	 * @generated
	 */
	ASC3DIO createASC3DIO();

	/**
	 * Returns a new object of class '<em>ASC Header Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASC Header Data</em>'.
	 * @generated
	 */
	ASCHeaderData createASCHeaderData();

	/**
	 * Returns a new object of class '<em>Coordinates2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates2 D</em>'.
	 * @generated
	 */
	Coordinates2D createCoordinates2D();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CommonGeometryData3DASCPackage getSymphony__CommonGeometryData3DASCPackage();

} //Symphony__CommonGeometryData3DASCFactory