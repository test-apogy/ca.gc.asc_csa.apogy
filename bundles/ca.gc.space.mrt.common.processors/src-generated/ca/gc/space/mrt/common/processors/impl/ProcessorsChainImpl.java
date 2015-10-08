/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.common.processors.impl;

import ca.gc.space.mrt.common.processors.ProcessorsPackage;
import java.util.Collection;
import java.util.Iterator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.common.processors.ProcessorsChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl#getIntermediateResult <em>Intermediate Result</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl#getRunningProcessor <em>Running Processor</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorsChainImpl <I,O> extends ProcessorImpl<I, O> implements ProcessorsChain<I, O> {
	
	public boolean verbose = true;
	
	/**
	 * The default value of the '{@link #getIntermediateResult() <em>Intermediate Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateResult()
	 * @generated
	 * @ordered
	 */
	protected static final Object INTERMEDIATE_RESULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntermediateResult() <em>Intermediate Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateResult()
	 * @generated
	 * @ordered
	 */
	protected Object intermediateResult = INTERMEDIATE_RESULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRunningProcessor() <em>Running Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor<?, ?> runningProcessor;

	/**
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor<?, ?>> processors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorsChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessorsPackage.Literals.PROCESSORS_CHAIN;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIntermediateResult() {
		return intermediateResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntermediateResult(Object newIntermediateResult) {
		Object oldIntermediateResult = intermediateResult;
		intermediateResult = newIntermediateResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT, oldIntermediateResult, intermediateResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor<?, ?>> getProcessors() {
		if (processors == null) {
			processors = new EObjectResolvingEList<Processor<?, ?>>(Processor.class, this, ProcessorsPackage.PROCESSORS_CHAIN__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor<?, ?> getRunningProcessor() {
		if (runningProcessor != null && runningProcessor.eIsProxy()) {
			InternalEObject oldRunningProcessor = (InternalEObject)runningProcessor;
			runningProcessor = (Processor<?, ?>)eResolveProxy(oldRunningProcessor);
			if (runningProcessor != oldRunningProcessor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessorsPackage.PROCESSORS_CHAIN__RUNNING_PROCESSOR, oldRunningProcessor, runningProcessor));
			}
		}
		return runningProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor<?, ?> basicGetRunningProcessor() {
		return runningProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunningProcessor(Processor<?, ?> newRunningProcessor) {
		Processor<?, ?> oldRunningProcessor = runningProcessor;
		runningProcessor = newRunningProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorsPackage.PROCESSORS_CHAIN__RUNNING_PROCESSOR, oldRunningProcessor, runningProcessor));
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public O process(I input) throws Exception 
	{
		Object currentInput = getInput();		
		String feedbackMessage = null;
		
		// Initialize the current result to null.
		setIntermediateResult(null);
		setOutput(null);
		setRunningProcessor(null);
		
		Iterator <Processor<?,?>> it = getProcessors().iterator();
		
		feedbackMessage = "Calling processor chain of size <" + getProcessors().size() + ">.";
		printVerbose(feedbackMessage);		
		if(getProgressMonitor() != null) getProgressMonitor().beginTask(feedbackMessage, getProcessors().size());
		
		while(it.hasNext())
		{
			Processor processor = it.next();
			
			// Gets the next processor in the chain.			
			setRunningProcessor(processor);
			
			// Sets-up the processor.
			processor.setProgressMonitor(getProgressMonitor());
			processor.setInput(currentInput);									
			processor.setOutput(processor.process(getRunningProcessor().getInput()));
			
			
			// Updates the progress of the task.
			if(getProgressMonitor() != null) getProgressMonitor().worked(1);
			
			// If there is still yet another processor to call.
			if(it.hasNext())
			{
				setIntermediateResult(getRunningProcessor().getOutput());						
				printVerbose("Intermediate result = " + getIntermediateResult());
				
				// Sets the current input to the last processor output.
				currentInput = getIntermediateResult();													
			}
			else
			{
				// We are done.
				printVerbose("Final result = " + getRunningProcessor().getOutput());
				setOutput( (O) getRunningProcessor().getOutput());
				setRunningProcessor(null);
				if(getProgressMonitor() != null) getProgressMonitor().done();
			}						
		}
		
		return (O) getOutput();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				return getIntermediateResult();
			case ProcessorsPackage.PROCESSORS_CHAIN__RUNNING_PROCESSOR:
				if (resolve) return getRunningProcessor();
				return basicGetRunningProcessor();
			case ProcessorsPackage.PROCESSORS_CHAIN__PROCESSORS:
				return getProcessors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				setIntermediateResult(newValue);
				return;
			case ProcessorsPackage.PROCESSORS_CHAIN__RUNNING_PROCESSOR:
				setRunningProcessor((Processor<?, ?>)newValue);
				return;
			case ProcessorsPackage.PROCESSORS_CHAIN__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor<?, ?>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				setIntermediateResult(INTERMEDIATE_RESULT_EDEFAULT);
				return;
			case ProcessorsPackage.PROCESSORS_CHAIN__RUNNING_PROCESSOR:
				setRunningProcessor((Processor<?, ?>)null);
				return;
			case ProcessorsPackage.PROCESSORS_CHAIN__PROCESSORS:
				getProcessors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				return INTERMEDIATE_RESULT_EDEFAULT == null ? intermediateResult != null : !INTERMEDIATE_RESULT_EDEFAULT.equals(intermediateResult);
			case ProcessorsPackage.PROCESSORS_CHAIN__RUNNING_PROCESSOR:
				return runningProcessor != null;
			case ProcessorsPackage.PROCESSORS_CHAIN__PROCESSORS:
				return processors != null && !processors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (intermediateResult: ");
		result.append(intermediateResult);
		result.append(')');
		return result.toString();
	}
	
//	@Override
//	public Class<?> getInputType() 
//	{
//		if(getProcessors().size() > 0)
//		{
//			return getProcessors().get(0).getInputType();
//		}
//		else
//		{
//			return null;
//		}
//	}
//	
//	@Override
//	public Class<?> getOutputType() 
//	{
//		if(getProcessors().size() > 0)
//		{						
//			return getProcessors().get(getProcessors().size() - 1).getOutputType();
//		}
//		else
//		{
//			return null;
//		}
//	}
	
	protected void printVerbose(String message)
	{
		if(verbose) System.out.println(this.getClass().getSimpleName() + " : " + message);
	}
} //ProcessorsChainImpl