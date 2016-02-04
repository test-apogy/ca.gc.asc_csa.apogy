package ca.gc.asc_csa.apogy.core.invocator.ui.views;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EClassDocumentationComposite;
import ca.gc.asc_csa.apogy.common.ui.views.AbstractView;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
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
		return AdapterFactoryEditingDomain.getEditingDomainFor(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
	}
}