package ca.gc.asc_csa.apogy.core.invocator.ui.wizards;
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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.Iterator;

import org.eclipse.emf.common.command.StrictCompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class NewContextWizard extends Wizard {

	private InvocatorSession invocatorSession;
	private Context context;
	private NamedDescribedWizardPage namedDescribedWizardPage;
	private VariableImplementationsWizardPage variableImplementationWizardPage;
	private DataProductsListWizardPage dataProductsListWizardPage;
	private VariableImplementationsList variableImplementationsList;

	/**
	 * Constructor for NewContextWizard.
	 */
	public NewContextWizard(InvocatorSession invocatorSession) {
		super();
		setWindowTitle("New Context");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,
				"icons/wizban/apogy_new_context.png");
		setDefaultPageImageDescriptor(image);
		this.invocatorSession = invocatorSession;
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		addPage(getNamedDescribedWizardPage());
		addPage(getVariableImplementationWizardPage());
		addPage(getDataProductsListWizardPage());

		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(getNamedDescribedWizardPage(), 0.8);
	}

	public void setInvocatorSession(InvocatorSession invocatorSession) {
		this.invocatorSession = invocatorSession;
	}

	public InvocatorSession getInvocatorSession() {
		return invocatorSession;
	}

	/**
	 * Returns the {@link NamedDescribedContextWizardPage}. If null is returned,
	 * the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected NamedDescribedWizardPage getNamedDescribedWizardPage() {
		if (namedDescribedWizardPage == null) {
			namedDescribedWizardPage = new NamedDescribedWizardPage(getContext(), getContext());
		}
		return namedDescribedWizardPage;
	}

	/**
	 * Returns the {@link VariableImplementationsWizardPage}. If null is
	 * returned, the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected VariableImplementationsWizardPage getVariableImplementationWizardPage() {
		if (variableImplementationWizardPage == null) {
			variableImplementationWizardPage = new VariableImplementationsWizardPage(getContext());
		}
		return variableImplementationWizardPage;
	}

	/**
	 * Returns the {@link DataProductsListWizardPage}. If null is returned, the
	 * page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected DataProductsListWizardPage getDataProductsListWizardPage() {
		if (dataProductsListWizardPage == null) {
			dataProductsListWizardPage = new DataProductsListWizardPage(getContext(), getInvocatorSession());
		}
		return dataProductsListWizardPage;
	}

	@Override
	public boolean performFinish() {

		/*
		 * Create a compound command to execute addContext and the
		 * addDataProducts if needed
		 */
		StrictCompoundCommand compoundCommand = new StrictCompoundCommand();

		/*
		 * Create the command to add the new context
		 */
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(getInvocatorSession().getEnvironment().getContextsList());
		AddCommand addContextcommand = new AddCommand(editingDomain,
				getInvocatorSession().getEnvironment().getContextsList(),
				ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS, context);
		compoundCommand.append(addContextcommand);

		/*
		 * Verify if the context's dataProductsList is in the invocatorSession's
		 * dataProductsListsContainer to know if the DataProductsList is already
		 * existing or a new one
		 */
		boolean newDataProductsList = false;
		for (int i = 0; i < invocatorSession.getDataProductsListContainer().getDataProductsList().size(); i++) {
			if (context.getDataProductsList() == invocatorSession.getDataProductsListContainer().getDataProductsList()
					.get(i)) {
				newDataProductsList = true;
			}
		}

		/*
		 * If the dataProductsList was not found in the invocatorSession's
		 * dataProductsListsContainer
		 */
		if (!newDataProductsList) {
			/*
			 * Create the command to add the new DataProductsList
			 */
			editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getInvocatorSession());
			AddCommand addDataProductsListCommand = new AddCommand(editingDomain,
					getInvocatorSession().getDataProductsListContainer(),
					ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER,
					context.getDataProductsList());
			compoundCommand.append(addDataProductsListCommand);
		}

		/*
		 * Execure the command
		 */
		editingDomain.getCommandStack().execute(compoundCommand);

		return true;
	}

	/**
	 * Create and returns the instance of the {@link Context} to be set within
	 * the wizard pages. This method uses the lazy loading pattern.
	 * 
	 * @return Reference to the {@link Context}.
	 */
	protected Context getContext() {
		if (context == null) {
			context = ApogyCoreInvocatorFacade.INSTANCE.createContext(getInvocatorSession());
			context.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(
					getInvocatorSession().getEnvironment().getContextsList(), context, 
					ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS));
		}
		return context;
	}

	/**
	 * Create and returns the instance of the
	 * {@link VariableImplementationsList} to be set within the variable
	 * implementation wizard pages for the context. This method uses the lazy
	 * loading pattern.
	 * 
	 * @return Reference to the {@link VariableImplementationsList}.
	 */
	protected VariableImplementationsList getVariableImplementationsList() {
		if (variableImplementationsList == null) {
			variableImplementationsList = ApogyCoreInvocatorFactory.eINSTANCE.createVariableImplementationsList();

			/**
			 * Instantiate the variable implementations.
			 */
			Iterator<Variable> variables = getInvocatorSession().getEnvironment().getVariablesList().getVariables()
					.iterator();
			while (variables.hasNext()) {
				Variable variable = variables.next();
				VariableImplementation variableImplementation = ApogyCoreInvocatorFactory.eINSTANCE
						.createVariableImplementation();
				variableImplementation.setVariable(variable);

				/** Create TypeMemberImplementations. */
				variableImplementation.getTypeMemberImplementations().addAll(
						ApogyCoreInvocatorFacade.INSTANCE.createTypeMemberImplementations(variable.getVariableType()));

				variableImplementationsList.getVariableImplementations().add(variableImplementation);
			}
		}
		return variableImplementationsList;
	}
}