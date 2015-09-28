package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator 
{
	public static final String ID = "ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings";
	
	private static Activator instance;
	private static BundleContext bundleContext;
		
	public static Activator getDefault()
	{
		return instance;
	}

	public static BundleContext getBundleContext() {
		return bundleContext;
	}
	
	@Override
	public void start(BundleContext context) throws Exception 
	{		
		bundleContext = context;
		instance = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception 
	{
		bundleContext = null;
		instance = null;
	}

	public double getRecordingPeriodInSeconds(FixedPeriodValues periodValue)
	{
		double value = 0.0;
		switch(periodValue.getValue())
		{
			case FixedPeriodValues.VERY_LONG_INTERVAL_VALUE: value = 10; break;
			case FixedPeriodValues.LONG_INTERVAL_VALUE: value = 5; break;
			case FixedPeriodValues.MEDIUM_INTERVAL_VALUE: value = 1; break;
			case FixedPeriodValues.SHORT_INTERVAL_VALUE: value = 0.1; break;
			case FixedPeriodValues.VERY_SHORT_INTERVAL_VALUE: value = 0.01; break;
			case FixedPeriodValues.USER_DEFINED_1_VALUE: value = 1; break;
			case FixedPeriodValues.USER_DEFINED_2_VALUE: value = 10; break;
			case FixedPeriodValues.USER_DEFINED_3_VALUE: value = 100; break;
			case FixedPeriodValues.USER_DEFINED_4_VALUE: value = 100; break;
			default: value = 1;
		}
		return value;
	}
}