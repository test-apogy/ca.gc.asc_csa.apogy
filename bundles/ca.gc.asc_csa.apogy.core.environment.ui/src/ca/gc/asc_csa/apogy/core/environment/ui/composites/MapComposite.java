package ca.gc.asc_csa.apogy.core.environment.ui.composites;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.Activator;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFacade;
import ca.gc.asc_csa.apogy.core.environment.ui.MapAnnotation;
import ca.gc.asc_csa.apogy.core.environment.ui.MapTool;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewExtent;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.ui.preferences.ApogyEnvironmentUIPreferencesConstants;
import org.eclipse.ui.progress.UIJob;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.annotations.XYShapeAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.experimental.chart.swt.ChartComposite;
import org.jfree.ui.TextAnchor;

public class MapComposite extends Composite 
{
	//public static final int MAP_IMAGE_MAXIMUM_NUMBER_OF_PIXELS = 1024 * 1024;
	
	
	public static final int MAXIMUM_NUMBER_OF_TICK_ALONG_X = 12;
	public static final double DEFAULT_TERRAIN_DIMENSION = 100;
	
	public static final double CURSOR_POSITION_RADIUS = 0.25;
	
	private Adapter mapViewConfigurationAdapter;
	private boolean busy = false;
	private UIJob uiJob;
	
	protected MapViewConfiguration mapViewConfiguration;
	protected ChartComposite chartComposite;
	
	protected JFreeChart chart;
	protected XYPlot plot;
	protected XYSeriesCollection xySeriesCollection;
	protected XYTextAnnotation staticPositionText = null;
	protected XYShapeAnnotation staticPositionShape = null;
	
	protected XYTextAnnotation dynamicPositionText = null;	
	protected Color cursorCoordinatesColor = null;	
	protected AbstractEImage mapImage;
	
	protected List<MapAnnotation> mapAnnotations = new  ArrayList<MapAnnotation>();
	protected List<AbstractXYAnnotation> localAbstractXYAnnotations = new ArrayList<AbstractXYAnnotation>();
	
//	protected Map<VariableAnnotation, XYSeries> variableToXYSeries = new HashMap<VariableAnnotation, XYSeries>();	
//	protected List<MapTool> mapTools = new ArrayList<MapTool>();
//	
	
	private ChartMouseListener chartMouseListener = null;
	
	public MapComposite(Composite parent, int style) 
	{
		this(parent, style, null);
	}

