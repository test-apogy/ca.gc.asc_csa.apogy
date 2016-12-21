package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.renderers;

import javax.inject.Inject;
import javax.measure.unit.Unit;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.renderer.TextControlSWTRenderer;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.template.model.VTViewTemplateProvider;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.core.services.editsupport.EMFFormsEditSupport;
import org.eclipse.emfforms.spi.core.services.label.EMFFormsLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Ranges;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;

public class EMFControlCompositeRenderer extends TextControlSWTRenderer{

	private Label lblRange;

	@Inject
	public EMFControlCompositeRenderer(VControl vElement, ViewModelContext viewContext,
		ReportService reportService,
		EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
		VTViewTemplateProvider vtViewTemplateProvider, EMFFormsEditSupport emfFormsEditSupport) {
		super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider,
			emfFormsEditSupport);
	}
 
	@Override
	protected Control createSWTControl(Composite parent) {
		final Composite main = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(4).applyTo(main);
		GridDataFactory.fillDefaults().grab(true, false)
			.align(SWT.FILL, SWT.BEGINNING).applyTo(main);
		lblRange = new Label(main, SWT.None);
		lblRange.setText("         ");
		lblRange.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_CYAN));
		final Control control = super.createSWTControl(main);
		final Label lblUnit = new Label(main, SWT.None);
		lblUnit.setText("Units");
		try {		
			Unit<?> units = ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits((ETypedElement) getModelValue().getValueType());
			if (units != null){
				lblUnit.setText(units.toString());
			}
		} catch (DatabindingFailedException e) {
		}		
		
		final Button button = new Button(main, SWT.PUSH);
		button.setText("...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		return control;
	}
	
	@Override
	protected Binding[] createBindings(Control control) throws DatabindingFailedException {
		Binding[] original_bindings = super.createBindings(control);	
		
//		Label lblRange = null;
//		Composite composite = (Composite) control;
//		final Control lblRange = Composite.class.cast(control).getChildren()[0];
//		final boolean useOnModifyDatabinding = useOnModifyDatabinding();
//		final IObservableValue value;
//		if (useOnModifyDatabinding) {
//			value = WidgetProperties.text(SWT.Modify).observeDelayed(250, controlToObserve);
//		} else {
//			value = WidgetProperties.text(SWT.FocusOut).observe(controlToObserve);
//		}
//		final Binding binding = dataBindingContext.bindValue(value, modelValue, targetToModel, modelToTarget);

		/* Import Button Enabled. */
		IObservableValue<?> observeColor = WidgetProperties.background().observe(lblRange);		
		Binding rangeBinding = getDataBindingContext().bindValue(observeColor, getModelValue(), null, new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(EObject.class, Color.class){
			@Override
			public Object convert(Object fromObject) {
				Color color = SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT);				
				try {
					Ranges range = ApogyCommonEMFFacade.INSTANCE.getRange((ETypedElement) getModelValue().getValueType(), getModelValue().getValue());
					color = ApogyCommonEMFUIFacade.INSTANCE.getColorForRange(range);					
				} catch (DatabindingFailedException e) {
				}
				return color;
			}			
		}));
		
		return new Binding[] { rangeBinding, original_bindings[0], original_bindings[1]};
	}	
}