package ca.gc.asc_csa.apogy.common.math.ui.composites;
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
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.math.provider.MathEditUtils;

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
			orientationTuple3d = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
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
																	
							MathEditUtils.updateOrientation(getMatrix(), ApogyCommonMathFacade.INSTANCE.createMatrix3x3(matrix3d), editingDomain);								
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