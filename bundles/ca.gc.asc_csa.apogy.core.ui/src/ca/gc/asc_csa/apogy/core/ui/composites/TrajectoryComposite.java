package ca.gc.asc_csa.apogy.core.ui.composites;

import java.awt.Color;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.jfree.ui.RectangleInsets;

public class TrajectoryComposite extends Composite 
{
	private PoseProvider movable = null;
	private Adapter movableAdapter;
	private Vector3d previousPosition = null;
	
	private ChartComposite chartComposite;
	private JFreeChart chart;
	private XYPlot plot;
	private XYSeriesCollection xySeriesCollection;
	private XYSeries xySeries;
	
	private double maxX = Double.NEGATIVE_INFINITY; 
	private double minX = Double.POSITIVE_INFINITY; 
	private double maxY = Double.NEGATIVE_INFINITY;
	private double minY = Double.POSITIVE_INFINITY;			
	
	public TrajectoryComposite(Composite parent, int style) 
	{
		super(parent, style);	
		this.setLayout(new FillLayout());
		setSize(200, 200);					
		chartComposite = new ChartComposite(this, SWT.NONE, getChart(), true);
		chartComposite.pack();

		/// Listens for change in size to update the axis ranges of the plot.
		chartComposite.addControlListener(new ControlListener() {
			
			@Override
			public void controlResized(ControlEvent e) 
			{				
				squareOffGraph();
			}
			
			@Override
			public void controlMoved(ControlEvent e) {					
			}
		});		
	}
	
	public void setMovable(PoseProvider newMovable)
	{		
		if(this.movable != null)
		{
			this.movable.eAdapters().remove(getMovableAdapter());
		}
		
		// Clears the data
		clearTrajectoryData();
		
		if(newMovable != null)
		{
			newMovable.eAdapters().add(getMovableAdapter());
		}
		
		this.movable = newMovable;
	}
	
	public PoseProvider getMovable()
	{
		return movable;
	}
	
	public void clearTrajectoryData()
	{
		// Clears the data
		getXYSeries().clear();
				
		maxX = Double.NEGATIVE_INFINITY; 
		minX = Double.POSITIVE_INFINITY; 
		maxY = Double.NEGATIVE_INFINITY;
		minY = Double.POSITIVE_INFINITY;
	}
	
	protected JFreeChart getChart()
	{						
		if(chart == null)
		{			
			plot = new XYPlot(getXYSeriesCollection(), new NumberAxis("X (m)"), new NumberAxis("Y (m)"), new StandardXYItemRenderer());
			chart = new JFreeChart(plot);
			chart.removeLegend();
			chart.setAntiAlias(true);
			
			squareOffGraph();
		}			
		return chart;
	}
	
	public XYSeries getXYSeries()
	{
		if(xySeries == null)
		{					
			xySeries = new XYSeries("trajectory", false, true);					
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
	
	protected XYPlot createXYPlot()
	{		
		XYPlot plot = new XYPlot(getXYSeriesCollection(), new NumberAxis("X (m)"), new NumberAxis("Y (m)"), new StandardXYItemRenderer());
		       
		plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.black);
        plot.setRangeGridlinePaint(Color.black);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
                        
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);          
        
        plot.setDomainMinorGridlinesVisible(true);                
        plot.setRangeMinorGridlinesVisible(true);
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);            
        
        plot.getRangeAxis().setLowerBound(-1);
        plot.getRangeAxis().setUpperBound(1);
        plot.getRangeAxis().setAutoRange(false);
                
        plot.getDomainAxis().setLowerBound(-1);
        plot.getDomainAxis().setUpperBound(1);
        plot.getDomainAxis().setAutoRange(false);
				
