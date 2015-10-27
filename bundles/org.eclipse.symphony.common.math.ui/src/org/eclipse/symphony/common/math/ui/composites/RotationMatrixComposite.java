package org.eclipse.symphony.common.math.ui.composites;

import javax.vecmath.Matrix3d;
import javax.vecmath.Vector3d;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.Symphony__CommonMathFacade;
import org.eclipse.symphony.common.math.Symphony__CommonMathFactory;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.math.provider.MathEditUtils;

public class RotationMatrixComposite extends Composite {

	private Matrix3x3 matrix;
	private Tuple3dComposite rotationComposite;	 
	private Tuple3d orientationTuple3d;
	private Adapter matrixAdapter;
	private boolean disableEvent = false;
	
	private Adapter orientationTuple3dAdapter;
	private EditingDomain editingDomain;
	
	public RotationMatrixComposite(Composite parent, int style, EditingDomain editingDomain) {
		this(parent, style);
		this.editingDomain = editingDomain;
	}	
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public RotationMatrixComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		
		Group grpRotation = new Group(this, SWT.NONE);
		grpRotation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpRotation.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpRotation.setText("Rotation (rx,ry,rz)");		
		rotationComposite = new Tuple3dComposite(grpRotation, SWT.NONE);		
	}

	public void setMatrix3x3(Matrix3x3 matrix) 
	{
		getOrientationTuple3d().eAdapters().remove(getOrientationTuple3dAdapter());

		if (getMatrix() != null){
			getMatrix().eAdapters().remove(getMatrixAdapter());
		}
		
		this.matrix = matrix;
		
		if (getMatrix() != null)
		{			
			rotationComposite.setTuple3d(getOrientationTuple3d());
			
			updateOrientationTuples(getMatrix(), getOrientationTuple3d());
			
			getMatrix().eAdapters().add(getMatrixAdapter());			
			getOrientationTuple3d().eAdapters().add(getOrientationTuple3dAdapter());
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
						updateOrientationTuples(getMatrix(), getOrientationTuple3d());						
					}
				};
			};
		}
		return matrixAdapter;
	}

	public Matrix3x3 getMatrix() {
		return matrix;
	}
	
	private void updateOrientationTuples(Matrix3x3 matrix, Tuple3d orientation){
		
		disableEvent = true;
					
		Vector3d rotationVector = GeometricUtils.extractRotationFromXYZRotMatrix(matrix.asMatrix3d());
		orientation.setX(Math.toDegrees(rotationVector.x));
		orientation.setY(Math.toDegrees(rotationVector.y));
		orientation.setZ(Math.toDegrees(rotationVector.z));
		
		disableEvent = false;
	}
	
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	private Tuple3d getOrientationTuple3d() {
		if (orientationTuple3d == null){
			orientationTuple3d = Symphony__CommonMathFactory.eINSTANCE.createTuple3d();
		}
		return orientationTuple3d;
	}
	
	
	private Adapter getOrientationTuple3dAdapter() {
		if (orientationTuple3dAdapter == null)
		{
			orientationTuple3dAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					super.notifyChanged(msg);					
					if (!disableEvent){
							
						/** Disable Matrix Events. */
						disableEvent = true;
	
						if (msg.getEventType() == Notification.SET)
						{
							
							Matrix3d matrix3d = GeometricUtils.packXYZ(
									Math.toRadians(getOrientationTuple3d().getX()),
									Math.toRadians(getOrientationTuple3d().getY()),
									Math.toRadians(getOrientationTuple3d().getZ()));
																	
							MathEditUtils.updateOrientation(getMatrix(), Symphony__CommonMathFacade.INSTANCE.createMatrix3x3(matrix3d), editingDomain);								
						}
						
						/** Re-enable Matrix Events. */
						disableEvent = false;				
					}
				}
			}; 
		}
		return orientationTuple3dAdapter;
	}	
		
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		return bindingContext;
	}	
	
	@Override
	public void dispose() {
		setMatrix3x3(null);
		super.dispose();
	}	
}