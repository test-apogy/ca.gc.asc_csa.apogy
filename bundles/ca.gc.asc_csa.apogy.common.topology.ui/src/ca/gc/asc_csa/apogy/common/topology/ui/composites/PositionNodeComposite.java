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

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import ca.gc.asc_csa.apogy.common.math.ui.composites.Tuple3dComposite;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;

public class PositionNodeComposite extends Composite 
{
	@SuppressWarnings("unused")
	private EditingDomain editingDomain;
	
	private Tuple3dComposite tuple3dComposite;
	
	public PositionNodeComposite(Composite parent, int style, EditingDomain editingDomain) 
	{
		super(parent, style);								
		this.editingDomain = editingDomain;
				
		GridLayout layout = new GridLayout(1, true);
		this.setLayout(layout);
				
		Group positionGroup = new Group(this, SWT.NONE);
		positionGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		positionGroup.setLayout(new FillLayout(SWT.HORIZONTAL));		
		positionGroup.setText("Position (x,y,z)");
		
		tuple3dComposite = new Tuple3dComposite(positionGroup, SWT.NONE, editingDomain);		
	}
	
	public void setPositionNode(PositionNode newPositionNode)
	{
		tuple3dComposite.setTuple3d(newPositionNode.getPosition());
	}
}
