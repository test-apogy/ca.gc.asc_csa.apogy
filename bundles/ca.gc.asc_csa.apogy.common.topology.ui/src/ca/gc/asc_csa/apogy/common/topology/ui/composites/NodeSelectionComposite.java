package ca.gc.asc_csa.apogy.common.topology.ui.composites;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.apogy.common.topology.AbstractNodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.NodeDescriptionFilter;
import ca.gc.asc_csa.apogy.common.topology.NodeFilterChain;
import ca.gc.asc_csa.apogy.common.topology.NodeIdFilter;
import ca.gc.asc_csa.apogy.common.topology.NodeTypeFilter;

public class NodeSelectionComposite extends Composite 
{	
	private static final int ID_COLUMN_INDEX = 0;
	private static final int DESCRIPTION_COLUMN_INDEX = 1;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
	// The root of the topology.
	protected Node topologyRoot = null;
		
	protected List<Node> filteredNodes = new ArrayList<Node>();
	
	protected Node selectedNode = null;
	
	// The filter class
	protected EClass nodeFilterType = null;
	
	private NodeTypeComboComposite nodeClassFilterCombo;
	private Button btnClearTypeFilter;
	
	private Text nodeIDFilterText;
	private Button btnClearIDFilter;
	
	private Text nodeDescriptionFilterText;
	private Button btnClearDescriptionFilter;
	private Table filteredNodesTable;
	private TableViewer filteredNodesTableViewer;
			
