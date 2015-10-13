/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.obsolete.mrt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.common.obsolete.mrt.CommonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Common' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Common' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.common.obsolete.mrt/src-generated' editDirectory='/org.eclipse.symphony.common.obsolete.mrt.edit/src-generated' basePackage='org.eclipse.symphony.common.obsolete'"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mrt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.obsolete.mrt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mrt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.obsolete.mrt.impl.TimeTaggedElementImpl <em>Time Tagged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.obsolete.mrt.impl.TimeTaggedElementImpl
	 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getTimeTaggedElement()
	 * @generated
	 */
	int TIME_TAGGED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TAGGED_ELEMENT__TIME = 0;

	/**
	 * The number of structural features of the '<em>Time Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TAGGED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Time Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TAGGED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.obsolete.mrt.impl.StartableImpl <em>Startable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.obsolete.mrt.impl.StartableImpl
	 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getStartable()
	 * @generated
	 */
	int STARTABLE = 2;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE__STARTED = 0;

	/**
	 * The number of structural features of the '<em>Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Startable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STARTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.obsolete.mrt.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.obsolete.mrt.impl.ServerImpl
	 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 1;

	/**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__STARTED = STARTABLE__STARTED;

	/**
	 * The feature id for the '<em><b>Server Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__SERVER_JOB = STARTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = STARTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = STARTABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Job</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 3;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.obsolete.mrt.TimeTaggedElement <em>Time Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Tagged Element</em>'.
	 * @see org.eclipse.symphony.common.obsolete.mrt.TimeTaggedElement
	 * @generated
	 */
	EClass getTimeTaggedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.obsolete.mrt.TimeTaggedElement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.symphony.common.obsolete.mrt.TimeTaggedElement#getTime()
	 * @see #getTimeTaggedElement()
	 * @generated
	 */
	EAttribute getTimeTaggedElement_Time();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.obsolete.mrt.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.eclipse.symphony.common.obsolete.mrt.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.obsolete.mrt.Server#getServerJob <em>Server Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Job</em>'.
	 * @see org.eclipse.symphony.common.obsolete.mrt.Server#getServerJob()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerJob();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.obsolete.mrt.Startable <em>Startable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startable</em>'.
	 * @see org.eclipse.symphony.common.obsolete.mrt.Startable
	 * @generated
	 */
	EClass getStartable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.obsolete.mrt.Startable#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see org.eclipse.symphony.common.obsolete.mrt.Startable#isStarted()
	 * @see #getStartable()
	 * @generated
	 */
	EAttribute getStartable_Started();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.jobs.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Job</em>'.
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @model instanceClass="org.eclipse.core.runtime.jobs.Job"
	 * @generated
	 */
	EDataType getJob();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.obsolete.mrt.impl.TimeTaggedElementImpl <em>Time Tagged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.obsolete.mrt.impl.TimeTaggedElementImpl
		 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getTimeTaggedElement()
		 * @generated
		 */
		EClass TIME_TAGGED_ELEMENT = eINSTANCE.getTimeTaggedElement();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TAGGED_ELEMENT__TIME = eINSTANCE.getTimeTaggedElement_Time();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.obsolete.mrt.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.obsolete.mrt.impl.ServerImpl
		 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Server Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER__SERVER_JOB = eINSTANCE.getServer_ServerJob();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.obsolete.mrt.impl.StartableImpl <em>Startable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.obsolete.mrt.impl.StartableImpl
		 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getStartable()
		 * @generated
		 */
		EClass STARTABLE = eINSTANCE.getStartable();

		/**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STARTABLE__STARTED = eINSTANCE.getStartable_Started();

		/**
		 * The meta object literal for the '<em>Job</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.jobs.Job
		 * @see org.eclipse.symphony.common.obsolete.mrt.impl.CommonPackageImpl#getJob()
		 * @generated
		 */
		EDataType JOB = eINSTANCE.getJob();

	}

} //CommonPackage
