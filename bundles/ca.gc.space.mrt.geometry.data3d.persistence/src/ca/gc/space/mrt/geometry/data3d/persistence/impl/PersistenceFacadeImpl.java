/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceFacadeImpl.java,v 1.2.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFacade;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFactory;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PersistenceFacadeImpl extends EObjectImpl implements
		PersistenceFacade {

	private static PersistenceFacade instance = null;

	public static PersistenceFacade getInstance() {
		if (instance == null) {
			instance = new PersistenceFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.PERSISTENCE_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public FileCartesianCoordinatesSetSource createFileCartesianCoordinatesSetSource(
			String fileName) {

		FileCartesianCoordinatesSetSource source = PersistenceFactory.eINSTANCE
				.createFileCartesianCoordinatesSetSource();

		source.setFileName(fileName);

		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public MemoryCartesianCoordinatesSetSource createMemoryCoordinatesSetSource(
			CartesianCoordinatesSet dataSet) {

		MemoryCartesianCoordinatesSetSource source = PersistenceFactory.eINSTANCE
				.createMemoryCartesianCoordinatesSetSource();

		source.setInternalDataSet(dataSet);

		return source;
	}

} // PersistenceFacadeImpl
