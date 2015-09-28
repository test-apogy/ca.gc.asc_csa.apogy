/**
 * Canadian Space Agency 2007
 *
 * $Id: ProcessorsPackage.java,v 1.2.4.2 2015/05/21 15:51:13 pallard Exp $
 */
package ca.gc.space.mrt.common.processors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see ca.gc.space.mrt.common.processors.ProcessorsFactory
 * @model kind="package"
 * @generated
 */
public interface ProcessorsPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007";

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
	String eNS_URI = "http:///ca/gc/space/mrt/common/model/processors.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space.mrt.common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProcessorsPackage eINSTANCE = ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.processors.Monitorable <em>Monitorable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.processors.Monitorable
	 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getMonitorable()
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
	 * The meta object id for the '{@link ca.gc.space.mrt.common.processors.Processor <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.processors.Processor
	 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getProcessor()
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
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = MONITORABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl <em>Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl
	 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getProcessorsChain()
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
	 * The feature id for the '<em><b>Intermediate Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__INTERMEDIATE_RESULT = PROCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN__PROCESSORS = PROCESSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSORS_CHAIN_FEATURE_COUNT = PROCESSOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 3;


	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.processors.Monitorable <em>Monitorable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitorable</em>'.
	 * @see ca.gc.space.mrt.common.processors.Monitorable
	 * @generated
	 */
	EClass getMonitorable();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress Monitor</em>'.
	 * @see ca.gc.space.mrt.common.processors.Monitorable#getProgressMonitor()
	 * @see #getMonitorable()
	 * @generated
	 */
	EAttribute getMonitorable_ProgressMonitor();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.processors.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see ca.gc.space.mrt.common.processors.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.common.processors.ProcessorsChain <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain</em>'.
	 * @see ca.gc.space.mrt.common.processors.ProcessorsChain
	 * @generated
	 */
	EClass getProcessorsChain();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intermediate Result</em>'.
	 * @see ca.gc.space.mrt.common.processors.ProcessorsChain#getIntermediateResult()
	 * @see #getProcessorsChain()
	 * @generated
	 */
	EAttribute getProcessorsChain_IntermediateResult();

	/**
	 * Returns the meta object for the reference list '{@link ca.gc.space.mrt.common.processors.ProcessorsChain#getProcessors <em>Processors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processors</em>'.
	 * @see ca.gc.space.mrt.common.processors.ProcessorsChain#getProcessors()
	 * @see #getProcessorsChain()
	 * @generated
	 */
	EReference getProcessorsChain_Processors();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.processors.Monitorable <em>Monitorable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.processors.Monitorable
		 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getMonitorable()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.processors.Processor <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.processors.Processor
		 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl <em>Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl
		 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getProcessorsChain()
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
		 * The meta object literal for the '<em><b>Processors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSORS_CHAIN__PROCESSORS = eINSTANCE.getProcessorsChain_Processors();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see ca.gc.space.mrt.common.processors.impl.ProcessorsPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

	}

} //ProcessorsPackage
