package ca.gc.space.topology.ui.composites;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import ca.gc.space.math.ui.composites.Matrix3x3Composite;
import ca.gc.space.math.ui.composites.RotationMatrixComposite;
import ca.gc.space.topology.RotationNode;

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
