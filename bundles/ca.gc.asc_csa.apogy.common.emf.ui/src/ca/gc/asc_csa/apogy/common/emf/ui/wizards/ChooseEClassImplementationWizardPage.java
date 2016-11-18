package ca.gc.asc_csa.apogy.common.emf.ui.wizards;
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectListComposite;

public class ChooseEClassImplementationWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.common.emf.ui.wizards.ChooseEClassWizardPage";

	private EObjectListComposite eClassesListComposite;
	private Adapter adapter;
	private EReference eReference;
	private EClass superClass;

	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public ChooseEClassImplementationWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("New Child");
		setDescription("Select the new child's reference and type.");
	}

	public ChooseEClassImplementationWizardPage(EReference eReference, EClass superClass) {
		this();
		if (this.eReference != null) {
			this.eReference.eAdapters().remove(getAdapter());
		}
		if (this.superClass != null) {
			this.superClass.eAdapters().remove(getAdapter());
		}

		this.eReference = eReference;
		this.superClass = superClass;

		this.eReference.eAdapters().add(getAdapter());
		this.superClass.eAdapters().add(getAdapter());
	}

	private Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					validate();
				}
			};
		}
		return adapter;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(1, false));

		eClassesListComposite = new EObjectListComposite(container, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				ChooseEClassImplementationWizardPage.this.validate();
			}

			@Override
			protected StyledCellLabelProvider getLabelProvider() {
				return new EClassLabelProvider();
			}
		};
		EList<EObject> eObjectsEClassList = new BasicEList<EObject>();
		eObjectsEClassList.addAll(ApogyCommonEMFFacade.INSTANCE
				.getAllSubEClasses(this.superClass));
		eClassesListComposite.setEObjectsList(eObjectsEClassList);
		
		eClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		setControl(container);
		validate();
	}

	/**
	 * Returns the selected {@link EClass} in the {@link EObjectListComposite}
	 * of EClasses
	 * 
	 * @return EReference The {@link EClass} selected by the user
	 */
	public EClass getSelectedEClass() {
		return (EClass) eClassesListComposite.getSelectedEObject();
	}
	
	/**
	 * Label provider of the EClassesListComposite
	 */
	private class EClassLabelProvider extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof EClass) {
				cell.setText(((EClass) cell.getElement()).getName());
			}
		}

		@Override
		public String getToolTipText(Object element) {
			if (element instanceof EClass) {
				return ((EClass) element).getInstanceClassName();
			}
			return super.getToolTipText(element);
		}

		@Override
		public Point getToolTipShift(Object object) {
			return new Point(5, 5);
		}

		@Override
		public int getToolTipDisplayDelayTime(Object object) {
			return 500;
		}

		@Override
		public int getToolTipTimeDisplayed(Object object) {
			return 5000;
		}
	}

	@Override
	public void dispose() {
		super.dispose();
		if (this.eReference != null) {
			eReference.eAdapters().remove(getAdapter());
		}
		if (this.superClass != null) {
			superClass.eAdapters().remove(getAdapter());
		}
	}

	/**
	 * This method is invoked to validate the content.
	 */
	protected void validate() {
		String errorEClass = "";

		if (eClassesListComposite == null || eClassesListComposite.getSelectedEObject() == null) {
			errorEClass = "<Type> ";
		}

		if (errorEClass != "") {
			setErrorMessage(errorEClass + "must be selected");
			setPageComplete(false);
		} else {
			setErrorMessage(null);
			setPageComplete(true);
		}
	}
}
