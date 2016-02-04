package ca.gc.asc_csa.apogy.common.io.jinput.ui.composites;
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

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import ca.gc.asc_csa.apogy.common.io.jinput.EController;

public class PollCommandComposite extends Composite {
	
	private EController controller;
	
	public PollCommandComposite(Composite parent, int style) {
		super(parent, style);

		
		Button btnPoll = new Button(this, SWT.NONE);
		btnPoll.setBounds(0, 0, 88, 29);
		btnPoll.setText("Poll");
		btnPoll.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(getController() != null)
					getController().poll();
			}
		});

	}
	
	public void setController(EController c) { controller = c; }
	public EController getController() { return controller; }
}
