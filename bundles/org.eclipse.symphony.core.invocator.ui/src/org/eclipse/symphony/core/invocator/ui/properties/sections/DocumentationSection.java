package org.eclipse.symphony.core.invocator.ui.properties.sections;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.common.ui.properties.sections.AbstractExtendedPropertySection;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeMember;
import org.eclipse.symphony.core.invocator.TypeMemberImplementation;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.composites.EClassDocumentationComposite;

public class DocumentationSection extends AbstractExtendedPropertySection {
		
	@Override
	protected void render(EObject eObject) {
		EClass eClass = null;
		if (eObject instanceof Type){
			Type type = (Type) eObject;
			eClass = type.getInterfaceClass();			
		}else if (eObject instanceof TypeMember){
			TypeMember typeMember = (TypeMember) eObject;
			if (typeMember.getMemberType() != null){
				eClass = typeMember.getMemberType().getInterfaceClass();
			}			
		}else if (eObject instanceof Variable){
			Variable variable = (Variable) eObject;
			eClass = variable.getVariableType() != null ? variable.getVariableType().getInterfaceClass() : null;			
		}else if (eObject instanceof VariableImplementation){
			VariableImplementation variableImplementation = (VariableImplementation) eObject;
			if (variableImplementation.getVariable().getVariableType() != null){
				eClass = variableImplementation.getVariable().getVariableType().getInterfaceClass();
			}
		}else if (eObject instanceof TypeMemberImplementation){
			TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) eObject;
			if (typeMemberImplementation.getTypeMember().getMemberType() != null){
				eClass = typeMemberImplementation.getTypeMember().getMemberType().getInterfaceClass();
			}
		}		
		((EClassDocumentationComposite) getComposite()).setEClass(eClass);		
	}
	
	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		return new EClassDocumentationComposite(parent, SWT.NONE);
	}
}