package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;

public class EditOrientationComposite extends Composite
{
	private OrientationSensor orientationSensor;
	
	private Text xValueText = null;
	private Text yValueText = null;
	private Text zValueText = null;
	
	public EditOrientationComposite(Composite parent, int style)
	{
		super(parent, style);
	}
	
	public EditOrientationComposite(Composite parent, int style, OrientationSensor orientationSensor)
	{
		super(parent, style);
		
		this.orientationSensor = orientationSensor;
		
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;			
		this.setLayout(gridLayout);		
		
		Label xLabel = new Label(this, SWT.NONE);
		xLabel.setText("X Rotation (deg):");
		
		GridData gridDataX = new GridData();
		gridDataX.widthHint = 100;
		gridDataX.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		xValueText = new Text(this, SWT.BORDER);
		xValueText.setLayoutData(gridDataX);
		xValueText.setText(Double.toString(Math.toDegrees(orientationSensor.getOrientationCoordinates().getXRotation())));
		
		Label yLabel = new Label(this, SWT.NONE);
		yLabel.setText("Y Rotation (deg):");
		
		GridData gridDataY = new GridData();
		gridDataY.widthHint = 100;
		gridDataY.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		yValueText = new Text(this, SWT.BORDER);
		yValueText.setLayoutData(gridDataY);
		yValueText.setText(Double.toString(Math.toDegrees(orientationSensor.getOrientationCoordinates().getYRotation())));
		
		Label zLabel = new Label(this, SWT.NONE);
		zLabel.setText("Z Rotation (deg):");
		
		GridData gridDataZ = new GridData();
		gridDataZ.widthHint = 100;
		gridDataZ.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		zValueText = new Text(this, SWT.BORDER);
		zValueText.setLayoutData(gridDataZ);
		zValueText.setText(Double.toString(Math.toDegrees(orientationSensor.getOrientationCoordinates().getZRotation())));
		
		this.setSize(new Point(300, 200));			
	}
	
	public CartesianOrientationCoordinates getNewValues()
	{		
		CartesianOrientationCoordinates orientation = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianOrientationCoordinates(orientationSensor.getOrientationCoordinates());
		
		try
		{
			double xRotation = Math.toRadians(Double.parseDouble(xValueText.getText()));
			double yRotation = Math.toRadians(Double.parseDouble(yValueText.getText()));
			double zRotation = Math.toRadians(Double.parseDouble(zValueText.getText()));
			
			orientation = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianOrientationCoordinates(xRotation, yRotation, zRotation);
		}
		catch(Exception e)
		{
			
		}
		
		return orientation;
	}
}
