package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.composites;
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

import java.awt.BasicStroke;
import java.awt.Color;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.jfree.ui.RectangleInsets;

public class VisibilityPassSpacecraftPositionHistoryRangeComposite extends Composite 
{
	private VisibilityPassSpacecraftPositionHistory positionHistory = null; 
	private TimeSeriesCollection rangeDataSet = null;
	private TimeSeriesCollection rangeRateDataSet = null;
	private TimeSeries rangeTimeSeries = null;
	private TimeSeries rangeRateTimeSeries = null;
	private JFreeChart chart;
	
	public VisibilityPassSpacecraftPositionHistoryRangeComposite(Composite parent, int style) 
	{
		super(parent, style);			
		setLayout(new FillLayout());
		
		// Adds the chart parentComposite.
		new ChartComposite(this, SWT.NONE, getChart(), true);
	}

	public VisibilityPassSpacecraftPositionHistory getPositionHistory() 
	{
		return positionHistory;
	}

	public void setPositionHistory(VisibilityPassSpacecraftPositionHistory positionHistory) 
	{
		// Clears current series.
		getRangeTimeSeries().clear();
		getRangeRateTimeSeries().clear();
		
		this.positionHistory = positionHistory;
		
		// Populates the series with the new data if applicable.
		if(positionHistory != null)
		{
			populateRangeTimeSeries(getRangeTimeSeries(), positionHistory);
			populateRangeRateTimeSeries(getRangeRateTimeSeries(), positionHistory);
		}
	}
	
	protected JFreeChart getChart()
	{
		if(chart == null)
		{
		   	String chartTitle = "Range and Range Rate vs Time";   	
	    	String chartXAxisLabel = "Time (s)";    	
	    	String chartYAxisLabel = "Range (km)";
	    	
	    	chart = ChartFactory.createTimeSeriesChart(
					chartTitle, // title
					chartXAxisLabel, // x-axis label
					chartYAxisLabel, // y-axis label
					getRangeDataSet() , // data set
					true, // Generate legend
					true, // generate tooltips
					false // do not generate URLs.
					);
	
	        chart.setBackgroundPaint(Color.white);
	
	        // Creates the Plot.
	        XYPlot plot = (XYPlot) chart.getPlot();
	        
	        final NumberAxis axis2 = new NumberAxis("Range Rate (km/s)");
	        axis2.setAutoRangeIncludesZero(false);
	        plot.setRangeAxis(1, axis2);
	        plot.setDataset(1, getRangeRateDataSet());
	        plot.mapDatasetToRangeAxis(1, 1);
	        	        	        	       
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
	        if (xyItemRenderer instanceof XYLineAndShapeRenderer) 
			{
	        	 // Just draw lines, no shapes.
				XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) xyItemRenderer;
				renderer.setBaseShapesVisible(false);
				renderer.setBaseShapesFilled(false);
				renderer.setSeriesStroke(0, new BasicStroke(2.0f));
				renderer.setSeriesPaint(0, Color.BLUE);
			}
	        
	        final StandardXYItemRenderer renderer2 = new StandardXYItemRenderer();
	        renderer2.setSeriesPaint(0, Color.RED);	   
	        renderer2.setSeriesStroke(0, new BasicStroke(2.0f));	   
	        plot.setRenderer(1, renderer2);
	       
	        plot.getRangeAxis().setAutoRange(true);
	        plot.getDomainAxis().setAutoRange(true);    
	        	        	        
		}
		return chart;
	}
	
	protected TimeSeriesCollection getRangeDataSet()
	{
		if(rangeDataSet == null)
		{
			rangeDataSet = new TimeSeriesCollection();	
			rangeDataSet.addSeries(getRangeTimeSeries());			
		}
		
		return rangeDataSet;
	}
	
	protected TimeSeriesCollection getRangeRateDataSet()
	{
		if(rangeRateDataSet == null)
		{
			rangeRateDataSet = new TimeSeriesCollection();	
			rangeRateDataSet.addSeries(getRangeRateTimeSeries());			
		}
		
		return rangeRateDataSet;
	}
	
	public TimeSeries getRangeTimeSeries() 
	{
		if(rangeTimeSeries == null)
		{
			rangeTimeSeries = new TimeSeries("Range (km)");
			if(getPositionHistory() != null)
			{
				populateRangeTimeSeries(rangeTimeSeries, getPositionHistory());
			}			
		}
		
		return rangeTimeSeries;				
	}

	public TimeSeries getRangeRateTimeSeries() 
	{
		if(rangeRateTimeSeries == null)
		{
			rangeRateTimeSeries = new TimeSeries("Range Rate (km/s)");
			if(getPositionHistory() != null)
			{
				populateRangeRateTimeSeries(rangeRateTimeSeries, getPositionHistory());
			}			
		}
		
		return rangeRateTimeSeries;
	}

	protected void populateRangeTimeSeries(TimeSeries rangeTimeSeries, VisibilityPassSpacecraftPositionHistory positionHistory)
	{								
		for(VisibilityPassSpacecraftPosition position : positionHistory.getPositions())
		{
			double rangeKM = position.getRange() * 0.001;			
			rangeTimeSeries.addOrUpdate(new Millisecond(position.getTime()),rangeKM);
		}		
	}
	
	protected void populateRangeRateTimeSeries(TimeSeries rangeRateTimeSeries, VisibilityPassSpacecraftPositionHistory positionHistory)
	{								
		for(VisibilityPassSpacecraftPosition position : positionHistory.getPositions())
		{
			double rangeRateKMS = position.getRangeRate() * 0.001;			
			rangeRateTimeSeries.addOrUpdate(new Millisecond(position.getTime()),rangeRateKMS);
		}		
	}
}