	public MapComposite(Composite parent, int style, MapViewConfiguration mapViewConfiguration) 
	{
		super(parent, style);		
		setLayout(new FillLayout());
	
		Composite top = new Composite(this, SWT.NONE);
		top.setLayout(new GridLayout(1, false));
		
		// Composite holding the plot.
		ScrolledComposite scrolledComposite = new ScrolledComposite(top, SWT.NONE | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		chartComposite = createChartComposite(scrolledComposite);
		chartComposite.pack();				
		chartComposite.setSize(getChartCompositeSize());
		
		scrolledComposite.setContent(chartComposite);		
		setMapViewConfiguration(mapViewConfiguration);
		
		getUIJob().schedule();
		
		chartComposite.addChartMouseListener(getChartMouseListener());
	}
	
	@Override
	public void dispose() 
	{	
		chartComposite.removeChartMouseListener(getChartMouseListener());
		getUIJob().cancel();
		setMapViewConfiguration(null);
		super.dispose();
	}
	
	public void resetMaps()
	{
		// Updates the size of the plot and background image.
		if(plot != null && chartComposite != null && !chartComposite.isDisposed() && getMapViewConfiguration() != null)
		{
			RectangularRegion rectangularRegion = null;
			if(getMapViewConfiguration().getMapImageRectangularRegion().getXDimension() == 0.0 || getMapViewConfiguration().getMapImageRectangularRegion().getYDimension() == 0.0)			
			{
				rectangularRegion = getMapViewConfiguration().getDefaultRectangularRegion();
				
				Logger.INSTANCE.log(Activator.ID, this, "Map Configuration covers area of 0, using default size.", EventSeverity.WARNING);
			}
			else
			{				
				rectangularRegion = getMapViewConfiguration().getMapImageRectangularRegion();
			}
			
			plot.getDomainAxis().setLowerBound(rectangularRegion.getXMin());
			plot.getDomainAxis().setUpperBound(rectangularRegion.getXMax());
						
			plot.getRangeAxis().setLowerBound(rectangularRegion.getYMin());
			plot.getRangeAxis().setUpperBound(rectangularRegion.getYMax());
					    		
			setBackgroundMapImage(getMapViewConfiguration().getMapImage());
														   
			// Update tick size.				
			double tickSize = getTickSize(rectangularRegion.getXDimension());		
			((NumberAxis)plot.getDomainAxis()).setTickUnit(new NumberTickUnit(tickSize));
			((NumberAxis)plot.getRangeAxis()).setTickUnit(new NumberTickUnit(tickSize));
						
			chartComposite.setSize(getChartCompositeSize());	
			
			// TODO Zoom out to get everything in view !
		}
	}

	public void clearAllTrajectories()
	{
		if(getMapViewConfiguration() != null)
		{
			for(MapAnnotation mapAnnotation : getMapViewConfiguration().getMapAnnotations())
			{
				if(mapAnnotation instanceof TrajectoryProvider)
				{
					TrajectoryProvider trajectoryProvider = (TrajectoryProvider) mapAnnotation;
					trajectoryProvider.clear();
				}
			}
		}
	}
	
	public void setMapViewConfiguration(MapViewConfiguration newMapViewConfiguration)
	{
		if(this.mapViewConfiguration != null) this.mapViewConfiguration.eAdapters().remove(getMapViewConfigurationAdapter());
		
		this.mapViewConfiguration = newMapViewConfiguration;	
		
		// Clear the list of mapAnnotations;
		mapAnnotations.clear();
		
		if(chartComposite != null && !chartComposite.isDisposed())
		{		
			// Clears the XYSeries.
			getXYSeriesCollection().removeAllSeries();
			
			if(newMapViewConfiguration != null)
			{
				for(MapAnnotation mapAnnotation : newMapViewConfiguration.getMapAnnotations())
				{					
					addMapAnnotation(mapAnnotation);
				}
				
				newMapViewConfiguration.eAdapters().add(getMapViewConfigurationAdapter());
				
				// Updates the maps.
				resetMaps();
			}
		}
	}
	
	public MapViewConfiguration getMapViewConfiguration()
	{
		return mapViewConfiguration;
	}		
				
	protected double getTickSize(double xDimension)
	{
		double xTickSize = xDimension / MAXIMUM_NUMBER_OF_TICK_ALONG_X;
		 
		if(xDimension >= (5 * MAXIMUM_NUMBER_OF_TICK_ALONG_X))
		{
			// Gets closest factor of 5.0.
			double remainder = Math.IEEEremainder(xTickSize, 5.0);
			xTickSize = Math.floor((xTickSize - remainder));
		}
		 
		return xTickSize;
	}
	
	protected Point getChartCompositeSize()
	{		 			
		double yOverXratio = 1.0;
		
		if(getPlot() != null)
		{
			double xExtent = getPlot().getDomainAxis().getUpperBound() - getPlot().getDomainAxis().getLowerBound();
			double yExtent = getPlot().getRangeAxis().getUpperBound() - getPlot().getRangeAxis().getLowerBound();
			yOverXratio = yExtent / xExtent;		
		}
		 		 
		int width = 1096;		 		 
		int height = (int) Math.round(width * yOverXratio);
		 
		return new Point(width, height);		 
	}
		
	protected ChartComposite createChartComposite(Composite parent)
	{
		final ChartComposite chartComposite = new ChartComposite(parent, SWT.NONE, getChart(), true)
		{
			// Disable all we do not want.
			public void zoom(org.eclipse.swt.graphics.Rectangle rectangle) 
			{
				super.zoom(rectangle);				
				resizeBackgroundImage();								
			};
			public void zoomInDomain(double arg0, double arg1) 
			{
				super.zoomInDomain(arg0, arg1);
				resizeBackgroundImage();
			};
			public void zoomInBoth(double x, double y)
			{
				super.zoomInBoth(x, y);
				resizeBackgroundImage();
			};
			public void zoomInRange(double arg0, double arg1) 
			{
				super.zoomInRange(arg0, arg1);
				resizeBackgroundImage();
			};
			public void zoomOutBoth(double x, double y) 
			{
				super.zoomOutBoth(x, y);
				resizeBackgroundImage();
			};
			public void zoomOutDomain(double arg0, double arg1)
			{
				super.zoomOutDomain(arg0, arg1);
				resizeBackgroundImage();
			};
			public void zoomOutRange(double arg0, double arg1) 
			{
				super.zoomOutRange(arg0, arg1);
				resizeBackgroundImage();
			};
			@Override
			public boolean dragDetect(Event event) 
			{
				return false;
			}
			@Override
			public boolean dragDetect(MouseEvent event) 
			{
				return false;
			}			
		};
		
		chartComposite.pack();				
		// TODO chartComposite.setSize(getChartCompositeSize());
		
		// Adds listeners that displays the cursor coordinates.		
		chartComposite.addChartMouseListener(new ChartMouseListener() 
		{								
			public void chartMouseMoved(ChartMouseEvent event)
		    {					
		    	if(dynamicPositionText != null)
		    	{
		    		localAbstractXYAnnotations.remove(dynamicPositionText);
		    		plot.removeAnnotation(dynamicPositionText);		    		
		    	}
		    	
		    	dynamicPositionText = getCursorPositionTextAnnotation(event);
		    			    	
				plot.addAnnotation(dynamicPositionText);		
				localAbstractXYAnnotations.add(dynamicPositionText);
		    }

			@Override
			public void chartMouseClicked(ChartMouseEvent event) 
			{						
		    	if(staticPositionText != null)
		    	{
		    		localAbstractXYAnnotations.remove(staticPositionText);
		    		plot.removeAnnotation(staticPositionText); 
		    	}
		    	
		    	if(staticPositionShape != null)
		    	{
		    		localAbstractXYAnnotations.remove(staticPositionShape);
		    		plot.removeAnnotation(staticPositionShape); 
		    	}
		    			    			    			    	
		    	if(event.getTrigger().getButton() == 1)
		    	{		    	
			    	staticPositionText = getCursorPositionTextAnnotation(event);		    	  
			    	plot.addAnnotation(staticPositionText);		
			    	localAbstractXYAnnotations.add(staticPositionText);
			    	
			    	staticPositionShape = getCursorPositionShapeAnnotation(event);
			    	plot.addAnnotation(staticPositionShape);		
			    	localAbstractXYAnnotations.add(staticPositionShape);							
		    	}
			}
			
			private XYTextAnnotation getCursorPositionTextAnnotation(ChartMouseEvent event)
			{			
				Point2D p = chartComposite.translateScreenToJava2D(event.getTrigger().getPoint());
		    	Rectangle2D plotArea = chartComposite.getChartRenderingInfo().getPlotInfo().getDataArea();			    	
		    	XYPlot plot = (XYPlot) chart.getPlot();
		    	
		    	double x = plot.getDomainAxis().java2DToValue(p.getX(), plotArea, plot.getDomainAxisEdge());
		    	double y = plot.getRangeAxis().java2DToValue(p.getY(), plotArea, plot.getRangeAxisEdge());
		    	
		    	DecimalFormat decimalFormat = new DecimalFormat("0.0");
		    	
		    	XYTextAnnotation textAnnotation = new XYTextAnnotation("(" + decimalFormat.format(x) + " , " + decimalFormat.format(y) + ")   ", x, y);
		    	
		    	textAnnotation.setFont(new Font("SansSerif", Font.BOLD, 11));
		    	textAnnotation.setPaint(getCursorCoordinatesColor());
		    	textAnnotation.setTextAnchor(TextAnchor.HALF_ASCENT_RIGHT);
		    	textAnnotation.setRotationAnchor(TextAnchor.HALF_ASCENT_RIGHT);
		    	textAnnotation.setRotationAngle(Math.toRadians(0));		
		    	
		    	return textAnnotation;
			}
			
			private XYShapeAnnotation getCursorPositionShapeAnnotation(ChartMouseEvent event)
			{			
				Point2D p = chartComposite.translateScreenToJava2D(event.getTrigger().getPoint());
		    	Rectangle2D plotArea = chartComposite.getChartRenderingInfo().getPlotInfo().getDataArea();			    	
		    	XYPlot plot = (XYPlot) chart.getPlot();
		    	
		    	double x = plot.getDomainAxis().java2DToValue(p.getX(), plotArea, plot.getDomainAxisEdge());
		    	double y = plot.getRangeAxis().java2DToValue(p.getY(), plotArea, plot.getRangeAxisEdge());
		    			  	  			    	
		  	  	Ellipse2D e = new Ellipse2D.Double(x - CURSOR_POSITION_RADIUS, y - CURSOR_POSITION_RADIUS, 2 * CURSOR_POSITION_RADIUS, 2 * CURSOR_POSITION_RADIUS);
		  	  	XYShapeAnnotation shapeAnnotation = new XYShapeAnnotation(e, new BasicStroke(3.0f), getCursorCoordinatesColor());
		    	
		    	return shapeAnnotation;
			}
		});
		
		return chartComposite;
	}		
	
	protected Color getCursorCoordinatesColor()
	{
		return Color.BLUE;
	}
	
	protected JFreeChart getChart()
	{						
		if(chart == null)
		{							        	        	       	     	    		    		       
			chart = new JFreeChart(getPlot());			
			//chart.removeLegend();
			chart.setAntiAlias(true);	
		}			
		return chart;
	}
	
	protected XYPlot getPlot()
	{
		if(plot == null)
		{
			plot = new XYPlot(getXYSeriesCollection(), new NumberAxis("X (m)"), new NumberAxis("Y (m)"), new StandardXYItemRenderer());
			
			double tickSize = getTickSize(DEFAULT_TERRAIN_DIMENSION);
			
	        // X Axis
	        plot.getDomainAxis().setLowerBound(-DEFAULT_TERRAIN_DIMENSION/2.0);
	        plot.getDomainAxis().setUpperBound(DEFAULT_TERRAIN_DIMENSION/2.0);
	        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_LEFT);
	        plot.getDomainAxis().setAutoRange(false);	
	        ((NumberAxis)plot.getDomainAxis()).setTickUnit(new NumberTickUnit(tickSize));
	        plot.setDomainGridlinePaint(getGridColor());
	        
	        // Y Axis
	        plot.getRangeAxis().setLowerBound(-DEFAULT_TERRAIN_DIMENSION/2.0);
	        plot.getRangeAxis().setUpperBound(DEFAULT_TERRAIN_DIMENSION/2.0);
	        plot.getRangeAxis().setInverted(false);
	        plot.getRangeAxis().setAutoRange(false);
	        ((NumberAxis)plot.getRangeAxis()).setTickUnit(new NumberTickUnit(tickSize));
	        plot.setRangeGridlinePaint(getGridColor());
	        
	        XYItemRenderer renderer = plot.getRenderer();	        	       
	        DecimalFormat xFormat = new DecimalFormat("0.00");
	        DecimalFormat yFormat = new DecimalFormat("0.00");
	        StandardXYToolTipGenerator ttG = new StandardXYToolTipGenerator("{1},{2}", xFormat, yFormat);
	        renderer.setBaseToolTipGenerator(ttG);	  	        	        
		}
		
		return plot;
	}
	
