package ca.gc.asc_csa.apogy.rcp.toolcontrols;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage;

public class ActiveProjectToolControl {
	
	private Text textValue;
	private DataBindingContext bindingContext;

	@PostConstruct
	public void createControls(Composite parent){
		
		final Composite composite = new Composite(parent, SWT.NONE);
		GridLayout gl_composite = new GridLayout();
		composite.setLayout(gl_composite);
		textValue = new Text(composite, SWT.BORDER);
		GridData gd_labelValue = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_labelValue.widthHint = 250;
		gd_labelValue.minimumWidth = 250;
		textValue.setLayoutData(gd_labelValue);
		
		initDataBindings();
	}

	@SuppressWarnings("unchecked")
	private DataBindingContext initDataBindings() {
		bindingContext = new DataBindingContext();
		
		/* Import Button Enabled. */
		IObservableValue<?> observeActiveProject = EMFProperties.value(ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT).observe(ApogyWorkspaceFacade.INSTANCE);
		IObservableValue<?> observeLabelValueText = WidgetProperties.text().observe(textValue);
		
		bindingContext.bindValue(observeLabelValueText, observeActiveProject, null, new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(IProject.class, String.class){
			@Override
			public Object convert(Object fromObject) {
				return fromObject != null ? ApogyWorkspaceFacade.INSTANCE.getActiveProject().getName()  : "No active project";
			}			
		}));
		//
		return bindingContext;
	}
	
	@PreDestroy
	public void dispose(){
		bindingContext.dispose();
	}
}