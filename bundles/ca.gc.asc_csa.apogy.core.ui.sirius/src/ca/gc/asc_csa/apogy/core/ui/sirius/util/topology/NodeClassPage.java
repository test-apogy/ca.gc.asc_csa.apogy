package org.eclipse.symphony.core.ui.sirius.util.topology;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.sirius.common.tools.api.util.StringMatcher;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;

public class NodeClassPage extends WizardPage
{
	private static final String NODE_INST_CLASS_NAME = "org.eclipse.symphony.common.topology.Node";
	private static final String FILTER_TEXT_MSG_STR = "Filter elements";
	private static final String FILTER_LABEL_STR =
						"Enter prefix or pattern (? = any character, * = any String):";
	
	private Composite pageComposite;
	
	private TreeViewer treeViewer;
	private NodeViewerComparator comparator;
	private NodeViewerFilter filter;
	private List<EClass> nodeClasses;
	private EClass selectedClass;
	
	protected NodeClassPage(String pageName, String title)
	{
		super(pageName, title, null);
		nodeClasses = getAllNodeClasses();
	}

	public EClass getSelectedClass()
	{
		return selectedClass;
	}
	
	@Override
	public void createControl(Composite parent)
	{
		pageComposite = new Composite(parent, SWT.NONE);
		pageComposite.setLayout(new GridLayout());
		pageComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		
		filter = new NodeViewerFilter();
		
		Label filterLabel = new Label(pageComposite, SWT.NONE);
		filterLabel.setText(FILTER_LABEL_STR);
		
		Text filterText = new Text(pageComposite, SWT.BORDER | SWT.SEARCH);
		filterText.setMessage(FILTER_TEXT_MSG_STR);
		filterText.setLayoutData(new GridData(SWT.FILL, SWT.LEFT, true, false));
		filterText.addModifyListener(new ModifyListener()
		{
			@Override
			public void modifyText(ModifyEvent e)
			{
				// Get the Text widget that sent the event
				Text source = (Text) e.widget;
				
				// Update the filter
				filter.updateStr(source.getText(), treeViewer);
			}
		});
		
		treeViewer = new TreeViewer(pageComposite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		treeViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		treeViewer.getTree().setHeaderVisible(true);
		treeViewer.getTree().setLinesVisible(true);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{
			@Override
			public void selectionChanged(SelectionChangedEvent event)
			{
				selectedClass = (EClass) ((IStructuredSelection)event.getSelection()).getFirstElement();
			}
		});
		
		comparator = new NodeViewerComparator();
		treeViewer.setComparator(comparator);
		
		treeViewer.addFilter(filter);
		
		TreeViewerColumn shortNameTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		shortNameTVColumn.getColumn().setText("Short Name");
		shortNameTVColumn.getColumn().setWidth(250);
		shortNameTVColumn.getColumn().addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				treeViewer.getTree().setSortColumn(shortNameTVColumn.getColumn());
				treeViewer.getTree().setSortDirection(comparator.change(true));
				treeViewer.refresh();
			}
		});
		shortNameTVColumn.setLabelProvider(new ColumnLabelProvider()
		{			
			@Override
			public String getText(Object element)
			{
				// Cast down
				EClass klass = (EClass) element;
				
				// Get the EClass' instance type name
				String instCName = klass.getInstanceTypeName();
				
				// Extract the last part of the name
				return instCName.substring(instCName.lastIndexOf('.')+1);
			}
		});
		
		TreeViewerColumn qualifiedNameTVColumn = new TreeViewerColumn(treeViewer, SWT.LEFT);
		qualifiedNameTVColumn.getColumn().setText("Fully Qualified Name");
		qualifiedNameTVColumn.getColumn().setWidth(400);
		qualifiedNameTVColumn.getColumn().addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				treeViewer.getTree().setSortColumn(qualifiedNameTVColumn.getColumn());
				treeViewer.getTree().setSortDirection(comparator.change(false));
				treeViewer.refresh();
			}
		});
		qualifiedNameTVColumn.setLabelProvider(new ColumnLabelProvider()
		{
			@Override
			public String getText(Object element)
			{
				// Cast down
				EClass klass = (EClass) element;
				
				// Get the EClass' (fully qualified) instance type name
				return klass.getInstanceTypeName();
			}
		});
		
		treeViewer.setContentProvider(new ITreeContentProvider()
		{
			private final Object[] EMPTY_ARRAY = {};
			
			@Override
			public void dispose()
			{
				// Do nothing
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
			{
				// Do nothing
			}

			@Override
			@SuppressWarnings("unchecked")
			public Object[] getElements(Object inputElement)
			{
				return ((Collection<EClass>) inputElement).toArray();
			}

			@Override
			public Object[] getChildren(Object parentElement)
			{
				return EMPTY_ARRAY;
			}

			@Override
			public Object getParent(Object element)
			{
				return null;
			}

			@Override
			public boolean hasChildren(Object element)
			{
				return false;
			}
		});
		treeViewer.setInput(nodeClasses);
		
		this.setControl(pageComposite);
	}
	
	private List<EClass> getAllNodeClasses()
	{
		// Extract the Node class' EClass
		EClass nodeEClass = Symphony__CommonEMFFacade.INSTANCE.getEClass(NODE_INST_CLASS_NAME);
		
		// Create an output list
		List<EClass> nodeEClasses = new ArrayList<EClass>(); 
		
		// Add it to the start of the node class list
		nodeEClasses.add(nodeEClass);
		
		// Add all of the subclasses to the node class list
		nodeEClasses.addAll(Symphony__CommonEMFFacade.INSTANCE.getAllSubEClasses(nodeEClass));
		
		// Get a sorted version of that node class list
		SortedSet<EClass> sortedEClasses = Symphony__CommonEMFFacade.INSTANCE.sortAlphabetically(nodeEClasses);
	
		// Return a list version of that ordering
		return new ArrayList<EClass>(sortedEClasses);
	}
	
	private class NodeViewerComparator extends ViewerComparator
	{
		// Whether or not to be sorting on the short class name
		private boolean sortOnShortName = true;
		
		// The direction of the sort
		private int direction = SWT.UP;
		
		// The actual comparison
		@Override
		public int compare(Viewer viewer, Object obj1, Object obj2)
		{
			// Cast down
			EClass eklass1 = (EClass) obj1;
			EClass eklass2 = (EClass) obj2;
			
			// The strings to compare
			String eklassName1 = "";
			String eklassName2 = "";
			
			// If the sorting is on the shortened class name
			if (sortOnShortName == true)
			{
				// Extract just the class name
				eklassName1 = eklass1.getInstanceTypeName().substring(eklass1.getInstanceTypeName().lastIndexOf('.')+1);
				eklassName2 = eklass2.getInstanceTypeName().substring(eklass2.getInstanceTypeName().lastIndexOf('.')+1);
			}
			// Otherwise, sort on the whole class name
			else
			{
				// Take the whole class name
				eklassName1 = eklass1.getInstanceTypeName();
				eklassName2 = eklass2.getInstanceTypeName();
			}
			
			// Determine how the two names compare
			int result = eklassName1.compareTo(eklassName2);
			
			// If the result should be descending
			if (direction == SWT.DOWN)
			{
				// Negate the result
				result = -result;
			}
			
			// Return the result
			return result;
		}
		
		public int change(boolean useShortName)
		{
			// If the column didn't change
			if (sortOnShortName == useShortName)
			{
				// If it was ascending sort order
				if (direction == SWT.UP)
				{
					// Change to descending
					direction = SWT.DOWN;
				}
				// Otherwise, it was descending sort order
				else
				{
					// Change to ascending
					direction = SWT.UP;
				}
			}
			// Otherwise, the column did change
			else
			{
				// Change to the new column sort
				sortOnShortName = useShortName;
				
				// Change to ascending
				direction = SWT.UP;
			}
			
			// Return the sort order
			return direction;
		}
	}

	private class NodeViewerFilter extends ViewerFilter
	{
		// The string to filter with
		private String filterStr = "";
		
		public void updateStr(String newFilter, TreeViewer viewer)
		{
			// Update the filter string
			filterStr = newFilter.trim();
			
			// If the viewer wasn't null
			if (viewer != null)
			{
				// Refresh the viewer
				viewer.refresh();
			}
		}
		
		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element)
		{
			// Cast down to EClass
			EClass klass = (EClass) element;
			
			// Get the fully qualified name of the class
			String klassName = klass.getInstanceTypeName().substring(klass.getInstanceTypeName().lastIndexOf('.') + 1);
			
			// Obtainer a matcher instance to compare the class name to the filter pattern
			StringMatcher matcher = new StringMatcher(filterStr + "*", true, false);
			
			// Return whether or not there's a match
			return matcher.match(klassName);
		}
	}
}