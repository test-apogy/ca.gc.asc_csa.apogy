package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;

public class EditPositionComposite extends Composite
{
	private PositionSensor positionSensor;
	
	private Text xValueText = null;
	private Text yValueText = null;
	private Text zValueText = null;
	
	public EditPositionComposite(Composite parent, int style)
	{
		super(parent, style);
	}
	
	public EditPositionComposite(Composite parent, int style, PositionSensor positionSensor)
	{
		super(parent, style);
		
		this.positionSensor = positionSensor;
		
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
		xValueText.setText(Double.toString(positionSensor.getPosition().getX()));
		
		Label yLabel = new Label(this, SWT.NONE);
		yLabel.setText("Y:");
		
		GridData gridDataY = new GridData();
		gridDataY.widthHint = 100;
		gridDataY.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		yValueText = new Text(this, SWT.BORDER);
		yValueText.setLayoutData(gridDataY);
		yValueText.setText(Double.toString(positionSensor.getPosition().getY()));
		
		Label zLabel = new Label(this, SWT.NONE);
		zLabel.setText("Z:");
		
		GridData gridDataZ = new GridData();
		gridDataZ.widthHint = 100;
		gridDataZ.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		zValueText = new Text(this, SWT.BORDER);
		zValueText.setLayoutData(gridDataZ);
		zValueText.setText(Double.toString(positionSensor.getPosition().getZ()));
		
		this.setSize(new Point(300, 200));			
	}
	
	public CartesianPositionCoordinates getNewValues()
	{		
		CartesianPositionCoordinates position = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(positionSensor.getPositionCoordinates());	
		try
		{
			double x = Double.parseDouble(xValueText.getText());
			double y = Double.parseDouble(yValueText.getText());
			double z = Double.parseDouble(zValueText.getText());
			
			position = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(x,y,z);		
		}
		catch(Exception e)
		{			
		}
		return position;
	}
}
