package ca.gc.asc_csa.apogy.common.emf.ui.composites;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

public class EMFControlComposite extends Composite{
	
	private EStructuralFeature eStructuralFeature;
	private Text textValue;

	public EMFControlComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(5, false));
		
		Label lblName = new Label(this, SWT.NONE);
		lblName.setText("Name:");
		
		Label lblValidation = new Label(this, SWT.BORDER | SWT.SHADOW_IN);
		lblValidation.setAlignment(SWT.CENTER);
		GridData gd_lblValidation = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblValidation.widthHint = 20;
		lblValidation.setLayoutData(gd_lblValidation);
		
		textValue = new Text(this, SWT.BORDER);
		textValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblUnit = new Label(this, SWT.NONE);
		lblUnit.setText("Unit");
		
		Button btnSettings = new Button(this, SWT.NONE);
		btnSettings.setText("...");
	}

	public void setEStructuralFeature(EStructuralFeature eStructuralFeature) {
		this.eStructuralFeature = eStructuralFeature;
	}
	
	public EStructuralFeature getEStructuralFeature() {
		return eStructuralFeature;
	}	
}