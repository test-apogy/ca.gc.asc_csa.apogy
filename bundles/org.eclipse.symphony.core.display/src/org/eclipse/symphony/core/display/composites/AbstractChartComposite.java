package org.eclipse.symphony.core.display.composites;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.eclipse.ui.progress.UIJob;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.experimental.chart.swt.ChartComposite;

import org.eclipse.symphony.common.emf.AbstractFeatureSpecifier;

public abstract class AbstractChartComposite<T>  extends ChartComposite 
{
	private static Set<AbstractChartComposite<?>> instances = new HashSet<AbstractChartComposite<?>>();		
	protected static long updatePeriodMilliseconds = 1000;	
	private static UIJob updateChartJob = null;	
	
	private JFreeChart chart;

	protected boolean useDataBuffering = true;
	protected boolean repeatLastValue = false;
	protected Plot plot;
	
	static
	{
		updateChartJob = getupdateChartJob();
		updateChartJob.schedule();
	}
	
	/** The DisplayedItem being displayed by the composite. */
	protected AbstractFeatureDisplay watchFeature;
	
	/** The last value that was received. */
	protected T lastValue;
	
	/**
	 * Creates an AbstractChartComposite.
	 * @param comp The parent Composite.
	 * @param style The style to be used.
	 */
	public AbstractChartComposite(Composite comp, int style) 
	{
		super(comp, style);			
	}

	/**
	 * Creates an AbstractChartComposite.
	 * @param comp The parent Composite.
	 * @param style The style to be used.
	 * @param watchFeature The displayed item to be displayed.
	 */
	public AbstractChartComposite(Composite comp, int style, AbstractFeatureDisplay watchFeature) 
	{		
		super(comp, style);	
		this.watchFeature = watchFeature;			
	}
	
	public boolean isUseDataBuffering() {
		return useDataBuffering;
	}

	public void setUseDataBuffering(boolean useDataBuffering) {
		this.useDataBuffering = useDataBuffering;
	}

	public boolean isRepeatLastValue() {
		return repeatLastValue;
	}

	public void setRepeatLastValue(boolean repeatLastValue) {
		this.repeatLastValue = repeatLastValue;
	}

	@Override
	public void dispose() {
		unregisterInstance(this);
		super.dispose();
	}
	
	/**
	 * Set a new value.
	 * @param newValue The new value.
	 */
	public abstract void setCurrentValue(T newValue);

	public abstract void setCurrentValue(T newValue, long time);
	
	/**
	 * Creates a JFreeChart for the specified DisplayedItem.
	 * @param watchFeature The specified DisplayedItem.
	 * @return A JFreeChart.
	 */
	public abstract JFreeChart createJFreeChart(final AbstractFeatureDisplay watchFeature);
	
	/**
	 * Update the chart display.
	 */
	public abstract void updateChart();
	
	public JFreeChart getChart() 
	{
		if(chart == null)
		{
			chart = createJFreeChart(watchFeature);
		}
		return chart;
	}

	
	/**
	 * 
	 * @param watchFeature
	 * @return
	 */
	public String getChartTitle(final AbstractFeatureDisplay watchFeature)
	{
		String chartTitle = new String();
		
		if(watchFeature.getAbstractFeatureNode() instanceof AbstractFeatureSpecifier)
		{
			AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) watchFeature.getAbstractFeatureNode();
			
			if(abstractFeatureSpecifier.getStructuralFeature() != null)
			{
				chartTitle += abstractFeatureSpecifier.getStructuralFeature().getName() + " vs Time";
			}
		}
		
		return chartTitle;
	}
	
	public EStructuralFeature getEStructuralFeature(final AbstractFeatureDisplay watchFeature)
	{
		EStructuralFeature eStructuralFeature = null;
		
		if(watchFeature.getAbstractFeatureNode() instanceof AbstractFeatureSpecifier)
		{
			AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) watchFeature.getAbstractFeatureNode();			
			eStructuralFeature = abstractFeatureSpecifier.getStructuralFeature() ;		
		}
		
		return eStructuralFeature;
	}
	
	/**
	 * Register an instance to the list of instance that will be updated periodically.
	 * @param instance The instance to be registered.
	 */
	protected static void registerInstance(AbstractChartComposite<?> instance)
	{		
		instances.add(instance);
	}
	
	/**
	 * Unregister an instance to the list of instance that will be updated periodically.
	 * @param instance The instance to be unregistered.
	 */
	protected static void unregisterInstance(AbstractChartComposite<?> instance)
	{
		instances.remove(instance);
	}
	
	/**
	 * Returns the UIJob used to update the charts at regular interval.
	 * @return The UIJob.
	 */
	private static UIJob getupdateChartJob()
	{
		if(updateChartJob == null)
		{
			updateChartJob = new UIJob("Abstract Chart Composite Update") 
			{				
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) 
				{
					// Updates each instance that is registered.															
					if(!monitor.isCanceled())
					{
						Date start = new Date();
						updateAll();
						Date end = new Date();
						
						// Compute the delay used to schedule the next update.
						long delay = updatePeriodMilliseconds - (end.getTime() - start.getTime());
						if(delay < 0) delay = 0;
						this.schedule(delay);
					}					
					return Status.OK_STATUS;
				}
			};
		}
		
		return updateChartJob;
	}
	
	/**
	 * Updates all chart of instances that have registered.
	 */
	protected static void updateAll()
	{
		for(AbstractChartComposite<?> instance : instances)
		{
			if(instance != null && !instance.isDisposed())
			{
				try
				{
					instance.updateChart();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
