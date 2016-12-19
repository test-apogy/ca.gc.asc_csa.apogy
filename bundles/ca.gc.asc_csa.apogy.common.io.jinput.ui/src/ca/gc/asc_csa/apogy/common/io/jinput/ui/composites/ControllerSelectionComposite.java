package ca.gc.asc_csa.apogy.common.io.jinput.ui.composites;
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

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.Activator;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;

public class ControllerSelectionComposite extends Composite {

	final String CLICK_PROMPT = "Click here to bind the controller";

	private Text controllerText;
	private Text componentText;

	private boolean selectionStarted = false;
	private Listener listener;

	private EComponentQualifier eComponentQualifier;
	private String initialControllerName;
	private String initialComponentName;

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
		controllerText.setText(CLICK_PROMPT);
		controllerText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		controllerText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (!selectionStarted) {
					startSelection();
				}
			}
		});
		controllerText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (selectionStarted) {
					stopSelection();
				}
			}
		});

		Label componentLabel = new Label(this, SWT.None);
		componentLabel.setText("Component : ");
		componentLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		componentText = new Text(this, SWT.BORDER);
		componentText.setText(CLICK_PROMPT);
		componentText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		componentText.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if (!selectionStarted) {
					startSelection();
				}
			}
		});
		componentText.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (selectionStarted) {
					stopSelection();
				}
			}
		});
	}

	/**
	 * Starts the controller selection.
	 */
	private void startSelection() {
		if (!ApogyCommonIOJInputFacade.INSTANCE.isSelectingComponent()) {
			selectionStarted = true;
			if (eComponentQualifier != null) {
				initialControllerName = eComponentQualifier.getEControllerName();
				initialComponentName = eComponentQualifier.getEComponentName();
			}
			ApogyCommonIOJInputFacade.INSTANCE.startSelectComponent(eComponentQualifier);
		}
		controllerText.setBackground(getTextsBackgroundColor());
		componentText.setBackground(getTextsBackgroundColor());

		List<Listener> listeners = Arrays.asList(getShell().getListeners(SWT.Traverse));
		for (Listener listener : listeners) {
			getShell().removeListener(SWT.Traverse, listener);
		}
		getShell().addListener(SWT.Traverse, getListener());
		for (Listener listener : listeners) {
			getShell().addListener(SWT.Traverse, listener);
		}
	}

	/**
	 * {@link Listener} that cancels the selection if the user presses escape
	 * and confirms the selection if the user presses enter
	 * 
	 * @return {@link Listener}
	 */
	private Listener getListener() {
		if (this.listener == null) {
			listener = new Listener() {
				@Override
				public void handleEvent(Event event) {
					if (event.detail == SWT.TRAVERSE_ESCAPE || event.detail == SWT.TRAVERSE_RETURN) {
						stopSelection();
						if (event.detail == SWT.TRAVERSE_ESCAPE && eComponentQualifier != null) {
							ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(eComponentQualifier,
									ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME,
									initialControllerName);
							ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(eComponentQualifier,
									ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME,
									initialComponentName);
						}
						event.doit = false;
					}
				}
			};
		}
		return listener;
	}

	/**
	 * Stops the controller selection.
	 */
	private void stopSelection() {
		ApogyCommonIOJInputFacade.INSTANCE.stopSelectComponent(eComponentQualifier);
		selectionStarted = false;
		controllerText.setBackground(getTextsBackgroundColor());
		componentText.setBackground(getTextsBackgroundColor());
		newSelection(null);
		getShell().removeListener(SWT.Traverse, getListener());
	}

	/**
	 * Binds the {@link EComponentQualifier} with the UI components.
	 * 
	 * @param eComponentQualifier
	 *            Reference to the {@link EComponentQualifier}.
	 */
	public void setEComponentQualifier(EComponentQualifier eComponentQualifier) {
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
		}
		this.eComponentQualifier = eComponentQualifier;

		initDataBindingsCustom();

		if (eComponentQualifier.getEControllerName() != null) {
			controllerText.setText(eComponentQualifier.getEControllerName());
		}
		if (eComponentQualifier.getEComponentName() != null) {
			controllerText.setText(eComponentQualifier.getEComponentName());
		}
		controllerText.setBackground(getTextsBackgroundColor());
		componentText.setBackground(getTextsBackgroundColor());
	}

	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns yellow if the selection is activated. Returns red is the
	 * {@link EComponentQualifier} is not valid. Returns red is the
	 * {@link EComponentQualifier} is valid.
	 * 
	 * @return {@link Color}
	 */
	private Color getTextsBackgroundColor() {
		if (selectionStarted) {
			return SWTResourceManager.getColor(SWT.COLOR_YELLOW);
		}
		if (Activator.getEControllerEnvironment().resolveEComponent(eComponentQualifier) != null) {
			return SWTResourceManager.getColor(SWT.COLOR_GREEN);
		} else {
			return SWTResourceManager.getColor(SWT.COLOR_RED);
		}
	}

	@SuppressWarnings("unchecked")
	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();

		IObservableValue<?> observeEComponentQualifierControllerName = EMFProperties
				.value(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME)
				.observe(eComponentQualifier);
		IObservableValue<?> observeControllerTextText = WidgetProperties.text().observe(controllerText);
		IObservableValue<?> observeControllerTextBackground = WidgetProperties.background().observe(controllerText);

		m_bindingContext.bindValue(observeControllerTextText, observeEComponentQualifierControllerName, null,
				new UpdateValueStrategy().setConverter(new Converter(String.class, String.class) {

					@Override
					public Object convert(Object fromObject) {
						newSelection(null);
						return fromObject == null ? CLICK_PROMPT : fromObject;
					}
				}));
		m_bindingContext.bindValue(observeControllerTextBackground, observeEComponentQualifierControllerName, null,
				new UpdateValueStrategy().setConverter(new Converter(String.class, Color.class) {

					@Override
					public Object convert(Object fromObject) {
						return getTextsBackgroundColor();
					}
				}));

		IObservableValue<?> observeEComponentQualifierComponentName = EMFProperties
				.value(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME)
				.observe(eComponentQualifier);
		IObservableValue<?> observeComponentTextText = WidgetProperties.text().observe(componentText);
		IObservableValue<?> observeComponentTextBackground = WidgetProperties.background().observe(controllerText);

		m_bindingContext.bindValue(observeComponentTextText, observeEComponentQualifierComponentName, null,
				new UpdateValueStrategy().setConverter(new Converter(String.class, String.class) {

					@Override
					public Object convert(Object fromObject) {
						newSelection(null);
						return fromObject == null ? CLICK_PROMPT : fromObject;
					}
				}));
		m_bindingContext.bindValue(observeComponentTextBackground, observeEComponentQualifierComponentName, null,
				new UpdateValueStrategy().setConverter(new Converter(String.class, Color.class) {

					@Override
					public Object convert(Object fromObject) {
						return getTextsBackgroundColor();
					}
				}));

		return m_bindingContext;
	}
}