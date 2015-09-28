package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMember;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.EClassDocumentationComposite;
import ca.gc.asc_csa.eclipse.ui.views.AbstractView;

public class DocumentationView extends AbstractView implements
		ITabbedPropertySheetPageContributor, IEditingDomainProvider {
	private EClassDocumentationComposite documentationComposite;

	@Override
	public void updatePartName() {
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		documentationComposite = new EClassDocumentationComposite(parent,
				SWT.None);
	}

	@Override
	public void updateSelection(ISelection selection) {

		if (selection instanceof IStructuredSelection){
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object obj = ss.getFirstElement();
			EClass eClass = null;

			if (obj instanceof Type){
				Type type = (Type) obj;
				eClass = type.getInterfaceClass();			
			}else if (obj instanceof TypeMember){
				TypeMember typeMember = (TypeMember) obj;
				if (typeMember.getMemberType() != null){
					eClass = typeMember.getMemberType().getInterfaceClass();
				}			
			}else if (obj instanceof Variable){
				Variable variable = (Variable) obj;
				eClass = variable.getVariableType().getInterfaceClass();			
			}else if (obj instanceof VariableImplementation){
				VariableImplementation variableImplementation = (VariableImplementation) obj;
				if (variableImplementation.getVariable().getVariableType() != null){
					eClass = variableImplementation.getVariable().getVariableType().getInterfaceClass();
				}
			}else if (obj instanceof TypeMemberImplementation){
				TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) obj;
				if (typeMemberImplementation.getTypeMember().getMemberType() != null){
					eClass = typeMemberImplementation.getTypeMember().getMemberType().getInterfaceClass();
				}
			}			
			documentationComposite.setEClass(eClass);
		}
	}

	@Override
	public EditingDomain getEditingDomain() {
		return AdapterFactoryEditingDomain.getEditingDomainFor(EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
}