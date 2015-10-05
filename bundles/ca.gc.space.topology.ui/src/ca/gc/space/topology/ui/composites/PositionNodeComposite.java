package ca.gc.space.topology.ui.composites;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.symphony.common.math.ui.composites.Tuple3dComposite;

import ca.gc.space.topology.PositionNode;

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
