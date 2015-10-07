package org.eclipse.symphony.core.recordings.ui.composites;

import java.awt.BasicStroke;
import java.awt.Color;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Watch;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade;
import org.eclipse.symphony.core.recordings.RecordingResult;
import org.eclipse.symphony.core.recordings.RecordingTrack;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.jfree.ui.RectangleInsets;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;

public class RecordingTrackComposite extends Composite 
{
	private RecordingTrack recordingTrack = null;

	private TimeSeriesCollection timeSeriesCollection;
	private JFreeChart chart;
	
	public RecordingTrackComposite(Composite parent, int style) 
	{
		super(parent, style);			
		this.setLayout(new FillLayout());
		setSize(200, 200);	
		
		ChartComposite frame = new ChartComposite(this, SWT.NONE, getChart(), true);
		frame.pack();
	}

	public void setRecordingTrack(RecordingTrack newRecordingTrack)
	{
		getTimeSeriesCollection().removeAllSeries();
		
		this.recordingTrack = newRecordingTrack;
		
		TimeSeries timeSeries = createTimeSeries(recordingTrack);
		
		if(timeSeries != null)
		{
			getTimeSeriesCollection().addSeries(timeSeries);
			setDataAvailable(true);
		}
		else
		{
			setDataAvailable(false);
		}
	}
			
	@Override
	protected void checkSubclass() 
	{	
	}	
	
	protected void setDataAvailable(boolean dataAvailable)
	{
		XYPlot plot = (XYPlot) chart.getPlot();
		
		getChart().setBorderVisible(dataAvailable);
				
		plot.setOutlineVisible(dataAvailable);
		plot.setDomainGridlinesVisible(dataAvailable);
		plot.setRangeGridlinesVisible(dataAvailable);
		
		plot.getRangeAxis().setVisible(dataAvailable);
		plot.getDomainAxis().setVisible(dataAvailable);
		
		plot.setRangeCrosshairVisible(dataAvailable);
		plot.setDomainCrosshairVisible(dataAvailable);
		
		if(dataAvailable)
		{			
		}
		else
		{	
			getChart().setTitle("");
			plot.setNoDataMessage("NO DATA DISPLAYABLE");
		}
	}
	
	protected TimeSeries createTimeSeries(final RecordingTrack recordingTrack)
	{				
		TimeSeries timeSeries = null;
		
		if(recordingTrack != null)
		{						
			EStructuralFeature eStructuralFeature = getEStructuralFeature(recordingTrack);
			
			Watch watch = EMFEcoreInvocatorFacade.INSTANCE.resolveWatch(recordingTrack.getChannel().getFeature());		  		  		 
			String valueName = watch.getVariable().getName() + "." + EMFEcoreFacade.INSTANCE.getAncestriesString(recordingTrack.getChannel().getFeature());	  		  
			
			if(((eStructuralFeature.getEType().getInstanceClass() == double.class) ||
					(eStructuralFeature.getEType().getInstanceClass() == float.class) ||
					(eStructuralFeature.getEType().getInstanceClass() == short.class) ||
					(eStructuralFeature.getEType().getInstanceClass() == long.class) ||
					(eStructuralFeature.getEType().getInstanceClass() == int.class)))
			{					
				timeSeries = new TimeSeries(valueName);
				
				for(RecordingResult recordingResult : recordingTrack.getResults())
				{					
					Object object = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getResultValue(recordingResult);
					if(object instanceof Number)
					{
						double doubleValue = ((Number) object).doubleValue();
						timeSeries.addOrUpdate(new Millisecond(recordingResult.getTime()),doubleValue);
					}
				}
			}
			else if(eStructuralFeature.getEType().getInstanceClass() == boolean.class)
			{
				timeSeries = new TimeSeries(valueName);
				
				for(RecordingResult recordingResult : recordingTrack.getResults())
				{
					Object object = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getResultValue(recordingResult);
					double doubleValue = 0.0;
					if(((Boolean) object).booleanValue()) doubleValue =1.0;
					timeSeries.addOrUpdate(new Millisecond(recordingResult.getTime()),doubleValue);
				}
			}
			else if(eStructuralFeature.getEType() instanceof Enumerator)
			{
				timeSeries = new TimeSeries(valueName);
				
				for(RecordingResult recordingResult : recordingTrack.getResults())
				{
					Object object = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getResultValue(recordingResult);
					if(object instanceof Enumerator)
					{
						double doubleValue = ((Enumerator) object).getValue();
						timeSeries.addOrUpdate(new Millisecond(recordingResult.getTime()),doubleValue);
					}
				}
			}
			
			// Updates the chart title.
			String title = valueName + " vs Time";
			getChart().setTitle(title);	
	    	
			String units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(eStructuralFeature);
			if(units != null) valueName += " (" + units + ")";
			
			XYPlot plot = (XYPlot) chart.getPlot();
			plot.getRangeAxis().setLabel(valueName);						
		}
		
		return timeSeries;
	}
	
	protected TimeSeriesCollection getTimeSeriesCollection()
	{
		if(timeSeriesCollection == null)
		{
			timeSeriesCollection = new TimeSeriesCollection();			
		}
		return timeSeriesCollection;
	}
	
	protected JFreeChart getChart()
	{
		if(chart == null)
		{
		   	String chartTitle = "? vs Time";   	
	    	String chartXAxisLabel = "Time (s)";    	
	    	String chartYAxisLabel = "";
	    	
	    	chart = ChartFactory.createXYLineChart(
					chartTitle, // title
					chartXAxisLabel, // x-axis label
					chartYAxisLabel, // y-axis label
					getTimeSeriesCollection() , // data set
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
	       
	        plot.getRangeAxis().setAutoRange(true);
	        plot.getDomainAxis().setAutoRange(true);    
		}
		return chart;
	}
	
	protected EStructuralFeature getEStructuralFeature(final RecordingTrack recordingTrack)
	{
		EStructuralFeature eStructuralFeature = null;
		
		if(recordingTrack.getChannel().getFeature() instanceof AbstractFeatureSpecifier)
		{
			AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) recordingTrack.getChannel().getFeature();			
			eStructuralFeature = abstractFeatureSpecifier.getStructuralFeature() ;		
		}
		
		return eStructuralFeature;
	}
}
