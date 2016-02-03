package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.dialogs;
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

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.composites.EditPositionComposite;
import ca.gc.asc_csa.apogy.addons.sensors.pose.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

public class ResetPositionDialog extends MessageDialog
{
	private PositionSensor positionSensor;
	
	private EditPositionComposite editPositionNodePositionComposite;
	private static final int APPLY_BUTTON_ID = 0;
	private static final int CLOSE_BUTTON_ID = 1;
	
	public ResetPositionDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage, String dialogMessage, int dialogImageType, String[] dialogButtonLabels, int defaultIndex)
	{
		super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType, dialogButtonLabels, defaultIndex);		
	}
	
	public ResetPositionDialog(Shell parentShell, PositionSensor positionSensor)
	{
		super(parentShell, "Reset Position", null, null, MessageDialog.NONE,  new String[]{"Apply", "Close"}, 0);		
		this.positionSensor = positionSensor;
	}
	
	@Override
	protected Control createCustomArea(Composite parent)
	{		
		editPositionNodePositionComposite = new EditPositionComposite(parent, SWT.NONE, this.positionSensor); 
		return editPositionNodePositionComposite;
	}

	@Override
	protected void buttonPressed(int buttonId)
	{
		switch(buttonId)
		{
			case APPLY_BUTTON_ID:
			{
				try
				{
					this.positionSensor.resetPosition(editPositionNodePositionComposite.getNewValues());
				}
				catch(Exception e)
				{
					Logger.INSTANCE.log(Activator.ID, this, "Error occured while reseting position !", EventSeverity.ERROR, e);
				}
				break;			
			}						
			case CLOSE_BUTTON_ID:
			{
				this.close();
				break;
			}
			default:
			{
				this.close();
			}	
		}
	}
}
