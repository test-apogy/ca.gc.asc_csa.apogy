package org.eclipse.symphony.core.invocator.ui.views;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.emf.ui.composites.EClassDocumentationComposite;
import org.eclipse.symphony.common.ui.views.AbstractView;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeMember;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

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