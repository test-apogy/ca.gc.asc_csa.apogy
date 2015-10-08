package org.eclipse.symphony.common.io.jinput.ui.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.symphony.common.io.jinput.EController;

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
