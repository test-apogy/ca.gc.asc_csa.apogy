package ca.gc.asc_csa.apogy.core.invocator.ui.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

public class InstanceView extends AbstractView implements IEditingDomainProvider {
	private EObjectComposite eObjectComposite;

	@Override
	public void updatePartName() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		eObjectComposite = new EObjectComposite(parent,
				SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				getSelectionProvider().setSelection(selection);
			}
		};
	}

	@Override
	public void updateSelection(ISelection selection) {
		EObject selectedEObject = null;		
		if (selection instanceof IStructuredSelection){
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object obj = ss.getFirstElement();
			if (obj instanceof Variable){
				Variable variable = (Variable) obj;				
				selectedEObject = ApogyCoreInvocatorFacade.INSTANCE.getInstance(variable);				
			}
			if (obj instanceof AbstractTypeImplementation){
				AbstractTypeImplementation abstractTypeImplementation = (AbstractTypeImplementation) obj;
				selectedEObject = abstractTypeImplementation.getInstance();
			}
		}
		
		if (selectedEObject != null){
			eObjectComposite.setEObject(selectedEObject);
		}
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
}