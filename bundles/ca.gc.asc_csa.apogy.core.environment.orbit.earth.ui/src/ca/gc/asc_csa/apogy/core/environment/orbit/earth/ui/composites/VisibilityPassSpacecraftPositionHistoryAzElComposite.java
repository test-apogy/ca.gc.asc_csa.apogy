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
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.data.Range;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;

public class VisibilityPassSpacecraftPositionHistoryAzElComposite extends Composite 
{
	private VisibilityPassSpacecraftPositionHistory positionHistory = null; 
	
	private JFreeChart chart;
	private XYSeriesCollection xySeriesCollection = null;
	private XYSeries currentDataSeries = null;
	
	public VisibilityPassSpacecraftPositionHistoryAzElComposite(Composite parent, int style) 
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
		getCurrentDataSeries().clear();
		
		this.positionHistory = positionHistory;
		
		// Populates the series with the new data if applicable.
		if(positionHistory != null)
		{
			populateDataSeries(getCurrentDataSeries(), positionHistory);
		}
	}
	
	protected JFreeChart getChart()
	{
		if(chart == null)
		{
			chart = ChartFactory.createPolarChart("Elevation vs Azimuth", getXYSeriesCollection(), false, false, false); 
			
			final PolarPlot plot = (PolarPlot) chart.getPlot();
			plot.setBackgroundPaint(Color.white);
			plot.setAngleGridlinePaint(Color.black);		
			plot.setAngleLabelPaint(Color.black);
			plot.setRadiusGridlinePaint(Color.black);
			plot.setRadiusGridlinesVisible(true);		
			plot.setNoDataMessage("No Data.");
					
	        plot.getAxis().setAutoRange(false);
	        plot.getAxis().setInverted(true);
	        plot.getAxis().setRange(new Range(0, 90.0));
	        plot.getAxis().setAxisLineStroke(new BasicStroke(2.0f));
	        plot.getAxis().setAxisLinePaint(Color.black);
	        
	        
	        DefaultPolarItemRenderer defaultPolarItemRenderer = new DefaultPolarItemRenderer()
	        {
	        	/**
				 * 
				 */
				private static final long serialVersionUID = 3822995919130258873L;
	
				@Override
				public void drawSeries(Graphics2D g2, Rectangle2D dataArea, PlotRenderingInfo info, PolarPlot plot, XYDataset dataset, int seriesIndex) 
				{
					g2.setPaint(lookupSeriesPaint(seriesIndex));
		            g2.setStroke(lookupSeriesStroke(seriesIndex));
					
					GeneralPath polyline = new GeneralPath();					
		            int numPoints = dataset.getItemCount(seriesIndex);	
		            		            
		            Point point = null;	
		            Point previousPoint = null;
		            for (int i = 0; i < numPoints-1; i++) 
		            {
		            	 double theta = dataset.getXValue(seriesIndex, i);
		            	 double radius = dataset.getYValue(seriesIndex, i);
		            	 point = plot.translateValueThetaRadiusToJava2D(theta, radius, dataArea);
		            	 
		            	 if(i == 0)
		            	 {
		            		 polyline.moveTo(point.x, point.y);
		            	 }
		            	 else
		            	 {
		            		 polyline.lineTo(point.x, point.y);
		            	 }
		            	 
		            	 if(i+1 < numPoints-1)
		            	 {
		            		 previousPoint = point;
		            	 }
		            }
		            
		            // Draws the data line.
		            g2.draw(polyline);	
		            
		            // Adds an arrow at the last point.
		            if(point != null)
		            {
		            	double deltaX = point.x - previousPoint.x;
                		double deltaY = point.y - previousPoint.y;                		                				                            		
		            	double theta = getRotationAngle(deltaX, deltaY);
		            	
		            	g2.translate(point.x, point.y);
		            	g2.rotate(theta);
		            				            			            	
		            	int x1Points[] = {0, -20, -20};
		            	int y1Points[] = {0, 5, -5};
		            	Polygon polygon = new Polygon(x1Points, y1Points, x1Points.length);
		            	
		            	g2.draw(polygon);
		            	g2.fillPolygon(polygon);
		            	
		            	// Un-do the transform.
		            	g2.rotate(-theta);
		            	g2.translate(-point.x, -point.y);
		            }		            		            	           
				}
	        };
	        plot.setRenderer(defaultPolarItemRenderer);
	        	        
		}
		return chart;
	}
	
	private double getRotationAngle(double deltaX, double deltaY)
	{
		double theta = 0;
		
		if(deltaX > 0)
		{
			if(deltaY > 0)
			{
				theta = Math.atan(Math.abs(deltaY) / Math.abs(deltaX));
			}
			else
			{
				theta = -1.0 * Math.atan(Math.abs(deltaY) / Math.abs(deltaX));
			}
		}
		else
		{
			if(deltaY > 0)
			{
				theta = Math.PI - Math.atan(Math.abs(deltaY) / Math.abs(deltaX));
			}
			else
			{						
				theta = Math.atan(Math.abs(deltaY) / Math.abs(deltaX)) - Math.PI;
			}
		}
		
		return theta;
	}
	
	protected XYSeriesCollection getXYSeriesCollection()
	{
		if(xySeriesCollection == null)
		{
			xySeriesCollection = new XYSeriesCollection();		
			xySeriesCollection.addSeries(getCurrentDataSeries());			
		}
		
		return xySeriesCollection;
	}
	
	protected XYSeries getCurrentDataSeries()
	{
		if(currentDataSeries == null)
		{
			currentDataSeries = new XYSeries("Pass", false);
			if(getPositionHistory() != null)
			{
				populateDataSeries(currentDataSeries, getPositionHistory());
			}			
		}
		
		return currentDataSeries;
	}
	
	protected void populateDataSeries(XYSeries xySeries, VisibilityPassSpacecraftPositionHistory positionHistory)
	{							
		for(VisibilityPassSpacecraftPosition position : positionHistory.getPositions())
		{
			double azimuth = Math.toDegrees(position.getAzimuth());
			double elevation = 90.0 - Math.toDegrees(position.getElevation());
			xySeries.add(azimuth, elevation);
		}					
	}
}
