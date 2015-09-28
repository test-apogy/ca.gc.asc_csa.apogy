/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceFactoryImpl.java,v 1.3.4.3 2015/09/22 19:39:39 rlarcheveque Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFacade;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFactory;
import ca.gc.space.mrt.geometry.data3d.persistence.PersistencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceFactoryImpl extends EFactoryImpl implements PersistenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersistenceFactory init() {
		try {
			PersistenceFactory thePersistenceFactory = (PersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(PersistencePackage.eNS_URI);
			if (thePersistenceFactory != null) {
				return thePersistenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersistenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PersistencePackage.MEMORY_CARTESIAN_COORDINATES_SET_SOURCE: return createMemoryCartesianCoordinatesSetSource();
			case PersistencePackage.FILE_CARTESIAN_COORDINATES_SET_SOURCE: return createFileCartesianCoordinatesSetSource();
			case PersistencePackage.PERSISTENCE_FACADE: return createPersistenceFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryCartesianCoordinatesSetSource createMemoryCartesianCoordinatesSetSource() {
		MemoryCartesianCoordinatesSetSourceImpl memoryCartesianCoordinatesSetSource = new MemoryCartesianCoordinatesSetSourceImpl();
		return memoryCartesianCoordinatesSetSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileCartesianCoordinatesSetSource createFileCartesianCoordinatesSetSource() {
		FileCartesianCoordinatesSetSourceImpl fileCartesianCoordinatesSetSource = new FileCartesianCoordinatesSetSourceImpl();
		return fileCartesianCoordinatesSetSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFacade createPersistenceFacade() {
		PersistenceFacadeImpl persistenceFacade = new PersistenceFacadeImpl();
		return persistenceFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistencePackage getPersistencePackage() {
		return (PersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersistencePackage getPackage() {
		return PersistencePackage.eINSTANCE;
	}

} //PersistenceFactoryImpl
