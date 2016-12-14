package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.SubClassesListComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

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

public class ConditioningComposite extends Composite {

	private Composite conditioningEMFForms;
	private SubClassesListComposite subClassesListComposite;
	private AbstractInputConditioningResponsePlotComposite plotComposite;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public ConditioningComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout_value = new GridLayout(2, true);
		gridLayout_value.marginWidth = 0;
		gridLayout_value.marginHeight = 0;
		gridLayout_value.marginBottom = 5;
		this.setLayout(gridLayout_value);

		/**
		 * PlotComposite
		 */
		plotComposite = new AbstractInputConditioningResponsePlotComposite(
				this, SWT.None);
		plotComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));

		/**
		 * EMFForms
		 */
		conditioningEMFForms = new Composite(this, SWT.None);
		conditioningEMFForms.setLayout(new GridLayout());
		conditioningEMFForms.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		conditioningEMFForms.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		/**
		 * Conditioning sub classes list.
		 */
		subClassesListComposite = new SubClassesListComposite(this, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				if (!selection.isEmpty()) {
					AbstractInputConditioning abstractInputConditioning = (AbstractInputConditioning) EcoreUtil
							.create((EClass) selection.getFirstElement());
					ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(abstractInputConditioning.eContainer(),
							ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING,
							abstractInputConditioning);

					plotComposite.setAbstractInputConditioning(abstractInputConditioning);
					ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(conditioningEMFForms,
							abstractInputConditioning);
					ConditioningComposite.this.newSelection(null);
				}
			}
		};
		subClassesListComposite.setSuperClass(ApogyCoreProgramsControllersPackage.Literals.ABSTRACT_INPUT_CONDITIONING);

		subClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		subClassesListComposite.moveAbove(plotComposite);
	}

	/**
	 * This method is called when a new selection is made.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Binds the {@link OperationCallControllerBinding} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCallControllerBinding}.
	 */
	public void setAbstractInputConditioning(AbstractInputConditioning abstractInputConditioning) {
		ApogyCommonEMFUiEMFFormsFacade.INSTANCE.createEMFForms(conditioningEMFForms, abstractInputConditioning);
		subClassesListComposite.setSelectedEClass(abstractInputConditioning.eClass());
		plotComposite.setAbstractInputConditioning(abstractInputConditioning);
		this.layout();
	}

}