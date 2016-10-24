package ca.gc.asc_csa.apogy.core.invocator.ui.composites;
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

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;

public class AdvancedEditorComposite extends Composite implements ISelectionProvider {

	private ISelectionChangedListener selectionChangedListener;
	private EObjectComposite eObjectComposite;
	private DataBindingContext bindingContext;
	
	private Button btnNew;
	
	private boolean eObjectNotFull;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public AdvancedEditorComposite(Composite parent, int style, ESelectionService selectionService, EObject eObject) {
		super(parent, style);
		System.out.println("AdvancedEditorComposite.AdvancedEditorComposite()");

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				dispose();
			}
		});
		setLayout(new GridLayout(2, false));

		eObjectComposite = new EObjectComposite(this, SWT.None) {
			// @Override
			// protected void newSelection(ISelection selection) {
			// selectionService.setSelection(selection);
			// }
		};
		eObjectComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		//
		// if(eObject != null){
		// eObjectComposite.setEObject(eObject);
		// }else{
		eObjectComposite.setEObject(eObject);
		// }
		
		eObjectNotFull = !isEObjectFull(eObjectComposite.getSelectedEObject());
	
		

		btnNew = new Button(this, SWT.NONE);
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNew.setText("New");
		btnNew.setEnabled(true);
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (event.type == SWT.Selection) {

				}
				// selectedEClass.getEAllStructuralFeatures();
				// TODO: New Child button clicked
			}
		});

		Button btnDelete = new Button(this, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (event.type == SWT.Selection) {
					// TODO: Delete button clicked
				}

			}
		});
		
		bindingContext = initDataBindings();
	}

	@Override
	public void dispose() {
		super.dispose();
		if (selectionChangedListener != null) {
			eObjectComposite.removeListener(SWT.Selection, (Listener) selectionChangedListener);
		}
	}

	@SuppressWarnings("unchecked")
	private DataBindingContext initDataBindings(){
		DataBindingContext m_bindingContext = new DataBindingContext();
		
		IObservableValue<?> observeButtonNewEnabled = WidgetProperties.enabled().observe(btnNew);
		IObservableValue<?> observeEObjectFull = PojoProperties.value("EObjectFull", this.getClass()).observe(this);
		
		m_bindingContext.bindValue(observeButtonNewEnabled, observeEObjectFull);
		
		return m_bindingContext;
	}
	
	private boolean isEObjectFull(EObject eObject){
		boolean eObjectFull = true;
		System.out.println("AdvancedEditorComposite.isEObjectFull()");
		if (eObject != null) {
			//EClass selectedEClass = eObject.eClass();
			System.out.println("AdvancedEditorComposite.EObjectFull() : " + eObjectFull);
			System.out.println("AdvancedEditorComposite.EObjectFull() : " + eObject);
			System.out.println("AdvancedEditorComposite.EObjectFull() : " + eObject.eClass().getEAllStructuralFeatures());
			for (EStructuralFeature structuralFeature : eObject.eClass().getEAllStructuralFeatures()) {
				//EReference eref = structuralFeature.get;
				//            		EReference)referenceEObject;
				final Object value = eObject.eGet(structuralFeature);
				System.out.println("AdvancedEditorComposite.isEObjectFull() : value : " + value);
				if (value == null) {
					eObjectFull = false;
					break;
				}
				if (value instanceof List) {
					eObjectFull = false;
					break;
				}
			}
		}else{
			return true;
		}
		//		//EList<EStructuralFeature> structuralFeatures = selectedEClass.getEAllStructuralFeatures();
//		EList<EAttribute> attributes = selectedEClass.getEAllAttributes();
//		//eObject.is
//		for(EStructuralFeature structuralFeatures: selectedEClass.getEAllStructuralFeatures()){
//			if(structuralFeatures. && eObject.eGet(structuralFeatures) != null){
//				eObjectFull = false;
//			}else{
//				if(eObject.eGet(structuralFeatures))
//			}
//		}
		System.out.println("AdvancedEditorComposite.isEObjectFull( : END : )" + eObjectFull);
		return eObjectFull ;
	}
	
	public void setEObject(EObject eObject){
		eObjectComposite.setEObject(eObject);
		eObjectNotFull = !isEObjectFull(eObject);
	}
	
	
	/**
	 * Selection provider methods
	 */
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionChangedListener = listener;
		eObjectComposite.addListener(SWT.Selection, (Listener) listener);
	}

	@Override
	public ISelection getSelection() {
		return (ISelection) eObjectComposite.getSelectedEObject();
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		eObjectComposite.removeListener(SWT.Selection, (Listener) listener);
	}

	@Override
	public void setSelection(ISelection selection) {
	}
}