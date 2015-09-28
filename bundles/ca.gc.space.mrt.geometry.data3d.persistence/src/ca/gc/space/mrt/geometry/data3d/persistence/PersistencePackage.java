/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistencePackage.java,v 1.2.4.2 2015/05/21 15:51:05 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/mrt/geometry/data3d/persistence.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.geometry.data3d";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.CartesianCoordinatesSetSourceImpl <em>Cartesian Coordinates Set Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.CartesianCoordinatesSetSourceImpl
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getCartesianCoordinatesSetSource()
	 * @generated
	 */
	int CARTESIAN_COORDINATES_SET_SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET = 0;

	/**
	 * The number of structural features of the '<em>Cartesian Coordinates Set Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_COORDINATES_SET_SOURCE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.MemoryCartesianCoordinatesSetSourceImpl <em>Memory Cartesian Coordinates Set Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.MemoryCartesianCoordinatesSetSourceImpl
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getMemoryCartesianCoordinatesSetSource()
	 * @generated
	 */
	int MEMORY_CARTESIAN_COORDINATES_SET_SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET = CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET;

	/**
	 * The feature id for the '<em><b>Internal Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET = CARTESIAN_COORDINATES_SET_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Cartesian Coordinates Set Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_CARTESIAN_COORDINATES_SET_SOURCE_FEATURE_COUNT = CARTESIAN_COORDINATES_SET_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.FileCartesianCoordinatesSetSourceImpl <em>File Cartesian Coordinates Set Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.FileCartesianCoordinatesSetSourceImpl
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getFileCartesianCoordinatesSetSource()
	 * @generated
	 */
	int FILE_CARTESIAN_COORDINATES_SET_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET = CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME = CARTESIAN_COORDINATES_SET_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Cartesian Coordinates Set Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CARTESIAN_COORDINATES_SET_SOURCE_FEATURE_COUNT = CARTESIAN_COORDINATES_SET_SOURCE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistenceFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistenceFacadeImpl
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getPersistenceFacade()
	 * @generated
	 */
	int PERSISTENCE_FACADE = 3;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_FACADE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource <em>Cartesian Coordinates Set Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Coordinates Set Source</em>'.
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource
	 * @generated
	 */
	EClass getCartesianCoordinatesSetSource();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource#getDataSet <em>Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Set</em>'.
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.CartesianCoordinatesSetSource#getDataSet()
	 * @see #getCartesianCoordinatesSetSource()
	 * @generated
	 */
	EReference getCartesianCoordinatesSetSource_DataSet();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource <em>Memory Cartesian Coordinates Set Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Cartesian Coordinates Set Source</em>'.
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource
	 * @generated
	 */
	EClass getMemoryCartesianCoordinatesSetSource();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource#getInternalDataSet <em>Internal Data Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Internal Data Set</em>'.
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.MemoryCartesianCoordinatesSetSource#getInternalDataSet()
	 * @see #getMemoryCartesianCoordinatesSetSource()
	 * @generated
	 */
	EReference getMemoryCartesianCoordinatesSetSource_InternalDataSet();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource <em>File Cartesian Coordinates Set Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Cartesian Coordinates Set Source</em>'.
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource
	 * @generated
	 */
	EClass getFileCartesianCoordinatesSetSource();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.FileCartesianCoordinatesSetSource#getFileName()
	 * @see #getFileCartesianCoordinatesSetSource()
	 * @generated
	 */
	EAttribute getFileCartesianCoordinatesSetSource_FileName();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.space.mrt.geometry.data3d.persistence.PersistenceFacade
	 * @generated
	 */
	EClass getPersistenceFacade();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.CartesianCoordinatesSetSourceImpl <em>Cartesian Coordinates Set Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.CartesianCoordinatesSetSourceImpl
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getCartesianCoordinatesSetSource()
		 * @generated
		 */
		EClass CARTESIAN_COORDINATES_SET_SOURCE = eINSTANCE.getCartesianCoordinatesSetSource();

		/**
		 * The meta object literal for the '<em><b>Data Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_COORDINATES_SET_SOURCE__DATA_SET = eINSTANCE.getCartesianCoordinatesSetSource_DataSet();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.MemoryCartesianCoordinatesSetSourceImpl <em>Memory Cartesian Coordinates Set Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.MemoryCartesianCoordinatesSetSourceImpl
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getMemoryCartesianCoordinatesSetSource()
		 * @generated
		 */
		EClass MEMORY_CARTESIAN_COORDINATES_SET_SOURCE = eINSTANCE.getMemoryCartesianCoordinatesSetSource();

		/**
		 * The meta object literal for the '<em><b>Internal Data Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_CARTESIAN_COORDINATES_SET_SOURCE__INTERNAL_DATA_SET = eINSTANCE.getMemoryCartesianCoordinatesSetSource_InternalDataSet();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.FileCartesianCoordinatesSetSourceImpl <em>File Cartesian Coordinates Set Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.FileCartesianCoordinatesSetSourceImpl
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getFileCartesianCoordinatesSetSource()
		 * @generated
		 */
		EClass FILE_CARTESIAN_COORDINATES_SET_SOURCE = eINSTANCE.getFileCartesianCoordinatesSetSource();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_CARTESIAN_COORDINATES_SET_SOURCE__FILE_NAME = eINSTANCE.getFileCartesianCoordinatesSetSource_FileName();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistenceFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistenceFacadeImpl
		 * @see ca.gc.space.mrt.geometry.data3d.persistence.impl.PersistencePackageImpl#getPersistenceFacade()
		 * @generated
		 */
		EClass PERSISTENCE_FACADE = eINSTANCE.getPersistenceFacade();

	}

} //PersistencePackage
