package org.eclipse.symphony.core.environment.orbit.earth.ui.composites;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass;
import org.eclipse.ui.progress.UIJob;

public class SpacecraftsVisibilitySetComposite extends Composite 
{
	public static final String DEGREE_STRING = 	"\u00b0";
	public static final String UPWARDS_ARROW_STRING = 	"\u2191";
	public static final String DOWNWARDS_ARROW_STRING =  "\u2193";
	
	private SpacecraftVisibilitySetViewerComparator viewerComparator;
	
	public enum  SpacecraftsVisibilitySetColumns
	{
		GROUND_STATION("Ground Station", 0, 250),
		SPACECRAFT("Spacecraft", 1, 100),
		START_DATE("Start Date", 2, 250),
		END_DATE("End Date", 3, 250),
		DURATION("Duration", 4, 100);
		
		private final String name;
		private final int columnIndex;
		private final int columnWidth;
		SpacecraftsVisibilitySetColumns(String name,int columnIndex, int columnWidth)
		{
			this.name = name;
			this.columnIndex = columnIndex;
			this.columnWidth = columnWidth;
		}
		
		public String getName()
		{
			return name;
		}

		public int getColumnIndex() 
		{
			return columnIndex;
		}

		public int getColumnWidth() 
		{
			return columnWidth;
		}				
	}

	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
	private Adapter spacecraftsVisibilitySetAdapter = null;
	private SpacecraftsVisibilitySet spacecraftsVisibilitySet;
	
	private TableViewer viewer;
	
	public SpacecraftsVisibilitySetComposite(Composite parent, int style) 
	{
		super(parent, style);		
		setLayout(new FillLayout());
		
		viewer = createTableViewer(this);		
		
		viewerComparator = new SpacecraftVisibilitySetViewerComparator();
		viewer.setComparator(viewerComparator);
	}

	public SpacecraftsVisibilitySet getSpacecraftsVisibilitySet() 
	{
		return spacecraftsVisibilitySet;
	}

	public void setSpacecraftsVisibilitySet(SpacecraftsVisibilitySet newSpacecraftsVisibilitySet) 
	{
		if(spacecraftsVisibilitySet != null) spacecraftsVisibilitySet.eAdapters().remove(getSpacecraftsVisibilitySetAdapter());
		
		System.out.println("SpacecraftsVisibilitySetComposite.setSpacecraftsVisibilitySet(" + newSpacecraftsVisibilitySet + ")");
		
		this.spacecraftsVisibilitySet = newSpacecraftsVisibilitySet;
		
		if(newSpacecraftsVisibilitySet != null)
		{
			ViewerElement[] elements = getEntries(spacecraftsVisibilitySet); 		
			viewer.setInput(elements);
			
			newSpacecraftsVisibilitySet.eAdapters().add(getSpacecraftsVisibilitySetAdapter());
		}
	}	
	
	protected ViewerElement[] getEntries(SpacecraftsVisibilitySet spacecraftsVisibilitySet)
	{
		List<ViewerElement> elements = new ArrayList<ViewerElement>();
		for(GroundStation groundStation : spacecraftsVisibilitySet.getGroundStationToVisibilityMap().keySet())
		{
			List<VisibilityPass> passes = spacecraftsVisibilitySet.getGroundStationToVisibilityMap().get(groundStation);
			for(VisibilityPass pass :  passes)
			{
				ViewerElement element = new ViewerElement(groundStation,pass);
				elements.add(element);
			}
		}
		
		return elements.toArray(new ViewerElement[elements.size()]);		
	}
	
	protected TableViewer createTableViewer(Composite parent)
	{
		TableViewer viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		createColumns(parent, viewer);
		
		final Table table = viewer.getTable();
	    table.setHeaderVisible(true);
	    table.setLinesVisible(true);
		
	    viewer.setContentProvider(new ArrayContentProvider()); 	   
	    
		return viewer;
	}
	
