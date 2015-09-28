package ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.composites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SortedMap;

import org.eclipse.swt.widgets.Composite;
import org.jfree.data.time.TimeSeriesCollection;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.display.AbstractFeatureDisplay;


public abstract class AbstractValueVsTimeChartComposite<T> extends AbstractChartComposite<T> 
{
	/** The buffer where values are stored between chart updates.*/
	private List<TimeValue<T>> valuesBuffer = new ArrayList<TimeValue<T>>();
	
	public AbstractValueVsTimeChartComposite(Composite comp, int style) 
	{
		super(comp, style);
	}
	
	public AbstractValueVsTimeChartComposite(Composite comp, int style, AbstractFeatureDisplay watchFeature) 
	{
		super(comp, style, watchFeature);
	}
	
	@Override
	public void setCurrentValue(T newValue) 
	{
		setCurrentValue(newValue, System.currentTimeMillis());
	}
		
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void setCurrentValue(T newValue, final long time) 
	{	
		try
		{				
			if(newValue != null)
			{				
				this.lastValue = newValue;
	
				if(useDataBuffering)
				{
					// Adds the new values to the buffered list of time-values.
					valuesBuffer.add(new TimeValue(time, newValue));	
				}
				else
				{
					// Directly adds the values to the TimeSeriesCollection associated to the Chart.
					addNewValueToTimeSeriesCollections(getTimeSeriesCollection(), newValue, time);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void updateChart() 
	{				
		try
		{
			if(valuesBuffer.size() > 0)
			{	
				// Adds all the buffered values to the TimeSeriesCollections.
				for(TimeValue<T> timeValue : valuesBuffer)
				{					
					addNewValueToTimeSeriesCollections(getTimeSeriesCollection(), timeValue.value, timeValue.time);					
				}
						
				// Clears the values buffer.			
				valuesBuffer.clear();				
			}
			else if(repeatLastValue)
			{
				// Repeat the last value.
				if(this.lastValue != null)
				{
					long time = new Date().getTime();
					addNewValueToTimeSeriesCollections(getTimeSeriesCollection(), this.lastValue, time);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the values currently displayed.
	 * @param timeValueMap A SortedMap containing the time - values pairs
	 */
	public abstract void initializeDisplayedValues(SortedMap<Long,T> timeValueMap);

	
	/**
	 * Returns the TimeSeriesCollection to be displayed.
	 * @return The TimeSeriesCollection, never null.
	 */
	public abstract TimeSeriesCollection getTimeSeriesCollection();
	
	/**
	 * Adds the specified time tagged value to the the specified TimeSeriesCollection.
	 * @param timeSeriesCollection The specified TimeSeriesCollection. 
	 * @param value The new value.
	 * @param time The time tag of the new value.
	 */
	protected abstract void addNewValueToTimeSeriesCollections(TimeSeriesCollection timeSeriesCollection, T value, long time);
	
	
	/**
	 * Private class used to store time-value pairs.
	 * @author pallard
	 *
	 * @param <T>
	 */
	@SuppressWarnings("hiding")
	private class TimeValue<T>
	{
		public long time = 0;
		public T value = null;
		
		public TimeValue(long time, T value)
		{
			this.time= time;
			this.value = value;
		}
	};
}
