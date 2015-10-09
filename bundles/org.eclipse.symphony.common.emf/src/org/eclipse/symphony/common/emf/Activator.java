package org.eclipse.symphony.common.emf;

import javax.measure.unit.NonSI;
import javax.measure.unit.SI;
import javax.measure.unit.UnitFormat;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.symphony.common.emf.EMFEcoreFacade;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{
	public static final String ID = "org.eclipse.symphony.common.emf";
	
	// Adds some aliases to units.
	static
	{
		UnitFormat.getInstance().alias(SI.VOLT, "volt");		
		
		UnitFormat.getInstance().alias(NonSI.DEGREE_ANGLE, "deg");		
		UnitFormat.getInstance().alias(NonSI.DEGREE_ANGLE, "degree");
		
		UnitFormat.getInstance().alias(NonSI.FOOT, "foot");
		UnitFormat.getInstance().alias(NonSI.FOOT, "feet");				
	}
	
	private static BundleContext context;
	
	static BundleContext getContext() {
		return context;
	}
	
	@Override
	public void start(BundleContext context) throws Exception {
		Activator.context = context;	
		
		new Job("Loading EMF Class Definitions") {			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try{
					EMFEcoreFacade.INSTANCE.getAllSubEClasses(EMFEcorePackage.Literals.EMF_ECORE_FACADE);
					Logger.INSTANCE.log(ID, Activator.this, "EMF Class Definitions loaded", EventSeverity.INFO);				
				}catch (UnsatisfiedLinkError e){
					Logger.INSTANCE.log(ID, Activator.this, "Error while loading EMF Class Definitions", EventSeverity.ERROR, e);
				}catch (Throwable e){
					Logger.INSTANCE.log(ID, Activator.this, "Error while loading EMF Class Definitions", EventSeverity.ERROR, e);
				}
				
				return Status.OK_STATUS;
			}
		}.schedule();		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		Activator.context = null;
	}
}
