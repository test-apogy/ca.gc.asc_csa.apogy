package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.services;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VElement;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedReport;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.swt.core.AbstractSWTRenderer;
import org.eclipse.emfforms.spi.swt.core.di.EMFFormsDIRendererService;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.renderers.EMFControlCompositeRenderer;

public class EMFControlCompositeRendererService implements EMFFormsDIRendererService<VControl>{

	private EMFFormsDatabinding databindingService;
	private ReportService reportService;

	/**
	 * Called by the initializer to set the EMFFormsDatabinding.
	 *
	 * @param databindingService The EMFFormsDatabinding
	 */
	protected void setEMFFormsDatabinding(EMFFormsDatabinding databindingService) {
		this.databindingService = databindingService;
	}
 
	/**
	 * Called by the initializer to set the ReportService.
	 *
	 * @param reportService The ReportService
	 */
	protected void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}
	
	@Override
	public double isApplicable(VElement vElement, ViewModelContext viewModelContext) {
		System.out.println("EMFControlCompositeRendererService.isApplicable(): \n\tvElement = " + vElement + "\n\tviewModelContext = " + viewModelContext);
		if (!VControl.class.isInstance(vElement)) {
			return NOT_APPLICABLE;
		}
		final VControl control = (VControl) vElement;
		IValueProperty valueProperty;
		try {
			valueProperty = databindingService.getValueProperty(control.getDomainModelReference(),
				viewModelContext.getDomainModel());
		} catch (final DatabindingFailedException ex) {
			reportService.report(new DatabindingFailedReport(ex));
			return NOT_APPLICABLE;
		}
		final EStructuralFeature eStructuralFeature = EStructuralFeature.class.cast(valueProperty.getValueType());
		System.out.println("\t" + eStructuralFeature);
		
		if (eStructuralFeature instanceof EAttribute) {
			System.out.println("\t It is an EAttribute");
			
			EAttribute eAttribute = (EAttribute) eStructuralFeature;
						
			System.out.println("\tUnits : " + ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits(eAttribute));

			// Out Of range
			Number oorMin = ApogyCommonEMFFacade.INSTANCE.getOutOfRangeMinValue(eAttribute);
			System.out.println("\toorMin = " + oorMin);
			
			Number oorMax = ApogyCommonEMFFacade.INSTANCE.getOutOfRangeMaxValue(eAttribute);
			System.out.println("\toorMax = " + oorMax);


			// Alarm range
			Number alarmMin = ApogyCommonEMFFacade.INSTANCE.getAlarmMinValue(eAttribute);
			System.out.println("\talarmMin = " + alarmMin);
			Number alarmMax = ApogyCommonEMFFacade.INSTANCE.getAlarmMaxValue(eAttribute);
			System.out.println("\talarmMax = " + alarmMax);

			// Warning
			Number warningMin = ApogyCommonEMFFacade.INSTANCE.getWarningMinValue(eAttribute);
			System.out.println("\twarningMin = " + warningMin);
			Number warningMax = ApogyCommonEMFFacade.INSTANCE.getWarningMaxValue(eAttribute);
			System.out.println("\twarningMax = " + warningMax);			
			
			/* Check if units or range properties are defined. */
			if (ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits(eAttribute) != null || 
					ApogyCommonEMFFacade.INSTANCE.getOutOfRangeMinValue(eAttribute) != null || 
					ApogyCommonEMFFacade.INSTANCE.getOutOfRangeMaxValue(eAttribute) != null ||
					ApogyCommonEMFFacade.INSTANCE.getAlarmMinValue(eAttribute) != null || 
					ApogyCommonEMFFacade.INSTANCE.getAlarmMaxValue(eAttribute) != null || 
					ApogyCommonEMFFacade.INSTANCE.getWarningMinValue(eAttribute) != null ||
					ApogyCommonEMFFacade.INSTANCE.getWarningMaxValue(eAttribute) != null){
				return 10;
			}
		}
		return NOT_APPLICABLE;
	}
 
	@Override
	public Class<? extends AbstractSWTRenderer<VControl>> getRendererClass() {
		System.out.println("EMFControlCompositeRendererService.getRendererClass()");
		return EMFControlCompositeRenderer.class;
	}
}