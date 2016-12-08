package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.io.jinput.EVirtualComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFactory;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.jfree.ui.RectangleInsets;

public class AbstractInputConditioningResponsePlotComposite extends Composite {
	
	private Adapter adapter;
	
	private AbstractInputConditioning abstractInputConditioning;
		
	private XYSeriesCollection xySeriesCollection;
	private XYSeries xySeries;	
	private JFreeChart chart;
		
	public AbstractInputConditioningResponsePlotComposite(Composite parent, int style) 
	{
		super(parent, style);			
		this.setLayout(new FillLayout());
		setSize(200, 200);					
		ChartComposite frame = new ChartComposite(this, SWT.NONE, getChart(), true);
		frame.pack();
	}
	
	public AbstractInputConditioningResponsePlotComposite(Composite parent, int style, AbstractInputConditioning abstractInputConditioning) 
	{
		this(parent, style);		
		setLayout(new FillLayout());		
		setAbstractInputConditioning(abstractInputConditioning);			
	}
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	public AbstractInputConditioning getCartesianCoordinatesSet() {
		return abstractInputConditioning;
	}

	public void setAbstractInputConditioning(AbstractInputConditioning abstractInputConditioning) 
	{
		if(this.abstractInputConditioning != null){
			abstractInputConditioning.eAdapters().remove(getAdapter());
		}
		
		this.abstractInputConditioning = abstractInputConditioning;
		
		if(abstractInputConditioning != null)
		{			
			getXYSeries().clear();
			populateSeries();		
			getChart().getXYPlot().getDomainAxis().setAutoRange(true);
			getChart().getXYPlot().getRangeAxis().setAutoRange(true);			
		}
		
		this.abstractInputConditioning.eAdapters().add(getAdapter());
	}

	protected JFreeChart getChart()
	{
		if(chart == null)
		{
		   	String chartTitle = "Output vs Input";   	
	    	String chartXAxisLabel = "Input";    	
	    	String chartYAxisLabel = "Output";
	    	
	    	chart = ChartFactory.createXYLineChart(
					chartTitle, // title
					chartXAxisLabel, // x-axis label
					chartYAxisLabel, // y-axis label
					getXYSeriesCollection() , // data set
					PlotOrientation.VERTICAL,
					false, // do not create legend
					true, // generate tooltips
					false // do not generate URLs.
					);
	
	        chart.setBackgroundPaint(Color.white);
	
	        // Creates the Plot.
	        XYPlot plot = (XYPlot) chart.getPlot();
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
	       
	        plot.getRangeAxis().setAutoRange(false);
	        plot.getRangeAxis().setRange(-1, 1);
	        plot.getDomainAxis().setAutoRange(true);    
		}
		return chart;
	}
	
	public XYSeries getXYSeries()
	{
		if(xySeries == null)
		{		
			String name = new String("");			
			xySeries = new XYSeries(name, false, true);			
		}
		
		return xySeries;
	}
	
	protected XYSeriesCollection getXYSeriesCollection() 
	{
		if(xySeriesCollection == null)
		{
			xySeriesCollection = new XYSeriesCollection();
			xySeriesCollection.addSeries(getXYSeries());
		}
		return xySeriesCollection;
	}
	
	protected void populateSeries()
	{
		try
		{
			if(this.abstractInputConditioning != null)
			{
				EVirtualComponent component = ApogyCommonIOJInputFactory.eINSTANCE.createEVirtualComponent();
				
				AbstractInputConditioning conditioning = EcoreUtil.copy(abstractInputConditioning);
				
				float input = -1.0f;
				float inputIncrement = 0.01f;
				float output = 0.0f;
				while(input <= 1.0f)
				{
					component.setCurrentValue(input);
					output = conditioning.conditionInput(component);																			
					getXYSeries().add(new XYDataItem(input, output));			
					
					input += inputIncrement;
				}										
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					setAbstractInputConditioning(abstractInputConditioning);
				}
			};
		}
		return adapter;
	}

}