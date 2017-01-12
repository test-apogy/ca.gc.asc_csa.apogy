package ca.gc.asc_csa.apogy.common.topology.ui.composites;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
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
	// The root of the topology.
	protected Node topologyRoot = null;
	
	// The filter class
	protected EClass nodeFilterType = null;
	
	// The Node ID filter
	protected String nodeIDFilterString = null;
	
	// The Node Description filter
	protected String nodeDescriptionFilterString = null;
	
	private Combo nodeClassFilterCombo;
	private Button btnClearTypeFilter;
	
	private Text nodeIDFilterText;
	private Button btnClearIDFilter;
	
	private Text nodeDescriptionFilterText;
	private Button btnClearDescriptionFilter;
			
	public NodeSelectionComposite(Composite parent, int style) 
	{
		super(parent, style);	
		setLayout(new org.eclipse.swt.layout.GridLayout(3, false));
		
		Label lblTypeFilter = new Label(this, SWT.NONE);
		lblTypeFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblTypeFilter.setText("Type Filter");
		nodeClassFilterCombo = new Combo(this, SWT.NONE);
		nodeClassFilterCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnClearTypeFilter = new Button(this, SWT.NONE);
		btnClearTypeFilter.setText("Clear");
		
		Label lblIdFilter = new Label(this, SWT.NONE);
		lblIdFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblIdFilter.setText("ID Filter");
		
		nodeIDFilterText = new Text(this, SWT.BORDER);
		nodeIDFilterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnClearIDFilter = new Button(this, SWT.NONE);
		btnClearIDFilter.setText("Clear");
		
		Label lblDescriptionFilter = new Label(this, SWT.NONE);
		lblDescriptionFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDescriptionFilter.setText("Description Filter");
		
		nodeDescriptionFilterText = new Text(this, SWT.BORDER);
		nodeDescriptionFilterText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		btnClearDescriptionFilter = new Button(this, SWT.NONE);
		btnClearDescriptionFilter.setText("Clear");				
	}
	
	public void setTypeFilter(EClass eClass)
	{
		this.nodeFilterType = eClass;
	}		
	
	public void setNodeIDFilterString(String nodeIDFilterString) 
	{
		this.nodeIDFilterString = nodeIDFilterString;
	}

	public void setNodeIDFilterText(Text nodeIDFilterText) 
	{
		this.nodeIDFilterText = nodeIDFilterText;
	}

	public Node getSelectedNode()
	{
		return null;
	}
	
	public void getSelectedNodes()
	{		
	}
	
	public void selectionChanged()
	{	
	}	
	
	public void applyFilters()
	{
		// TODO Clears the displayed nodes.
		
		// Creates a NodeFilterChain
		NodeFilterChain nodeFilterChain = ApogyCommonTopologyFactory.eINSTANCE.createNodeFilterChain();
		
		if(nodeFilterType != null)
		{
			NodeTypeFilter nodeTypeFilter =  ApogyCommonTopologyFactory.eINSTANCE.createNodeTypeFilter();
			nodeTypeFilter.setClazz(nodeFilterType);
			nodeFilterChain.getFilters().add(nodeTypeFilter);
		}
		
		if(nodeIDFilterString != null && nodeIDFilterString.length() > 0)
		{
			NodeIdFilter nodeIdFilter = ApogyCommonTopologyFactory.eINSTANCE.createNodeIdFilter();
			nodeIdFilter.setRegex(convertFilterStringToRegex(nodeIDFilterString));
			nodeFilterChain.getFilters().add(nodeIdFilter);
		}
		
		if(nodeDescriptionFilterString != null && nodeDescriptionFilterString.length() > 0)
		{
			NodeDescriptionFilter nodeDescriptionFilter = ApogyCommonTopologyFactory.eINSTANCE.createNodeDescriptionFilter();
			nodeDescriptionFilter.setRegex(convertFilterStringToRegex(nodeDescriptionFilterString));
			nodeFilterChain.getFilters().add(nodeDescriptionFilter);
		}
		
		// Applies the filters.
		Collection<Node> results = nodeFilterChain.filter(getUnfilteredNodes());
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
}
