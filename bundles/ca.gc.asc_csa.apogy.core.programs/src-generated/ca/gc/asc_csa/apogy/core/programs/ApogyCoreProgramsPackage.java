package ca.gc.asc_csa.apogy.core.programs;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
 * <!-- begin-model-doc -->
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca),
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCorePrograms' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='ApogyCorePrograms' modelDirectory='/ca.gc.asc_csa.apogy.core.programs/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.programs.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.core'"
 * @generated
 */
public interface ApogyCoreProgramsPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.core.programs";

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
	ApogyCoreProgramsPackage eINSTANCE = ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.AbstractProgramRuntimeImpl <em>Abstract Program Runtime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.AbstractProgramRuntimeImpl
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getAbstractProgramRuntime()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getApogyCoreProgramsFacade()
	 * @generated
	 */
	int APOGY_CORE_PROGRAMS_FACADE = 1;

	/**
	 * The feature id for the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE__SESSION = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Exec</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE___EXEC__OPERATIONCALL = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_PROGRAMS_FACADE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.TimeIntervalImpl
	 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getTimeInterval()
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
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime <em>Abstract Program Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Program Runtime</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime
	 * @generated
	 */
	EClass getAbstractProgramRuntime();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#getProgram()
	 * @see #getAbstractProgramRuntime()
	 * @generated
	 */
	EReference getAbstractProgramRuntime_Program();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#resume()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Resume();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#suspend() <em>Suspend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#suspend()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Suspend();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#terminate() <em>Terminate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Terminate</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#terminate()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__Terminate();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#stepInto() <em>Step Into</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Into</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#stepInto()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepInto();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#stepOver() <em>Step Over</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Over</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#stepOver()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepOver();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#stepReturn() <em>Step Return</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Step Return</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.AbstractProgramRuntime#stepReturn()
	 * @generated
	 */
	EOperation getAbstractProgramRuntime__StepReturn();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade
	 * @generated
	 */
	EClass getApogyCoreProgramsFacade();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Session</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getSession()
	 * @see #getApogyCoreProgramsFacade()
	 * @generated
	 */
	EReference getApogyCoreProgramsFacade_Session();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#getVariables()
	 * @see #getApogyCoreProgramsFacade()
	 * @generated
	 */
	EReference getApogyCoreProgramsFacade_Variables();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall) <em>Exec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.programs.ApogyCoreProgramsFacade#exec(ca.gc.asc_csa.apogy.core.invocator.OperationCall)
	 * @generated
	 */
	EOperation getApogyCoreProgramsFacade__Exec__OperationCall();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.programs.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.programs.TimeInterval#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.TimeInterval#getStartTime()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.programs.TimeInterval#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.TimeInterval#getEndTime()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.core.programs.TimeInterval#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.TimeInterval#getDuration()
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
	ApogyCoreProgramsFactory getApogyCoreProgramsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.AbstractProgramRuntimeImpl <em>Abstract Program Runtime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.AbstractProgramRuntimeImpl
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getAbstractProgramRuntime()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getApogyCoreProgramsFacade()
		 * @generated
		 */
		EClass APOGY_CORE_PROGRAMS_FACADE = eINSTANCE.getApogyCoreProgramsFacade();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_CORE_PROGRAMS_FACADE__SESSION = eINSTANCE.getApogyCoreProgramsFacade_Session();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APOGY_CORE_PROGRAMS_FACADE__VARIABLES = eINSTANCE.getApogyCoreProgramsFacade_Variables();

		/**
		 * The meta object literal for the '<em><b>Exec</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_PROGRAMS_FACADE___EXEC__OPERATIONCALL = eINSTANCE.getApogyCoreProgramsFacade__Exec__OperationCall();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.programs.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.TimeIntervalImpl
		 * @see ca.gc.asc_csa.apogy.core.programs.impl.ApogyCoreProgramsPackageImpl#getTimeInterval()
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

} //ApogyCoreProgramsPackage
