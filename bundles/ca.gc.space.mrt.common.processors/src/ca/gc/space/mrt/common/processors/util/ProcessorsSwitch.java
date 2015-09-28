/**
 * Canadian Space Agency 2007.
 *
 * $Id: ProcessorsSwitch.java,v 1.6.4.3 2015/09/22 19:39:41 rlarcheveque Exp $
 */
package ca.gc.space.mrt.common.processors.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.gc.space.mrt.common.processors.JobProcessorsChain;
import ca.gc.space.mrt.common.processors.Monitorable;
import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.common.processors.ProcessorsChain;
import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import ca.gc.space.mrt.common.processors.VerboseProvider;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage
 * @generated
 */
public class ProcessorsSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProcessorsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorsSwitch() {
		if (modelPackage == null) {
			modelPackage = ProcessorsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
  protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProcessorsPackage.MONITORABLE: {
				Monitorable monitorable = (Monitorable)theEObject;
				T result = caseMonitorable(monitorable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorsPackage.PROCESSOR: {
				Processor<?, ?> processor = (Processor<?, ?>)theEObject;
				T result = caseProcessor(processor);
				if (result == null) result = caseMonitorable(processor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorsPackage.PROCESSORS_CHAIN: {
				ProcessorsChain<?, ?> processorsChain = (ProcessorsChain<?, ?>)theEObject;
				T result = caseProcessorsChain(processorsChain);
				if (result == null) result = caseProcessor(processorsChain);
				if (result == null) result = caseMonitorable(processorsChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorsPackage.JOB_PROCESSORS_CHAIN: {
				JobProcessorsChain<?, ?> jobProcessorsChain = (JobProcessorsChain<?, ?>)theEObject;
				T result = caseJobProcessorsChain(jobProcessorsChain);
				if (result == null) result = caseProcessorsChain(jobProcessorsChain);
				if (result == null) result = caseProcessor(jobProcessorsChain);
				if (result == null) result = caseMonitorable(jobProcessorsChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProcessorsPackage.VERBOSE_PROVIDER: {
				VerboseProvider verboseProvider = (VerboseProvider)theEObject;
				T result = caseVerboseProvider(verboseProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitorable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitorable(Monitorable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T caseProcessor(Processor<I, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T caseProcessorsChain(ProcessorsChain<I, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job Processors Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job Processors Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <I, O> T caseJobProcessorsChain(JobProcessorsChain<I, O> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verbose Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verbose Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerboseProvider(VerboseProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
  public T defaultCase(EObject object) {
		return null;
	}

} //ProcessorsSwitch
