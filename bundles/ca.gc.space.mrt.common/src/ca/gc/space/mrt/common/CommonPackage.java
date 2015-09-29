/**
 * Canadian Space Agency 2008.
 *
 * $Id: CommonPackage.java,v 1.6.4.2 2015/05/21 15:50:23 pallard Exp $
 */
package ca.gc.space.mrt.common;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/mrt/common/model/mrt_common.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = ca.gc.space.mrt.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.impl.TimeTaggedElementImpl <em>Time Tagged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.impl.TimeTaggedElementImpl
	 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getTimeTaggedElement()
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
	 * The meta object id for the '{@link ca.gc.space.mrt.common.impl.StartableImpl <em>Startable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.impl.StartableImpl
	 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getStartable()
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
	 * The meta object id for the '{@link ca.gc.space.mrt.common.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.impl.ServerImpl
	 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getServer()
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
	 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 3;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.TimeTaggedElement <em>Time Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Tagged Element</em>'.
	 * @see ca.gc.space.mrt.common.TimeTaggedElement
	 * @generated
	 */
	EClass getTimeTaggedElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.TimeTaggedElement#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see ca.gc.space.mrt.common.TimeTaggedElement#getTime()
	 * @see #getTimeTaggedElement()
	 * @generated
	 */
	EAttribute getTimeTaggedElement_Time();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see ca.gc.space.mrt.common.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.Server#getServerJob <em>Server Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Job</em>'.
	 * @see ca.gc.space.mrt.common.Server#getServerJob()
	 * @see #getServer()
	 * @generated
	 */
	EAttribute getServer_ServerJob();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.Startable <em>Startable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Startable</em>'.
	 * @see ca.gc.space.mrt.common.Startable
	 * @generated
	 */
	EClass getStartable();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.Startable#isStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see ca.gc.space.mrt.common.Startable#isStarted()
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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.impl.TimeTaggedElementImpl <em>Time Tagged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.impl.TimeTaggedElementImpl
		 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getTimeTaggedElement()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.impl.ServerImpl
		 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getServer()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.impl.StartableImpl <em>Startable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.impl.StartableImpl
		 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getStartable()
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
		 * @see ca.gc.space.mrt.common.impl.CommonPackageImpl#getJob()
		 * @generated
		 */
		EDataType JOB = eINSTANCE.getJob();

	}

} //CommonPackage
