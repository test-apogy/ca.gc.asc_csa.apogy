package org.eclipse.symphony.core.display.composites;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.jfree.data.xy.XYSeriesCollection;

public abstract class AbstractXYValueChartComposite<T> extends AbstractChartComposite<T> 
{
	/** The buffer where values are stored between chart updates.*/
	private List<T> valuesBuffer = new ArrayList<T>();
	
	public AbstractXYValueChartComposite(Composite comp, int style) 
	{
		super(comp, style);		
	}
	
	public AbstractXYValueChartComposite(Composite comp, int style, AbstractFeatureDisplay watchFeature) 
	{
		super(comp, style, watchFeature);		
	}
	
	@Override
	public void setCurrentValue(T newValue) 
	{
		if(!this.isDisposed())
		{
			try
			{
				if(newValue != null)
				{				
					this.lastValue = newValue;
					
					if(useDataBuffering)
					{
						// Adds the new values to the buffered list of time-values.
						valuesBuffer.add(newValue);	
					}
					else
					{
						// Directly adds the values to the XYSeriesCollection associated to the Chart.
						addNewValueToXYSeriesCollection(getXYSeriesCollection(), newValue);
					}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	};

	@Override
	public void updateChart() 
	{				
		try
		{
			if(valuesBuffer.size() > 0)
			{	
				// Adds all the buffered values to the TimeSeriesCollections.
				for(T value : valuesBuffer)
				{					
					addNewValueToXYSeriesCollection(getXYSeriesCollection(), value);					
				}
						
				// Clears the values buffer.			
				valuesBuffer.clear();				
			}
			else if(repeatLastValue)
			{
				// Repeat the last value.
				if(this.lastValue != null)
				{					
					addNewValueToXYSeriesCollection(getXYSeriesCollection(), this.lastValue);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns the XYSeriesCollection to be displayed.
	 * @return The XYSeriesCollection, never null.
	 */
	protected abstract XYSeriesCollection getXYSeriesCollection();
	
	/**
	 * Adds the specified time tagged value to the the specified XYSeriesCollection.
	 * @param xySeriesCollection The specified XYSeriesCollection. 
	 * @param value The new value. 
	 */
	protected abstract void addNewValueToXYSeriesCollection(XYSeriesCollection xySeriesCollection, T value);	
}
