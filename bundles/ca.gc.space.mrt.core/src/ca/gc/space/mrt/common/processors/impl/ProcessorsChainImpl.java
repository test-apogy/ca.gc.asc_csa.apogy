/**
 * Canadian Space Agency 2007
 *
 * $Id: ProcessorsChainImpl.java,v 1.2.4.4 2015/09/22 20:02:13 rlarcheveque Exp $
 */
package ca.gc.space.mrt.common.processors.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.space.mrt.common.Activator;
import ca.gc.space.mrt.common.processors.Processor;
import ca.gc.space.mrt.common.processors.ProcessorsChain;
import ca.gc.space.mrt.common.processors.ProcessorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl#getIntermediateResult <em>Intermediate Result</em>}</li>
 *   <li>{@link ca.gc.space.mrt.common.processors.impl.ProcessorsChainImpl#getProcessors <em>Processors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessorsChainImpl extends EObjectImpl implements ProcessorsChain {
	
	public boolean verbose = false;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007";

	/**
	 * The default value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected static final IProgressMonitor PROGRESS_MONITOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected IProgressMonitor progressMonitor = PROGRESS_MONITOR_EDEFAULT;

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
	 * The cached value of the '{@link #getProcessors() <em>Processors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessors()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processors;

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
	public IProgressMonitor getProgressMonitor() {
		return progressMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressMonitor(IProgressMonitor newProgressMonitor) {
		IProgressMonitor oldProgressMonitor = progressMonitor;
		progressMonitor = newProgressMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessorsPackage.PROCESSORS_CHAIN__PROGRESS_MONITOR, oldProgressMonitor, progressMonitor));
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
	public EList<Processor> getProcessors() {
		if (processors == null) {
			processors = new EObjectResolvingEList<Processor>(Processor.class, this, ProcessorsPackage.PROCESSORS_CHAIN__PROCESSORS);
		}
		return processors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Object process(Object input) {
		Object currentInput = input;
		Object result = null;
		String feedbackMessage = null;
		
		// Initialize the current result to null.
		setIntermediateResult(null);
		
		if(getProcessors().size() > 0)
		{
			// Set up the progress monitor.
			feedbackMessage = "Calling processor chain of size <" + getProcessors().size() + ">.";
			if(getProgressMonitor() != null) getProgressMonitor().beginTask(feedbackMessage, getProcessors().size());
			printVerbose(feedbackMessage);
			
			// Call the processor one after the other.
			int processorIdNumber = 1;
			Iterator <Processor> it = getProcessors().iterator();
			Processor currentProcessor = null;
			Processor previousProcessor = null;
			while(it.hasNext())
			{																								
				currentProcessor= it.next();	
				currentProcessor.setProgressMonitor(getProgressMonitor());
				
				feedbackMessage = "Calling processor #" + processorIdNumber + " of type <" + currentProcessor.getClass().getSimpleName() + ">...";
				if(getProgressMonitor() != null) getProgressMonitor().subTask(feedbackMessage);
				printVerbose(feedbackMessage);
				
				// Call the processor process.
				try
				{
					Object temp = currentProcessor.process(currentInput);
					
					// If there is still yet another processor to call.
					if(it.hasNext())
					{
						setIntermediateResult(temp);						
						printVerbose("Intermediate result = " + getIntermediateResult());
						
						// Sets the current input to the last processor output.
						currentInput = getIntermediateResult();								
						processorIdNumber++;
						previousProcessor = currentProcessor;	
					}
					else
					{
						// We are done.
						result = temp;
					}
				}
				catch(ClassCastException cce)
				{	
					Logger.INSTANCE.log(Activator.ID, this, getErrorMessage(cce, previousProcessor, currentProcessor), EventSeverity.ERROR);
					throw cce;
				}										
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessorsPackage.PROCESSORS_CHAIN__PROGRESS_MONITOR:
				return getProgressMonitor();
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				return getIntermediateResult();
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
			case ProcessorsPackage.PROCESSORS_CHAIN__PROGRESS_MONITOR:
				setProgressMonitor((IProgressMonitor)newValue);
				return;
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				setIntermediateResult(newValue);
				return;
			case ProcessorsPackage.PROCESSORS_CHAIN__PROCESSORS:
				getProcessors().clear();
				getProcessors().addAll((Collection<? extends Processor>)newValue);
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
			case ProcessorsPackage.PROCESSORS_CHAIN__PROGRESS_MONITOR:
				setProgressMonitor(PROGRESS_MONITOR_EDEFAULT);
				return;
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				setIntermediateResult(INTERMEDIATE_RESULT_EDEFAULT);
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
			case ProcessorsPackage.PROCESSORS_CHAIN__PROGRESS_MONITOR:
				return PROGRESS_MONITOR_EDEFAULT == null ? progressMonitor != null : !PROGRESS_MONITOR_EDEFAULT.equals(progressMonitor);
			case ProcessorsPackage.PROCESSORS_CHAIN__INTERMEDIATE_RESULT:
				return INTERMEDIATE_RESULT_EDEFAULT == null ? intermediateResult != null : !INTERMEDIATE_RESULT_EDEFAULT.equals(intermediateResult);
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
		result.append(" (progressMonitor: ");
		result.append(progressMonitor);
		result.append(", intermediateResult: ");
		result.append(intermediateResult);
		result.append(')');
		return result.toString();
	}

	protected String getErrorMessage(ClassCastException cce, Processor previousProcessor, Processor currentProcessor)
	{
		String errorMessage = "";
		if(previousProcessor == null)
		{
			errorMessage += "Processor Chain input type is incompatible with first processor <" + currentProcessor.getClass().getSimpleName() +">.";
		}
		else
		{
			errorMessage += "Output from Processor <" + previousProcessor.getClass().getSimpleName() + 
			"> is incompatible with input of Processor <" + currentProcessor.getClass().getSimpleName() + "> !";
		}
		
		return errorMessage;
	}
	
	protected void printVerbose(String message)
	{
		if(verbose) System.out.println(this.getClass().getSimpleName() + " : " + message);
	}
} //ProcessorsChainImpl
