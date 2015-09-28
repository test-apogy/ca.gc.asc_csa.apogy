package ca.gc.asc_csa.jinput.ui.composites;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ca.gc.asc_csa.jinput.Activator;

public class RefreshCommandComposite extends Composite {

	public RefreshCommandComposite(Composite parent, int style) {
		super(parent, style);
		
		Button btnRefresh = new Button(this, SWT.NONE);
		btnRefresh.setBounds(0, 0, 137, 29);
		btnRefresh.setText("Refresh controllers");
		btnRefresh.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				Activator.getEControllerEnvironment().refresh();
			}
		});
	}
}