	protected void createColumns(final Composite parent, final TableViewer viewer)
	{
//		 String[] titles = { "Station", "Spacecraft", "Start Date", "End Date", "Duration (s)" };
//		 int[] bounds = {250, 100, 250, 250, 100};
		 
		 // First column is the Location (GroundStation)
		 TableViewerColumn colStation = createTableViewerColumn(viewer, SpacecraftsVisibilitySetColumns.GROUND_STATION);
		 colStation.setLabelProvider(new ColumnLabelProvider() 
		 {					 
			 @Override
			 public String getText(Object element) 
			 {
				 if(element instanceof ViewerElement)
				 {
					 String text = "";
					 
					 ViewerElement viewerElement = (ViewerElement) element;					 
					 GroundStation groundStation = viewerElement.groundStation;
					 
					 
					 if(groundStation.getName() != null)
					 {
						 text += groundStation.getName();
					 }
					 
					 if(groundStation.getGeographicalCoordinates() != null)
					 {
						 DecimalFormat decimalFormat = new DecimalFormat("0.00");
						 text += " (lat " + decimalFormat.format(Math.toDegrees(groundStation.getGeographicalCoordinates().getLatitude())) + DEGREE_STRING;
						 text += ", lon " + decimalFormat.format(Math.toDegrees(groundStation.getGeographicalCoordinates().getLongitude())) + DEGREE_STRING;
						 text += ")";
					 }
					 
					 return text;
				 }
				 return super.getText(element);
			 }
		 });
		
		 // Second column, start date of the pass.
		 TableViewerColumn colSpacecraft= createTableViewerColumn(viewer, SpacecraftsVisibilitySetColumns.SPACECRAFT);
		 colSpacecraft.setLabelProvider(new ColumnLabelProvider() 
		 {					 
			 @Override
			 public String getText(Object element) 
			 {
				 if(element instanceof ViewerElement)
				 {
					 ViewerElement viewerElement = (ViewerElement) element;		
					 VisibilityPass pass = viewerElement.pass;
					 
					 if(pass.getOrbitModel() != null)
					 {
						 return pass.getOrbitModel().getName();
					 }					 
				 }
				 return super.getText(element);
			 }
		 });
		 
		 
		 // Second column, start date of the pass.
		 TableViewerColumn colStartDate= createTableViewerColumn(viewer, SpacecraftsVisibilitySetColumns.START_DATE);
		 colStartDate.setLabelProvider(new ColumnLabelProvider() 
		 {					 
			 @Override
			 public String getText(Object element) 
			 {
				 if(element instanceof ViewerElement)
				 {
					 ViewerElement viewerElement = (ViewerElement) element;		
					 VisibilityPass pass = viewerElement.pass;					 				
					 return dateFormat.format(pass.getStartTime());
				 }
				 return super.getText(element);
			 }
		 });
		 
		 // Third column, end date of the pass.
		 TableViewerColumn colEndDate= createTableViewerColumn(viewer, SpacecraftsVisibilitySetColumns.END_DATE);
		 colEndDate.setLabelProvider(new ColumnLabelProvider() 
		 {					 
			 @Override
			 public String getText(Object element) 
			 {
				 if(element instanceof ViewerElement)
				 {
					 ViewerElement viewerElement = (ViewerElement) element;		
					 VisibilityPass pass = viewerElement.pass;					 
					 return dateFormat.format(pass.getEndTime());
				 }
				 return super.getText(element);
			 }
		 });
		 
		 // Fourth column, duration of the pass.
		 TableViewerColumn colDuration = createTableViewerColumn(viewer, SpacecraftsVisibilitySetColumns.DURATION);
		 colDuration.setLabelProvider(new ColumnLabelProvider() 
		 {					 
			 @Override
			 public String getText(Object element) 
			 {
				 if(element instanceof ViewerElement)
				 {
					 ViewerElement viewerElement = (ViewerElement) element;		
					 VisibilityPass pass = viewerElement.pass;
					 
					 DecimalFormat decimalFormat = new DecimalFormat("0.0");
					 
					 return decimalFormat.format(pass.getDuration());
				 }
				 return super.getText(element);
			 }
		 });		 		 		
	}
	
	private TableViewerColumn createTableViewerColumn(final TableViewer viewer,final SpacecraftsVisibilitySetColumns col) 
	{
	    final TableViewerColumn viewerColumn = new TableViewerColumn(viewer,SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(col.getName() + UPWARDS_ARROW_STRING);		
		column.setWidth(col.columnWidth);
		column.setResizable(true);
		column.setMoveable(true);
		column.addSelectionListener(getSelectionAdapter(column, col));
		return viewerColumn;
	}

	public Adapter getSpacecraftsVisibilitySetAdapter() 
	{
		if(spacecraftsVisibilitySetAdapter == null)
		{
			spacecraftsVisibilitySetAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof SpacecraftsVisibilitySet)
					{
						int featureId = msg.getFeatureID(SpacecraftsVisibilitySet.class);
						switch (featureId) 
						{
							case SymphonyEarthOrbitEnvironmentPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP:
								
								if(msg.getNewValue() != null)
								{
									UIJob uiJob = new UIJob("SpacecraftsVisibilitySetComposite update") 
									{										
										@Override
										public IStatus runInUIThread(IProgressMonitor monitor) 
										{
											ViewerElement[] elements = getEntries(spacecraftsVisibilitySet); 								
											viewer.setInput(elements);
											return Status.OK_STATUS;
										}
									};
									uiJob.schedule();
								}							
							break;

							default:
							break;
						}
					}
				}
			};
		}
		return spacecraftsVisibilitySetAdapter;
	}
	
	private SelectionAdapter getSelectionAdapter(final TableColumn column, final SpacecraftsVisibilitySetColumns col) 
	{
		SelectionAdapter selectionAdapter = new SelectionAdapter() 
		{
		      @Override
		      public void widgetSelected(SelectionEvent e) 
		      {		    	 		    	
		    	  viewerComparator.setColumn(col);
		    	  int dir = viewerComparator.getDirection();
		    	  viewer.getTable().setSortDirection(dir);
		    	  viewer.getTable().setSortColumn(column);
		    	  
		    	  if(e.widget instanceof TableColumn)
		    	  {
		    		  TableColumn tableColumn = (TableColumn) e.widget;
		    		  if(dir == SpacecraftVisibilitySetViewerComparator.DESCENDING)
		    		  {
		    			  tableColumn.setText(col.getName() + DOWNWARDS_ARROW_STRING);
		    		  }
		    		  else
		    		  {
		    			  tableColumn.setText(col.getName() + UPWARDS_ARROW_STRING);
		    		  }		    		  
		    	  }		    	  
		    	  
		    	  viewer.refresh();
		      }
		};
	    return selectionAdapter;
	}
}
