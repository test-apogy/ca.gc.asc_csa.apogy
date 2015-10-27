/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.geometry.data3d.las.Symphony__CommonGeometryData3DLASPackage
 * @generated
 */
public interface Symphony__CommonGeometryData3DLASFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CommonGeometryData3DLASFactory eINSTANCE = org.eclipse.symphony.common.geometry.data3d.las.impl.Symphony__CommonGeometryData3DLASFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>LAS Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Header</em>'.
	 * @generated
	 */
	LASHeader createLASHeader();

	/**
	 * Returns a new object of class '<em>Variable Length Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Length Record</em>'.
	 * @generated
	 */
	VariableLengthRecord createVariableLengthRecord();

	/**
	 * Returns a new object of class '<em>LAS Reader</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Reader</em>'.
	 * @generated
	 */
	LASReader createLASReader();

	/**
	 * Returns a new object of class '<em>LAS Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Point</em>'.
	 * @generated
	 */
	LASPoint createLASPoint();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__CommonGeometryData3DLASFacade createSymphony__CommonGeometryData3DLASFacade();

	/**
	 * Returns a new object of class '<em>LAS Writer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LAS Writer</em>'.
	 * @generated
	 */
	LASWriter createLASWriter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CommonGeometryData3DLASPackage getSymphony__CommonGeometryData3DLASPackage();

} //Symphony__CommonGeometryData3DLASFactory
