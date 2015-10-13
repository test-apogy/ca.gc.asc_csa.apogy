package org.eclipse.symphony.core.ui.dialogs;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.vecmath.Matrix4d;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.core.SymphonyCoreFactory;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.UserDefinedResult;
import org.eclipse.symphony.core.invocator.Context;

public class CreateUserDefinedResultDialog extends Dialog 
{	
	protected Context context;
		
	private Matrix4x4 resultPose = MathFacade.INSTANCE.createIdentityMatrix4x4();
	
	private UserDefinedResult userDefinedResult = null;
		
	private Text nameText;
	private Text descriptionText;
	private Combo nodesCombo;
	
	private HashMap<Integer, Node> indexToNodeMap = new HashMap<Integer, Node>();
		
	public CreateUserDefinedResultDialog(Shell parentShell) 
	{
		super(parentShell);
	}
	
	public CreateUserDefinedResultDialog(Shell parentShell, Context context)
	{
		this(parentShell);	
		this.context = context;
	}
			
	@Override
	protected void configureShell(Shell newShell) 
	{	
		super.configureShell(newShell);
		newShell.setText("Create User Defined Result");
	}
	
	@Override
	protected Control createDialogArea(Composite parent) 
	{	
		Composite area = (Composite) super.createDialogArea(parent);
		
	    Composite container = new Composite(area, SWT.NONE);	    
	    container.setLayoutData(new GridData(GridData.FILL_BOTH));
	    GridLayout layout = new GridLayout(2, false);
	    container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	    container.setLayout(layout);
	    
	    Label nameLabel = new Label(container, SWT.NONE);
	    nameLabel.setText("Name:");	    
	    nameText = new Text(container, SWT.BORDER);	  
	    GridData nameTextGridData = new GridData(SWT.FILL, SWT.CENTER, true, false);
	    nameText.setLayoutData(nameTextGridData);
	    
	    Label descriptionLabel = new Label(container, SWT.NONE);
	    descriptionLabel.setText("Description:");	
	    descriptionText = new Text(container, SWT.BORDER | SWT.MULTI);
	    GridData descriptionTextGridData = new GridData(SWT.FILL, SWT.FILL, true, false);
	    descriptionTextGridData.heightHint = 200;
	    descriptionTextGridData.minimumHeight = 200;
	    descriptionTextGridData.widthHint = 400;
	    descriptionTextGridData.minimumWidth = 400;
	    descriptionText.setLayoutData(descriptionTextGridData);
	    		    
	    Label nodeLabel = new Label(container, SWT.NONE);
	    nodeLabel.setText("Node defining position:");
	    
	    nodesCombo = createMapSelectionCombo(container, context);
	    GridData nodesComboGridData = new GridData(SWT.FILL, SWT.FILL, true, false);	    
	    nodesComboGridData.widthHint = 100;
	    nodesComboGridData.minimumWidth = 100;
	    nodesCombo.setLayoutData(nodesComboGridData);
	    
	    nodesCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				Node selectedNode = indexToNodeMap.get(nodesCombo.getSelectionIndex());
				if(selectedNode != null)
				{
					Matrix4d absolutePosition = TopologyFacade.INSTANCE.expressNodeInRootFrame(selectedNode);
					resultPose = MathFacade.INSTANCE.createMatrix4x4(absolutePosition);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {				
				
			}
		});
	    	    	    
	    return area;
	}
	
	public UserDefinedResult getUserDefinedResult()
	{
		return userDefinedResult;
	}
	
	public String getResultName()
	{
		return nameText.getText();
	}
	
	public String getResultDescription()
	{
		return descriptionText.getText();
	}
	
	public Matrix4x4 getResultPose()
	{
		return resultPose;
	}
	
	public Context getContext() {
		return context;
	}

	@Override
	protected void okPressed() 
	{
		userDefinedResult = SymphonyCoreFactory.eINSTANCE.createUserDefinedResult();
		userDefinedResult.setName(getResultName());
		userDefinedResult.setDescription(getResultDescription());
		userDefinedResult.setPose(getResultPose());		
		userDefinedResult.setContext(getContext());
		
		userDefinedResult.setTime(new Date());
		
		super.okPressed();
	}
	
	protected Combo createMapSelectionCombo(Composite parent, Context context)
	{
		final Combo combo = new Combo(parent, SWT.NONE);
		
		if(context.getEnvironment() instanceof SymphonyEnvironment)
		{
			SymphonyEnvironment symphonyEnvironment = (SymphonyEnvironment) context.getEnvironment();
			
			Node rootNode = symphonyEnvironment.getSymphonyTopology().getRootNode();			
			
			List<Node> nodes = getAllNodes(rootNode);
			
			String[] items = new String[nodes.size()];
			int i = 0;
			for(Node node : nodes)
			{
				String name = node.getNodeId();
				if(name == null)
				{
					name = node.getDescription();
				}
				
				if(name == null)
				{
					name = Integer.toString(i);
				}
				
				items[i] = name;
				indexToNodeMap.put(i, node);
				
				i++;
			}
			combo.setItems(items);
		}
				
		return combo;
	}
	
	protected List<Node> getAllNodes(Node root)
	{	
		List<Node> nodes = new ArrayList<Node>();
		
		nodes.add(root); 
		
		if (root instanceof GroupNode) 
		{
			GroupNode groupNode = (GroupNode) root;

			for (Node node : groupNode.getChildren()) 
			{
				nodes.addAll(getAllNodes(node));
			}
		}	
		
		return nodes;
	}
}
