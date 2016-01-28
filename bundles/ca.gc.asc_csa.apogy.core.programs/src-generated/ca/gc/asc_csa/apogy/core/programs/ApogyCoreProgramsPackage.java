/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.programs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CorePrograms' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Symphony__CorePrograms' modelDirectory='/org.eclipse.symphony.core.programs/src-generated' editDirectory='/org.eclipse.symphony.core.programs.edit/src-generated' basePackage='org.eclipse.symphony.core'"
 * @generated
 */
public interface Symphony__CoreProgramsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.core.programs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "programs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__CoreProgramsPackage eINSTANCE = org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.impl.AbstractProgramRuntimeImpl <em>Abstract Program Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.impl.AbstractProgramRuntimeImpl
	 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsPackageImpl#getAbstractProgramRuntime()
	 * @generated
	 */
	int ABSTRACT_PROGRAM_RUNTIME = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME__PROGRAM = 0;

	/**
	 * The number of structural features of the '<em>Abstract Program Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___RESUME = 0;

	/**
	 * The operation id for the '<em>Suspend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___SUSPEND = 1;

	/**
	 * The operation id for the '<em>Terminate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___TERMINATE = 2;

	/**
	 * The operation id for the '<em>Step Into</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___STEP_INTO = 3;

	/**
	 * The operation id for the '<em>Step Over</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___STEP_OVER = 4;

	/**
	 * The operation id for the '<em>Step Return</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME___STEP_RETURN = 5;

	/**
	 * The number of operations of the '<em>Abstract Program Runtime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROGRAM_RUNTIME_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsFacadeImpl
	 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsPackageImpl#getSymphony__CoreProgramsFacade()
	 * @generated
	 */
	int SYMPHONY_CORE_PROGRAMS_FACADE = 1;

	/**
	 * The feature id for the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_PROGRAMS_FACADE__SESSION = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_PROGRAMS_FACADE__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_PROGRAMS_FACADE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_PROGRAMS_FACADE___EXEC__OPERATIONCALL = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_CORE_PROGRAMS_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.core.programs.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.programs.impl.TimeIntervalImpl
	 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsPackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__DURATION = 2;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime <em>Abstract Program Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Program Runtime</em>'.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime
	 * @generated
	 */
	EClass getAbstractProgramRuntime();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime#getProgram()
	 * @see #getAbstractProgramRuntime()
	 * @generated
	 */
	EReference getAbstractProgramRuntime_Program();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime#resume()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Resume();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime#suspend() <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime#suspend()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Suspend();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime#terminate()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Terminate();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime#stepInto() <em>Step Into</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Into</em>' operation.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime#stepInto()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepInto();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime#stepOver() <em>Step Over</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Over</em>' operation.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime#stepOver()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepOver();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.AbstractProgramRuntime#stepReturn() <em>Step Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Return</em>' operation.
	 * @see org.eclipse.symphony.core.programs.AbstractProgramRuntime#stepReturn()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepReturn();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade
	 * @generated
	 */
	EClass getSymphony__CoreProgramsFacade();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session</em>'.
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade#getSession()
	 * @see #getSymphony__CoreProgramsFacade()
	 * @generated
	 */
	EReference getSymphony__CoreProgramsFacade_Session();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade#getVariables()
	 * @see #getSymphony__CoreProgramsFacade()
	 * @generated
	 */
	EReference getSymphony__CoreProgramsFacade_Variables();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade#exec(org.eclipse.symphony.core.invocator.OperationCall) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see org.eclipse.symphony.core.programs.Symphony__CoreProgramsFacade#exec(org.eclipse.symphony.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getSymphony__CoreProgramsFacade__Exec__OperationCall();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.programs.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see org.eclipse.symphony.core.programs.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.TimeInterval#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.eclipse.symphony.core.programs.TimeInterval#getStartTime()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.TimeInterval#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.eclipse.symphony.core.programs.TimeInterval#getEndTime()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.programs.TimeInterval#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.symphony.core.programs.TimeInterval#getDuration()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_Duration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__CoreProgramsFactory getSymphony__CoreProgramsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.impl.AbstractProgramRuntimeImpl <em>Abstract Program Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.impl.AbstractProgramRuntimeImpl
		 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsPackageImpl#getAbstractProgramRuntime()
		 * @generated
		 */
		EClass ABSTRACT_PROGRAM_RUNTIME = eINSTANCE.getAbstractProgramRuntime();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PROGRAM_RUNTIME__PROGRAM = eINSTANCE.getAbstractProgramRuntime_Program();

		/**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___RESUME = eINSTANCE.getAbstractProgramRuntime__Resume();

		/**
		 * The meta object literal for the '<em><b>Suspend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___SUSPEND = eINSTANCE.getAbstractProgramRuntime__Suspend();

		/**
		 * The meta object literal for the '<em><b>Terminate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___TERMINATE = eINSTANCE.getAbstractProgramRuntime__Terminate();

		/**
		 * The meta object literal for the '<em><b>Step Into</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___STEP_INTO = eINSTANCE.getAbstractProgramRuntime__StepInto();

		/**
		 * The meta object literal for the '<em><b>Step Over</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___STEP_OVER = eINSTANCE.getAbstractProgramRuntime__StepOver();

		/**
		 * The meta object literal for the '<em><b>Step Return</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_PROGRAM_RUNTIME___STEP_RETURN = eINSTANCE.getAbstractProgramRuntime__StepReturn();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsFacadeImpl
		 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsPackageImpl#getSymphony__CoreProgramsFacade()
		 * @generated
		 */
		EClass SYMPHONY_CORE_PROGRAMS_FACADE = eINSTANCE.getSymphony__CoreProgramsFacade();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_CORE_PROGRAMS_FACADE__SESSION = eINSTANCE.getSymphony__CoreProgramsFacade_Session();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMPHONY_CORE_PROGRAMS_FACADE__VARIABLES = eINSTANCE.getSymphony__CoreProgramsFacade_Variables();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_CORE_PROGRAMS_FACADE___EXEC__OPERATIONCALL = eINSTANCE.getSymphony__CoreProgramsFacade__Exec__OperationCall();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.programs.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.programs.impl.TimeIntervalImpl
		 * @see org.eclipse.symphony.core.programs.impl.Symphony__CoreProgramsPackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__START_TIME = eINSTANCE.getTimeInterval_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__END_TIME = eINSTANCE.getTimeInterval_EndTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__DURATION = eINSTANCE.getTimeInterval_Duration();

	}

} //Symphony__CoreProgramsPackage
