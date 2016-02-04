package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.views;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

public class PoseSensorView extends ViewPart implements ISelectionListener {

	private Label tx;
	private Label ty;
	private Label tz;
	private Label rx;
	private Label rz;
	private Label ry;
	private Label status;
	private PoseSensor poseSensor;
	private Adapter poseSensorListener;

	public PoseSensorView() {

	}

	@Override
	public void createPartControl(Composite parent) {

		parent.setLayout(new GridLayout(2, true));

		// We have labels for tx,ty,tz,rx,ry,rz and the status.

		// Tx
		Label lTx = new Label(parent, SWT.NONE);
		lTx.setText("Tx: ");

		tx = new Label(parent, SWT.NONE);
		tx
				.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
						true));

		// Ty
		Label lTy = new Label(parent, SWT.NONE);
		lTy.setText("Ty: ");

		ty = new Label(parent, SWT.NONE);
		ty
				.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
						true));

		// Ty
		Label lTz = new Label(parent, SWT.NONE);
		lTz.setText("Tz: ");

		tz = new Label(parent, SWT.NONE);
		tz
				.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
						true));

		// Rx
		Label lRx = new Label(parent, SWT.NONE);
		lRx.setText("Rx: ");

		rx = new Label(parent, SWT.NONE);
		rx
				.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
						true));

		// Ry
		Label lRy = new Label(parent, SWT.NONE);
		lRy.setText("Ry: ");

		ry = new Label(parent, SWT.NONE);
		ry
				.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
						true));

		// Ry
		Label lRz = new Label(parent, SWT.NONE);
		lRz.setText("Rz: ");

		rz = new Label(parent, SWT.NONE);
		rz
				.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
						true));

		// Status
		Label lStatus = new Label(parent, SWT.NONE);
		lStatus.setText("Status: ");

		status = new Label(parent, SWT.NONE);
		status.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));

		getSite().getWorkbenchWindow().getSelectionService()
				.addSelectionListener(this);
	}

	@Override
	public void setFocus() {

	}

	private Adapter getPoseSensorListener() {
		if (poseSensorListener == null) {
			poseSensorListener = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					int featureId = msg.getFeatureID(PoseSensor.class);

					if (featureId == ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION
							|| featureId == ApogyAddonsSensorsPosePackage.POSE_SENSOR__ROTATION_MATRIX
							|| featureId == ApogyAddonsSensorsPosePackage.POSE_SENSOR__STATUS) {
						updateView();
					}
				}

			};
		}

		return poseSensorListener;
	}

	private void updateView() {
		Runnable run = new Runnable() {


			public void run() {
				tx.setText(poseSensor.getPose().getX() + "");
				rx.setText(poseSensor.getPose().getXRotation() + "");

				ty.setText(poseSensor.getPose().getY() + "");
				ry.setText(poseSensor.getPose().getYRotation() + "");

				tz.setText(poseSensor.getPose().getZ() + "");
				rz.setText(poseSensor.getPose().getZRotation() + "");

				status.setText(poseSensor.getStatus().toString());

			}
		};

		getSite().getShell().getDisplay().asyncExec(run);

	}


	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;

			// We first unsubscribe to the current pose sensor.
			if (poseSensor != null) {
				poseSensor.eAdapters().remove(getPoseSensorListener());
			}

			if (sel.getFirstElement() instanceof PoseSensor) {
				poseSensor = (PoseSensor) sel.getFirstElement();
				poseSensor.eAdapters().add(getPoseSensorListener());
			}
		}
	};

}
