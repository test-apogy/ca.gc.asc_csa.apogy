package ca.gc.asc_csa.apogy.core.ui.dialogs;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.UserDefinedResult;
import ca.gc.asc_csa.apogy.core.invocator.Context;

public class CreateUserDefinedResultDialog extends Dialog 
{	
	protected Context context;
		
	private Matrix4x4 resultPose = ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4();
	
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
					Matrix4d absolutePosition = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(selectedNode);
					resultPose = ApogyCommonMathFacade.INSTANCE.createMatrix4x4(absolutePosition);
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
		userDefinedResult = ApogyCoreFactory.eINSTANCE.createUserDefinedResult();
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

		// FIXME TOPOLOGY.
		if(context.getEnvironment() instanceof ApogyEnvironment)
		{
			ApogyEnvironment apogyEnvironment = (ApogyEnvironment) context.getEnvironment();
			
			
			
			Node rootNode = ApogyCoreFacade.INSTANCE.getApogyTopology().getRootNode();			
			
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
