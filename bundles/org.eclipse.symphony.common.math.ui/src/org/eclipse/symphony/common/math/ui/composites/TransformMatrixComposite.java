package org.eclipse.symphony.common.math.ui.composites;

import javax.vecmath.Matrix3d;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.command.SetCommand;
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
import org.eclipse.symphony.common.math.Symphony__CommonMathPackage;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.math.provider.MathEditUtils;

public class TransformMatrixComposite extends Composite {

	private Matrix4x4 matrix;
	private Tuple3dComposite translationComposite;
	private Tuple3dComposite rotationComposite;
	private Tuple3d positionTuple3d; 
	private Tuple3d orientationTuple3d;
	private Adapter matrixAdapter;
	private boolean disableEvent = false;
	private Adapter positionTuple3dAdapter;
	private Adapter orientationTuple3dAdapter;
	private EditingDomain editingDomain;
	
	public TransformMatrixComposite(Composite parent, int style, EditingDomain editingDomain) {
		this(parent, style);
		this.editingDomain = editingDomain;
	}	
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public TransformMatrixComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		
		Group grpTranslation = new Group(this, SWT.NONE);
		grpTranslation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpTranslation.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpTranslation.setText("Translation (x,y,z)");		
		translationComposite = new Tuple3dComposite(grpTranslation, SWT.NONE, "0.0000");

				
		Group grpRotation = new Group(this, SWT.NONE);
		grpRotation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpRotation.setLayout(new FillLayout(SWT.HORIZONTAL));
		grpRotation.setText("Rotation (rx,ry,rz)");		
		rotationComposite = new Tuple3dComposite(grpRotation, SWT.NONE, "0.000");		
	}

	public void setMatrix4x4(Matrix4x4 matrix) {
		getPositionTuple3d().eAdapters().remove(getPositionTuple3dAdapter());
		getOrientationTuple3d().eAdapters().remove(getOrientationTuple3dAdapter());

		if (getMatrix() != null){
			getMatrix().eAdapters().remove(getMatrixAdapter());
		}
		
		this.matrix = matrix;
		
		if (getMatrix() != null){
			translationComposite.setTuple3d(getPositionTuple3d());
			rotationComposite.setTuple3d(getOrientationTuple3d());
			
			updatePositionAndOrientationTuples(getMatrix(), getPositionTuple3d(), getOrientationTuple3d());
			
			getMatrix().eAdapters().add(getMatrixAdapter());

			getPositionTuple3d().eAdapters().add(getPositionTuple3dAdapter());
			getOrientationTuple3d().eAdapters().add(getOrientationTuple3dAdapter());
		}		
	}
		
	private Adapter getMatrixAdapter() {
		if (matrixAdapter == null){
			matrixAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					if (!disableEvent){
						updatePositionAndOrientationTuples(getMatrix(), getPositionTuple3d(), getOrientationTuple3d());						
					}
				};
			};
		}
		return matrixAdapter;
	}

	public Matrix4x4 getMatrix() {
		return matrix;
	}
	
	private void updatePositionAndOrientationTuples(Matrix4x4 matrix, Tuple3d position, Tuple3d orientation){
		
		disableEvent = true;
		
		/** Update Position Tuples. */
		Tuple3d result = Symphony__CommonMathFacade.INSTANCE.extractPosition(matrix);
		position.setX(result.getX());
		position.setY(result.getY());
		position.setZ(result.getZ());
		
		result = Symphony__CommonMathFacade.INSTANCE.extractOrientation(matrix);
		orientation.setX(Math.toDegrees(result.getX()));
		orientation.setY(Math.toDegrees(result.getY()));
		orientation.setZ(Math.toDegrees(result.getZ()));
		
		disableEvent = false;
	}
	
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	private Tuple3d getPositionTuple3d() {
		if (positionTuple3d == null){
			positionTuple3d = Symphony__CommonMathFactory.eINSTANCE.createTuple3d();			
		}
		return positionTuple3d;
	}
	
	private Adapter getPositionTuple3dAdapter(){
		if (positionTuple3dAdapter == null){
			positionTuple3dAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					super.notifyChanged(msg);
					
					if (!disableEvent){
					
						/** Disable Matrix Events. */
						disableEvent = true;
						
						if (msg.getEventType() == Notification.SET){
							
							switch (msg.getFeatureID(Tuple3d.class)){
							
							case Symphony__CommonMathPackage.TUPLE3D__X:
								if (editingDomain == null){
									getMatrix().setM03(getPositionTuple3d().getX());
								}else{
									editingDomain.getCommandStack().execute(
											SetCommand.create(editingDomain, getMatrix(), Symphony__CommonMathPackage.Literals.MATRIX4X4__M03, positionTuple3d.getX()));
								}							
								break;
								
							case Symphony__CommonMathPackage.TUPLE3D__Y:
								if (editingDomain == null){
									getMatrix().setM13(getPositionTuple3d().getY());
								}else{
									editingDomain.getCommandStack().execute(
											SetCommand.create(editingDomain, getMatrix(), Symphony__CommonMathPackage.Literals.MATRIX4X4__M13, positionTuple3d.getY()));
								}							
								break;
								
							case Symphony__CommonMathPackage.TUPLE3D__Z:
								if (editingDomain == null){
									getMatrix().setM23(getPositionTuple3d().getZ());
								}else{
									editingDomain.getCommandStack().execute(
											SetCommand.create(editingDomain, getMatrix(), Symphony__CommonMathPackage.Literals.MATRIX4X4__M23, positionTuple3d.getZ()));
								}							
								break;							
							}
													
						}
						
						/** Reenable Matrix Events. */
						disableEvent = false;
					}
				}
			};
		}		
		return positionTuple3dAdapter;
	}	
	
	private Tuple3d getOrientationTuple3d() {
		if (orientationTuple3d == null){
			orientationTuple3d = Symphony__CommonMathFactory.eINSTANCE.createTuple3d();
		}
		return orientationTuple3d;
	}
	
	
	private Adapter getOrientationTuple3dAdapter() {
		if (orientationTuple3dAdapter == null){
			orientationTuple3dAdapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					super.notifyChanged(msg);	
					
					if (!disableEvent){
							
						/** Disable Matrix Events. */
						disableEvent = true;
	
						if (msg.getEventType() == Notification.SET){
							
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
		setMatrix4x4(null);
		super.dispose();
	}	
}