	protected XYSeriesCollection getXYSeriesCollection() 
	{
		if(xySeriesCollection == null)
		{
			xySeriesCollection = new XYSeriesCollection();														
		}
		return xySeriesCollection;
	}

	protected Color getGridColor()
	{
		return  Color.black;
	}
	
	protected void setBackgroundMapImage(AbstractEImage eImage)
	{			
		mapImage = eImage;
		if(mapImage != null)
		{
			// Scale the image to limit memory usage.
			if(eImage.getWidth() * eImage.getHeight() > getMaximumImageSize())
			{
				double scaleFactor = Math.sqrt( (double) getMaximumImageSize() / (eImage.getWidth() * eImage.getHeight()));
							
				AbstractEImage zoomedImage = EImagesUtilities.INSTANCE.resize(eImage, scaleFactor);	
								
				setBackgroundMapBufferedImage(zoomedImage.asBufferedImage());
			}
			else
			{						
				setBackgroundMapBufferedImage(eImage.asBufferedImage());
			}						
		}
		else
		{			
			setBackgroundMapBufferedImage(null);
		}
							
	}
	
	protected void setBackgroundMapBufferedImage(BufferedImage bufferedImage)
	{
		if(getPlot() != null)
		{				
			if(bufferedImage != null && bufferedImage.getHeight() > 0 && bufferedImage.getWidth() > 0)
			{
				// System.out.println("setBackgroundMapBufferedImage " + bufferedImage.getWidth() + " x " + bufferedImage.getHeight());
				
				getPlot().setBackgroundPaint(Color.WHITE);
				getPlot().setBackgroundImage(null);		
				getPlot().setBackgroundImage(bufferedImage);		
				getPlot().setBackgroundImageAlpha(1.0f);
				getPlot().setBackgroundAlpha(0.0f);
			}
			else
			{				
				getPlot().setBackgroundPaint(Color.WHITE);
				getPlot().setBackgroundAlpha(1.0f);
				getPlot().setBackgroundImageAlpha(0.0f);
			}
		}
		
		if(chartComposite != null)
		{			
			chartComposite.redraw();	
			chartComposite.update();
			chartComposite.forceRedraw();			
		}
	}
	
