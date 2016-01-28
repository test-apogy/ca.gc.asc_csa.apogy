/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage
 * @generated
 */
public interface ApogyCommonGeometryData3DUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonGeometryData3DUIFactory eINSTANCE = ca.gc.asc_csa.apogy.common.geometry.data3d.ui.impl.ApogyCommonGeometryData3DUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cartesian Coordinates Set Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Coordinates Set Presentation</em>'.
	 * @generated
	 */
	CartesianCoordinatesSetPresentation createCartesianCoordinatesSetPresentation();

	/**
	 * Returns a new object of class '<em>Triangular Mesh Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangular Mesh Presentation</em>'.
	 * @generated
	 */
	TriangularMeshPresentation createTriangularMeshPresentation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonGeometryData3DUIPackage getApogyCommonGeometryData3DUIPackage();

} //ApogyCommonGeometryData3DUIFactory
