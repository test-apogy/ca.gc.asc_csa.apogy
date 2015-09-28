/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceFacade.java,v 1.2.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistenceFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage#getPersistenceFacade()
 * @model
 * @generated
 */
public interface PersistenceFacade extends EObject {

	public static final PersistenceFacade INSTANCE = PersistenceFacadeImpl
			.getInstance();

	/**
	 * <!-- begin-user-doc --> Creates a
	 * {@link FileCartesianCoordinatesSetSource} and sets attribute
	 * {@link FileCartesianCoordinatesSetSource#setFileName(String)} with
	 * parameter 'fileName'. <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	FileCartesianCoordinatesSetSource createFileCartesianCoordinatesSetSource(
			String fileName);

	/**
	 * <!-- begin-user-doc --> Creates a
	 * {@link MemoryCartesianCoordinatesSetSource} and sets attribute
	 * {@link MemoryCartesianCoordinatesSetSource#setInternalDataSet(CartesianCoordinatesSet)}
	 * with the value 'dataSet'. <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MemoryCartesianCoordinatesSetSource createMemoryCoordinatesSetSource(
			CartesianCoordinatesSet dataSet);

} // PersistenceFacade
