package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;

public class ControllerSelectionComposite extends Composite {

	final String BIND_PROMPT = "Click here to bind the controller";
	
	private Text controllerText;
	private Text componentText;
	
	private EComponentQualifier eComponentQualifier;

	private Adapter adapter;
//	private Adapter changeControllerAdapter;
	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public ControllerSelectionComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		Label controllerLabel = new Label(this, SWT.None);
		controllerLabel.setText("Controller : ");
		controllerLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		controllerText = new Text(this, SWT.BORDER);
		controllerText.setText(BIND_PROMPT);
		controllerText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		controllerText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				ApogyCommonIOJInputFacade.INSTANCE.addSelectComponentAdapter(eComponentQualifier);
			}
		});
		controllerText.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e) {
				ApogyCommonIOJInputFacade.INSTANCE.forceStopSelectComponent(eComponentQualifier);
			}
		});
		
		Label componentLabel = new Label(this, SWT.None);
		componentLabel.setText("Component : ");
		componentLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		
		componentText = new Text(this, SWT.BORDER);
		componentText.setText(BIND_PROMPT);
		componentText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		componentText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				ApogyCommonIOJInputFacade.INSTANCE.addSelectComponentAdapter(eComponentQualifier);
			}
		});
		componentText.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e) {
				ApogyCommonIOJInputFacade.INSTANCE.forceStopSelectComponent(eComponentQualifier);
			}
		});
	}
	
//	protected void startControllersPolling(){
//		eComponentQualifier.eAdapters().add(getchangeControllerAdapter());
//	}
//	
//	protected void stopControllersPolling(){
//		eComponentQualifier.eAdapters().remove(getchangeControllerAdapter(eComponentQualifier));
//	}
	
//	private Adapter getchangeControllerAdapter(){
//		if(changeControllerAdapter == null){
//			changeControllerAdapter = new AdapterImpl(){
//				@Override
//				public void notifyChanged(Notification msg) {
//					if(msg.getFeature() == ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME ||
//							msg.getFeature() == ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME){
//						stopControllersPolling();
//					}
//				}
//			};
//		}
//		return changeControllerAdapter;
//	}

	/**
	 * Binds the {@link EComponentQualifier} with the UI components.
	 * 
	 * @param eComponentQualifier
	 *            Reference to the {@link EComponentQualifier}.
	 */
	public void setEComponentQualifier(EComponentQualifier eComponentQualifier) {
		if (this.eComponentQualifier != null) {
			this.eComponentQualifier.eAdapters().remove(getAdapter());
		}
		this.eComponentQualifier = eComponentQualifier;
		this.eComponentQualifier.eAdapters().add(getAdapter());
		
		initDataBindingsCustom();		
	}

	@SuppressWarnings("unchecked")
	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();
		
		IObservableValue<?> observeEComponentQualifierControllerName = EMFProperties.value(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME).observe(eComponentQualifier);
		IObservableValue<?> observeControllerText = WidgetProperties.text().observe(controllerText);
		
		m_bindingContext.bindValue(observeControllerText, observeEComponentQualifierControllerName, null,
				new UpdateValueStrategy().setConverter(new Converter(String.class, String.class) {

					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? BIND_PROMPT : fromObject;
					}
				}));
		
		IObservableValue<?> observeEComponentQualifierComponentName = EMFProperties.value(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME).observe(eComponentQualifier);
		IObservableValue<?> observeComponentText = WidgetProperties.text().observe(componentText);
		m_bindingContext.bindValue(observeComponentText, observeEComponentQualifierComponentName, null,
				new UpdateValueStrategy().setConverter(new Converter(String.class, String.class) {

					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? BIND_PROMPT : fromObject;
					}
				}));

		return m_bindingContext;
	}

	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeature() == ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME
							|| msg.getFeature() == ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME) {
						ControllerSelectionComposite.this.forceFocus();
					}
				}
				
			};
		}
		return adapter;
	}

	@Override
	public void dispose() {
		if (this.eComponentQualifier != null) {
			this.eComponentQualifier.eAdapters().remove(getAdapter());
		}
		super.dispose();
	}

}