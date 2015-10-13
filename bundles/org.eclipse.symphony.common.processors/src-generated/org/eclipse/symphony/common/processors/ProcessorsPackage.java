/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.processors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.eclipse.symphony.common.processors.ProcessorsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Processors' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='Processors' operationReflection='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.common.processors/src-generated' editDirectory='/org.eclipse.symphony.common.processors.edit/src-generated' basePackage='org.eclipse.symphony.common'"
 * @generated
 */
public interface ProcessorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "processors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.processors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "processors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessorsPackage eINSTANCE = org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.processors.Monitorable <em>Monitorable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.processors.Monitorable
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getMonitorable()
	 * @generated
	 */
	int MONITORABLE = 0;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE__PROGRESS_MONITOR = 0;

	/**
	 * The number of structural features of the '<em>Monitorable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Monitorable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.processors.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorImpl
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__PROGRESS_MONITOR = MONITORABLE__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__INPUT = MONITORABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OUTPUT = MONITORABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = MONITORABLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR___PROCESS__OBJECT = MONITORABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_OPERATION_COUNT = MONITORABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.processors.impl.ProcessorsChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsChainImpl
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getProcessorsChain()
	 * @generated
	 */
	int PROCESSORS_CHAIN = 2;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__PROGRESS_MONITOR = PROCESSOR__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__INPUT = PROCESSOR__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__OUTPUT = PROCESSOR__OUTPUT;

	/**
	 * The feature id for the '<em><b>Intermediate Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__INTERMEDIATE_RESULT = PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__RUNNING_PROCESSOR = PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__PROCESSORS = PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN_FEATURE_COUNT = PROCESSOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN___PROCESS__OBJECT = PROCESSOR___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN_OPERATION_COUNT = PROCESSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.processors.impl.JobProcessorsChainImpl <em>Job Processors Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.processors.impl.JobProcessorsChainImpl
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getJobProcessorsChain()
	 * @generated
	 */
	int JOB_PROCESSORS_CHAIN = 3;

	/**
	 * The feature id for the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN__PROGRESS_MONITOR = PROCESSORS_CHAIN__PROGRESS_MONITOR;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN__INPUT = PROCESSORS_CHAIN__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN__OUTPUT = PROCESSORS_CHAIN__OUTPUT;

	/**
	 * The feature id for the '<em><b>Intermediate Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN__INTERMEDIATE_RESULT = PROCESSORS_CHAIN__INTERMEDIATE_RESULT;

	/**
	 * The feature id for the '<em><b>Running Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN__RUNNING_PROCESSOR = PROCESSORS_CHAIN__RUNNING_PROCESSOR;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN__PROCESSORS = PROCESSORS_CHAIN__PROCESSORS;

	/**
	 * The number of structural features of the '<em>Job Processors Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN_FEATURE_COUNT = PROCESSORS_CHAIN_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Process</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN___PROCESS__OBJECT = PROCESSORS_CHAIN___PROCESS__OBJECT;

	/**
	 * The number of operations of the '<em>Job Processors Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_PROCESSORS_CHAIN_OPERATION_COUNT = PROCESSORS_CHAIN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.processors.VerboseProvider <em>Verbose Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.processors.VerboseProvider
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getVerboseProvider()
	 * @generated
	 */
	int VERBOSE_PROVIDER = 4;

	/**
	 * The feature id for the '<em><b>Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_PROVIDER__VERBOSE = 0;

	/**
	 * The number of structural features of the '<em>Verbose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Print Verbose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_PROVIDER___PRINT_VERBOSE__STRING = 0;

	/**
	 * The number of operations of the '<em>Verbose Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERBOSE_PROVIDER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 5;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.processors.Monitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitorable</em>'.
	 * @see org.eclipse.symphony.common.processors.Monitorable
	 * @generated
	 */
	EClass getMonitorable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Monitor</em>'.
	 * @see org.eclipse.symphony.common.processors.Monitorable#getProgressMonitor()
	 * @see #getMonitorable()
	 * @generated
	 */
	EAttribute getMonitorable_ProgressMonitor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.processors.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see org.eclipse.symphony.common.processors.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.processors.Processor#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see org.eclipse.symphony.common.processors.Processor#getInput()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Input();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.processors.Processor#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see org.eclipse.symphony.common.processors.Processor#getOutput()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Output();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.processors.Processor#process(java.lang.Object) <em>Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Process</em>' operation.
	 * @see org.eclipse.symphony.common.processors.Processor#process(java.lang.Object)
	 * @generated
	 */
	EOperation getProcessor__Process__Object();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.processors.ProcessorsChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see org.eclipse.symphony.common.processors.ProcessorsChain
	 * @generated
	 */
	EClass getProcessorsChain();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intermediate Result</em>'.
	 * @see org.eclipse.symphony.common.processors.ProcessorsChain#getIntermediateResult()
	 * @see #getProcessorsChain()
	 * @generated
	 */
	EAttribute getProcessorsChain_IntermediateResult();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.common.processors.ProcessorsChain#getRunningProcessor <em>Running Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Running Processor</em>'.
	 * @see org.eclipse.symphony.common.processors.ProcessorsChain#getRunningProcessor()
	 * @see #getProcessorsChain()
	 * @generated
	 */
	EReference getProcessorsChain_RunningProcessor();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.common.processors.ProcessorsChain#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processors</em>'.
	 * @see org.eclipse.symphony.common.processors.ProcessorsChain#getProcessors()
	 * @see #getProcessorsChain()
	 * @generated
	 */
	EReference getProcessorsChain_Processors();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.processors.JobProcessorsChain <em>Job Processors Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Processors Chain</em>'.
	 * @see org.eclipse.symphony.common.processors.JobProcessorsChain
	 * @generated
	 */
	EClass getJobProcessorsChain();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.processors.VerboseProvider <em>Verbose Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verbose Provider</em>'.
	 * @see org.eclipse.symphony.common.processors.VerboseProvider
	 * @generated
	 */
	EClass getVerboseProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.common.processors.VerboseProvider#isVerbose <em>Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbose</em>'.
	 * @see org.eclipse.symphony.common.processors.VerboseProvider#isVerbose()
	 * @see #getVerboseProvider()
	 * @generated
	 */
	EAttribute getVerboseProvider_Verbose();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.processors.VerboseProvider#printVerbose(java.lang.String) <em>Print Verbose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Print Verbose</em>' operation.
	 * @see org.eclipse.symphony.common.processors.VerboseProvider#printVerbose(java.lang.String)
	 * @generated
	 */
	EOperation getVerboseProvider__PrintVerbose__String();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProcessorsFactory getProcessorsFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.processors.Monitorable <em>Monitorable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.processors.Monitorable
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getMonitorable()
		 * @generated
		 */
		EClass MONITORABLE = eINSTANCE.getMonitorable();

		/**
		 * The meta object literal for the '<em><b>Progress Monitor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORABLE__PROGRESS_MONITOR = eINSTANCE.getMonitorable_ProgressMonitor();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.processors.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorImpl
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__INPUT = eINSTANCE.getProcessor_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__OUTPUT = eINSTANCE.getProcessor_Output();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESSOR___PROCESS__OBJECT = eINSTANCE.getProcessor__Process__Object();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.processors.impl.ProcessorsChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsChainImpl
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getProcessorsChain()
		 * @generated
		 */
		EClass PROCESSORS_CHAIN = eINSTANCE.getProcessorsChain();

		/**
		 * The meta object literal for the '<em><b>Intermediate Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSORS_CHAIN__INTERMEDIATE_RESULT = eINSTANCE.getProcessorsChain_IntermediateResult();

		/**
		 * The meta object literal for the '<em><b>Running Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSORS_CHAIN__RUNNING_PROCESSOR = eINSTANCE.getProcessorsChain_RunningProcessor();

		/**
		 * The meta object literal for the '<em><b>Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSORS_CHAIN__PROCESSORS = eINSTANCE.getProcessorsChain_Processors();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.processors.impl.JobProcessorsChainImpl <em>Job Processors Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.processors.impl.JobProcessorsChainImpl
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getJobProcessorsChain()
		 * @generated
		 */
		EClass JOB_PROCESSORS_CHAIN = eINSTANCE.getJobProcessorsChain();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.processors.VerboseProvider <em>Verbose Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.processors.VerboseProvider
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getVerboseProvider()
		 * @generated
		 */
		EClass VERBOSE_PROVIDER = eINSTANCE.getVerboseProvider();

		/**
		 * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERBOSE_PROVIDER__VERBOSE = eINSTANCE.getVerboseProvider_Verbose();

		/**
		 * The meta object literal for the '<em><b>Print Verbose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VERBOSE_PROVIDER___PRINT_VERBOSE__STRING = eINSTANCE.getVerboseProvider__PrintVerbose__String();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.eclipse.symphony.common.processors.impl.ProcessorsPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ProcessorsPackage
