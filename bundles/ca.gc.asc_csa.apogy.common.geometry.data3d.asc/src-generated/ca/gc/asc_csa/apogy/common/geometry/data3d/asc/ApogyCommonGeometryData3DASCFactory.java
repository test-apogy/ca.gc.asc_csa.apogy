/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.asc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCPackage
 * @generated
 */
public interface ApogyCommonGeometryData3DASCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryData3DASCFactory eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data3d.asc.impl.ApogyCommonGeometryData3DASCFactoryImpl.init();

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
	ApogyCommonGeometryData3DASCPackage getApogyCommonGeometryData3DASCPackage();

} //ApogyCommonGeometryData3DASCFactory
