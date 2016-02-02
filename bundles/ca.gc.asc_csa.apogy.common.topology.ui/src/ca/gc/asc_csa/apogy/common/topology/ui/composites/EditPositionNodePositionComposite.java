package ca.gc.asc_csa.apogy.common.topology.ui.composites;
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


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;

public class EditPositionNodePositionComposite extends Composite
{
	private PositionNode positionNode;
	
	private Text xValueText = null;
	private Text yValueText = null;
	private Text zValueText = null;
	
	public EditPositionNodePositionComposite(Composite parent, int style)
	{
		super(parent, style);
	}
	
	public EditPositionNodePositionComposite(Composite parent, int style, PositionNode positionNode)
	{
		super(parent, style);
		
		this.positionNode = positionNode;
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;			
		this.setLayout(gridLayout);		
		
		Label xLabel = new Label(this, SWT.NONE);
		xLabel.setText("X:");
		
		GridData gridDataX = new GridData();
		gridDataX.widthHint = 100;
		gridDataX.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		xValueText = new Text(this, SWT.BORDER);
		xValueText.setLayoutData(gridDataX);
		xValueText.setText(Double.toString(positionNode.getPosition().getX()));
		
		Label yLabel = new Label(this, SWT.NONE);
		yLabel.setText("Y:");
		
		GridData gridDataY = new GridData();
		gridDataY.widthHint = 100;
		gridDataY.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		yValueText = new Text(this, SWT.BORDER);
		yValueText.setLayoutData(gridDataY);
		yValueText.setText(Double.toString(positionNode.getPosition().getY()));
		
		Label zLabel = new Label(this, SWT.NONE);
		zLabel.setText("Z:");
		
		GridData gridDataZ = new GridData();
		gridDataZ.widthHint = 100;
		gridDataZ.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		zValueText = new Text(this, SWT.BORDER);
		zValueText.setLayoutData(gridDataZ);
		zValueText.setText(Double.toString(positionNode.getPosition().getZ()));
		
		this.setSize(new Point(300, 200));			
	}
	
	public Tuple3d getNewValues()
	{		
		Tuple3d tuple = ApogyCommonMathFacade.INSTANCE.createTuple3d(this.positionNode.getPosition().asTuple3d());	
		try
		{
			double x = Double.parseDouble(xValueText.getText());
			double y = Double.parseDouble(yValueText.getText());
			double z = Double.parseDouble(zValueText.getText());
			
			tuple = ApogyCommonMathFacade.INSTANCE.createTuple3d(x,y,z);		
		}
		catch(Exception e)
		{			
		}
		return tuple;
	}
}
