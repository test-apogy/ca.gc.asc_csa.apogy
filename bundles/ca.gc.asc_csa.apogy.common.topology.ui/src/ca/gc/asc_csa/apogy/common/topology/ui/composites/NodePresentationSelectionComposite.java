package ca.gc.asc_csa.apogy.common.topology.ui.composites;

import java.util.Collection;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

public class NodePresentationSelectionComposite extends Composite 
{
	private NodeSelectionComposite nodeSelectionComposite;
	private Composite contentComposite;
	
	// The root of the topology.	
	private Node selectedNode = null;
	private NodePresentation selectedNodePresentation = null;
	
	public NodePresentationSelectionComposite(Composite parent, int style) 
	{
		super(parent, style);
		setLayout(new GridLayout(2, true));		
		
		nodeSelectionComposite = new NodeSelectionComposite(this, style)
		{
			@Override
			public void nodeSelectedChanged(Node nodeSelected) 
			{
				setSelectedNode(nodeSelected);
			}
			
			@Override
			public void nodesSelectedChanged(Collection<Node> nodesSelected) 
			{
				// TODO
			}
		};
		nodeSelectionComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		
		Label presentationLabel = new Label(this, SWT.NONE);
		presentationLabel.setText("Node Presentation");		
		presentationLabel.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, true, false, 1, 1));
		
		// Composite used to contain the NodePresentation EMFForm.		
		contentComposite = new Composite(this, SWT.NONE);
		contentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));				
		contentComposite.setLayout(new GridLayout(1, true));
		contentComposite.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		contentComposite.setLayout(GridLayoutFactory.fillDefaults().margins(10, 10).create());		
	}

	/**
	 * Method that gets called when a node is selected by the user. This method should be overloaded to get notified of a node selection.
	 * @param nodeSelected The node selected by the user, can be null.
	 */
	public void nodeSelectedChanged(Node nodeSelected)
	{	
	}	
	
	/**
	 * Method that gets called when a node presentation is selected. This method should be overloaded to get notified of a node presentation selection.
	 * @param nodePresentationSelected The node presentation selected, can be null.
	 */
	public void nodePresentationSelectedChanged(NodePresentation nodePresentationSelected)
	{	
	}	
	
	public void setTopologyRoot(Node root)
	{		
		nodeSelectionComposite.setTopologyRoot(root);	
	}
	
	public Node getSelectedNode() 
	{
		return selectedNode;
	}

	public NodePresentation getSelectedNodePresentation() 
	{
		return selectedNodePresentation;
	}

	private void setSelectedNode(Node selectedNode)
	{
		this.selectedNode = selectedNode;
				
		if(selectedNode != null)
		{
			// Attempts to find the associated NodePresentation
			NodePresentation selectedNodePresentation = (NodePresentation) ApogyCommonConvertersFacade.INSTANCE.convert(selectedNode, NodePresentation.class);						
			setNodePresentation(selectedNodePresentation);
		}
		else
		{
			setNodePresentation(null);
		}

		nodeSelectedChanged(selectedNode);
	}
	
	private void setNodePresentation(NodePresentation selectedNodePresentation)
	{
		this.selectedNodePresentation = selectedNodePresentation;
			
		// TODO Remove, temporary fix for bug in ApogyCommonEMFUiEMFFormsFacade.
		if(selectedNodePresentation != null)
		{		
			// Update the EMFForm.
			ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(contentComposite, selectedNodePresentation);
		}
		else
		{
			for (Control control : contentComposite.getChildren()) {
				control.dispose();
			}
			contentComposite.layout();
		}
		
		nodePresentationSelectedChanged(selectedNodePresentation);
		
	}
}
