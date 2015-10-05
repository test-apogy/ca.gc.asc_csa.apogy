package org.eclipse.symphony.common.converters.ui.composites;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.graphs.ConverterEdge;
import org.eclipse.symphony.common.converters.graphs.ConverterGraphUtilities;
import org.eclipse.symphony.common.converters.ui.composites.ConvertersUIConstants.ClassNameDisplayMode;
import org.eclipse.wb.swt.TableViewerColumnSorter;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class ConverterGraphComposite extends  Composite 
{	
	private Table table;
	private TableViewer tableViewer;
	private IContentProvider contentProvider;
	private ClassNameDisplayMode classNameDisplayMode = ClassNameDisplayMode.SIMPLE_CLASS_NAME;


	private SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> convertersGraph = null;
	private ITableLabelProvider labelProvider;
	private Label dummyLabel;

	public ConverterGraphComposite(Composite parent, int style, SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> graph)
	{
		this(parent, style);
		setConvertersGraph(graph);
	}
	
	public ConverterGraphComposite(Composite parent, int style) 
	{
		super(parent, style);		
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewer.setUseHashlookup(true);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		new TableViewerColumnSorter(tableViewerColumn) {
			@Override
			protected int doCompare(Viewer viewer, Object e1, Object e2) 
			{
				ITableLabelProvider labelProvider = (ITableLabelProvider) tableViewer.getLabelProvider();
				String s1 = labelProvider.getColumnText(e1,0);
				String s2 = labelProvider.getColumnText(e2,0);
				return s1.compareTo(s2);
			}
			@Override
			protected Object getValue(Object o) {				
				return super.getValue(o);
			}
		};
		TableColumn tblclmnNewColumn_1 = tableViewerColumn.getColumn();
		tblclmnNewColumn_1.setWidth(100);		
		tblclmnNewColumn_1.setText("Input Type");
		
		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
		new TableViewerColumnSorter(tableViewerColumn_1) {
			@Override
			protected int doCompare(Viewer viewer, Object e1, Object e2) {
				ITableLabelProvider labelProvider = (ITableLabelProvider) tableViewer.getLabelProvider();
				String s1 = labelProvider.getColumnText(e1,1);
				String s2 = labelProvider.getColumnText(e2,1);
				return s1.compareTo(s2);
			}
			@Override
			protected Object getValue(Object o) {
				// TODO remove this method, if your EditingSupport returns value
				return super.getValue(o);
			}
		};
		TableColumn tblclmnNewColumn = tableViewerColumn_1.getColumn();
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Output Type");
		
		
		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
		new TableViewerColumnSorter(tableViewerColumn_2) {
			@Override
			protected int doCompare(Viewer viewer, Object e1, Object e2) {
				ITableLabelProvider labelProvider = (ITableLabelProvider) tableViewer.getLabelProvider();
				String s1 = labelProvider.getColumnText(e1,2);
				String s2 = labelProvider.getColumnText(e2,2);
				return s1.compareTo(s2);
			}
			@Override
			protected Object getValue(Object o) {
				// TODO remove this method, if your EditingSupport returns value
				return super.getValue(o);
			}
		};
		TableColumn tblclmnNewColumn_2 = tableViewerColumn_2.getColumn();
		tblclmnNewColumn_2.setMoveable(true);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("Converter");
		
		tableViewer.setContentProvider(getContentProvider());
		tableViewer.setLabelProvider(getTableLabelProvider());
	}

	public ClassNameDisplayMode getClassNameDisplayMode() {
		return classNameDisplayMode;
	}

	public void setClassNameDisplayMode(ClassNameDisplayMode classNameDisplayMode) {
		this.classNameDisplayMode = classNameDisplayMode;
		
		// Force the table viewer to update.
		updateColumnsWidth();				
	}

	public TableViewer getTableViewer() {
		return tableViewer;
	}

	
	public SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> getConvertersGraph() {
		return convertersGraph;
	}

	public void setConvertersGraph(SimpleDirectedWeightedGraph<Class<?>, ConverterEdge> convertersGraph) 
	{
		this.convertersGraph = convertersGraph;
		if(this.convertersGraph != null)
		{						
			getTableViewer().setInput(ConverterGraphUtilities.getAllNonTypeCastConverters(this.convertersGraph));
			updateColumnsWidth();
		}
		else
		{
			getTableViewer().setInput(null);
		}				
	}
	
	private ITableLabelProvider getTableLabelProvider()
	{
		if(labelProvider == null)
		{
			labelProvider = new ITableLabelProvider(){
	
				@Override
				public void addListener(ILabelProviderListener listener) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void dispose() {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public boolean isLabelProperty(Object element, String property) {
					// TODO Auto-generated method stub
					return false;
				}
	
				@Override
				public void removeListener(ILabelProviderListener listener) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public Image getColumnImage(Object element, int columnIndex) {
					// TODO Auto-generated method stub
					return null;
				}
	
				@Override
				public String getColumnText(Object element, int columnIndex) 
				{
					IConverter converter = (IConverter) element;
					
					switch(classNameDisplayMode)
					{
						case FULLY_QUALIFIED_CLASS_NAME :					
							switch(columnIndex)
							{
								case 0 : return converter.getInputType().getName();
								case 1 : return converter.getOutputType().getName();
								case 2 : return converter.getClass().getName();
								default : return "?";
							}	
						case SIMPLE_CLASS_NAME :
							switch(columnIndex)
							{
								case 0 : return converter.getInputType().getSimpleName();
								case 1 : return converter.getOutputType().getSimpleName();
								case 2 : return converter.getClass().getSimpleName();
								default : return "?";
							}	
						default :
							return "?";
					}
				}			
			};	
		}
		return labelProvider;
	}
	
	private void updateColumnsWidth()
	{						
		TableColumn[] columns = getTableViewer().getTable().getColumns();	
		
		for(int i = 0; i < columns.length; i++)
		{
			int columnWidth = getMaximumColumnWidth(i) + 1;			
			
			columns[i].setWidth(columnWidth);			
		}
		
		// Refresh the viewer to show the new column width.
		getTableViewer().refresh();		
	}
	
	@SuppressWarnings("unchecked")
	private int getMaximumColumnWidth(int columnIndex)
	{				
		try
		{
			List<IConverter> converters = (List<IConverter>) getTableViewer().getInput();
			int maximumColumnWidth = 0;
			
			Iterator<IConverter> it = converters.iterator();
			while(it.hasNext())
			{
				IConverter converter = it.next();
				
				// Computes the required width to display the string.
				String columnString = getTableLabelProvider().getColumnText(converter, columnIndex);
				getDummyLabel().setText(" " + columnString + " ");
				Point p = getDummyLabel().computeSize(SWT.DEFAULT, SWT.DEFAULT);
								
				if(p.x > maximumColumnWidth)
				{
					maximumColumnWidth = p.x;
				}
			}
			
			return maximumColumnWidth;
		}
		catch(Exception e)
		{
			return 0;
		}				
	}
	
	private Label getDummyLabel()
	{
		if(dummyLabel == null)
		{
			dummyLabel = new Label(getTableViewer().getTable(), SWT.NONE);
			dummyLabel.setVisible(false);
		}
		
		return dummyLabel;
	}
	
	private IContentProvider getContentProvider() {
		if (contentProvider == null){
			contentProvider = new IStructuredContentProvider() {				
				@Override
				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				}				
				@Override
				public void dispose() {
				}				
				@SuppressWarnings("unchecked")
				@Override
				public Object[] getElements(Object inputElement) 
				{
					List<IConverter> list = (List<IConverter>) inputElement;
					return list.toArray();
				}
			};
		}
		return contentProvider;
	}
}
