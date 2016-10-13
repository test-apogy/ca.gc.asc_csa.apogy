package ca.gc.asc_csa.apogy.addons.ui.composites;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

import ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.ui.composites.RotationMatrixComposite;
import ca.gc.asc_csa.apogy.common.math.ui.composites.Tuple3dComposite;

public class GeometryPlacementAtFeatureOfInterestToolPoseComposite extends Composite 
{
	private EditingDomain editingDomain;
	private GeometryPlacementAtFeatureOfInterestTool geometryPlacementAtFeatureOfInterestTool;
	
	private RotationMatrixComposite rotationMatrixComposite;
	private Tuple3dComposite translationComposite;
		
	public GeometryPlacementAtFeatureOfInterestToolPoseComposite(Composite parent, int style) 
	{
		this(parent, style, null);					
	}

	public GeometryPlacementAtFeatureOfInterestToolPoseComposite(Composite parent, int style, EditingDomain editingDomain) 
	{
		super(parent, style);
		this.editingDomain = editingDomain;
		
		setLayout(new GridLayout(1, true));
		
		Group grpTranslation = new Group(this, SWT.NONE);
		grpTranslation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpTranslation.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpTranslation.setText("Translation (x,y,z)");		
		translationComposite = new Tuple3dComposite(grpTranslation, SWT.NONE, this.editingDomain, "0.000");
				
		Group grpRotation = new Group(this, SWT.NONE);
		grpRotation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpRotation.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpRotation.setText("Rotation");		
		
		rotationMatrixComposite = new RotationMatrixComposite(this, style, this.editingDomain);
		rotationMatrixComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
	}
	
	public GeometryPlacementAtFeatureOfInterestTool getGeometryPlacementAtFeatureOfInterestTool()
	{
		return this.geometryPlacementAtFeatureOfInterestTool;
	}
	
	public void setGeometryPlacementAtFeatureOfInterestTool(GeometryPlacementAtFeatureOfInterestTool newGeometryPlacementAtFeatureOfInterestTool)
	{
		setGeometryPlacementAtFeatureOfInterestTool(newGeometryPlacementAtFeatureOfInterestTool, true);
	}
	
	public void setGeometryPlacementAtFeatureOfInterestTool(GeometryPlacementAtFeatureOfInterestTool newGeometryPlacementAtFeatureOfInterestTool, boolean update)
	{		
		if(update)
		{	
			this.geometryPlacementAtFeatureOfInterestTool = newGeometryPlacementAtFeatureOfInterestTool;
			
			if(translationComposite != null && !translationComposite.isDisposed() &&
			   rotationMatrixComposite != null && !rotationMatrixComposite.isDisposed())
			{
				if(newGeometryPlacementAtFeatureOfInterestTool != null && newGeometryPlacementAtFeatureOfInterestTool.getTransformNode() != null)
				{
					Matrix3x3 rotation = newGeometryPlacementAtFeatureOfInterestTool.getTransformNode().getRotationMatrix();
					
					translationComposite.setTuple3d(newGeometryPlacementAtFeatureOfInterestTool.getTransformNode().getPosition());
					rotationMatrixComposite.setMatrix3x3(rotation);
				}
				else
				{
					translationComposite.setTuple3d(null);
					rotationMatrixComposite.setMatrix3x3(null);
				}
			}
		}
	}
}
