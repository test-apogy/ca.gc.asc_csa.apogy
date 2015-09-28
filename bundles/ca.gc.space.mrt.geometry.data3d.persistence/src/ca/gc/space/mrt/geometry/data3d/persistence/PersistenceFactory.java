/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceFactory.java,v 1.2.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Memory Cartesian Coordinates Set Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Cartesian Coordinates Set Source</em>'.
	 * @generated
	 */
	MemoryCartesianCoordinatesSetSource createMemoryCartesianCoordinatesSetSource();

	/**
	 * Returns a new object of class '<em>File Cartesian Coordinates Set Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Cartesian Coordinates Set Source</em>'.
	 * @generated
	 */
	FileCartesianCoordinatesSetSource createFileCartesianCoordinatesSetSource();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	PersistenceFacade createPersistenceFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory
