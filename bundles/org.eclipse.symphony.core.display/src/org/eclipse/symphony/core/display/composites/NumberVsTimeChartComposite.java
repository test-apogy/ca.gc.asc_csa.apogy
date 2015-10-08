package org.eclipse.symphony.core.display.composites;

import java.awt.BasicStroke;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SortedMap;

import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.display.AbstractFeatureDisplay;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.ui.RectangleInsets;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.EMFEcoreUIFacade;

public class NumberVsTimeChartComposite extends AbstractValueVsTimeChartComposite<Number> 
{	
	public static long DEFAULT_TIME_HISTORY_LENGHT_SECONDS = 60;
	private TimeSeriesCollection timeSeriesCollection;
	private TimeSeries timeSeries;
	private XYPlot plot;
	
	public NumberVsTimeChartComposite(Composite comp, int style) 
	{
		super(comp, style);			
		this.setLayout(new FillLayout());
		setSize(200, 200);
		setDisplayToolTips(true);
		setHorizontalAxisTrace(false);
		setVerticalAxisTrace(false);
		
		registerInstance(this);		
	}
	
	public NumberVsTimeChartComposite(Composite comp, int style, AbstractFeatureDisplay watchFeature)
	{
		this(comp, style);
		this.watchFeature = watchFeature;
		setChart(getChart());	
	}
	
	
	/**
	 * Adds the new double value.
	 * @param currentValue The new value.
	 */
	public void setCurrentValue(double currentValue) 
	{		
		// Converts to display units is available.
		double displayedValue = convertToDisplayUnits(currentValue);
				
		setCurrentValue(new Double(displayedValue));
	}		
	
	@Override
	public JFreeChart createJFreeChart(AbstractFeatureDisplay watchFeature) 
	{
	   	String chartTitle = null; //getChartTitle(watchFeature);   	
    	String chartXAxisLabel = getXAxisLabel(watchFeature);    	
    	String chartYAxisLabel = getYAxisLabel(watchFeature);
      	
		JFreeChart chart = ChartFactory.createTimeSeriesChart(
				chartTitle, // title
				chartXAxisLabel, // x-axis label
				chartYAxisLabel, // y-axis label
				getTimeSeriesCollection(), // data set
				false, // do not create legend
				true, // generate tooltips
				true // do not generate URLs.
				);
		
        chart.setBackgroundPaint(Color.white);
        chart.setAntiAlias(true);

        // Creates the Plot.
        plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.black);
        plot.setRangeGridlinePaint(Color.black);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);          
        
        plot.setDomainMinorGridlinesVisible(false);
        plot.setRangeMinorGridlinesVisible(false);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);            
        
        XYItemRenderer xyItemRenderer = plot.getRenderer();       
		
        // Just draw lines, no shapes.
        if (xyItemRenderer instanceof XYLineAndShapeRenderer) 
		{
			XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) xyItemRenderer;
			renderer.setBaseShapesVisible(false);
			renderer.setBaseShapesFilled(false);
			renderer.setSeriesStroke(0, new BasicStroke(2.0f));
		}
       
        // Setup the time axis.
		DateAxis timeAxis = (DateAxis) plot.getDomainAxis();
		timeAxis.setAutoRange(true);
		timeAxis.setPositiveArrowVisible(true);
		timeAxis.setDateFormatOverride(new SimpleDateFormat("HH:mm:ss.SSS"));

		// Setup value axis.
		ValueAxis valueAxis = plot.getRangeAxis();
		valueAxis.setPositiveArrowVisible(true);	
		
		// Attempts to set the range.
		Number minValue = getMin(watchFeature);
		Number maxValue = getMax(watchFeature);
		
		if(minValue != null && maxValue != null)
		{
			// Add a delta to ensure the plot show the entire range correctly.
			double delta = 0.1 * (maxValue.doubleValue() - minValue.doubleValue());			
			valueAxis.setRange(minValue.doubleValue() - delta, maxValue.doubleValue() + delta);
			valueAxis.setAutoRange(false);
		}
		else
		{
			valueAxis.setAutoRange(true);						
		}				
						
		// Add Ranges markers.
		addWarningLimitsMarkers(watchFeature, plot);
		addAlarmLimitsMarkers(watchFeature, plot);
		addOORLimitsMarkers(watchFeature, plot);
		
		return chart;
	}
	
	@Override
	public String getChartTitle(final AbstractFeatureDisplay watchFeature)
	{
		String chartTitle = new String();
		
		if(getEStructuralFeature(watchFeature) != null)
		{
			chartTitle += getEStructuralFeature(watchFeature).getName() + " vs Time";  
		}		
		
		return chartTitle;
	}
	
	@Override
	public void initializeDisplayedValues(SortedMap<Long, Number> timeValueMap) 
	{		
		for(Long time : timeValueMap.keySet())
		{
			Number value = timeValueMap.get(time);
			if(value != null)
			{
				setCurrentValue(value, time);
			}
		}
	}
	
	@Override
	public TimeSeriesCollection getTimeSeriesCollection() 
	{
		if(timeSeriesCollection == null)
		{
			timeSeriesCollection = new TimeSeriesCollection();
			timeSeriesCollection.addSeries(getTimeSeries());
		}
		return timeSeriesCollection;
	}

	public void setHistoryLength(double historyLengthSeconds)
	{
		long historyLengthMilliseconds = Math.round(historyLengthSeconds * 1000.0);
		getTimeSeries().setMaximumItemAge(historyLengthMilliseconds);
	}
	
	@Override
	protected void addNewValueToTimeSeriesCollections(TimeSeriesCollection timeSeriesCollection, Number value, long time) 
	{		
		getTimeSeries().addOrUpdate(new Millisecond(new Date(time)),value.doubleValue());
	}
	
	protected double convertToDisplayUnits(double nativeValue)
	{
		EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
		
		Unit<?> displayUnits = EMFEcoreUIFacade.INSTANCE.getDisplayUnits(eStructuralFeature);
		Unit<?> nativeUnits = EMFEcoreFacade.INSTANCE.getEngineeringUnits(eStructuralFeature);
		
		double displayedValue = nativeValue;
		
		if(displayUnits != null && nativeUnits != null)
		{
			try
			{
				displayedValue = nativeUnits.getConverterTo(displayUnits).convert(nativeValue);									
			}
			catch(Throwable t)
			{										
			}
		}		
		
		return displayedValue;
	}
	
	/**
	 * Return the single TimeSeries used to hole the value vs time.
	 * @return The TimeSeries.
	 */
	protected TimeSeries getTimeSeries()
	{
		if(timeSeries == null)
		{		
			
			String seriesName = "?";
			
			EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
			
			if(eStructuralFeature != null) seriesName = eStructuralFeature.getName();
			
			timeSeries = new TimeSeries(seriesName);			
			if(lastValue != null) timeSeries.add(new Millisecond(new Date()),lastValue);			
			timeSeries.setMaximumItemAge(60000);
			timeSeries.removeAgedItems(true);			   
		}
		
		return timeSeries;
	}
	
	protected void addWarningLimitsMarkers(final AbstractFeatureDisplay watchFeature, final XYPlot plot)
	{
		EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
		
		Number min = null;
		Number max = null;
		
		if(eStructuralFeature != null)
		{
			min = EMFEcoreFacade.INSTANCE.getWarningMinValue(eStructuralFeature);
			if(min != null)
			{
				double displayMin = convertToDisplayUnits(min.doubleValue());
				plot.addRangeMarker(new ValueMarker(displayMin));			
			}
			
			max = EMFEcoreFacade.INSTANCE.getWarningMaxValue(eStructuralFeature);
			if(max != null)
			{
				double displayMax = convertToDisplayUnits(max.doubleValue());
				plot.addRangeMarker(new ValueMarker(displayMax));
			}
		}
	}
	
	protected void addAlarmLimitsMarkers(final AbstractFeatureDisplay watchFeature, final XYPlot plot)
	{
		EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
		Number min = null;
		Number max = null;
		
		if(eStructuralFeature != null)
		{
			min = EMFEcoreFacade.INSTANCE.getAlarmMinValue(eStructuralFeature);
			if(min != null)
			{
				double displayMin = convertToDisplayUnits(min.doubleValue());
				plot.addRangeMarker(new ValueMarker(displayMin));
			}
			
			max = EMFEcoreFacade.INSTANCE.getAlarmMaxValue(eStructuralFeature);
			if(max != null)
			{
				double displayMax = convertToDisplayUnits(max.doubleValue());
				plot.addRangeMarker(new ValueMarker(displayMax));		
			}	
		}
	}
	
	protected void addOORLimitsMarkers(final AbstractFeatureDisplay watchFeature, final XYPlot plot)
	{
		EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
		Number min = null;
		Number max = null;
		
		if(eStructuralFeature != null)
		{
			min = EMFEcoreFacade.INSTANCE.getOutOfRangeMinValue(eStructuralFeature);
			if(min != null)
			{
				double displayMin = convertToDisplayUnits(min.doubleValue());
				plot.addRangeMarker(new ValueMarker(displayMin));
			}
			
			max = EMFEcoreFacade.INSTANCE.getOutOfRangeMaxValue(eStructuralFeature);
			if(max != null)
			{
				double displayMax = convertToDisplayUnits(max.doubleValue());
				plot.addRangeMarker(new ValueMarker(displayMax));			
			}
		}		
	}
	
	protected String getXAxisLabel(final AbstractFeatureDisplay watchFeature)
	{
		return "Time";
	}
	
	protected String getYAxisLabel(final AbstractFeatureDisplay watchFeature)
	{
		String yAxisLabel = new String();
		
		EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
		
		if(eStructuralFeature != null)
		{
			// Adds the units.	
			String units = null;
			Unit<?> displayUnits = EMFEcoreUIFacade.INSTANCE.getDisplayUnits(eStructuralFeature);
			Unit<?> nativeUnits = EMFEcoreFacade.INSTANCE.getEngineeringUnits(eStructuralFeature);
			if(displayUnits != null && nativeUnits != null)
			{
				try
				{
					nativeUnits.getConverterTo(displayUnits);					
					units = displayUnits.toString();
				}
				catch(Throwable t)
				{
					t.printStackTrace();					
					units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(eStructuralFeature);	
				}
			}
			else
			{
				units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(eStructuralFeature);
			}
							
			if(units != null)
			{
				yAxisLabel += units;
			}
		}
		
		return yAxisLabel;
	}

	
	protected Number getMin(final AbstractFeatureDisplay aWatchFeature)
	{
		EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
		Number min = null;
		
		if(eStructuralFeature != null)
		{		
			min = EMFEcoreFacade.INSTANCE.getOutOfRangeMinValue(eStructuralFeature);
			if(min == null) min = EMFEcoreFacade.INSTANCE.getAlarmMinValue(eStructuralFeature);
			if(min == null) min = EMFEcoreFacade.INSTANCE.getWarningMinValue(eStructuralFeature);
		}
		return min;
	}
	
	protected Number getMax(final AbstractFeatureDisplay aWatchFeature)
	{
		EStructuralFeature eStructuralFeature = getEStructuralFeature(watchFeature);
		
		Number max = null;
		
		if(eStructuralFeature !=null)
		{
			max = EMFEcoreFacade.INSTANCE.getOutOfRangeMaxValue(eStructuralFeature);				
			if(max == null) max = EMFEcoreFacade.INSTANCE.getAlarmMaxValue(eStructuralFeature);
			if(max == null) max = EMFEcoreFacade.INSTANCE.getWarningMaxValue(eStructuralFeature);
		}
		return max;
	}
}