	protected AbstractEImage getBackgroundMapImage()
	{
		return mapImage;
	}
	
	protected void addMapAnnotation(MapAnnotation mapAnnotation)
	{
		mapAnnotations.add(mapAnnotation);
	}
	
	protected void removeMapAnnotation(MapAnnotation mapAnnotation)
	{
		mapAnnotations.remove(mapAnnotation);
	}
	
	protected void updateAll()
	{
		// Clears all data series.
		getXYSeriesCollection().removeAllSeries();

		// Adds all data series.		
		for(MapAnnotation mapAnnotation : mapAnnotations)
		{
			if(mapAnnotation instanceof TrajectoryProvider)
			{
				if(mapAnnotation.isVisible())
				{
					TrajectoryProvider trajectoryProvider = (TrajectoryProvider) mapAnnotation;
					
					XYSeries xySeries = trajectoryProvider.getXYSeries();
					if(xySeries != null)
					{
						try 
						{
							// Copies xySeries
							XYSeries copy = (XYSeries) xySeries.clone();
							
							// Adds the series.
							getXYSeriesCollection().addSeries(copy);
							
							// Sets the trajectory color.
							Color trajectoryColor = new Color(trajectoryProvider.getTrajectoryColor().x, trajectoryProvider.getTrajectoryColor().y, trajectoryProvider.getTrajectoryColor().z);			
					        XYItemRenderer renderer = getPlot().getRenderer();	        
					        renderer.setSeriesPaint(getXYSeriesCollection().indexOf(copy), trajectoryColor);
						} 
						catch (Throwable t) 
						{					
							t.printStackTrace();
						}							
					}
				}
			}
		}
		
		// Clears all annotations
		getPlot().clearAnnotations();	
		
		// Puts back local annotations
		for(AbstractXYAnnotation annotation : localAbstractXYAnnotations)
		{
			if(annotation != null) plot.addAnnotation(annotation);
		}
		
		// Adds all annotations.
		if(getMapViewConfiguration() != null)
		{
			for(MapAnnotation mapAnnotation : getMapViewConfiguration().getMapAnnotations())
			{
				if(mapAnnotation.isVisible())
				{
					try
					{
						List<AbstractXYAnnotation> annotations = mapAnnotation.getXYShapeAnnotation();
						if(annotations != null)
						{
							for(AbstractXYAnnotation annotation : annotations)
							{
								getPlot().addAnnotation(annotation);
							}
						}
					}
					catch(Throwable t)
					{
						System.out.println("mapAnnotation " + mapAnnotation);
						t.printStackTrace();
					}
				}
			}
		}
	}
	
