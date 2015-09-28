package ca.gc.asc_csa.symphony.core.ui.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SymphonyBugReportPart {

	private Browser browser;

	@PostConstruct
	public void createControls(Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		browser = new Browser(parent, SWT.NONE);
		browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		browser.setUrl("http://liberty.speng.space.gc.ca/bugzilla/enter_bug.cgi?product=ca.gc.asc-csa.symphony");
	}
	
	@Focus
	public void setFocus(){
		browser.setFocus();
	}
}