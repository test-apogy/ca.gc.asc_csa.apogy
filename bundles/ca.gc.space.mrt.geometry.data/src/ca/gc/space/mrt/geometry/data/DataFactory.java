/**
 * Canadian Space Agency 2008
 *
 * $Id: DataFactory.java,v 1.4.4.2 2015/05/21 15:50:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.data.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataFactory eINSTANCE = ca.gc.space.mrt.geometry.data.impl.DataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates</em>'.
	 * @generated
	 */
	Coordinates createCoordinates();

	/**
	 * Returns a new object of class '<em>Coordinates Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates Set</em>'.
	 * @generated
	 */
	<T extends Coordinates> CoordinatesSet<T> createCoordinatesSet();

	/**
	 * Returns a new object of class '<em>Polygon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polygon</em>'.
	 * @generated
	 */
	<T extends Coordinates> Polygon<T> createPolygon();

	/**
	 * Returns a new object of class '<em>Mesh</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mesh</em>'.
	 * @generated
	 */
	<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> Mesh<CoordinatesType, PolygonType> createMesh();

	/**
	 * Returns a new object of class '<em>Coordinates Set Shapes Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates Set Shapes Sampler</em>'.
	 * @generated
	 */
	<T extends Coordinates> CoordinatesSetShapesSampler<T> createCoordinatesSetShapesSampler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataPackage getDataPackage();

} //DataFactory
