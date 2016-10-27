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

public class ChooseChildEReferenceWizardPage extends WizardPage {

private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.ChooseChildEReferenceWizardPage";

	private EObjectListComposite eReferencesListComposite;
	private EObjectListComposite eClassesListComposite;
	private Adapter adapter;
	private EList<EReference> childEReferences;

	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public ChooseChildEReferenceWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("New Child");
		setDescription("Select the new child's reference and type.");
	}

	public ChooseChildEReferenceWizardPage(
			EList<EReference> childEReferences) {
		this();
		if (this.childEReferences != null){
			for(int i = 0; i < childEReferences.size(); i++ ){
				this.childEReferences.get(i).eAdapters().remove(getAdapter());
			}						
		}
		
		this.childEReferences = childEReferences;
		
		for(int i = 0; i < childEReferences.size(); i++ ){
			this.childEReferences.get(i).eAdapters().add(getAdapter());
		}
	}
	
	private Adapter getAdapter() {
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					validate();
				}
			};
		}				
		return adapter;
	}
	
	public EReference getSelectedEReference(){
		return (EReference) eReferencesListComposite.getSelectedEObject();
	}
	
//	public void setSelectedEReference(EClass eClass){
//		this.eReferencesListComposite.setSelectedEObject(eClass);
//	}
	
	public EClass getSelectedEClass(){
		return (EClass) eClassesListComposite.getSelectedEObject();
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(2, false));
		
		
		
		eReferencesListComposite = new EObjectListComposite(container, SWT.None){
			@Override
			protected void newSelection(TreeSelection selection) {
				if(eClassesListComposite != null){
					ChooseChildEReferenceWizardPage.this.setEClassListCompositeList((EReference) this.getSelectedEObject()); 
				}
				ChooseChildEReferenceWizardPage.this.validate();
			}		
			
			@Override
			protected StyledCellLabelProvider getLabelProvider() {
				return new EReferenceLabelProvider();
			}
			
			@Override
			protected String getTitle() {
				return "Reference";
			}
		};
		
		EList<EObject> eObjectsEReferenceList = new BasicEList<EObject>();
		eObjectsEReferenceList.addAll(childEReferences);
		eReferencesListComposite.setEObjectsList(eObjectsEReferenceList);
		eReferencesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		eClassesListComposite = new EObjectListComposite(container, SWT.None){
			@Override
			protected void newSelection(TreeSelection selection) {
				ChooseChildEReferenceWizardPage.this.validate();
			}		
			
			@Override
			protected StyledCellLabelProvider getLabelProvider() {
				return new EClassLabelProvider();
			}
			
			@Override
			protected String getTitle() {
				return "Type";
			}
		};
		
		if(eReferencesListComposite.getSelectedEObject() != null){
			setEClassListCompositeList((EReference)eReferencesListComposite.getSelectedEObject()); 
		}
		eClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		eReferencesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		

		
		
//		((EReference)eReferencesListComposite.getSelectedEObject())
//		EReference test = null;
//		List<EClass> availableClasses = ApogyCommonEMFFacade.INSTANCE.getAllAvailableEClasses();
//		test.getEReferenceType();
		
		
		
		
	
		
//		List<EClass> classes = ApogyCommonEMFFacade.INSTANCE.getChildEClasses(parentEClass);
		
		
//		if (parentEClass != null)
//		{
//			EList<EReference> structuralFeatures = parentEClass.getEAllContainments();
//			
//			EClassFilter filter = new EClassFilter()
//			{
//				public boolean filter(EClass eClass)
//				{
//					System.out.println(eClass);
//					for (int i = 0; i < structuralFeatures.size(); i++) {
//						final Object value = structuralFeatures.get(i).getEReferenceType();
//						System.out.println(value);
//						if (value == eClass) {
//							System.out.println("Value found");
//							Object object = test.eGet(structuralFeatures.get(i));
//							System.out.println(object);
//							if(object == null || object instanceof List){
//								System.out.println("TRUE");
//								return true;
//							}
//							System.out.println("FALSE");
//							return false;
//						}
//					}
//					return false;
//				}
//			};
//			classes = ApogyCommonEMFFacade.INSTANCE.filterEClasses(classes, filter);	
//		}
//		
//		EList<EClass> childEClasses = new BasicEList<>();
//		childEClasses.addAll(classes);
//		private void checkEnableNewButton(EObject eObject){
//			boolean objectFull = true;
//			if (eObject != null) {
//				EList<EReference> structuralFeatures = eObject.eClass().getEAllContainments();
//				for (int i = 0; i < structuralFeatures.size(); i++) {
//					final Object value = eObject.eGet(structuralFeatures.get(i));
//					if (value == null) {
//						objectFull = false;
//						break;
//					}
//					if (value instanceof List) {
//						objectFull = false;
//						break;
//					}
//				}
//			}
//			btnNew.setEnabled(!objectFull);
//		}
		
	
		
		
//		eClassListComposite.setEClassesList(childEClasses);
	
		
		
//		eClassListComposite.setEClassesList();
		
		
//		subClassesListComposite = new SubClassesListComposite(container, SWT.None);
//		subClassesListComposite.setSuperClass(superClass);
//		subClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//		subClassesListComposite.addSelectionChangedListener(new ISelectionChangedListener() {
//			
//			@Override
//			public void selectionChanged(SelectionChangedEvent event) {
//				setSelectedClass((EClass) ((TreeSelection) event.getSelection()).getFirstElement());
//				validate();
//			}
//		});
		
		setControl(container);
		validate();
	}
	
	private void setEClassListCompositeList(EReference eReference){
		EList<EObject> eObjectsEClassList = new BasicEList<EObject>();
		eObjectsEClassList.addAll(
				ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(
						((EReference)eReferencesListComposite.getSelectedEObject())
						.getEReferenceType()));
		eClassesListComposite.setEObjectsList(eObjectsEClassList);
	}
	
	private class EReferenceLabelProvider extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof EReference) {
				cell.setText(((EReference) cell.getElement()).getName());
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
		if (this.childEReferences != null){
			for(int i = 0; i < childEReferences.size(); i++ ){
				this.childEReferences.get(i).eAdapters().remove(getAdapter());
			}						
		}
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {	
		String errorEReference = "";
		String errorEClass = "";
		
		if(eReferencesListComposite.getSelectedEObject() == null){
			errorEReference = "<Reference> ";
		}
		if(eClassesListComposite == null || eClassesListComposite.getSelectedEObject() == null){
			errorEClass = "<Type> ";
		}
		
		if(errorEReference != "" || errorEClass != ""){
			setErrorMessage(errorEReference + errorEClass + "must be selected");
			setPageComplete(false);
		}else{
			setErrorMessage(null);
			setPageComplete(true);
		}
	}
}
