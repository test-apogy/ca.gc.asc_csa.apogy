package ca.gc.asc_csa.apogy.common.math.ui.composites;

import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;

import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.provider.MathEditUtils;

public class RotationMatrixSlidersComposite extends Composite 
{
	enum RotationAxis
	{
		X,
		Y,
		Z
	}

	private EditingDomain editingDomain;
	private Matrix3x3 matrix;	
	private boolean disableEvent = false;
	private Adapter matrixAdapter;
	
	private Slider rxSlider;
	private Slider rySlider;
	private Slider rzSlider;
	
	public RotationMatrixSlidersComposite(Composite parent, int style)
	{
		super(parent, style);
		setLayout(new GridLayout(1, true));
		
		Group grpRotation = new Group(this, SWT.NONE);
		grpRotation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpRotation.setLayout(new GridLayout(2, false));
		grpRotation.setText("Rotation Inputs");		
		
		Label rxLabel = new Label(grpRotation, SWT.NONE);
		rxLabel.setAlignment(SWT.LEFT);
		rxLabel.setText("Rx (deg):");
		
		rxSlider = createSlider(grpRotation, SWT.BORDER | SWT.SINGLE | SWT.HORIZONTAL , RotationAxis.X);
		rxSlider.setToolTipText("Rotation about X in degrees.");
		rxSlider.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		Label ryLabel = new Label(grpRotation, SWT.NONE);
		ryLabel.setAlignment(SWT.LEFT);
		ryLabel.setText("Ry (deg):");
		
		rySlider = createSlider(grpRotation, SWT.BORDER | SWT.SINGLE | SWT.HORIZONTAL, RotationAxis.Y);
		rySlider.setToolTipText("Rotation about Y in degrees.");
		rySlider.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));

		Label rzLabel = new Label(grpRotation, SWT.NONE);
		rzLabel.setAlignment(SWT.LEFT);
		rzLabel.setText("Rz (deg):");
			
		rzSlider = createSlider(grpRotation, SWT.BORDER | SWT.SINGLE | SWT.HORIZONTAL, RotationAxis.Z);
		rzSlider.setToolTipText("Rotation about Z in degrees.");
		rzSlider.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	}
	
	public RotationMatrixSlidersComposite(Composite parent, int style, EditingDomain editingDomain) 
	{
		this(parent, style);
		this.editingDomain = editingDomain;
	}

	public void setMatrix3x3(Matrix3x3 newMatrix3x3)
	{
		setMatrix3x3(newMatrix3x3, true);
	}
	
	public void setMatrix3x3(Matrix3x3 newMatrix3x3, boolean update)
	{
		if(this.matrix != null)
		{
			this.matrix.eAdapters().remove(getMatrixAdapter());
		}
		
		this.matrix = newMatrix3x3;
		
		if(newMatrix3x3 != null)
		{
			newMatrix3x3.eAdapters().add(getMatrixAdapter());
			
			// Update the controls.
			disableEvent = true;
			updateRotations(newMatrix3x3);
			disableEvent = false;								
		}
			
	}		
	
	private Vector3d getRotationVector()
	{
		Vector3d rotation = new  Vector3d();
		rotation.setX((rxSlider.getSelection() - 180));
		rotation.setY((rySlider.getSelection() - 180));
		rotation.setZ((rzSlider.getSelection() - 180));
		
		return rotation;
	}
	
	private void updateXRotation(double xRotation)
	{
		if(matrix != null)
		{
			Vector3d rotationVector = getRotationVector();
			
			rotationVector.setX(Math.toDegrees(xRotation));
			
			Matrix3d matrix3d = GeometricUtils.packXYZ(
					Math.toRadians(rotationVector.getX()),
					Math.toRadians(rotationVector.getY()),
					Math.toRadians(rotationVector.getZ()));
													
			MathEditUtils.updateOrientation(matrix, ApogyCommonMathFacade.INSTANCE.createMatrix3x3(matrix3d), editingDomain);
			
		}
	}
	
	private void updateYRotation(double yRotation)
	{
		if(matrix != null)
		{
			Vector3d rotationVector = getRotationVector();
			rotationVector.setY(Math.toDegrees(yRotation));
			
			Matrix3d matrix3d = GeometricUtils.packXYZ(
					Math.toRadians(rotationVector.getX()),
					Math.toRadians(rotationVector.getY()),
					Math.toRadians(rotationVector.getZ()));
													
			MathEditUtils.updateOrientation(matrix, ApogyCommonMathFacade.INSTANCE.createMatrix3x3(matrix3d), editingDomain);
			
		}
	}
	
	private void updateZRotation(double zRotation)
	{
		if(matrix != null)
		{
			Vector3d rotationVector = getRotationVector();
			rotationVector.setZ(Math.toDegrees(zRotation));
			
			Matrix3d matrix3d = GeometricUtils.packXYZ(
					Math.toRadians(rotationVector.getX()),
					Math.toRadians(rotationVector.getY()),
					Math.toRadians(rotationVector.getZ()));
													
			MathEditUtils.updateOrientation(matrix, ApogyCommonMathFacade.INSTANCE.createMatrix3x3(matrix3d), editingDomain);			
		}
	}
	
	protected Slider createSlider(Composite parent, int style, RotationAxis rotationAxis)
	{
		Slider slider = new Slider(parent, style);
		
		slider.setMinimum(0);
		slider.setPageIncrement(1);
		slider.setMaximum(360);
		slider.setSelection(180);		
		
		if(rotationAxis == RotationAxis.X)
		{
			slider.addSelectionListener(new SelectionListener() 
			{				
				@Override
				public void widgetSelected(SelectionEvent e) 
				{
					disableEvent = true;
					double newValue = Math.toRadians(slider.getSelection() - 180);
					updateXRotation(newValue);
					disableEvent = false;
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) 
				{				
				}
			});
		}
		else if(rotationAxis == RotationAxis.Y)
		{
			slider.addSelectionListener(new SelectionListener() 
			{				
				@Override
				public void widgetSelected(SelectionEvent e) 
				{				
					disableEvent = true;
					double newValue = Math.toRadians(slider.getSelection() - 180);
					updateYRotation(newValue);
					disableEvent = false;
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) 
				{
				}
			});
		}
		else
		{
			slider.addSelectionListener(new SelectionListener() 
			{				
				@Override
				public void widgetSelected(SelectionEvent e) 
				{
					disableEvent = true;
					double newValue = Math.toRadians(slider.getSelection() - 180);
					updateZRotation(newValue);
					disableEvent = false;
				}
				
				@Override
				public void widgetDefaultSelected(SelectionEvent e) 
				{
					// TODO Auto-generated method stub
					
				}
			});
		}
		
		return slider;
	}
	
	private void updateRotations(Matrix3x3 matrix)
	{
		if(matrix != null)
		{
			if(rxSlider != null && !rxSlider.isDisposed() &&
			   rySlider != null && !rySlider.isDisposed() &&
			   rzSlider != null && !rzSlider.isDisposed())
			{
				Vector3d rotationVector = GeometricUtils.extractRotationFromXYZRotMatrix(matrix.asMatrix3d());
												
				int xRot = (int) Math.floor(Math.toDegrees(GeometricUtils.normalizeAngle(rotationVector.getX()))) + 180;
				int yRot = (int) Math.floor(Math.toDegrees(GeometricUtils.normalizeAngle(rotationVector.getY()))) + 180;
				int zRot = (int) Math.floor(Math.toDegrees(GeometricUtils.normalizeAngle(rotationVector.getZ()))) + 180;
				
				rxSlider.setSelection(xRot);
				rySlider.setSelection(yRot);
				rzSlider.setSelection(zRot);
			}
		}
	}	
	
	private Adapter getMatrixAdapter() 
	{
		if (matrixAdapter == null)
		{
			matrixAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if (!disableEvent)
					{
						updateRotations((Matrix3x3) msg.getNotifier());						
					}
				};
			};
		}
		return matrixAdapter;
	}
}