		return plot;
	}
	
	private void squareOffGraph() 
	{
		Display.getDefault().asyncExec(new Runnable() 
		{		
			@Override
			public void run() 
			{			
				if(chartComposite != null && !chartComposite.isDisposed())
				{
				   double width  = chartComposite.getSize().x;
				   double height = chartComposite.getSize().y;				   								  
				   
				   ValueAxis  xAxis = ((XYPlot)chart.getPlot()).getDomainAxis(0);
				   ValueAxis  yAxis = ((XYPlot)chart.getPlot()).getRangeAxis(0);
				   
				   double yLower = yAxis.getLowerBound();
				   double yUpper = yAxis.getUpperBound();
				   
				   double xLower = xAxis.getLowerBound();
				   double xUpper = xAxis.getUpperBound();
				   
				   if (width > height) 
				   {
				      double idealXRange = (yUpper - yLower) * width / height;
				      double currXRange  =  xUpper - xLower;
				      
				      double xDelta = (idealXRange - currXRange) / 2;
				      
				      // Are we within a pixel of being square?
				      if ((int)(xDelta * width) == 0) 
				      {
				         return;
				      }
				      
				      xAxis.setLowerBound(xLower - xDelta);
				      xAxis.setUpperBound(xUpper + xDelta);
				   } 
				   else if (height > width) 
				   {
				      double idealYRange = (xUpper - xLower) * height / width;
				      double currYRange  =  yUpper - yLower;
				      
				      double yDelta = (idealYRange - currYRange) / 2;
				      
				      // Are we within a pixel of being square?
				      if ((int)(yDelta * height) == 0) {
				         return;
				      }
				      
				      yAxis.setLowerBound(yLower - yDelta);
				      yAxis.setUpperBound(yUpper + yDelta);
				   }
				}
			}
		});		
	}
	
	protected Adapter getMovableAdapter()
	{
		if(movableAdapter == null)
		{
			movableAdapter = new AdapterImpl()
			{								
				@Override
				public void notifyChanged(Notification msg) 
				{				
					super.notifyChanged(msg);
					
					if(msg.getEventType() != Notification.REMOVING_ADAPTER)
					{
						if(msg.getFeatureID(PoseProvider.class) == ApogyCorePackage.POSE_PROVIDER__POSE_TRANSFORM)
						{
							if(msg.getNewValue() instanceof Matrix4x4)
							{
								Matrix4x4 matrix4x4 = (Matrix4x4) msg.getNewValue();
								final Vector3d position = new Vector3d();
								matrix4x4.asMatrix4d().get(position);
								Display.getDefault().asyncExec(new Runnable() 
								{		
									@Override
									public void run() 
									{		
										if(!chartComposite.isDisposed())
										{			
											double positionDelta = Double.MAX_VALUE;
																						
											if(previousPosition != null)
											{
												Vector3d delta = new Vector3d();
												delta.sub(position, previousPosition);
												positionDelta = delta.lengthSquared();
											}
											
											// Updates previous position.
											previousPosition = position;
																					
											if(positionDelta > 0)
											{
												if(!chartComposite.isDisposed()) xySeries.add(new XYDataItem(position.x, position.y));	
																						
												boolean update = false;
												if(position.x < minX || minX == Double.POSITIVE_INFINITY)
												{
													minX = position.x;													
													update = true;
												}
												
												if(position.x > maxX || maxX == Double.NEGATIVE_INFINITY)
												{
													maxX = position.x;
													
													if(maxX == minX)
													{
														maxX += 0.01;
													}
													
													update = true;
												}
												
												if(position.y < minY || minY == Double.POSITIVE_INFINITY)
												{
													minY = position.y;
													update = true;
												}
												
												if(position.y > maxY || maxY == Double.NEGATIVE_INFINITY)
												{
													maxY = position.y;
													if(maxY == minY)
													{
														maxY += 0.01;
													}
													
													update = true;
												}
												
												if(update)
												{		
													//squareOffGraph();
													
													double width  = chartComposite.getSize().x;
													double height = chartComposite.getSize().y;																								
													double aspectRatio = width / height;
													
													double xRange = (maxX - minX);											
													double yRange = (maxY - minY);
													double rangeRatio = xRange / yRange;
													
													if(rangeRatio < aspectRatio)
													{
														// Need to stretch xRange.
														double stretch = aspectRatio / rangeRatio;
														
														double xCenter = (minX + maxX) / 2.0;												
														double lowerX = xCenter + ((minX - xCenter) * stretch);
														double upperX = xCenter + ((maxX - xCenter) * stretch);
														
														ValueAxis   xAxis = ((XYPlot)chart.getPlot()).getDomainAxis(0);
														xAxis.setLowerBound(lowerX);
														xAxis.setUpperBound(upperX);
																										
														// Updates the yAxis Range
														ValueAxis   yAxis = ((XYPlot)chart.getPlot()).getRangeAxis(0);
														yAxis.setLowerBound(minY);
														yAxis.setUpperBound(maxY);												
													}
													else
													{
														// Need to stretch yRange.
														double stretch = rangeRatio / aspectRatio;
														
														double yCenter = (minY + maxY) / 2.0;												
														double lowerY = yCenter + ((minY - yCenter) * stretch);
														double upperY = yCenter + ((maxY - yCenter) * stretch);
																
														ValueAxis   yAxis = ((XYPlot)chart.getPlot()).getRangeAxis(0);												
														yAxis.setLowerBound(lowerY);
														yAxis.setUpperBound(upperY);
														
														// Updates the xAxis Range
														ValueAxis   xAxis = ((XYPlot)chart.getPlot()).getDomainAxis(0);
														xAxis.setLowerBound(minX);
														xAxis.setUpperBound(maxX);												
													}																						
												}
											}
										}
									}
								});
							}
						}
					}
				}
			};
		}
		return movableAdapter;
	}
	
	@Override
	public void dispose() 
	{
		if(getMovable() != null) getMovable().eAdapters().remove(getMovableAdapter());
		getXYSeries().clear();
		super.dispose();
	}
}