	public NodeSelectionComposite(Composite parent, int style) 
	{
		super(parent, style);	
		setLayout(new org.eclipse.swt.layout.GridLayout(3, false));
		
		// Node Type Filter.
		Label lblTypeFilter = new Label(this, SWT.NONE);
		lblTypeFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTypeFilter.setText("Type Filter");
		nodeClassFilterCombo = new NodeTypeComboComposite(this, SWT.NONE)
		{
			@Override
			public void typeSelected(EClass eClass) 
			{				
				setTypeFilter(eClass);
			}
		};
		nodeClassFilterCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnClearTypeFilter = new Button(this, SWT.NONE);
		btnClearTypeFilter.setText("Clear");
		btnClearTypeFilter.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				nodeClassFilterCombo.clearSelection();
				//setTypeFilter(null);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		
		// Node Id Filter.
		Label lblIdFilter = new Label(this, SWT.NONE);
		lblIdFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdFilter.setText("ID Filter");
		
		nodeIDFilterText = new Text(this, SWT.BORDER);
		nodeIDFilterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		nodeIDFilterText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) 
			{				
				applyFilters();
			}
		});
		
		btnClearIDFilter = new Button(this, SWT.NONE);
		btnClearIDFilter.setText("Clear");
		btnClearIDFilter.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				nodeIDFilterText.setText("");
				applyFilters();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {	
			}
		});
		
		// Node Description Filter.
		Label lblDescriptionFilter = new Label(this, SWT.NONE);
		lblDescriptionFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescriptionFilter.setText("Description Filter");
		
		nodeDescriptionFilterText = new Text(this, SWT.BORDER);
		nodeDescriptionFilterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
	
		nodeDescriptionFilterText.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) 
			{				
				applyFilters();
			}
		});
		
				
		btnClearDescriptionFilter = new Button(this, SWT.NONE);
		btnClearDescriptionFilter.setText("Clear");
		btnClearDescriptionFilter.addSelectionListener(new SelectionListener() 
		{
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{				
				nodeDescriptionFilterText.setText("");
				applyFilters();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {								
			}
		});
		new Label(this, SWT.NONE);
		
		// Filtered table viewer.
		filteredNodesTableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);		
		filteredNodesTable = filteredNodesTableViewer.getTable();
		filteredNodesTable.setHeaderVisible(true);
		filteredNodesTable.setLinesVisible(true);
		filteredNodesTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1));
		
		// First Column : NodeId
		TableColumn tblclmnNodeId = new TableColumn(filteredNodesTable, SWT.NONE);
		tblclmnNodeId.setWidth(200);
		tblclmnNodeId.setText("Id");

		// Second Column : Node Description
		TableColumn tblclmnNodeDescription = new TableColumn(filteredNodesTable, SWT.NONE);
		tblclmnNodeDescription.setWidth(400);
		tblclmnNodeDescription.setText("Description");		
		
		filteredNodesTableViewer.setContentProvider(new ArgumentsContentProvier(adapterFactory));
		filteredNodesTableViewer.setLabelProvider(new ArgumentsLabelProvider(adapterFactory));

		
		new Label(this, SWT.NONE);
	}
	
	public NodeSelectionComposite(Composite parent, int style, Node topologyRoot) 
	{
		this(parent, style);
		setTopologyRoot(topologyRoot);
	}
	
	public void setTopologyRoot(Node root)
	{
		this.topologyRoot = root;
		
		// Clears the selected Node(s)
		this.selectedNode = null;
		
		// Forces the filters to be applied and the displays updated.
		applyFilters();
	}
	
	public void setTypeFilter(EClass eClass)
	{
		this.nodeFilterType = eClass;
		
		// Forces the filters to be applied and the displays updated.
		applyFilters();
	}		

	public Node getSelectedNode()
	{
		return selectedNode;
	}
	
	public void getSelectedNodes()
	{				
	}
	
	public void selectionChanged()
	{	
	}	
	
	public void applyFilters()
	{		
		System.out.println("NodeSelectionComposite.applyFilters()");
		
		// Creates a NodeFilterChain
		NodeFilterChain nodeFilterChain = ApogyCommonTopologyFactory.eINSTANCE.createNodeFilterChain();
		
		if(nodeFilterType != null)
		{
			NodeTypeFilter nodeTypeFilter =  ApogyCommonTopologyFactory.eINSTANCE.createNodeTypeFilter();
			nodeTypeFilter.setClazz(nodeFilterType);
			nodeFilterChain.getFilters().add(nodeTypeFilter);
		}
		
		if(nodeIDFilterText.getText() != null && nodeIDFilterText.getText().length() > 0)
		{
			NodeIdFilter nodeIdFilter = ApogyCommonTopologyFactory.eINSTANCE.createNodeIdFilter();
			nodeIdFilter.setRegex(convertFilterStringToRegex(nodeIDFilterText.getText()));
			nodeFilterChain.getFilters().add(nodeIdFilter);
		}
		
		if(nodeDescriptionFilterText.getText() != null && nodeDescriptionFilterText.getText().length() > 0)
		{
			NodeDescriptionFilter nodeDescriptionFilter = ApogyCommonTopologyFactory.eINSTANCE.createNodeDescriptionFilter();
			nodeDescriptionFilter.setRegex(convertFilterStringToRegex(nodeDescriptionFilterText.getText() ));
			nodeFilterChain.getFilters().add(nodeDescriptionFilter);
		}
		
		// Applies the filters.
		Collection<Node> matches = nodeFilterChain.filter(getUnfilteredNodes());
				
		// Updates the selected Nodes		
		filteredNodes.clear();
		filteredNodes.addAll(matches);
								
		// TODO Updates the displayed nodes.
		filteredNodesTableViewer.setInput(filteredNodes);
	}
	
	protected Set<Node> getUnfilteredNodes()
	{
		Set<Node> nodes = new HashSet<Node>();
		
		if(topologyRoot != null)
		{
			INodeVisitor visitor = new AbstractNodeVisitor() 
			{
				@Override
				public void visit(Node node) 
				{
					nodes.add(node);
				}
			};

			topologyRoot.accept(visitor);
		}
		return nodes;
	}
	
	protected String convertFilterStringToRegex(String filterString)
	{
		String regex = new String(filterString);
		
		if(filterString.indexOf("*") >= 0)
		{
			// Replace all * by .*
			regex = regex.replace("*", ".*");								
		}
		
		// If the filter string does not start with .*, adds a ^
		if(!regex.startsWith(".*"))
		{
			regex = "^" + regex;			
		}
		
		if(!regex.endsWith(".*"))
		{
			regex = regex + ".*";
		}
		
		return regex; 
	}
		
	/**
	 * Content provider for the arguments.
	 * 
	 */
	private class ArgumentsContentProvier extends AdapterFactoryContentProvider {

		public ArgumentsContentProvier(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object object) 
		{
			if(object instanceof Collection)
			{
				return ((Collection<?>) object).toArray();
			}
			return null;
		}

		@Override
		public Object[] getChildren(Object object) 
		{
			return null;
		}

		@Override
		public boolean hasChildren(Object object) 
		{
			return false;
		}
	}

	/**
	 * Label provider for the arguments.
	 * 
	 */
	private class ArgumentsLabelProvider extends AdapterFactoryLabelProvider {

	
		public ArgumentsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) 
			{
				case ID_COLUMN_INDEX:
					if(object instanceof Node)
					{
						str = ((Node) object).getNodeId();
					}				
				break;
				
				case DESCRIPTION_COLUMN_INDEX:
					if(object instanceof Node)
					{
						str = ((Node) object).getDescription();
					}
				break;
			default:
				break;
			}
			return str;
		}
	}
}
