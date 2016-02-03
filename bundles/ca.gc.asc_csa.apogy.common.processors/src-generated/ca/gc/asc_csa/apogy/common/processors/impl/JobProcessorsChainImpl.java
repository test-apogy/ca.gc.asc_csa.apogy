package ca.gc.asc_csa.apogy.common.processors.impl;
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

import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.processors.Activator;
import ca.gc.asc_csa.apogy.common.processors.JobProcessorsChain;
import ca.gc.asc_csa.apogy.common.processors.Processor;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Processors Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JobProcessorsChainImpl<I, O> extends ProcessorsChainImpl<I, O> implements JobProcessorsChain<I, O> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobProcessorsChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonProcessorsPackage.Literals.JOB_PROCESSORS_CHAIN;
	}

	@Override
	public O process(I input) throws Exception {
		final Job chainJob = new Job(this.getClass().getSimpleName())
		{
			@SuppressWarnings({ "rawtypes", "unchecked" })
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				setProgressMonitor(monitor);									
				getProgressMonitor().beginTask("", getProcessors().size());													
				
				Object currentInput = getInput();	
				
				System.out.println("currentInput = " + currentInput);
								
				// Initialize the current result to null.
				setIntermediateResult(null);
				setOutput(null);
				
				Iterator <Processor<?, ?>> it = getProcessors().iterator();
				
				int i = 0;
				// Goes through the list of processors and call their process method.
				while(it.hasNext() && !getProgressMonitor().isCanceled())
				{			
					getProgressMonitor().subTask("Calling sub-processor <" + i + ">");
					
					// Gets the next processor in the chain.	
					setRunningProcessor(it.next());
					final Processor processor = getRunningProcessor();
					final Object input = currentInput;
															
					Job processorJob = new Job(processor.getClass().getSimpleName())
					{						
						@Override
						protected IStatus run(IProgressMonitor _monitor) 
						{						
							try 
							{											
								processor.setProgressMonitor(_monitor);		
								processor.setInput(input);
								processor.process(input);
							} 
							catch (Exception e) 
							{								
								e.printStackTrace();
								return new Status(IStatus.ERROR, Activator.ID, IStatus.ERROR, "Failed to run.", e);
							}
							return new Status(IStatus.OK, Activator.ID, IStatus.OK, "Done.", null);
						}						
					};					
					processorJob.schedule();
					
					try 
					{
						processorJob.join();
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
									
					if((processorJob.getResult() != null) && (!processorJob.getResult().isOK()))
					{						
						printVerbose("ERROR !!!!");
						return new Status(IStatus.ERROR, Activator.ID, IStatus.ERROR, "Error.", null);
					}
					
					// Updates the progress of the task.
					getProgressMonitor().worked(1);
					i++;
					
					// If there is still yet another processor to call.
					if(it.hasNext())
					{
						// Sets the current input to the last processor output.
						currentInput = getRunningProcessor().getOutput();
						setIntermediateResult(getRunningProcessor().getOutput());						
						printVerbose("currentInput = " + getIntermediateResult());											
					}
					else
					{
						// We are done.
						printVerbose("Final result = " + getRunningProcessor().getOutput());
						setOutput((O) getRunningProcessor().getOutput());
						getProgressMonitor().done();
					}						
				}
				
				if(getProgressMonitor().isCanceled())
				{
					return new Status(IStatus.CANCEL, Activator.ID, IStatus.CANCEL, "Cancelled.", null);	
				}
				else
				{
					return new Status(IStatus.OK, Activator.ID, IStatus.OK, "Done.", null);	
				}								
			}						
		};
		chainJob.schedule();
		return (O) getOutput();
	}
} //JobProcessorsChainImpl