	protected Adapter getMapViewConfigurationAdapter()
	{
		if(mapViewConfigurationAdapter == null)
		{
			mapViewConfigurationAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getFeatureID(MapViewConfiguration.class) == ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE)
					{
						// Image Map has changed.
						if(msg.getNewValue() instanceof EImage)
						{							
							EImage newEImage = (EImage) msg.getNewValue();
																				
							setBackgroundMapImage(newEImage);
							
							// Checks if resizing is required.
							if(getPlot().getDomainAxis().getLowerBound() != getMapViewConfiguration().getMapImageRectangularRegion().getXMin() ||
							   getPlot().getDomainAxis().getUpperBound() != getMapViewConfiguration().getMapImageRectangularRegion().getXMax() ||
							   getPlot().getRangeAxis().getLowerBound() != getMapViewConfiguration().getMapImageRectangularRegion().getYMin() ||
							   getPlot().getRangeAxis().getUpperBound() != getMapViewConfiguration().getMapImageRectangularRegion().getYMax())
							{						
								resizeBackgroundImage();
							}
						}
						else
						{
							setBackgroundMapImage(null);
						}
					}
					else if(msg.getFeatureID(MapViewConfiguration.class) == ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION)
					{									
						if(msg.getNewValue() instanceof MapViewExtent)
						{
							if(plot != null && chartComposite!= null && !chartComposite.isDisposed() && getMapViewConfiguration() != null)
							{																								
								resizeBackgroundImage();															
							}
						}
					}					
				}
			};
		}
			
		return mapViewConfigurationAdapter;
	}
	
	protected void resizeBackgroundImage()
	{
		RectangularRegion mapExtent = ApogyCoreEnvironmentFactory.eINSTANCE.createRectangularRegion();
		mapExtent.setXMin(getPlot().getDomainAxis().getLowerBound());
		mapExtent.setXMax(getPlot().getDomainAxis().getUpperBound());
		mapExtent.setYMin(getPlot().getRangeAxis().getLowerBound());
		mapExtent.setYMax(getPlot().getRangeAxis().getUpperBound());
		
		if(getBackgroundMapImage() != null && getBackgroundMapImage().asBufferedImage() != null)
		{			
			try
			{		
				// Gets the sub image that falls within the zoom rectangle.
				AbstractEImage zoomedImage = ApogyCoreEnvironmentUIFacade.INSTANCE.getImageMapLayerPresentationImage(getMapViewConfiguration(), mapExtent, (int) getMaximumImageSize());
								
				// Update tick size.				
				double tickSize = getTickSize(mapExtent.getXDimension());				
				((NumberAxis)plot.getDomainAxis()).setTickUnit(new NumberTickUnit(tickSize));
				((NumberAxis)plot.getRangeAxis()).setTickUnit(new NumberTickUnit(tickSize));
				
				// Updates the map background.
				setBackgroundMapBufferedImage(zoomedImage.asBufferedImage());
				
				// Resize composite.
				chartComposite.setSize(getChartCompositeSize());
			}
			catch(Throwable throwable)
			{
				throwable.printStackTrace();
			}
		}
		else
		{
			// Update tick size.				
			double tickSize = getTickSize(mapExtent.getXDimension());			
			((NumberAxis)plot.getDomainAxis()).setTickUnit(new NumberTickUnit(tickSize));
			((NumberAxis)plot.getRangeAxis()).setTickUnit(new NumberTickUnit(tickSize));
		}
	}
	
	  protected ChartMouseListener getChartMouseListener()
	  {
		  if(chartMouseListener == null)
		  {
			  chartMouseListener = new ChartMouseListener() 
			  {		  
				  @Override
				  public void chartMouseMoved(ChartMouseEvent event) 
				  {
					  // Do nothing.
				  }
				
				  @Override
				  public void chartMouseClicked(ChartMouseEvent event) 
				  {
					  if(chartComposite != null && chart != null && isVisible())
					  {
						  try
						  {			    	
						    	Point2D p = chartComposite.translateScreenToJava2D(event.getTrigger().getPoint());
						    	Rectangle2D plotArea = chartComposite.getChartRenderingInfo().getPlotInfo().getDataArea();			    	
						    	XYPlot plot = (XYPlot) chart.getPlot();
						    	double x = plot.getDomainAxis().java2DToValue(p.getX(), plotArea, plot.getDomainAxisEdge());
						    	double y = plot.getRangeAxis().java2DToValue(p.getY(), plotArea, plot.getRangeAxisEdge());
						    	int mouseButton = event.getTrigger().getButton();
						    	
						    	// Call all of the tools.
						    	for(MapAnnotation mapAnnotation : mapAnnotations)
						    	{
						    		if(mapAnnotation instanceof MapTool)
						    		{
						    			MapTool mapTool= (MapTool) mapAnnotation;
						    			
						    			try
						    			{
						    				mapTool.positionSelected(mouseButton, x, y);
						    			}
						    			catch(Throwable t)
						    			{
						    				t.printStackTrace();
						    			}
						    		}
						    	}						    	
						    } 
						    catch (Exception e)
						    {			
						    }	
					  }				  
				  }				  				  					 
			};
		  }
		  
		  return chartMouseListener;
	  }
	
	private UIJob getUIJob()
	{
		if(uiJob == null)
		{
			uiJob = new UIJob("Map Composite Update") 
			{			
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) 
				{
					if(!busy)
					{
						busy = true;
						updateAll();
						busy = false;
					}
					
					if(!monitor.isCanceled()) 
					{
						schedule(getUpdatePeriod());
					}
					
					return Status.OK_STATUS;
				}
			};
		}
		
		return uiJob;
	}
	
	/**
	 * Returns the map update period.
	 * @return The update period, in milliseconds.
	 */
	private long getUpdatePeriod()
	{		
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
					
		return store.getLong(ApogyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_UPDATE_PERIOD_MILLISECONDS_ID);
	}
	
	/**
	 * Returns the maximum image size that should be used to limit memory usage.
	 * @return The maximum image size, in pixels.
	 */
	private int getMaximumImageSize()
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		return store.getInt(ApogyEnvironmentUIPreferencesConstants.DEFAULT_MAP_VIEW_IMAGE_MAXIMUM_NUMBER_OF_PIXELS_ID);
	}
}
