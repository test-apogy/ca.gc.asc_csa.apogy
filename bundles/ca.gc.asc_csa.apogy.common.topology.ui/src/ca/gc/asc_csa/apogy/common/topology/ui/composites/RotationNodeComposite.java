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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import ca.gc.asc_csa.apogy.common.math.ui.composites.Matrix3x3Composite;
import ca.gc.asc_csa.apogy.common.math.ui.composites.RotationMatrixComposite;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;

public class RotationNodeComposite extends Composite 
{
	@SuppressWarnings("unused")
	private EditingDomain editingDomain;
	
	private RotationMatrixComposite rotationMatrixComposite;
	private Matrix3x3Composite matrix3x3Composite;
		
	public RotationNodeComposite(Composite parent, int style, EditingDomain editingDomain) 
	{
		super(parent, style);								
		this.editingDomain = editingDomain;
				
		GridLayout layout = new GridLayout(1, true);
		this.setLayout(layout);
		
		Group rotationGroup = new Group(this, SWT.NONE);
		rotationGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		rotationGroup.setLayout(new GridLayout(1, true));	
		rotationGroup.setText("Rotation");
		
		rotationMatrixComposite = new RotationMatrixComposite(rotationGroup, SWT.NONE, editingDomain);
		rotationMatrixComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Group rotationMatrixGroup = new Group(rotationGroup, SWT.NONE);
		rotationMatrixGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		rotationMatrixGroup.setLayout(new GridLayout(1, true));	
		rotationMatrixGroup.setText("Rotation Matrix");
		matrix3x3Composite = new Matrix3x3Composite(rotationMatrixGroup, SWT.NONE, editingDomain);
	}
	
	public void setRotationNode(RotationNode newRotationNode)
	{
		rotationMatrixComposite.setMatrix3x3(newRotationNode.getRotationMatrix());
		matrix3x3Composite.setMatrix3x3(newRotationNode.getRotationMatrix());		
	}
}
